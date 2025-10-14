package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.n6 */
/* loaded from: classes6.dex */
public abstract class AbstractC9722n6 implements InterfaceC8846Da {

    /* renamed from: a */
    public final InterfaceC9697m6 f8700a;

    /* renamed from: b */
    public final ICrashTransformer f8701b;

    /* renamed from: c */
    public final C9017K9 f8702c;

    public AbstractC9722n6(InterfaceC9697m6 interfaceC9697m6, ICrashTransformer iCrashTransformer, C9017K9 c9017k9) {
        this.f8700a = interfaceC9697m6;
        this.f8701b = iCrashTransformer;
        this.f8702c = c9017k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8846Da
    /* renamed from: a */
    public final void mo5058a(@Nullable Throwable th, @NonNull C9222T c9222t) {
        if (this.f8700a.mo6200a(th)) {
            ICrashTransformer iCrashTransformer = this.f8701b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C9150Pm c9150PmM5602a = AbstractC9221Sm.m5602a(th, c9222t, null, (String) this.f8702c.f6881a.m5678a(), (Boolean) this.f8702c.f6882b.m5678a());
                C9258Ub c9258Ub = (C9258Ub) ((C9311Wg) this).f7411d;
                c9258Ub.f7379a.mo4933a().mo5079b(c9258Ub.f7326b).mo4964a(c9150PmM5602a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public final InterfaceC9697m6 m6498b() {
        return this.f8700a;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    public final ICrashTransformer m6497a() {
        return this.f8701b;
    }
}
