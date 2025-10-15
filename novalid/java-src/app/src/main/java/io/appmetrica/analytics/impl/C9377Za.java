package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Za */
/* loaded from: classes6.dex */
public final class C9377Za {
    /* renamed from: a */
    public static final C10000y9 m5807a(C9377Za c9377Za, EnumC8945H9 enumC8945H9, JSONObject jSONObject) {
        int i;
        c9377Za.getClass();
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
        c10000y9.f9362b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return c10000y9;
    }
}
