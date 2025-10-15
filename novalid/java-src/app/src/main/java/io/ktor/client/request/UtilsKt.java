package io.ktor.client.request;

import io.ktor.http.ContentType;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.util.Base64Kt;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: utils.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0012\u0010\u0016\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0001\u001at\u0010\u0018\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010#\u001a\u001c\u0010$\u001a\u00020\u000f*\u00020\u00102\u0006\u0010%\u001a\u00020\u00012\b\u0010\u0000\u001a\u0004\u0018\u00010&\u001a\u001c\u0010'\u001a\u00020\u000f*\u00020\u00032\u0006\u0010%\u001a\u00020\u00012\b\u0010\u0000\u001a\u0004\u0018\u00010&\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006("}, m7105d2 = {"value", "", "host", "Lio/ktor/client/request/HttpRequestBuilder;", "getHost", "(Lio/ktor/client/request/HttpRequestBuilder;)Ljava/lang/String;", "setHost", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", "", "port", "getPort", "(Lio/ktor/client/request/HttpRequestBuilder;)I", "setPort", "(Lio/ktor/client/request/HttpRequestBuilder;I)V", "accept", "", "Lio/ktor/http/HttpMessageBuilder;", "contentType", "Lio/ktor/http/ContentType;", "basicAuth", "username", "password", "bearerAuth", "token", "cookie", "name", "maxAge", ClientCookie.EXPIRES_ATTR, "Lio/ktor/util/date/GMTDate;", ClientCookie.DOMAIN_ATTR, "path", ClientCookie.SECURE_ATTR, "", "httpOnly", "extensions", "", "header", "key", "", "parameter", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/request/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes4.dex */
public final class UtilsKt {
    @NotNull
    public static final String getHost(@NotNull HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final void setHost(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull String value) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        httpRequestBuilder.getUrl().setHost(value);
    }

    public static final int getPort(@NotNull HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void setPort(@NotNull HttpRequestBuilder httpRequestBuilder, int i) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getUrl().setPort(i);
    }

    public static final void header(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void cookie(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String name, @NotNull String value, int i, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z, boolean z2, @NotNull Map<String, String> extensions) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        String strRenderCookieHeader = CookieKt.renderCookieHeader(new Cookie(name, value, null, i, gMTDate, str, str2, z, z2, extensions, 4, null));
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (!headers.contains(httpHeaders.getCookie())) {
            httpMessageBuilder.getHeaders().append(httpHeaders.getCookie(), strRenderCookieHeader);
            return;
        }
        httpMessageBuilder.getHeaders().set(httpHeaders.getCookie(), httpMessageBuilder.getHeaders().get(httpHeaders.getCookie()) + "; " + strRenderCookieHeader);
    }

    public static final void parameter(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(key, obj.toString());
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void accept(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull ContentType contentType) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String username, @NotNull String password) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        String authorization = HttpHeaders.INSTANCE.getAuthorization();
        StringBuilder sb = new StringBuilder();
        sb.append("Basic ");
        sb.append(Base64Kt.encodeBase64(username + ':' + password));
        header(httpMessageBuilder, authorization, sb.toString());
    }

    public static final void bearerAuth(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String token) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        header(httpMessageBuilder, HttpHeaders.INSTANCE.getAuthorization(), "Bearer " + token);
    }
}
