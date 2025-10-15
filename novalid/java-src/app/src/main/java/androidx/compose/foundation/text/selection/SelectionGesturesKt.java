package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.PointerType;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionGestures.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\tH\u0082@¢\u0006\u0002\u0010\n\u001a&\u0010\u000b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0000\u001a\"\u0010\u001e\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u001f\u001a \u0010 \u001a\u00020\u001a*\u00020\u001a2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\"H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m7105d2 = {"ClicksSlop", "", "STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distanceIsTolerable", "offset1", "Landroidx/compose/ui/geometry/Offset;", "offset2", "distanceIsTolerable-2x9bVx0", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JJ)Z", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n33#2,6:239\n33#2,6:245\n33#2,6:251\n86#2,2:257\n33#2,6:259\n88#2:265\n86#2,2:266\n33#2,6:268\n88#2:274\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n129#1:239,6\n160#1:245,6\n183#1:251,6\n226#1:257,2\n226#1:259,6\n226#1:265\n237#1:266,2\n237#1:268,6\n237#1:274\n*E\n"})
/* loaded from: classes4.dex */
public final class SelectionGesturesKt {
    public static final double ClicksSlop = 100.0d;
    private static final int STATIC_KEY = 8675309;

    /* compiled from: SelectionGestures.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m7120f = "SelectionGestures.kt", m7121i = {0}, m7122l = {225}, m7123m = "awaitDown", m7124n = {"$this$awaitDown"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 */
    /* loaded from: classes2.dex */
    public static final class C08831 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C08831(Continuation<? super C08831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m7120f = "SelectionGestures.kt", m7121i = {0, 0, 1, 1}, m7122l = {Cea708Decoder.COMMAND_DF1, 176}, m7123m = "mouseSelection", m7124n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 */
    /* loaded from: classes2.dex */
    public static final class C08841 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C08841(Continuation<? super C08841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m7120f = "SelectionGestures.kt", m7121i = {0, 0, 0, 1, 1}, m7122l = {119, 123}, m7123m = "touchSelection", m7124n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 */
    /* loaded from: classes2.dex */
    public static final class C08861 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C08861(Continuation<? super C08861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", m7120f = "SelectionGestures.kt", m7121i = {}, m7122l = {86}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1 */
    /* loaded from: classes2.dex */
    public static final class C08881 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08881(Function1<? super Boolean, Unit> function1, Continuation<? super C08881> continuation) {
            super(2, continuation);
            this.$updateTouchMode = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C08881 c08881 = new C08881(this.$updateTouchMode, continuation);
            c08881.L$0 = obj;
            return c08881;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08881) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SelectionGestures.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m7120f = "SelectionGestures.kt", m7121i = {0}, m7122l = {88}, m7123m = "invokeSuspend", m7124n = {"$this$awaitPointerEventScope"}, m7125s = {"L$0"})
        /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$updateTouchMode = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, continuation);
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
            /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.label
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r5)
                    goto L31
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1c:
                    kotlin.ResultKt.throwOnFailure(r5)
                    java.lang.Object r5 = r4.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r5
                    r1 = r5
                L24:
                    androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p003ui.input.pointer.PointerEventPass.Initial
                    r4.L$0 = r1
                    r4.label = r2
                    java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                    if (r5 != r0) goto L31
                    return r0
                L31:
                    androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p003ui.input.pointer.PointerEvent) r5
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.$updateTouchMode
                    boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r3.invoke(r5)
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C08881.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, null);
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

    @NotNull
    public static final Modifier updateSelectionTouchMode(@NotNull Modifier modifier, @NotNull Function1<? super Boolean, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new C08881(function1, null));
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", m7120f = "SelectionGestures.kt", m7121i = {}, m7122l = {99}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1 */
    /* loaded from: classes2.dex */
    public static final class C08851 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        public final /* synthetic */ TextDragObserver $textDragObserver;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08851(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super C08851> continuation) {
            super(2, continuation);
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C08851 c08851 = new C08851(this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            c08851.L$0 = obj;
            return c08851;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08851) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), this.$textDragObserver, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SelectionGestures.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", m7120f = "SelectionGestures.kt", m7121i = {0}, m7122l = {100, 106, 108}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture"}, m7125s = {"L$0"})
        @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n86#2,2:239\n33#2,6:241\n88#2:247\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n104#1:239,2\n104#1:241,6\n104#1:247\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ ClicksCounter $clicksCounter;
            public final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
            public final /* synthetic */ TextDragObserver $textDragObserver;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$mouseSelectionObserver = mouseSelectionObserver;
                this.$clicksCounter = clicksCounter;
                this.$textDragObserver = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                AwaitPointerEventScope awaitPointerEventScope;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    obj = SelectionGesturesKt.awaitDown(awaitPointerEventScope, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                PointerEvent pointerEvent = (PointerEvent) obj;
                if (!SelectionGesturesKt.isPrecisePointer(pointerEvent) || !PointerEvent_androidKt.m12457isPrimaryPressedaHzCxE(pointerEvent.getButtons())) {
                    if (!SelectionGesturesKt.isPrecisePointer(pointerEvent)) {
                        TextDragObserver textDragObserver = this.$textDragObserver;
                        this.L$0 = null;
                        this.label = 3;
                        if (SelectionGesturesKt.touchSelection(awaitPointerEventScope, textDragObserver, pointerEvent, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    int size = pointerEvent.getChanges().size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!(!r5.get(i2).isConsumed())) {
                            if (!SelectionGesturesKt.isPrecisePointer(pointerEvent)) {
                            }
                        }
                    }
                    MouseSelectionObserver mouseSelectionObserver = this.$mouseSelectionObserver;
                    ClicksCounter clicksCounter = this.$clicksCounter;
                    this.L$0 = null;
                    this.label = 2;
                    if (SelectionGesturesKt.mouseSelection(awaitPointerEventScope, mouseSelectionObserver, clicksCounter, pointerEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public static final Modifier selectionGestureInput(@NotNull Modifier modifier, @NotNull MouseSelectionObserver mouseSelectionObserver, @NotNull TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new C08851(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[Catch: CancellationException -> 0x0036, TryCatch #0 {CancellationException -> 0x0036, blocks: (B:13:0x0031, B:33:0x00a7, B:35:0x00af, B:37:0x00be, B:39:0x00ca, B:40:0x00cd, B:41:0x00d0, B:42:0x00d4, B:20:0x004e, B:26:0x0075, B:28:0x0079, B:30:0x0087, B:23:0x0058), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[Catch: CancellationException -> 0x0036, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0036, blocks: (B:13:0x0031, B:33:0x00a7, B:35:0x00af, B:37:0x00be, B:39:0x00ca, B:40:0x00cd, B:41:0x00d0, B:42:0x00d4, B:20:0x004e, B:26:0x0075, B:28:0x0079, B:30:0x0087, B:23:0x0058), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelection(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) throws Throwable {
        C08861 c08861;
        PointerInputChange pointerInputChange;
        if (continuation instanceof C08861) {
            c08861 = (C08861) continuation;
            int i = c08861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08861.label = i - Integer.MIN_VALUE;
            } else {
                c08861 = new C08861(continuation);
            }
        }
        Object objM7900awaitLongPressOrCancellationrnUCldI = c08861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08861.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM7900awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.first((List) pointerEvent.getChanges());
                long id = pointerInputChange.getId();
                c08861.L$0 = awaitPointerEventScope;
                c08861.L$1 = textDragObserver;
                c08861.L$2 = pointerInputChange;
                c08861.label = 1;
                objM7900awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m7900awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, c08861);
                if (objM7900awaitLongPressOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textDragObserver = (TextDragObserver) c08861.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) c08861.L$0;
                    ResultKt.throwOnFailure(objM7900awaitLongPressOrCancellationrnUCldI);
                    if (!((Boolean) objM7900awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            PointerInputChange pointerInputChange2 = changes.get(i3);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        textDragObserver.onStop();
                    } else {
                        textDragObserver.onCancel();
                    }
                    return Unit.INSTANCE;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) c08861.L$2;
                textDragObserver = (TextDragObserver) c08861.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) c08861.L$0;
                ResultKt.throwOnFailure(objM7900awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = pointerInputChange3;
                awaitPointerEventScope = awaitPointerEventScope2;
            }
            PointerInputChange pointerInputChange4 = (PointerInputChange) objM7900awaitLongPressOrCancellationrnUCldI;
            if (pointerInputChange4 != null && m8559distanceIsTolerable2x9bVx0(awaitPointerEventScope, pointerInputChange.getPosition(), pointerInputChange4.getPosition())) {
                textDragObserver.mo8466onStartk4lQ0M(pointerInputChange4.getPosition());
                long id2 = pointerInputChange4.getId();
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull PointerInputChange pointerInputChange5) {
                        textDragObserver.mo8465onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }
                };
                c08861.L$0 = awaitPointerEventScope;
                c08861.L$1 = textDragObserver;
                c08861.L$2 = null;
                c08861.label = 2;
                objM7900awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m7909dragjO51t88(awaitPointerEventScope, id2, function1, c08861);
                if (objM7900awaitLongPressOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) objM7900awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mouseSelection(AwaitPointerEventScope awaitPointerEventScope, final MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, Continuation<? super Unit> continuation) throws Throwable {
        C08841 c08841;
        final SelectionAdjustment none;
        if (continuation instanceof C08841) {
            c08841 = (C08841) continuation;
            int i = c08841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08841.label = i - Integer.MIN_VALUE;
            } else {
                c08841 = new C08841(continuation);
            }
        }
        Object objM7909dragjO51t88 = c08841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08841.label;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7909dragjO51t88);
            clicksCounter.update(pointerEvent);
            PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
            if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                if (mouseSelectionObserver.mo8538onExtendk4lQ0M(pointerInputChange.getPosition())) {
                    long id = pointerInputChange.getId();
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1
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
                            if (mouseSelectionObserver.mo8539onExtendDragk4lQ0M(pointerInputChange2.getPosition())) {
                                pointerInputChange2.consume();
                            }
                        }
                    };
                    c08841.L$0 = awaitPointerEventScope;
                    c08841.L$1 = mouseSelectionObserver;
                    c08841.label = 1;
                    objM7909dragjO51t88 = DragGestureDetectorKt.m7909dragjO51t88(awaitPointerEventScope, id, function1, c08841);
                    if (objM7909dragjO51t88 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                    }
                    mouseSelectionObserver.onDragDone();
                }
            } else {
                int clicks = clicksCounter.getClicks();
                if (clicks == 1) {
                    none = SelectionAdjustment.INSTANCE.getNone();
                } else if (clicks == 2) {
                    none = SelectionAdjustment.INSTANCE.getWord();
                } else {
                    none = SelectionAdjustment.INSTANCE.getParagraph();
                }
                if (mouseSelectionObserver.mo8540onStart3MmeM6k(pointerInputChange.getPosition(), none)) {
                    long id2 = pointerInputChange.getId();
                    Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            if (mouseSelectionObserver.mo8537onDrag3MmeM6k(pointerInputChange2.getPosition(), none)) {
                                pointerInputChange2.consume();
                            }
                        }
                    };
                    c08841.L$0 = awaitPointerEventScope;
                    c08841.L$1 = mouseSelectionObserver;
                    c08841.label = 2;
                    objM7909dragjO51t88 = DragGestureDetectorKt.m7909dragjO51t88(awaitPointerEventScope, id2, function12, c08841);
                    if (objM7909dragjO51t88 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                    }
                    mouseSelectionObserver.onDragDone();
                }
            }
        } else if (i2 == 1) {
            mouseSelectionObserver = (MouseSelectionObserver) c08841.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) c08841.L$0;
            ResultKt.throwOnFailure(objM7909dragjO51t88);
            if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                int size = changes.size();
                while (i3 < size) {
                    PointerInputChange pointerInputChange2 = changes.get(i3);
                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                        pointerInputChange2.consume();
                    }
                    i3++;
                }
            }
            mouseSelectionObserver.onDragDone();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mouseSelectionObserver = (MouseSelectionObserver) c08841.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) c08841.L$0;
            ResultKt.throwOnFailure(objM7909dragjO51t88);
            if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                List<PointerInputChange> changes2 = awaitPointerEventScope.getCurrentEvent().getChanges();
                int size2 = changes2.size();
                while (i3 < size2) {
                    PointerInputChange pointerInputChange3 = changes2.get(i3);
                    if (PointerEventKt.changedToUp(pointerInputChange3)) {
                        pointerInputChange3.consume();
                    }
                    i3++;
                }
            }
            mouseSelectionObserver.onDragDone();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDown(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerEvent> continuation) throws Throwable {
        C08831 c08831;
        int size;
        int i;
        if (continuation instanceof C08831) {
            c08831 = (C08831) continuation;
            int i2 = c08831.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c08831.label = i2 - Integer.MIN_VALUE;
            } else {
                c08831 = new C08831(continuation);
            }
        }
        Object objAwaitPointerEvent = c08831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c08831.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent);
            PointerEventPass pointerEventPass = PointerEventPass.Main;
            c08831.L$0 = awaitPointerEventScope;
            c08831.label = 1;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c08831);
            if (objAwaitPointerEvent == coroutine_suspended) {
            }
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (i < size) {
            }
            return pointerEvent;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope = (AwaitPointerEventScope) c08831.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent);
        PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent;
        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
        size = changes2.size();
        i = 0;
        while (i < size) {
            if (PointerEventKt.changedToDownIgnoreConsumed(changes2.get(i))) {
                i++;
            } else {
                PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                c08831.L$0 = awaitPointerEventScope;
                c08831.label = 1;
                objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, c08831);
                if (objAwaitPointerEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent;
                List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return pointerEvent22;
    }

    /* renamed from: distanceIsTolerable-2x9bVx0, reason: not valid java name */
    private static final boolean m8559distanceIsTolerable2x9bVx0(AwaitPointerEventScope awaitPointerEventScope, long j, long j2) {
        return Offset.m11097getDistanceimpl(Offset.m11103minusMKHz9U(j, j2)) < awaitPointerEventScope.getViewConfiguration().getTouchSlop();
    }

    public static final boolean isPrecisePointer(@NotNull PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m12556equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m12561getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
