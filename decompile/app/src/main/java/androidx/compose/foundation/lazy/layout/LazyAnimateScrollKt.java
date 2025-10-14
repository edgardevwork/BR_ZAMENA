package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.extractor.p007ts.H263Reader;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyAnimateScroll.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a2\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0016"}, m7105d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", FirebaseAnalytics.Param.INDEX, "", "scrollOffset", "numOfItemsForTeleport", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isItemVisible", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,317:1\n154#2:318\n154#2:319\n154#2:320\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n35#1:318\n36#1:319\n37#1:320\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = C2046Dp.m13666constructorimpl(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
    private static final float BoundDistance = C2046Dp.m13666constructorimpl(1500);
    private static final float MinimumDistance = C2046Dp.m13666constructorimpl(50);

    private static final void debugLog(Function0<String> function0) {
    }

    public static final boolean isItemVisible(@NotNull LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i) {
        return i <= lazyLayoutAnimateScrollScope.getLastVisibleItemIndex() && lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i;
    }

    /* compiled from: LazyAnimateScroll.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", m7120f = "LazyAnimateScroll.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, m7122l = {H263Reader.START_CODE_VALUE_VOP, 280}, m7123m = "invokeSuspend", m7124n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n1#2:318\n41#3,4:319\n41#3,4:323\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n174#1:319,4\n277#1:323,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 */
    public static final class C07012 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Density $density;
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $numOfItemsForTeleport;
        public final /* synthetic */ int $scrollOffset;
        public final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07012(int i, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, Continuation<? super C07012> continuation) {
            super(2, continuation);
            this.$index = i;
            this.$density = density;
            this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
            this.$scrollOffset = i2;
            this.$numOfItemsForTeleport = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C07012 c07012 = new C07012(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
            c07012.L$0 = obj;
            return c07012;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07012) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:138:0x00cf A[Catch: ItemFoundInScroll -> 0x01ba, TryCatch #1 {ItemFoundInScroll -> 0x01ba, blocks: (B:136:0x00cb, B:138:0x00cf, B:140:0x00d7, B:152:0x0104, B:156:0x0140, B:160:0x014d), top: B:202:0x00cb }] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0198 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0235 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v26, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0199 -> B:208:0x01a1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object obj2;
            ItemFoundInScroll itemFoundInScroll;
            ScrollScope scrollScope;
            float fMo7874toPx0680j_4;
            float fMo7874toPx0680j_42;
            float fMo7874toPx0680j_43;
            Ref.BooleanRef booleanRef;
            Ref.ObjectRef objectRef;
            float f;
            float f2;
            ScrollScope scrollScope2;
            float f3;
            int i;
            Ref.IntRef intRef;
            AnimationState animationStateCopy$default;
            Float fBoxFloat;
            boolean z;
            boolean z2;
            AnonymousClass5 anonymousClass5;
            ScrollScope scrollScope3;
            float fMax;
            float f4;
            AnimationState animationState;
            Float fBoxFloat2;
            AnonymousClass3 anonymousClass3;
            Object obj3;
            boolean z3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            float f5 = 0.0f;
            boolean z4 = true;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope4 = (ScrollScope) this.L$0;
                int i3 = this.$index;
                if (((float) i3) >= 0.0f) {
                    try {
                        fMo7874toPx0680j_4 = this.$density.mo7874toPx0680j_4(LazyAnimateScrollKt.TargetDistance);
                        fMo7874toPx0680j_42 = this.$density.mo7874toPx0680j_4(LazyAnimateScrollKt.BoundDistance);
                        fMo7874toPx0680j_43 = this.$density.mo7874toPx0680j_4(LazyAnimateScrollKt.MinimumDistance);
                        booleanRef = new Ref.BooleanRef();
                        booleanRef.element = true;
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    } catch (ItemFoundInScroll e) {
                        e = e;
                        obj2 = coroutine_suspended;
                    }
                    if (LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                        obj2 = coroutine_suspended;
                        try {
                            throw new ItemFoundInScroll(this.$this_animateScrollToItem.getVisibleItemScrollOffset(this.$index), (AnimationState) objectRef.element);
                        } catch (ItemFoundInScroll e2) {
                            e = e2;
                            itemFoundInScroll = e;
                            scrollScope = scrollScope4;
                            animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            float itemOffset = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                            Ref.FloatRef floatRef = new Ref.FloatRef();
                            fBoxFloat = Boxing.boxFloat(itemOffset);
                            if (((Number) animationStateCopy$default.getVelocity()).floatValue() == 0.0f) {
                                z = true;
                                z2 = true;
                            } else {
                                z = true;
                                z2 = false;
                            }
                            anonymousClass5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
                                public final /* synthetic */ ScrollScope $$this$scroll;
                                public final /* synthetic */ Ref.FloatRef $prevValue;
                                public final /* synthetic */ float $target;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass5(float itemOffset2, Ref.FloatRef floatRef2, ScrollScope scrollScope5) {
                                    super(1);
                                    f = itemOffset2;
                                    floatRef = floatRef2;
                                    scrollScope = scrollScope5;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    invoke2(animationScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke */
                                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                    float f6 = f;
                                    float fCoerceAtLeast = 0.0f;
                                    if (f6 > 0.0f) {
                                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                    } else if (f6 < 0.0f) {
                                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                    }
                                    float f7 = fCoerceAtLeast - floatRef.element;
                                    if (f7 != scrollScope.scrollBy(f7) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                                        animationScope.cancelAnimation();
                                    }
                                    floatRef.element += f7;
                                }
                            };
                            this.L$0 = scrollScope5;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                            if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, z ^ z2, anonymousClass5, this, 2, null) == obj2) {
                                return obj2;
                            }
                            this.$this_animateScrollToItem.snapToItem(scrollScope5, this.$index, this.$scrollOffset);
                            return Unit.INSTANCE;
                        }
                    }
                    int i4 = this.$index > this.$this_animateScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    intRef2.element = 1;
                    f = fMo7874toPx0680j_42;
                    f2 = fMo7874toPx0680j_43;
                    scrollScope2 = scrollScope4;
                    f3 = fMo7874toPx0680j_4;
                    i = i4;
                    intRef = intRef2;
                    if (booleanRef.element) {
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scrollScope5 = (ScrollScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.$this_animateScrollToItem.snapToItem(scrollScope5, this.$index, this.$scrollOffset);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            float f6 = this.F$2;
            float f7 = this.F$1;
            float f8 = this.F$0;
            Ref.IntRef intRef3 = (Ref.IntRef) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) this.L$1;
            ScrollScope scrollScope5 = (ScrollScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                f2 = f6;
                f = f7;
                obj2 = coroutine_suspended;
                f3 = f8;
                scrollScope2 = scrollScope5;
                intRef = intRef3;
                booleanRef = booleanRef2;
                try {
                    try {
                        intRef.element++;
                        if (booleanRef.element && this.$this_animateScrollToItem.getItemCount() > 0) {
                            try {
                                try {
                                    float fCalculateDistanceTo = this.$this_animateScrollToItem.calculateDistanceTo(this.$index, this.$scrollOffset);
                                    if (Math.abs(fCalculateDistanceTo) < f3) {
                                        if (i != 0) {
                                            f4 = f3;
                                            objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                            Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                            animationState = (AnimationState) objectRef.element;
                                            fBoxFloat2 = Boxing.boxFloat(f4);
                                            boolean z5 = ((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f5 ? false : z4;
                                            obj3 = coroutine_suspended;
                                            anonymousClass3 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.3
                                                public final /* synthetic */ ScrollScope $$this$scroll;
                                                public final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
                                                public final /* synthetic */ float $boundDistancePx;
                                                public final /* synthetic */ boolean $forward;
                                                public final /* synthetic */ int $index;
                                                public final /* synthetic */ Ref.BooleanRef $loop;
                                                public final /* synthetic */ Ref.IntRef $loops;
                                                public final /* synthetic */ int $numOfItemsForTeleport;
                                                public final /* synthetic */ Ref.FloatRef $prevValue;
                                                public final /* synthetic */ int $scrollOffset;
                                                public final /* synthetic */ float $target;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass3(int i5, float f42, Ref.FloatRef floatRef22, ScrollScope scrollScope22, Ref.BooleanRef booleanRef3, boolean z6, float f9, Ref.IntRef intRef4, int i6, int i7, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef2) {
                                                    super(1);
                                                    i = i5;
                                                    f = f42;
                                                    floatRef = floatRef22;
                                                    scrollScope = scrollScope22;
                                                    booleanRef = booleanRef3;
                                                    z = z6;
                                                    f = f9;
                                                    intRef = intRef4;
                                                    i = i6;
                                                    i = i7;
                                                    objectRef = objectRef2;
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                                    invoke2(animationScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke */
                                                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                                    float fCoerceAtLeast;
                                                    if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                                                        if (f > 0.0f) {
                                                            fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                                        } else {
                                                            fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                                        }
                                                        float f9 = fCoerceAtLeast - floatRef.element;
                                                        float fScrollBy = scrollScope.scrollBy(f9);
                                                        if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i) && !C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                                                            if (f9 != fScrollBy) {
                                                                animationScope.cancelAnimation();
                                                                booleanRef.element = false;
                                                                return;
                                                            }
                                                            floatRef.element += f9;
                                                            if (z) {
                                                                if (animationScope.getValue().floatValue() > f) {
                                                                    animationScope.cancelAnimation();
                                                                }
                                                            } else if (animationScope.getValue().floatValue() < (-f)) {
                                                                animationScope.cancelAnimation();
                                                            }
                                                            if (z) {
                                                                if (intRef.element >= 2) {
                                                                    int lastVisibleItemIndex = i - lazyLayoutAnimateScrollScope.getLastVisibleItemIndex();
                                                                    int i5 = i;
                                                                    if (lastVisibleItemIndex > i5) {
                                                                        lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i - i5, 0);
                                                                    }
                                                                }
                                                            } else if (intRef.element >= 2) {
                                                                int firstVisibleItemIndex = lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex();
                                                                int i6 = i;
                                                                int i7 = firstVisibleItemIndex - i6;
                                                                int i8 = i;
                                                                if (i7 > i8) {
                                                                    lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i6 + i8, 0);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                                                        lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i, i);
                                                        booleanRef.element = false;
                                                        animationScope.cancelAnimation();
                                                        return;
                                                    }
                                                    if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                                                        throw new ItemFoundInScroll(lazyLayoutAnimateScrollScope.getVisibleItemScrollOffset(i), objectRef.element);
                                                    }
                                                }
                                            };
                                            this.L$0 = scrollScope22;
                                            this.L$1 = booleanRef3;
                                            this.L$2 = objectRef2;
                                            this.L$3 = intRef4;
                                            this.F$0 = f3;
                                            this.F$1 = f9;
                                            this.F$2 = f2;
                                            this.I$0 = i;
                                            this.label = 1;
                                            scrollScope3 = scrollScope22;
                                            Ref.BooleanRef booleanRef3 = booleanRef3;
                                            z3 = z5;
                                            Ref.ObjectRef objectRef2 = objectRef2;
                                            Ref.IntRef intRef4 = intRef4;
                                            float f9 = f3;
                                            float f10 = f9;
                                            obj2 = obj3;
                                            if (SuspendAnimationKt.animateTo$default(animationState, fBoxFloat2, null, z3, anonymousClass3, this, 2, null) != obj2) {
                                                return obj2;
                                            }
                                            booleanRef3 = booleanRef3;
                                            f9 = f10;
                                            objectRef2 = objectRef2;
                                            scrollScope22 = scrollScope3;
                                            intRef4 = intRef4;
                                            f3 = f9;
                                            intRef4.element++;
                                            coroutine_suspended = obj2;
                                            f5 = 0.0f;
                                            z4 = true;
                                            if (booleanRef3.element) {
                                                float fCalculateDistanceTo2 = this.$this_animateScrollToItem.calculateDistanceTo(this.$index, this.$scrollOffset);
                                                if (Math.abs(fCalculateDistanceTo2) < f3) {
                                                    try {
                                                        fMax = Math.max(Math.abs(fCalculateDistanceTo2), f2);
                                                        if (i == 0) {
                                                            fMax = -fMax;
                                                        }
                                                    } catch (ItemFoundInScroll e3) {
                                                        itemFoundInScroll = e3;
                                                        scrollScope5 = scrollScope22;
                                                        obj2 = coroutine_suspended;
                                                        animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                                        float itemOffset2 = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                                                        Ref.FloatRef floatRef22 = new Ref.FloatRef();
                                                        fBoxFloat = Boxing.boxFloat(itemOffset2);
                                                        if (((Number) animationStateCopy$default.getVelocity()).floatValue() == 0.0f) {
                                                        }
                                                        anonymousClass5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
                                                            public final /* synthetic */ ScrollScope $$this$scroll;
                                                            public final /* synthetic */ Ref.FloatRef $prevValue;
                                                            public final /* synthetic */ float $target;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            public AnonymousClass5(float itemOffset22, Ref.FloatRef floatRef222, ScrollScope scrollScope52) {
                                                                super(1);
                                                                f = itemOffset22;
                                                                floatRef = floatRef222;
                                                                scrollScope = scrollScope52;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                                                invoke2(animationScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke */
                                                            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                                                float f62 = f;
                                                                float fCoerceAtLeast = 0.0f;
                                                                if (f62 > 0.0f) {
                                                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                                                } else if (f62 < 0.0f) {
                                                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                                                }
                                                                float f72 = fCoerceAtLeast - floatRef.element;
                                                                if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                                                                    animationScope.cancelAnimation();
                                                                }
                                                                floatRef.element += f72;
                                                            }
                                                        };
                                                        this.L$0 = scrollScope52;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 2;
                                                        if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, z ^ z2, anonymousClass5, this, 2, null) == obj2) {
                                                        }
                                                        this.$this_animateScrollToItem.snapToItem(scrollScope52, this.$index, this.$scrollOffset);
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        } else {
                                            fMax = -f3;
                                        }
                                    }
                                    f42 = fMax;
                                    objectRef2.element = AnimationStateKt.copy$default((AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                    Ref.FloatRef floatRef222 = new Ref.FloatRef();
                                    animationState = (AnimationState) objectRef2.element;
                                    fBoxFloat2 = Boxing.boxFloat(f42);
                                    if (((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() != f5) {
                                    }
                                    anonymousClass3 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.3
                                        public final /* synthetic */ ScrollScope $$this$scroll;
                                        public final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
                                        public final /* synthetic */ float $boundDistancePx;
                                        public final /* synthetic */ boolean $forward;
                                        public final /* synthetic */ int $index;
                                        public final /* synthetic */ Ref.BooleanRef $loop;
                                        public final /* synthetic */ Ref.IntRef $loops;
                                        public final /* synthetic */ int $numOfItemsForTeleport;
                                        public final /* synthetic */ Ref.FloatRef $prevValue;
                                        public final /* synthetic */ int $scrollOffset;
                                        public final /* synthetic */ float $target;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass3(int i5, float f42, Ref.FloatRef floatRef2222, ScrollScope scrollScope22, Ref.BooleanRef booleanRef32, boolean z6, float f92, Ref.IntRef intRef42, int i6, int i7, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef22) {
                                            super(1);
                                            i = i5;
                                            f = f42;
                                            floatRef = floatRef2222;
                                            scrollScope = scrollScope22;
                                            booleanRef = booleanRef32;
                                            z = z6;
                                            f = f92;
                                            intRef = intRef42;
                                            i = i6;
                                            i = i7;
                                            objectRef = objectRef22;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                            invoke2(animationScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke */
                                        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                            float fCoerceAtLeast;
                                            if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                                                if (f > 0.0f) {
                                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                                } else {
                                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                                }
                                                float f92 = fCoerceAtLeast - floatRef.element;
                                                float fScrollBy = scrollScope.scrollBy(f92);
                                                if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i) && !C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                                                    if (f92 != fScrollBy) {
                                                        animationScope.cancelAnimation();
                                                        booleanRef.element = false;
                                                        return;
                                                    }
                                                    floatRef.element += f92;
                                                    if (z) {
                                                        if (animationScope.getValue().floatValue() > f) {
                                                            animationScope.cancelAnimation();
                                                        }
                                                    } else if (animationScope.getValue().floatValue() < (-f)) {
                                                        animationScope.cancelAnimation();
                                                    }
                                                    if (z) {
                                                        if (intRef.element >= 2) {
                                                            int lastVisibleItemIndex = i - lazyLayoutAnimateScrollScope.getLastVisibleItemIndex();
                                                            int i5 = i;
                                                            if (lastVisibleItemIndex > i5) {
                                                                lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i - i5, 0);
                                                            }
                                                        }
                                                    } else if (intRef.element >= 2) {
                                                        int firstVisibleItemIndex = lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex();
                                                        int i6 = i;
                                                        int i7 = firstVisibleItemIndex - i6;
                                                        int i8 = i;
                                                        if (i7 > i8) {
                                                            lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i6 + i8, 0);
                                                        }
                                                    }
                                                }
                                            }
                                            if (C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                                                lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i, i);
                                                booleanRef.element = false;
                                                animationScope.cancelAnimation();
                                                return;
                                            }
                                            if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                                                throw new ItemFoundInScroll(lazyLayoutAnimateScrollScope.getVisibleItemScrollOffset(i), objectRef.element);
                                            }
                                        }
                                    };
                                    this.L$0 = scrollScope22;
                                    this.L$1 = booleanRef32;
                                    this.L$2 = objectRef22;
                                    this.L$3 = intRef42;
                                    this.F$0 = f3;
                                    this.F$1 = f92;
                                    this.F$2 = f2;
                                    this.I$0 = i;
                                    this.label = 1;
                                    obj2 = obj3;
                                    if (SuspendAnimationKt.animateTo$default(animationState, fBoxFloat2, null, z3, anonymousClass3, this, 2, null) != obj2) {
                                    }
                                } catch (ItemFoundInScroll e4) {
                                    e = e4;
                                    obj2 = obj3;
                                    itemFoundInScroll = e;
                                    scrollScope52 = scrollScope3;
                                    animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                    float itemOffset22 = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                                    Ref.FloatRef floatRef2222 = new Ref.FloatRef();
                                    fBoxFloat = Boxing.boxFloat(itemOffset22);
                                    if (((Number) animationStateCopy$default.getVelocity()).floatValue() == 0.0f) {
                                    }
                                    anonymousClass5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
                                        public final /* synthetic */ ScrollScope $$this$scroll;
                                        public final /* synthetic */ Ref.FloatRef $prevValue;
                                        public final /* synthetic */ float $target;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass5(float itemOffset222, Ref.FloatRef floatRef22222, ScrollScope scrollScope52) {
                                            super(1);
                                            f = itemOffset222;
                                            floatRef = floatRef22222;
                                            scrollScope = scrollScope52;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                            invoke2(animationScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke */
                                        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                            float f62 = f;
                                            float fCoerceAtLeast = 0.0f;
                                            if (f62 > 0.0f) {
                                                fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                            } else if (f62 < 0.0f) {
                                                fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                            }
                                            float f72 = fCoerceAtLeast - floatRef.element;
                                            if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                                                animationScope.cancelAnimation();
                                            }
                                            floatRef.element += f72;
                                        }
                                    };
                                    this.L$0 = scrollScope52;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 2;
                                    if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, z ^ z2, anonymousClass5, this, 2, null) == obj2) {
                                    }
                                    this.$this_animateScrollToItem.snapToItem(scrollScope52, this.$index, this.$scrollOffset);
                                    return Unit.INSTANCE;
                                }
                                scrollScope3 = scrollScope22;
                                Ref.BooleanRef booleanRef32 = booleanRef32;
                                z3 = z5;
                                Ref.ObjectRef objectRef22 = objectRef22;
                                Ref.IntRef intRef42 = intRef42;
                                float f92 = f3;
                                float f102 = f92;
                            } catch (ItemFoundInScroll e5) {
                                e = e5;
                                scrollScope3 = scrollScope22;
                            }
                            obj3 = coroutine_suspended;
                        }
                    } catch (ItemFoundInScroll e6) {
                        itemFoundInScroll = e6;
                        scrollScope52 = scrollScope22;
                        animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                        float itemOffset222 = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                        Ref.FloatRef floatRef22222 = new Ref.FloatRef();
                        fBoxFloat = Boxing.boxFloat(itemOffset222);
                        if (((Number) animationStateCopy$default.getVelocity()).floatValue() == 0.0f) {
                        }
                        anonymousClass5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
                            public final /* synthetic */ ScrollScope $$this$scroll;
                            public final /* synthetic */ Ref.FloatRef $prevValue;
                            public final /* synthetic */ float $target;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass5(float itemOffset2222, Ref.FloatRef floatRef222222, ScrollScope scrollScope52) {
                                super(1);
                                f = itemOffset2222;
                                floatRef = floatRef222222;
                                scrollScope = scrollScope52;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                invoke2(animationScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                float f62 = f;
                                float fCoerceAtLeast = 0.0f;
                                if (f62 > 0.0f) {
                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                                } else if (f62 < 0.0f) {
                                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                                }
                                float f72 = fCoerceAtLeast - floatRef.element;
                                if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                                    animationScope.cancelAnimation();
                                }
                                floatRef.element += f72;
                            }
                        };
                        this.L$0 = scrollScope52;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, z ^ z2, anonymousClass5, this, 2, null) == obj2) {
                        }
                        this.$this_animateScrollToItem.snapToItem(scrollScope52, this.$index, this.$scrollOffset);
                        return Unit.INSTANCE;
                    }
                } catch (ItemFoundInScroll e7) {
                    e = e7;
                    scrollScope3 = scrollScope22;
                    obj2 = coroutine_suspended;
                }
                coroutine_suspended = obj2;
                f5 = 0.0f;
                z4 = true;
            } catch (ItemFoundInScroll e8) {
                itemFoundInScroll = e8;
                scrollScope52 = scrollScope5;
                obj2 = coroutine_suspended;
                animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                float itemOffset2222 = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                Ref.FloatRef floatRef222222 = new Ref.FloatRef();
                fBoxFloat = Boxing.boxFloat(itemOffset2222);
                if (((Number) animationStateCopy$default.getVelocity()).floatValue() == 0.0f) {
                }
                anonymousClass5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
                    public final /* synthetic */ ScrollScope $$this$scroll;
                    public final /* synthetic */ Ref.FloatRef $prevValue;
                    public final /* synthetic */ float $target;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass5(float itemOffset22222, Ref.FloatRef floatRef2222222, ScrollScope scrollScope52) {
                        super(1);
                        f = itemOffset22222;
                        floatRef = floatRef2222222;
                        scrollScope = scrollScope52;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                        float f62 = f;
                        float fCoerceAtLeast = 0.0f;
                        if (f62 > 0.0f) {
                            fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                        } else if (f62 < 0.0f) {
                            fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                        }
                        float f72 = fCoerceAtLeast - floatRef.element;
                        if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                            animationScope.cancelAnimation();
                        }
                        floatRef.element += f72;
                    }
                };
                this.L$0 = scrollScope52;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, z ^ z2, anonymousClass5, this, 2, null) == obj2) {
                }
                this.$this_animateScrollToItem.snapToItem(scrollScope52, this.$index, this.$scrollOffset);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        public static final boolean invokeSuspend$isOvershot(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2) {
            if (z) {
                if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                    return false;
                }
            } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
                return false;
            }
            return true;
        }

        /* compiled from: LazyAnimateScroll.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n41#2,4:326\n41#2,4:330\n41#2,4:334\n41#2,4:338\n41#2,4:342\n41#2,4:346\n41#2,4:350\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n195#1:318,4\n201#1:322,4\n204#1:326,4\n212#1:330,4\n217#1:334,4\n228#1:338,4\n240#1:342,4\n253#1:346,4\n264#1:350,4\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            public final /* synthetic */ ScrollScope $$this$scroll;
            public final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
            public final /* synthetic */ float $boundDistancePx;
            public final /* synthetic */ boolean $forward;
            public final /* synthetic */ int $index;
            public final /* synthetic */ Ref.BooleanRef $loop;
            public final /* synthetic */ Ref.IntRef $loops;
            public final /* synthetic */ int $numOfItemsForTeleport;
            public final /* synthetic */ Ref.FloatRef $prevValue;
            public final /* synthetic */ int $scrollOffset;
            public final /* synthetic */ float $target;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(int i5, float f42, Ref.FloatRef floatRef2222, ScrollScope scrollScope22, Ref.BooleanRef booleanRef32, boolean z6, float f92, Ref.IntRef intRef42, int i6, int i7, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef22) {
                super(1);
                i = i5;
                f = f42;
                floatRef = floatRef2222;
                scrollScope = scrollScope22;
                booleanRef = booleanRef32;
                z = z6;
                f = f92;
                intRef = intRef42;
                i = i6;
                i = i7;
                objectRef = objectRef22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                float fCoerceAtLeast;
                if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                    if (f > 0.0f) {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                    } else {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                    }
                    float f92 = fCoerceAtLeast - floatRef.element;
                    float fScrollBy = scrollScope.scrollBy(f92);
                    if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i) && !C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                        if (f92 != fScrollBy) {
                            animationScope.cancelAnimation();
                            booleanRef.element = false;
                            return;
                        }
                        floatRef.element += f92;
                        if (z) {
                            if (animationScope.getValue().floatValue() > f) {
                                animationScope.cancelAnimation();
                            }
                        } else if (animationScope.getValue().floatValue() < (-f)) {
                            animationScope.cancelAnimation();
                        }
                        if (z) {
                            if (intRef.element >= 2) {
                                int lastVisibleItemIndex = i - lazyLayoutAnimateScrollScope.getLastVisibleItemIndex();
                                int i5 = i;
                                if (lastVisibleItemIndex > i5) {
                                    lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i - i5, 0);
                                }
                            }
                        } else if (intRef.element >= 2) {
                            int firstVisibleItemIndex = lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex();
                            int i6 = i;
                            int i7 = firstVisibleItemIndex - i6;
                            int i8 = i;
                            if (i7 > i8) {
                                lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i6 + i8, 0);
                            }
                        }
                    }
                }
                if (C07012.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                    lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i, i);
                    booleanRef.element = false;
                    animationScope.cancelAnimation();
                    return;
                }
                if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                    throw new ItemFoundInScroll(lazyLayoutAnimateScrollScope.getVisibleItemScrollOffset(i), objectRef.element);
                }
            }
        }

        /* compiled from: LazyAnimateScroll.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n295#1:318,4\n300#1:322,4\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass5 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            public final /* synthetic */ ScrollScope $$this$scroll;
            public final /* synthetic */ Ref.FloatRef $prevValue;
            public final /* synthetic */ float $target;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(float itemOffset22222, Ref.FloatRef floatRef2222222, ScrollScope scrollScope52) {
                super(1);
                f = itemOffset22222;
                floatRef = floatRef2222222;
                scrollScope = scrollScope52;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                float f62 = f;
                float fCoerceAtLeast = 0.0f;
                if (f62 > 0.0f) {
                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                } else if (f62 < 0.0f) {
                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                }
                float f72 = fCoerceAtLeast - floatRef.element;
                if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                    animationScope.cancelAnimation();
                }
                floatRef.element += f72;
            }
        }
    }

    @Nullable
    public static final Object animateScrollToItem(@NotNull LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2, int i3, @NotNull Density density, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = lazyLayoutAnimateScrollScope.scroll(new C07012(i, density, lazyLayoutAnimateScrollScope, i2, i3, null), continuation);
        return objScroll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
