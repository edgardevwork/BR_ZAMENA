package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.og */
/* loaded from: classes7.dex */
public final class C9757og {

    /* renamed from: a */
    public final Context f8853a;

    /* renamed from: b */
    public final ICommonExecutor f8854b;

    /* renamed from: c */
    public final C9795q4 f8855c;

    /* renamed from: d */
    public final C9352Y9 f8856d;

    public C9757og(Context context, C9795q4 c9795q4, IHandlerExecutor iHandlerExecutor, C9352Y9 c9352y9) {
        this.f8853a = context;
        this.f8854b = iHandlerExecutor;
        this.f8855c = c9795q4;
        this.f8856d = c9352y9;
    }

    /* renamed from: a */
    public final void m6609a(C10016z0 c10016z0, Consumer consumer, Function function) {
        ICommonExecutor iCommonExecutor = this.f8854b;
        C9352Y9 c9352y9 = this.f8856d;
        String str = c10016z0.f9377d;
        c9352y9.getClass();
        iCommonExecutor.execute(new RunnableC9631jf(new File(str), new C9604id(new C9629jd(c10016z0.f9374a, c10016z0.f9375b), new C9579hd()), consumer, new C9732ng(this, c10016z0.f9379f, function)));
    }
}
