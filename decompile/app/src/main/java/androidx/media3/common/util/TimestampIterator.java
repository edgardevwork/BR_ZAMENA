package androidx.media3.common.util;

@UnstableApi
/* loaded from: classes2.dex */
public interface TimestampIterator {
    TimestampIterator copyOf();

    boolean hasNext();

    long next();
}
