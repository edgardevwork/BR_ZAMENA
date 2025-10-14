package ru.rustore.sdk.core.util;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WithTimeoutOrThrow.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00052'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0086@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m7105d2 = {"withTimeoutOrThrow", ExifInterface.GPS_DIRECTION_TRUE, "timeMillis", "", "exceptionFactory", "Lkotlin/Function1;", "Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class WithTimeoutOrThrowKt {

    /* compiled from: WithTimeoutOrThrow.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.core.util.WithTimeoutOrThrowKt", m7120f = "WithTimeoutOrThrow.kt", m7121i = {0}, m7122l = {13}, m7123m = "withTimeoutOrThrow", m7124n = {"exceptionFactory"}, m7125s = {"L$0"})
    /* renamed from: ru.rustore.sdk.core.util.WithTimeoutOrThrowKt$withTimeoutOrThrow$1 */
    /* loaded from: classes5.dex */
    public static final class C115771<T> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C115771(Continuation<? super C115771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WithTimeoutOrThrowKt.withTimeoutOrThrow(0L, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withTimeoutOrThrow(long j, @NotNull Function1<? super TimeoutCancellationException, ? extends Exception> function1, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Exception {
        C115771 c115771;
        if (continuation instanceof C115771) {
            c115771 = (C115771) continuation;
            int i = c115771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115771.label = i - Integer.MIN_VALUE;
            } else {
                c115771 = new C115771(continuation);
            }
        }
        Object objWithTimeout = c115771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c115771.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithTimeout);
                c115771.L$0 = function1;
                c115771.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(j, function2, c115771);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) c115771.L$0;
                ResultKt.throwOnFailure(objWithTimeout);
            }
            return objWithTimeout;
        } catch (TimeoutCancellationException e) {
            throw function1.invoke(e);
        }
    }

    public static /* synthetic */ Object withTimeoutOrThrow$default(long j, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<TimeoutCancellationException, TimeoutCancellationException>() { // from class: ru.rustore.sdk.core.util.WithTimeoutOrThrowKt.withTimeoutOrThrow.2
                @Override // kotlin.jvm.functions.Function1
                public final TimeoutCancellationException invoke(TimeoutCancellationException it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it;
                }
            };
        }
        return withTimeoutOrThrow(j, function1, function2, continuation);
    }
}
