package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gg */
/* loaded from: classes8.dex */
public final class C9557gg extends AbstractC9632jg {
    public C9557gg(C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        String value = c9252u5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C9964wn c9964wn = this.f8444a.f8249v;
            synchronized (c9964wn) {
                c9964wn.m6943c(c9964wn.m6940b() + 1);
            }
            if (!m6187a(jSONObject.optString("link"))) {
                return false;
            }
            c9252u5.f7322n = Boolean.TRUE;
            m6188b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m6188b() {
        C9964wn c9964wn = this.f8444a.f8249v;
        synchronized (c9964wn) {
            c9964wn.m6937a(c9964wn.m6936a() + 1);
        }
        this.f8444a.m6229z();
        C8992J8 c8992j8 = this.f8444a.f8240m;
        if (c8992j8.f6816c == null) {
            c8992j8.m5300a();
        }
        C9040L8 c9040l8 = c8992j8.f6816c;
        c9040l8.getClass();
        c9040l8.f6928b = new HashSet();
        c9040l8.f6930d = 0;
        C9040L8 c9040l82 = c8992j8.f6816c;
        c9040l82.f6927a = true;
        C9112O8 c9112o8 = c8992j8.f6815b;
        IBinaryDataHelper iBinaryDataHelper = c9112o8.f7053c;
        C9088N8 c9088n8 = c9112o8.f7052b;
        c9112o8.f7051a.getClass();
        C9825r9 c9825r9M5402a = C9064M8.m5402a(c9040l82);
        c9088n8.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c9825r9M5402a));
    }

    /* renamed from: a */
    public final boolean m6187a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C9718n2 c9718n2 = this.f8444a.m6223t().f8477z;
                    for (String str2 : queryParameter.split("&")) {
                        int iIndexOf = str2.indexOf(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                        if (iIndexOf >= 0 && m6186a(Uri.decode(str2.substring(0, iIndexOf)), Uri.decode(str2.substring(iIndexOf + 1)), c9718n2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m6186a(String str, String str2, C9718n2 c9718n2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c9718n2 == null) {
            return false;
        }
        for (Pair pair : c9718n2.f8694a) {
            if (AbstractC9664kn.m6343a(pair.first, str) && ((obj = pair.second) == null || ((C9693m2) obj).f8620a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
