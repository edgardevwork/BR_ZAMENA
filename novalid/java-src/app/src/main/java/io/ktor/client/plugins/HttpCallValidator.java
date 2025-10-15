package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.Phase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCallValidator.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019BY\b\u0000\u00127\u0010\u0002\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0002\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m7105d2 = {"Lio/ktor/client/plugins/HttpCallValidator;", "", "responseValidators", "", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "callExceptionHandlers", "Lio/ktor/client/plugins/HandlerWrapper;", "expectSuccess", "", "(Ljava/util/List;Ljava/util/List;Z)V", "processException", "cause", "", "request", "Lio/ktor/client/request/HttpRequest;", "(Ljava/lang/Throwable;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateResponse", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Config", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCallValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n1855#2,2:194\n*S KotlinDebug\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidator\n*L\n51#1:192,2\n56#1:194,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCallValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpCallValidator> key = new AttributeKey<>("HttpResponseValidator");

    @NotNull
    public final List<HandlerWrapper> callExceptionHandlers;
    public final boolean expectSuccess;

    @NotNull
    public final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> responseValidators;

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.HttpCallValidator", m7120f = "HttpCallValidator.kt", m7121i = {0, 0, 1, 1}, m7122l = {58, 59}, m7123m = "processException", m7124n = {"cause", "request", "cause", "request"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$processException$1 */
    /* loaded from: classes8.dex */
    public static final class C101401 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C101401(Continuation<? super C101401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.processException(null, null, this);
        }
    }

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.HttpCallValidator", m7120f = "HttpCallValidator.kt", m7121i = {0}, m7122l = {51}, m7123m = "validateResponse", m7124n = {"response"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$validateResponse$1 */
    /* loaded from: classes8.dex */
    public static final class C101411 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101411(Continuation<? super C101411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.validateResponse(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidator(@NotNull List<? extends Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object>> responseValidators, @NotNull List<? extends HandlerWrapper> callExceptionHandlers, boolean z) {
        Intrinsics.checkNotNullParameter(responseValidators, "responseValidators");
        Intrinsics.checkNotNullParameter(callExceptionHandlers, "callExceptionHandlers");
        this.responseValidators = responseValidators;
        this.callExceptionHandlers = callExceptionHandlers;
        this.expectSuccess = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateResponse(HttpResponse httpResponse, Continuation<? super Unit> continuation) throws Throwable {
        C101411 c101411;
        HttpResponse httpResponse2;
        Iterator it;
        if (continuation instanceof C101411) {
            c101411 = (C101411) continuation;
            int i = c101411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101411.label = i - Integer.MIN_VALUE;
            } else {
                c101411 = new C101411(continuation);
            }
        }
        Object obj = c101411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCallValidatorKt.LOGGER.trace("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
            httpResponse2 = httpResponse;
            it = this.responseValidators.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c101411.L$1;
            HttpResponse httpResponse3 = (HttpResponse) c101411.L$0;
            ResultKt.throwOnFailure(obj);
            httpResponse2 = httpResponse3;
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            c101411.L$0 = httpResponse2;
            c101411.L$1 = it;
            c101411.label = 1;
            if (function2.invoke(httpResponse2, c101411) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        r2 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processException(Throwable th, HttpRequest httpRequest, Continuation<? super Unit> continuation) throws Throwable {
        C101401 c101401;
        Throwable th2;
        Iterator it;
        HttpRequest httpRequest2;
        if (continuation instanceof C101401) {
            c101401 = (C101401) continuation;
            int i = c101401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101401.label = i - Integer.MIN_VALUE;
            } else {
                c101401 = new C101401(continuation);
            }
        }
        Object obj = c101401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCallValidatorKt.LOGGER.trace("Processing exception " + th + " for request " + httpRequest.getUrl());
            th2 = th;
            it = this.callExceptionHandlers.iterator();
            httpRequest2 = httpRequest;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) c101401.L$2;
        HttpRequest httpRequest3 = (HttpRequest) c101401.L$1;
        Throwable th3 = (Throwable) c101401.L$0;
        ResultKt.throwOnFailure(obj);
        httpRequest2 = httpRequest3;
        th2 = th3;
        while (it.hasNext()) {
            HandlerWrapper handlerWrapper = (HandlerWrapper) it.next();
            if (handlerWrapper instanceof ExceptionHandlerWrapper) {
                Function2<Throwable, Continuation<? super Unit>, Object> handler = ((ExceptionHandlerWrapper) handlerWrapper).getHandler();
                c101401.L$0 = th2;
                c101401.L$1 = httpRequest2;
                c101401.L$2 = it;
                c101401.label = 1;
                if (handler.invoke(th2, c101401) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th3 = th2;
                httpRequest3 = httpRequest2;
            } else if (handlerWrapper instanceof RequestExceptionHandlerWrapper) {
                Function3<Throwable, HttpRequest, Continuation<? super Unit>, Object> handler2 = ((RequestExceptionHandlerWrapper) handlerWrapper).getHandler();
                c101401.L$0 = th2;
                c101401.L$1 = httpRequest2;
                c101401.L$2 = it;
                c101401.label = 2;
                if (handler2.invoke(th2, httpRequest2, c101401) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th3 = th2;
                httpRequest3 = httpRequest2;
            }
            httpRequest2 = httpRequest3;
            th2 = th3;
            while (it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HttpCallValidator.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JC\u0010\u0018\u001a\u00020\u001621\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001cJV\u0010\u001d\u001a\u00020\u00162F\u0010\u0019\u001aB\b\u0001\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eø\u0001\u0000¢\u0006\u0002\u0010!JA\u0010\"\u001a\u00020\u001621\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u001cR$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRH\u0010\u000f\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100\u000bX\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m7105d2 = {"Lio/ktor/client/plugins/HttpCallValidator$Config;", "", "()V", "expectSuccess", "", "getExpectSuccess$annotations", "getExpectSuccess", "()Z", "setExpectSuccess", "(Z)V", "responseExceptionHandlers", "", "Lio/ktor/client/plugins/HandlerWrapper;", "getResponseExceptionHandlers$ktor_client_core", "()Ljava/util/List;", "responseValidators", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "getResponseValidators$ktor_client_core", "handleResponseException", "block", "", "cause", "(Lkotlin/jvm/functions/Function2;)V", "handleResponseExceptionWithRequest", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequest;", "request", "(Lkotlin/jvm/functions/Function3;)V", "validateResponse", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {

        @NotNull
        public final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> responseValidators = new ArrayList();

        @NotNull
        public final List<HandlerWrapper> responseExceptionHandlers = new ArrayList();
        public boolean expectSuccess = true;

        @Deprecated(message = "This property is ignored. Please use `expectSuccess` property in HttpClientConfig. This is going to become internal.")
        public static /* synthetic */ void getExpectSuccess$annotations() {
        }

        @NotNull
        public final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> getResponseValidators$ktor_client_core() {
            return this.responseValidators;
        }

        @NotNull
        public final List<HandlerWrapper> getResponseExceptionHandlers$ktor_client_core() {
            return this.responseExceptionHandlers;
        }

        public final boolean getExpectSuccess() {
            return this.expectSuccess;
        }

        public final void setExpectSuccess(boolean z) {
            this.expectSuccess = z;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Consider using `handleResponseExceptionWithRequest` instead", replaceWith = @ReplaceWith(expression = "this.handleResponseExceptionWithRequest(block)", imports = {}))
        public final void handleResponseException(@NotNull Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.responseExceptionHandlers.add(new ExceptionHandlerWrapper(block));
        }

        public final void handleResponseExceptionWithRequest(@NotNull Function3<? super Throwable, ? super HttpRequest, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.responseExceptionHandlers.add(new RequestExceptionHandlerWrapper(block));
        }

        public final void validateResponse(@NotNull Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.responseValidators.add(block);
        }
    }

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/HttpCallValidator$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpCallValidator$Config;", "Lio/ktor/client/plugins/HttpCallValidator;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpCallValidator> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpCallValidator> getKey() {
            return HttpCallValidator.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpCallValidator prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCallValidator(CollectionsKt___CollectionsKt.reversed(config.getResponseValidators$ktor_client_core()), CollectionsKt___CollectionsKt.reversed(config.getResponseExceptionHandlers$ktor_client_core()), config.getExpectSuccess());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpCallValidator plugin, @NotNull HttpClient scope) throws InvalidPhaseException {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getBefore(), new HttpCallValidator$Companion$install$1(plugin, null));
            Phase phase = new Phase("BeforeReceive");
            scope.getResponsePipeline().insertPhaseBefore(HttpResponsePipeline.INSTANCE.getReceive(), phase);
            scope.getResponsePipeline().intercept(phase, new HttpCallValidator$Companion$install$2(plugin, null));
            ((HttpSend) HttpClientPluginKt.plugin(scope, HttpSend.INSTANCE)).intercept(new HttpCallValidator$Companion$install$3(plugin, null));
        }
    }
}
