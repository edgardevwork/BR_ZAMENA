package io.ktor.utils.p050io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LookAheadSession.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086Hø\u0001\u0001¢\u0006\u0002\u0010\u000b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"consumeEachRemaining", "", "Lio/ktor/utils/io/LookAheadSession;", "visitor", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "Lio/ktor/utils/io/LookAheadSuspendSession;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/utils/io/LookAheadSuspendSession;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class LookAheadSessionKt {

    /* compiled from: LookAheadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.LookAheadSessionKt", m7120f = "LookAheadSession.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {54, 59}, m7123m = "consumeEachRemaining", m7124n = {"$this$consumeEachRemaining", "visitor", "$this$consumeEachRemaining", "visitor", "s"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nLookAheadSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookAheadSession.kt\nio/ktor/utils/io/LookAheadSessionKt$consumeEachRemaining$1\n*L\n1#1,65:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.LookAheadSessionKt$consumeEachRemaining$1 */
    /* loaded from: classes7.dex */
    public static final class C104911 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104911(Continuation<? super C104911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LookAheadSessionKt.consumeEachRemaining(null, null, this);
        }
    }

    public static final void consumeEachRemaining(@NotNull LookAheadSession lookAheadSession, @NotNull Function1<? super ByteBuffer, Boolean> visitor) {
        boolean z;
        Intrinsics.checkNotNullParameter(lookAheadSession, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        do {
            z = false;
            ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
            if (byteBufferRequest != null) {
                int iRemaining = byteBufferRequest.remaining();
                boolean zBooleanValue = visitor.invoke(byteBufferRequest).booleanValue();
                lookAheadSession.mo15689consumed(iRemaining);
                z = zBooleanValue;
            }
        } while (z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:17:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:30:0x0086). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeEachRemaining(@NotNull LookAheadSuspendSession lookAheadSuspendSession, @NotNull Function2<? super ByteBuffer, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104911 c104911;
        LookAheadSuspendSession lookAheadSuspendSession2;
        Function2<? super ByteBuffer, ? super Continuation<? super Boolean>, ? extends Object> function22;
        ByteBuffer byteBufferRequest;
        if (continuation instanceof C104911) {
            c104911 = (C104911) continuation;
            int i = c104911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104911.label = i - Integer.MIN_VALUE;
            } else {
                c104911 = new C104911(continuation);
            }
        }
        Object objInvoke = c104911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104911.label;
        if (i2 != 0) {
            if (i2 == 1) {
                function22 = (Function2) c104911.L$1;
                lookAheadSuspendSession2 = (LookAheadSuspendSession) c104911.L$0;
                ResultKt.throwOnFailure(objInvoke);
                if (((Boolean) objInvoke).booleanValue()) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = c104911.I$0;
            function2 = (Function2) c104911.L$1;
            LookAheadSuspendSession lookAheadSuspendSession3 = (LookAheadSuspendSession) c104911.L$0;
            ResultKt.throwOnFailure(objInvoke);
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            lookAheadSuspendSession3.mo15689consumed(i3);
            if (zBooleanValue) {
                lookAheadSuspendSession = lookAheadSuspendSession3;
                byteBufferRequest = lookAheadSuspendSession.request(0, 1);
                if (byteBufferRequest == null) {
                    c104911.L$0 = lookAheadSuspendSession;
                    c104911.L$1 = function2;
                    c104911.label = 1;
                    objInvoke = lookAheadSuspendSession.awaitAtLeast(1, c104911);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Function2<? super ByteBuffer, ? super Continuation<? super Boolean>, ? extends Object> function23 = function2;
                    lookAheadSuspendSession2 = lookAheadSuspendSession;
                    function22 = function23;
                    if (((Boolean) objInvoke).booleanValue()) {
                        LookAheadSuspendSession lookAheadSuspendSession4 = lookAheadSuspendSession2;
                        function2 = function22;
                        lookAheadSuspendSession = lookAheadSuspendSession4;
                        byteBufferRequest = lookAheadSuspendSession.request(0, 1);
                        if (byteBufferRequest == null) {
                            int iRemaining = byteBufferRequest.remaining();
                            c104911.L$0 = lookAheadSuspendSession;
                            c104911.L$1 = function2;
                            c104911.I$0 = iRemaining;
                            c104911.label = 2;
                            objInvoke = function2.invoke(byteBufferRequest, c104911);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            lookAheadSuspendSession3 = lookAheadSuspendSession;
                            i3 = iRemaining;
                            boolean zBooleanValue2 = ((Boolean) objInvoke).booleanValue();
                            lookAheadSuspendSession3.mo15689consumed(i3);
                            if (zBooleanValue2) {
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        byteBufferRequest = lookAheadSuspendSession.request(0, 1);
        if (byteBufferRequest == null) {
        }
    }

    public static final Object consumeEachRemaining$$forInline(LookAheadSuspendSession lookAheadSuspendSession, Function2<? super ByteBuffer, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        while (true) {
            ByteBuffer byteBufferRequest = lookAheadSuspendSession.request(0, 1);
            if (byteBufferRequest == null) {
                InlineMarker.mark(0);
                Object objAwaitAtLeast = lookAheadSuspendSession.awaitAtLeast(1, continuation);
                InlineMarker.mark(1);
                if (!((Boolean) objAwaitAtLeast).booleanValue()) {
                    break;
                }
            } else {
                int iRemaining = byteBufferRequest.remaining();
                boolean zBooleanValue = ((Boolean) function2.invoke(byteBufferRequest, continuation)).booleanValue();
                lookAheadSuspendSession.mo15689consumed(iRemaining);
                if (!zBooleanValue) {
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
