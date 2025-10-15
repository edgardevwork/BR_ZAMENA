package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.util.VelocityTracker;
import androidx.compose.p003ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata(m7104d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0002\u0010\t\u001aR\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b*\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017\u001aY\u0010\u0018\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aÉ\u0001\u0010\"\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010\u0011\u001a\u00020\u00102>\b\u0002\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22>\b\u0002\u00103\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22\b\b\u0002\u0010\u001e\u001a\u00020\u0010¢\u0006\u0002\u00105\u001aG\u00106\u001a\u00020\u0010*\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u00107\u001a\u0002082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020\r2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020?2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, m7105d2 = {"NoOpDragScope", "Landroidx/compose/foundation/gestures/DragScope;", "DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "hasDragged", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,680:1\n25#2:681\n1116#3,6:682\n659#4,10:688\n669#4,4:707\n673#4,38:718\n579#4,6:756\n613#4,4:762\n617#4,2:775\n619#4,8:784\n586#4,10:792\n116#5,2:698\n33#5,6:700\n118#5:706\n33#5,6:711\n118#5:717\n116#5,2:766\n33#5,6:768\n118#5:774\n33#5,6:777\n118#5:783\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n144#1:681\n144#1:682,6\n593#1:688,10\n593#1:707,4\n593#1:718,38\n640#1:756,6\n640#1:762,4\n640#1:775,2\n640#1:784,8\n640#1:792,10\n593#1:698,2\n593#1:700,6\n593#1:706\n593#1:711,6\n593#1:717\n640#1:766,2\n640#1:768,6\n640#1:774\n640#1:777,6\n640#1:783\n*E\n"})
/* loaded from: classes2.dex */
public final class DraggableKt {

    @NotNull
    private static final DragScope NoOpDragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DraggableKt$NoOpDragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float pixels) {
        }
    };

    /* compiled from: Draggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DraggableKt", m7120f = "Draggable.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, m7122l = {575, 584, 689, 731}, m7123m = "awaitDownAndSlop", m7124n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "pointerDirectionConfig", "$this$awaitDownAndSlop", "velocityTracker", "pointerDirectionConfig", "pointerDirectionConfig", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "pointerDirectionConfig", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 */
    public static final class C04691 extends ContinuationImpl {
        public float F$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C04691(Continuation<? super C04691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        }
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", m7120f = "Draggable.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1 */
    /* loaded from: classes3.dex */
    public static final class C04701 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        public int label;

        public C04701(Continuation<? super C04701> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            return m7932invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* renamed from: invoke-d-4ec7I */
        public final Object m7932invoked4ec7I(@NotNull CoroutineScope coroutineScope, long j, @Nullable Continuation<? super Unit> continuation) {
            return new C04701(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", m7120f = "Draggable.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2 */
    /* loaded from: classes3.dex */
    public static final class C04712 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        public int label;

        public C04712(Continuation<? super C04712> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
            return new C04712(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState draggableState, @NotNull Orientation orientation, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, boolean z2, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, C04723.INSTANCE, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            public final /* synthetic */ boolean $startDragImmediately;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04734(boolean z22) {
                super(0);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(z);
            }
        }, function3, new C04745(function32, orientation, null), z3));
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$4 */
    public static final class C04734 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean $startDragImmediately;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04734(boolean z22) {
            super(0);
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", "Landroidx/compose/ui/unit/Velocity;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", m7120f = "Draggable.kt", m7121i = {}, m7122l = {203}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$5 */
    /* loaded from: classes3.dex */
    public static final class C04745 extends SuspendLambda implements Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> $onDragStopped;
        public final /* synthetic */ Orientation $orientation;
        public /* synthetic */ long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04745(Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function3, Orientation orientation, Continuation<? super C04745> continuation) {
            super(3, continuation);
            this.$onDragStopped = function3;
            this.$orientation = orientation;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation<? super Unit> continuation) {
            return m7933invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
        }

        @Nullable
        /* renamed from: invoke-LuvzFrg */
        public final Object m7933invokeLuvzFrg(@NotNull CoroutineScope coroutineScope, long j, @Nullable Continuation<? super Unit> continuation) {
            C04745 c04745 = new C04745(this.$onDragStopped, this.$orientation, continuation);
            c04745.L$0 = coroutineScope;
            c04745.J$0 = j;
            return c04745.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                long j = this.J$0;
                Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> function3 = this.$onDragStopped;
                Float fBoxFloat = Boxing.boxFloat(DraggableKt.m7930toFloatsFctU(j, this.$orientation));
                this.label = 1;
                if (function3.invoke(coroutineScope, fBoxFloat, this) == coroutine_suspended) {
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

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$3 */
    public static final class C04723 extends Lambda implements Function1<PointerInputChange, Boolean> {
        public static final C04723 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x01fc -> B:132:0x0172). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0245 -> B:168:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x027e -> B:172:0x0252). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, Function1<? super PointerInputChange, Boolean> function1, Function0<Boolean> function0, VelocityTracker velocityTracker, PointerDirectionConfig pointerDirectionConfig, Continuation<? super Pair<PointerInputChange, Offset>> continuation) throws Throwable {
        C04691 c04691;
        Function0<Boolean> function02;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerDirectionConfig pointerDirectionConfig2;
        Function1<? super PointerInputChange, Boolean> function12;
        final VelocityTracker velocityTracker2;
        AwaitPointerEventScope awaitPointerEventScope3;
        final Ref.LongRef longRef;
        Function2<PointerInputChange, Offset, Unit> function2;
        long id;
        float fM7912pointerSlopE8SPZFQ;
        Ref.LongRef longRef2;
        long jM11115getZeroF1C5BW0;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef3;
        long j;
        Ref.LongRef longRef4;
        C04691 c046912;
        float f;
        int size;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof C04691) {
            c04691 = (C04691) continuation;
            int i2 = c04691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c04691.label = i2 - Integer.MIN_VALUE;
            } else {
                c04691 = new C04691(continuation);
            }
        }
        Object objAwaitFirstDown = c04691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c04691.label;
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        PointerEventPass pointerEventPass = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitFirstDown);
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            c04691.L$0 = awaitPointerEventScope;
            c04691.L$1 = function1;
            function02 = function0;
            c04691.L$2 = function02;
            c04691.L$3 = velocityTracker;
            c04691.L$4 = pointerDirectionConfig;
            c04691.label = 1;
            objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass2, c04691);
            if (objAwaitFirstDown == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerDirectionConfig2 = pointerDirectionConfig;
            function12 = function1;
            velocityTracker2 = velocityTracker;
        } else if (i3 == 1) {
            pointerDirectionConfig2 = (PointerDirectionConfig) c04691.L$4;
            velocityTracker2 = (VelocityTracker) c04691.L$3;
            function02 = (Function0) c04691.L$2;
            function12 = (Function1) c04691.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) c04691.L$0;
            ResultKt.throwOnFailure(objAwaitFirstDown);
        } else if (i3 == 2) {
            pointerDirectionConfig2 = (PointerDirectionConfig) c04691.L$2;
            velocityTracker2 = (VelocityTracker) c04691.L$1;
            awaitPointerEventScope3 = (AwaitPointerEventScope) c04691.L$0;
            ResultKt.throwOnFailure(objAwaitFirstDown);
            PointerInputChange pointerInputChange4 = (PointerInputChange) objAwaitFirstDown;
            VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange4);
            longRef = new Ref.LongRef();
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m11115getZeroF1C5BW0();
            function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5, Offset offset) {
                    m7931invokeUv8p0NA(pointerInputChange5, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m7931invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange5, long j2) {
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange5);
                    pointerInputChange5.consume();
                    longRef.element = j2;
                }
            };
            id = pointerInputChange4.getId();
            int type = pointerInputChange4.getType();
            if (DragGestureDetectorKt.m7911isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
                fM7912pointerSlopE8SPZFQ = DragGestureDetectorKt.m7912pointerSlopE8SPZFQ(awaitPointerEventScope3.getViewConfiguration(), type);
                longRef2 = new Ref.LongRef();
                longRef2.element = id;
                jM11115getZeroF1C5BW0 = companion.m11115getZeroF1C5BW0();
                c04691.L$0 = pointerDirectionConfig2;
                c04691.L$1 = longRef;
                c04691.L$2 = function2;
                c04691.L$3 = awaitPointerEventScope3;
                c04691.L$4 = longRef2;
                c04691.L$5 = pointerEventPass;
                c04691.F$0 = fM7912pointerSlopE8SPZFQ;
                c04691.J$0 = jM11115getZeroF1C5BW0;
                c04691.label = i4;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, c04691, i6, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                }
            } else {
                pointerInputChange = null;
                if (pointerInputChange == null) {
                }
            }
        } else if (i3 == 3) {
            long j2 = c04691.J$0;
            float f2 = c04691.F$0;
            longRef4 = (Ref.LongRef) c04691.L$4;
            AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) c04691.L$3;
            function2 = (Function2) c04691.L$2;
            longRef3 = (Ref.LongRef) c04691.L$1;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) c04691.L$0;
            ResultKt.throwOnFailure(objAwaitFirstDown);
            C04691 c046913 = c04691;
            f = f2;
            pointerDirectionConfig2 = pointerDirectionConfig3;
            j = j2;
            awaitPointerEventScope3 = awaitPointerEventScope5;
            c046912 = c046913;
            PointerEvent pointerEvent = (PointerEvent) objAwaitFirstDown;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            while (true) {
                if (i5 < size) {
                }
                i5++;
                size = i;
                awaitPointerEventScope3 = awaitPointerEventScope4;
            }
            pointerInputChange = pointerInputChange2;
            if (pointerInputChange == null) {
                longRef = longRef3;
                pointerInputChange = null;
            } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            }
            if (pointerInputChange == null) {
            }
        } else {
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = c04691.J$0;
            float f3 = c04691.F$0;
            PointerInputChange pointerInputChange5 = (PointerInputChange) c04691.L$5;
            longRef4 = (Ref.LongRef) c04691.L$4;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) c04691.L$3;
            Function2<PointerInputChange, Offset, Unit> function22 = (Function2) c04691.L$2;
            Ref.LongRef longRef5 = (Ref.LongRef) c04691.L$1;
            PointerDirectionConfig pointerDirectionConfig4 = (PointerDirectionConfig) c04691.L$0;
            ResultKt.throwOnFailure(objAwaitFirstDown);
            fM7912pointerSlopE8SPZFQ = f3;
            pointerDirectionConfig2 = pointerDirectionConfig4;
            long jM11104plusMKHz9U = j3;
            awaitPointerEventScope3 = awaitPointerEventScope6;
            function2 = function22;
            longRef3 = longRef5;
            if (!pointerInputChange5.isConsumed()) {
                longRef2 = longRef4;
                longRef = longRef3;
                i4 = 3;
                pointerEventPass = null;
                jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                i5 = 0;
                i6 = 1;
                c04691.L$0 = pointerDirectionConfig2;
                c04691.L$1 = longRef;
                c04691.L$2 = function2;
                c04691.L$3 = awaitPointerEventScope3;
                c04691.L$4 = longRef2;
                c04691.L$5 = pointerEventPass;
                c04691.F$0 = fM7912pointerSlopE8SPZFQ;
                c04691.J$0 = jM11115getZeroF1C5BW0;
                c04691.label = i4;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, c04691, i6, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jM11115getZeroF1C5BW0;
                longRef3 = longRef;
                longRef4 = longRef2;
                c046912 = c04691;
                f = fM7912pointerSlopE8SPZFQ;
                objAwaitFirstDown = objAwaitPointerEvent$default;
                PointerEvent pointerEvent2 = (PointerEvent) objAwaitFirstDown;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                while (true) {
                    if (i5 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i5);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    i = size;
                    if (PointerId.m12466equalsimpl0(pointerInputChange2.getId(), longRef4.element)) {
                        break;
                    }
                    i5++;
                    size = i;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                pointerInputChange = pointerInputChange2;
                if (pointerInputChange == null && !pointerInputChange.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j, Offset.m11103minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()));
                        if (pointerDirectionConfig2.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) < f) {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            c046912.L$0 = pointerDirectionConfig2;
                            c046912.L$1 = longRef3;
                            c046912.L$2 = function2;
                            AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope4;
                            c046912.L$3 = awaitPointerEventScope7;
                            c046912.L$4 = longRef4;
                            c046912.L$5 = pointerInputChange;
                            c046912.F$0 = f;
                            c046912.J$0 = jM11104plusMKHz9U;
                            c046912.label = 4;
                            if (awaitPointerEventScope7.awaitPointerEvent(pointerEventPass3, c046912) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            fM7912pointerSlopE8SPZFQ = f;
                            c04691 = c046912;
                            pointerInputChange5 = pointerInputChange;
                            awaitPointerEventScope3 = awaitPointerEventScope7;
                            if (!pointerInputChange5.isConsumed()) {
                            }
                        } else {
                            AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope4;
                            function2.invoke(pointerInputChange, Offset.m11088boximpl(pointerDirectionConfig2.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f)));
                            if (pointerInputChange.isConsumed()) {
                                longRef = longRef3;
                            } else {
                                jM11104plusMKHz9U = Offset.INSTANCE.m11115getZeroF1C5BW0();
                                fM7912pointerSlopE8SPZFQ = f;
                                c04691 = c046912;
                                longRef2 = longRef4;
                                awaitPointerEventScope3 = awaitPointerEventScope8;
                                longRef = longRef3;
                                i4 = 3;
                                pointerEventPass = null;
                                jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                                i5 = 0;
                                i6 = 1;
                                c04691.L$0 = pointerDirectionConfig2;
                                c04691.L$1 = longRef;
                                c04691.L$2 = function2;
                                c04691.L$3 = awaitPointerEventScope3;
                                c04691.L$4 = longRef2;
                                c04691.L$5 = pointerEventPass;
                                c04691.F$0 = fM7912pointerSlopE8SPZFQ;
                                c04691.J$0 = jM11115getZeroF1C5BW0;
                                c04691.label = i4;
                                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, c04691, i6, pointerEventPass);
                                if (objAwaitPointerEvent$default != coroutine_suspended) {
                                }
                            }
                        }
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange6 = pointerInputChange3;
                        if (pointerInputChange6 != null) {
                            longRef4.element = pointerInputChange6.getId();
                            fM7912pointerSlopE8SPZFQ = f;
                            c04691 = c046912;
                            longRef2 = longRef4;
                            longRef = longRef3;
                            jM11115getZeroF1C5BW0 = j;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            i4 = 3;
                            i5 = 0;
                            i6 = 1;
                            pointerEventPass = null;
                            c04691.L$0 = pointerDirectionConfig2;
                            c04691.L$1 = longRef;
                            c04691.L$2 = function2;
                            c04691.L$3 = awaitPointerEventScope3;
                            c04691.L$4 = longRef2;
                            c04691.L$5 = pointerEventPass;
                            c04691.F$0 = fM7912pointerSlopE8SPZFQ;
                            c04691.J$0 = jM11115getZeroF1C5BW0;
                            c04691.label = i4;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, c04691, i6, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                }
                if (pointerInputChange == null) {
                    return TuplesKt.m7112to(pointerInputChange, Offset.m11088boximpl(longRef.element));
                }
                return null;
            }
            longRef = longRef3;
            pointerInputChange = null;
            if (pointerInputChange == null) {
            }
        }
        PointerInputChange pointerInputChange7 = (PointerInputChange) objAwaitFirstDown;
        if (!function12.invoke(pointerInputChange7).booleanValue()) {
            return null;
        }
        if (function02.invoke().booleanValue()) {
            pointerInputChange7.consume();
            VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange7);
            return TuplesKt.m7112to(pointerInputChange7, Offset.m11088boximpl(Offset.INSTANCE.m11115getZeroF1C5BW0()));
        }
        c04691.L$0 = awaitPointerEventScope2;
        c04691.L$1 = velocityTracker2;
        c04691.L$2 = pointerDirectionConfig2;
        c04691.L$3 = null;
        c04691.L$4 = null;
        c04691.label = 2;
        objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, c04691, 2, null);
        if (objAwaitFirstDown == coroutine_suspended) {
            return coroutine_suspended;
        }
        awaitPointerEventScope3 = awaitPointerEventScope2;
        PointerInputChange pointerInputChange42 = (PointerInputChange) objAwaitFirstDown;
        VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange42);
        longRef = new Ref.LongRef();
        Offset.Companion companion2 = Offset.INSTANCE;
        longRef.element = companion2.m11115getZeroF1C5BW0();
        function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange52, Offset offset) {
                m7931invokeUv8p0NA(pointerInputChange52, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m7931invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange52, long j22) {
                VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange52);
                pointerInputChange52.consume();
                longRef.element = j22;
            }
        };
        id = pointerInputChange42.getId();
        int type2 = pointerInputChange42.getType();
        if (DragGestureDetectorKt.m7911isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
        }
    }

    /* renamed from: awaitDrag-Su4bsnU */
    public static final Object m7927awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super Boolean> continuation) {
        sendChannel.mo17201trySendJP2dKIU(new DragEvent.DragStarted(Offset.m11103minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m11099getXimpl(j) * Math.signum(Offset.m11099getXimpl(pointerInputChange.getPosition())), Offset.m11100getYimpl(j) * Math.signum(Offset.m11100getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo17201trySendJP2dKIU(new DragEvent.DragDelta(z ? Offset.m11106timestuRUvjQ(j, -1.0f) : j, null));
        return m7928onDragOrUpAxegvzg(awaitPointerEventScope, function1, pointerInputChange.getId(), new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return;
                }
                long jPositionChange = PointerEventKt.positionChange(pointerInputChange2);
                pointerInputChange2.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    jPositionChange = Offset.m11106timestuRUvjQ(jPositionChange, -1.0f);
                }
                sendChannel2.mo17201trySendJP2dKIU(new DragEvent.DragDelta(jPositionChange, null));
            }
        }, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00f7, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L117;
     */
    /* JADX WARN: Path cross not found for [B:115:0x00ed, B:104:0x00c4], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0086 -> B:92:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7928onDragOrUpAxegvzg(AwaitPointerEventScope awaitPointerEventScope, Function1<? super PointerInputChange, Boolean> function1, long j, Function1<? super PointerInputChange, Unit> function12, Continuation<? super Boolean> continuation) throws Throwable {
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$1;
        long id;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function13;
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$12;
        Function1<? super PointerInputChange, Boolean> function14;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object objAwaitPointerEvent$default;
        Unit unit;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DraggableKt$onDragOrUp$1) {
            draggableKt$onDragOrUp$1 = (DraggableKt$onDragOrUp$1) continuation;
            int i = draggableKt$onDragOrUp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                draggableKt$onDragOrUp$1.label = i - Integer.MIN_VALUE;
            } else {
                draggableKt$onDragOrUp$1 = new DraggableKt$onDragOrUp$1(continuation);
            }
        }
        Object obj = draggableKt$onDragOrUp$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = draggableKt$onDragOrUp$1.label;
        int i3 = 1;
        PointerEventPass pointerEventPass = null;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) draggableKt$onDragOrUp$1.L$4;
            awaitPointerEventScope3 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$2;
            Function1<? super PointerInputChange, Unit> function15 = (Function1) draggableKt$onDragOrUp$1.L$1;
            Function1<? super PointerInputChange, Boolean> function16 = (Function1) draggableKt$onDragOrUp$1.L$0;
            ResultKt.throwOnFailure(obj);
            draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
            function14 = function16;
            longRef = longRef2;
            function13 = function15;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    pointerInputChange2 = null;
                    break;
                }
                pointerInputChange2 = changes.get(i4);
                awaitPointerEventScope4 = awaitPointerEventScope3;
                if (PointerId.m12466equalsimpl0(pointerInputChange2.getId(), longRef.element)) {
                    break;
                }
                i4++;
                awaitPointerEventScope3 = awaitPointerEventScope4;
            }
            pointerInputChange = pointerInputChange2;
            if (pointerInputChange == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i5);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i5++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null) {
                        longRef.element = pointerInputChange4.getId();
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        i3 = 1;
                        pointerEventPass = null;
                        draggableKt$onDragOrUp$12.L$0 = function14;
                        draggableKt$onDragOrUp$12.L$1 = function13;
                        draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                        draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                        draggableKt$onDragOrUp$12.L$4 = longRef;
                        draggableKt$onDragOrUp$12.label = i3;
                        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
                        if (objAwaitPointerEvent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope5 = awaitPointerEventScope2;
                        obj = objAwaitPointerEvent$default;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange = pointerInputChange2;
                        if (pointerInputChange == null) {
                            pointerInputChange = null;
                        }
                    }
                }
            }
            if (pointerInputChange == null || pointerInputChange.isConsumed()) {
                pointerInputChange = null;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                function13.invoke(pointerInputChange);
                awaitPointerEventScope2 = awaitPointerEventScope5;
                pointerEventPass = null;
                id = pointerInputChange.getId();
                i3 = 1;
                longRef = new Ref.LongRef();
                longRef.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$0 = function14;
                draggableKt$onDragOrUp$12.L$1 = function13;
                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                draggableKt$onDragOrUp$12.L$4 = longRef;
                draggableKt$onDragOrUp$12.label = i3;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                }
            }
            if (pointerInputChange == null) {
                function13.invoke(pointerInputChange);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return Boxing.boxBoolean(unit == null);
        }
        ResultKt.throwOnFailure(obj);
        id = j;
        if (DragGestureDetectorKt.m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
            function13 = function12;
            pointerInputChange = null;
            if (pointerInputChange == null) {
            }
            return Boxing.boxBoolean(unit == null);
        }
        awaitPointerEventScope2 = awaitPointerEventScope;
        function13 = function12;
        draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
        function14 = function1;
        longRef = new Ref.LongRef();
        longRef.element = id;
        awaitPointerEventScope3 = awaitPointerEventScope2;
        draggableKt$onDragOrUp$12.L$0 = function14;
        draggableKt$onDragOrUp$12.L$1 = function13;
        draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
        draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
        draggableKt$onDragOrUp$12.L$4 = longRef;
        draggableKt$onDragOrUp$12.label = i3;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
        if (objAwaitPointerEvent$default == coroutine_suspended) {
        }
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m7929toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m11100getYimpl(j) : Offset.m11099getXimpl(j);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m7930toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m13902getYimpl(j) : Velocity.m13901getXimpl(j);
    }
}
