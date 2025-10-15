package org.apache.ivy.plugins.lock;

import java.io.File;
import org.apache.commons.p059io.output.LockableFileWriter;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.lock.FileBasedLockStrategy;

/* loaded from: classes7.dex */
public abstract class ArtifactLockStrategy extends FileBasedLockStrategy {
    public ArtifactLockStrategy(FileBasedLockStrategy.FileLocker fileLocker, boolean z) {
        super(fileLocker, z);
    }

    @Override // org.apache.ivy.plugins.lock.LockStrategy
    public boolean lockArtifact(Artifact artifact, File file) throws InterruptedException {
        return acquireLock(new File(file.getAbsolutePath() + LockableFileWriter.LCK));
    }

    @Override // org.apache.ivy.plugins.lock.LockStrategy
    public void unlockArtifact(Artifact artifact, File file) {
        releaseLock(new File(file.getAbsolutePath() + LockableFileWriter.LCK));
    }
}
