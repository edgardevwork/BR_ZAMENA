package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class ThreadLocalBufferManager {
    public final Object RELEASE_LOCK = new Object();
    public final Map<SoftReference<BufferRecycler>, Boolean> _trackedRecyclers = new ConcurrentHashMap();
    public final ReferenceQueue<BufferRecycler> _refQueue = new ReferenceQueue<>();

    public static final class ThreadLocalBufferManagerHolder {
        public static final ThreadLocalBufferManager manager = new ThreadLocalBufferManager();
    }

    public static ThreadLocalBufferManager instance() {
        return ThreadLocalBufferManagerHolder.manager;
    }

    public int releaseBuffers() {
        int i;
        synchronized (this.RELEASE_LOCK) {
            try {
                removeSoftRefsClearedByGc();
                Iterator<SoftReference<BufferRecycler>> it = this._trackedRecyclers.keySet().iterator();
                i = 0;
                while (it.hasNext()) {
                    it.next().clear();
                    i++;
                }
                this._trackedRecyclers.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public SoftReference<BufferRecycler> wrapAndTrack(BufferRecycler bufferRecycler) {
        SoftReference<BufferRecycler> softReference = new SoftReference<>(bufferRecycler, this._refQueue);
        this._trackedRecyclers.put(softReference, Boolean.TRUE);
        removeSoftRefsClearedByGc();
        return softReference;
    }

    public final void removeSoftRefsClearedByGc() {
        while (true) {
            SoftReference softReference = (SoftReference) this._refQueue.poll();
            if (softReference == null) {
                return;
            } else {
                this._trackedRecyclers.remove(softReference);
            }
        }
    }
}
