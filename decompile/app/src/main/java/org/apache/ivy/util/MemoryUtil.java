package org.apache.ivy.util;

/* loaded from: classes8.dex */
public final class MemoryUtil {
    public static final int SAMPLING_SIZE = 100;
    public static final int SLEEP_TIME = 100;

    public static long sizeOf(Class<?> cls) throws IllegalAccessException, InstantiationException {
        Object[] objArr = new Object[100];
        try {
            cls.newInstance();
            long usedMemory = getUsedMemory();
            for (int i = 0; i < 100; i++) {
                objArr[i] = cls.newInstance();
            }
            return Math.round((getUsedMemory() - usedMemory) / 100);
        } catch (Exception e) {
            Message.warn("Couldn't instantiate " + cls, e);
            return 0L;
        }
    }

    public static long getUsedMemory() throws InterruptedException {
        m7380gc();
        long j = Runtime.getRuntime().totalMemory();
        m7380gc();
        return j - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: gc */
    public static void m7380gc() throws InterruptedException {
        try {
            System.gc();
            Thread.sleep(100L);
            System.runFinalization();
            Thread.sleep(100L);
            System.gc();
            Thread.sleep(100L);
            System.runFinalization();
            Thread.sleep(100L);
        } catch (Exception e) {
            Message.debug(e);
        }
    }

    public static void main(String[] strArr) throws ClassNotFoundException {
        System.out.println(sizeOf(Class.forName(strArr[0])));
    }
}
