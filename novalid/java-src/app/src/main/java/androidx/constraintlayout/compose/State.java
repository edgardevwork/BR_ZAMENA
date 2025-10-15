package androidx.constraintlayout.compose;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u0000¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0016J\u0017\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b,J\b\u0010-\u001a\u00020 H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R%\u0010\u0018\u001a\u00020\u0019X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m7105d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "baselineNeeded", "", "", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "baselineNeededWidgets", "", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dirtyBaselineNeededWidgets", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/Constraints;", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "J", "baselineNeededFor", "", "id", "baselineNeededFor$compose_release", "convertDimension", "", "value", "getKeyId", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "getKeyId$compose_release", "isBaselineNeeded", "constraintWidget", "isBaselineNeeded$compose_release", "reset", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;

    @NotNull
    public final List<Object> baselineNeeded;

    @NotNull
    public final Set<ConstraintWidget> baselineNeededWidgets;

    @NotNull
    public final Density density;
    public boolean dirtyBaselineNeededWidgets;
    public LayoutDirection layoutDirection;
    public long rootIncomingConstraints;

    public State(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.density = density;
        this.rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.baselineNeeded = new ArrayList();
        this.dirtyBaselineNeededWidgets = true;
        this.baselineNeededWidgets = new LinkedHashSet();
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0 */
    public final void m14015setRootIncomingConstraintsBRTryo0(long j) {
        this.rootIncomingConstraints = j;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        throw null;
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @NotNull
    public final List<Object> getBaselineNeeded$compose_release() {
        return this.baselineNeeded;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(@Nullable Object value) {
        if (value instanceof C2046Dp) {
            return this.density.mo7868roundToPx0680j_4(((C2046Dp) value).m13680unboximpl());
        }
        return super.convertDimension(value);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void reset() {
        ConstraintWidget constraintWidget;
        HashMap<Object, Reference> mReferences = this.mReferences;
        Intrinsics.checkNotNullExpressionValue(mReferences, "mReferences");
        Iterator<Map.Entry<Object, Reference>> it = mReferences.entrySet().iterator();
        while (it.hasNext()) {
            Reference value = it.next().getValue();
            if (value != null && (constraintWidget = value.getConstraintWidget()) != null) {
                constraintWidget.reset();
            }
        }
        this.mReferences.clear();
        HashMap<Object, Reference> mReferences2 = this.mReferences;
        Intrinsics.checkNotNullExpressionValue(mReferences2, "mReferences");
        mReferences2.put(androidx.constraintlayout.core.state.State.PARENT, this.mParent);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.reset();
    }

    public final void baselineNeededFor$compose_release(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.baselineNeeded.add(id);
        this.dirtyBaselineNeededWidgets = true;
    }

    public final boolean isBaselineNeeded$compose_release(@NotNull ConstraintWidget constraintWidget) {
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            Iterator<T> it = this.baselineNeeded.iterator();
            while (it.hasNext()) {
                Reference reference = this.mReferences.get(it.next());
                ConstraintWidget constraintWidget2 = reference == null ? null : reference.getConstraintWidget();
                if (constraintWidget2 != null) {
                    this.baselineNeededWidgets.add(constraintWidget2);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }

    @Nullable
    public final Object getKeyId$compose_release(@NotNull HelperWidget helperWidget) {
        Object next;
        Intrinsics.checkNotNullParameter(helperWidget, "helperWidget");
        Set<Map.Entry<Object, HelperReference>> setEntrySet = this.mHelperReferences.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "mHelperReferences.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((HelperReference) ((Map.Entry) next).getValue()).getHelperWidget(), helperWidget)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
}
