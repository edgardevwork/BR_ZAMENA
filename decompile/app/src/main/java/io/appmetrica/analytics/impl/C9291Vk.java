package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Vk */
/* loaded from: classes5.dex */
public final class C9291Vk implements NetworkResponseHandler {

    /* renamed from: a */
    public final C9462cl f7377a;

    /* renamed from: b */
    public final C9719n3 f7378b;

    public C9291Vk() {
        this(new C9462cl(), new C9719n3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9587hl handle(@NonNull ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC9664kn.m6344a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f7378b.m6495a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C9462cl c9462cl = this.f7377a;
                c9462cl.getClass();
                C9587hl c9587hl = new C9587hl();
                try {
                    c9462cl.f7876i.getClass();
                    C9427bb c9427bb = new C9427bb(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c9427bb.optJSONObject("device_id");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c9587hl.f8297h = strOptString2;
                    c9587hl.f8298i = strOptString;
                    c9462cl.m5999a(c9587hl, c9427bb);
                    c9587hl.f8290a = 2;
                } catch (Throwable unused) {
                    c9587hl = new C9587hl();
                    c9587hl.f8290a = 1;
                }
                if (2 == c9587hl.f8290a) {
                    return c9587hl;
                }
            }
        }
        return null;
    }

    public C9291Vk(C9462cl c9462cl, C9719n3 c9719n3) {
        this.f7377a = c9462cl;
        this.f7378b = c9719n3;
    }
}
