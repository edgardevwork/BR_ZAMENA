package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.u3 */
/* loaded from: classes5.dex */
public final class C9894u3 implements InterfaceC9864sn {

    /* renamed from: a */
    public final C8869E8 f9161a;

    public C9894u3() {
        this(new C8869E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        byte[] bArrDecode = new byte[0];
        String str = c9016k8.f6862b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C8869E8 c8869e8 = this.f9161a;
        return ((InterfaceC8844D8) c8869e8.f6538a.m6635a(c9016k8.f6875o)).mo5057a(bArrDecode);
    }

    public C9894u3(C8869E8 c8869e8) {
        this.f9161a = c8869e8;
    }
}
