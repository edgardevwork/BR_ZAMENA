package org.apache.ivy.plugins.lock;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class DeleteOnExitHook {
    public static final Set<File> files;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.apache.ivy.plugins.lock.DeleteOnExitHook.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DeleteOnExitHook.runHook();
            }
        });
        files = new LinkedHashSet();
    }

    public static synchronized void add(File file) {
        files.add(file);
    }

    public static synchronized void remove(File file) {
        files.remove(file);
    }

    public static synchronized void runHook() {
        Iterator<File> it = files.iterator();
        while (it.hasNext()) {
            it.next().delete();
            it.remove();
        }
    }
}
