package io.ktor.client.plugins.logging;

import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Logging.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "it", "Lio/ktor/client/statement/HttpResponse;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1", m7120f = "Logging.kt", m7121i = {0, 0, 1, 3, 5}, m7122l = {222, 225, 226, 225, 226, 225, 226}, m7123m = "invokeSuspend", m7124n = {"logger", "log", "logger", "logger", "logger"}, m7125s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class Logging$setupResponseLogging$observer$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Logging this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logging$setupResponseLogging$observer$1(Logging logging, Continuation<? super Logging$setupResponseLogging$observer$1> continuation) {
        super(2, continuation);
        this.this$0 = logging;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Logging$setupResponseLogging$observer$1 logging$setupResponseLogging$observer$1 = new Logging$setupResponseLogging$observer$1(this.this$0, continuation);
        logging$setupResponseLogging$observer$1.L$0 = obj;
        return logging$setupResponseLogging$observer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
        return ((Logging$setupResponseLogging$observer$1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        HttpClientCallLogger httpClientCallLogger;
        StringBuilder sb;
        String string;
        String string2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                HttpResponse httpResponse = (HttpResponse) this.L$0;
                if (this.this$0.getLevel() != LogLevel.NONE && !httpResponse.getCall().getAttributes().contains(LoggingKt.DisableLogging)) {
                    httpClientCallLogger = (HttpClientCallLogger) httpResponse.getCall().getAttributes().get(LoggingKt.ClientCallLogger);
                    sb = new StringBuilder();
                    try {
                        ContentType contentType = HttpMessagePropertiesKt.contentType(httpResponse);
                        ByteReadChannel content = httpResponse.getContent();
                        this.L$0 = httpClientCallLogger;
                        this.L$1 = sb;
                        this.label = 1;
                        if (LoggingUtilsKt.logResponseBody(sb, contentType, content, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String string3 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "log.toString()");
                        string2 = StringsKt__StringsKt.trim((CharSequence) string3).toString();
                        this.L$0 = httpClientCallLogger;
                        this.L$1 = null;
                        this.label = 2;
                        if (httpClientCallLogger.logResponseBody(string2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.L$0 = null;
                        this.label = 3;
                        if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable unused) {
                        String string4 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string4, "log.toString()");
                        string = StringsKt__StringsKt.trim((CharSequence) string4).toString();
                        this.L$0 = httpClientCallLogger;
                        this.L$1 = null;
                        this.label = 4;
                        if (httpClientCallLogger.logResponseBody(string, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                StringBuilder sb2 = (StringBuilder) this.L$1;
                HttpClientCallLogger httpClientCallLogger2 = (HttpClientCallLogger) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    sb = sb2;
                    httpClientCallLogger = httpClientCallLogger2;
                    String string32 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string32, "log.toString()");
                    string2 = StringsKt__StringsKt.trim((CharSequence) string32).toString();
                    this.L$0 = httpClientCallLogger;
                    this.L$1 = null;
                    this.label = 2;
                    if (httpClientCallLogger.logResponseBody(string2, this) == coroutine_suspended) {
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                    }
                } catch (Throwable unused2) {
                    sb = sb2;
                    httpClientCallLogger = httpClientCallLogger2;
                    String string42 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string42, "log.toString()");
                    string = StringsKt__StringsKt.trim((CharSequence) string42).toString();
                    this.L$0 = httpClientCallLogger;
                    this.L$1 = null;
                    this.label = 4;
                    if (httpClientCallLogger.logResponseBody(string, this) == coroutine_suspended) {
                    }
                    this.L$0 = null;
                    this.label = 5;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 2:
                httpClientCallLogger = (HttpClientCallLogger) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 3:
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                httpClientCallLogger = (HttpClientCallLogger) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 5;
                if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 6:
                Throwable th = (Throwable) this.L$1;
                HttpClientCallLogger httpClientCallLogger3 = (HttpClientCallLogger) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = th;
                this.L$1 = null;
                this.label = 7;
                if (httpClientCallLogger3.closeResponseLog(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            case 7:
                Throwable th2 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                throw th2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
