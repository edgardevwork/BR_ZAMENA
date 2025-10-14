package org.jfrog.gradle.plugin.artifactory;

import java.util.Objects;
import java.util.function.Consumer;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jfrog.build.client.Version;
import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention;
import org.jfrog.gradle.plugin.artifactory.listener.ArtifactoryDependencyResolutionListener;
import org.jfrog.gradle.plugin.artifactory.listener.ProjectsEvaluatedBuildListener;
import org.jfrog.gradle.plugin.artifactory.utils.ConventionUtils;
import org.jfrog.gradle.plugin.artifactory.utils.ProjectUtils;
import org.jfrog.gradle.plugin.artifactory.utils.TaskUtils;

/* loaded from: classes5.dex */
public class ArtifactoryPlugin implements Plugin<Project> {
    public static final Logger log = Logging.getLogger(ArtifactoryPlugin.class);
    public final ArtifactoryDependencyResolutionListener resolutionListener = new ArtifactoryDependencyResolutionListener();

    public void apply(Project project) {
        if (shouldApplyPluginOnProject(project)) {
            ArtifactoryPluginConvention orCreateArtifactoryConvention = ConventionUtils.getOrCreateArtifactoryConvention(project);
            TaskUtils.addExtractModuleInfoTask(TaskUtils.addCollectDeployDetailsTask(project), project);
            if (ProjectUtils.isRootProject(project)) {
                TaskUtils.addDeploymentTask(project);
                project.getAllprojects().forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f$0.lambda$apply$1((Project) obj);
                    }
                });
            } else {
                project.getRootProject().getPluginManager().apply(ArtifactoryPlugin.class);
            }
            project.getGradle().addProjectEvaluationListener(new ProjectsEvaluatedBuildListener());
            String buildStarted = orCreateArtifactoryConvention.getClientConfig().info.getBuildStarted();
            if (buildStarted == null || buildStarted.isEmpty()) {
                orCreateArtifactoryConvention.getClientConfig().info.setBuildStarted(System.currentTimeMillis());
            }
            log.debug("Using Artifactory Plugin for " + project.getPath());
        }
    }

    public final /* synthetic */ void lambda$apply$0(Configuration configuration) {
        ResolvableDependencies incoming = configuration.getIncoming();
        final ArtifactoryDependencyResolutionListener artifactoryDependencyResolutionListener = this.resolutionListener;
        Objects.requireNonNull(artifactoryDependencyResolutionListener);
        incoming.afterResolve(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin$$ExternalSyntheticLambda2
            public final void execute(Object obj) {
                artifactoryDependencyResolutionListener.afterResolve((ResolvableDependencies) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$apply$1(Project project) {
        project.getConfigurations().all(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin$$ExternalSyntheticLambda1
            public final void execute(Object obj) {
                this.f$0.lambda$apply$0((Configuration) obj);
            }
        });
    }

    public final boolean shouldApplyPluginOnProject(Project project) throws GradleException {
        if ("buildSrc".equals(project.getName())) {
            log.debug("Artifactory Plugin disabled for {}", project.getPath());
            return false;
        }
        if (isGradleVersionSupported(project)) {
            return true;
        }
        throw new GradleException("Can't apply Artifactory Plugin on Gradle version " + project.getGradle().getGradleVersion() + ". Minimum supported Gradle version is " + Constant.MIN_GRADLE_VERSION);
    }

    public boolean isGradleVersionSupported(Project project) {
        return new Version(project.getGradle().getGradleVersion()).isAtLeast(Constant.MIN_GRADLE_VERSION);
    }

    public ArtifactoryDependencyResolutionListener getResolutionListener() {
        return this.resolutionListener;
    }
}
