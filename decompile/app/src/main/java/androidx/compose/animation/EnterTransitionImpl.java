package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/animation/EnterTransitionImpl;", "Landroidx/compose/animation/EnterTransition;", "data", "Landroidx/compose/animation/TransitionData;", "(Landroidx/compose/animation/TransitionData;)V", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class EnterTransitionImpl extends EnterTransition {

    @NotNull
    public final TransitionData data;

    public EnterTransitionImpl(@NotNull TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    @NotNull
    /* renamed from: getData$animation_release, reason: from getter */
    public TransitionData getData() {
        return this.data;
    }
}
