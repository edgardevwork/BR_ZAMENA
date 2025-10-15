package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xn */
/* loaded from: classes8.dex */
public final class C9989xn {

    /* renamed from: a */
    public final InterfaceC8784An f9331a;

    /* renamed from: b */
    public final InterfaceC8784An f9332b;

    /* renamed from: c */
    public final InterfaceC10014yn f9333c;

    /* renamed from: d */
    public JSONObject f9334d;

    public C9989xn(InterfaceC8784An interfaceC8784An, InterfaceC8784An interfaceC8784An2, InterfaceC10014yn interfaceC10014yn) {
        this.f9331a = interfaceC8784An;
        this.f9332b = interfaceC8784An2;
        this.f9333c = interfaceC10014yn;
    }

    /* renamed from: a */
    public final synchronized JSONObject m6979a() {
        JSONObject jSONObject;
        try {
            if (this.f9334d == null) {
                JSONObject jSONObjectMo6914a = this.f9333c.mo6914a(m6978a(this.f9331a), m6978a(this.f9332b));
                this.f9334d = jSONObjectMo6914a;
                m6980a(jSONObjectMo6914a);
            }
            jSONObject = this.f9334d;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m6978a(InterfaceC8784An interfaceC8784An) {
        try {
            String strMo4978a = interfaceC8784An.mo4978a();
            return strMo4978a != null ? new JSONObject(strMo4978a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void m6980a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f9331a.mo4979a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f9332b.mo4979a(string);
        } catch (Throwable unused2) {
        }
    }
}
