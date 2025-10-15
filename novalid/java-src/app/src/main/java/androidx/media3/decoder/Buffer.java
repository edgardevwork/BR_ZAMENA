package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.C2732C;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes4.dex */
public abstract class Buffer {
    public int flags;

    @CallSuper
    public void clear() {
        this.flags = 0;
    }

    @Deprecated
    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isFirstSample() {
        return getFlag(C2732C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public final void clearFlag(int i) {
        this.flags = (~i) & this.flags;
    }

    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }
}
