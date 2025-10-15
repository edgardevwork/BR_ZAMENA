package io.ktor.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpMethod.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/http/HttpMethod;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HttpMethod {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final List<HttpMethod> DefaultMethods;

    @NotNull
    public static final HttpMethod Delete;

    @NotNull
    public static final HttpMethod Get;

    @NotNull
    public static final HttpMethod Head;

    @NotNull
    public static final HttpMethod Options;

    @NotNull
    public static final HttpMethod Patch;

    @NotNull
    public static final HttpMethod Post;

    @NotNull
    public static final HttpMethod Put;

    @NotNull
    public final String value;

    public static /* synthetic */ HttpMethod copy$default(HttpMethod httpMethod, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpMethod.value;
        }
        return httpMethod.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final HttpMethod copy(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new HttpMethod(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HttpMethod) && Intrinsics.areEqual(this.value, ((HttpMethod) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpMethod(value=" + this.value + ')';
    }

    /* compiled from: HttpMethod.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n¨\u0006\u001a"}, m7105d2 = {"Lio/ktor/http/HttpMethod$Companion;", "", "()V", "DefaultMethods", "", "Lio/ktor/http/HttpMethod;", "getDefaultMethods", "()Ljava/util/List;", "Delete", "getDelete", "()Lio/ktor/http/HttpMethod;", "Get", "getGet", "Head", "getHead", "Options", "getOptions", "Patch", "getPatch", "Post", "getPost", "Put", "getPut", "parse", FirebaseAnalytics.Param.METHOD, "", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HttpMethod getGet() {
            return HttpMethod.Get;
        }

        @NotNull
        public final HttpMethod getPost() {
            return HttpMethod.Post;
        }

        @NotNull
        public final HttpMethod getPut() {
            return HttpMethod.Put;
        }

        @NotNull
        public final HttpMethod getPatch() {
            return HttpMethod.Patch;
        }

        @NotNull
        public final HttpMethod getDelete() {
            return HttpMethod.Delete;
        }

        @NotNull
        public final HttpMethod getHead() {
            return HttpMethod.Head;
        }

        @NotNull
        public final HttpMethod getOptions() {
            return HttpMethod.Options;
        }

        @NotNull
        public final HttpMethod parse(@NotNull String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            return Intrinsics.areEqual(method, getGet().getValue()) ? getGet() : Intrinsics.areEqual(method, getPost().getValue()) ? getPost() : Intrinsics.areEqual(method, getPut().getValue()) ? getPut() : Intrinsics.areEqual(method, getPatch().getValue()) ? getPatch() : Intrinsics.areEqual(method, getDelete().getValue()) ? getDelete() : Intrinsics.areEqual(method, getHead().getValue()) ? getHead() : Intrinsics.areEqual(method, getOptions().getValue()) ? getOptions() : new HttpMethod(method);
        }

        @NotNull
        public final List<HttpMethod> getDefaultMethods() {
            return HttpMethod.DefaultMethods;
        }
    }

    public HttpMethod(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    static {
        HttpMethod httpMethod = new HttpMethod("GET");
        Get = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST");
        Post = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("PUT");
        Put = httpMethod3;
        HttpMethod httpMethod4 = new HttpMethod("PATCH");
        Patch = httpMethod4;
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        Delete = httpMethod5;
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        Head = httpMethod6;
        HttpMethod httpMethod7 = new HttpMethod("OPTIONS");
        Options = httpMethod7;
        DefaultMethods = CollectionsKt__CollectionsKt.listOf((Object[]) new HttpMethod[]{httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7});
    }
}
