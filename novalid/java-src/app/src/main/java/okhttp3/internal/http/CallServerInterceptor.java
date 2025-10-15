package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;

/* compiled from: CallServerInterceptor.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CallServerInterceptor implements Interceptor {
    public final boolean forWebSocket;

    public final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response.Builder responseHeaders;
        Response responseBuild;
        int iCode;
        Response responseBuild2;
        ResponseBody responseBodyBody;
        Response.Builder builder2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            ?? PermitsRequestBody = HttpMethod.permitsRequestBody(request.method());
            try {
                if (PermitsRequestBody != 0 && requestBodyBody != null) {
                    if (StringsKt__StringsJVMKt.equals(HTTP.EXPECT_CONTINUE, request.header("Expect"), true)) {
                        exchange.flushRequest();
                        Response.Builder responseHeaders2 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            builder2 = responseHeaders2;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            builder = responseHeaders2;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            responseHeaders = builder;
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            if (responseHeaders == null) {
                            }
                            responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            iCode = responseBuild.code();
                            if (shouldIgnoreAndWaitForRealResponse(iCode)) {
                            }
                            exchange.responseHeadersEnd(responseBuild);
                            if (!this.forWebSocket) {
                                responseBuild2 = responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
                            }
                            if (!StringsKt__StringsJVMKt.equals("close", responseBuild2.request().header("Connection"), true)) {
                                exchange.noNewExchangesOnConnection();
                            }
                            if (iCode != 204) {
                                responseBodyBody = responseBuild2.body();
                                if ((responseBodyBody == null ? responseBodyBody.getContentLength() : -1L) > 0) {
                                }
                            }
                            return responseBuild2;
                        }
                    } else {
                        z = true;
                        builder2 = null;
                    }
                    if (builder2 == null) {
                        if (requestBodyBody.isDuplex()) {
                            exchange.flushRequest();
                            requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                            PermitsRequestBody = builder2;
                        } else {
                            BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                            requestBodyBody.writeTo(bufferedSinkBuffer);
                            bufferedSinkBuffer.close();
                            PermitsRequestBody = builder2;
                        }
                    } else {
                        exchange.noRequestBody();
                        PermitsRequestBody = builder2;
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                            PermitsRequestBody = builder2;
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    PermitsRequestBody = 0;
                }
                if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
                    exchange.finishRequest();
                }
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e2) {
                e = e2;
                builder = PermitsRequestBody;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            builder = null;
        }
        if (responseHeaders == null) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders3 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders3);
            if (z) {
                exchange.responseHeadersStart();
            }
            responseBuild = responseHeaders3.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange.responseHeadersEnd(responseBuild);
        if (!this.forWebSocket && iCode == 101) {
            responseBuild2 = responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            responseBuild2 = responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
        }
        if (!StringsKt__StringsJVMKt.equals("close", responseBuild2.request().header("Connection"), true) || StringsKt__StringsJVMKt.equals("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode != 204 || iCode == 205) {
            responseBodyBody = responseBuild2.body();
            if ((responseBodyBody == null ? responseBodyBody.getContentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iCode);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                sb.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return responseBuild2;
    }
}
