package org.jfrog.gradle.plugin.artifactory.utils;

import java.io.IOException;
import java.util.Properties;
import org.gradle.api.Project;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention;

/* loaded from: classes5.dex */
public class ConventionUtils {
    public static ArtifactoryPluginConvention getOrCreateArtifactoryConvention(Project project) {
        ArtifactoryPluginConvention artifactoryPluginConvention = (ArtifactoryPluginConvention) project.getConvention().findPlugin(ArtifactoryPluginConvention.class);
        if (artifactoryPluginConvention != null) {
            return artifactoryPluginConvention;
        }
        ArtifactoryPluginConvention artifactoryPluginConvention2 = (ArtifactoryPluginConvention) project.getExtensions().create(Constant.ARTIFACTORY, ArtifactoryPluginConvention.class, new Object[]{project});
        project.getConvention().getPlugins().put(Constant.ARTIFACTORY, artifactoryPluginConvention2);
        return artifactoryPluginConvention2;
    }

    public static ArtifactoryPluginConvention getArtifactoryConvention(Project project) {
        return (ArtifactoryPluginConvention) project.getRootProject().getConvention().findPlugin(ArtifactoryPluginConvention.class);
    }

    public static ArtifactoryPluginConvention getConventionWithPublisher(Project project) {
        while (project != null) {
            ArtifactoryPluginConvention artifactoryPluginConvention = (ArtifactoryPluginConvention) project.getConvention().findPlugin(ArtifactoryPluginConvention.class);
            if (artifactoryPluginConvention != null) {
                ArtifactoryClientConfiguration.PublisherHandler publisherHandler = artifactoryPluginConvention.getClientConfig().publisher;
                if (publisherHandler.getContextUrl() != null && (publisherHandler.getRepoKey() != null || publisherHandler.getSnapshotRepoKey() != null)) {
                    return artifactoryPluginConvention;
                }
            }
            project = project.getParent();
        }
        return null;
    }

    public static ArtifactoryClientConfiguration.PublisherHandler getPublisherHandler(Project project) {
        ArtifactoryPluginConvention conventionWithPublisher = getConventionWithPublisher(project);
        if (conventionWithPublisher == null) {
            return null;
        }
        return conventionWithPublisher.getClientConfig().publisher;
    }

    public static void updateConfig(ArtifactoryClientConfiguration artifactoryClientConfiguration, Project project) throws IOException {
        Properties properties = new Properties();
        fillProperties(project, properties);
        properties.putAll(BuildInfoExtractorUtils.filterStringEntries(project.getGradle().getStartParameter().getProjectProperties()));
        Properties propertiesMergePropertiesWithSystemAndPropertyFile = BuildInfoExtractorUtils.mergePropertiesWithSystemAndPropertyFile(properties, artifactoryClientConfiguration.info.getLog());
        propertiesMergePropertiesWithSystemAndPropertyFile.putAll(BuildInfoExtractorUtils.stripPrefixFromProperties(BuildInfoExtractorUtils.filterDynamicProperties(propertiesMergePropertiesWithSystemAndPropertyFile, BuildInfoExtractorUtils.BUILD_INFO_PROP_PREDICATE), "buildInfo.property."));
        artifactoryClientConfiguration.fillFromProperties(propertiesMergePropertiesWithSystemAndPropertyFile, CommonUtils.newHashSet("buildInfo.build.number", "buildInfo.build.name", "buildInfo.build.started"));
        ArtifactoryClientConfiguration.addDefaultPublisherAttributes(artifactoryClientConfiguration, project.getRootProject().getName(), Constant.GRADLE, project.getGradle().getGradleVersion());
    }

    public static void fillProperties(Project project, Properties properties) {
        Project parent = project.getParent();
        if (parent != null) {
            fillProperties(parent, properties);
        }
        properties.putAll(BuildInfoExtractorUtils.filterStringEntries(project.getExtensions().getExtraProperties().getProperties()));
    }
}
