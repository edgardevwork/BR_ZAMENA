package androidx.constraintlayout.compose;

import androidx.compose.p003ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintSet.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m7105d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "applyToState", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface DerivedConstraintSet extends ConstraintSet {
    @Override // androidx.constraintlayout.compose.ConstraintSet
    void applyTo(@NotNull State state, @NotNull List<? extends Measurable> measurables);

    void applyToState(@NotNull State state);

    @Nullable
    ConstraintSet getExtendFrom();

    /* compiled from: ConstraintSet.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static void applyTo(@NotNull DerivedConstraintSet derivedConstraintSet, @NotNull androidx.constraintlayout.core.state.Transition transition, int i) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(transition, "transition");
            ConstraintSet.DefaultImpls.applyTo(derivedConstraintSet, transition, i);
        }

        public static boolean isDirty(@NotNull DerivedConstraintSet derivedConstraintSet, @NotNull List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ConstraintSet.DefaultImpls.isDirty(derivedConstraintSet, measurables);
        }

        @NotNull
        public static ConstraintSet override(@NotNull DerivedConstraintSet derivedConstraintSet, @NotNull String name, float f) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(name, "name");
            return ConstraintSet.DefaultImpls.override(derivedConstraintSet, name, f);
        }

        public static void applyTo(@NotNull DerivedConstraintSet derivedConstraintSet, @NotNull State state, @NotNull List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ConstraintLayoutKt.buildMapping(state, measurables);
            ConstraintSet extendFrom = derivedConstraintSet.getExtendFrom();
            DerivedConstraintSet derivedConstraintSet2 = extendFrom instanceof DerivedConstraintSet ? (DerivedConstraintSet) extendFrom : null;
            if (derivedConstraintSet2 != null) {
                derivedConstraintSet2.applyTo(state, measurables);
            }
            derivedConstraintSet.applyToState(state);
        }
    }
}
