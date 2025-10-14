package org.apache.ivy.core.event.download;

import com.google.android.gms.common.internal.ImagesContract;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class StartArtifactDownloadEvent extends DownloadEvent {
    public static final String NAME = "pre-download-artifact";
    public ArtifactOrigin origin;
    public DependencyResolver resolver;

    public StartArtifactDownloadEvent(DependencyResolver dependencyResolver, Artifact artifact, ArtifactOrigin artifactOrigin) {
        super(NAME, artifact);
        this.resolver = dependencyResolver;
        this.origin = artifactOrigin;
        addAttribute("resolver", dependencyResolver.getName());
        addAttribute("origin", artifactOrigin.getLocation());
        addAttribute(ImagesContract.LOCAL, String.valueOf(artifactOrigin.isLocal()));
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }

    public ArtifactOrigin getOrigin() {
        return this.origin;
    }
}
