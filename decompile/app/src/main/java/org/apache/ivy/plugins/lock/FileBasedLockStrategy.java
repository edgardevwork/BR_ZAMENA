package org.apache.ivy.plugins.lock;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public abstract class FileBasedLockStrategy extends AbstractLockStrategy {
    public static final long DEFAULT_TIMEOUT = 120000;
    public static final int SLEEP_TIME = 100;
    public static final ConcurrentMap<File, ConcurrentMap<Thread, Integer>> currentLockHolders = new ConcurrentHashMap();
    public FileLocker locker;
    public long timeout;

    /* loaded from: classes6.dex */
    public interface FileLocker {
        boolean tryLock(File file);

        void unlock(File file);
    }

    public FileBasedLockStrategy() {
        this(new CreateFileLocker(false), false);
    }

    public FileBasedLockStrategy(boolean z) {
        this(new CreateFileLocker(z), z);
    }

    public FileBasedLockStrategy(FileLocker fileLocker, boolean z) {
        super(z);
        this.timeout = DEFAULT_TIMEOUT;
        this.locker = fileLocker;
    }

    public boolean acquireLock(File file) throws InterruptedException {
        Thread threadCurrentThread = Thread.currentThread();
        if (isDebugLocking()) {
            debugLocking("acquiring lock on " + file);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            synchronized (currentLockHolders) {
                try {
                    if (isDebugLocking()) {
                        debugLocking("entered synchronized area (locking)");
                    }
                    int iHasLock = hasLock(file, threadCurrentThread);
                    if (isDebugLocking()) {
                        debugLocking("current status for " + file + " is " + iHasLock + " held locks: " + getCurrentLockHolderNames(file));
                    }
                    if (iHasLock < 0) {
                        if (isDebugLocking()) {
                            debugLocking("waiting for another thread to release the lock: " + getCurrentLockHolderNames(file));
                        }
                    } else {
                        if (iHasLock > 0) {
                            int iIncrementLock = incrementLock(file, threadCurrentThread);
                            if (isDebugLocking()) {
                                debugLocking("reentrant lock acquired on " + file + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms - hold locks = " + iIncrementLock);
                            }
                            return true;
                        }
                        if (this.locker.tryLock(file)) {
                            if (isDebugLocking()) {
                                debugLocking("lock acquired on " + file + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY);
                            }
                            incrementLock(file, threadCurrentThread);
                            return true;
                        }
                    }
                    if (isDebugLocking()) {
                        debugLocking("failed to acquire lock; sleeping for retry...");
                    }
                    Thread.sleep(100L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (System.currentTimeMillis() - jCurrentTimeMillis < this.timeout);
        return false;
    }

    public void releaseLock(File file) {
        Thread threadCurrentThread = Thread.currentThread();
        if (isDebugLocking()) {
            debugLocking("releasing lock on " + file);
        }
        synchronized (currentLockHolders) {
            try {
                if (isDebugLocking()) {
                    debugLocking("entered synchronized area (unlocking)");
                }
                int iDecrementLock = decrementLock(file, threadCurrentThread);
                if (iDecrementLock == 0) {
                    this.locker.unlock(file);
                    if (isDebugLocking()) {
                        debugLocking("lock released on " + file);
                    }
                } else if (isDebugLocking()) {
                    debugLocking("reentrant lock released on " + file + " - hold locks = " + iDecrementLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void debugLocking(String str) {
        Message.info(Thread.currentThread() + " " + System.currentTimeMillis() + " " + str);
    }

    public final int hasLock(File file, Thread thread) {
        ConcurrentMap<Thread, Integer> concurrentMap = currentLockHolders.get(file);
        if (concurrentMap == null || concurrentMap.isEmpty()) {
            return 0;
        }
        Integer num = concurrentMap.get(thread);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue > 0) {
            return iIntValue;
        }
        return -1;
    }

    public final int incrementLock(File file, Thread thread) {
        ConcurrentMap<File, ConcurrentMap<Thread, Integer>> concurrentMap = currentLockHolders;
        ConcurrentMap<Thread, Integer> concurrentHashMap = concurrentMap.get(file);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            concurrentMap.put(file, concurrentHashMap);
        }
        Integer num = concurrentHashMap.get(thread);
        int iIntValue = num != null ? 1 + num.intValue() : 1;
        concurrentHashMap.put(thread, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public final int decrementLock(File file, Thread thread) {
        ConcurrentMap<Thread, Integer> concurrentMap = currentLockHolders.get(file);
        if (concurrentMap == null) {
            throw new RuntimeException("Calling decrementLock on a thread which holds no locks");
        }
        Integer num = concurrentMap.get(thread);
        int iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue <= 0) {
            throw new RuntimeException("Calling decrementLock on a thread which holds no locks");
        }
        int i = iIntValue - 1;
        if (i > 0) {
            concurrentMap.put(thread, Integer.valueOf(i));
        } else {
            concurrentMap.remove(thread);
        }
        return i;
    }

    public String getCurrentLockHolderNames(File file) {
        StringBuilder sb = new StringBuilder();
        ConcurrentMap<Thread, Integer> concurrentMap = currentLockHolders.get(file);
        if (concurrentMap == null) {
            return "(NULL)";
        }
        for (Thread thread : concurrentMap.keySet()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(thread.toString());
        }
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static class CreateFileLocker implements FileLocker {
        public boolean debugLocking;

        public CreateFileLocker(boolean z) {
            this.debugLocking = z;
        }

        @Override // org.apache.ivy.plugins.lock.FileBasedLockStrategy.FileLocker
        public boolean tryLock(File file) {
            try {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    return false;
                }
                if (file.createNewFile()) {
                    DeleteOnExitHook.add(file);
                    return true;
                }
                if (!this.debugLocking) {
                    return false;
                }
                FileBasedLockStrategy.debugLocking("file creation failed " + file);
                return false;
            } catch (IOException e) {
                Message.verbose("file creation failed due to an exception: " + e.getMessage() + " (" + file + ")");
                return false;
            }
        }

        @Override // org.apache.ivy.plugins.lock.FileBasedLockStrategy.FileLocker
        public void unlock(File file) {
            file.delete();
            DeleteOnExitHook.remove(file);
        }
    }

    /* loaded from: classes5.dex */
    public static class NIOFileLocker implements FileLocker {
        public boolean debugLocking;
        public ConcurrentMap<File, LockData> locks = new ConcurrentHashMap();

        public NIOFileLocker(boolean z) {
            this.debugLocking = z;
        }

        /* loaded from: classes6.dex */
        public static class LockData {

            /* renamed from: l */
            public FileLock f9994l;
            public RandomAccessFile raf;

            public LockData(RandomAccessFile randomAccessFile, FileLock fileLock) {
                this.raf = randomAccessFile;
                this.f9994l = fileLock;
            }
        }

        @Override // org.apache.ivy.plugins.lock.FileBasedLockStrategy.FileLocker
        public boolean tryLock(File file) throws IOException {
            try {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    return false;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                FileLock fileLockTryLock = randomAccessFile.getChannel().tryLock();
                if (fileLockTryLock != null) {
                    synchronized (this) {
                        this.locks.put(file, new LockData(randomAccessFile, fileLockTryLock));
                    }
                    return true;
                }
                if (!this.debugLocking) {
                    return false;
                }
                FileBasedLockStrategy.debugLocking("failed to acquire lock on " + file);
                return false;
            } catch (IOException e) {
                Message.verbose("file lock failed due to an exception: " + e.getMessage() + " (" + file + ")");
                return false;
            }
        }

        @Override // org.apache.ivy.plugins.lock.FileBasedLockStrategy.FileLocker
        public void unlock(File file) {
            synchronized (this) {
                LockData lockData = this.locks.get(file);
                if (lockData == null) {
                    throw new IllegalArgumentException("file not previously locked: " + file);
                }
                try {
                    this.locks.remove(file);
                    lockData.f9994l.release();
                    lockData.raf.close();
                } catch (IOException e) {
                    Message.error("problem while releasing lock on " + file + ": " + e.getMessage());
                }
            }
        }
    }
}
