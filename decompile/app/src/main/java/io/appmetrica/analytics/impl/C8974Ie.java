package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ie */
/* loaded from: classes6.dex */
public final class C8974Ie implements InterfaceC9182R7 {

    /* renamed from: a */
    @Nullable
    public final String f6780a;

    /* renamed from: b */
    @NonNull
    public final JSONObject f6781b;

    /* renamed from: c */
    public final boolean f6782c;

    /* renamed from: d */
    public final boolean f6783d;

    /* renamed from: e */
    @NonNull
    public final EnumC9159Q7 f6784e;

    public C8974Ie(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, @NonNull EnumC9159Q7 enumC9159Q7) {
        this.f6780a = str;
        this.f6781b = jSONObject;
        this.f6782c = z;
        this.f6783d = z2;
        this.f6784e = enumC9159Q7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9182R7
    @NonNull
    /* renamed from: a */
    public final EnumC9159Q7 mo5271a() {
        return this.f6784e;
    }

    @Nullable
    /* renamed from: b */
    public final JSONObject m5272b() {
        if (!this.f6782c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f6780a);
            if (this.f6781b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f6781b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    @NonNull
    /* renamed from: c */
    public final JSONObject m5273c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f6780a);
            jSONObject.put("additionalParams", this.f6781b);
            jSONObject.put("wasSet", this.f6782c);
            jSONObject.put("autoTracking", this.f6783d);
            jSONObject.put("source", this.f6784e.f7150a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f6780a + "', additionalParameters=" + this.f6781b + ", wasSet=" + this.f6782c + ", autoTrackingEnabled=" + this.f6783d + ", source=" + this.f6784e + '}';
    }

    @NonNull
    /* renamed from: a */
    public static C8974Ie m5270a(@Nullable JSONObject jSONObject) {
        EnumC9159Q7 enumC9159Q7;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC9159Q7[] enumC9159Q7ArrValues = EnumC9159Q7.values();
        int length = enumC9159Q7ArrValues.length;
        while (true) {
            if (i >= length) {
                enumC9159Q7 = null;
                break;
            }
            enumC9159Q7 = enumC9159Q7ArrValues[i];
            if (Intrinsics.areEqual(enumC9159Q7.f7150a, strOptStringOrNull2)) {
                break;
            }
            i++;
        }
        return new C8974Ie(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, enumC9159Q7 == null ? EnumC9159Q7.f7145b : enumC9159Q7);
    }
}
