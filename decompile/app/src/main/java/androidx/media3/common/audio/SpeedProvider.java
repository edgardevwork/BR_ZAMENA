package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface SpeedProvider {
    long getNextSpeedChangeTimeUs(long j);

    float getSpeed(long j);
}
