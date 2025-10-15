package org.apache.commons.p059io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes8.dex */
public class FileCleaningTracker {
    public volatile boolean exitWhenFinished;
    public Thread reaper;

    /* renamed from: q */
    public ReferenceQueue<Object> f9888q = new ReferenceQueue<>();
    public final Collection<Tracker> trackers = Collections.synchronizedSet(new HashSet());
    public final List<String> deleteFailures = Collections.synchronizedList(new ArrayList());

    public void track(File file, Object obj) {
        track(file, obj, (FileDeleteStrategy) null);
    }

    public void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(file, PomReader.PomProfileElement.FILE);
        addTracker(file.getPath(), obj, fileDeleteStrategy);
    }

    public void track(String str, Object obj) {
        track(str, obj, (FileDeleteStrategy) null);
    }

    public void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(str, "path");
        addTracker(str, obj, fileDeleteStrategy);
    }

    public final synchronized void addTracker(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        try {
            if (this.exitWhenFinished) {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
            if (this.reaper == null) {
                Reaper reaper = new Reaper();
                this.reaper = reaper;
                reaper.start();
            }
            this.trackers.add(new Tracker(str, fileDeleteStrategy, obj, this.f9888q));
        } catch (Throwable th) {
            throw th;
        }
    }

    public int getTrackCount() {
        return this.trackers.size();
    }

    public List<String> getDeleteFailures() {
        return this.deleteFailures;
    }

    public synchronized void exitWhenFinished() {
        this.exitWhenFinished = true;
        Thread thread = this.reaper;
        if (thread != null) {
            synchronized (thread) {
                this.reaper.interrupt();
            }
        }
    }

    public final class Reaper extends Thread {
        public Reaper() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (FileCleaningTracker.this.exitWhenFinished && FileCleaningTracker.this.trackers.isEmpty()) {
                    return;
                }
                try {
                    Tracker tracker = (Tracker) FileCleaningTracker.this.f9888q.remove();
                    FileCleaningTracker.this.trackers.remove(tracker);
                    if (!tracker.delete()) {
                        FileCleaningTracker.this.deleteFailures.add(tracker.getPath());
                    }
                    tracker.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class Tracker extends PhantomReference<Object> {
        public final FileDeleteStrategy deleteStrategy;
        public final String path;

        public Tracker(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.path = str;
            this.deleteStrategy = fileDeleteStrategy == null ? FileDeleteStrategy.NORMAL : fileDeleteStrategy;
        }

        public String getPath() {
            return this.path;
        }

        public boolean delete() {
            return this.deleteStrategy.deleteQuietly(new File(this.path));
        }
    }
}
