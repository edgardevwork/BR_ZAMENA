package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.J8 */
/* loaded from: classes8.dex */
public final class C8992J8 {

    /* renamed from: a */
    public final int f6814a;

    /* renamed from: b */
    public final C9112O8 f6815b;

    /* renamed from: c */
    public C9040L8 f6816c;

    public C8992J8(C9112O8 c9112o8, int i) {
        this.f6814a = i;
        this.f6815b = c9112o8;
    }

    /* renamed from: a */
    public final void m5300a() {
        C9040L8 c9040l8;
        C9112O8 c9112o8 = this.f6815b;
        c9112o8.getClass();
        try {
            byte[] bArr = c9112o8.f7053c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                C9064M8 c9064m8 = c9112o8.f7051a;
                c9112o8.f7052b.getClass();
                C9825r9 c9825r9 = new C9825r9();
                c9064m8.getClass();
                c9040l8 = new C9040L8(c9825r9.f8989a, c9825r9.f8990b, c9825r9.f8991c, CollectionUtils.hashSetFromIntArray(c9825r9.f8992d));
            } else {
                C9064M8 c9064m82 = c9112o8.f7051a;
                C9825r9 state = c9112o8.f7052b.toState(bArr);
                c9064m82.getClass();
                c9040l8 = new C9040L8(state.f8989a, state.f8990b, state.f8991c, CollectionUtils.hashSetFromIntArray(state.f8992d));
            }
        } catch (Throwable unused) {
            C9064M8 c9064m83 = c9112o8.f7051a;
            c9112o8.f7052b.getClass();
            C9825r9 c9825r92 = new C9825r9();
            c9064m83.getClass();
            c9040l8 = new C9040L8(c9825r92.f8989a, c9825r92.f8990b, c9825r92.f8991c, CollectionUtils.hashSetFromIntArray(c9825r92.f8992d));
        }
        this.f6816c = c9040l8;
        int i = c9040l8.f6929c;
        int i2 = this.f6814a;
        if (i != i2) {
            c9040l8.f6929c = i2;
            c9040l8.f6930d = 0;
            C9112O8 c9112o82 = this.f6815b;
            IBinaryDataHelper iBinaryDataHelper = c9112o82.f7053c;
            C9088N8 c9088n8 = c9112o82.f7052b;
            c9112o82.f7051a.getClass();
            C9825r9 c9825r9M5402a = C9064M8.m5402a(c9040l8);
            c9088n8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c9825r9M5402a));
        }
    }
}
