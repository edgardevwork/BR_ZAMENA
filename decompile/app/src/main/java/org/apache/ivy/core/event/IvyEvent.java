package org.apache.ivy.core.event;

import java.util.HashMap;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class IvyEvent {
    public String name;
    public Map<String, String> attributes = new HashMap();
    public EventManager source = IvyContext.getContext().getEventManager();

    public IvyEvent(String str) {
        this.name = str;
    }

    public void addAttribute(String str, String str2) {
        this.attributes.put(str, str2);
    }

    public void addMDAttributes(ModuleDescriptor moduleDescriptor) {
        addMridAttributes(moduleDescriptor.getResolvedModuleRevisionId());
    }

    public void addMridAttributes(ModuleRevisionId moduleRevisionId) {
        addModuleIdAttributes(moduleRevisionId.getModuleId());
        addAttribute(IvyPatternHelper.REVISION_KEY, moduleRevisionId.getRevision());
        addAttribute(IvyPatternHelper.BRANCH_KEY, moduleRevisionId.getBranch());
        addAttributes(moduleRevisionId.getQualifiedExtraAttributes());
        addAttributes(moduleRevisionId.getExtraAttributes());
    }

    public void addModuleIdAttributes(ModuleId moduleId) {
        addAttribute(IvyPatternHelper.ORGANISATION_KEY, moduleId.getOrganisation());
        addAttribute("module", moduleId.getName());
    }

    public void addConfsAttribute(String[] strArr) {
        addAttribute(IvyPatternHelper.CONF_KEY, StringUtils.joinArray(strArr, ", "));
    }

    public void addAttributes(Map<String, String> map) {
        this.attributes.putAll(map);
    }

    public EventManager getSource() {
        return this.source;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.attributes);
    }

    public String toString() {
        return getName() + " " + getAttributes();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IvyEvent)) {
            return false;
        }
        IvyEvent ivyEvent = (IvyEvent) obj;
        return getSource().equals(ivyEvent.getSource()) && getName().equals(ivyEvent.getName()) && this.attributes.equals(ivyEvent.attributes);
    }

    public int hashCode() {
        return ((((481 + getSource().hashCode()) * 13) + getName().hashCode()) * 13) + this.attributes.hashCode();
    }
}
