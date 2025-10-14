package io.ktor.client.plugins.websocket;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.WebSocketSessionKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: builders.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001aW\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010\u0007\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a.\u0010\u001b\u001a\u00020\r*\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a^\u0010\u001b\u001a\u00020\r*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a8\u0010\u001b\u001a\u00020\r*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001aW\u0010\u001f\u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010\u001f\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010\u001f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001aW\u0010 \u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010 \u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010 \u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"WebSockets", "", "Lio/ktor/client/HttpClientConfig;", "config", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lkotlin/ExtensionFunctionType;", "webSocket", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lkotlin/Function2;", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Param.METHOD, "Lio/ktor/http/HttpMethod;", "host", "", "port", "", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 4 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 5 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 6 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,235:1\n43#2:236\n29#2:237\n43#2:238\n29#2:239\n90#3:240\n91#3,3:243\n94#3,3:250\n269#4,2:241\n271#4,2:253\n156#5:246\n17#6,3:247\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt\n*L\n31#1:236\n31#1:237\n92#1:238\n92#1:239\n99#1:240\n99#1:243,3\n99#1:250,3\n99#1:241,2\n99#1:253,2\n99#1:246\n99#1:247,3\n*E\n"})
/* loaded from: classes4.dex */
public final class BuildersKt {

    /* compiled from: builders.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.websocket.BuildersKt", m7120f = "builders.kt", m7121i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4}, m7122l = {MatroskaExtractor.ID_CUE_CLUSTER_POSITION, SnappyCompressorOutputStream.TWO_SIZE_BYTE_MARKER, 101, 103, 103, 250, 250}, m7123m = "webSocket", m7124n = {"block", "this_$iv", "block", "this_$iv", "response$iv", "this_$iv", "response$iv", "it", "this_$iv", "response$iv", "this_$iv", "response$iv"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$1 */
    /* loaded from: classes7.dex */
    public static final class C102021 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C102021(Continuation<? super C102021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuildersKt.webSocket(null, null, null, this);
        }
    }

    public static final void WebSockets(@NotNull HttpClientConfig<?> httpClientConfig, @NotNull final Function1<? super WebSockets.Config, Unit> config) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(WebSockets.INSTANCE, new Function1<WebSockets.Config, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.WebSockets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebSockets.Config config2) {
                invoke2(config2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull WebSockets.Config install) {
                Intrinsics.checkNotNullParameter(install, "$this$install");
                config.invoke(install);
            }
        });
    }

    @Nullable
    public static final Object webSocketSession(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super DefaultClientWebSocketSession> continuation) {
        HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(new Function2<URLBuilder, URLBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$statement$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
                invoke2(uRLBuilder, uRLBuilder2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull URLBuilder url, @NotNull URLBuilder it) {
                Intrinsics.checkNotNullParameter(url, "$this$url");
                Intrinsics.checkNotNullParameter(it, "it");
                url.setProtocol(URLProtocol.INSTANCE.getWS());
                url.setPort(url.getProtocol().getDefaultPort());
            }
        });
        function1.invoke(httpRequestBuilder);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new C102072(new HttpStatement(httpRequestBuilder, httpClient), completableDeferredCompletableDeferred$default, null), 3, null);
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    /* compiled from: builders.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", m7120f = "builders.kt", m7121i = {0, 1, 1, 2, 2}, m7122l = {239, 242, 49, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER}, m7123m = "invokeSuspend", m7124n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, m7125s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt$webSocketSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,235:1\n90#2:236\n91#2,3:239\n94#2,3:246\n269#3,2:237\n271#3,2:249\n156#4:242\n17#5,3:243\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt$webSocketSession$2\n*L\n41#1:236\n41#1:239,3\n41#1:246,3\n41#1:237,2\n41#1:249,2\n41#1:242\n41#1:243,3\n*E\n"})
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2 */
    /* loaded from: classes6.dex */
    public static final class C102072 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CompletableDeferred<DefaultClientWebSocketSession> $sessionDeferred;
        public final /* synthetic */ HttpStatement $statement;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C102072(HttpStatement httpStatement, CompletableDeferred<DefaultClientWebSocketSession> completableDeferred, Continuation<? super C102072> continuation) {
            super(2, continuation);
            this.$statement = httpStatement;
            this.$sessionDeferred = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C102072(this.$statement, this.$sessionDeferred, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C102072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:68)|(1:(1:(1:(1:(1:(2:9|10)(3:11|12|60))(4:18|19|64|65))(8:21|66|22|50|51|(1:53)|64|65))(4:26|69|27|(2:46|(1:48)(6:49|50|51|(0)|64|65))(2:54|55)))(3:31|32|33))(4:34|35|36|(1:38)(1:39))|40|70|41|(1:43)(2:44|(0)(0))|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:27:0x0059, B:46:0x00b3, B:54:0x00e7, B:55:0x00ee), top: B:69:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e7 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #3 {all -> 0x005d, blocks: (B:27:0x0059, B:46:0x00b3, B:54:0x00e7, B:55:0x00ee), top: B:69:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HttpStatement httpStatement;
            CompletableDeferred<DefaultClientWebSocketSession> completableDeferred;
            HttpResponse httpResponse;
            HttpStatement httpStatement2;
            CompletableDeferred<DefaultClientWebSocketSession> completableDeferred2;
            HttpResponse httpResponse2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (CancellationException e) {
                    throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
                }
            } catch (Throwable th2) {
                this.$sessionDeferred.completeExceptionally(th2);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpStatement httpStatement3 = this.$statement;
                CompletableDeferred<DefaultClientWebSocketSession> completableDeferred3 = this.$sessionDeferred;
                this.L$0 = httpStatement3;
                this.L$1 = completableDeferred3;
                this.label = 1;
                Object objExecuteUnsafe = httpStatement3.executeUnsafe(this);
                if (objExecuteUnsafe == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = httpStatement3;
                obj = objExecuteUnsafe;
                completableDeferred = completableDeferred3;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        httpResponse2 = (HttpResponse) this.L$1;
                        httpStatement = (HttpStatement) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = Unit.INSTANCE;
                            this.L$1 = null;
                            this.label = 4;
                            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            HttpResponse httpResponse3 = httpResponse2;
                            th = th;
                            httpResponse = httpResponse3;
                            this.L$0 = th;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (httpStatement.cleanup(httpResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th;
                        }
                    }
                    httpResponse2 = (HttpResponse) this.L$2;
                    completableDeferred2 = (CompletableDeferred) this.L$1;
                    httpStatement2 = (HttpStatement) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            DefaultClientWebSocketSession defaultClientWebSocketSession = (DefaultClientWebSocketSession) obj;
                            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                            completableDeferred2.complete(defaultClientWebSocketSession);
                            defaultClientWebSocketSession.getOutgoing().invokeOnClose(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th4) {
                                    invoke2(th4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Throwable th4) {
                                    if (th4 != null) {
                                        completableDeferredCompletableDeferred$default.completeExceptionally(th4);
                                    } else {
                                        completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE);
                                    }
                                }
                            });
                            this.L$0 = httpStatement2;
                            this.L$1 = httpResponse2;
                            this.L$2 = null;
                            this.label = 3;
                            if (completableDeferredCompletableDeferred$default.await(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpStatement = httpStatement2;
                            this.L$0 = Unit.INSTANCE;
                            this.L$1 = null;
                            this.label = 4;
                            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                    } catch (Throwable th4) {
                        th = th4;
                        httpStatement = httpStatement2;
                        HttpResponse httpResponse32 = httpResponse2;
                        th = th;
                        httpResponse = httpResponse32;
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (httpStatement.cleanup(httpResponse, this) == coroutine_suspended) {
                        }
                        throw th;
                    }
                }
                CompletableDeferred<DefaultClientWebSocketSession> completableDeferred4 = (CompletableDeferred) this.L$1;
                HttpStatement httpStatement4 = (HttpStatement) this.L$0;
                ResultKt.throwOnFailure(obj);
                completableDeferred = completableDeferred4;
                httpStatement = httpStatement4;
            }
            httpResponse = (HttpResponse) obj;
            HttpClientCall call = httpResponse.getCall();
            KType kTypeTypeOf = Reflection.typeOf(DefaultClientWebSocketSession.class);
            TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), kTypeTypeOf);
            this.L$0 = httpStatement;
            this.L$1 = completableDeferred;
            this.L$2 = httpResponse;
            this.label = 2;
            Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, this);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpStatement2 = httpStatement;
            completableDeferred2 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = objBodyNullable;
            if (obj == null) {
            }
        }
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        HttpMethod httpMethod2 = httpMethod;
        String str3 = (i & 2) != 0 ? null : str;
        Integer num2 = (i & 4) != 0 ? null : num;
        String str4 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocketSession.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocketSession(httpClient, httpMethod2, str3, num2, str4, function1, continuation);
    }

    @Nullable
    public static final Object webSocketSession(@NotNull HttpClient httpClient, @NotNull final HttpMethod httpMethod, @Nullable final String str, @Nullable final Integer num, @Nullable final String str2, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocketSession.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocketSession) {
                Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
                webSocketSession.setMethod(httpMethod);
                HttpRequestKt.url$default(webSocketSession, "ws", str, num, str2, null, 16, null);
                function1.invoke(webSocketSession);
            }
        }, continuation);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocketSession.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    @Nullable
    public static final Object webSocketSession(@NotNull HttpClient httpClient, @NotNull final String str, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocketSession.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocketSession) {
                Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
                URLParserKt.takeFrom(webSocketSession.getUrl(), str);
                function1.invoke(webSocketSession);
            }
        }, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0050, B:68:0x0138, B:26:0x0062, B:58:0x0114, B:55:0x0104, B:65:0x0128, B:34:0x008c, B:50:0x00f1, B:69:0x0139, B:70:0x0141), top: B:81:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0050, B:68:0x0138, B:26:0x0062, B:58:0x0114, B:55:0x0104, B:65:0x0128, B:34:0x008c, B:50:0x00f1, B:69:0x0139, B:70:0x0141), top: B:81:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r9v5, types: [io.ktor.client.statement.HttpResponse, java.lang.Object] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object webSocket(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C102021 c102021;
        HttpStatement httpStatement;
        Function2 function22;
        HttpStatement httpStatement2;
        Function2 function23;
        HttpResponse httpResponse;
        DefaultClientWebSocketSession defaultClientWebSocketSession;
        DefaultClientWebSocketSession defaultClientWebSocketSession2;
        HttpStatement httpStatement3;
        HttpResponse httpResponse2;
        HttpStatement httpStatement4;
        HttpResponse httpResponse3;
        if (continuation instanceof C102021) {
            c102021 = (C102021) continuation;
            int i = c102021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102021.label = i - Integer.MIN_VALUE;
            } else {
                c102021 = new C102021(continuation);
            }
        }
        Object objExecuteUnsafe = c102021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
            } catch (CancellationException e) {
                throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
            }
        } catch (Throwable th) {
            th = th;
        }
        switch (c102021.label) {
            case 0:
                ResultKt.throwOnFailure(objExecuteUnsafe);
                HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                httpRequestBuilder.url(new Function2<URLBuilder, URLBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocket$session$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
                        invoke2(uRLBuilder, uRLBuilder2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull URLBuilder url, @NotNull URLBuilder it) {
                        Intrinsics.checkNotNullParameter(url, "$this$url");
                        Intrinsics.checkNotNullParameter(it, "it");
                        url.setProtocol(URLProtocol.INSTANCE.getWS());
                    }
                });
                function1.invoke(httpRequestBuilder);
                HttpStatement httpStatement5 = new HttpStatement(httpRequestBuilder, httpClient);
                c102021.L$0 = function2;
                c102021.L$1 = httpStatement5;
                c102021.label = 1;
                objExecuteUnsafe = httpStatement5.executeUnsafe(c102021);
                if (objExecuteUnsafe == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = httpStatement5;
                function22 = function2;
                function1 = (HttpResponse) objExecuteUnsafe;
                try {
                    HttpClientCall call = function1.getCall();
                    KType kTypeTypeOf = Reflection.typeOf(DefaultClientWebSocketSession.class);
                    TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), kTypeTypeOf);
                    c102021.L$0 = function22;
                    c102021.L$1 = httpStatement;
                    c102021.L$2 = function1;
                    c102021.label = 2;
                    objExecuteUnsafe = call.bodyNullable(typeInfoTypeInfoImpl, c102021);
                    if (objExecuteUnsafe != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Function2 function24 = function22;
                    httpStatement2 = httpStatement;
                    function23 = function24;
                    httpResponse = function1;
                    if (objExecuteUnsafe == null) {
                        defaultClientWebSocketSession = (DefaultClientWebSocketSession) objExecuteUnsafe;
                        try {
                            c102021.L$0 = httpStatement2;
                            c102021.L$1 = httpResponse;
                            c102021.L$2 = defaultClientWebSocketSession;
                            c102021.label = 3;
                            if (function23.invoke(defaultClientWebSocketSession, c102021) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultClientWebSocketSession2 = defaultClientWebSocketSession;
                            httpResponse2 = httpResponse;
                            httpStatement3 = httpStatement2;
                            c102021.L$0 = httpStatement3;
                            c102021.L$1 = httpResponse2;
                            c102021.L$2 = null;
                            c102021.label = 4;
                            httpResponse3 = httpResponse2;
                            httpStatement4 = httpStatement3;
                            if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, c102021, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c102021.L$0 = Unit.INSTANCE;
                            c102021.L$1 = null;
                            c102021.label = 6;
                            if (httpStatement4.cleanup(httpResponse3, c102021) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            c102021.L$0 = httpStatement2;
                            c102021.L$1 = httpResponse;
                            c102021.L$2 = th;
                            c102021.label = 5;
                            if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, c102021, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th;
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                } catch (Throwable th3) {
                    function2 = httpStatement;
                    th = th3;
                    c102021.L$0 = th;
                    c102021.L$1 = null;
                    c102021.L$2 = null;
                    c102021.label = 7;
                    if (function2.cleanup(function1, c102021) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw th;
                }
            case 1:
                httpStatement = (HttpStatement) c102021.L$1;
                Function2 function25 = (Function2) c102021.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
                function22 = function25;
                function1 = (HttpResponse) objExecuteUnsafe;
                HttpClientCall call2 = function1.getCall();
                KType kTypeTypeOf2 = Reflection.typeOf(DefaultClientWebSocketSession.class);
                TypeInfo typeInfoTypeInfoImpl2 = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), kTypeTypeOf2);
                c102021.L$0 = function22;
                c102021.L$1 = httpStatement;
                c102021.L$2 = function1;
                c102021.label = 2;
                objExecuteUnsafe = call2.bodyNullable(typeInfoTypeInfoImpl2, c102021);
                if (objExecuteUnsafe != coroutine_suspended) {
                }
                break;
            case 2:
                HttpResponse httpResponse4 = (HttpResponse) c102021.L$2;
                HttpStatement httpStatement6 = (HttpStatement) c102021.L$1;
                function23 = (Function2) c102021.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
                httpResponse = httpResponse4;
                httpStatement2 = httpStatement6;
                if (objExecuteUnsafe == null) {
                }
                break;
            case 3:
                defaultClientWebSocketSession2 = (DefaultClientWebSocketSession) c102021.L$2;
                httpResponse = (HttpResponse) c102021.L$1;
                httpStatement2 = (HttpStatement) c102021.L$0;
                try {
                    ResultKt.throwOnFailure(objExecuteUnsafe);
                    httpResponse2 = httpResponse;
                    httpStatement3 = httpStatement2;
                    c102021.L$0 = httpStatement3;
                    c102021.L$1 = httpResponse2;
                    c102021.L$2 = null;
                    c102021.label = 4;
                    httpResponse3 = httpResponse2;
                    httpStatement4 = httpStatement3;
                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, c102021, 1, null) == coroutine_suspended) {
                    }
                    c102021.L$0 = Unit.INSTANCE;
                    c102021.L$1 = null;
                    c102021.label = 6;
                    if (httpStatement4.cleanup(httpResponse3, c102021) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    defaultClientWebSocketSession = defaultClientWebSocketSession2;
                    th = th4;
                    c102021.L$0 = httpStatement2;
                    c102021.L$1 = httpResponse;
                    c102021.L$2 = th;
                    c102021.label = 5;
                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, c102021, 1, null) == coroutine_suspended) {
                    }
                    throw th;
                }
            case 4:
                HttpResponse httpResponse5 = (HttpResponse) c102021.L$1;
                HttpStatement httpStatement7 = (HttpStatement) c102021.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
                httpResponse3 = httpResponse5;
                httpStatement4 = httpStatement7;
                c102021.L$0 = Unit.INSTANCE;
                c102021.L$1 = null;
                c102021.label = 6;
                if (httpStatement4.cleanup(httpResponse3, c102021) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                th = (Throwable) c102021.L$2;
                ResultKt.throwOnFailure(objExecuteUnsafe);
                throw th;
            case 6:
                ResultKt.throwOnFailure(objExecuteUnsafe);
                return Unit.INSTANCE;
            case 7:
                th = (Throwable) c102021.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
                throw th;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public static final Object webSocket(@NotNull HttpClient httpClient, @NotNull final HttpMethod httpMethod, @Nullable final String str, @Nullable final Integer num, @Nullable final String str2, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocket.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocket) {
                Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
                webSocket.setMethod(httpMethod);
                HttpRequestKt.url$default(webSocket, "ws", str, num, str2, null, 16, null);
                function1.invoke(webSocket);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocket.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    @Nullable
    public static final Object webSocket(@NotNull HttpClient httpClient, @NotNull final String str, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, HttpMethod.INSTANCE.getGet(), null, null, null, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.webSocket.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocket) {
                Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
                webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
                webSocket.getUrl().setPort(UtilsKt.getPort(webSocket));
                URLParserKt.takeFrom(webSocket.getUrl(), str);
                function1.invoke(webSocket);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    @Nullable
    /* renamed from: ws */
    public static final Object m7075ws(@NotNull HttpClient httpClient, @NotNull HttpMethod httpMethod, @Nullable String str, @Nullable Integer num, @Nullable String str2, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    @Nullable
    /* renamed from: ws */
    public static final Object m7077ws(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.ws.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return m7076ws(httpClient, str, function1, function2, continuation);
    }

    @Nullable
    /* renamed from: ws */
    public static final Object m7076ws(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, str, function1, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    @Nullable
    public static final Object wss(@NotNull HttpClient httpClient, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.wss.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocket) {
                Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
                webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
                webSocket.getUrl().setPort(webSocket.getUrl().getProtocol().getDefaultPort());
                function1.invoke(webSocket);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.wss.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    @Nullable
    public static final Object wss(@NotNull HttpClient httpClient, @NotNull final String str, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWss = wss(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.wss.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder wss) {
                Intrinsics.checkNotNullParameter(wss, "$this$wss");
                URLParserKt.takeFrom(wss.getUrl(), str);
                function1.invoke(wss);
            }
        }, function2, continuation);
        return objWss == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWss : Unit.INSTANCE;
    }

    @Nullable
    public static final Object wss(@NotNull HttpClient httpClient, @NotNull HttpMethod httpMethod, @Nullable String str, @Nullable final Integer num, @Nullable String str2, @NotNull final Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt.wss.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpRequestBuilder webSocket) {
                Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
                webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
                if (num != null) {
                    webSocket.getUrl().setPort(num.intValue());
                }
                function1.invoke(webSocket);
            }
        }, function2, continuation);
        return objWebSocket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWebSocket : Unit.INSTANCE;
    }
}
