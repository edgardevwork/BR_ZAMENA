package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.charsets.EncodingKt;
import io.ktor.utils.p050io.core.ByteReadPacket;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpResponse.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a#\u0010\b\u001a\u00020\t*\u00020\u00022\f\b\u0002\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"request", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "bodyAsChannel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bodyAsText", "", "fallbackCharset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,96:1\n156#2:97\n156#2:101\n17#3,3:98\n17#3,3:102\n*S KotlinDebug\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n*L\n87#1:97\n95#1:101\n87#1:98,3\n95#1:102,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpResponseKt {

    /* compiled from: HttpResponse.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpResponseKt", m7120f = "HttpResponse.kt", m7121i = {}, m7122l = {97}, m7123m = "bodyAsChannel", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 */
    /* loaded from: classes8.dex */
    public static final class C102811 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C102811(Continuation<? super C102811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsChannel(null, this);
        }
    }

    /* compiled from: HttpResponse.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.HttpResponseKt", m7120f = "HttpResponse.kt", m7121i = {0}, m7122l = {97}, m7123m = "bodyAsText", m7124n = {"decoder"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsText$1 */
    /* loaded from: classes8.dex */
    public static final class C102821 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C102821(Continuation<? super C102821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsText(null, null, this);
        }
    }

    @NotNull
    public static final HttpRequest getRequest(@NotNull HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    @InternalAPI
    @PublishedApi
    public static final void complete(@NotNull HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        ((CompletableJob) element).complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsText(@NotNull HttpResponse httpResponse, @NotNull Charset charset, @NotNull Continuation<? super String> continuation) throws Throwable {
        C102821 c102821;
        CharsetDecoder decoder;
        if (continuation instanceof C102821) {
            c102821 = (C102821) continuation;
            int i = c102821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102821.label = i - Integer.MIN_VALUE;
            } else {
                c102821 = new C102821(continuation);
            }
        }
        Object objBodyNullable = c102821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            Charset charset2 = HttpMessagePropertiesKt.charset(httpResponse);
            if (charset2 != null) {
                charset = charset2;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            HttpClientCall call = httpResponse.getCall();
            KType kTypeTypeOf = Reflection.typeOf(ByteReadPacket.class);
            TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(ByteReadPacket.class), kTypeTypeOf);
            c102821.L$0 = charsetDecoderNewDecoder;
            c102821.label = 1;
            objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, c102821);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = (CharsetDecoder) c102821.L$0;
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            Intrinsics.checkNotNullExpressionValue(decoder, "decoder");
            return EncodingKt.decode$default(decoder, (ByteReadPacket) objBodyNullable, 0, 2, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bodyAsText(httpResponse, charset, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsChannel(@NotNull HttpResponse httpResponse, @NotNull Continuation<? super ByteReadChannel> continuation) throws Throwable {
        C102811 c102811;
        if (continuation instanceof C102811) {
            c102811 = (C102811) continuation;
            int i = c102811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102811.label = i - Integer.MIN_VALUE;
            } else {
                c102811 = new C102811(continuation);
            }
        }
        Object objBodyNullable = c102811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            HttpClientCall call = httpResponse.getCall();
            KType kTypeTypeOf = Reflection.typeOf(ByteReadChannel.class);
            TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(ByteReadChannel.class), kTypeTypeOf);
            c102811.label = 1;
            objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, c102811);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            return (ByteReadChannel) objBodyNullable;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }
}
