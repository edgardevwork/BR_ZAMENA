package io.ktor.client.plugins.logging;

import androidx.media3.extractor.p007ts.H262Reader;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.observer.ResponseObserver;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.KtorDsl;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.StringsKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.apache.ivy.core.event.publish.EndArtifactPublishEvent;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Logging.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0002/0BA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u00020!2\n\u0010&\u001a\u00060'j\u0002`(2\u0006\u0010\u001a\u001a\u00020)2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\tH\u0002R,\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m7105d2 = {"Lio/ktor/client/plugins/logging/Logging;", "", "logger", "Lio/ktor/client/plugins/logging/Logger;", "level", "Lio/ktor/client/plugins/logging/LogLevel;", "filters", "", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "sanitizedHeaders", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "(Lio/ktor/client/plugins/logging/Logger;Lio/ktor/client/plugins/logging/LogLevel;Ljava/util/List;Ljava/util/List;)V", "getFilters", "()Ljava/util/List;", "setFilters", "(Ljava/util/List;)V", "getLevel", "()Lio/ktor/client/plugins/logging/LogLevel;", "setLevel", "(Lio/ktor/client/plugins/logging/LogLevel;)V", "getLogger", "()Lio/ktor/client/plugins/logging/Logger;", "logRequest", "Lio/ktor/http/content/OutgoingContent;", "request", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logRequestBody", "content", "Lio/ktor/client/plugins/logging/HttpClientCallLogger;", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/client/plugins/logging/HttpClientCallLogger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logRequestException", "", "context", "cause", "", "logResponseException", "log", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lio/ktor/client/request/HttpRequest;", "setupRequestLogging", "client", "Lio/ktor/client/HttpClient;", "setupResponseLogging", "shouldBeLogged", "Companion", "Config", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/Logging\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n288#2,2:267\n288#2,2:269\n1747#2,3:271\n*S KotlinDebug\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/Logging\n*L\n116#1:267,2\n119#1:269,2\n252#1:271,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Logging {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<Logging> key = new AttributeKey<>("ClientLogging");

    @NotNull
    public List<? extends Function1<? super HttpRequestBuilder, Boolean>> filters;

    @NotNull
    public LogLevel level;

    @NotNull
    public final Logger logger;

    @NotNull
    public final List<SanitizedHeader> sanitizedHeaders;

    public /* synthetic */ Logging(Logger logger, LogLevel logLevel, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, logLevel, list, list2);
    }

    public Logging(Logger logger, LogLevel logLevel, List<? extends Function1<? super HttpRequestBuilder, Boolean>> list, List<SanitizedHeader> list2) {
        this.logger = logger;
        this.level = logLevel;
        this.filters = list;
        this.sanitizedHeaders = list2;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final LogLevel getLevel() {
        return this.level;
    }

    public final void setLevel(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "<set-?>");
        this.level = logLevel;
    }

    public /* synthetic */ Logging(Logger logger, LogLevel logLevel, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, logLevel, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, list2);
    }

    @NotNull
    public final List<Function1<HttpRequestBuilder, Boolean>> getFilters() {
        return this.filters;
    }

    public final void setFilters(@NotNull List<? extends Function1<? super HttpRequestBuilder, Boolean>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.filters = list;
    }

    /* compiled from: Logging.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J$\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\"2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b¨\u0006#"}, m7105d2 = {"Lio/ktor/client/plugins/logging/Logging$Config;", "", "()V", "_logger", "Lio/ktor/client/plugins/logging/Logger;", "filters", "", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "getFilters$ktor_client_logging", "()Ljava/util/List;", "setFilters$ktor_client_logging", "(Ljava/util/List;)V", "level", "Lio/ktor/client/plugins/logging/LogLevel;", "getLevel", "()Lio/ktor/client/plugins/logging/LogLevel;", "setLevel", "(Lio/ktor/client/plugins/logging/LogLevel;)V", "value", "logger", "getLogger", "()Lio/ktor/client/plugins/logging/Logger;", "setLogger", "(Lio/ktor/client/plugins/logging/Logger;)V", "sanitizedHeaders", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "getSanitizedHeaders$ktor_client_logging", "filter", "", "predicate", "sanitizeHeader", "placeholder", "", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {

        @Nullable
        public Logger _logger;

        @NotNull
        public List<Function1<HttpRequestBuilder, Boolean>> filters = new ArrayList();

        @NotNull
        public final List<SanitizedHeader> sanitizedHeaders = new ArrayList();

        @NotNull
        public LogLevel level = LogLevel.HEADERS;

        @NotNull
        public final List<Function1<HttpRequestBuilder, Boolean>> getFilters$ktor_client_logging() {
            return this.filters;
        }

        public final void setFilters$ktor_client_logging(@NotNull List<Function1<HttpRequestBuilder, Boolean>> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.filters = list;
        }

        @NotNull
        public final List<SanitizedHeader> getSanitizedHeaders$ktor_client_logging() {
            return this.sanitizedHeaders;
        }

        @NotNull
        public final Logger getLogger() {
            Logger logger = this._logger;
            return logger == null ? LoggerJvmKt.getDEFAULT(Logger.INSTANCE) : logger;
        }

        public final void setLogger(@NotNull Logger value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._logger = value;
        }

        @NotNull
        public final LogLevel getLevel() {
            return this.level;
        }

        public final void setLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "<set-?>");
            this.level = logLevel;
        }

        public final void filter(@NotNull Function1<? super HttpRequestBuilder, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            this.filters.add(predicate);
        }

        public static /* synthetic */ void sanitizeHeader$default(Config config, String str, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "***";
            }
            config.sanitizeHeader(str, function1);
        }

        public final void sanitizeHeader(@NotNull String placeholder, @NotNull Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            this.sanitizedHeaders.add(new SanitizedHeader(placeholder, predicate));
        }
    }

    /* compiled from: Logging.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.Logging$setupRequestLogging$1", m7120f = "Logging.kt", m7121i = {0, 1}, m7122l = {84, 90}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "$this$intercept"}, m7125s = {"L$0", "L$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupRequestLogging$1 */
    /* loaded from: classes6.dex */
    public static final class C101911 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C101911(Continuation<? super C101911> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
            C101911 c101911 = Logging.this.new C101911(continuation);
            c101911.L$0 = pipelineContext;
            return c101911.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.util.pipeline.PipelineContext, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [io.ktor.util.pipeline.PipelineContext, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v9, types: [io.ktor.util.pipeline.PipelineContext] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object subject;
            ?? r1;
            PipelineContext pipelineContext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable unused) {
                subject = null;
                r1 = i;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r12 = (PipelineContext) this.L$0;
                if (!Logging.this.shouldBeLogged((HttpRequestBuilder) r12.getContext())) {
                    Attributes attributes = ((HttpRequestBuilder) r12.getContext()).getAttributes();
                    AttributeKey attributeKey = LoggingKt.DisableLogging;
                    Unit unit = Unit.INSTANCE;
                    attributes.put(attributeKey, unit);
                    return unit;
                }
                Logging logging = Logging.this;
                HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) r12.getContext();
                this.L$0 = r12;
                this.label = 1;
                obj = logging.logRequest(httpRequestBuilder, this);
                i = r12;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pipelineContext = (PipelineContext) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        Logging.this.logRequestException((HttpRequestBuilder) pipelineContext.getContext(), th);
                        throw th;
                    }
                }
                ?? r13 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r13;
            }
            subject = (OutgoingContent) obj;
            r1 = i;
            if (subject == null) {
                try {
                    subject = r1.getSubject();
                } catch (Throwable th2) {
                    th = th2;
                    pipelineContext = r1;
                    Logging.this.logRequestException((HttpRequestBuilder) pipelineContext.getContext(), th);
                    throw th;
                }
            }
            this.L$0 = r1;
            this.label = 2;
            if (r1.proceedWith(subject, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void setupRequestLogging(HttpClient client) {
        client.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getMonitoring(), new C101911(null));
    }

    public final Object logRequest(HttpRequestBuilder httpRequestBuilder, Continuation<? super OutgoingContent> continuation) throws IOException {
        Object next;
        Object next2;
        Object body = httpRequestBuilder.getBody();
        Intrinsics.checkNotNull(body, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        OutgoingContent outgoingContent = (OutgoingContent) body;
        HttpClientCallLogger httpClientCallLogger = new HttpClientCallLogger(this.logger);
        httpRequestBuilder.getAttributes().put(LoggingKt.ClientCallLogger, httpClientCallLogger);
        StringBuilder sb = new StringBuilder();
        if (this.level.getInfo()) {
            sb.append("REQUEST: " + URLUtilsKt.Url(httpRequestBuilder.getUrl()));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            sb.append("METHOD: " + httpRequestBuilder.getMethod());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        }
        if (this.level.getHeaders()) {
            sb.append("COMMON HEADERS");
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            LoggingUtilsKt.logHeaders(sb, httpRequestBuilder.getHeaders().entries(), this.sanitizedHeaders);
            sb.append("CONTENT HEADERS");
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            Iterator<T> it = this.sanitizedHeaders.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SanitizedHeader) next).getPredicate().invoke(HttpHeaders.INSTANCE.getContentLength()).booleanValue()) {
                    break;
                }
            }
            SanitizedHeader sanitizedHeader = (SanitizedHeader) next;
            String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            Iterator<T> it2 = this.sanitizedHeaders.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((SanitizedHeader) next2).getPredicate().invoke(HttpHeaders.INSTANCE.getContentType()).booleanValue()) {
                    break;
                }
            }
            SanitizedHeader sanitizedHeader2 = (SanitizedHeader) next2;
            String placeholder2 = sanitizedHeader2 != null ? sanitizedHeader2.getPlaceholder() : null;
            Long contentLength = outgoingContent.getContentLength();
            if (contentLength != null) {
                long jLongValue = contentLength.longValue();
                String contentLength2 = HttpHeaders.INSTANCE.getContentLength();
                if (placeholder == null) {
                    placeholder = String.valueOf(jLongValue);
                }
                LoggingUtilsKt.logHeader(sb, contentLength2, placeholder);
            }
            ContentType contentType = outgoingContent.getContentType();
            if (contentType != null) {
                String contentType2 = HttpHeaders.INSTANCE.getContentType();
                if (placeholder2 == null) {
                    placeholder2 = contentType.toString();
                }
                LoggingUtilsKt.logHeader(sb, contentType2, placeholder2);
            }
            LoggingUtilsKt.logHeaders(sb, outgoingContent.getHeaders().entries(), this.sanitizedHeaders);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        if (string.length() > 0) {
            httpClientCallLogger.logRequest(string);
        }
        if (string.length() == 0 || !this.level.getBody()) {
            httpClientCallLogger.closeRequestLog();
            return null;
        }
        return logRequestBody(outgoingContent, httpClientCallLogger, continuation);
    }

    public final Object logRequestBody(OutgoingContent outgoingContent, final HttpClientCallLogger httpClientCallLogger, Continuation<? super OutgoingContent> continuation) {
        Charset charset;
        final StringBuilder sb = new StringBuilder();
        sb.append("BODY Content-Type: " + outgoingContent.getContentType());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        ContentType contentType = outgoingContent.getContentType();
        if (contentType == null || (charset = ContentTypesKt.charset(contentType)) == null) {
            charset = Charsets.UTF_8;
        }
        ByteChannel byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new C101892(byteChannelByteChannel$default, charset, sb, null), 2, null).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.logging.Logging.logRequestBody.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                HttpClientCallLogger httpClientCallLogger2 = httpClientCallLogger;
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestLog.toString()");
                httpClientCallLogger2.logRequest(string);
                httpClientCallLogger.closeRequestLog();
            }
        });
        return ObservingUtilsKt.observe(outgoingContent, byteChannelByteChannel$default, continuation);
    }

    /* compiled from: Logging.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.Logging$logRequestBody$2", m7120f = "Logging.kt", m7121i = {0}, m7122l = {268}, m7123m = "invokeSuspend", m7124n = {"charset$iv"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/Logging$logRequestBody$2\n+ 2 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n*L\n1#1,266:1\n49#2,5:267\n*S KotlinDebug\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/Logging$logRequestBody$2\n*L\n155#1:267,5\n*E\n"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$logRequestBody$2 */
    /* loaded from: classes6.dex */
    public static final class C101892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteChannel $channel;
        public final /* synthetic */ Charset $charset;
        public final /* synthetic */ StringBuilder $requestLog;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101892(ByteChannel byteChannel, Charset charset, StringBuilder sb, Continuation<? super C101892> continuation) {
            super(2, continuation);
            this.$channel = byteChannel;
            this.$charset = charset;
            this.$requestLog = sb;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C101892(this.$channel, this.$charset, this.$requestLog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Charset charset;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String text$default = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteChannel byteChannel = this.$channel;
                    Charset charset2 = this.$charset;
                    this.L$0 = charset2;
                    this.label = 1;
                    obj = ByteReadChannel.DefaultImpls.readRemaining$default(byteChannel, 0L, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charset = charset2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charset = (Charset) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                text$default = StringsKt.readText$default((Input) obj, charset, 0, 2, (Object) null);
            } catch (Throwable unused) {
            }
            if (text$default == null) {
                text$default = "[request body omitted]";
            }
            StringBuilder sb = this.$requestLog;
            sb.append("BODY START");
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            StringBuilder sb2 = this.$requestLog;
            sb2.append(text$default);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
            this.$requestLog.append("BODY END");
            return Unit.INSTANCE;
        }
    }

    public final void logRequestException(HttpRequestBuilder context, Throwable cause) {
        if (this.level.getInfo()) {
            this.logger.log("REQUEST " + URLUtilsKt.Url(context.getUrl()) + " failed with exception: " + cause);
        }
    }

    /* compiled from: Logging.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$1", m7120f = "Logging.kt", m7121i = {0, 0, 0, 0}, m7122l = {H262Reader.START_GROUP, 191, 191}, m7123m = "invokeSuspend", m7124n = {"response", "logger", "header", EndArtifactPublishEvent.STATUS_FAILED}, m7125s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupResponseLogging$1 */
    /* loaded from: classes6.dex */
    public static final class C101921 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, Unit>, HttpResponse, Continuation<? super Unit>, Object> {
        public int I$0;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;

        public C101921(Continuation<? super C101921> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<HttpResponse, Unit> pipelineContext, @NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
            C101921 c101921 = Logging.this.new C101921(continuation);
            c101921.L$0 = pipelineContext;
            c101921.L$1 = httpResponse;
            return c101921.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th;
            HttpResponse httpResponse;
            HttpClientCallLogger httpClientCallLogger;
            StringBuilder sb;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PipelineContext pipelineContext = (PipelineContext) this.L$0;
                    httpResponse = (HttpResponse) this.L$1;
                    if (Logging.this.getLevel() != LogLevel.NONE && !httpResponse.getCall().getAttributes().contains(LoggingKt.DisableLogging)) {
                        httpClientCallLogger = (HttpClientCallLogger) httpResponse.getCall().getAttributes().get(LoggingKt.ClientCallLogger);
                        sb = new StringBuilder();
                        i = 0;
                        LoggingUtilsKt.logResponseHeader(sb, httpResponse.getCall().getResponse(), Logging.this.getLevel(), Logging.this.sanitizedHeaders);
                        Object subject = pipelineContext.getSubject();
                        this.L$0 = httpResponse;
                        this.L$1 = httpClientCallLogger;
                        this.L$2 = sb;
                        this.I$0 = 0;
                        this.label = 1;
                        if (pipelineContext.proceedWith(subject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    i = this.I$0;
                    sb = (StringBuilder) this.L$2;
                    httpClientCallLogger = (HttpClientCallLogger) this.L$1;
                    httpResponse = (HttpResponse) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "header.toString()");
                httpClientCallLogger.logResponseHeader(string);
                if (i != 0 || !Logging.this.getLevel().getBody()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    Logging.this.logResponseException(sb, httpResponse.getCall().getRequest(), th2);
                } catch (Throwable th3) {
                    th = th3;
                    i2 = i;
                }
                try {
                    throw th2;
                } catch (Throwable th4) {
                    th = th4;
                    String string2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "header.toString()");
                    httpClientCallLogger.logResponseHeader(string2);
                    if (i2 == 0 && Logging.this.getLevel().getBody()) {
                        throw th;
                    }
                    this.L$0 = th;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = th;
                    throw th;
                }
            }
        }
    }

    public final void setupResponseLogging(HttpClient client) {
        client.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getState(), new C101921(null));
        client.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getReceive(), new C101932(null));
        if (this.level.getBody()) {
            ResponseObserver.INSTANCE.install(new ResponseObserver(new Logging$setupResponseLogging$observer$1(this, null), null, 2, null), client);
        }
    }

    /* compiled from: Logging.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$2", m7120f = "Logging.kt", m7121i = {0, 1, 1, 2}, m7122l = {201, 206, 207}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "cause", "logger", "cause"}, m7125s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupResponseLogging$2 */
    /* loaded from: classes6.dex */
    public static final class C101932 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public C101932(Continuation<? super C101932> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, @NotNull HttpResponseContainer httpResponseContainer, @Nullable Continuation<? super Unit> continuation) {
            C101932 c101932 = Logging.this.new C101932(continuation);
            c101932.L$0 = pipelineContext;
            return c101932.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HttpClientCallLogger httpClientCallLogger;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (Throwable th) {
                th = th;
                StringBuilder sb = new StringBuilder();
                HttpClientCallLogger httpClientCallLogger2 = (HttpClientCallLogger) ((HttpClientCall) r1.getContext()).getAttributes().get(LoggingKt.ClientCallLogger);
                Logging.this.logResponseException(sb, ((HttpClientCall) r1.getContext()).getRequest(), th);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "log.toString()");
                this.L$0 = th;
                this.L$1 = httpClientCallLogger2;
                this.label = 2;
                if (httpClientCallLogger2.logResponseException(string, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpClientCallLogger = httpClientCallLogger2;
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                if (Logging.this.getLevel() == LogLevel.NONE || ((HttpClientCall) pipelineContext.getContext()).getAttributes().contains(LoggingKt.DisableLogging)) {
                    return Unit.INSTANCE;
                }
                this.L$0 = pipelineContext;
                this.label = 1;
                Object objProceed = pipelineContext.proceed(this);
                r1 = pipelineContext;
                if (objProceed == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th2;
                    }
                    httpClientCallLogger = (HttpClientCallLogger) this.L$1;
                    Throwable th3 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    th = th3;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.label = 3;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw th;
                }
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = pipelineContext2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void logResponseException(StringBuilder log, HttpRequest request, Throwable cause) {
        if (this.level.getInfo()) {
            log.append("RESPONSE " + request.getUrl() + " failed with exception: " + cause);
        }
    }

    /* compiled from: Logging.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/logging/Logging$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/logging/Logging$Config;", "Lio/ktor/client/plugins/logging/Logging;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, Logging> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<Logging> getKey() {
            return Logging.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public Logging prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new Logging(config.getLogger(), config.getLevel(), config.getFilters$ktor_client_logging(), config.getSanitizedHeaders$ktor_client_logging(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull Logging plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            plugin.setupRequestLogging(scope);
            plugin.setupResponseLogging(scope);
        }
    }

    public final boolean shouldBeLogged(HttpRequestBuilder request) {
        if (!this.filters.isEmpty()) {
            List<? extends Function1<? super HttpRequestBuilder, Boolean>> list = this.filters;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((Function1) it.next()).invoke(request)).booleanValue()) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
