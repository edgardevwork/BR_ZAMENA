package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable2D.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001e\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ7\u0010*\u001a\u00020\u00152'\u0010+\u001a#\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160,¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010.JË\u0001\u0010/\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u001a\u00100\u001a\u00020\u0015*\u00020-2\u0006\u00101\u001a\u000202H\u0096@¢\u0006\u0002\u00103R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m7105d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "state", "Landroidx/compose/foundation/gestures/Draggable2DState;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "abstractDragScope", "androidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1", "Landroidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1;", "drag2DScope", "Landroidx/compose/foundation/gestures/Drag2DScope;", "getDrag2DScope", "()Landroidx/compose/foundation/gestures/Drag2DScope;", "setDrag2DScope", "(Landroidx/compose/foundation/gestures/Drag2DScope;)V", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "drag", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "draggingBy", "dragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class Draggable2DNode extends AbstractDraggableNode {
    public static final int $stable = 8;

    @NotNull
    private final Draggable2DNode$abstractDragScope$1 abstractDragScope;

    @NotNull
    private Drag2DScope drag2DScope;

    @NotNull
    private final PointerDirectionConfig pointerDirectionConfig;

    @NotNull
    private Draggable2DState state;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1] */
    public Draggable2DNode(@NotNull Draggable2DState draggable2DState, @NotNull Function1<? super PointerInputChange, Boolean> function1, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function0<Boolean> function0, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z2) {
        super(function1, z, mutableInteractionSource, function0, function3, function32, z2);
        this.state = draggable2DState;
        this.drag2DScope = Draggable2DKt.NoOpDrag2DScope;
        this.abstractDragScope = new AbstractDragScope() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1
            @Override // androidx.compose.foundation.gestures.AbstractDragScope
            /* renamed from: dragBy-k-4lQ0M */
            public void mo7879dragByk4lQ0M(long pixels) {
                this.this$0.getDrag2DScope().mo7889dragByk4lQ0M(pixels);
            }
        };
        this.pointerDirectionConfig = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
    }

    @NotNull
    public final Drag2DScope getDrag2DScope() {
        return this.drag2DScope;
    }

    public final void setDrag2DScope(@NotNull Drag2DScope drag2DScope) {
        this.drag2DScope = drag2DScope;
    }

    /* compiled from: Draggable2D.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/Drag2DScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", m7120f = "Draggable2D.kt", m7121i = {}, m7122l = {288}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2 */
    public static final class C04682 extends SuspendLambda implements Function2<Drag2DScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<AbstractDragScope, Continuation<? super Unit>, Object> $block;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04682(Function2<? super AbstractDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04682> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04682 c04682 = Draggable2DNode.this.new C04682(this.$block, continuation);
            c04682.L$0 = obj;
            return c04682;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Drag2DScope drag2DScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04682) create(drag2DScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Draggable2DNode.this.setDrag2DScope((Drag2DScope) this.L$0);
                Function2<AbstractDragScope, Continuation<? super Unit>, Object> function2 = this.$block;
                Draggable2DNode$abstractDragScope$1 draggable2DNode$abstractDragScope$1 = Draggable2DNode.this.abstractDragScope;
                this.label = 1;
                if (function2.invoke(draggable2DNode$abstractDragScope$1, this) == coroutine_suspended) {
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

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @Nullable
    public Object drag(@NotNull Function2<? super AbstractDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C04682(function2, null), continuation);
        return objDrag == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @Nullable
    public Object draggingBy(@NotNull AbstractDragScope abstractDragScope, @NotNull DragEvent.DragDelta dragDelta, @NotNull Continuation<? super Unit> continuation) {
        abstractDragScope.mo7879dragByk4lQ0M(dragDelta.getDelta());
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @NotNull
    public PointerDirectionConfig getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    public final void update(@NotNull Draggable2DState state, @NotNull Function1<? super PointerInputChange, Boolean> canDrag, boolean enabled, @Nullable MutableInteractionSource interactionSource, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z;
        boolean z2 = true;
        if (Intrinsics.areEqual(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            z = true;
        }
        setCanDrag(canDrag);
        if (getEnabled() != enabled) {
            setEnabled(enabled);
            if (!enabled) {
                disposeInteractionSource();
            }
            z = true;
        }
        if (!Intrinsics.areEqual(getInteractionSource(), interactionSource)) {
            disposeInteractionSource();
            setInteractionSource(interactionSource);
        }
        setStartDragImmediately(startDragImmediately);
        setOnDragStarted(onDragStarted);
        setOnDragStopped(onDragStopped);
        if (getReverseDirection() != reverseDirection) {
            setReverseDirection(reverseDirection);
        } else {
            z2 = z;
        }
        if (z2) {
            getPointerInputNode().resetPointerInputHandler();
        }
    }
}
