package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C8774Ad;
import io.appmetrica.analytics.impl.C8874Ed;
import io.appmetrica.analytics.impl.C9402ab;
import io.appmetrica.analytics.impl.C9703mc;
import io.appmetrica.analytics.impl.EnumC8945H9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        return obj == null ? new C8774Ad(EnumC8945H9.ADJUST) : new C8874Ed(EnumC8945H9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        return map == null ? new C8774Ad(EnumC8945H9.AIRBRIDGE) : new C9703mc(EnumC8945H9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        return map == null ? new C8774Ad(EnumC8945H9.APPSFLYER) : new C9703mc(EnumC8945H9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        return jSONObject == null ? new C8774Ad(EnumC8945H9.KOCHAVA) : new C9402ab(EnumC8945H9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        return map == null ? new C8774Ad(EnumC8945H9.SINGULAR) : new C9703mc(EnumC8945H9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        return map == null ? new C8774Ad(EnumC8945H9.TENJIN) : new C9703mc(EnumC8945H9.TENJIN, map);
    }
}
