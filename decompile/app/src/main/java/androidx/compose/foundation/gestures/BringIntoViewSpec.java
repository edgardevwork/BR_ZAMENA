package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Stable
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "scrollAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "calculateScrollDistance", TypedValues.CycleType.S_WAVE_OFFSET, "size", "containerSize", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface BringIntoViewSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    float calculateScrollDistance(float offset, float size, float containerSize);

    @NotNull
    default AnimationSpec<Float> getScrollAnimationSpec() {
        return INSTANCE.getDefaultScrollAnimationSpec();
    }

    /* compiled from: Scrollable.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "()V", "DefaultBringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getDefaultBringIntoViewSpec$foundation_release", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "DefaultScrollAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getDefaultScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

        @NotNull
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1

            @NotNull
            private final AnimationSpec<Float> scrollAnimationSpec = BringIntoViewSpec.Companion.$$INSTANCE.getDefaultScrollAnimationSpec();

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            @NotNull
            public AnimationSpec<Float> getScrollAnimationSpec() {
                return this.scrollAnimationSpec;
            }

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public float calculateScrollDistance(float offset, float size, float containerSize) {
                float f = size + offset;
                if ((offset >= 0.0f && f <= containerSize) || (offset < 0.0f && f > containerSize)) {
                    return 0.0f;
                }
                float f2 = f - containerSize;
                return Math.abs(offset) < Math.abs(f2) ? offset : f2;
            }
        };

        private Companion() {
        }

        @NotNull
        public final AnimationSpec<Float> getDefaultScrollAnimationSpec() {
            return DefaultScrollAnimationSpec;
        }

        @NotNull
        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation_release() {
            return DefaultBringIntoViewSpec;
        }
    }
}
