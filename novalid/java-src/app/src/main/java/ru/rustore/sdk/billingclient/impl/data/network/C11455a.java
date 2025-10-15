package ru.rustore.sdk.billingclient.impl.data.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.TextStreamsKt;
import kotlin.text.Charsets;
import ru.rustore.sdk.billingclient.impl.data.model.C11453a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.network.a */
/* loaded from: classes8.dex */
public final class C11455a extends Lambda implements Function0<C11453a> {

    /* renamed from: a */
    public final /* synthetic */ C11456b f10241a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11455a(C11456b c11456b) {
        super(0);
        this.f10241a = c11456b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C11453a invoke() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            URL url = new URL(this.f10241a.f10245d + "public/v2/smartpay/no_rustore_user/product/token");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpsURLConnection = (HttpsURLConnection) uRLConnection;
            C11456b c11456b = this.f10241a;
            c11456b.getClass();
            httpsURLConnection.setHostnameVerifier(C11456b.m7449a(url));
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Device-Id", c11456b.f10243b.f10292a.m7444a());
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setConnectTimeout(20000);
            httpsURLConnection.setReadTimeout(20000);
            httpsURLConnection.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                byte[] bytes = C11456b.m7448a(c11456b).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            th = th;
            if (httpsURLConnection2 != null) {
            }
            throw th;
        }
        try {
            URL requestUrl = httpsURLConnection.getURL();
            int responseCode = httpsURLConnection.getResponseCode();
            InputStreamReader inputStreamReader = new InputStreamReader(httpsURLConnection.getInputStream());
            try {
                String text = TextStreamsKt.readText(inputStreamReader);
                CloseableKt.closeFinally(inputStreamReader, null);
                Intrinsics.checkNotNullExpressionValue(requestUrl, "requestUrl");
                C11453a c11453a = new C11453a(requestUrl, responseCode, text);
                httpsURLConnection.disconnect();
                return c11453a;
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            throw th;
        }
    }
}
