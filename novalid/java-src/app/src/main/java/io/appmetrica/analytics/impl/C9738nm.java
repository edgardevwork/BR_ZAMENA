package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.nm */
/* loaded from: classes7.dex */
public final class C9738nm {

    /* renamed from: a */
    public final InterfaceC9788pm f8791a;

    /* renamed from: b */
    public final InterfaceC9788pm f8792b;

    public C9738nm(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f8791a = new C9249U2(new C9836rk(context));
            this.f8792b = new C9249U2(new C9978xc(context));
        } else {
            this.f8791a = new C9326X7();
            this.f8792b = new C9326X7();
        }
    }
}
