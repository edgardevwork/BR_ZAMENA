package androidx.media3.extractor.mp3;

import androidx.media3.common.C2732C;
import androidx.media3.extractor.SeekMap;

/* loaded from: classes3.dex */
public interface Seeker extends SeekMap {
    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j);

    /* loaded from: classes.dex */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return C2732C.RATE_UNSET_INT;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j) {
            return 0L;
        }

        public UnseekableSeeker() {
            super(C2732C.TIME_UNSET);
        }
    }
}
