package org.apache.ivy.ant;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.plugins.trigger.AbstractTrigger;
import org.apache.ivy.plugins.trigger.Trigger;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Ant;
import org.apache.tools.ant.taskdefs.Property;

/* loaded from: classes5.dex */
public class AntBuildTrigger extends AbstractTrigger implements Trigger {
    public String buildFilePattern;
    public String prefix;
    public boolean onlyOnce = true;
    public String target = null;
    public Collection<String> builds = new ArrayList();

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.core.event.IvyListener
    public void progress(IvyEvent ivyEvent) throws BuildException {
        File buildFile = getBuildFile(ivyEvent);
        if (buildFile.exists()) {
            if (this.onlyOnce && isBuilt(buildFile)) {
                Message.verbose("target build file already built, skipping: " + buildFile);
                return;
            }
            Ant ant = new Ant();
            Project project = (Project) IvyContext.peekInContextStack(IvyTask.ANT_PROJECT_CONTEXT_KEY);
            if (project == null) {
                project = new Project();
                project.init();
            }
            ant.setProject(project);
            ant.setTaskName("ant");
            ant.setAntfile(buildFile.getAbsolutePath());
            ant.setInheritAll(false);
            String target = getTarget();
            if (target != null) {
                ant.setTarget(target);
            }
            for (Map.Entry<String, String> entry : ivyEvent.getAttributes().entrySet()) {
                if (entry.getValue() != null) {
                    Property propertyCreateProperty = ant.createProperty();
                    propertyCreateProperty.setName(this.prefix == null ? entry.getKey() : this.prefix + entry.getKey());
                    propertyCreateProperty.setValue(entry.getValue());
                }
            }
            Message.verbose("triggering build: " + buildFile + " target=" + target + " for " + ivyEvent);
            try {
                ant.execute();
                markBuilt(buildFile);
                Message.debug("triggered build finished: " + buildFile + " target=" + target + " for " + ivyEvent);
                return;
            } catch (BuildException e) {
                Message.verbose("Exception occurred while executing target " + target);
                throw e;
            }
        }
        Message.verbose("no build file found for dependency, skipping: " + buildFile);
    }

    public final void markBuilt(File file) {
        this.builds.add(file.getAbsolutePath());
    }

    public final boolean isBuilt(File file) {
        return this.builds.contains(file.getAbsolutePath());
    }

    public final File getBuildFile(IvyEvent ivyEvent) {
        return IvyContext.getContext().getSettings().resolveFile(IvyPatternHelper.substituteTokens(getBuildFilePattern(), ivyEvent.getAttributes()));
    }

    public String getBuildFilePattern() {
        return this.buildFilePattern;
    }

    public void setAntfile(String str) {
        this.buildFilePattern = str;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public boolean isOnlyonce() {
        return this.onlyOnce;
    }

    public void setOnlyonce(boolean z) {
        this.onlyOnce = z;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
        if (str.endsWith(".")) {
            return;
        }
        this.prefix += ".";
    }
}
