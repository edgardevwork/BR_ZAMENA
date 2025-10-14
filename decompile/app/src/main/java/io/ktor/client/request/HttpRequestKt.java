package io.ktor.client.request;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.util.AttributesKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequest.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u001a&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0086\u0002\u001a]\u0010\u0007\u001a\u00020\b*\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0007\u001a\u0012\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0014\u001a#\u0010\u0018\u001a\u00020\u0005*\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u001a\u0012\u0010\u0018\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0019\u001a\u00020\f\u001aZ\u0010\u0018\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m7105d2 = {"headers", "Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "invoke", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "Lio/ktor/http/URLBuilder;", "scheme", "", "host", "port", "", "path", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;", "isUpgradeRequest", "", "Lio/ktor/client/request/HttpRequestData;", "takeFrom", "request", "Lio/ktor/client/request/HttpRequest;", "url", "urlString", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpRequestKt {
    @NotNull
    public static final HeadersBuilder headers(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull Function1<? super HeadersBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        block.invoke(headers);
        return headers;
    }

    @NotNull
    public static final HttpRequestBuilder takeFrom(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getContent());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }

    public static final void url(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Function1<? super URLBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(httpRequestBuilder.getUrl());
    }

    @NotNull
    public static final HttpRequestBuilder takeFrom(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull HttpRequestData request) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getBody());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }

    @NotNull
    public static final HttpRequestBuilder invoke(@NotNull HttpRequestBuilder.Companion companion, @NotNull Function1<? super URLBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, block);
        return httpRequestBuilder;
    }

    /* compiled from: HttpRequest.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/http/URLBuilder;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.request.HttpRequestKt$url$1 */
    /* loaded from: classes8.dex */
    public static final class C102681 extends Lambda implements Function1<URLBuilder, Unit> {
        public static final C102681 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull URLBuilder uRLBuilder) {
            Intrinsics.checkNotNullParameter(uRLBuilder, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder) {
            invoke2(uRLBuilder);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void url$default(HttpRequestBuilder httpRequestBuilder, String str, String str2, Integer num, String str3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function1 = C102681.INSTANCE;
        }
        url(httpRequestBuilder, str, str2, num, str3, function1);
    }

    public static final void url(@NotNull HttpRequestBuilder httpRequestBuilder, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super URLBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        URLBuilderKt.set(httpRequestBuilder.getUrl(), str, str2, num, str3, block);
    }

    /* compiled from: HttpRequest.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/http/URLBuilder;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.request.HttpRequestKt$invoke$2 */
    /* loaded from: classes8.dex */
    public static final class C102672 extends Lambda implements Function1<URLBuilder, Unit> {
        public static final C102672 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull URLBuilder uRLBuilder) {
            Intrinsics.checkNotNullParameter(uRLBuilder, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder) {
            invoke2(uRLBuilder);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ HttpRequestBuilder invoke$default(HttpRequestBuilder.Companion companion, String str, String str2, Integer num, String str3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function1 = C102672.INSTANCE;
        }
        return invoke(companion, str, str2, num, str3, function1);
    }

    @NotNull
    public static final HttpRequestBuilder invoke(@NotNull HttpRequestBuilder.Companion companion, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super URLBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, str, str2, num, str3, block);
        return httpRequestBuilder;
    }

    public static final void url(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), urlString);
    }

    @InternalAPI
    public static final boolean isUpgradeRequest(@NotNull HttpRequestData httpRequestData) {
        Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        return httpRequestData.getBody() instanceof ClientUpgradeContent;
    }
}
