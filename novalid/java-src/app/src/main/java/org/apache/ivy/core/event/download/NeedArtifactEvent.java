package org.apache.ivy.core.event.download;

import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class NeedArtifactEvent extends DownloadEvent {
    public static final String NAME = "need-artifact";
    public DependencyResolver resolver;

    public NeedArtifactEvent(DependencyResolver dependencyResolver, Artifact artifact) {
        super(NAME, artifact);
        this.resolver = dependencyResolver;
        addAttribute("resolver", dependencyResolver.getName());
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }
}
