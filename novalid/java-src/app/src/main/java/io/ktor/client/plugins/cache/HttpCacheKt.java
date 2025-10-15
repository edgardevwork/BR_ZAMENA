package io.ktor.client.plugins.cache;

import io.ktor.client.engine.UtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLProtocol;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;
import org.jfrog.filespecs.properties.PropertiesParser;
import org.slf4j.Logger;

/* compiled from: HttpCache.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001aN\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f0\u0006H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002\"\u0018\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, m7105d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;", "mergedHeadersLookup", "Lkotlin/Function1;", "", "content", "Lio/ktor/http/content/OutgoingContent;", "headerExtractor", "allHeadersExtractor", "", "canStore", "", "Lio/ktor/http/URLProtocol;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpCacheKt {

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCache");

    @NotNull
    public static final Logger getLOGGER() {
        return LOGGER;
    }

    @NotNull
    public static final Function1<String, String> mergedHeadersLookup(@NotNull OutgoingContent content, @NotNull Function1<? super String, String> headerExtractor, @NotNull Function1<? super String, ? extends List<String>> allHeadersExtractor) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headerExtractor, "headerExtractor");
        Intrinsics.checkNotNullParameter(allHeadersExtractor, "allHeadersExtractor");
        return new Function1<String, String>() { // from class: io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup.1
            public final /* synthetic */ Function1<String, List<String>> $allHeadersExtractor;
            public final /* synthetic */ Function1<String, String> $headerExtractor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C101641(Function1<? super String, String> headerExtractor2, Function1<? super String, ? extends List<String>> allHeadersExtractor2) {
                super(1);
                function1 = headerExtractor2;
                function1 = allHeadersExtractor2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String header) {
                String string;
                Intrinsics.checkNotNullParameter(header, "header");
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (Intrinsics.areEqual(header, httpHeaders.getContentLength())) {
                    Long contentLength = outgoingContent.getContentLength();
                    if (contentLength == null || (string = contentLength.toString()) == null) {
                        return "";
                    }
                } else {
                    if (!Intrinsics.areEqual(header, httpHeaders.getContentType())) {
                        if (Intrinsics.areEqual(header, httpHeaders.getUserAgent())) {
                            String str = outgoingContent.getHeaders().get(httpHeaders.getUserAgent());
                            if (str != null) {
                                return str;
                            }
                            String strInvoke = function1.invoke(httpHeaders.getUserAgent());
                            return strInvoke == null ? UtilsKt.getKTOR_DEFAULT_USER_AGENT() : strInvoke;
                        }
                        List<String> all = outgoingContent.getHeaders().getAll(header);
                        if (all == null && (all = function1.invoke(header)) == null) {
                            all = CollectionsKt__CollectionsKt.emptyList();
                        }
                        return CollectionsKt___CollectionsKt.joinToString$default(all, PropertiesParser.PROPS_SEPARATOR, null, null, 0, null, null, 62, null);
                    }
                    ContentType contentType = outgoingContent.getContentType();
                    if (contentType == null || (string = contentType.toString()) == null) {
                        return "";
                    }
                }
                return string;
            }
        };
    }

    /* compiled from: HttpCache.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "header", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheKt$mergedHeadersLookup$1 */
    /* loaded from: classes7.dex */
    public static final class C101641 extends Lambda implements Function1<String, String> {
        public final /* synthetic */ Function1<String, List<String>> $allHeadersExtractor;
        public final /* synthetic */ Function1<String, String> $headerExtractor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C101641(Function1<? super String, String> headerExtractor2, Function1<? super String, ? extends List<String>> allHeadersExtractor2) {
            super(1);
            function1 = headerExtractor2;
            function1 = allHeadersExtractor2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull String header) {
            String string;
            Intrinsics.checkNotNullParameter(header, "header");
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            if (Intrinsics.areEqual(header, httpHeaders.getContentLength())) {
                Long contentLength = outgoingContent.getContentLength();
                if (contentLength == null || (string = contentLength.toString()) == null) {
                    return "";
                }
            } else {
                if (!Intrinsics.areEqual(header, httpHeaders.getContentType())) {
                    if (Intrinsics.areEqual(header, httpHeaders.getUserAgent())) {
                        String str = outgoingContent.getHeaders().get(httpHeaders.getUserAgent());
                        if (str != null) {
                            return str;
                        }
                        String strInvoke = function1.invoke(httpHeaders.getUserAgent());
                        return strInvoke == null ? UtilsKt.getKTOR_DEFAULT_USER_AGENT() : strInvoke;
                    }
                    List<String> all = outgoingContent.getHeaders().getAll(header);
                    if (all == null && (all = function1.invoke(header)) == null) {
                        all = CollectionsKt__CollectionsKt.emptyList();
                    }
                    return CollectionsKt___CollectionsKt.joinToString$default(all, PropertiesParser.PROPS_SEPARATOR, null, null, 0, null, null, 62, null);
                }
                ContentType contentType = outgoingContent.getContentType();
                if (contentType == null || (string = contentType.toString()) == null) {
                    return "";
                }
            }
            return string;
        }
    }

    public static final boolean canStore(URLProtocol uRLProtocol) {
        return Intrinsics.areEqual(uRLProtocol.getName(), HttpHost.DEFAULT_SCHEME_NAME) || Intrinsics.areEqual(uRLProtocol.getName(), "https");
    }
}
