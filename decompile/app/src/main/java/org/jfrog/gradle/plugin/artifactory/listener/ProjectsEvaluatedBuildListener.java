package org.jfrog.gradle.plugin.artifactory.listener;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.gradle.BuildAdapter;
import org.gradle.StartParameter;
import org.gradle.api.Project;
import org.gradle.api.ProjectEvaluationListener;
import org.gradle.api.ProjectState;
import org.gradle.api.Task;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.publish.PublishingExtension;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;
import org.jfrog.gradle.plugin.artifactory.utils.ConventionUtils;
import org.jfrog.gradle.plugin.artifactory.utils.ProjectUtils;
import org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils;

/* loaded from: classes5.dex */
public class ProjectsEvaluatedBuildListener extends BuildAdapter implements ProjectEvaluationListener {
    public static final Logger log = Logging.getLogger(ProjectsEvaluatedBuildListener.class);
    public final Set<Task> detailsCollectingTasks = Collections.newSetFromMap(new ConcurrentHashMap());

    public void beforeEvaluate(Project project) {
    }

    public final void evaluate(ArtifactoryTask artifactoryTask) throws IOException {
        Logger logger = log;
        logger.debug("Try to evaluate {}", artifactoryTask);
        Project project = artifactoryTask.getProject();
        ArtifactoryPluginConvention artifactoryConvention = ConventionUtils.getArtifactoryConvention(project);
        if (artifactoryConvention == null) {
            logger.debug("Can't find artifactory convention.");
            return;
        }
        ArtifactoryClientConfiguration clientConfig = artifactoryConvention.getClientConfig();
        if (clientConfig == null) {
            logger.debug("Client configuration not defined.");
            return;
        }
        ConventionUtils.updateConfig(clientConfig, project);
        if (artifactoryTask.isCiServerBuild()) {
            addCiAttributesToTask(artifactoryTask, clientConfig);
        }
        artifactoryTask.evaluateTask();
    }

    public final void addCiAttributesToTask(ArtifactoryTask artifactoryTask, ArtifactoryClientConfiguration artifactoryClientConfiguration) {
        PublishingExtension publishingExtension = (PublishingExtension) artifactoryTask.getProject().getExtensions().findByName(Constant.PUBLISHING);
        String publications = artifactoryClientConfiguration.publisher.getPublications();
        if (!StringUtils.isNotBlank(publications)) {
            if (ProjectUtils.hasOneOfComponents(artifactoryTask.getProject(), Constant.JAVA, Constant.JAVA_PLATFORM)) {
                PublicationUtils.addDefaultPublicationsOrArchiveConfigurations(artifactoryTask, publishingExtension);
            }
        } else if (publishingExtension == null) {
            log.debug("Can't find publishing extensions that is defined for the project {}", artifactoryTask.getProject().getPath());
        } else {
            artifactoryTask.publications(publications.split(","));
        }
    }

    public void afterEvaluate(final Project project, ProjectState projectState) {
        final StartParameter startParameter = project.getGradle().getStartParameter();
        project.getTasksByName("artifactoryPublish", false).forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.listener.ProjectsEvaluatedBuildListener$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                this.f$0.lambda$afterEvaluate$0(project, startParameter, (Task) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$afterEvaluate$0(Project project, StartParameter startParameter, Task task) throws IOException {
        if (task instanceof ArtifactoryTask) {
            Task task2 = (ArtifactoryTask) task;
            this.detailsCollectingTasks.add(task2);
            task2.finalizeByDeployTask(project);
            if (startParameter.isConfigureOnDemand()) {
                evaluate(task2);
            }
        }
    }

    public void projectsEvaluated(Gradle gradle) {
        this.detailsCollectingTasks.addAll(gradle.getRootProject().getTasksByName("artifactoryPublish", false));
        this.detailsCollectingTasks.forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.listener.ProjectsEvaluatedBuildListener$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                this.f$0.lambda$projectsEvaluated$1((Task) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$projectsEvaluated$1(Task task) throws IOException {
        if (task instanceof ArtifactoryTask) {
            ArtifactoryTask artifactoryTask = (ArtifactoryTask) task;
            if (artifactoryTask.isEvaluated()) {
                return;
            }
            evaluate(artifactoryTask);
            artifactoryTask.finalizeByDeployTask(artifactoryTask.getProject());
        }
    }
}
