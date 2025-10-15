package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyLayoutPager.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Landroidx/compose/foundation/pager/PagerState;)V", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "scrollAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "calculateScrollDistance", TypedValues.CycleType.S_WAVE_OFFSET, "size", "containerSize", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PagerBringIntoViewSpec implements BringIntoViewSpec {

    @NotNull
    public final PagerState pagerState;

    @NotNull
    public final AnimationSpec<Float> scrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    public PagerBringIntoViewSpec(@NotNull PagerState pagerState) {
        this.pagerState = pagerState;
    }

    @NotNull
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    @NotNull
    public AnimationSpec<Float> getScrollAnimationSpec() {
        return this.scrollAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float offset, float size, float containerSize) {
        if (offset >= containerSize || offset < 0.0f) {
            return offset;
        }
        if ((size > containerSize || size + offset <= containerSize) && Math.abs(this.pagerState.getCurrentPageOffsetFraction()) == 0.0f) {
            return 0.0f;
        }
        return offset;
    }
}
