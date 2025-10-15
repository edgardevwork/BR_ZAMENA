package org.apache.ivy.ant;

import java.util.HashMap;
import java.util.Map;
import org.apache.ivy.core.settings.IvyVariableContainer;
import org.apache.ivy.core.settings.IvyVariableContainerImpl;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Property;

/* loaded from: classes8.dex */
public class IvyAntVariableContainer extends IvyVariableContainerImpl implements IvyVariableContainer {
    public Map<String, String> overwrittenProperties = new HashMap();
    public Project project;

    public IvyAntVariableContainer(Project project) {
        this.project = project;
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainerImpl, org.apache.ivy.core.settings.IvyVariableContainer
    public String getVariable(String str) {
        String property = this.overwrittenProperties.get(str);
        if (property == null) {
            property = this.project.getProperty(str);
        }
        return property == null ? super.getVariable(str) : property;
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainerImpl, org.apache.ivy.core.settings.IvyVariableContainer
    public void setVariable(String str, String str2, boolean z) {
        if (z) {
            Message.debug("setting '" + str + "' to '" + str2 + "'");
            this.overwrittenProperties.put(str, substitute(str2));
            return;
        }
        super.setVariable(str, str2, z);
    }

    public void updateProject(String str) {
        HashMap map = new HashMap(super.getVariables());
        map.putAll(this.overwrittenProperties);
        for (Map.Entry entry : map.entrySet()) {
            setPropertyIfNotSet((String) entry.getKey(), (String) entry.getValue());
            if (str != null) {
                setPropertyIfNotSet(((String) entry.getKey()) + "." + str, (String) entry.getValue());
            }
        }
        if (getEnvironmentPrefix() != null) {
            Property property = new Property();
            property.setProject(this.project);
            property.setEnvironment(getEnvironmentPrefix());
            property.init();
            property.execute();
        }
    }

    public final void setPropertyIfNotSet(String str, String str2) {
        if (this.project.getProperty(str) == null) {
            this.project.setProperty(str, str2);
        }
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainerImpl, org.apache.ivy.core.settings.IvyVariableContainer
    public Object clone() {
        IvyAntVariableContainer ivyAntVariableContainer = (IvyAntVariableContainer) super.clone();
        ivyAntVariableContainer.overwrittenProperties = (HashMap) ((HashMap) this.overwrittenProperties).clone();
        return ivyAntVariableContainer;
    }
}
