package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CornerSize.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u000bH\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7105d2 = {"ZeroCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize$annotations", "()V", "getZeroCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "CornerSize", "size", "Landroidx/compose/ui/unit/Dp;", "CornerSize-0680j_4", "(F)Landroidx/compose/foundation/shape/CornerSize;", "", "percent", "", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class CornerSizeKt {

    @NotNull
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }

    @Stable
    @NotNull
    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m8384CornerSize0680j_4(float f) {
        return new CornerSize(f, null);
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize(float f) {
        return new CornerSize(f);
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize(@IntRange(from = 0, m10to = 100) int i) {
        return new CornerSize(i);
    }

    @NotNull
    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }
}
