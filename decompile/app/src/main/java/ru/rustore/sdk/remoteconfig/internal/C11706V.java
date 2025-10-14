package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;
import ru.rustore.sdk.remoteconfig.internal.AbstractC11730d0;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.V */
/* loaded from: classes5.dex */
public final class C11706V {

    /* renamed from: a */
    public final C11712Y f10862a;

    /* renamed from: b */
    public final C11714Z f10863b;

    public C11706V(C11712Y networkConfigDtoSerializer, C11714Z networkConfigHttpClient) {
        Intrinsics.checkNotNullParameter(networkConfigDtoSerializer, "networkConfigDtoSerializer");
        Intrinsics.checkNotNullParameter(networkConfigHttpClient, "networkConfigHttpClient");
        this.f10862a = networkConfigDtoSerializer;
        this.f10863b = networkConfigHttpClient;
    }

    /* renamed from: a */
    public final AbstractC11730d0 m7526a(C11708W c11708w) throws JSONException, RemoteConfigException.RemoteConfigNetworkException {
        C11723c0 c11723c0M7530b = this.f10863b.m7530b(c11708w != null ? c11708w.f10866b : null, c11708w != null ? c11708w.f10867c : null);
        int i = c11723c0M7530b.f10894b;
        if (i != 200) {
            if (i == 304 && c11708w != null) {
                return new AbstractC11730d0.a(c11708w);
            }
            throw new RemoteConfigException.RemoteConfigNetworkException(c11723c0M7530b.f10894b, "response with error from " + c11723c0M7530b.f10893a, null, 4, null);
        }
        C11712Y c11712y = this.f10862a;
        String jsonString = c11723c0M7530b.f10895c;
        c11712y.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        JSONObject jSONObject2 = jSONObject.getJSONObject("config");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        Map<String, String> mapM7523a = C11697Q.m7523a(jSONObject2);
        String strOptString = jSONObject.optString("short_segments");
        if (strOptString == null) {
            strOptString = "";
        }
        long j = jSONObject.getLong("config_v");
        String value = jSONObject.getString("cond_s");
        Intrinsics.checkNotNullExpressionValue(value, "jsonObject.getString(HASH_KEY)");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AbstractC11730d0.b(new C11708W(mapM7523a, new C11759r(j, value), strOptString));
    }
}
