package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p003ui.input.pointer.util.VelocityTracker;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.p007ts.PsExtractor;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B½\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0006\u0010H\u001a\u00020\u0015J7\u0010I\u001a\u00020\u00152'\u0010J\u001a#\b\u0001\u0012\u0004\u0012\u00020L\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160K¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020\u0015H\u0016J\b\u0010O\u001a\u00020\u0015H\u0016J*\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\u0015H\u0002J\u001a\u0010Z\u001a\u00020\u0015*\u00020L2\u0006\u0010[\u001a\u00020\\H¦@¢\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020\u0015*\u00020\u000fH\u0082@¢\u0006\u0002\u0010_J\u001a\u0010`\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u001a\u0010d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020eH\u0082@¢\u0006\u0002\u0010fR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RR\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104RR\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u0012\u00108\u001a\u000209X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, m7105d2 = {"Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "_canDrag", "_startDragImmediately", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "setCanDrag", "(Lkotlin/jvm/functions/Function1;)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isListeningForEvents", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "setOnDragStarted", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "setOnDragStopped", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getPointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReverseDirection", "setReverseDirection", "getStartDragImmediately", "()Lkotlin/jvm/functions/Function0;", "setStartDragImmediately", "(Lkotlin/jvm/functions/Function0;)V", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "disposeInteractionSource", "drag", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "startListeningForEvents", "draggingBy", "dragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", "event", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class AbstractDraggableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @NotNull
    private Function1<? super PointerInputChange, Boolean> canDrag;

    @Nullable
    private DragInteraction.Start dragInteraction;
    private boolean enabled;

    @Nullable
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;

    @NotNull
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;

    @NotNull
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private boolean reverseDirection;

    @NotNull
    private Function0<Boolean> startDragImmediately;

    @NotNull
    private final Function1<PointerInputChange, Boolean> _canDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull PointerInputChange pointerInputChange) {
            return this.this$0.getCanDrag().invoke(pointerInputChange);
        }
    };

    @NotNull
    private final Function0<Boolean> _startDragImmediately = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_startDragImmediately$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return this.this$0.getStartDragImmediately().invoke();
        }
    };

    @NotNull
    private final VelocityTracker velocityTracker = new VelocityTracker();

    @NotNull
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractDraggableNode$pointerInputNode$1(this, null)));

    @NotNull
    private final Channel<DragEvent> channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    /* compiled from: Draggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode", m7120f = "Draggable.kt", m7121i = {0, 0}, m7122l = {554, 557}, m7123m = "processDragCancel", m7124n = {"this", "$this$processDragCancel"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 */
    public static final class C04261 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C04261(Continuation<? super C04261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractDraggableNode.this.processDragCancel(null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode", m7120f = "Draggable.kt", m7121i = {0, 0, 0, 1, 1, 1, 1}, m7122l = {536, 539, 541}, m7123m = "processDragStart", m7124n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 */
    public static final class C04271 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C04271(Continuation<? super C04271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractDraggableNode.this.processDragStart(null, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode", m7120f = "Draggable.kt", m7121i = {0, 0, 0}, m7122l = {546, 549}, m7123m = "processDragStop", m7124n = {"this", "$this$processDragStop", "event"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 */
    public static final class C04281 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C04281(Continuation<? super C04281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractDraggableNode.this.processDragStop(null, null, this);
        }
    }

    @Nullable
    public abstract Object drag(@NotNull Function2<? super AbstractDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public abstract Object draggingBy(@NotNull AbstractDragScope abstractDragScope, @NotNull DragEvent.DragDelta dragDelta, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    public abstract PointerDirectionConfig getPointerDirectionConfig();

    @NotNull
    public final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final void setCanDrag(@NotNull Function1<? super PointerInputChange, Boolean> function1) {
        this.canDrag = function1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(@Nullable MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    @NotNull
    public final Function0<Boolean> getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void setStartDragImmediately(@NotNull Function0<Boolean> function0) {
        this.startDragImmediately = function0;
    }

    @NotNull
    public final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final void setOnDragStarted(@NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.onDragStarted = function3;
    }

    @NotNull
    public final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    public final void setOnDragStopped(@NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.onDragStopped = function3;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final void setReverseDirection(boolean z) {
        this.reverseDirection = z;
    }

    public AbstractDraggableNode(@NotNull Function1<? super PointerInputChange, Boolean> function1, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function0<Boolean> function0, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z2) {
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = function0;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z2;
    }

    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C04291(null), 3, null);
    }

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", m7120f = "Draggable.kt", m7121i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, m7122l = {431, 433, 435, PsExtractor.PACK_START_CODE, 444, 447}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1 */
    public static final class C04291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public C04291(Continuation<? super C04291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04291 c04291 = AbstractDraggableNode.this.new C04291(continuation);
            c04291.L$0 = obj;
            return c04291;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:88|89|(1:91)|72|114|92|(2:98|(2:100|(1:102)))(2:94|(1:96))|77|(2:107|108)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x00d3, code lost:
        
            r1 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00b4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00bb A[Catch: CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, blocks: (B:92:0x00b5, B:94:0x00bb, B:98:0x00d5, B:100:0x00d9), top: B:114:0x00b5 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00d5 A[Catch: CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, blocks: (B:92:0x00b5, B:94:0x00bb, B:98:0x00d5, B:100:0x00d9), top: B:114:0x00b5 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x00e6 -> B:77:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x00f6 -> B:69:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x00f9 -> B:77:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x00d0 -> B:77:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x00d7 -> B:77:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            CoroutineScope coroutineScope2;
            Ref.ObjectRef objectRef3;
            CoroutineScope coroutineScope3;
            CoroutineScope coroutineScope4;
            AbstractDraggableNode abstractDraggableNode;
            T t;
            AbstractDraggableNode abstractDraggableNode2;
            AnonymousClass1 anonymousClass1;
            T t2;
            T t3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        objectRef = new Ref.ObjectRef();
                        Channel channel = AbstractDraggableNode.this.channel;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef;
                        this.label = 1;
                        Object objReceive = channel.receive(this);
                        if (objReceive == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        t2 = objReceive;
                        objectRef2 = objectRef;
                        objectRef.element = t2;
                        t3 = objectRef2.element;
                        if (!(t3 instanceof DragEvent.DragStarted)) {
                            this.L$0 = coroutineScope2;
                            this.L$1 = objectRef2;
                            this.L$2 = null;
                            this.label = 2;
                            if (AbstractDraggableNode.this.processDragStart(coroutineScope2, (DragEvent.DragStarted) t3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef3 = objectRef2;
                            coroutineScope3 = coroutineScope2;
                            abstractDraggableNode2 = AbstractDraggableNode.this;
                            anonymousClass1 = new AnonymousClass1(objectRef3, abstractDraggableNode2, null);
                            this.L$0 = coroutineScope3;
                            this.L$1 = objectRef3;
                            this.label = 3;
                            if (abstractDraggableNode2.drag(anonymousClass1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope = coroutineScope3;
                            t = objectRef3.element;
                            if (t instanceof DragEvent.DragStopped) {
                                AbstractDraggableNode abstractDraggableNode3 = AbstractDraggableNode.this;
                                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 4;
                                if (abstractDraggableNode3.processDragStop(coroutineScope, (DragEvent.DragStopped) t, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (t instanceof DragEvent.DragCancelled) {
                                AbstractDraggableNode abstractDraggableNode4 = AbstractDraggableNode.this;
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 5;
                                if (abstractDraggableNode4.processDragCancel(coroutineScope, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            coroutineScope = coroutineScope2;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        }
                    }
                case 1:
                    objectRef = (Ref.ObjectRef) this.L$2;
                    objectRef2 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t2 = obj;
                    objectRef.element = t2;
                    t3 = objectRef2.element;
                    if (!(t3 instanceof DragEvent.DragStarted)) {
                    }
                    break;
                case 2:
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    abstractDraggableNode2 = AbstractDraggableNode.this;
                    anonymousClass1 = new AnonymousClass1(objectRef3, abstractDraggableNode2, null);
                    this.L$0 = coroutineScope3;
                    this.L$1 = objectRef3;
                    this.label = 3;
                    if (abstractDraggableNode2.drag(anonymousClass1, this) == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope3;
                    t = objectRef3.element;
                    if (t instanceof DragEvent.DragStopped) {
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    break;
                case 3:
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException unused) {
                        coroutineScope4 = coroutineScope3;
                        abstractDraggableNode = AbstractDraggableNode.this;
                        this.L$0 = coroutineScope4;
                        this.L$1 = null;
                        this.label = 6;
                        if (abstractDraggableNode.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope4;
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                    }
                    coroutineScope = coroutineScope3;
                    t = objectRef3.element;
                    if (t instanceof DragEvent.DragStopped) {
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    break;
                case 4:
                    coroutineScope4 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException unused2) {
                        abstractDraggableNode = AbstractDraggableNode.this;
                        this.L$0 = coroutineScope4;
                        this.L$1 = null;
                        this.label = 6;
                        if (abstractDraggableNode.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                        }
                        coroutineScope = coroutineScope4;
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                    }
                    coroutineScope = coroutineScope4;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    break;
                case 5:
                    coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope4;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    break;
                case 6:
                    coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope4;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/AbstractDragScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", m7120f = "Draggable.kt", m7121i = {0, 1}, m7122l = {437, 438}, m7123m = "invokeSuspend", m7124n = {"$this$drag", "$this$drag"}, m7125s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractDragScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, AbstractDraggableNode abstractDraggableNode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AbstractDragScope abstractDragScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(abstractDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0077 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0075 -> B:55:0x0078). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                AbstractDragScope abstractDragScope;
                AbstractDragScope abstractDragScope2;
                Ref.ObjectRef<DragEvent> objectRef;
                Object objReceive;
                DragEvent dragEvent;
                T t;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    abstractDragScope = (AbstractDragScope) this.L$0;
                    dragEvent = this.$event.element;
                    if (dragEvent instanceof DragEvent.DragStopped) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    abstractDragScope = (AbstractDragScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    abstractDragScope2 = abstractDragScope;
                    objectRef = this.$event;
                    Channel channel = this.this$0.channel;
                    this.L$0 = abstractDragScope2;
                    this.L$1 = objectRef;
                    this.label = 2;
                    objReceive = channel.receive(this);
                    t = objReceive;
                    if (objReceive == coroutine_suspended) {
                    }
                    objectRef.element = t;
                    abstractDragScope = abstractDragScope2;
                    dragEvent = this.$event.element;
                    if (dragEvent instanceof DragEvent.DragStopped) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                abstractDragScope2 = (AbstractDragScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef.element = t;
                abstractDragScope = abstractDragScope2;
                dragEvent = this.$event.element;
                if ((dragEvent instanceof DragEvent.DragStopped) && !(dragEvent instanceof DragEvent.DragCancelled)) {
                    if ((dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null) != null) {
                        AbstractDraggableNode abstractDraggableNode = this.this$0;
                        Intrinsics.checkNotNull(dragEvent, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta");
                        this.L$0 = abstractDragScope;
                        this.L$1 = null;
                        this.label = 1;
                        if (abstractDraggableNode.draggingBy(abstractDragScope, (DragEvent.DragDelta) dragEvent, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    abstractDragScope2 = abstractDragScope;
                    objectRef = this.$event;
                    Channel channel2 = this.this$0.channel;
                    this.L$0 = abstractDragScope2;
                    this.L$1 = objectRef;
                    this.label = 2;
                    objReceive = channel2.receive(this);
                    t = objReceive;
                    if (objReceive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef.element = t;
                    abstractDragScope = abstractDragScope2;
                    dragEvent = this.$event.element;
                    if (dragEvent instanceof DragEvent.DragStopped) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final SuspendingPointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo7740onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo7740onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) throws Throwable {
        C04271 c04271;
        AbstractDraggableNode abstractDraggableNode;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        AbstractDraggableNode abstractDraggableNode2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3;
        Offset offsetM11088boximpl;
        if (continuation instanceof C04271) {
            c04271 = (C04271) continuation;
            int i = c04271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04271.label = i - Integer.MIN_VALUE;
            } else {
                c04271 = new C04271(continuation);
            }
        }
        Object obj = c04271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start3 = this.dragInteraction;
            if (start3 != null && (mutableInteractionSource = this.interactionSource) != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                c04271.L$0 = this;
                c04271.L$1 = coroutineScope;
                c04271.L$2 = dragStarted;
                c04271.label = 1;
                if (mutableInteractionSource.emit(cancel, c04271) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            abstractDraggableNode = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                start2 = (DragInteraction.Start) c04271.L$3;
                dragStarted = (DragEvent.DragStarted) c04271.L$2;
                coroutineScope2 = (CoroutineScope) c04271.L$1;
                abstractDraggableNode2 = (AbstractDraggableNode) c04271.L$0;
                ResultKt.throwOnFailure(obj);
                start = start2;
                coroutineScope = coroutineScope2;
                abstractDraggableNode = abstractDraggableNode2;
                abstractDraggableNode.dragInteraction = start;
                function3 = abstractDraggableNode.onDragStarted;
                offsetM11088boximpl = Offset.m11088boximpl(dragStarted.getStartPoint());
                c04271.L$0 = null;
                c04271.L$1 = null;
                c04271.L$2 = null;
                c04271.L$3 = null;
                c04271.label = 3;
                if (function3.invoke(coroutineScope, offsetM11088boximpl, c04271) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            dragStarted = (DragEvent.DragStarted) c04271.L$2;
            coroutineScope = (CoroutineScope) c04271.L$1;
            abstractDraggableNode = (AbstractDraggableNode) c04271.L$0;
            ResultKt.throwOnFailure(obj);
        }
        start = new DragInteraction.Start();
        MutableInteractionSource mutableInteractionSource2 = abstractDraggableNode.interactionSource;
        if (mutableInteractionSource2 != null) {
            c04271.L$0 = abstractDraggableNode;
            c04271.L$1 = coroutineScope;
            c04271.L$2 = dragStarted;
            c04271.L$3 = start;
            c04271.label = 2;
            if (mutableInteractionSource2.emit(start, c04271) == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractDraggableNode2 = abstractDraggableNode;
            coroutineScope2 = coroutineScope;
            start2 = start;
            start = start2;
            coroutineScope = coroutineScope2;
            abstractDraggableNode = abstractDraggableNode2;
        }
        abstractDraggableNode.dragInteraction = start;
        function3 = abstractDraggableNode.onDragStarted;
        offsetM11088boximpl = Offset.m11088boximpl(dragStarted.getStartPoint());
        c04271.L$0 = null;
        c04271.L$1 = null;
        c04271.L$2 = null;
        c04271.L$3 = null;
        c04271.label = 3;
        if (function3.invoke(coroutineScope, offsetM11088boximpl, c04271) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) throws Throwable {
        C04281 c04281;
        AbstractDraggableNode abstractDraggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity velocityM13892boximpl;
        if (continuation instanceof C04281) {
            c04281 = (C04281) continuation;
            int i = c04281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04281.label = i - Integer.MIN_VALUE;
            } else {
                c04281 = new C04281(continuation);
            }
        }
        Object obj = c04281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start != null) {
                MutableInteractionSource mutableInteractionSource = this.interactionSource;
                if (mutableInteractionSource != null) {
                    DragInteraction.Stop stop = new DragInteraction.Stop(start);
                    c04281.L$0 = this;
                    c04281.L$1 = coroutineScope;
                    c04281.L$2 = dragStopped;
                    c04281.label = 1;
                    if (mutableInteractionSource.emit(stop, c04281) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                abstractDraggableNode = this;
            } else {
                abstractDraggableNode = this;
                function3 = abstractDraggableNode.onDragStopped;
                velocityM13892boximpl = Velocity.m13892boximpl(dragStopped.getVelocity());
                c04281.L$0 = null;
                c04281.L$1 = null;
                c04281.L$2 = null;
                c04281.label = 2;
                if (function3.invoke(coroutineScope, velocityM13892boximpl, c04281) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            dragStopped = (DragEvent.DragStopped) c04281.L$2;
            coroutineScope = (CoroutineScope) c04281.L$1;
            abstractDraggableNode = (AbstractDraggableNode) c04281.L$0;
            ResultKt.throwOnFailure(obj);
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        velocityM13892boximpl = Velocity.m13892boximpl(dragStopped.getVelocity());
        c04281.L$0 = null;
        c04281.L$1 = null;
        c04281.L$2 = null;
        c04281.label = 2;
        if (function3.invoke(coroutineScope, velocityM13892boximpl, c04281) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        C04261 c04261;
        AbstractDraggableNode abstractDraggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity velocityM13892boximpl;
        if (continuation instanceof C04261) {
            c04261 = (C04261) continuation;
            int i = c04261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04261.label = i - Integer.MIN_VALUE;
            } else {
                c04261 = new C04261(continuation);
            }
        }
        Object obj = c04261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start != null) {
                MutableInteractionSource mutableInteractionSource = this.interactionSource;
                if (mutableInteractionSource != null) {
                    DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                    c04261.L$0 = this;
                    c04261.L$1 = coroutineScope;
                    c04261.label = 1;
                    if (mutableInteractionSource.emit(cancel, c04261) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                abstractDraggableNode = this;
            } else {
                abstractDraggableNode = this;
                function3 = abstractDraggableNode.onDragStopped;
                velocityM13892boximpl = Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
                c04261.L$0 = null;
                c04261.L$1 = null;
                c04261.label = 2;
                if (function3.invoke(coroutineScope, velocityM13892boximpl, c04261) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) c04261.L$1;
            abstractDraggableNode = (AbstractDraggableNode) c04261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        velocityM13892boximpl = Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
        c04261.L$0 = null;
        c04261.L$1 = null;
        c04261.label = 2;
        if (function3.invoke(coroutineScope, velocityM13892boximpl, c04261) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }
}
