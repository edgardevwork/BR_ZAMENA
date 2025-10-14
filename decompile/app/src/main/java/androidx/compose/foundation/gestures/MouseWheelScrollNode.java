package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "(Landroidx/compose/foundation/gestures/ScrollingLogic;)V", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "getScrollConfig", "()Landroidx/compose/foundation/gestures/ScrollConfig;", "setScrollConfig", "(Landroidx/compose/foundation/gestures/ScrollConfig;)V", "onAttach", "", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class MouseWheelScrollNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {

    @Nullable
    public ScrollConfig scrollConfig;

    @NotNull
    public final ScrollingLogic scrollingLogic;

    public MouseWheelScrollNode(@NotNull ScrollingLogic scrollingLogic) {
        this.scrollingLogic = scrollingLogic;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new C04801(null)));
    }

    @Nullable
    public final ScrollConfig getScrollConfig() {
        return this.scrollConfig;
    }

    public final void setScrollConfig(@Nullable ScrollConfig scrollConfig) {
        this.scrollConfig = scrollConfig;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    /* compiled from: Scrollable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", m7120f = "Scrollable.kt", m7121i = {}, m7122l = {669}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1 */
    /* loaded from: classes3.dex */
    public static final class C04801 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C04801(Continuation<? super C04801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04801 c04801 = MouseWheelScrollNode.this.new C04801(continuation);
            c04801.L$0 = obj;
            return c04801;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04801) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Scrollable.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", m7120f = "Scrollable.kt", m7121i = {0}, m7122l = {BlackPassUtils.CAR_AWARD_ID_671}, m7123m = "invokeSuspend", m7124n = {"$this$awaitPointerEventScope"}, m7125s = {"L$0"})
        @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1021:1\n86#2,2:1022\n33#2,6:1024\n88#2:1030\n33#2,6:1031\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n*L\n672#1:1022,2\n672#1:1024,6\n672#1:1030\n688#1:1031,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ MouseWheelScrollNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MouseWheelScrollNode mouseWheelScrollNode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mouseWheelScrollNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[EDGE_INSN: B:21:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:13:0x003b->B:17:0x004b], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r14.label
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r15)
                    goto L2f
                L13:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1c:
                    kotlin.ResultKt.throwOnFailure(r15)
                    java.lang.Object r15 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r15
                    r1 = r15
                L24:
                    r14.L$0 = r1
                    r14.label = r2
                    java.lang.Object r15 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r14)
                    if (r15 != r0) goto L2f
                    return r0
                L2f:
                    androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.p003ui.input.pointer.PointerEvent) r15
                    java.util.List r3 = r15.getChanges()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L3b:
                    if (r6 >= r4) goto L4e
                    java.lang.Object r7 = r3.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r7
                    boolean r7 = r7.isConsumed()
                    r7 = r7 ^ r2
                    if (r7 != 0) goto L4b
                    goto L24
                L4b:
                    int r6 = r6 + 1
                    goto L3b
                L4e:
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r3 = r14.this$0
                    androidx.compose.foundation.gestures.ScrollConfig r3 = r3.getScrollConfig()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r4 = r14.this$0
                    long r6 = r1.mo12396getSizeYbymL2g()
                    long r6 = r3.mo7880calculateMouseWheelScroll8xgXZGE(r1, r15, r6)
                    androidx.compose.foundation.gestures.ScrollingLogic r3 = androidx.compose.foundation.gestures.MouseWheelScrollNode.access$getScrollingLogic$p(r4)
                    kotlinx.coroutines.CoroutineScope r8 = r4.getCoroutineScope()
                    androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r11 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                    r4 = 0
                    r11.<init>(r3, r6, r4)
                    r12 = 3
                    r13 = 0
                    r9 = 0
                    r10 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
                    java.util.List r15 = r15.getChanges()
                    int r3 = r15.size()
                L7e:
                    if (r5 >= r3) goto L24
                    java.lang.Object r4 = r15.get(r5)
                    androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r4
                    r4.consume()
                    int r5 = r5 + 1
                    goto L7e
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode.C04801.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MouseWheelScrollNode.this, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
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
