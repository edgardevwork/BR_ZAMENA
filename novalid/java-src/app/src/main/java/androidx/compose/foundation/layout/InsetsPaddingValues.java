package androidx.compose.foundation.layout;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)V", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class InsetsPaddingValues implements PaddingValues {

    @NotNull
    public final Density density;

    @NotNull
    public final WindowInsets insets;

    public InsetsPaddingValues(@NotNull WindowInsets windowInsets, @NotNull Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    @NotNull
    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo8074calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo7871toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float getTop() {
        Density density = this.density;
        return density.mo7871toDpu2uoSUM(this.insets.getTop(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo8075calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo7871toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float getBottom() {
        Density density = this.density;
        return density.mo7871toDpu2uoSUM(this.insets.getBottom(density));
    }

    @NotNull
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return Intrinsics.areEqual(this.insets, insetsPaddingValues.insets) && Intrinsics.areEqual(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }
}
