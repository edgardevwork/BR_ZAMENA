package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerState.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1", m7120f = "PagerState.kt", m7121i = {}, m7122l = {552}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n772#2,4:792\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n*L\n531#1:788,4\n550#1:792,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PagerState$animateScrollToPage$3$1 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AnimationSpec<Float> $animationSpec;
    public final /* synthetic */ int $targetPage;
    public final /* synthetic */ int $targetPageOffsetToSnappedPosition;
    public final /* synthetic */ LazyLayoutAnimateScrollScope $this_with;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3$1(PagerState pagerState, int i, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, AnimationSpec<Float> animationSpec, Continuation<? super PagerState$animateScrollToPage$3$1> continuation) {
        super(2, continuation);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$this_with = lazyLayoutAnimateScrollScope;
        this.$targetPageOffsetToSnappedPosition = i2;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new PagerState$animateScrollToPage$3$1(this.this$0, this.$targetPage, this.$this_with, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, continuation);
        pagerState$animateScrollToPage$3$1.L$0 = obj;
        return pagerState$animateScrollToPage$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PagerState$animateScrollToPage$3$1) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int iCoerceAtMost;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.this$0.updateTargetPage(scrollScope, this.$targetPage);
            boolean z = this.$targetPage > this.$this_with.getFirstVisibleItemIndex();
            int lastVisibleItemIndex = (this.$this_with.getLastVisibleItemIndex() - this.$this_with.getFirstVisibleItemIndex()) + 1;
            if (((z && this.$targetPage > this.$this_with.getLastVisibleItemIndex()) || (!z && this.$targetPage < this.$this_with.getFirstVisibleItemIndex())) && Math.abs(this.$targetPage - this.$this_with.getFirstVisibleItemIndex()) >= 3) {
                if (z) {
                    iCoerceAtMost = RangesKt___RangesKt.coerceAtLeast(this.$targetPage - lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                } else {
                    iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(this.$targetPage + lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                }
                this.$this_with.snapToItem(scrollScope, iCoerceAtMost, 0);
            }
            int visibleItemsAverageSize = this.$this_with.getVisibleItemsAverageSize();
            int currentPage = this.this$0.getCurrentPage();
            float currentPageOffsetFraction = (((this.$targetPage * visibleItemsAverageSize) - (currentPage * visibleItemsAverageSize)) + this.$targetPageOffsetToSnappedPosition) - (visibleItemsAverageSize * this.this$0.getCurrentPageOffsetFraction());
            Ref.FloatRef floatRef = new Ref.FloatRef();
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            C07703 c07703 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1.3
                public final /* synthetic */ ScrollScope $$this$scroll;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07703(ScrollScope scrollScope2) {
                    super(2);
                    scrollScope = scrollScope2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                    invoke(f.floatValue(), f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f, float f2) {
                    floatRef.element += scrollScope.scrollBy(f - floatRef.element);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, currentPageOffsetFraction, 0.0f, animationSpec, c07703, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PagerState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "currentValue", "", "<anonymous parameter 1>", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n*L\n555#1:788,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1$3 */
    /* loaded from: classes3.dex */
    public static final class C07703 extends Lambda implements Function2<Float, Float, Unit> {
        public final /* synthetic */ ScrollScope $$this$scroll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07703(ScrollScope scrollScope2) {
            super(2);
            scrollScope = scrollScope2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            floatRef.element += scrollScope.scrollBy(f - floatRef.element);
        }
    }
}
