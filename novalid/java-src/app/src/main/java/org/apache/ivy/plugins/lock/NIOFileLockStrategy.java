package org.apache.ivy.plugins.lock;

import org.apache.ivy.plugins.lock.FileBasedLockStrategy;

/* loaded from: classes5.dex */
public class NIOFileLockStrategy extends ArtifactLockStrategy {
    public NIOFileLockStrategy(boolean z) {
        super(new FileBasedLockStrategy.NIOFileLocker(z), z);
        setName("artifact-lock-nio");
    }
}
