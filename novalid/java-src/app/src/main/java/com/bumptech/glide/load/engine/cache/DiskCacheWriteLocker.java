package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class DiskCacheWriteLocker {
    public final Map<String, WriteLock> locks = new HashMap();
    public final WriteLockPool writeLockPool = new WriteLockPool();

    public static class WriteLock {
        public int interestedThreads;
        public final Lock lock = new ReentrantLock();
    }

    public void acquire(String str) {
        WriteLock writeLockObtain;
        synchronized (this) {
            try {
                writeLockObtain = this.locks.get(str);
                if (writeLockObtain == null) {
                    writeLockObtain = this.writeLockPool.obtain();
                    this.locks.put(str, writeLockObtain);
                }
                writeLockObtain.interestedThreads++;
            } catch (Throwable th) {
                throw th;
            }
        }
        writeLockObtain.lock.lock();
    }

    public void release(String str) {
        WriteLock writeLock;
        synchronized (this) {
            try {
                writeLock = (WriteLock) Preconditions.checkNotNull(this.locks.get(str));
                int i = writeLock.interestedThreads;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + writeLock.interestedThreads);
                }
                int i2 = i - 1;
                writeLock.interestedThreads = i2;
                if (i2 == 0) {
                    WriteLock writeLockRemove = this.locks.remove(str);
                    if (!writeLockRemove.equals(writeLock)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + writeLockRemove + ", safeKey: " + str);
                    }
                    this.writeLockPool.offer(writeLockRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writeLock.lock.unlock();
    }

    public static class WriteLockPool {
        public static final int MAX_POOL_SIZE = 10;
        public final Queue<WriteLock> pool = new ArrayDeque();

        public WriteLock obtain() {
            WriteLock writeLockPoll;
            synchronized (this.pool) {
                writeLockPoll = this.pool.poll();
            }
            return writeLockPoll == null ? new WriteLock() : writeLockPoll;
        }

        public void offer(WriteLock writeLock) {
            synchronized (this.pool) {
                try {
                    if (this.pool.size() < 10) {
                        this.pool.offer(writeLock);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
