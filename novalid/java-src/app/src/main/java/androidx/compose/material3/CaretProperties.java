package androidx.compose.material3;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tooltip.kt */
@Stable
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0016\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m7105d2 = {"Landroidx/compose/material3/CaretProperties;", "", "caretHeight", "Landroidx/compose/ui/unit/Dp;", "caretWidth", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCaretHeight-D9Ej5fM", "()F", "F", "getCaretWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Landroidx/compose/material3/CaretProperties;", "equals", "", "other", "hashCode", "", "toString", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CaretProperties {
    public static final int $stable = 0;
    private final float caretHeight;
    private final float caretWidth;

    public /* synthetic */ CaretProperties(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ CaretProperties m9194copyYgX7TsA$default(CaretProperties caretProperties, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = caretProperties.caretHeight;
        }
        if ((i & 2) != 0) {
            f2 = caretProperties.caretWidth;
        }
        return caretProperties.m9197copyYgX7TsA(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCaretHeight() {
        return this.caretHeight;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCaretWidth() {
        return this.caretWidth;
    }

    @NotNull
    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final CaretProperties m9197copyYgX7TsA(float caretHeight, float caretWidth) {
        return new CaretProperties(caretHeight, caretWidth, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaretProperties)) {
            return false;
        }
        CaretProperties caretProperties = (CaretProperties) other;
        return C2046Dp.m13671equalsimpl0(this.caretHeight, caretProperties.caretHeight) && C2046Dp.m13671equalsimpl0(this.caretWidth, caretProperties.caretWidth);
    }

    public int hashCode() {
        return (C2046Dp.m13672hashCodeimpl(this.caretHeight) * 31) + C2046Dp.m13672hashCodeimpl(this.caretWidth);
    }

    @NotNull
    public String toString() {
        return "CaretProperties(caretHeight=" + ((Object) C2046Dp.m13677toStringimpl(this.caretHeight)) + ", caretWidth=" + ((Object) C2046Dp.m13677toStringimpl(this.caretWidth)) + ')';
    }

    private CaretProperties(float f, float f2) {
        this.caretHeight = f;
        this.caretWidth = f2;
    }

    /* renamed from: getCaretHeight-D9Ej5fM, reason: not valid java name */
    public final float m9198getCaretHeightD9Ej5fM() {
        return this.caretHeight;
    }

    /* renamed from: getCaretWidth-D9Ej5fM, reason: not valid java name */
    public final float m9199getCaretWidthD9Ej5fM() {
        return this.caretWidth;
    }
}
