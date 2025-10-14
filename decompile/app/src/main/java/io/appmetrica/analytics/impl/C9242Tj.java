package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Tj */
/* loaded from: classes5.dex */
public final class C9242Tj {

    /* renamed from: a */
    public final String f7297a;

    /* renamed from: b */
    public final C9123Oj f7298b;

    /* renamed from: c */
    public final C9218Sj f7299c;

    /* renamed from: d */
    public final IBinaryDataHelper f7300d;

    public C9242Tj(Context context, C9396a5 c9396a5) {
        c9396a5.m5826a();
        this.f7297a = "session_extras";
        this.f7298b = new C9123Oj();
        this.f7299c = new C9218Sj();
        this.f7300d = C9398a7.m5836a(context).m5837a(c9396a5);
    }

    /* renamed from: a */
    public final Map m5621a() {
        try {
            byte[] bArr = this.f7300d.get(this.f7297a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f7298b.toModel(this.f7299c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C9123Oj c9123Oj = this.f7298b;
        this.f7299c.getClass();
        return c9123Oj.toModel(new C9171Qj());
    }
}
