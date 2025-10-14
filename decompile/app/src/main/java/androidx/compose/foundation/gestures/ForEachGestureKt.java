package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ForEachGesture.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@¢\u0006\u0002\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0087@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m7105d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n329#2:123\n329#2:142\n101#3,2:124\n33#3,6:126\n103#3:132\n101#3,2:133\n33#3,6:135\n103#3:141\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:123\n100#1:142\n71#1:124,2\n71#1:126,6\n71#1:132\n87#1:133,2\n87#1:135,6\n87#1:141\n*E\n"})
/* loaded from: classes2.dex */
public final class ForEachGestureKt {

    /* compiled from: ForEachGesture.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.ForEachGestureKt", m7120f = "ForEachGesture.kt", m7121i = {0}, m7122l = {86}, m7123m = "awaitAllPointersUp", m7124n = {"$this$awaitAllPointersUp"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 */
    public static final class C04773 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C04773(Continuation<? super C04773> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.ForEachGestureKt", m7120f = "ForEachGesture.kt", m7121i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m7122l = {48, 51, 56}, m7123m = "forEachGesture", m7124n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 */
    public static final class C04791 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C04791(Continuation<? super C04791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0092 -> B:66:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00ac -> B:66:0x0053). Please report as a decompilation issue!!! */
    @Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachGesture(@NotNull PointerInputScope pointerInputScope, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C04791 c04791;
        Object objAwaitAllPointersUp;
        CoroutineContext coroutineContext;
        PointerInputScope pointerInputScope2;
        CoroutineContext coroutineContext2;
        PointerInputScope pointerInputScope3;
        if (continuation instanceof C04791) {
            c04791 = (C04791) continuation;
            int i = c04791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04791.label = i - Integer.MIN_VALUE;
            } else {
                c04791 = new C04791(continuation);
            }
        }
        Object obj = c04791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c04791.label;
        try {
        } catch (CancellationException e) {
            e = e;
            if (!JobKt.isActive(pointerInputScope)) {
            }
        }
        if (r2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineContext = c04791.getContext();
            pointerInputScope2 = pointerInputScope;
            if (JobKt.isActive(coroutineContext)) {
            }
        } else if (r2 != 1) {
            if (r2 == 2) {
                CoroutineContext coroutineContext3 = (CoroutineContext) c04791.L$2;
                function2 = (Function2) c04791.L$1;
                PointerInputScope pointerInputScope4 = (PointerInputScope) c04791.L$0;
                ResultKt.throwOnFailure(obj);
                pointerInputScope3 = pointerInputScope4;
                coroutineContext2 = coroutineContext3;
            } else {
                if (r2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineContext coroutineContext4 = (CoroutineContext) c04791.L$2;
                function2 = (Function2) c04791.L$1;
                PointerInputScope pointerInputScope5 = (PointerInputScope) c04791.L$0;
                ResultKt.throwOnFailure(obj);
                pointerInputScope3 = pointerInputScope5;
                coroutineContext2 = coroutineContext4;
            }
            coroutineContext = coroutineContext2;
            pointerInputScope2 = pointerInputScope3;
            if (JobKt.isActive(coroutineContext)) {
                try {
                } catch (CancellationException e2) {
                    r2 = pointerInputScope2;
                    pointerInputScope = coroutineContext;
                    e = e2;
                    if (!JobKt.isActive(pointerInputScope)) {
                        c04791.L$0 = r2;
                        c04791.L$1 = function2;
                        c04791.L$2 = pointerInputScope;
                        c04791.label = 3;
                        Object objAwaitAllPointersUp2 = awaitAllPointersUp((PointerInputScope) r2, c04791);
                        pointerInputScope3 = r2;
                        coroutineContext2 = pointerInputScope;
                        if (objAwaitAllPointersUp2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineContext = coroutineContext2;
                        pointerInputScope2 = pointerInputScope3;
                        if (JobKt.isActive(coroutineContext)) {
                        }
                    } else {
                        throw e;
                    }
                }
                c04791.L$0 = pointerInputScope2;
                c04791.L$1 = function2;
                c04791.L$2 = coroutineContext;
                c04791.label = 1;
                if (function2.invoke(pointerInputScope2, c04791) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = pointerInputScope2;
                pointerInputScope = coroutineContext;
                c04791.L$0 = r2;
                c04791.L$1 = function2;
                c04791.L$2 = pointerInputScope;
                c04791.label = 2;
                objAwaitAllPointersUp = awaitAllPointersUp((PointerInputScope) r2, c04791);
                pointerInputScope3 = r2;
                coroutineContext2 = pointerInputScope;
                if (objAwaitAllPointersUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineContext = coroutineContext2;
                pointerInputScope2 = pointerInputScope3;
                if (JobKt.isActive(coroutineContext)) {
                    return Unit.INSTANCE;
                }
            }
        } else {
            CoroutineContext coroutineContext5 = (CoroutineContext) c04791.L$2;
            function2 = (Function2) c04791.L$1;
            PointerInputScope pointerInputScope6 = (PointerInputScope) c04791.L$0;
            ResultKt.throwOnFailure(obj);
            r2 = pointerInputScope6;
            pointerInputScope = coroutineContext5;
            c04791.L$0 = r2;
            c04791.L$1 = function2;
            c04791.L$2 = pointerInputScope;
            c04791.label = 2;
            objAwaitAllPointersUp = awaitAllPointersUp((PointerInputScope) r2, c04791);
            pointerInputScope3 = r2;
            coroutineContext2 = pointerInputScope;
            if (objAwaitAllPointersUp == coroutine_suspended) {
            }
            coroutineContext = coroutineContext2;
            pointerInputScope2 = pointerInputScope3;
            if (JobKt.isActive(coroutineContext)) {
            }
        }
    }

    public static final boolean allPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m7120f = "ForEachGesture.kt", m7121i = {}, m7122l = {77}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 */
    /* loaded from: classes3.dex */
    public static final class C04762 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C04762(Continuation<? super C04762> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04762 c04762 = new C04762(continuation);
            c04762.L$0 = obj;
            return c04762;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04762) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope, this) == coroutine_suspended) {
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

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C04762(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003d, code lost:
    
        if (allPointersUp(r6) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0049 -> B:48:0x004c). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C04773 c04773;
        if (continuation instanceof C04773) {
            c04773 = (C04773) continuation;
            int i = c04773.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04773.label = i - Integer.MIN_VALUE;
            } else {
                c04773 = new C04773(continuation);
            }
        }
        Object objAwaitPointerEvent = c04773.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04773.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) c04773.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent);
            List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
            int size = changes.size();
            int i3 = 0;
            while (i3 < size) {
                if (changes.get(i3).getPressed()) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    c04773.L$0 = awaitPointerEventScope;
                    c04773.label = 1;
                    objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c04773);
                    if (objAwaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent).getChanges();
                    int size2 = changes2.size();
                    int i32 = 0;
                    while (i32 < size2) {
                    }
                } else {
                    i32++;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objAwaitPointerEvent);
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m7120f = "ForEachGesture.kt", m7121i = {0, 1, 2}, m7122l = {104, 107, 112}, m7123m = "invokeSuspend", m7124n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, m7125s = {"L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 */
    /* loaded from: classes3.dex */
    public static final class C04782 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
        public final /* synthetic */ CoroutineContext $currentContext;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04782(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04782> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04782 c04782 = new C04782(this.$currentContext, this.$block, continuation);
            c04782.L$0 = obj;
            return c04782;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04782) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:69:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x005a -> B:54:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0071 -> B:54:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objAwaitAllPointersUp;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (CancellationException e) {
                e = e;
                if (!JobKt.isActive(this.$currentContext)) {
                    this.L$0 = r1;
                    this.label = 3;
                    Object objAwaitAllPointersUp2 = ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) r1, this);
                    awaitPointerEventScope2 = r1;
                    if (objAwaitAllPointersUp2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    if (JobKt.isActive(this.$currentContext)) {
                    }
                } else {
                    throw e;
                }
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                if (JobKt.isActive(this.$currentContext)) {
                }
            } else if (r1 != 1) {
                if (r1 == 2) {
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                if (JobKt.isActive(this.$currentContext)) {
                    try {
                    } catch (CancellationException e2) {
                        r1 = awaitPointerEventScope;
                        e = e2;
                        if (!JobKt.isActive(this.$currentContext)) {
                        }
                    }
                    Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    if (function2.invoke(awaitPointerEventScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = awaitPointerEventScope;
                    this.L$0 = r1;
                    this.label = 2;
                    objAwaitAllPointersUp = ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) r1, this);
                    awaitPointerEventScope2 = r1;
                    if (objAwaitAllPointersUp == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    if (JobKt.isActive(this.$currentContext)) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = awaitPointerEventScope5;
                this.L$0 = r1;
                this.label = 2;
                objAwaitAllPointersUp = ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) r1, this);
                awaitPointerEventScope2 = r1;
                if (objAwaitAllPointersUp == coroutine_suspended) {
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                if (JobKt.isActive(this.$currentContext)) {
                }
            }
        }
    }

    @Nullable
    public static final Object awaitEachGesture(@NotNull PointerInputScope pointerInputScope, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C04782(continuation.getContext(), function2, null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }
}
