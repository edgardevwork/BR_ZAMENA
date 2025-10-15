package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.util.VelocityTracker;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", m7120f = "Draggable.kt", m7121i = {}, m7122l = {456}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes4.dex */
public final class AbstractDraggableNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, Continuation<? super AbstractDraggableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, continuation);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (!this.this$0.getEnabled()) {
                return Unit.INSTANCE;
            }
            C04251 c04251 = new C04251(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(c04251, this) == coroutine_suspended) {
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

    /* compiled from: Draggable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", m7120f = "Draggable.kt", m7121i = {0}, m7122l = {458}, m7123m = "invokeSuspend", m7124n = {"$this$coroutineScope"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1 */
    public static final class C04251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04251(PointerInputScope pointerInputScope, AbstractDraggableNode abstractDraggableNode, Continuation<? super C04251> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04251 c04251 = new C04251(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            c04251.L$0 = obj;
            return c04251;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            CancellationException e;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    PointerInputScope pointerInputScope = this.$$this$SuspendingPointerInputModifierNode;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope2, this.this$0, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Draggable.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", m7120f = "Draggable.kt", m7121i = {0, 1, 1}, m7122l = {460, 475}, m7123m = "invokeSuspend", m7124n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, m7125s = {"L$0", "L$0", "I$0"})
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ CoroutineScope $$this$coroutineScope;
            public int I$0;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoroutineScope coroutineScope, AbstractDraggableNode abstractDraggableNode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:25|(1:27)|78|28|29|82|30|(1:32)(10:33|80|34|35|(0)(0)|43|44|60|18|(2:74|75)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
            
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
            
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
            
                r20 = r6;
                r12 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:
            
                r19 = r5;
                r20 = r6;
                r16 = r7;
                r12 = r8;
                r18 = r9;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0172 A[Catch: all -> 0x0173, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0173, blocks: (B:57:0x0150, B:61:0x0172), top: B:76:0x0150 }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e0 -> B:80:0x00e7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0156 -> B:44:0x012d). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b4 -> B:18:0x0055). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                AwaitPointerEventScope awaitPointerEventScope;
                DefaultConstructorMarker defaultConstructorMarker;
                Throwable th;
                DragEvent dragStopped;
                int i;
                CancellationException e;
                Object objAwaitDownAndSlop;
                Pair pair;
                Object objM7927awaitDragSu4bsnU;
                DragEvent dragStopped2;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                int i3 = 0;
                int i4 = 1;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                    }
                } else if (i2 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitDownAndSlop = obj;
                    AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
                    pair = (Pair) objAwaitDownAndSlop;
                    if (pair == null) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.I$0;
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$2;
                    AbstractDraggableNode abstractDraggableNode = (AbstractDraggableNode) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objM7927awaitDragSu4bsnU = obj;
                        defaultConstructorMarker = null;
                        i = 1;
                    } catch (CancellationException e2) {
                        e = e2;
                        defaultConstructorMarker = null;
                        i = 1;
                        try {
                            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (i3 == 0) {
                                long jM12584calculateVelocityAH228Gc = abstractDraggableNode.velocityTracker.m12584calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                                abstractDraggableNode.velocityTracker.resetTracking();
                                dragStopped = new DragEvent.DragStopped(Velocity.m13907timesadjELrA(jM12584calculateVelocityAH228Gc, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                            } else {
                                dragStopped = DragEvent.DragCancelled.INSTANCE;
                            }
                            abstractDraggableNode.channel.mo17201trySendJP2dKIU(dragStopped);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i3 = i5;
                        defaultConstructorMarker = null;
                        float maximumFlingVelocity2 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i3 == 0) {
                        }
                        abstractDraggableNode.channel.mo17201trySendJP2dKIU(dragStopped);
                        throw th;
                    }
                    try {
                    } catch (CancellationException e3) {
                        e = e3;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            throw e;
                        }
                        ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        abstractDraggableNode.channel.mo17201trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                        awaitPointerEventScope = awaitPointerEventScope3;
                        defaultConstructorMarker2 = defaultConstructorMarker;
                        i4 = i;
                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i3 = i5;
                        float maximumFlingVelocity22 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i3 == 0) {
                        }
                        abstractDraggableNode.channel.mo17201trySendJP2dKIU(dragStopped);
                        throw th;
                    }
                    boolean zBooleanValue = ((Boolean) objM7927awaitDragSu4bsnU).booleanValue();
                    float maximumFlingVelocity3 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                    if (zBooleanValue) {
                        dragStopped2 = DragEvent.DragCancelled.INSTANCE;
                    } else {
                        long jM12584calculateVelocityAH228Gc2 = abstractDraggableNode.velocityTracker.m12584calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity3, maximumFlingVelocity3));
                        abstractDraggableNode.velocityTracker.resetTracking();
                        dragStopped2 = new DragEvent.DragStopped(Velocity.m13907timesadjELrA(jM12584calculateVelocityAH228Gc2, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                    }
                    abstractDraggableNode.channel.mo17201trySendJP2dKIU(dragStopped2);
                    awaitPointerEventScope = awaitPointerEventScope3;
                    defaultConstructorMarker2 = defaultConstructorMarker;
                    i4 = i;
                    if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        Function1 function1 = this.this$0._canDrag;
                        Function0 function0 = this.this$0._startDragImmediately;
                        VelocityTracker velocityTracker = this.this$0.velocityTracker;
                        PointerDirectionConfig pointerDirectionConfig = this.this$0.getPointerDirectionConfig();
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = defaultConstructorMarker2;
                        this.L$2 = defaultConstructorMarker2;
                        this.label = i4;
                        objAwaitDownAndSlop = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, function1, function0, velocityTracker, pointerDirectionConfig, this);
                        if (objAwaitDownAndSlop == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        AwaitPointerEventScope awaitPointerEventScope22 = awaitPointerEventScope;
                        pair = (Pair) objAwaitDownAndSlop;
                        if (pair == null) {
                            final AbstractDraggableNode abstractDraggableNode2 = this.this$0;
                            CoroutineScope coroutineScope2 = this.$$this$coroutineScope;
                            if (!abstractDraggableNode2.isListeningForEvents) {
                                abstractDraggableNode2.startListeningForEvents();
                            }
                            PointerInputChange pointerInputChange = (PointerInputChange) pair.getFirst();
                            long packedValue = ((Offset) pair.getSecond()).getPackedValue();
                            VelocityTracker velocityTracker2 = abstractDraggableNode2.velocityTracker;
                            Channel channel = abstractDraggableNode2.channel;
                            boolean reverseDirection = abstractDraggableNode2.getReverseDirection();
                            Function1<PointerInputChange, Boolean> function12 = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(@NotNull PointerInputChange pointerInputChange2) {
                                    return Boolean.valueOf(!(abstractDraggableNode2.getPointerDirectionConfig().mo7914calculateDeltaChangek4lQ0M(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2)) == 0.0f));
                                }
                            };
                            this.L$0 = awaitPointerEventScope22;
                            this.L$1 = abstractDraggableNode2;
                            this.L$2 = coroutineScope2;
                            this.I$0 = 0;
                            this.label = 2;
                            CoroutineScope coroutineScope3 = coroutineScope2;
                            AbstractDraggableNode abstractDraggableNode3 = abstractDraggableNode2;
                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope22;
                            defaultConstructorMarker = defaultConstructorMarker2;
                            i = i4;
                            objM7927awaitDragSu4bsnU = DraggableKt.m7927awaitDragSu4bsnU(awaitPointerEventScope22, pointerInputChange, packedValue, velocityTracker2, channel, reverseDirection, function12, this);
                            if (objM7927awaitDragSu4bsnU == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5 = 0;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            coroutineScope = coroutineScope3;
                            abstractDraggableNode = abstractDraggableNode3;
                            boolean zBooleanValue2 = ((Boolean) objM7927awaitDragSu4bsnU).booleanValue();
                            float maximumFlingVelocity32 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (zBooleanValue2) {
                            }
                            abstractDraggableNode.channel.mo17201trySendJP2dKIU(dragStopped2);
                            awaitPointerEventScope = awaitPointerEventScope3;
                            defaultConstructorMarker2 = defaultConstructorMarker;
                            i4 = i;
                            if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            awaitPointerEventScope = awaitPointerEventScope22;
                            if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                            }
                        }
                    }
                }
            }
        }
    }
}
