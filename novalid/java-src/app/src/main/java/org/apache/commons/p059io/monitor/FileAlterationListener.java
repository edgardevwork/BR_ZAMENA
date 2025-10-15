package org.apache.commons.p059io.monitor;

import java.io.File;

/* loaded from: classes6.dex */
public interface FileAlterationListener {
    void onDirectoryChange(File file);

    void onDirectoryCreate(File file);

    void onDirectoryDelete(File file);

    void onFileChange(File file);

    void onFileCreate(File file);

    void onFileDelete(File file);

    void onStart(FileAlterationObserver fileAlterationObserver);

    void onStop(FileAlterationObserver fileAlterationObserver);
}
