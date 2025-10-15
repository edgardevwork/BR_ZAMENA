package io.ktor.http.content;

import io.ktor.http.CacheControl;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CachingOptions.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/http/content/CachingOptions;", "", "cacheControl", "Lio/ktor/http/CacheControl;", ClientCookie.EXPIRES_ATTR, "Lio/ktor/util/date/GMTDate;", "(Lio/ktor/http/CacheControl;Lio/ktor/util/date/GMTDate;)V", "getCacheControl", "()Lio/ktor/http/CacheControl;", "getExpires", "()Lio/ktor/util/date/GMTDate;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CachingOptions {

    @Nullable
    public final CacheControl cacheControl;

    @Nullable
    public final GMTDate expires;

    public CachingOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CachingOptions copy$default(CachingOptions cachingOptions, CacheControl cacheControl, GMTDate gMTDate, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheControl = cachingOptions.cacheControl;
        }
        if ((i & 2) != 0) {
            gMTDate = cachingOptions.expires;
        }
        return cachingOptions.copy(cacheControl, gMTDate);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CacheControl getCacheControl() {
        return this.cacheControl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final GMTDate getExpires() {
        return this.expires;
    }

    @NotNull
    public final CachingOptions copy(@Nullable CacheControl cacheControl, @Nullable GMTDate expires) {
        return new CachingOptions(cacheControl, expires);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachingOptions)) {
            return false;
        }
        CachingOptions cachingOptions = (CachingOptions) other;
        return Intrinsics.areEqual(this.cacheControl, cachingOptions.cacheControl) && Intrinsics.areEqual(this.expires, cachingOptions.expires);
    }

    public int hashCode() {
        CacheControl cacheControl = this.cacheControl;
        int iHashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        GMTDate gMTDate = this.expires;
        return iHashCode + (gMTDate != null ? gMTDate.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CachingOptions(cacheControl=" + this.cacheControl + ", expires=" + this.expires + ')';
    }

    public CachingOptions(@Nullable CacheControl cacheControl, @Nullable GMTDate gMTDate) {
        this.cacheControl = cacheControl;
        this.expires = gMTDate;
    }

    public /* synthetic */ CachingOptions(CacheControl cacheControl, GMTDate gMTDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cacheControl, (i & 2) != 0 ? null : gMTDate);
    }

    @Nullable
    public final CacheControl getCacheControl() {
        return this.cacheControl;
    }

    @Nullable
    public final GMTDate getExpires() {
        return this.expires;
    }
}
