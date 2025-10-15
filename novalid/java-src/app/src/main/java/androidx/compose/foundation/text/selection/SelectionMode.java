package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectionMode.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\f*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "(Ljava/lang/String;I)V", "compare", "", "position", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "isSelected", "", TtmlNode.START, "end", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "containsInclusive", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Vertical", "Horizontal", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo8608compare3MmeM6k$foundation_release(long position, @NotNull Rect bounds) {
            if (SelectionManagerKt.m8601containsInclusiveUv8p0NA(bounds, position)) {
                return 0;
            }
            if (Offset.m11100getYimpl(position) < bounds.getTop()) {
                return -1;
            }
            return (Offset.m11099getXimpl(position) >= bounds.getLeft() || Offset.m11100getYimpl(position) >= bounds.getBottom()) ? 1 : -1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo8608compare3MmeM6k$foundation_release(long position, @NotNull Rect bounds) {
            if (SelectionManagerKt.m8601containsInclusiveUv8p0NA(bounds, position)) {
                return 0;
            }
            if (Offset.m11099getXimpl(position) < bounds.getLeft()) {
                return -1;
            }
            return (Offset.m11100getYimpl(position) >= bounds.getTop() || Offset.m11099getXimpl(position) >= bounds.getRight()) ? 1 : -1;
        }
    };

    /* synthetic */ SelectionMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo8608compare3MmeM6k$foundation_release(long position, @NotNull Rect bounds);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m8609isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
        if (m8607containsInclusiveUv8p0NA(bounds, start) || m8607containsInclusiveUv8p0NA(bounds, end)) {
            return true;
        }
        return (mo8608compare3MmeM6k$foundation_release(start, bounds) > 0) ^ (mo8608compare3MmeM6k$foundation_release(end, bounds) > 0);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m8607containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fM11099getXimpl = Offset.m11099getXimpl(j);
        if (left <= fM11099getXimpl && fM11099getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float fM11100getYimpl = Offset.m11100getYimpl(j);
            if (top <= fM11100getYimpl && fM11100getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
