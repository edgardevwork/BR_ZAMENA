package io.ktor.client.statement;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.p050io.ByteReadChannelKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpStatement.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\rJT\u0010\u000b\u001a\u0002H\u000e\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0004\b\u0001\u0010\u000e23\b\u0004\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0011\u0010\u0018\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJJ\u0010\u0018\u001a\u0002H\f\"\u0004\b\u0000\u0010\f21\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0011\u0010\u001a\u001a\u00020\u0019H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001d\u001a\u00020\u0017*\u00020\u0019H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m7105d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "builder", "Lio/ktor/client/request/HttpRequestBuilder;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "getClient$annotations", "()V", "getClient", "()Lio/ktor/client/HttpClient;", "body", ExifInterface.GPS_DIRECTION_TRUE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCapabilities", "", "execute", "Lio/ktor/client/statement/HttpResponse;", "executeUnsafe", "toString", "", "cleanup", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 2 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 3 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 4 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n269#2,4:146\n269#2,2:150\n271#2,2:156\n269#2,2:158\n271#2,2:164\n269#2,4:166\n156#3:152\n156#3:160\n17#4,3:153\n17#4,3:161\n800#5,11:170\n1855#5,2:181\n*S KotlinDebug\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n*L\n46#1:146,4\n74#1:150,2\n74#1:156,2\n90#1:158,2\n90#1:164,2\n105#1:166,4\n77#1:152\n93#1:160\n77#1:153,3\n93#1:161,3\n135#1:170,11\n136#1:181,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpStatement {

    @NotNull
    public final HttpRequestBuilder builder;

    @NotNull
    public final HttpClient client;

    /* compiled from: HttpStatement.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpStatement", m7120f = "HttpStatement.kt", m7121i = {}, m7122l = {126}, m7123m = "cleanup", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$cleanup$1 */
    /* loaded from: classes8.dex */
    public static final class C102831 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C102831(Continuation<? super C102831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.cleanup(null, this);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpStatement", m7120f = "HttpStatement.kt", m7121i = {0, 0, 1, 1}, m7122l = {47, 50, 52, 52}, m7123m = "execute", m7124n = {"this", "block", "this", "response"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$1 */
    /* loaded from: classes8.dex */
    public static final class C102841<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C102841(Continuation<? super C102841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.execute(null, this);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpStatement", m7120f = "HttpStatement.kt", m7121i = {}, m7122l = {108}, m7123m = "executeUnsafe", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$executeUnsafe$1 */
    /* loaded from: classes8.dex */
    public static final class C102861 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C102861(Continuation<? super C102861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.executeUnsafe(this);
        }
    }

    @PublishedApi
    public static /* synthetic */ void getClient$annotations() {
    }

    public HttpStatement(@NotNull HttpRequestBuilder builder, @NotNull HttpClient client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
        checkCapabilities();
    }

    @NotNull
    public final HttpClient getClient() {
        return this.client;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:54|(1:(1:(1:(1:(2:14|15)(3:16|17|51))(3:21|22|59))(5:24|55|25|42|(1:44)(2:45|46)))(2:29|30))(3:32|33|(1:35)(1:36))|37|57|38|(1:40)(3:41|42|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object execute(@NotNull Function2<? super HttpResponse, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        C102841 c102841;
        HttpStatement httpStatement;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        if (continuation instanceof C102841) {
            c102841 = (C102841) continuation;
            int i = c102841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102841.label = i - Integer.MIN_VALUE;
            } else {
                c102841 = new C102841(continuation);
            }
        }
        Object objExecuteUnsafe = c102841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102841.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecuteUnsafe);
                c102841.L$0 = this;
                c102841.L$1 = function2;
                c102841.label = 1;
                objExecuteUnsafe = executeUnsafe(c102841);
                if (objExecuteUnsafe == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            Object obj = c102841.L$0;
                            ResultKt.throwOnFailure(objExecuteUnsafe);
                            return obj;
                        }
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) c102841.L$0;
                        ResultKt.throwOnFailure(objExecuteUnsafe);
                        throw th;
                    }
                    httpResponse2 = (HttpResponse) c102841.L$1;
                    httpStatement = (HttpStatement) c102841.L$0;
                    try {
                        ResultKt.throwOnFailure(objExecuteUnsafe);
                        c102841.L$0 = objExecuteUnsafe;
                        c102841.L$1 = null;
                        c102841.label = 3;
                        return httpStatement.cleanup(httpResponse2, c102841) != coroutine_suspended ? coroutine_suspended : objExecuteUnsafe;
                    } catch (Throwable th) {
                        httpResponse = httpResponse2;
                        th = th;
                        c102841.L$0 = th;
                        c102841.L$1 = null;
                        c102841.label = 4;
                        if (httpStatement.cleanup(httpResponse, c102841) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                }
                function2 = (Function2) c102841.L$1;
                httpStatement = (HttpStatement) c102841.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
            }
            httpResponse = (HttpResponse) objExecuteUnsafe;
            c102841.L$0 = httpStatement;
            c102841.L$1 = httpResponse;
            c102841.label = 2;
            Object objInvoke = function2.invoke(httpResponse, c102841);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            objExecuteUnsafe = objInvoke;
            httpResponse2 = httpResponse;
            c102841.L$0 = objExecuteUnsafe;
            c102841.L$1 = null;
            c102841.label = 3;
            if (httpStatement.cleanup(httpResponse2, c102841) != coroutine_suspended) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpStatement$execute$4", m7120f = "HttpStatement.kt", m7121i = {}, m7122l = {63}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$4 */
    /* loaded from: classes6.dex */
    public static final class C102854 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super HttpResponse>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C102854(Continuation<? super C102854> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C102854 c102854 = new C102854(continuation);
            c102854.L$0 = obj;
            return c102854;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull HttpResponse httpResponse, @Nullable Continuation<? super HttpResponse> continuation) {
            return ((C102854) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpClientCall call = ((HttpResponse) this.L$0).getCall();
                this.label = 1;
                obj = SavedCallKt.save(call, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((HttpClientCall) obj).getResponse();
        }
    }

    @Nullable
    public final Object execute(@NotNull Continuation<? super HttpResponse> continuation) {
        return execute(new C102854(null), continuation);
    }

    public final /* synthetic */ <T> Object body(Continuation<? super T> continuation) throws Throwable {
        try {
            InlineMarker.mark(3);
            InlineMarker.mark(0);
            Object objExecuteUnsafe = executeUnsafe(null);
            InlineMarker.mark(1);
            HttpResponse httpResponse = (HttpResponse) objExecuteUnsafe;
            try {
                InlineMarker.mark(3);
                HttpClientCall call = httpResponse.getCall();
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                Type javaType = TypesJVMKt.getJavaType((KType) null);
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
                InlineMarker.mark(0);
                Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, null);
                InlineMarker.mark(1);
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                return objBodyNullable;
            } finally {
                InlineMarker.finallyStart(1);
                HttpResponseKt.complete(httpResponse);
                InlineMarker.finallyEnd(1);
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    public final /* synthetic */ <T, R> Object body(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        try {
            InlineMarker.mark(3);
            InlineMarker.mark(0);
            Object objExecuteUnsafe = executeUnsafe(null);
            InlineMarker.mark(1);
            HttpResponse httpResponse = (HttpResponse) objExecuteUnsafe;
            try {
                InlineMarker.mark(3);
                HttpClientCall call = httpResponse.getCall();
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                Type javaType = TypesJVMKt.getJavaType((KType) null);
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
                InlineMarker.mark(0);
                Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, null);
                InlineMarker.mark(1);
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                InlineMarker.mark(3);
                return function2.invoke(objBodyNullable, null);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                cleanup(httpResponse, null);
                InlineMarker.mark(1);
                InlineMarker.finallyEnd(1);
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @PublishedApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeUnsafe(@NotNull Continuation<? super HttpResponse> continuation) throws Throwable {
        C102861 c102861;
        if (continuation instanceof C102861) {
            c102861 = (C102861) continuation;
            int i = c102861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102861.label = i - Integer.MIN_VALUE;
            } else {
                c102861 = new C102861(continuation);
            }
        }
        Object objExecute$ktor_client_core = c102861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102861.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecute$ktor_client_core);
                HttpRequestBuilder httpRequestBuilderTakeFromWithExecutionContext = new HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                HttpClient httpClient = this.client;
                c102861.label = 1;
                objExecute$ktor_client_core = httpClient.execute$ktor_client_core(httpRequestBuilderTakeFromWithExecutionContext, c102861);
                if (objExecute$ktor_client_core == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExecute$ktor_client_core);
            }
            return ((HttpClientCall) objExecute$ktor_client_core).getResponse();
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @PublishedApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(@NotNull HttpResponse httpResponse, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C102831 c102831;
        if (continuation instanceof C102831) {
            c102831 = (C102831) continuation;
            int i = c102831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102831.label = i - Integer.MIN_VALUE;
            } else {
                c102831 = new C102831(continuation);
            }
        }
        Object obj = c102831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.INSTANCE);
            Intrinsics.checkNotNull(element);
            CompletableJob completableJob = (CompletableJob) element;
            completableJob.complete();
            try {
                ByteReadChannelKt.cancel(httpResponse.getContent());
            } catch (Throwable unused) {
            }
            c102831.L$0 = completableJob;
            c102831.label = 1;
            if (completableJob.join(c102831) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public final void checkCapabilities() {
        Set setKeySet;
        Map map = (Map) this.builder.getAttributes().getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<HttpClientPlugin> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof HttpClientPlugin) {
                arrayList.add(obj);
            }
        }
        for (HttpClientPlugin httpClientPlugin : arrayList) {
            if (HttpClientPluginKt.pluginOrNull(this.client, httpClientPlugin) == null) {
                throw new IllegalArgumentException(("Consider installing " + httpClientPlugin + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    @NotNull
    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + AbstractJsonLexerKt.END_LIST;
    }
}
