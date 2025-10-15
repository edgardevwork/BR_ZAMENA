package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.d */
/* loaded from: classes7.dex */
public final class C10098d implements JsonParser {

    /* renamed from: a */
    public final String f9657a = "permissions";

    /* renamed from: b */
    public final String f9658b = "name";

    /* renamed from: c */
    public final String f9659c = IFramePlayerOptions.Builder.LIST;

    /* renamed from: d */
    public final String f9660d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10095a parse(@NotNull JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f9657a);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f9659c)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean(this.f9660d)) {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f9658b);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
        }
        return new C10095a(hashSet);
    }

    @Nullable
    /* renamed from: b */
    public final C10095a m7067b(@NotNull JSONObject jSONObject) {
        return (C10095a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (C10095a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
