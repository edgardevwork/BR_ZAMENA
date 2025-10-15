package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.module.descriptor.ModuleDescriptor;

/* loaded from: classes8.dex */
public class StartResolveEvent extends ResolveEvent {
    public static final String NAME = "pre-resolve";

    public StartResolveEvent(ModuleDescriptor moduleDescriptor, String[] strArr) {
        super(NAME, moduleDescriptor, strArr);
    }
}
