package org.apache.ivy.plugins.lock;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes6.dex */
public interface LockStrategy {
    String getName();

    boolean lockArtifact(Artifact artifact, File file) throws InterruptedException;

    void unlockArtifact(Artifact artifact, File file);
}
