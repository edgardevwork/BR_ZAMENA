package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ad */
/* loaded from: classes6.dex */
public abstract class AbstractC9404ad {

    /* renamed from: a */
    public static C9900u9 f7721a;

    /* renamed from: a */
    public static final synchronized C9900u9 m5854a(Context context) {
        C9900u9 c9900u9;
        c9900u9 = f7721a;
        if (c9900u9 == null) {
            c9900u9 = new C9900u9(context, "uuid.dat");
            f7721a = c9900u9;
        }
        return c9900u9;
    }
}
