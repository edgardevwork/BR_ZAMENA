package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dp.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u0016\u0010\u001a\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0016\u0010\u001c\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0010J\u0016\u0010\u001e\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R$\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R$\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R$\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m7105d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "origin", "Landroidx/compose/ui/unit/DpOffset;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", TtmlNode.LEFT, "Landroidx/compose/ui/unit/Dp;", "top", TtmlNode.RIGHT, "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getLeft-D9Ej5fM$annotations", "getLeft-D9Ej5fM", "getRight-D9Ej5fM$annotations", "getRight-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class DpRect {
    public static final int $stable = 0;
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-a9UjIt4$default */
    public static /* synthetic */ DpRect m13738copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m13747copya9UjIt4(f, f2, f3, f4);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations */
    public static /* synthetic */ void m13739getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations */
    public static /* synthetic */ void m13740getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations */
    public static /* synthetic */ void m13741getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations */
    public static /* synthetic */ void m13742getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    /* renamed from: copy-a9UjIt4 */
    public final DpRect m13747copya9UjIt4(float f, float top, float f2, float bottom) {
        return new DpRect(f, top, f2, bottom, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) other;
        return C2046Dp.m13671equalsimpl0(this.left, dpRect.left) && C2046Dp.m13671equalsimpl0(this.top, dpRect.top) && C2046Dp.m13671equalsimpl0(this.right, dpRect.right) && C2046Dp.m13671equalsimpl0(this.bottom, dpRect.bottom);
    }

    public int hashCode() {
        return (((((C2046Dp.m13672hashCodeimpl(this.left) * 31) + C2046Dp.m13672hashCodeimpl(this.top)) * 31) + C2046Dp.m13672hashCodeimpl(this.right)) * 31) + C2046Dp.m13672hashCodeimpl(this.bottom);
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) C2046Dp.m13677toStringimpl(this.left)) + ", top=" + ((Object) C2046Dp.m13677toStringimpl(this.top)) + ", right=" + ((Object) C2046Dp.m13677toStringimpl(this.right)) + ", bottom=" + ((Object) C2046Dp.m13677toStringimpl(this.bottom)) + ')';
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* renamed from: getLeft-D9Ej5fM */
    public final float m13749getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getTop-D9Ej5fM */
    public final float m13751getTopD9Ej5fM() {
        return this.top;
    }

    /* renamed from: getRight-D9Ej5fM */
    public final float m13750getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getBottom-D9Ej5fM */
    public final float m13748getBottomD9Ej5fM() {
        return this.bottom;
    }

    private DpRect(long j, long j2) {
        this(DpOffset.m13727getXD9Ej5fM(j), DpOffset.m13729getYD9Ej5fM(j), C2046Dp.m13666constructorimpl(DpOffset.m13727getXD9Ej5fM(j) + DpSize.m13764getWidthD9Ej5fM(j2)), C2046Dp.m13666constructorimpl(DpOffset.m13729getYD9Ej5fM(j) + DpSize.m13762getHeightD9Ej5fM(j2)), null);
    }
}
