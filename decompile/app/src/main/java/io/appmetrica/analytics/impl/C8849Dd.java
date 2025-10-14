package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Dd */
/* loaded from: classes6.dex */
public final class C8849Dd {
    /* renamed from: a */
    public static final C10000y9 m5062a(C8849Dd c8849Dd, EnumC8945H9 enumC8945H9, Object obj) throws SecurityException {
        int i;
        c8849Dd.getClass();
        C10000y9 c10000y9 = new C10000y9();
        switch (enumC8945H9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c10000y9.f9361a = i;
        C8874Ed.f6543b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        c10000y9.f9362b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return c10000y9;
    }
}
