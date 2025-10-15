package androidx.media3.container;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes.dex */
public final class Mp4Util {
    public static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;

    public static long mp4TimeToUnixTimeMs(long j) {
        return (j - 2082844800) * 1000;
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }
}
