package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes7.dex */
public class ResolveDependencyEvent extends IvyEvent {

    /* renamed from: dd */
    public DependencyDescriptor f9957dd;
    public DependencyResolver resolver;

    public ResolveDependencyEvent(String str, DependencyResolver dependencyResolver, DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId) {
        super(str);
        this.resolver = dependencyResolver;
        this.f9957dd = dependencyDescriptor;
        addAttribute("resolver", dependencyResolver.getName());
        addMridAttributes(this.f9957dd.getDependencyRevisionId());
        addAttributes(this.f9957dd.getQualifiedExtraAttributes());
        addAttributes(this.f9957dd.getExtraAttributes());
        addAttribute("req-revision", moduleRevisionId.getRevision());
        addAttribute("req-revision-default", dependencyDescriptor.getDependencyRevisionId().getRevision());
        addAttribute("req-revision-dynamic", dependencyDescriptor.getDynamicConstraintDependencyRevisionId().getRevision());
        addAttribute("req-branch", moduleRevisionId.getBranch());
        addAttribute("req-branch-default", dependencyDescriptor.getDependencyRevisionId().getBranch());
    }

    public DependencyDescriptor getDependencyDescriptor() {
        return this.f9957dd;
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }
}
