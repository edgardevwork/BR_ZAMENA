package ru.rustore.sdk.metrics.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.C11605X;

/* renamed from: ru.rustore.sdk.metrics.internal.s */
/* loaded from: classes8.dex */
public final class C11637s {

    /* renamed from: a */
    public final C11610b f10707a;

    /* renamed from: b */
    public final C11599Q f10708b;

    /* renamed from: c */
    public final InterfaceC11620g f10709c;

    /* renamed from: d */
    public final Lazy f10710d;

    public C11637s(C11610b endpointProvider, C11599Q remoteMetricsEventDtoSerializer, C11605X.b logger) {
        Intrinsics.checkNotNullParameter(endpointProvider, "endpointProvider");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDtoSerializer, "remoteMetricsEventDtoSerializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f10707a = endpointProvider;
        this.f10708b = remoteMetricsEventDtoSerializer;
        this.f10709c = logger;
        this.f10710d = LazyKt__LazyJVMKt.lazy(new C11629p(this));
    }

    /* renamed from: a */
    public final String m7501a(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11598P remoteMetricsEventDto = (C11598P) it.next();
            this.f10708b.getClass();
            Intrinsics.checkNotNullParameter(remoteMetricsEventDto, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", remoteMetricsEventDto.f10643e.getEventName());
            jSONObject2.put("user_id", remoteMetricsEventDto.f10641c);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", remoteMetricsEventDto.f10639a);
            String str = remoteMetricsEventDto.f10642d;
            if (str == null) {
                str = null;
            }
            jSONObject3.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            jSONObject3.put("userIdSdk", remoteMetricsEventDto.f10641c);
            jSONObject3.put("time", String.valueOf(remoteMetricsEventDto.f10643e.getEventTime()));
            for (Map.Entry<String, String> entry : remoteMetricsEventDto.f10643e.getEventData().entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            jSONArray.put(new JSONObject(string));
        }
        jSONObject.put("events", jSONArray);
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        return string2;
    }

    /* renamed from: b */
    public final void m7503b(ArrayList values) {
        String strM7501a;
        HttpsURLConnection httpsURLConnectionM7502a;
        Intrinsics.checkNotNullParameter(values, "values");
        HttpsURLConnection httpsURLConnection = null;
        try {
            strM7501a = m7501a(values);
            httpsURLConnectionM7502a = m7502a();
            OutputStream outputStream = httpsURLConnectionM7502a.getOutputStream();
            try {
                byte[] bytes = strM7501a.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f10709c.mo7493a(new C11635q(httpsURLConnectionM7502a.getURL(), httpsURLConnectionM7502a.getResponseCode(), strM7501a, httpsURLConnectionM7502a.getRequestProperty("X-Metrics-Request-Time")));
            httpsURLConnectionM7502a.disconnect();
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection = httpsURLConnectionM7502a;
            try {
                this.f10709c.mo7493a(new C11636r(th));
                throw new MetricsException.NetworkError("Http request was failed", th);
            } catch (Throwable th3) {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public static HostnameVerifier m7499a(final URL url) {
        return new HostnameVerifier() { // from class: ru.rustore.sdk.metrics.internal.s$$ExternalSyntheticLambda0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return C11637s.m7500a(url, str, sSLSession);
            }
        };
    }

    /* renamed from: a */
    public static final boolean m7500a(URL this_createHostnameVerifier, String str, SSLSession sSLSession) {
        Intrinsics.checkNotNullParameter(this_createHostnameVerifier, "$this_createHostnameVerifier");
        return str.equals(this_createHostnameVerifier.getHost());
    }

    /* renamed from: a */
    public final HttpsURLConnection m7502a() throws ProtocolException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) this.f10710d.getValue()).openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        URL backendUrl = (URL) this.f10710d.getValue();
        Intrinsics.checkNotNullExpressionValue(backendUrl, "backendUrl");
        httpsURLConnection.setHostnameVerifier(m7499a(backendUrl));
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
