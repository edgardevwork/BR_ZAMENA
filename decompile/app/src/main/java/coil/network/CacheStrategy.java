package coil.network;

import coil.util.Time;
import coil.util.Utils;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheStrategy.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m7105d2 = {"Lcoil/network/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lcoil/network/CacheResponse;", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "getCacheResponse", "()Lcoil/network/CacheResponse;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public final CacheResponse cacheResponse;

    @Nullable
    public final Request networkRequest;

    public /* synthetic */ CacheStrategy(Request request, CacheResponse cacheResponse, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cacheResponse);
    }

    public CacheStrategy(Request request, CacheResponse cacheResponse) {
        this.networkRequest = request;
        this.cacheResponse = cacheResponse;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }

    @Nullable
    public final CacheResponse getCacheResponse() {
        return this.cacheResponse;
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7105d2 = {"Lcoil/network/CacheStrategy$Factory;", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lcoil/network/CacheResponse;", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "ageSeconds", "", "etag", "", ClientCookie.EXPIRES_ATTR, "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lcoil/network/CacheStrategy;", "computeFreshnessLifetime", "hasConditions", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Factory {
        public int ageSeconds;

        @Nullable
        public final CacheResponse cacheResponse;

        @Nullable
        public String etag;

        @Nullable
        public Date expires;

        @Nullable
        public Date lastModified;

        @Nullable
        public String lastModifiedString;
        public long receivedResponseMillis;

        @NotNull
        public final Request request;
        public long sentRequestMillis;

        @Nullable
        public Date servedDate;

        @Nullable
        public String servedDateString;

        public Factory(@NotNull Request request, @Nullable CacheResponse cacheResponse) {
            this.request = request;
            this.cacheResponse = cacheResponse;
            this.ageSeconds = -1;
            if (cacheResponse != null) {
                this.sentRequestMillis = cacheResponse.getSentRequestAtMillis();
                this.receivedResponseMillis = cacheResponse.getReceivedResponseAtMillis();
                Headers responseHeaders = cacheResponse.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i = 0; i < size; i++) {
                    String strName = responseHeaders.name(i);
                    if (StringsKt__StringsJVMKt.equals(strName, "Date", true)) {
                        this.servedDate = responseHeaders.getDate("Date");
                        this.servedDateString = responseHeaders.value(i);
                    } else if (StringsKt__StringsJVMKt.equals(strName, "Expires", true)) {
                        this.expires = responseHeaders.getDate("Expires");
                    } else if (StringsKt__StringsJVMKt.equals(strName, "Last-Modified", true)) {
                        this.lastModified = responseHeaders.getDate("Last-Modified");
                        this.lastModifiedString = responseHeaders.value(i);
                    } else if (StringsKt__StringsJVMKt.equals(strName, "ETag", true)) {
                        this.etag = responseHeaders.value(i);
                    } else if (StringsKt__StringsJVMKt.equals(strName, "Age", true)) {
                        this.ageSeconds = Utils.toNonNegativeInt(responseHeaders.value(i), -1);
                    }
                }
            }
        }

        @NotNull
        public final CacheStrategy compute() {
            String str;
            CacheResponse cacheResponse = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 0;
            byte b7 = 0;
            byte b8 = 0;
            byte b9 = 0;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, cacheResponse, b12 == true ? 1 : 0);
            }
            if (this.request.isHttps() && !this.cacheResponse.getIsTls()) {
                return new CacheStrategy(this.request, b11 == true ? 1 : 0, b10 == true ? 1 : 0);
            }
            CacheControl cacheControl = this.cacheResponse.getCacheControl();
            if (!CacheStrategy.INSTANCE.isCacheable(this.request, this.cacheResponse)) {
                return new CacheStrategy(this.request, b9 == true ? 1 : 0, b8 == true ? 1 : 0);
            }
            CacheControl cacheControl2 = this.request.cacheControl();
            if (cacheControl2.noCache() || hasConditions(this.request)) {
                return new CacheStrategy(this.request, b2 == true ? 1 : 0, b == true ? 1 : 0);
            }
            long jCacheResponseAge = cacheResponseAge();
            long jComputeFreshnessLifetime = computeFreshnessLifetime();
            if (cacheControl2.maxAgeSeconds() != -1) {
                jComputeFreshnessLifetime = Math.min(jComputeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl2.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl2.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl2.minFreshSeconds()) : 0L;
            if (!cacheControl.mustRevalidate() && cacheControl2.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControl2.maxStaleSeconds());
            }
            if (!cacheControl.noCache() && jCacheResponseAge + millis2 < jComputeFreshnessLifetime + millis) {
                return new CacheStrategy(b7 == true ? 1 : 0, this.cacheResponse, b6 == true ? 1 : 0);
            }
            String str2 = this.etag;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                    Intrinsics.checkNotNull(str2);
                } else if (this.servedDate != null) {
                    str2 = this.servedDateString;
                    Intrinsics.checkNotNull(str2);
                } else {
                    return new CacheStrategy(this.request, b4 == true ? 1 : 0, b3 == true ? 1 : 0);
                }
            }
            return new CacheStrategy(this.request.newBuilder().addHeader(str, str2).build(), this.cacheResponse, b5 == true ? 1 : 0);
        }

        public final long computeFreshnessLifetime() {
            CacheResponse cacheResponse = this.cacheResponse;
            Intrinsics.checkNotNull(cacheResponse);
            if (cacheResponse.getCacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.request.url().query() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        public final long cacheResponseAge() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            return jMax + (this.receivedResponseMillis - this.sentRequestMillis) + (Time.INSTANCE.currentMillis() - this.receivedResponseMillis);
        }

        public final boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, m7105d2 = {"Lcoil/network/CacheStrategy$Companion;", "", "()V", "combineHeaders", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isCacheable", "", "request", "Lokhttp3/Request;", "response", "Lcoil/network/CacheResponse;", "Lokhttp3/Response;", "isContentSpecificHeader", "name", "", "isEndToEnd", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean isCacheable(@NotNull Request request, @NotNull Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || Intrinsics.areEqual(response.headers().get("Vary"), "*")) ? false : true;
        }

        public final boolean isCacheable(@NotNull Request request, @NotNull CacheResponse response) {
            return (request.cacheControl().noStore() || response.getCacheControl().noStore() || Intrinsics.areEqual(response.getResponseHeaders().get("Vary"), "*")) ? false : true;
        }

        @NotNull
        public final Headers combineHeaders(@NotNull Headers cachedHeaders, @NotNull Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i = 0; i < size; i++) {
                String strName = cachedHeaders.name(i);
                String strValue = cachedHeaders.value(i);
                if ((!StringsKt__StringsJVMKt.equals("Warning", strName, true) || !StringsKt__StringsJVMKt.startsWith$default(strValue, "1", false, 2, null)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || networkHeaders.get(strName) == null)) {
                    builder.addUnsafeNonAscii(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strName2 = networkHeaders.name(i2);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addUnsafeNonAscii(strName2, networkHeaders.value(i2));
                }
            }
            return builder.build();
        }

        public final boolean isEndToEnd(String name) {
            return (StringsKt__StringsJVMKt.equals("Connection", name, true) || StringsKt__StringsJVMKt.equals("Keep-Alive", name, true) || StringsKt__StringsJVMKt.equals("Proxy-Authenticate", name, true) || StringsKt__StringsJVMKt.equals("Proxy-Authorization", name, true) || StringsKt__StringsJVMKt.equals("TE", name, true) || StringsKt__StringsJVMKt.equals("Trailers", name, true) || StringsKt__StringsJVMKt.equals("Transfer-Encoding", name, true) || StringsKt__StringsJVMKt.equals("Upgrade", name, true)) ? false : true;
        }

        public final boolean isContentSpecificHeader(String name) {
            return StringsKt__StringsJVMKt.equals("Content-Length", name, true) || StringsKt__StringsJVMKt.equals("Content-Encoding", name, true) || StringsKt__StringsJVMKt.equals("Content-Type", name, true);
        }
    }
}
