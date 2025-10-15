package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.Rl */
/* loaded from: classes6.dex */
public final class C9196Rl extends AbstractC9292Vl {
    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: a */
    public final ProtobufStateStorage mo5468a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrM6997a;
        byte[] bArrM6997a2;
        C9943w2 c9943w2 = new C9943w2();
        try {
            bArrM6997a = AbstractC10009yi.m6997a(context.getPackageName());
        } catch (Throwable unused) {
            bArrM6997a = new byte[16];
        }
        try {
            bArrM6997a2 = AbstractC10009yi.m6997a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrM6997a2 = new byte[16];
        }
        return new C9456cf("auto_inapp_collecting_info_data", iBinaryDataHelper, new C9999y8(c9943w2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrM6997a, bArrM6997a2)), new C9868t2(new C9444c3()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: c */
    public final IBinaryDataHelper mo5469c(Context context) {
        C9669l3 c9669l3;
        C9398a7 c9398a7M5836a = C9398a7.m5836a(context);
        synchronized (c9398a7M5836a) {
            try {
                if (c9398a7M5836a.f7696k == null) {
                    c9398a7M5836a.f7696k = new C9669l3(c9398a7M5836a.m5844e());
                }
                c9669l3 = c9398a7M5836a.f7696k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9669l3;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: d */
    public final IBinaryDataHelper mo5470d(Context context) {
        IBinaryDataHelper iBinaryDataHelperM5844e;
        C9398a7 c9398a7M5836a = C9398a7.m5836a(context);
        synchronized (c9398a7M5836a) {
            iBinaryDataHelperM5844e = c9398a7M5836a.m5844e();
        }
        return iBinaryDataHelperM5844e;
    }
}
