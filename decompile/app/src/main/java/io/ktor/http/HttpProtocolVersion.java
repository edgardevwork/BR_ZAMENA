package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.HttpVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpProtocolVersion.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m7105d2 = {"Lio/ktor/http/HttpProtocolVersion;", "", "name", "", "major", "", "minor", "(Ljava/lang/String;II)V", "getMajor", "()I", "getMinor", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HttpProtocolVersion {
    public final int major;
    public final int minor;

    @NotNull
    public final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final HttpProtocolVersion HTTP_2_0 = new HttpProtocolVersion(HttpVersion.HTTP, 2, 0);

    @NotNull
    public static final HttpProtocolVersion HTTP_1_1 = new HttpProtocolVersion(HttpVersion.HTTP, 1, 1);

    @NotNull
    public static final HttpProtocolVersion HTTP_1_0 = new HttpProtocolVersion(HttpVersion.HTTP, 1, 0);

    @NotNull
    public static final HttpProtocolVersion SPDY_3 = new HttpProtocolVersion("SPDY", 3, 0);

    @NotNull
    public static final HttpProtocolVersion QUIC = new HttpProtocolVersion("QUIC", 1, 0);

    public static /* synthetic */ HttpProtocolVersion copy$default(HttpProtocolVersion httpProtocolVersion, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = httpProtocolVersion.name;
        }
        if ((i3 & 2) != 0) {
            i = httpProtocolVersion.major;
        }
        if ((i3 & 4) != 0) {
            i2 = httpProtocolVersion.minor;
        }
        return httpProtocolVersion.copy(str, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    @NotNull
    public final HttpProtocolVersion copy(@NotNull String name, int major, int minor) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new HttpProtocolVersion(name, major, minor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) other;
        return Intrinsics.areEqual(this.name, httpProtocolVersion.name) && this.major == httpProtocolVersion.major && this.minor == httpProtocolVersion.minor;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.major)) * 31) + Integer.hashCode(this.minor);
    }

    /* compiled from: HttpProtocolVersion.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0018"}, m7105d2 = {"Lio/ktor/http/HttpProtocolVersion$Companion;", "", "()V", "HTTP_1_0", "Lio/ktor/http/HttpProtocolVersion;", "getHTTP_1_0", "()Lio/ktor/http/HttpProtocolVersion;", "HTTP_1_1", "getHTTP_1_1", "HTTP_2_0", "getHTTP_2_0", "QUIC", "getQUIC", "SPDY_3", "getSPDY_3", "fromValue", "name", "", "major", "", "minor", "parse", "value", "", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HttpProtocolVersion getHTTP_2_0() {
            return HttpProtocolVersion.HTTP_2_0;
        }

        @NotNull
        public final HttpProtocolVersion getHTTP_1_1() {
            return HttpProtocolVersion.HTTP_1_1;
        }

        @NotNull
        public final HttpProtocolVersion getHTTP_1_0() {
            return HttpProtocolVersion.HTTP_1_0;
        }

        @NotNull
        public final HttpProtocolVersion getSPDY_3() {
            return HttpProtocolVersion.SPDY_3;
        }

        @NotNull
        public final HttpProtocolVersion getQUIC() {
            return HttpProtocolVersion.QUIC;
        }

        @NotNull
        public final HttpProtocolVersion fromValue(@NotNull String name, int major, int minor) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (Intrinsics.areEqual(name, HttpVersion.HTTP) && major == 1 && minor == 0) ? getHTTP_1_0() : (Intrinsics.areEqual(name, HttpVersion.HTTP) && major == 1 && minor == 1) ? getHTTP_1_1() : (Intrinsics.areEqual(name, HttpVersion.HTTP) && major == 2 && minor == 0) ? getHTTP_2_0() : new HttpProtocolVersion(name, major, minor);
        }

        @NotNull
        public final HttpProtocolVersion parse(@NotNull CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            List listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{"/", "."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 3) {
                return fromValue((String) listSplit$default.get(0), Integer.parseInt((String) listSplit$default.get(1)), Integer.parseInt((String) listSplit$default.get(2)));
            }
            throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
        }
    }

    public HttpProtocolVersion(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.major = i;
        this.minor = i2;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        return this.name + '/' + this.major + '.' + this.minor;
    }
}
