package androidx.compose.animation;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedVisibility.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;)V", "targetSize", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "getTargetSize$animation_release", "()Landroidx/compose/runtime/MutableState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalAnimationApi
/* loaded from: classes4.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public static final int $stable = 8;

    @NotNull
    private final MutableState<IntSize> targetSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m13828boximpl(IntSize.INSTANCE.m13841getZeroYbymL2g()), null, 2, null);

    @NotNull
    private Transition<EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(@NotNull Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @NotNull
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(@NotNull Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @NotNull
    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }
}
