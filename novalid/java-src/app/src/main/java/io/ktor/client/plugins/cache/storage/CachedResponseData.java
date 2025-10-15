package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheStorage.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J)\u0010$\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006+"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "", "url", "Lio/ktor/http/Url;", "statusCode", "Lio/ktor/http/HttpStatusCode;", "requestTime", "Lio/ktor/util/date/GMTDate;", "responseTime", "version", "Lio/ktor/http/HttpProtocolVersion;", ClientCookie.EXPIRES_ATTR, "headers", "Lio/ktor/http/Headers;", "varyKeys", "", "", "body", "", "(Lio/ktor/http/Url;Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/util/date/GMTDate;Lio/ktor/http/HttpProtocolVersion;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Ljava/util/Map;[B)V", "getBody", "()[B", "getExpires", "()Lio/ktor/util/date/GMTDate;", "getHeaders", "()Lio/ktor/http/Headers;", "getRequestTime", "getResponseTime", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "getUrl", "()Lio/ktor/http/Url;", "getVaryKeys", "()Ljava/util/Map;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "copy", "copy$ktor_client_core", "equals", "", "other", "hashCode", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CachedResponseData {

    @NotNull
    public final byte[] body;

    @NotNull
    public final GMTDate expires;

    @NotNull
    public final Headers headers;

    @NotNull
    public final GMTDate requestTime;

    @NotNull
    public final GMTDate responseTime;

    @NotNull
    public final HttpStatusCode statusCode;

    @NotNull
    public final Url url;

    @NotNull
    public final Map<String, String> varyKeys;

    @NotNull
    public final HttpProtocolVersion version;

    public CachedResponseData(@NotNull Url url, @NotNull HttpStatusCode statusCode, @NotNull GMTDate requestTime, @NotNull GMTDate responseTime, @NotNull HttpProtocolVersion version, @NotNull GMTDate expires, @NotNull Headers headers, @NotNull Map<String, String> varyKeys, @NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(responseTime, "responseTime");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(expires, "expires");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(body, "body");
        this.url = url;
        this.statusCode = statusCode;
        this.requestTime = requestTime;
        this.responseTime = responseTime;
        this.version = version;
        this.expires = expires;
        this.headers = headers;
        this.varyKeys = varyKeys;
        this.body = body;
    }

    @NotNull
    public final Url getUrl() {
        return this.url;
    }

    @NotNull
    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final GMTDate getRequestTime() {
        return this.requestTime;
    }

    @NotNull
    public final GMTDate getResponseTime() {
        return this.responseTime;
    }

    @NotNull
    public final HttpProtocolVersion getVersion() {
        return this.version;
    }

    @NotNull
    public final GMTDate getExpires() {
        return this.expires;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> getVaryKeys() {
        return this.varyKeys;
    }

    @NotNull
    public final byte[] getBody() {
        return this.body;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedResponseData)) {
            return false;
        }
        CachedResponseData cachedResponseData = (CachedResponseData) other;
        return Intrinsics.areEqual(this.url, cachedResponseData.url) && Intrinsics.areEqual(this.varyKeys, cachedResponseData.varyKeys);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.varyKeys.hashCode();
    }

    @NotNull
    public final CachedResponseData copy$ktor_client_core(@NotNull Map<String, String> varyKeys, @NotNull GMTDate expires) {
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(expires, "expires");
        return new CachedResponseData(this.url, this.statusCode, this.requestTime, this.responseTime, this.version, expires, this.headers, varyKeys, this.body);
    }
}
