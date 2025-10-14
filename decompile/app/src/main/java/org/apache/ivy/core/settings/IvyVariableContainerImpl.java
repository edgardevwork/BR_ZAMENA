package org.apache.ivy.core.settings;

import java.util.HashMap;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class IvyVariableContainerImpl implements IvyVariableContainer {
    public String envPrefix;
    public Map<String, String> variables;

    public IvyVariableContainerImpl() {
        this.variables = new HashMap();
    }

    public IvyVariableContainerImpl(Map<String, String> map) {
        this.variables = map;
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainer
    public void setVariable(String str, String str2, boolean z) {
        if (z || !this.variables.containsKey(str)) {
            Message.debug("setting '" + str + "' to '" + str2 + "'");
            this.variables.put(str, substitute(str2));
            return;
        }
        Message.debug("'" + str + "' already set: discarding '" + str2 + "'");
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainer
    public void setEnvironmentPrefix(String str) {
        if (str != null && !str.endsWith(".")) {
            this.envPrefix = str + ".";
            return;
        }
        this.envPrefix = str;
    }

    public String substitute(String str) {
        return IvyPatternHelper.substituteVariables(str, this);
    }

    public Map<String, String> getVariables() {
        return this.variables;
    }

    public String getEnvironmentPrefix() {
        return this.envPrefix;
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainer
    public String getVariable(String str) {
        String str2 = this.envPrefix;
        if (str2 != null && str.startsWith(str2)) {
            return System.getenv(str.substring(this.envPrefix.length()));
        }
        return this.variables.get(str);
    }

    @Override // org.apache.ivy.core.settings.IvyVariableContainer
    public Object clone() {
        try {
            IvyVariableContainerImpl ivyVariableContainerImpl = (IvyVariableContainerImpl) super.clone();
            ivyVariableContainerImpl.variables = new HashMap(this.variables);
            return ivyVariableContainerImpl;
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("unable to clone a " + getClass());
        }
    }
}
