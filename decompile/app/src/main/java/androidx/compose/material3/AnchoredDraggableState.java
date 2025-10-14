package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnchoredDraggable.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001iB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0013Bq\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0014Jy\u0010L\u001a\u00020M2\u0006\u0010G\u001a\u00028\u00002\b\b\u0002\u0010N\u001a\u00020O2W\u0010P\u001aS\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(G\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020Q¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010TJ\\\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2B\u0010P\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020U¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010VJ%\u0010W\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010X\u001a\u00020\bH\u0002¢\u0006\u0002\u0010YJ\u001d\u0010Z\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010[J\u000e\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bJ\u0015\u0010^\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0000¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020\bJ\u0016\u0010a\u001a\u00020M2\u0006\u0010X\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010bJ\u0015\u0010c\u001a\u00020\u00122\u0006\u0010G\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010dJ#\u0010e\u001a\u00020M2\f\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010g\u001a\u00028\u0000¢\u0006\u0002\u0010hR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R/\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010.\u001a\u0004\u0018\u00018\u00002\b\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010*R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00107R+\u00108\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010?\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R/\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u001b\u0010D\u001a\u00020\b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bE\u0010:R\u001b\u0010G\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010$\u001a\u0004\bH\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006j"}, m7105d2 = {"Landroidx/compose/material3/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "anchors", "Landroidx/compose/material3/DraggableAnchors;", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/material3/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchoredDragScope", "Landroidx/compose/material3/AnchoredDragScope;", "<set-?>", "getAnchors", "()Landroidx/compose/material3/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material3/DraggableAnchors;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "closestValue", "getClosestValue$material3_release", "()Ljava/lang/Object;", "closestValue$delegate", "Landroidx/compose/runtime/State;", "getConfirmValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "dragMutex", "Landroidx/compose/material3/InternalMutatorMutex;", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "Landroidx/compose/runtime/MutableFloatState;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "setOffset", "offset$delegate", "getPositionalThreshold$material3_release", "progress", "getProgress", "progress$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold$material3_release", "()Lkotlin/jvm/functions/Function0;", "anchoredDrag", "", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function4;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "velocity", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "newOffsetForDelta", "newOffsetForDelta$material3_release", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "(Ljava/lang/Object;)Z", "updateAnchors", "newAnchors", "newTarget", "(Landroidx/compose/material3/DraggableAnchors;Ljava/lang/Object;)V", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,791:1\n81#2:792\n107#2,2:793\n81#2:795\n81#2:796\n81#2:800\n81#2:804\n107#2,2:805\n81#2:807\n107#2,2:808\n76#3:797\n109#3,2:798\n76#3:801\n109#3,2:802\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState\n*L\n294#1:792\n294#1:793,2\n302#1:795\n316#1:796\n361#1:800\n381#1:804\n381#1:805,2\n383#1:807\n383#1:808,2\n333#1:797\n333#1:798,2\n378#1:801\n378#1:802,2\n*E\n"})
/* loaded from: classes3.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnchoredDragScope anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State closestValue;

    @NotNull
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;

    @NotNull
    private final InternalMutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragTarget;

    @NotNull
    private final DraggableState draggableState;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String;

    @NotNull
    private final Function1<Float, Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State progress;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetValue;

    @NotNull
    private final Function0<Float> velocityThreshold;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState", m7120f = "AnchoredDraggable.kt", m7121i = {0}, m7122l = {529}, m7123m = "anchoredDrag", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1 */
    /* loaded from: classes.dex */
    public static final class C12911 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12911(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C12911> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState", m7120f = "AnchoredDraggable.kt", m7121i = {0}, m7122l = {575}, m7123m = "anchoredDrag", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3 */
    /* loaded from: classes.dex */
    public static final class C12933 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12933(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C12933> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$targetValue$2
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                T t2 = (T) this.this$0.getDragTarget();
                if (t2 != null) {
                    return t2;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (!Float.isNaN(offset)) {
                    return (T) anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
                }
                return anchoredDraggableState.getCurrentValue();
            }
        });
        this.closestValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$closestValue$2
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                T t2 = (T) this.this$0.getDragTarget();
                if (t2 != null) {
                    return t2;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (!Float.isNaN(offset)) {
                    return (T) anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
                }
                return anchoredDraggableState.getCurrentValue();
            }
        });
        this.androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Float>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$progress$2
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material3_release()) - fPositionOf;
                float fAbs = Math.abs(fPositionOf2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                    if (fRequireOffset < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fRequireOffset <= 0.999999f) {
                        f = fRequireOffset;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.lastVelocity = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                this.this$0.setOffset(newOffset);
                this.this$0.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    @NotNull
    public final Function1<Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    @NotNull
    public final Function0<Float> getVelocityThreshold$material3_release() {
        return this.velocityThreshold;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$1 */
    /* loaded from: classes.dex */
    public static final class C12891 extends Lambda implements Function1<T, Boolean> {
        public static final C12891 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C12891) obj);
        }
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, (i & 16) != 0 ? C12891.INSTANCE : function12);
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$2 */
    /* loaded from: classes.dex */
    public static final class C12902 extends Lambda implements Function1<T, Boolean> {
        public static final C12902 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C12902) obj);
        }
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i & 32) != 0 ? C12902.INSTANCE : function12);
    }

    @ExperimentalMaterial3Api
    public AnchoredDraggableState(T t, @NotNull DraggableAnchors<T> draggableAnchors, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> function12) {
        this(t, function1, function0, animationSpec, function12);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    @NotNull
    /* renamed from: getDraggableState$material3_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue.getValue();
    }

    public final void setOffset(float f) {
        this.androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String.setFloatValue(f);
    }

    public final float getOffset() {
        return this.androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String.getFloatValue();
    }

    public final float requireOffset() {
        if (!(!Float.isNaN(getOffset()))) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    public final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    public final void setDragTarget(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    @NotNull
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(@NotNull DraggableAnchors<T> newAnchors, T newTarget) {
        if (Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    @Nullable
    public final Object settle(float f, @NotNull Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f, continuation);
            return objAnimateTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return objAnimateTo2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    public final T computeTarget(float f, T currentValue, float velocity) {
        T tClosestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf == f || Float.isNaN(fPositionOf)) {
            return currentValue;
        }
        if (fPositionOf < f) {
            if (velocity >= fFloatValue) {
                T tClosestAnchor2 = anchors.closestAnchor(f, true);
                Intrinsics.checkNotNull(tClosestAnchor2);
                return tClosestAnchor2;
            }
            tClosestAnchor = anchors.closestAnchor(f, true);
            Intrinsics.checkNotNull(tClosestAnchor);
            if (f < Math.abs(fPositionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor) - fPositionOf))).floatValue()))) {
                return currentValue;
            }
        } else {
            if (velocity <= (-fFloatValue)) {
                T tClosestAnchor3 = anchors.closestAnchor(f, false);
                Intrinsics.checkNotNull(tClosestAnchor3);
                return tClosestAnchor3;
            }
            tClosestAnchor = anchors.closestAnchor(f, false);
            Intrinsics.checkNotNull(tClosestAnchor);
            float fAbs = Math.abs(fPositionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor)))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < fAbs) {
                    return currentValue;
                }
            } else if (f > fAbs) {
                return currentValue;
            }
        }
        return tClosestAnchor;
    }

    public final T computeTargetWithoutThresholds(float f, T currentValue) {
        T tClosestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        if (fPositionOf == f || Float.isNaN(fPositionOf)) {
            return currentValue;
        }
        if (fPositionOf < f) {
            tClosestAnchor = anchors.closestAnchor(f, true);
            if (tClosestAnchor == null) {
                return currentValue;
            }
        } else {
            tClosestAnchor = anchors.closestAnchor(f, false);
            if (tClosestAnchor == null) {
                return currentValue;
            }
        }
        return tClosestAnchor;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority, @NotNull Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C12911 c12911;
        AnchoredDraggableState<T> anchoredDraggableState;
        T tClosestAnchor;
        T tClosestAnchor2;
        if (continuation instanceof C12911) {
            c12911 = (C12911) continuation;
            int i = c12911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12911.label = i - Integer.MIN_VALUE;
            } else {
                c12911 = new C12911(this, continuation);
            }
        }
        Object obj = c12911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12911.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) c12911.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor2 != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor != null) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            InternalMutatorMutex internalMutatorMutex = this.dragMutex;
            C12922 c12922 = new C12922(this, function3, null);
            c12911.L$0 = this;
            c12911.label = 1;
            if (internalMutatorMutex.mutate(mutatePriority, c12922, c12911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            anchoredDraggableState = this;
            tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
            if (tClosestAnchor2 != null) {
                anchoredDraggableState.setCurrentValue(tClosestAnchor2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            anchoredDraggableState = this;
            tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
            if (tClosestAnchor != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                anchoredDraggableState.setCurrentValue(tClosestAnchor);
            }
            throw th;
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2", m7120f = "AnchoredDraggable.kt", m7121i = {}, m7122l = {530}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2 */
    /* loaded from: classes.dex */
    public static final class C12922 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        public int label;
        public final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12922(AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C12922> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C12922(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C12922) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/material3/DraggableAnchors;", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<DraggableAnchors<T>> {
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                super(0);
                anchoredDraggableState = anchoredDraggableState;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DraggableAnchors<T> invoke() {
                return anchoredDraggableState.getAnchors();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "latestAnchors", "Landroidx/compose/material3/DraggableAnchors;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2", m7120f = "AnchoredDraggable.kt", m7121i = {}, m7122l = {531}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull DraggableAnchors<T> draggableAnchors, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(draggableAnchors, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> function3 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDragScope, draggableAnchors, this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new Function0<DraggableAnchors<T>>() { // from class: androidx.compose.material3.AnchoredDraggableState.anchoredDrag.2.1
                    public final /* synthetic */ AnchoredDraggableState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                        super(0);
                        anchoredDraggableState = anchoredDraggableState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, @NotNull MutatePriority mutatePriority, @NotNull Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C12933 c12933;
        AnchoredDraggableState<T> anchoredDraggableState;
        T tClosestAnchor;
        T tClosestAnchor2;
        if (continuation instanceof C12933) {
            c12933 = (C12933) continuation;
            int i = c12933.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12933.label = i - Integer.MIN_VALUE;
            } else {
                c12933 = new C12933(this, continuation);
            }
        }
        Object obj = c12933.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12933.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (getAnchors().hasAnchorFor(t)) {
                try {
                    InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                    C12944 c12944 = new C12944(this, t, function4, null);
                    c12933.L$0 = this;
                    c12933.label = 1;
                    if (internalMutatorMutex.mutate(mutatePriority, c12944, c12933) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anchoredDraggableState = this;
                    anchoredDraggableState.setDragTarget(null);
                    tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                    if (tClosestAnchor2 != null) {
                        anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                    }
                } catch (Throwable th) {
                    th = th;
                    anchoredDraggableState = this;
                    anchoredDraggableState.setDragTarget(null);
                    tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                    if (tClosestAnchor != null) {
                        anchoredDraggableState.setCurrentValue(tClosestAnchor);
                    }
                    throw th;
                }
            } else {
                setCurrentValue(t);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) c12933.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                anchoredDraggableState.setDragTarget(null);
                tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor2 != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                }
            } catch (Throwable th2) {
                th = th2;
                anchoredDraggableState.setDragTarget(null);
                tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor);
                }
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4", m7120f = "AnchoredDraggable.kt", m7121i = {}, m7122l = {577}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4 */
    /* loaded from: classes.dex */
    public static final class C12944 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        public final /* synthetic */ T $targetValue;
        public int label;
        public final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12944(AnchoredDraggableState<T> anchoredDraggableState, T t, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super C12944> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t;
            this.$block = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C12944(this.this$0, this.$targetValue, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C12944) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setDragTarget(this.$targetValue);
                AnonymousClass1 anonymousClass1 = new Function0<Pair<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.material3.AnchoredDraggableState.anchoredDrag.4.1
                    public final /* synthetic */ AnchoredDraggableState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                        super(0);
                        anchoredDraggableState = anchoredDraggableState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Pair<DraggableAnchors<T>, T> invoke() {
                        return TuplesKt.m7112to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/compose/material3/DraggableAnchors;", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Pair<? extends DraggableAnchors<T>, ? extends T>> {
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                super(0);
                anchoredDraggableState = anchoredDraggableState;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Pair<DraggableAnchors<T>, T> invoke() {
                return TuplesKt.m7112to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/material3/DraggableAnchors;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2", m7120f = "AnchoredDraggable.kt", m7121i = {}, m7122l = {580}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends DraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function4;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Pair<? extends DraggableAnchors<T>, ? extends T> pair, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) pair.component1();
                    Object objComponent2 = pair.component2();
                    Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> function4 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function4.invoke(anchoredDragScope, draggableAnchors, objComponent2, this) == coroutine_suspended) {
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
        }
    }

    public final float newOffsetForDelta$material3_release(float delta) {
        return RangesKt___RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float fNewOffsetForDelta$material3_release = newOffsetForDelta$material3_release(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material3_release);
        return fNewOffsetForDelta$material3_release - offset;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$trySnapTo$1 */
    /* loaded from: classes.dex */
    public static final class C12951 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ T $targetValue;
        public final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12951(AnchoredDraggableState<T> anchoredDraggableState, T t) {
            super(0);
            this.this$0 = anchoredDraggableState;
            t = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            T t = t;
            float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                anchoredDraggableState.setDragTarget(null);
            }
            anchoredDraggableState.setCurrentValue(t);
        }
    }

    private final boolean trySnapTo(T targetValue) {
        return this.dragMutex.tryMutate(new Function0<Unit>(this) { // from class: androidx.compose.material3.AnchoredDraggableState.trySnapTo.1
            public final /* synthetic */ T $targetValue;
            public final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12951(AnchoredDraggableState<T> this, T targetValue2) {
                super(0);
                this.this$0 = this;
                t = targetValue2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t = t;
                float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t);
            }
        });
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jw\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0007¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/material3/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @ExperimentalMaterial3Api
        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super T, Boolean> confirmValueChange, @NotNull final Function1<? super Float, Float> positionalThreshold, @NotNull final Function0<Float> velocityThreshold) {
            return SaverKt.Saver(new Function2<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.material3.AnchoredDraggableState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final T invoke(@NotNull SaverScope saverScope, @NotNull AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new Function1<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.material3.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2<T>) obj);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final AnchoredDraggableState<T> invoke(@NotNull T t) {
                    return new AnchoredDraggableState<>(t, positionalThreshold, velocityThreshold, animationSpec, confirmValueChange);
                }
            });
        }
    }
}
