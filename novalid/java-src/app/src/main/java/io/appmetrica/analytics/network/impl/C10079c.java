package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.network.impl.c */
/* loaded from: classes5.dex */
public final class C10079c implements Call {

    /* renamed from: a */
    public final NetworkClient f9529a;

    /* renamed from: b */
    public final Request f9530b;

    /* renamed from: c */
    public final C10080d f9531c;

    @VisibleForTesting
    public C10079c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull C10080d c10080d) {
        this.f9529a = networkClient;
        this.f9530b = request;
        this.f9531c = c10080d;
    }

    /* renamed from: a */
    public final void m7051a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f9530b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f9529a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f9529a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f9529a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f9529a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f9530b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f9529a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:66|105|67|(2:69|(3:106|71|72))|80|103|81|(3:99|82|83)|84|101|92|93|94) */
    @Override // io.appmetrica.analytics.network.internal.Call
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response execute() {
        Map<String, List<String>> headerFields;
        Throwable th;
        int responseCode;
        boolean z;
        Throwable th2;
        byte[] bArr;
        byte[] bArrM7053a;
        int i;
        try {
            C10080d c10080d = this.f9531c;
            String url = this.f9530b.getUrl();
            c10080d.getClass();
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            HttpsURLConnection httpsURLConnection = uRLConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f9530b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrM7053a2 = new byte[0];
            byte[] bArr2 = new byte[0];
            try {
                m7051a(httpsURLConnection);
                if (Intrinsics.areEqual(this.f9530b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f9530b.getBody());
                            outputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream, null);
                        } finally {
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
                try {
                    headerFields = httpsURLConnection.getHeaderFields();
                } catch (Throwable th3) {
                    headerFields = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                headerFields = null;
                th = th4;
                responseCode = 0;
            }
            try {
                bArrM7053a2 = AbstractC10081e.m7053a(this.f9529a.getMaxResponseSize(), new C10077a(httpsURLConnection));
                th2 = null;
                bArr = bArrM7053a2;
                bArrM7053a = AbstractC10081e.m7053a(this.f9529a.getMaxResponseSize(), new C10078b(httpsURLConnection));
                i = responseCode;
                z = true;
            } catch (Throwable th5) {
                th = th5;
                z = false;
                th2 = th;
                bArr = bArrM7053a2;
                bArrM7053a = bArr2;
                i = responseCode;
                Map<String, List<String>> map = headerFields;
                httpsURLConnection.disconnect();
                return new Response(z, i, bArr, bArrM7053a, map, th2);
            }
            Map<String, List<String>> map2 = headerFields;
            httpsURLConnection.disconnect();
            return new Response(z, i, bArr, bArrM7053a, map2, th2);
        } catch (Throwable th6) {
            return new Response(th6);
        }
    }

    public C10079c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new C10080d());
    }
}
