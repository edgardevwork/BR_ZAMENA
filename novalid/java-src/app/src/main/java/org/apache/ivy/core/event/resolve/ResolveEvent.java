package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;

/* loaded from: classes7.dex */
public class ResolveEvent extends IvyEvent {

    /* renamed from: md */
    public ModuleDescriptor f9958md;

    public ResolveEvent(String str, ModuleDescriptor moduleDescriptor, String[] strArr) {
        super(str);
        this.f9958md = moduleDescriptor;
        addMDAttributes(moduleDescriptor);
        addConfsAttribute(strArr);
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.f9958md;
    }
}
