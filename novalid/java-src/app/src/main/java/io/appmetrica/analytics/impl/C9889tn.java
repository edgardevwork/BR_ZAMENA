package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.tn */
/* loaded from: classes5.dex */
public final class C9889tn implements InterfaceC9864sn {

    /* renamed from: a */
    public final C8769A8 f9139a;

    public C9889tn() {
        this(new C8769A8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        if (!((C9571h5) c8902Fg.f6608m).m6204B() && !TextUtils.isEmpty(c9016k8.f6862b)) {
            try {
                JSONObject jSONObject = new JSONObject(c9016k8.f6862b);
                jSONObject.remove("preloadInfo");
                c9016k8.f6862b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f9139a.mo4930a(c9016k8, c8902Fg);
    }

    public C9889tn(C8769A8 c8769a8) {
        this.f9139a = c8769a8;
    }
}
