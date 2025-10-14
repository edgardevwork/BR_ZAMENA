package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\rJD\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0012\u0010\u000f\u001a\u00020\b*\u00020\u0010H\u0094@¢\u0006\u0002\u0010\u0011R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onClick", "Lkotlin/Function0;", "", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "onLongClick", "onDoubleClick", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "update", "pointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n*L\n1018#1:1071\n*E\n"})
/* loaded from: classes4.dex */
public final class CombinedClickablePointerInputNode extends AbstractClickablePointerInputNode {

    @Nullable
    public Function0<Unit> onDoubleClick;

    @Nullable
    public Function0<Unit> onLongClick;

    public CombinedClickablePointerInputNode(boolean z, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull Function0<Unit> function0, @NotNull AbstractClickableNode.InteractionData interactionData, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03) {
        super(z, mutableInteractionSource, function0, interactionData, null);
        this.onLongClick = function02;
        this.onDoubleClick = function03;
    }

    /* compiled from: Clickable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$2 */
    /* loaded from: classes3.dex */
    public static final class C03932 extends Lambda implements Function1<Offset, Unit> {
        public C03932() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7823invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m7823invokek4lQ0M(long j) {
            Function0 function0 = CombinedClickablePointerInputNode.this.onDoubleClick;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$3 */
    /* loaded from: classes3.dex */
    public static final class C03943 extends Lambda implements Function1<Offset, Unit> {
        public C03943() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7824invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m7824invokek4lQ0M(long j) {
            Function0 function0 = CombinedClickablePointerInputNode.this.onLongClick;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$5 */
    /* loaded from: classes3.dex */
    public static final class C03965 extends Lambda implements Function1<Offset, Unit> {
        public C03965() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7826invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m7826invokek4lQ0M(long j) {
            if (CombinedClickablePointerInputNode.this.getEnabled()) {
                CombinedClickablePointerInputNode.this.getOnClick().invoke();
            }
        }
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    @Nullable
    public Object pointerInput(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long jM13842getCenterozmzZPI = IntSizeKt.m13842getCenterozmzZPI(pointerInputScope.getBoundsSize());
        interactionData.m7744setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m13794getXimpl(jM13842getCenterozmzZPI), IntOffset.m13795getYimpl(jM13842getCenterozmzZPI)));
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickablePointerInputNode.pointerInput.2
            public C03932() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m7823invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M */
            public final void m7823invokek4lQ0M(long j) {
                Function0 function0 = CombinedClickablePointerInputNode.this.onDoubleClick;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickablePointerInputNode.pointerInput.3
            public C03943() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m7824invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M */
            public final void m7824invokek4lQ0M(long j) {
                Function0 function0 = CombinedClickablePointerInputNode.this.onLongClick;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }, new C03954(null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickablePointerInputNode.pointerInput.5
            public C03965() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m7826invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M */
            public final void m7826invokek4lQ0M(long j) {
                if (CombinedClickablePointerInputNode.this.getEnabled()) {
                    CombinedClickablePointerInputNode.this.getOnClick().invoke();
                }
            }
        }, continuation);
        return objDetectTapGestures == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
    }

    /* compiled from: Clickable.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", m7120f = "Clickable.kt", m7121i = {}, m7122l = {AnalyticsListener.EVENT_PLAYER_RELEASED}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4 */
    public static final class C03954 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public /* synthetic */ long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        public C03954(Continuation<? super C03954> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m7825invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* renamed from: invoke-d-4ec7I */
        public final Object m7825invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
            C03954 c03954 = CombinedClickablePointerInputNode.this.new C03954(continuation);
            c03954.L$0 = pressGestureScope;
            c03954.J$0 = j;
            return c03954.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (CombinedClickablePointerInputNode.this.getEnabled()) {
                    CombinedClickablePointerInputNode combinedClickablePointerInputNode = CombinedClickablePointerInputNode.this;
                    this.label = 1;
                    if (combinedClickablePointerInputNode.m7745handlePressInteractiond4ec7I(pressGestureScope, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public final void update(boolean enabled, @NotNull MutableInteractionSource interactionSource, @NotNull Function0<Unit> onClick, @Nullable Function0<Unit> onLongClick, @Nullable Function0<Unit> onDoubleClick) {
        boolean z;
        setOnClick(onClick);
        setInteractionSource(interactionSource);
        if (getEnabled() != enabled) {
            setEnabled(enabled);
            z = true;
        } else {
            z = false;
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            z = true;
        }
        this.onLongClick = onLongClick;
        boolean z2 = (this.onDoubleClick == null) == (onDoubleClick == null) ? z : true;
        this.onDoubleClick = onDoubleClick;
        if (z2) {
            resetPointerInputHandler();
        }
    }
}
