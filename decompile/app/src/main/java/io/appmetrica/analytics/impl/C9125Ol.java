package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.Ol */
/* loaded from: classes6.dex */
public final class C9125Ol extends AbstractC9292Vl {
    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: a */
    public final ProtobufStateStorage mo5468a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrM6997a;
        byte[] bArrM6997a2;
        C8832Cl c8832Cl = new C8832Cl();
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
        return new C9456cf("startup_state", iBinaryDataHelper, new C9999y8(c8832Cl, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrM6997a, bArrM6997a2)), new C9662kl());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: c */
    public final IBinaryDataHelper mo5469c(Context context) {
        C9669l3 c9669l3;
        C9398a7 c9398a7M5836a = C9398a7.m5836a(context);
        synchronized (c9398a7M5836a) {
            try {
                if (c9398a7M5836a.f7694i == null) {
                    c9398a7M5836a.f7694i = new C9669l3(c9398a7M5836a.m5846g());
                }
                c9669l3 = c9398a7M5836a.f7694i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9669l3;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9292Vl
    /* renamed from: d */
    public final IBinaryDataHelper mo5470d(Context context) {
        IBinaryDataHelper iBinaryDataHelperM5846g;
        C9398a7 c9398a7M5836a = C9398a7.m5836a(context);
        synchronized (c9398a7M5836a) {
            iBinaryDataHelperM5846g = c9398a7M5836a.m5846g();
        }
        return iBinaryDataHelperM5846g;
    }
}
