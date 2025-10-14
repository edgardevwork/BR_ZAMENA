package androidx.constraintlayout.compose;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintLayout.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u0006¢\u0006\u0002\u0010\nJ\u0019\u0010\u001d\u001a\u00060\bj\u0002`\t2\u0006\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u001fR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R%\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m7105d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "baseDimension", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "(Lkotlin/jvm/functions/Function1;)V", "max", "Landroidx/compose/ui/unit/Dp;", "getMax-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "setMax-YLDhkOg", "(Landroidx/compose/ui/unit/Dp;)V", "maxSymbol", "", "getMaxSymbol", "()Ljava/lang/Object;", "setMaxSymbol", "(Ljava/lang/Object;)V", "min", "getMin-lTKBWiU", "setMin-YLDhkOg", "minSymbol", "getMinSymbol", "setMinSymbol", "toSolverDimension", "state", "toSolverDimension$compose_release", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {

    @NotNull
    public final Function1<State, androidx.constraintlayout.core.state.Dimension> baseDimension;

    @Nullable
    public C2046Dp max;

    @Nullable
    public Object maxSymbol;

    @Nullable
    public C2046Dp min;

    @Nullable
    public Object minSymbol;

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionDescription(@NotNull Function1<? super State, ? extends androidx.constraintlayout.core.state.Dimension> baseDimension) {
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        this.baseDimension = baseDimension;
    }

    @Nullable
    /* renamed from: getMin-lTKBWiU, reason: not valid java name and from getter */
    public final C2046Dp getMin() {
        return this.min;
    }

    /* renamed from: setMin-YLDhkOg, reason: not valid java name */
    public final void m13976setMinYLDhkOg(@Nullable C2046Dp c2046Dp) {
        this.min = c2046Dp;
    }

    @Nullable
    public final Object getMinSymbol() {
        return this.minSymbol;
    }

    public final void setMinSymbol(@Nullable Object obj) {
        this.minSymbol = obj;
    }

    @Nullable
    /* renamed from: getMax-lTKBWiU, reason: not valid java name and from getter */
    public final C2046Dp getMax() {
        return this.max;
    }

    /* renamed from: setMax-YLDhkOg, reason: not valid java name */
    public final void m13975setMaxYLDhkOg(@Nullable C2046Dp c2046Dp) {
        this.max = c2046Dp;
    }

    @Nullable
    public final Object getMaxSymbol() {
        return this.maxSymbol;
    }

    public final void setMaxSymbol(@Nullable Object obj) {
        this.maxSymbol = obj;
    }

    @NotNull
    public final androidx.constraintlayout.core.state.Dimension toSolverDimension$compose_release(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.constraintlayout.core.state.Dimension dimensionInvoke = this.baseDimension.invoke(state);
        if (getMinSymbol() != null) {
            dimensionInvoke.min(getMinSymbol());
        } else if (getMin() != null) {
            C2046Dp min = getMin();
            Intrinsics.checkNotNull(min);
            dimensionInvoke.min(state.convertDimension(min));
        }
        if (getMaxSymbol() != null) {
            dimensionInvoke.max(getMaxSymbol());
        } else if (getMax() != null) {
            C2046Dp max = getMax();
            Intrinsics.checkNotNull(max);
            dimensionInvoke.max(state.convertDimension(max));
        }
        return dimensionInvoke;
    }
}
