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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0016\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/other/GradientOffset;", "", TtmlNode.START, "Landroidx/compose/ui/geometry/Offset;", "end", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnd-F1C5BW0", "()J", "J", "getStart-F1C5BW0", "component1", "component1-F1C5BW0", "component2", "component2-F1C5BW0", "copy", "copy-0a9Yr6o", "(JJ)Lcom/blackhub/bronline/game/ui/widget/other/GradientOffset;", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
