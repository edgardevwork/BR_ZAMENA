package io.ktor.http.content;

import io.ktor.http.DateUtilsKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.util.date.DateKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Versions.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0014\u0010\u0018\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aJ\u0014\u0010\u001b\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u001a\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m7105d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "lastModified", "Lio/ktor/util/date/GMTDate;", "(Lio/ktor/util/date/GMTDate;)V", "getLastModified", "()Lio/ktor/util/date/GMTDate;", "truncatedModificationDate", "appendHeadersTo", "", "builder", "Lio/ktor/http/HeadersBuilder;", "check", "Lio/ktor/http/content/VersionCheckResult;", "requestHeaders", "Lio/ktor/http/Headers;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "ifModifiedSince", "dates", "", "ifUnmodifiedSince", "toString", "", "parseDates", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1747#2,3:262\n1726#2,3:265\n766#2:268\n857#2,2:269\n1603#2,9:271\n1855#2:280\n1856#2:282\n1612#2:283\n1#3:281\n1#3:284\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n*L\n96#1:262,3\n103#1:265,3\n111#1:268\n111#1:269,2\n112#1:271,9\n112#1:280\n112#1:282\n112#1:283\n112#1:281\n*E\n"})
/* loaded from: classes7.dex */
public final /* data */ class LastModifiedVersion implements Version {

    @NotNull
    public final GMTDate lastModified;

    @NotNull
    public final GMTDate truncatedModificationDate;

    public static /* synthetic */ LastModifiedVersion copy$default(LastModifiedVersion lastModifiedVersion, GMTDate gMTDate, int i, Object obj) {
        if ((i & 1) != 0) {
            gMTDate = lastModifiedVersion.lastModified;
        }
        return lastModifiedVersion.copy(gMTDate);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GMTDate getLastModified() {
        return this.lastModified;
    }

    @NotNull
    public final LastModifiedVersion copy(@NotNull GMTDate lastModified) {
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        return new LastModifiedVersion(lastModified);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LastModifiedVersion) && Intrinsics.areEqual(this.lastModified, ((LastModifiedVersion) other).lastModified);
    }

    public int hashCode() {
        return this.lastModified.hashCode();
    }

    @NotNull
    public String toString() {
        return "LastModifiedVersion(lastModified=" + this.lastModified + ')';
    }

    public LastModifiedVersion(@NotNull GMTDate lastModified) {
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        this.lastModified = lastModified;
        this.truncatedModificationDate = DateKt.truncateToSeconds(lastModified);
    }

    @NotNull
    public final GMTDate getLastModified() {
        return this.lastModified;
    }

    @Override // io.ktor.http.content.Version
    @NotNull
    public VersionCheckResult check(@NotNull Headers requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        List<String> all = requestHeaders.getAll(httpHeaders.getIfModifiedSince());
        List<GMTDate> dates = all != null ? parseDates(all) : null;
        if (dates != null && !ifModifiedSince(dates)) {
            return VersionCheckResult.NOT_MODIFIED;
        }
        List<String> all2 = requestHeaders.getAll(httpHeaders.getIfUnmodifiedSince());
        List<GMTDate> dates2 = all2 != null ? parseDates(all2) : null;
        if (dates2 != null && !ifUnmodifiedSince(dates2)) {
            return VersionCheckResult.PRECONDITION_FAILED;
        }
        return VersionCheckResult.f9678OK;
    }

    public final boolean ifModifiedSince(@NotNull List<GMTDate> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((GMTDate) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean ifUnmodifiedSince(@NotNull List<GMTDate> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((GMTDate) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(@NotNull HeadersBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.set(HttpHeaders.INSTANCE.getLastModified(), DateUtilsKt.toHttpDate(this.lastModified));
    }

    public final List<GMTDate> parseDates(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt__StringsJVMKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            GMTDate gMTDateFromHttpToGmtDate = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDateFromHttpToGmtDate = DateUtilsKt.fromHttpToGmtDate((String) it.next());
            } catch (Throwable unused) {
            }
            if (gMTDateFromHttpToGmtDate != null) {
                arrayList2.add(gMTDateFromHttpToGmtDate);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        return null;
    }
}
