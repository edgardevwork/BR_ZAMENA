package org.apache.ivy.plugins.lock;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes8.dex */
public class NoLockStrategy extends AbstractLockStrategy {
    @Override // org.apache.ivy.plugins.lock.LockStrategy
    public final boolean lockArtifact(Artifact artifact, File file) {
        return true;
    }

    @Override // org.apache.ivy.plugins.lock.LockStrategy
    public final void unlockArtifact(Artifact artifact, File file) {
    }

    public NoLockStrategy() {
        setName("no-lock");
    }
}
