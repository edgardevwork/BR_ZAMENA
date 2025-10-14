package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class EndResolveDependencyEvent extends ResolveDependencyEvent {
    public static final String NAME = "post-resolve-dependency";
    public long duration;
    public ResolvedModuleRevision module;

    public EndResolveDependencyEvent(DependencyResolver dependencyResolver, DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId, ResolvedModuleRevision resolvedModuleRevision, long j) {
        super(NAME, dependencyResolver, dependencyDescriptor, moduleRevisionId);
        this.module = resolvedModuleRevision;
        this.duration = j;
        addAttribute("duration", String.valueOf(j));
        ResolvedModuleRevision resolvedModuleRevision2 = this.module;
        if (resolvedModuleRevision2 != null) {
            addAttribute(IvyPatternHelper.REVISION_KEY, resolvedModuleRevision2.getDescriptor().getResolvedModuleRevisionId().getRevision());
            addAttributes(this.module.getDescriptor().getResolvedModuleRevisionId().getQualifiedExtraAttributes());
            addAttributes(this.module.getDescriptor().getResolvedModuleRevisionId().getExtraAttributes());
            addAttribute("resolved", "true");
            return;
        }
        addAttribute("resolved", "false");
    }

    public ResolvedModuleRevision getModule() {
        return this.module;
    }

    public long getDuration() {
        return this.duration;
    }
}
