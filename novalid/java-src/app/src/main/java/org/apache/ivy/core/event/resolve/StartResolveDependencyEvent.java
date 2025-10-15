package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class StartResolveDependencyEvent extends ResolveDependencyEvent {
    public static final String NAME = "pre-resolve-dependency";

    public StartResolveDependencyEvent(DependencyResolver dependencyResolver, DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId) {
        super(NAME, dependencyResolver, dependencyDescriptor, moduleRevisionId);
    }
}
