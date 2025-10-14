package io.ktor.client.engine.android;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.client.network.sockets.TimeoutExceptionsCommonKt;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.jvm.javaio.ReadingKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidURLConnectionUtils.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a7\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00110\u0013H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m7105d2 = {"content", "Lio/ktor/utils/io/ByteReadChannel;", "Ljava/net/HttpURLConnection;", "callContext", "Lkotlin/coroutines/CoroutineContext;", "request", "Lio/ktor/client/request/HttpRequestData;", "isTimeoutException", "", "", "setupRequestTimeoutAttributes", "", "timeoutAttributes", "Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;", "setupTimeoutAttributes", "requestData", "timeoutAwareConnection", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidURLConnectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidURLConnectionUtils.kt\nio/ktor/client/engine/android/AndroidURLConnectionUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes4.dex */
public final class AndroidURLConnectionUtilsKt {

    /* compiled from: AndroidURLConnectionUtils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", m7120f = "AndroidURLConnectionUtils.kt", m7121i = {0, 0}, m7122l = {60}, m7123m = "timeoutAwareConnection", m7124n = {"request", "cause"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 */
    /* loaded from: classes8.dex */
    public static final class C101261<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101261(Continuation<? super C101261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidURLConnectionUtilsKt.timeoutAwareConnection(null, null, null, this);
        }
    }

    public static final void setupTimeoutAttributes(@NotNull HttpURLConnection httpURLConnection, @NotNull HttpRequestData requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) requestData.getCapabilityOrNull(HttpTimeout.INSTANCE);
        if (httpTimeoutCapabilityConfiguration != null) {
            Long l = httpTimeoutCapabilityConfiguration.get_connectTimeoutMillis();
            if (l != null) {
                httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l.longValue()));
            }
            Long l2 = httpTimeoutCapabilityConfiguration.get_socketTimeoutMillis();
            if (l2 != null) {
                httpURLConnection.setReadTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l2.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutCapabilityConfiguration);
        }
    }

    public static final void setupRequestTimeoutAttributes(HttpURLConnection httpURLConnection, HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration) {
        Long l = httpTimeoutCapabilityConfiguration.get_requestTimeoutMillis();
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(jLongValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object timeoutAwareConnection(@NotNull HttpURLConnection httpURLConnection, @NotNull HttpRequestData httpRequestData, @NotNull Function1<? super HttpURLConnection, ? extends T> function1, @NotNull Continuation<? super T> continuation) {
        C101261 c101261;
        if (continuation instanceof C101261) {
            c101261 = (C101261) continuation;
            int i = c101261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101261.label = i - Integer.MIN_VALUE;
            } else {
                c101261 = new C101261(continuation);
            }
        }
        Object obj = c101261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                return function1.invoke(httpURLConnection);
            } catch (Throwable th) {
                th = th;
                c101261.L$0 = httpRequestData;
                c101261.L$1 = th;
                c101261.label = 1;
                if (YieldKt.yield(c101261) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) c101261.L$1;
            httpRequestData = (HttpRequestData) c101261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (isTimeoutException(th)) {
            throw HttpTimeoutKt.ConnectTimeoutException(httpRequestData, th);
        }
        throw th;
    }

    @NotNull
    public static final ByteReadChannel content(@NotNull HttpURLConnection httpURLConnection, @NotNull CoroutineContext callContext, @NotNull HttpRequestData request) {
        ByteReadChannel byteReadChannel;
        ByteReadChannel byteReadChannelMapEngineExceptions;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (bufferedInputStream == null || (byteReadChannel = ReadingKt.toByteReadChannel(bufferedInputStream, callContext, ByteBufferPoolKt.getKtorDefaultPool())) == null || (byteReadChannelMapEngineExceptions = TimeoutExceptionsCommonKt.mapEngineExceptions(CoroutineScopeKt.CoroutineScope(callContext), byteReadChannel, request)) == null) ? ByteReadChannel.INSTANCE.getEmpty() : byteReadChannelMapEngineExceptions;
    }

    public static final boolean isTimeoutException(Throwable th) {
        if (!(th instanceof SocketTimeoutException)) {
            if (!(th instanceof ConnectException)) {
                return false;
            }
            String message = th.getMessage();
            if (!(message != null ? StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "timed out", false, 2, (Object) null) : false)) {
                return false;
            }
        }
        return true;
    }
}
