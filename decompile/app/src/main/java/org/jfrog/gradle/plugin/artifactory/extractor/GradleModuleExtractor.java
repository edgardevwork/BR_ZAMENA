package org.jfrog.gradle.plugin.artifactory.extractor;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.StringUtils;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ArtifactView;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.artifacts.component.ProjectComponentIdentifier;
import org.gradle.api.artifacts.result.DependencyResult;
import org.gradle.api.artifacts.result.ResolvedArtifactResult;
import org.gradle.api.artifacts.result.ResolvedComponentResult;
import org.gradle.api.artifacts.result.ResolvedDependencyResult;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jfrog.build.api.builder.ModuleType;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.ModuleExtractor;
import org.jfrog.build.extractor.builder.ArtifactBuilder;
import org.jfrog.build.extractor.builder.DependencyBuilder;
import org.jfrog.build.extractor.builder.ModuleBuilder;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.p065ci.Artifact;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.build.extractor.p065ci.Module;
import org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;
import org.jfrog.gradle.plugin.artifactory.utils.ConventionUtils;
import org.jfrog.gradle.plugin.artifactory.utils.ProjectUtils;
import org.jfrog.gradle.plugin.artifactory.utils.TaskUtils;

/* loaded from: classes8.dex */
public class GradleModuleExtractor implements ModuleExtractor<Project> {
    public static final Logger log = Logging.getLogger(GradleModuleExtractor.class);

    @Override // org.jfrog.build.extractor.ModuleExtractor
    public Module extractModule(Project project) {
        return getModuleBuilder(project, getCollectedDeployDetails(project)).build();
    }

    public final Set<GradleDeployDetails> getCollectedDeployDetails(Project project) {
        ArtifactoryTask artifactoryTaskFindExecutedCollectionTask = TaskUtils.findExecutedCollectionTask(project);
        if (artifactoryTaskFindExecutedCollectionTask == null) {
            return Sets.newHashSet();
        }
        return artifactoryTaskFindExecutedCollectionTask.getDeployDetails();
    }

    public final ModuleBuilder getModuleBuilder(Project project, Set<GradleDeployDetails> set) {
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler;
        String id = ProjectUtils.getId(project);
        ModuleBuilder moduleBuilderRepository = new ModuleBuilder().type(ModuleType.GRADLE).m7389id(id).repository((String) set.stream().map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GradleDeployDetails) obj).getDeployDetails();
            }
        }).map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DeployDetails) obj).getTargetRepository();
            }
        }).findAny().orElse(""));
        try {
            moduleBuilderRepository.dependencies(calculateDependencies(project, id));
            publisherHandler = ConventionUtils.getPublisherHandler(project);
        } catch (Exception e) {
            log.error("Error occur during extraction: ", e);
        }
        if (publisherHandler == null) {
            log.warn("No publisher config found for project: " + project.getName());
            return moduleBuilderRepository;
        }
        moduleBuilderRepository.excludedArtifacts(calculateArtifacts(ProjectUtils.filterIncludeExcludeDetails(project, publisherHandler, set, false)));
        moduleBuilderRepository.artifacts(calculateArtifacts(ProjectUtils.filterIncludeExcludeDetails(project, publisherHandler, set, true)));
        return moduleBuilderRepository;
    }

    public final List<Artifact> calculateArtifacts(Iterable<GradleDeployDetails> iterable) {
        return (List) StreamSupport.stream(iterable.spliterator(), false).map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GradleModuleExtractor.lambda$calculateArtifacts$0((GradleDeployDetails) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ Artifact lambda$calculateArtifacts$0(GradleDeployDetails gradleDeployDetails) {
        PublishArtifactInfo publishArtifact = gradleDeployDetails.getPublishArtifact();
        DeployDetails deployDetails = gradleDeployDetails.getDeployDetails();
        String artifactPath = deployDetails.getArtifactPath();
        return new ArtifactBuilder(artifactPath.substring(artifactPath.lastIndexOf(47) + 1)).type(BuildInfoExtractorUtils.getTypeString(publishArtifact.getType(), publishArtifact.getClassifier(), publishArtifact.getExtension())).md5(deployDetails.getMd5()).sha1(deployDetails.getSha1()).sha256(deployDetails.getSha256()).remotePath(artifactPath).build();
    }

    public final List<Dependency> calculateDependencies(Project project, String str) throws Exception {
        Map<String, String[][]> map = ((ArtifactoryPlugin) project.getRootProject().getPlugins().getPlugin(ArtifactoryPlugin.class)).getResolutionListener().getModulesHierarchyMap().get(str);
        ConfigurationContainer<Configuration> configurations = project.getConfigurations();
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        for (Configuration configuration : configurations) {
            if (configuration.getState() != Configuration.State.RESOLVED) {
                log.info("Artifacts for configuration '{}' were not all resolved, skipping", configuration.getName());
            } else {
                Set<? extends DependencyResult> allDependencies = configuration.getIncoming().getResolutionResult().getAllDependencies();
                Iterator it = configuration.getIncoming().artifactView(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda1
                    public final void execute(Object obj) {
                        ((ArtifactView.ViewConfiguration) obj).setLenient(true);
                    }
                }).getArtifacts().iterator();
                while (it.hasNext()) {
                    Dependency dependencyExtractDependencyFromResolvedArtifact = extractDependencyFromResolvedArtifact(configuration, (ResolvedArtifactResult) it.next(), allDependencies, map, arrayListNewArrayList);
                    if (dependencyExtractDependencyFromResolvedArtifact != null) {
                        arrayListNewArrayList.add(dependencyExtractDependencyFromResolvedArtifact);
                    }
                }
            }
        }
        return arrayListNewArrayList;
    }

    public final Dependency extractDependencyFromResolvedArtifact(Configuration configuration, ResolvedArtifactResult resolvedArtifactResult, Set<? extends DependencyResult> set, Map<String, String[][]> map, List<Dependency> list) throws NoSuchAlgorithmException, IOException {
        File file = resolvedArtifactResult.getFile();
        if (!file.exists()) {
            return null;
        }
        final String strExtractDependencyId = extractDependencyId(resolvedArtifactResult, set);
        Dependency dependencyOrElse = list.stream().filter(new Predicate() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return GradleModuleExtractor.lambda$extractDependencyFromResolvedArtifact$2(strExtractDependencyId, (Dependency) obj);
            }
        }).findAny().orElse(null);
        if (dependencyOrElse != null) {
            Set<String> scopes = dependencyOrElse.getScopes();
            scopes.add(configuration.getName());
            dependencyOrElse.setScopes(scopes);
            return null;
        }
        DependencyBuilder dependencyBuilderScopes = new DependencyBuilder().type(StringUtils.substringAfterLast(file.getName(), ".")).m7388id(strExtractDependencyId).scopes(Sets.newHashSet(configuration.getName()));
        if (map != null) {
            dependencyBuilderScopes.requestedBy(map.get(strExtractDependencyId));
        }
        if (file.isFile()) {
            Map<String, String> mapCalculateChecksums = FileChecksumCalculator.calculateChecksums(file, "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256");
            dependencyBuilderScopes.md5(mapCalculateChecksums.get("MD5")).sha1(mapCalculateChecksums.get(FileChecksumCalculator.SHA1_ALGORITHM)).sha256(mapCalculateChecksums.get("SHA-256"));
        }
        return dependencyBuilderScopes.build();
    }

    public static /* synthetic */ boolean lambda$extractDependencyFromResolvedArtifact$2(String str, Dependency dependency) {
        return dependency.getId().equals(str);
    }

    public final String extractDependencyId(ResolvedArtifactResult resolvedArtifactResult, Set<? extends DependencyResult> set) {
        final ComponentIdentifier componentIdentifier = resolvedArtifactResult.getId().getComponentIdentifier();
        if (!(componentIdentifier instanceof ProjectComponentIdentifier)) {
            return componentIdentifier.getDisplayName();
        }
        ResolvedComponentResult resolvedComponentResult = (ResolvedComponentResult) set.stream().filter(new Predicate() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return GradleModuleExtractor.lambda$extractDependencyId$3((DependencyResult) obj);
            }
        }).map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GradleModuleExtractor.lambda$extractDependencyId$4((DependencyResult) obj);
            }
        }).map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ResolvedDependencyResult) obj).getSelected();
            }
        }).filter(new Predicate() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor$$ExternalSyntheticLambda5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return GradleModuleExtractor.lambda$extractDependencyId$5(componentIdentifier, (ResolvedComponentResult) obj);
            }
        }).findAny().orElse(null);
        if (resolvedComponentResult == null) {
            log.warn("Couldn't find project '{}' inside the list of projects", componentIdentifier.getDisplayName());
            return null;
        }
        return ProjectUtils.getId(resolvedComponentResult.getModuleVersion());
    }

    public static /* synthetic */ boolean lambda$extractDependencyId$3(DependencyResult dependencyResult) {
        return dependencyResult instanceof ResolvedDependencyResult;
    }

    public static /* synthetic */ ResolvedDependencyResult lambda$extractDependencyId$4(DependencyResult dependencyResult) {
        return (ResolvedDependencyResult) dependencyResult;
    }

    public static /* synthetic */ boolean lambda$extractDependencyId$5(ComponentIdentifier componentIdentifier, ResolvedComponentResult resolvedComponentResult) {
        return resolvedComponentResult.getId().equals(componentIdentifier);
    }
}
