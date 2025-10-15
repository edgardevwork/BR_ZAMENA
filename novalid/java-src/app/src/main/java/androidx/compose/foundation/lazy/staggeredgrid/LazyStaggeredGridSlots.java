package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGrid.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "", "positions", "", "sizes", "([I[I)V", "getPositions", "()[I", "getSizes", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class LazyStaggeredGridSlots {
    public static final int $stable = 8;

    @NotNull
    private final int[] positions;

    @NotNull
    private final int[] sizes;

    public LazyStaggeredGridSlots(@NotNull int[] iArr, @NotNull int[] iArr2) {
        this.positions = iArr;
        this.sizes = iArr2;
    }

    @NotNull
    public final int[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final int[] getSizes() {
        return this.sizes;
    }
}
