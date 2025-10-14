package ru.rustore.sdk.remoteconfig.internal;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.TextStreamsKt;
import kotlin.text.Charsets;
import org.json.JSONObject;
import ru.rustore.sdk.remoteconfig.BuildConfig;
import ru.rustore.sdk.remoteconfig.ConfigRequestParameter;
import ru.rustore.sdk.remoteconfig.ConfigRequestParameterProvider;
import ru.rustore.sdk.remoteconfig.Environment;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.Z */
/* loaded from: classes5.dex */
public final class C11714Z {

    /* renamed from: a */
    public final String f10875a;

    /* renamed from: b */
    public final C11711X0 f10876b;

    /* renamed from: c */
    public final ConfigRequestParameterProvider f10877c;

    /* renamed from: d */
    public final C11768v0 f10878d;

    /* renamed from: e */
    public final SSLSocketFactory f10879e;

    /* renamed from: f */
    public final Lazy f10880f;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.Z$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0<URL> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final URL invoke() {
            C11714Z.this.f10878d.getClass();
            return new URL(BuildConfig.REMOTE_CONFIG_BACKEND_URL);
        }
    }

    public C11714Z(String appId, C11711X0 requestParameterHolder, ConfigRequestParameterProvider configRequestParameterProvider, C11768v0 remoteConfigEndpointProvider, SSLSocketFactory internalSsLSocketFactory) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(requestParameterHolder, "requestParameterHolder");
        Intrinsics.checkNotNullParameter(configRequestParameterProvider, "configRequestParameterProvider");
        Intrinsics.checkNotNullParameter(remoteConfigEndpointProvider, "remoteConfigEndpointProvider");
        Intrinsics.checkNotNullParameter(internalSsLSocketFactory, "internalSsLSocketFactory");
        this.f10875a = appId;
        this.f10876b = requestParameterHolder;
        this.f10877c = configRequestParameterProvider;
        this.f10878d = remoteConfigEndpointProvider;
        this.f10879e = internalSsLSocketFactory;
        this.f10880f = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public final String m7529a(C11759r c11759r, String str) {
        ConfigRequestParameter configRequestParameter = this.f10877c.getConfigRequestParameter();
        Pair pairM7112to = TuplesKt.m7112to(CommonUrlParts.APP_ID, this.f10875a);
        Pair pairM7112to2 = TuplesKt.m7112to("device_id", this.f10876b.f10869a);
        Pair pairM7112to3 = TuplesKt.m7112to("cond_s", c11759r != null ? c11759r.f10972b : null);
        Pair pairM7112to4 = TuplesKt.m7112to("config_v", c11759r != null ? Long.valueOf(c11759r.f10971a).toString() : null);
        String str2 = this.f10876b.f10871c;
        if (str2 == null) {
            str2 = null;
        }
        Pair pairM7112to5 = TuplesKt.m7112to("app_build", str2);
        String str3 = this.f10876b.f10870b;
        if (str3 == null) {
            str3 = null;
        }
        Pair pairM7112to6 = TuplesKt.m7112to(CommonUrlParts.OS_VERSION, str3);
        String str4 = this.f10876b.f10872d;
        if (str4 == null) {
            str4 = null;
        }
        Pair pairM7112to7 = TuplesKt.m7112to("app_version", str4);
        String str5 = this.f10876b.f10873e;
        if (str5 == null) {
            str5 = null;
        }
        Pair pairM7112to8 = TuplesKt.m7112to("device_model", str5);
        Environment environment = this.f10876b.f10874f;
        Pair pairM7112to9 = TuplesKt.m7112to("app_env", environment != null ? environment.getValue() : null);
        String account = configRequestParameter.getAccount();
        if (account == null) {
            account = null;
        }
        Pair pairM7112to10 = TuplesKt.m7112to("account", account);
        String language = configRequestParameter.getLanguage();
        if (language == null) {
            language = null;
        }
        Map mapMapOf = MapsKt__MapsKt.mapOf(pairM7112to, pairM7112to2, pairM7112to3, pairM7112to4, pairM7112to5, pairM7112to6, pairM7112to7, pairM7112to8, pairM7112to9, pairM7112to10, TuplesKt.m7112to(WebvttCueParser.TAG_LANG, language), TuplesKt.m7112to("short_segments", str != null ? str : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String string = new JSONObject(linkedHashMap).toString();
        Intrinsics.checkNotNullExpressionValue(string, "mapOf(\n            APP_I…Map).toString()\n        }");
        return string;
    }

    /* renamed from: b */
    public final C11723c0 m7530b(C11759r c11759r, String str) {
        HttpsURLConnection httpsURLConnection = null;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) this.f10880f.getValue()).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
            httpsURLConnection2.setHostnameVerifier(m7527a((URL) this.f10880f.getValue()));
            httpsURLConnection2.setRequestMethod("POST");
            httpsURLConnection2.setRequestProperty("content-type", "application/json");
            httpsURLConnection2.setConnectTimeout(20000);
            httpsURLConnection2.setReadTimeout(20000);
            httpsURLConnection2.setSSLSocketFactory(this.f10879e);
            httpsURLConnection2.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection2.getOutputStream();
            try {
                byte[] bytes = m7529a(c11759r, str).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                try {
                    URL requestUrl = httpsURLConnection2.getURL();
                    int responseCode = httpsURLConnection2.getResponseCode();
                    InputStreamReader inputStreamReader = new InputStreamReader(httpsURLConnection2.getInputStream());
                    try {
                        String text = TextStreamsKt.readText(inputStreamReader);
                        CloseableKt.closeFinally(inputStreamReader, null);
                        Intrinsics.checkNotNullExpressionValue(requestUrl, "requestUrl");
                        C11723c0 c11723c0 = new C11723c0(requestUrl, responseCode, text);
                        httpsURLConnection2.disconnect();
                        return c11723c0;
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static HostnameVerifier m7527a(final URL url) {
        return new HostnameVerifier() { // from class: ru.rustore.sdk.remoteconfig.internal.Z$$ExternalSyntheticLambda0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return C11714Z.m7528a(url, str, sSLSession);
            }
        };
    }

    /* renamed from: a */
    public static final boolean m7528a(URL this_createHostnameVerifier, String str, SSLSession sSLSession) {
        Intrinsics.checkNotNullParameter(this_createHostnameVerifier, "$this_createHostnameVerifier");
        return str.equals(this_createHostnameVerifier.getHost());
    }
}
