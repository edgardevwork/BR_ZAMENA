package org.apache.ivy.core.event.publish;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class EndArtifactPublishEvent extends PublishEvent {
    public static final String NAME = "post-publish-artifact";
    public static final String STATUS_FAILED = "failed";
    public static final String STATUS_SUCCESSFUL = "successful";
    public final boolean successful;

    public EndArtifactPublishEvent(DependencyResolver dependencyResolver, Artifact artifact, File file, boolean z, boolean z2) {
        super(NAME, dependencyResolver, artifact, file, z);
        this.successful = z2;
        addAttribute("status", isSuccessful() ? STATUS_SUCCESSFUL : STATUS_FAILED);
    }

    public boolean isSuccessful() {
        return this.successful;
    }
}
