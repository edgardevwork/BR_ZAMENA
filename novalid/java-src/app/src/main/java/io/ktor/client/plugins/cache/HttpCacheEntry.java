package io.ktor.client.plugins.cache;

import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheEntry.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001d\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m7105d2 = {"Lio/ktor/client/plugins/cache/HttpCacheEntry;", "", ClientCookie.EXPIRES_ATTR, "Lio/ktor/util/date/GMTDate;", "varyKeys", "", "", "response", "Lio/ktor/client/statement/HttpResponse;", "body", "", "(Lio/ktor/util/date/GMTDate;Ljava/util/Map;Lio/ktor/client/statement/HttpResponse;[B)V", "getBody", "()[B", "getExpires", "()Lio/ktor/util/date/GMTDate;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "responseHeaders", "Lio/ktor/http/Headers;", "getResponseHeaders$ktor_client_core", "()Lio/ktor/http/Headers;", "getVaryKeys", "()Ljava/util/Map;", "equals", "", "other", "hashCode", "", "produceResponse", "produceResponse$ktor_client_core", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,143:1\n24#2:144\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n*L\n32#1:144\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCacheEntry {

    @NotNull
    public final byte[] body;

    @NotNull
    public final GMTDate expires;

    @NotNull
    public final HttpResponse response;

    @NotNull
    public final Headers responseHeaders;

    @NotNull
    public final Map<String, String> varyKeys;

    public HttpCacheEntry(@NotNull GMTDate expires, @NotNull Map<String, String> varyKeys, @NotNull HttpResponse response, @NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(expires, "expires");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(body, "body");
        this.expires = expires;
        this.varyKeys = varyKeys;
        this.response = response;
        this.body = body;
        Headers.Companion companion = Headers.INSTANCE;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(response.getHeaders());
        this.responseHeaders = headersBuilder.build();
    }

    @NotNull
    public final GMTDate getExpires() {
        return this.expires;
    }

    @NotNull
    public final Map<String, String> getVaryKeys() {
        return this.varyKeys;
    }

    @NotNull
    public final HttpResponse getResponse() {
        return this.response;
    }

    @NotNull
    public final byte[] getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: getResponseHeaders$ktor_client_core, reason: from getter */
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    @NotNull
    public final HttpResponse produceResponse$ktor_client_core() {
        return new SavedHttpCall(this.response.getCall().getClient(), this.response.getCall().getRequest(), this.response, this.body).getResponse();
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof HttpCacheEntry)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        return Intrinsics.areEqual(this.varyKeys, ((HttpCacheEntry) other).varyKeys);
    }

    public int hashCode() {
        return this.varyKeys.hashCode();
    }
}
