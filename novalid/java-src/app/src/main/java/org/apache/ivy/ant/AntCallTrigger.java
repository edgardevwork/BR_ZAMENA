package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.plugins.trigger.AbstractTrigger;
import org.apache.ivy.plugins.trigger.Trigger;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.CallTarget;
import org.apache.tools.ant.taskdefs.Property;

/* loaded from: classes5.dex */
public class AntCallTrigger extends AbstractTrigger implements Trigger {
    public String prefix;
    public boolean onlyonce = true;
    public String target = null;
    public Collection<IvyEvent> calls = new ArrayList();

    @Override // org.apache.ivy.core.event.IvyListener
    public void progress(IvyEvent ivyEvent) {
        Project project = (Project) IvyContext.peekInContextStack(IvyTask.ANT_PROJECT_CONTEXT_KEY);
        if (project == null) {
            Message.info("ant call trigger can only be used from an ant build. Ignoring.");
            return;
        }
        if (this.onlyonce && isTriggered(ivyEvent)) {
            Message.verbose("call already triggered for this event, skipping: " + ivyEvent);
            return;
        }
        CallTarget callTarget = new CallTarget();
        callTarget.setProject(project);
        callTarget.setTaskName("antcall");
        Map<String, String> attributes = ivyEvent.getAttributes();
        String strSubstituteTokens = IvyPatternHelper.substituteTokens(getTarget(), attributes);
        callTarget.setTarget(strSubstituteTokens);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            Property propertyCreateParam = callTarget.createParam();
            propertyCreateParam.setName(this.prefix == null ? entry.getKey() : this.prefix + entry.getKey());
            propertyCreateParam.setValue(entry.getValue() == null ? "" : entry.getValue());
        }
        Message.verbose("triggering ant call: target=" + strSubstituteTokens + " for " + ivyEvent);
        callTarget.execute();
        markTriggered(ivyEvent);
        Message.debug("triggered ant call finished: target=" + strSubstituteTokens + " for " + ivyEvent);
    }

    public final void markTriggered(IvyEvent ivyEvent) {
        this.calls.add(ivyEvent);
    }

    public final boolean isTriggered(IvyEvent ivyEvent) {
        return this.calls.contains(ivyEvent);
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public boolean isOnlyonce() {
        return this.onlyonce;
    }

    public void setOnlyonce(boolean z) {
        this.onlyonce = z;
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
