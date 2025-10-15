package org.apache.ivy.core.event.publish;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class StartArtifactPublishEvent extends PublishEvent {
    public static final String NAME = "pre-publish-artifact";

    public StartArtifactPublishEvent(DependencyResolver dependencyResolver, Artifact artifact, File file, boolean z) {
        super(NAME, dependencyResolver, artifact, file, z);
    }
}
