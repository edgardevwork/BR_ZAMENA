package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GradientOffset.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class GradientOffset {
    public static final int $stable = 0;
    public final long end;
    public final long start;

    public /* synthetic */ GradientOffset(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-0a9Yr6o$default, reason: not valid java name */
    public static /* synthetic */ GradientOffset m15090copy0a9Yr6o$default(GradientOffset gradientOffset, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gradientOffset.start;
        }
        if ((i & 2) != 0) {
            j2 = gradientOffset.end;
        }
        return gradientOffset.m15093copy0a9Yr6o(j, j2);
    }

    /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getEnd() {
        return this.end;
    }

    @NotNull
    /* renamed from: copy-0a9Yr6o, reason: not valid java name */
    public final GradientOffset m15093copy0a9Yr6o(long start, long end) {
        return new GradientOffset(start, end, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientOffset)) {
            return false;
        }
        GradientOffset gradientOffset = (GradientOffset) other;
        return Offset.m11096equalsimpl0(this.start, gradientOffset.start) && Offset.m11096equalsimpl0(this.end, gradientOffset.end);
    }

    public int hashCode() {
        return (Offset.m11101hashCodeimpl(this.start) * 31) + Offset.m11101hashCodeimpl(this.end);
    }

    @NotNull
    public String toString() {
        return "GradientOffset(start=" + Offset.m11107toStringimpl(this.start) + ", end=" + Offset.m11107toStringimpl(this.end) + ")";
    }

    public GradientOffset(long j, long j2) {
        this.start = j;
        this.end = j2;
    }

    /* renamed from: getEnd-F1C5BW0, reason: not valid java name */
    public final long m15094getEndF1C5BW0() {
        return this.end;
    }

    /* renamed from: getStart-F1C5BW0, reason: not valid java name */
    public final long m15095getStartF1C5BW0() {
        return this.start;
    }
}

