package org.jfrog.gradle.plugin.artifactory.utils;

import com.google.common.collect.Multimap;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.StringUtils;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.plugins.version.MavenTimedSnapshotVersionMatcher;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.component.SoftwareComponent;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.publish.PublicationContainer;
import org.gradle.api.publish.PublishingExtension;
import org.gradle.api.publish.ivy.IvyArtifact;
import org.gradle.api.publish.ivy.IvyPublication;
import org.gradle.api.publish.ivy.internal.publication.IvyPublicationInternal;
import org.gradle.api.publish.ivy.internal.publisher.IvyNormalizedPublication;
import org.gradle.api.publish.ivy.internal.publisher.IvyPublicationIdentity;
import org.gradle.api.publish.ivy.plugins.IvyPublishPlugin;
import org.gradle.api.publish.maven.MavenArtifact;
import org.gradle.api.publish.maven.MavenPublication;
import org.gradle.api.publish.maven.internal.publication.MavenPublicationInternal;
import org.gradle.api.publish.maven.internal.publisher.MavenNormalizedPublication;
import org.gradle.api.publish.maven.plugins.MavenPublishPlugin;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.extractor.clientConfiguration.ArtifactSpec;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleDeployDetails;
import org.jfrog.gradle.plugin.artifactory.extractor.PublishArtifactInfo;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;

/* loaded from: classes5.dex */
public class PublicationUtils {
    public static final Logger log = Logging.getLogger(PublicationUtils.class);

    public static void addDefaultPublicationsOrArchiveConfigurations(ArtifactoryTask artifactoryTask, PublishingExtension publishingExtension) {
        if (publishingExtension == null) {
            artifactoryTask.addDefaultArchiveConfigurations();
            return;
        }
        Project project = artifactoryTask.getProject();
        addWarPublicationExtensions(project, publishingExtension);
        addJarPublicationExtensions(project, publishingExtension);
        artifactoryTask.addDefaultPublications();
    }

    public static void addWarPublicationExtensions(Project project, PublishingExtension publishingExtension) {
        Task task = (Task) project.getTasks().findByName(Constant.WAR);
        if (task == null || !task.getEnabled()) {
            return;
        }
        addMavenWebPublication(project, publishingExtension);
    }

    public static void addMavenWebPublication(final Project project, final PublishingExtension publishingExtension) {
        if (publishingExtension.getPublications().findByName(Constant.MAVEN_WEB) != null) {
            return;
        }
        project.getPlugins().withType(MavenPublishPlugin.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda6
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenWebPublication$2(publishingExtension, project, (MavenPublishPlugin) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenWebPublication$2(PublishingExtension publishingExtension, final Project project, MavenPublishPlugin mavenPublishPlugin) {
        publishingExtension.publications(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda8
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenWebPublication$1(project, (PublicationContainer) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenWebPublication$0(Project project, MavenPublication mavenPublication) {
        mavenPublication.from((SoftwareComponent) project.getComponents().getByName(Constant.WEB));
    }

    public static /* synthetic */ void lambda$addMavenWebPublication$1(final Project project, PublicationContainer publicationContainer) {
        publicationContainer.create(Constant.MAVEN_WEB, MavenPublication.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda10
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenWebPublication$0(project, (MavenPublication) obj);
            }
        });
    }

    public static void addJarPublicationExtensions(Project project, PublishingExtension publishingExtension) {
        Task task = (Task) project.getTasks().findByName("jar");
        if (task == null || task.getEnabled()) {
            if (ProjectUtils.hasOneOfComponents(project, Constant.JAVA)) {
                addMavenJavaPublication(project, publishingExtension);
                addIvyJavaPublication(project, publishingExtension);
            }
            if (ProjectUtils.hasOneOfComponents(project, Constant.JAVA_PLATFORM)) {
                addMavenJavaPlatformPublication(project, publishingExtension);
            }
        }
    }

    public static void addMavenJavaPublication(final Project project, final PublishingExtension publishingExtension) {
        if (publishingExtension.getPublications().findByName(Constant.MAVEN_JAVA) != null) {
            return;
        }
        project.getPlugins().withType(MavenPublishPlugin.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda1
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPublication$5(publishingExtension, project, (MavenPublishPlugin) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenJavaPublication$5(PublishingExtension publishingExtension, final Project project, MavenPublishPlugin mavenPublishPlugin) {
        publishingExtension.publications(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda11
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPublication$4(project, (PublicationContainer) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenJavaPublication$3(Project project, MavenPublication mavenPublication) {
        mavenPublication.from((SoftwareComponent) project.getComponents().getByName(Constant.JAVA));
    }

    public static /* synthetic */ void lambda$addMavenJavaPublication$4(final Project project, PublicationContainer publicationContainer) {
        publicationContainer.create(Constant.MAVEN_JAVA, MavenPublication.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda2
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPublication$3(project, (MavenPublication) obj);
            }
        });
    }

    public static void addIvyJavaPublication(final Project project, final PublishingExtension publishingExtension) {
        if (publishingExtension.getPublications().findByName(Constant.IVY_JAVA) != null) {
            return;
        }
        project.getPlugins().withType(IvyPublishPlugin.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda4
            public final void execute(Object obj) {
                PublicationUtils.lambda$addIvyJavaPublication$8(publishingExtension, project, (IvyPublishPlugin) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addIvyJavaPublication$8(PublishingExtension publishingExtension, final Project project, IvyPublishPlugin ivyPublishPlugin) {
        publishingExtension.publications(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda0
            public final void execute(Object obj) {
                PublicationUtils.lambda$addIvyJavaPublication$7(project, (PublicationContainer) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addIvyJavaPublication$6(Project project, IvyPublication ivyPublication) {
        ivyPublication.from((SoftwareComponent) project.getComponents().getByName(Constant.JAVA));
    }

    public static /* synthetic */ void lambda$addIvyJavaPublication$7(final Project project, PublicationContainer publicationContainer) {
        publicationContainer.create(Constant.IVY_JAVA, IvyPublication.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda7
            public final void execute(Object obj) {
                PublicationUtils.lambda$addIvyJavaPublication$6(project, (IvyPublication) obj);
            }
        });
    }

    public static void addMavenJavaPlatformPublication(final Project project, final PublishingExtension publishingExtension) {
        if (publishingExtension.getPublications().findByName(Constant.MAVEN_JAVA_PLATFORM) != null) {
            return;
        }
        project.getPlugins().withType(MavenPublishPlugin.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda3
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPlatformPublication$11(publishingExtension, project, (MavenPublishPlugin) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenJavaPlatformPublication$11(PublishingExtension publishingExtension, final Project project, MavenPublishPlugin mavenPublishPlugin) {
        publishingExtension.publications(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda5
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPlatformPublication$10(project, (PublicationContainer) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenJavaPlatformPublication$10(final Project project, PublicationContainer publicationContainer) {
        publicationContainer.create(Constant.MAVEN_JAVA_PLATFORM, MavenPublication.class, new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils$$ExternalSyntheticLambda9
            public final void execute(Object obj) {
                PublicationUtils.lambda$addMavenJavaPlatformPublication$9(project, (MavenPublication) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addMavenJavaPlatformPublication$9(Project project, MavenPublication mavenPublication) {
        mavenPublication.from((SoftwareComponent) project.getComponents().getByName(Constant.JAVA_PLATFORM));
    }

    public static void extractIvyDeployDetails(IvyPublicationInternal ivyPublicationInternal, ArtifactoryTask artifactoryTask) {
        String name = ivyPublicationInternal.getName();
        IvyNormalizedPublication ivyNormalizedPublicationAsNormalisedPublication = ivyPublicationInternal.asNormalisedPublication();
        IvyPublicationIdentity projectIdentity = ivyNormalizedPublicationAsNormalisedPublication.getProjectIdentity();
        Map mapAsMap = ivyPublicationInternal.getDescriptor().getExtraInfo().asMap();
        extractIvyDescriptor(artifactoryTask, name, ivyNormalizedPublicationAsNormalisedPublication, projectIdentity, mapAsMap);
        extractIvyArtifacts(artifactoryTask, name, ivyNormalizedPublicationAsNormalisedPublication, projectIdentity, mapAsMap);
    }

    public static void extractIvyDescriptor(ArtifactoryTask artifactoryTask, String str, IvyNormalizedPublication ivyNormalizedPublication, IvyPublicationIdentity ivyPublicationIdentity, Map<QName, String> map) {
        DeployDetails.Builder builderCreateArtifactBuilder;
        File ivyDescriptorFile = ivyNormalizedPublication.getIvyDescriptorFile();
        if (!isPublishIvy(artifactoryTask) || (builderCreateArtifactBuilder = createArtifactBuilder(ivyDescriptorFile, str)) == null) {
            return;
        }
        addIvyArtifactToDeployDetails(artifactoryTask, str, ivyPublicationIdentity, builderCreateArtifactBuilder, new PublishArtifactInfo(ivyPublicationIdentity.getModule(), "xml", ClientConfigurationFields.IVY, null, map, ivyDescriptorFile));
    }

    public static boolean isPublishIvy(ArtifactoryTask artifactoryTask) {
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(artifactoryTask.getProject());
        if (publisherHandler == null) {
            return false;
        }
        Boolean boolIsIvy = publisherHandler.isIvy();
        if (boolIsIvy == null) {
            boolIsIvy = artifactoryTask.getPublishIvy();
        }
        if (boolIsIvy != null) {
            return boolIsIvy.booleanValue();
        }
        return true;
    }

    public static void extractIvyArtifacts(ArtifactoryTask artifactoryTask, String str, IvyNormalizedPublication ivyNormalizedPublication, IvyPublicationIdentity ivyPublicationIdentity, Map<QName, String> map) {
        DeployDetails.Builder builderCreateArtifactBuilder;
        File ivyDescriptorFile = ivyNormalizedPublication.getIvyDescriptorFile();
        for (IvyArtifact ivyArtifact : ivyNormalizedPublication.getAllArtifacts()) {
            File file = ivyArtifact.getFile();
            if (!file.equals(ivyDescriptorFile) && (builderCreateArtifactBuilder = createArtifactBuilder(file, str)) != null) {
                addIvyArtifactToDeployDetails(artifactoryTask, str, ivyPublicationIdentity, builderCreateArtifactBuilder, new PublishArtifactInfo(ivyArtifact.getName(), ivyArtifact.getExtension(), ivyArtifact.getType(), ivyArtifact.getClassifier(), map, file));
            }
        }
    }

    public static void addIvyArtifactToDeployDetails(ArtifactoryTask artifactoryTask, String str, IvyPublicationIdentity ivyPublicationIdentity, DeployDetails.Builder builder, PublishArtifactInfo publishArtifactInfo) {
        String ivyArtifactPattern;
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(artifactoryTask.getProject());
        if (publisherHandler == null) {
            return;
        }
        if (ClientConfigurationFields.IVY.equals(publishArtifactInfo.getType())) {
            ivyArtifactPattern = publisherHandler.getIvyPattern();
        } else {
            ivyArtifactPattern = publisherHandler.getIvyArtifactPattern();
        }
        String str2 = ivyArtifactPattern;
        String organisation = ivyPublicationIdentity.getOrganisation();
        String strSubstitute = IvyPatternHelper.substitute(str2, publisherHandler.isM2Compatible() ? organisation.replace(".", "/") : organisation, ivyPublicationIdentity.getModule(), ivyPublicationIdentity.getRevision(), publishArtifactInfo.getName(), publishArtifactInfo.getType(), publishArtifactInfo.getExtension(), str, publishArtifactInfo.getExtraTokens(), null);
        builder.artifactPath(strSubstitute);
        addArtifactInfoToDeployDetails(artifactoryTask, str, builder, publishArtifactInfo, strSubstitute);
    }

    public static void extractMavenDeployDetails(MavenPublicationInternal mavenPublicationInternal, ArtifactoryTask artifactoryTask) {
        String name = mavenPublicationInternal.getName();
        mavenPublicationInternal.asNormalisedPublication().getPomArtifact().getFile();
        MavenNormalizedPublication mavenNormalizedPublicationAsNormalisedPublication = mavenPublicationInternal.asNormalisedPublication();
        extractMavenDescriptor(artifactoryTask, name, mavenPublicationInternal, mavenNormalizedPublicationAsNormalisedPublication);
        extractMavenArtifacts(artifactoryTask, name, mavenPublicationInternal, mavenNormalizedPublicationAsNormalisedPublication);
    }

    public static void extractArchivesDeployDetails(Configuration configuration, ArtifactoryClientConfiguration.PublisherHandler publisherHandler, ArtifactoryTask artifactoryTask) {
        Project project = artifactoryTask.getProject();
        for (PublishArtifact publishArtifact : configuration.getAllArtifacts()) {
            File file = publishArtifact.getFile();
            DeployDetails.Builder builderCreateArtifactBuilder = createArtifactBuilder(file, configuration.getName());
            if (builderCreateArtifactBuilder != null) {
                String string = project.getGroup().toString();
                if (publisherHandler.isM2Compatible()) {
                    string = string.replace(".", "/");
                }
                String str = string;
                HashMap map = new HashMap();
                if (StringUtils.isNotBlank(publishArtifact.getClassifier())) {
                    map.put("classifier", publishArtifact.getClassifier());
                }
                String strSubstitute = IvyPatternHelper.substitute(publisherHandler.getIvyArtifactPattern(), str, project.getName(), project.getVersion().toString(), publishArtifact.getName(), publishArtifact.getType(), publishArtifact.getExtension(), configuration.getName(), map, null);
                builderCreateArtifactBuilder.artifactPath(strSubstitute);
                addArtifactInfoToDeployDetails(artifactoryTask, configuration.getName(), builderCreateArtifactBuilder, new PublishArtifactInfo(publishArtifact.getName(), publishArtifact.getExtension(), publishArtifact.getType(), publishArtifact.getClassifier(), null, file), strSubstitute);
            }
        }
    }

    public static void extractMavenDescriptor(ArtifactoryTask artifactoryTask, String str, MavenPublicationInternal mavenPublicationInternal, MavenNormalizedPublication mavenNormalizedPublication) throws GradleException {
        DeployDetails.Builder builderCreateArtifactBuilder;
        File file = mavenNormalizedPublication.getPomArtifact().getFile();
        if (!isPublishMaven(artifactoryTask) || (builderCreateArtifactBuilder = createArtifactBuilder(file, str)) == null) {
            return;
        }
        addMavenArtifactToDeployDetails(artifactoryTask, str, builderCreateArtifactBuilder, new PublishArtifactInfo(mavenPublicationInternal.getArtifactId(), "pom", "pom", null, file), mavenPublicationInternal);
    }

    public static boolean isPublishMaven(ArtifactoryTask artifactoryTask) {
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(artifactoryTask.getProject());
        if (publisherHandler == null) {
            return false;
        }
        Boolean boolIsMaven = publisherHandler.isMaven();
        if (boolIsMaven == null) {
            boolIsMaven = artifactoryTask.getPublishPom();
        }
        if (boolIsMaven != null) {
            return boolIsMaven.booleanValue();
        }
        return true;
    }

    public static void extractMavenArtifacts(ArtifactoryTask artifactoryTask, String str, MavenPublicationInternal mavenPublicationInternal, MavenNormalizedPublication mavenNormalizedPublication) throws GradleException {
        Set hashSet = new HashSet();
        try {
            hashSet = mavenNormalizedPublication.getAdditionalArtifacts();
            if (mavenNormalizedPublication.getMainArtifact() != null) {
                createPublishArtifactInfoAndAddToDeployDetails(mavenNormalizedPublication.getMainArtifact(), artifactoryTask, mavenPublicationInternal, str);
            }
        } catch (IllegalStateException e) {
            log.warn("Illegal state detected at Maven publication '{}', {}: {}", new Object[]{str, artifactoryTask.getProject(), e.getMessage()});
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            createPublishArtifactInfoAndAddToDeployDetails((MavenArtifact) it.next(), artifactoryTask, mavenPublicationInternal, str);
        }
    }

    public static void createPublishArtifactInfoAndAddToDeployDetails(MavenArtifact mavenArtifact, ArtifactoryTask artifactoryTask, MavenPublication mavenPublication, String str) throws GradleException {
        File file = mavenArtifact.getFile();
        DeployDetails.Builder builderCreateArtifactBuilder = createArtifactBuilder(file, str);
        if (builderCreateArtifactBuilder == null) {
            return;
        }
        addMavenArtifactToDeployDetails(artifactoryTask, str, builderCreateArtifactBuilder, new PublishArtifactInfo(mavenPublication.getArtifactId(), mavenArtifact.getExtension(), mavenArtifact.getExtension(), mavenArtifact.getClassifier(), file), mavenPublication);
    }

    public static void addMavenArtifactToDeployDetails(ArtifactoryTask artifactoryTask, String str, DeployDetails.Builder builder, PublishArtifactInfo publishArtifactInfo, MavenPublication mavenPublication) throws GradleException {
        String strSubstitute = IvyPatternHelper.substitute("[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]", mavenPublication.getGroupId().replace(".", "/"), mavenPublication.getArtifactId(), mavenPublication.getVersion(), publishArtifactInfo.getName(), publishArtifactInfo.getType(), publishArtifactInfo.getExtension(), str, publishArtifactInfo.getExtraTokens(), null);
        builder.artifactPath(strSubstitute);
        addArtifactInfoToDeployDetails(artifactoryTask, str, builder, publishArtifactInfo, strSubstitute);
    }

    public static void addArtifactInfoToDeployDetails(ArtifactoryTask artifactoryTask, String str, DeployDetails.Builder builder, PublishArtifactInfo publishArtifactInfo, String str2) {
        Project project = artifactoryTask.getProject();
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(project);
        if (publisherHandler != null) {
            builder.targetRepository(getTargetRepository(str2, publisherHandler));
            builder.addProperties(getPropsToAdd(artifactoryTask, publishArtifactInfo, str));
            artifactoryTask.getDeployDetails().add(new GradleDeployDetails(publishArtifactInfo, builder.build(), project));
        }
    }

    public static String getTargetRepository(String str, ArtifactoryClientConfiguration.PublisherHandler publisherHandler) {
        String snapshotRepoKey = publisherHandler.getSnapshotRepoKey();
        if (snapshotRepoKey != null && str.contains(MavenTimedSnapshotVersionMatcher.SNAPSHOT_SUFFIX)) {
            return snapshotRepoKey;
        }
        if (StringUtils.isNotEmpty(publisherHandler.getReleaseRepoKey())) {
            return publisherHandler.getReleaseRepoKey();
        }
        return publisherHandler.getRepoKey();
    }

    public static Map<String, String> getPropsToAdd(ArtifactoryTask artifactoryTask, PublishArtifactInfo publishArtifactInfo, String str) {
        Project project = artifactoryTask.getProject();
        HashMap map = new HashMap(artifactoryTask.getDefaultProps());
        addProps(map, artifactoryTask.artifactSpecs.getProperties(ArtifactSpec.builder().configuration(str).group(project.getGroup().toString()).name(project.getName()).version(project.getVersion().toString()).classifier(publishArtifactInfo.getClassifier()).type(publishArtifactInfo.getType()).build()));
        return map;
    }

    public static void addProps(Map<String, String> map, Multimap<String, CharSequence> multimap) {
        for (Map.Entry<String, CharSequence> entry : multimap.entries()) {
            String key = entry.getKey();
            String string = entry.getValue().toString();
            if (!map.containsKey(key)) {
                map.put(key, string);
            } else {
                map.put(key, map.get(key) + ", " + string);
            }
        }
    }

    public static DeployDetails.Builder createArtifactBuilder(File file, String str) throws GradleException {
        if (!file.exists()) {
            throw new GradleException("File '" + file.getAbsolutePath() + "' does not exist, and need to be published from publication " + str);
        }
        DeployDetails.Builder builderPackageType = new DeployDetails.Builder().file(file).packageType(DeployDetails.PackageType.GRADLE);
        try {
            Map<String, String> mapCalculateChecksums = FileChecksumCalculator.calculateChecksums(file, "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256");
            builderPackageType.md5(mapCalculateChecksums.get("MD5")).sha1(mapCalculateChecksums.get(FileChecksumCalculator.SHA1_ALGORITHM)).sha256(mapCalculateChecksums.get("SHA-256"));
            return builderPackageType;
        } catch (Exception e) {
            throw new GradleException("Failed to calculate checksums for artifact: " + file.getAbsolutePath(), e);
        }
    }
}
