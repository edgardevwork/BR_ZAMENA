package androidx.compose.p003ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorFilter.kt */
@Immutable
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdd-0d7_KjU", "()J", "J", "getMultiply-0d7_KjU", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j, long j2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, colorFilter);
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: getMultiply-0d7_KjU, reason: from getter */
    public final long getMultiply() {
        return this.multiply;
    }

    /* renamed from: getAdd-0d7_KjU, reason: from getter */
    public final long getAdd() {
        return this.add;
    }

    private LightingColorFilter(long j, long j2, ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    private LightingColorFilter(long j, long j2) {
        this(j, j2, AndroidColorFilter_androidKt.m11205actualLightingColorFilterOWjLjI(j, j2), null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) other;
        return Color.m11341equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m11341equalsimpl0(this.add, lightingColorFilter.add);
    }

    public int hashCode() {
        return (Color.m11347hashCodeimpl(this.multiply) * 31) + Color.m11347hashCodeimpl(this.add);
    }

    @NotNull
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m11348toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m11348toStringimpl(this.add)) + ')';
    }
}
