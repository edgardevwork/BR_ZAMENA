package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintSet.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, m7105d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/constraintlayout/core/state/Transition;", "type", "", "isDirty", "", "override", "name", "", "value", "", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public interface ConstraintSet {

    /* compiled from: ConstraintSet.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    public static final class DefaultImpls {
        public static void applyTo(@NotNull ConstraintSet constraintSet, @NotNull androidx.constraintlayout.core.state.Transition transition, int i) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static boolean isDirty(@NotNull ConstraintSet constraintSet, @NotNull List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return true;
        }

        @NotNull
        public static ConstraintSet override(@NotNull ConstraintSet constraintSet, @NotNull String name, float f) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(name, "name");
            return constraintSet;
        }
    }

    void applyTo(@NotNull State state, @NotNull List<? extends Measurable> measurables);

    void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int type);

    boolean isDirty(@NotNull List<? extends Measurable> measurables);

    @NotNull
    ConstraintSet override(@NotNull String name, float value);
}
