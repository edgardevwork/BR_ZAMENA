package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MotionLayout.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, m7105d2 = {"Landroidx/constraintlayout/compose/Transition;", "", "applyTo", "", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/constraintlayout/core/state/Transition;", "type", "", "getEndConstraintSetId", "", "getStartConstraintSetId", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public interface Transition {
    void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int type);

    @NotNull
    String getEndConstraintSetId();

    @NotNull
    String getStartConstraintSetId();
}
