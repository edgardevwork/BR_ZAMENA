package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p003ui.MotionDurationScale;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapFlingBehavior.kt */
@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0014\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010*\u001a\u00020\u001dH\u0016JH\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010/\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0002\u00102JP\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010/\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0082@¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0002J(\u00108\u001a\u0002H9\"\u000e\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90:*\b\u0012\u0004\u0012\u0002H90;H\u0082\u0002¢\u0006\u0002\u0010<J(\u0010=\u001a\u0002H9\"\u000e\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90:*\b\u0012\u0004\u0012\u0002H90;H\u0082\u0002¢\u0006\u0002\u0010<J&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010?\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010@J&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010?\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010@J\u001a\u0010B\u001a\u00020\u0006*\u00020.2\u0006\u0010?\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010@J.\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010EJ&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,*\u00020.2\u0006\u0010)\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010@R\u000e\u0010\f\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001d*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m7105d2 = {"Landroidx/compose/material3/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V", "DefaultScrollMotionDurationScaleFactor", "MinFlingVelocityDp", "Landroidx/compose/ui/unit/Dp;", "F", "itemSize", "getItemSize", "()F", "motionScaleDuration", "androidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1", "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;", "velocityThreshold", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "calculateDistanceToDesiredSnapPosition", "layoutInfo", "item", "equals", "", "other", "", "findClosestOffset", "velocity", "hashCode", "animateDecay", "Landroidx/compose/material3/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetOffset", "animationState", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateSnap", "cancelOffset", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "target", "component1", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "fling", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "longSnap", "performFling", "runApproach", "initialTargetOffset", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shortSnap", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @NotNull
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    @NotNull
    private final Density density;

    @NotNull
    private final LazyListState lazyListState;

    @NotNull
    private final AnimationSpec<Float> snapAnimationSpec;
    private final float velocityThreshold;

    @NotNull
    private SnapFlingBehavior$motionScaleDuration$1 motionScaleDuration = new MotionDurationScale() { // from class: androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1
        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }

        @Override // androidx.compose.p003ui.MotionDurationScale
        public float getScaleFactor() {
            return this.this$0.DefaultScrollMotionDurationScaleFactor;
        }
    };
    private final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private final float MinFlingVelocityDp = C2046Dp.m13666constructorimpl(400);

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {0, 0, 0}, m7122l = {261}, m7123m = "animateDecay", m7124n = {"animationState", "previousValue", "targetOffset"}, m7125s = {"L$0", "L$1", "F$0"})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$animateDecay$1 */
    /* loaded from: classes4.dex */
    public static final class C16261 extends ContinuationImpl {
        public float F$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C16261(Continuation<? super C16261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.animateDecay(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {0, 0, 0, 0, 0}, m7122l = {299}, m7123m = "animateSnap", m7124n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m7125s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$animateSnap$1 */
    /* loaded from: classes4.dex */
    public static final class C16281 extends ContinuationImpl {
        public float F$0;
        public float F$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C16281(Continuation<? super C16281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.animateSnap(null, 0.0f, 0.0f, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {}, m7122l = {95}, m7123m = "fling", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$fling$1 */
    /* loaded from: classes4.dex */
    public static final class C16301 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C16301(Continuation<? super C16301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.fling(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {0, 0}, m7122l = {135, Cea708Decoder.COMMAND_DLW}, m7123m = "longSnap", m7124n = {"this", "$this$longSnap"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$longSnap$1 */
    /* loaded from: classes4.dex */
    public static final class C16311 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C16311(Continuation<? super C16311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.longSnap(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {}, m7122l = {83}, m7123m = "performFling", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$performFling$1 */
    /* loaded from: classes4.dex */
    public static final class C16321 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C16321(Continuation<? super C16321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SnapFlingBehavior", m7120f = "SnapFlingBehavior.kt", m7121i = {0}, m7122l = {Cea708Decoder.COMMAND_DF2}, m7123m = "runApproach", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.material3.SnapFlingBehavior$runApproach$1 */
    /* loaded from: classes4.dex */
    public static final class C16331 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C16331(Continuation<? super C16331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.runApproach(null, 0.0f, 0.0f, this);
        }
    }

    private static final boolean findClosestOffset$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1] */
    public SnapFlingBehavior(@NotNull LazyListState lazyListState, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull AnimationSpec<Float> animationSpec, @NotNull Density density) {
        this.lazyListState = lazyListState;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
        this.density = density;
        this.velocityThreshold = density.mo7874toPx0680j_4(this.MinFlingVelocityDp);
    }

    private final List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.lazyListState.getLayoutInfo().getVisibleItemsInfo();
    }

    private final float getItemSize() {
        if (!(!getVisibleItemsInfo().isEmpty())) {
            return 0.0f;
        }
        List<LazyListItemInfo> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += visibleItemsInfo.get(i).getSize();
        }
        return size2 / getVisibleItemsInfo().size();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull Continuation<? super Float> continuation) throws Throwable {
        C16321 c16321;
        if (continuation instanceof C16321) {
            c16321 = (C16321) continuation;
            int i = c16321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16321.label = i - Integer.MIN_VALUE;
            } else {
                c16321 = new C16321(continuation);
            }
        }
        Object objFling = c16321.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFling);
            c16321.label = 1;
            objFling = fling(scrollScope, f, c16321);
            if (objFling == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFling);
        }
        AnimationResult animationResult = (AnimationResult) objFling;
        return Boxing.boxFloat(((Number) animationResult.component1()).floatValue() != 0.0f ? ((Number) animationResult.component2().getVelocity()).floatValue() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C16301 c16301;
        if (continuation instanceof C16301) {
            c16301 = (C16301) continuation;
            int i = c16301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16301.label = i - Integer.MIN_VALUE;
            } else {
                c16301 = new C16301(continuation);
            }
        }
        Object objWithContext = c16301.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            SnapFlingBehavior$motionScaleDuration$1 snapFlingBehavior$motionScaleDuration$1 = this.motionScaleDuration;
            SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(f, this, scrollScope, null);
            c16301.label = 1;
            objWithContext = BuildersKt.withContext(snapFlingBehavior$motionScaleDuration$1, snapFlingBehavior$fling$result$1, c16301);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return (AnimationResult) objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        float fFindClosestOffset = findClosestOffset(0.0f, this.lazyListState);
        return animateSnap(scrollScope, fFindClosestOffset, fFindClosestOffset, AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), this.snapAnimationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object longSnap(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C16311 c16311;
        SnapFlingBehavior snapFlingBehavior;
        ScrollScope scrollScope2 = scrollScope;
        if (continuation instanceof C16311) {
            c16311 = (C16311) continuation;
            int i = c16311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16311.label = i - Integer.MIN_VALUE;
            } else {
                c16311 = new C16311(continuation);
            }
        }
        C16311 c163112 = c16311;
        Object objRunApproach = c163112.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c163112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRunApproach);
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f)) - getItemSize(), 0.0f);
            if (fCoerceAtLeast != 0.0f) {
                fCoerceAtLeast *= Math.signum(f);
            }
            c163112.L$0 = this;
            c163112.L$1 = scrollScope2;
            c163112.label = 1;
            objRunApproach = runApproach(scrollScope2, fCoerceAtLeast, f, c163112);
            if (objRunApproach == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objRunApproach);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollScope2 = (ScrollScope) c163112.L$1;
            SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) c163112.L$0;
            ResultKt.throwOnFailure(objRunApproach);
            snapFlingBehavior = snapFlingBehavior2;
        }
        AnimationResult animationResult = (AnimationResult) objRunApproach;
        float fFloatValue = ((Number) animationResult.component1()).floatValue();
        AnimationState<Float, AnimationVector1D> animationStateCopy$default = AnimationStateKt.copy$default(animationResult.component2(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec<Float> animationSpec = snapFlingBehavior.snapAnimationSpec;
        c163112.L$0 = null;
        c163112.L$1 = null;
        c163112.label = 2;
        objRunApproach = snapFlingBehavior.animateSnap(scrollScope2, fFloatValue, fFloatValue, animationStateCopy$default, animationSpec, c163112);
        return objRunApproach == coroutine_suspended ? coroutine_suspended : objRunApproach;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C16331 c16331;
        SnapFlingBehavior snapFlingBehavior;
        if (continuation instanceof C16331) {
            c16331 = (C16331) continuation;
            int i = c16331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16331.label = i - Integer.MIN_VALUE;
            } else {
                c16331 = new C16331(continuation);
            }
        }
        C16331 c163312 = c16331;
        Object objAnimateDecay = c163312.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c163312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAnimateDecay);
            AnimationState<Float, AnimationVector1D> animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null);
            DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
            c163312.L$0 = this;
            c163312.label = 1;
            objAnimateDecay = animateDecay(scrollScope, f, animationStateAnimationState$default, decayAnimationSpec, c163312);
            if (objAnimateDecay == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snapFlingBehavior = (SnapFlingBehavior) c163312.L$0;
            ResultKt.throwOnFailure(objAnimateDecay);
        }
        AnimationState animationStateComponent2 = ((AnimationResult) objAnimateDecay).component2();
        return new AnimationResult(Boxing.boxFloat(snapFlingBehavior.findClosestOffset(((Number) animationStateComponent2.getVelocity()).floatValue(), snapFlingBehavior.lazyListState)), animationStateComponent2);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
        return Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.lazyListState, this.lazyListState) && Intrinsics.areEqual(snapFlingBehavior.density, this.density);
    }

    public int hashCode() {
        return (((((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.lazyListState.hashCode()) * 31) + this.density.hashCode();
    }

    private final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getStart();
    }

    private final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getEndInclusive();
    }

    private static final ClosedFloatingPointRange<Float> findClosestOffset$calculateSnappingOffsetBounds(LazyListState lazyListState, SnapFlingBehavior snapFlingBehavior) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float fCalculateDistanceToDesiredSnapPosition = snapFlingBehavior.calculateDistanceToDesiredSnapPosition(layoutInfo, visibleItemsInfo.get(i));
            if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f) {
                f = fCalculateDistanceToDesiredSnapPosition;
            }
            if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f2) {
                f2 = fCalculateDistanceToDesiredSnapPosition;
            }
        }
        return RangesKt__RangesKt.rangeTo(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float findClosestOffset(float velocity, LazyListState lazyListState) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds = findClosestOffset$calculateSnappingOffsetBounds(lazyListState, this);
        float fFloatValue = ((Number) component1(closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds)).floatValue();
        float fFloatValue2 = ((Number) component2(closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds)).floatValue();
        float fSignum = Math.signum(velocity);
        if (fSignum == 0.0f) {
            if (Math.abs(fFloatValue2) <= Math.abs(fFloatValue)) {
                fFloatValue = fFloatValue2;
            }
        } else if (fSignum != 1.0f) {
            if (fSignum != -1.0f) {
                fFloatValue = 0.0f;
            }
        }
        if (findClosestOffset$isValidDistance(fFloatValue)) {
            return fFloatValue;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateDecay(final ScrollScope scrollScope, final float f, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C16261 c16261;
        Ref.FloatRef floatRef;
        if (continuation instanceof C16261) {
            c16261 = (C16261) continuation;
            int i = c16261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16261.label = i - Integer.MIN_VALUE;
            } else {
                c16261 = new C16261(continuation);
            }
        }
        Object obj = c16261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SnapFlingBehavior.animateDecay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(f)) {
                        SnapFlingBehavior.animateDecay$consumeDelta(animationScope, scrollScope, this.coerceToTarget(animationScope.getValue().floatValue(), f) - floatRef2.element);
                        animationScope.cancelAnimation();
                    } else {
                        SnapFlingBehavior.animateDecay$consumeDelta(animationScope, scrollScope, animationScope.getValue().floatValue() - floatRef2.element);
                        floatRef2.element = animationScope.getValue().floatValue();
                    }
                }
            };
            c16261.L$0 = animationState;
            c16261.L$1 = floatRef2;
            c16261.F$0 = f;
            c16261.label = 1;
            if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, function1, c16261) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c16261.F$0;
            floatRef = (Ref.FloatRef) c16261.L$1;
            animationState = (AnimationState) c16261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new AnimationResult(Boxing.boxFloat(f - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, float f) {
        if (Math.abs(f - scrollScope.scrollBy(f)) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateSnap(final ScrollScope scrollScope, float f, final float f2, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C16281 c16281;
        float f3;
        SnapFlingBehavior snapFlingBehavior;
        Ref.FloatRef floatRef;
        float f4;
        AnimationState<Float, AnimationVector1D> animationState2;
        if (continuation instanceof C16281) {
            c16281 = (C16281) continuation;
            int i = c16281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16281.label = i - Integer.MIN_VALUE;
            } else {
                c16281 = new C16281(continuation);
            }
        }
        C16281 c162812 = c16281;
        Object obj = c162812.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c162812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.getVelocity().floatValue();
            Float fBoxFloat = Boxing.boxFloat(f);
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SnapFlingBehavior.animateSnap.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    float fCoerceToTarget = SnapFlingBehavior.this.coerceToTarget(animationScope.getValue().floatValue(), f2);
                    float f5 = fCoerceToTarget - floatRef2.element;
                    float fScrollBy = scrollScope.scrollBy(f5);
                    if (Math.abs(f5 - fScrollBy) > 0.5f || fCoerceToTarget != animationScope.getValue().floatValue()) {
                        animationScope.cancelAnimation();
                    }
                    floatRef2.element += fScrollBy;
                }
            };
            c162812.L$0 = this;
            c162812.L$1 = animationState;
            c162812.L$2 = floatRef2;
            f3 = f;
            c162812.F$0 = f3;
            c162812.F$1 = fFloatValue;
            c162812.label = 1;
            if (SuspendAnimationKt.animateTo(animationState, fBoxFloat, animationSpec, !z, function1, c162812) == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
            floatRef = floatRef2;
            f4 = fFloatValue;
            animationState2 = animationState;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = c162812.F$1;
            float f5 = c162812.F$0;
            floatRef = (Ref.FloatRef) c162812.L$2;
            AnimationState<Float, AnimationVector1D> animationState3 = (AnimationState) c162812.L$1;
            snapFlingBehavior = (SnapFlingBehavior) c162812.L$0;
            ResultKt.throwOnFailure(obj);
            f3 = f5;
            animationState2 = animationState3;
        }
        return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, snapFlingBehavior.coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt___RangesKt.coerceAtMost(f, f2) : RangesKt___RangesKt.coerceAtLeast(f, f2);
    }

    private final float calculateDistanceToDesiredSnapPosition(LazyListLayoutInfo layoutInfo, LazyListItemInfo item) {
        float f = 2;
        return item.getOffset() - ((((getSingleAxisViewportSize(layoutInfo) - layoutInfo.getBeforeContentPadding()) - layoutInfo.getAfterContentPadding()) / f) - (item.getSize() / f));
    }

    private final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m13835getHeightimpl(lazyListLayoutInfo.mo8230getViewportSizeYbymL2g()) : IntSize.m13836getWidthimpl(lazyListLayoutInfo.mo8230getViewportSizeYbymL2g());
    }
}
