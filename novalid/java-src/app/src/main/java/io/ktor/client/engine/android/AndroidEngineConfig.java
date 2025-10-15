package io.ktor.client.engine.android;

import io.ktor.client.engine.HttpClientEngineConfig;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidEngineConfig.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, m7105d2 = {"Lio/ktor/client/engine/android/AndroidEngineConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "()V", "connectTimeout", "", "getConnectTimeout", "()I", "setConnectTimeout", "(I)V", "requestConfig", "Lkotlin/Function1;", "Ljava/net/HttpURLConnection;", "", "Lkotlin/ExtensionFunctionType;", "getRequestConfig", "()Lkotlin/jvm/functions/Function1;", "setRequestConfig", "(Lkotlin/jvm/functions/Function1;)V", "socketTimeout", "getSocketTimeout", "setSocketTimeout", "sslManager", "Ljavax/net/ssl/HttpsURLConnection;", "getSslManager", "setSslManager", "ktor-client-android"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class AndroidEngineConfig extends HttpClientEngineConfig {
    public int connectTimeout = 100000;
    public int socketTimeout = 100000;

    @NotNull
    public Function1<? super HttpsURLConnection, Unit> sslManager = new Function1<HttpsURLConnection, Unit>() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$sslManager$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull HttpsURLConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpsURLConnection httpsURLConnection) {
            invoke2(httpsURLConnection);
            return Unit.INSTANCE;
        }
    };

    @NotNull
    public Function1<? super HttpURLConnection, Unit> requestConfig = new Function1<HttpURLConnection, Unit>() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$requestConfig$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpURLConnection httpURLConnection) {
            invoke2(httpURLConnection);
            return Unit.INSTANCE;
        }
    };

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public final int getSocketTimeout() {
        return this.socketTimeout;
    }

    public final void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    @NotNull
    public final Function1<HttpsURLConnection, Unit> getSslManager() {
        return this.sslManager;
    }

    public final void setSslManager(@NotNull Function1<? super HttpsURLConnection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.sslManager = function1;
    }

    @NotNull
    public final Function1<HttpURLConnection, Unit> getRequestConfig() {
        return this.requestConfig;
    }

    public final void setRequestConfig(@NotNull Function1<? super HttpURLConnection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.requestConfig = function1;
    }
}
