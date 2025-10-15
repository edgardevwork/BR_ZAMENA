package ru.rustore.sdk.billingclient.impl.data.network;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import ru.rustore.sdk.billingclient.BuildConfig;
import ru.rustore.sdk.billingclient.impl.data.repository.C11479g;
import ru.rustore.sdk.billingclient.impl.domain.factory.C11499a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.network.b */
/* loaded from: classes5.dex */
public final class C11456b {

    /* renamed from: a */
    public final C11499a f10242a;

    /* renamed from: b */
    public final C11479g f10243b;

    /* renamed from: c */
    public final String f10244c;

    /* renamed from: d */
    public final String f10245d;

    public C11456b(C11499a signatureFactory, C11479g deviceIdRepository, String packageName) {
        Intrinsics.checkNotNullParameter(signatureFactory, "signatureFactory");
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(BuildConfig.SMART_BACKEND_URL, "baseUrl");
        this.f10242a = signatureFactory;
        this.f10243b = deviceIdRepository;
        this.f10244c = packageName;
        this.f10245d = BuildConfig.SMART_BACKEND_URL;
    }

    /* renamed from: a */
    public static final String m7448a(C11456b c11456b) {
        String string = new JSONObject(MapsKt__MapsKt.mapOf(TuplesKt.m7112to("signature", c11456b.f10242a.m7464a()), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, c11456b.f10244c))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(\n            …  ),\n        ).toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "\\", "", false, 4, (Object) null);
    }

    /* renamed from: a */
    public static HostnameVerifier m7449a(final URL url) {
        return new HostnameVerifier() { // from class: ru.rustore.sdk.billingclient.impl.data.network.b$$ExternalSyntheticLambda0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return C11456b.m7450a(url, str, sSLSession);
            }
        };
    }

    /* renamed from: a */
    public static final boolean m7450a(URL this_createHostnameVerifier, String str, SSLSession sSLSession) {
        Intrinsics.checkNotNullParameter(this_createHostnameVerifier, "$this_createHostnameVerifier");
        return str.equals(this_createHostnameVerifier.getHost());
    }
}
