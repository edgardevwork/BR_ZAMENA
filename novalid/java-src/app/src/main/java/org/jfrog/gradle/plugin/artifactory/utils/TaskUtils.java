package org.jfrog.gradle.plugin.artifactory.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.execution.TaskExecutionGraph;
import org.gradle.api.file.FileCollection;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.TaskProvider;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.extractor.ModuleInfoFileProducer;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;
import org.jfrog.gradle.plugin.artifactory.task.DeployTask;
import org.jfrog.gradle.plugin.artifactory.task.ExtractModuleTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class TaskUtils {
    public static final Logger log = LoggerFactory.getLogger((Class<?>) TaskUtils.class);

    public static /* synthetic */ boolean lambda$addExtractModuleInfoTask$1(Task task) {
        return false;
    }

    public static <T extends Task> TaskProvider<T> registerTaskInProject(String str, Class<T> cls, final String str2, Project project, final boolean z) {
        log.debug("Configuring {} task for project (is root: {}) {}", str, Boolean.valueOf(ProjectUtils.isRootProject(project)), project.getPath());
        TaskProvider<T> taskProviderRegister = project.getTasks().register(str, cls);
        taskProviderRegister.configure(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.TaskUtils$$ExternalSyntheticLambda3
            public final void execute(Object obj) {
                TaskUtils.lambda$registerTaskInProject$0(str2, z, (Task) obj);
            }
        });
        return taskProviderRegister;
    }

    public static /* synthetic */ void lambda$registerTaskInProject$0(String str, boolean z, Task task) {
        task.setDescription(str);
        if (z) {
            task.setGroup(Constant.PUBLISHING);
        }
    }

    public static TaskProvider<ArtifactoryTask> addCollectDeployDetailsTask(Project project) {
        try {
            return project.getTasks().named("artifactoryPublish", ArtifactoryTask.class);
        } catch (UnknownTaskException e) {
            log.debug("Can't find 'artifactoryPublish' task registered at the project", e);
            return registerTaskInProject("artifactoryPublish", ArtifactoryTask.class, Constant.ARTIFACTORY_PUBLISH_TASK_DESCRIPTION, project, true);
        }
    }

    public static void addExtractModuleInfoTask(final TaskProvider<ArtifactoryTask> taskProvider, final Project project) {
        final TaskProvider taskProviderRegisterTaskInProject;
        try {
            taskProviderRegisterTaskInProject = project.getTasks().named(Constant.EXTRACT_MODULE_TASK_NAME, ExtractModuleTask.class);
        } catch (UnknownTaskException e) {
            log.debug("Can't find 'extractModuleInfo' task registered at the project", e);
            taskProviderRegisterTaskInProject = null;
        }
        if (taskProviderRegisterTaskInProject == null) {
            taskProviderRegisterTaskInProject = registerTaskInProject(Constant.EXTRACT_MODULE_TASK_NAME, ExtractModuleTask.class, Constant.EXTRACT_MODULE_TASK_DESCRIPTION, project, false);
        }
        taskProviderRegisterTaskInProject.configure(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.TaskUtils$$ExternalSyntheticLambda0
            public final void execute(Object obj) {
                TaskUtils.lambda$addExtractModuleInfoTask$2(project, (ExtractModuleTask) obj);
            }
        });
        project.getRootProject().getTasks().withType(DeployTask.class).configureEach(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.utils.TaskUtils$$ExternalSyntheticLambda1
            public final void execute(Object obj) {
                TaskUtils.lambda$addExtractModuleInfoTask$3(taskProvider, taskProviderRegisterTaskInProject, (DeployTask) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addExtractModuleInfoTask$2(Project project, ExtractModuleTask extractModuleTask) {
        extractModuleTask.getOutputs().upToDateWhen(new Spec() { // from class: org.jfrog.gradle.plugin.artifactory.utils.TaskUtils$$ExternalSyntheticLambda2
            public final boolean isSatisfiedBy(Object obj) {
                return TaskUtils.lambda$addExtractModuleInfoTask$1((Task) obj);
            }
        });
        extractModuleTask.getModuleFile().set(project.getLayout().getBuildDirectory().file(Constant.MODULE_INFO_FILE_NAME));
        extractModuleTask.mustRunAfter(new Object[]{project.getTasks().withType(ArtifactoryTask.class)});
    }

    public static /* synthetic */ void lambda$addExtractModuleInfoTask$3(TaskProvider taskProvider, TaskProvider taskProvider2, DeployTask deployTask) {
        deployTask.registerModuleInfoProducer(new DefaultModuleInfoFileProducer((ArtifactoryTask) taskProvider.get(), (ExtractModuleTask) taskProvider2.get()));
    }

    public static void addDeploymentTask(Project project) {
        try {
            project.getTasks().named(Constant.DEPLOY_TASK_NAME, DeployTask.class);
        } catch (UnknownTaskException e) {
            log.debug("Can't find 'artifactoryDeploy' task registered at the project", e);
            registerTaskInProject(Constant.DEPLOY_TASK_NAME, DeployTask.class, Constant.DEPLOY_TASK_DESCRIPTION, project, false);
        }
    }

    public static ArtifactoryTask findExecutedCollectionTask(Project project) {
        Set tasksByName = project.getTasksByName("artifactoryPublish", false);
        if (tasksByName.isEmpty()) {
            return null;
        }
        ArtifactoryTask artifactoryTask = (ArtifactoryTask) tasksByName.iterator().next();
        if (artifactoryTask.getState().getDidWork()) {
            return artifactoryTask;
        }
        return null;
    }

    public static List<ArtifactoryTask> getAllArtifactoryPublishTasks(Project project) {
        TaskExecutionGraph taskGraph = project.getGradle().getTaskGraph();
        ArrayList arrayList = new ArrayList();
        for (ArtifactoryTask artifactoryTask : taskGraph.getAllTasks()) {
            if (artifactoryTask instanceof ArtifactoryTask) {
                arrayList.add(artifactoryTask);
            }
        }
        return arrayList;
    }

    /* loaded from: classes8.dex */
    public static class DefaultModuleInfoFileProducer implements ModuleInfoFileProducer {
        public final ArtifactoryTask collectDeployDetailsTask;
        public final ExtractModuleTask extractModuleTask;

        public DefaultModuleInfoFileProducer(ArtifactoryTask artifactoryTask, ExtractModuleTask extractModuleTask) {
            this.collectDeployDetailsTask = artifactoryTask;
            this.extractModuleTask = extractModuleTask;
        }

        @Override // org.jfrog.gradle.plugin.artifactory.extractor.ModuleInfoFileProducer
        public boolean hasModules() {
            ArtifactoryTask artifactoryTask = this.collectDeployDetailsTask;
            if (artifactoryTask == null || !artifactoryTask.getProject().getState().getExecuted()) {
                return false;
            }
            return this.collectDeployDetailsTask.hasPublications();
        }

        @Override // org.jfrog.gradle.plugin.artifactory.extractor.ModuleInfoFileProducer
        public FileCollection getModuleInfoFiles() {
            return this.extractModuleTask.getOutputs().getFiles();
        }
    }
}
