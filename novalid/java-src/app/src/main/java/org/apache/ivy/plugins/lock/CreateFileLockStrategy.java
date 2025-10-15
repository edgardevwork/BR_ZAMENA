package org.apache.ivy.plugins.lock;

import org.apache.ivy.plugins.lock.FileBasedLockStrategy;

/* loaded from: classes5.dex */
public class CreateFileLockStrategy extends ArtifactLockStrategy {
    public CreateFileLockStrategy(boolean z) {
        super(new FileBasedLockStrategy.CreateFileLocker(z), z);
        setName("artifact-lock");
    }
}
