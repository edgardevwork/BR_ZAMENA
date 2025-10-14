package org.jfrog.gradle.plugin.artifactory.task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.commons.lang3.StringUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.FileCollection;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.TaskAction;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleBuildInfoExtractor;
import org.jfrog.gradle.plugin.artifactory.extractor.ModuleInfoFileProducer;
import org.jfrog.gradle.plugin.artifactory.utils.ConventionUtils;
import org.jfrog.gradle.plugin.artifactory.utils.DeployUtils;
import org.jfrog.gradle.plugin.artifactory.utils.TaskUtils;

/* loaded from: classes5.dex */
public class DeployTask extends DefaultTask {
    public static final Logger log = Logging.getLogger(DeployTask.class);
    public final List<ModuleInfoFileProducer> moduleInfoFileProducers = new ArrayList();

    public void registerModuleInfoProducer(ModuleInfoFileProducer moduleInfoFileProducer) {
        this.moduleInfoFileProducers.add(moduleInfoFileProducer);
    }

    @InputFiles
    public FileCollection getModuleInfoFiles() {
        final ConfigurableFileCollection configurableFileCollectionFiles = getProject().files(new Object[0]);
        this.moduleInfoFileProducers.forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.task.DeployTask$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DeployTask.lambda$getModuleInfoFiles$0(configurableFileCollectionFiles, (ModuleInfoFileProducer) obj);
            }
        });
        return configurableFileCollectionFiles;
    }

    public static /* synthetic */ void lambda$getModuleInfoFiles$0(ConfigurableFileCollection configurableFileCollection, ModuleInfoFileProducer moduleInfoFileProducer) {
        configurableFileCollection.from(new Object[]{moduleInfoFileProducer.getModuleInfoFiles()});
        configurableFileCollection.builtBy(new Object[]{moduleInfoFileProducer.getModuleInfoFiles().getBuildDependencies()});
    }

    @TaskAction
    public void extractBuildInfoAndDeploy() throws IOException {
        log.debug("Extracting build-info and deploying build details in task '{}'", getPath());
        ArtifactoryClientConfiguration clientConfig = ConventionUtils.getArtifactoryConvention(getProject()).getClientConfig();
        handleBuildInfoOperations(clientConfig, deployArtifactsFromTasks(clientConfig));
        deleteBuildInfoPropertiesFile();
    }

    public final Map<String, Set<DeployDetails>> deployArtifactsFromTasks(final ArtifactoryClientConfiguration artifactoryClientConfiguration) throws ExecutionException, InterruptedException {
        final Map<String, String> props = artifactoryClientConfiguration.publisher.getProps();
        ArtifactoryClientConfiguration.addDefaultPublisherAttributes(artifactoryClientConfiguration, getProject().getRootProject().getName(), Constant.GRADLE, getProject().getGradle().getGradleVersion());
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<ArtifactoryTask> allArtifactoryPublishTasks = TaskUtils.getAllArtifactoryPublishTasks(getProject());
        int iIntValue = artifactoryClientConfiguration.publisher.getPublishForkCount().intValue();
        if (iIntValue <= 1) {
            allArtifactoryPublishTasks.forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.task.DeployTask$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DeployUtils.deployTaskArtifacts(artifactoryClientConfiguration, props, concurrentHashMap, (ArtifactoryTask) obj, null);
                }
            });
        } else {
            try {
                final ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(iIntValue);
                CompletableFuture.allOf((CompletableFuture[]) allArtifactoryPublishTasks.stream().map(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.task.DeployTask$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return DeployTask.lambda$deployArtifactsFromTasks$3(artifactoryClientConfiguration, props, concurrentHashMap, executorServiceNewFixedThreadPool, (ArtifactoryTask) obj);
                    }
                }).toArray(new IntFunction() { // from class: org.jfrog.gradle.plugin.artifactory.task.DeployTask$$ExternalSyntheticLambda2
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        return DeployTask.lambda$deployArtifactsFromTasks$4(i);
                    }
                })).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return concurrentHashMap;
    }

    public static /* synthetic */ void lambda$deployArtifactsFromTasks$2(ArtifactoryClientConfiguration artifactoryClientConfiguration, Map map, Map map2, ArtifactoryTask artifactoryTask) {
        DeployUtils.deployTaskArtifacts(artifactoryClientConfiguration, map, map2, artifactoryTask, "[" + Thread.currentThread().getName() + "]");
    }

    public static /* synthetic */ CompletableFuture lambda$deployArtifactsFromTasks$3(final ArtifactoryClientConfiguration artifactoryClientConfiguration, final Map map, final Map map2, ExecutorService executorService, final ArtifactoryTask artifactoryTask) {
        return CompletableFuture.runAsync(new Runnable() { // from class: org.jfrog.gradle.plugin.artifactory.task.DeployTask$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DeployTask.lambda$deployArtifactsFromTasks$2(artifactoryClientConfiguration, map, map2, artifactoryTask);
            }
        }, executorService);
    }

    public static /* synthetic */ CompletableFuture[] lambda$deployArtifactsFromTasks$4(int i) {
        return new CompletableFuture[i];
    }

    public final void handleBuildInfoOperations(ArtifactoryClientConfiguration artifactoryClientConfiguration, Map<String, Set<DeployDetails>> map) throws IOException {
        BuildInfo buildInfoExtract = new GradleBuildInfoExtractor(artifactoryClientConfiguration, this.moduleInfoFileProducers).extract(getProject().getRootProject());
        exportBuildInfoToFileSystem(artifactoryClientConfiguration, buildInfoExtract);
        DeployUtils.deployBuildInfo(artifactoryClientConfiguration, buildInfoExtract, map);
    }

    public final void exportBuildInfoToFileSystem(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo) throws IOException {
        try {
            exportBuildInfo(buildInfo, getExportFile(artifactoryClientConfiguration));
            if (StringUtils.isEmpty(artifactoryClientConfiguration.info.getGeneratedBuildInfoFilePath())) {
                return;
            }
            exportBuildInfo(buildInfo, new File(artifactoryClientConfiguration.info.getGeneratedBuildInfoFilePath()));
        } catch (Exception e) {
            log.error("Failed writing build info to file: ", e);
            throw new IOException("Failed writing build info to file", e);
        }
    }

    public final File getExportFile(ArtifactoryClientConfiguration artifactoryClientConfiguration) {
        String exportFile = artifactoryClientConfiguration.getExportFile();
        if (StringUtils.isNotBlank(exportFile)) {
            return new File(exportFile);
        }
        return new File(getProject().getRootProject().getBuildDir(), Constant.BUILD_INFO_FILE_NAME);
    }

    public final void exportBuildInfo(BuildInfo buildInfo, File file) throws IOException, RuntimeException {
        log.debug("Exporting generated build info to '{}'", file.getAbsolutePath());
        BuildInfoExtractorUtils.saveBuildInfoToFile(buildInfo, file);
    }

    public final void deleteBuildInfoPropertiesFile() {
        String str = System.getenv("buildInfoConfig.propertiesFile");
        if (StringUtils.isBlank(str)) {
            str = System.getenv("BUILDINFO_PROPFILE");
        }
        if (StringUtils.isNotBlank(str)) {
            File file = new File(str);
            if (!file.exists() || file.delete()) {
                return;
            }
            log.warn("Can't delete build-info config properties file at {}", str);
        }
    }
}
