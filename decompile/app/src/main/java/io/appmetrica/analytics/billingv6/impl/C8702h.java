package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.billingv6.impl.h */
/* loaded from: classes5.dex */
public final class C8702h extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8705k f6048a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f6049b;

    /* renamed from: c */
    public final /* synthetic */ List f6050c;

    public C8702h(C8705k c8705k, BillingResult billingResult, List list) {
        this.f6048a = c8705k;
        this.f6049b = billingResult;
        this.f6050c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C8705k c8705k = this.f6048a;
        BillingResult billingResult = this.f6049b;
        List list = this.f6050c;
        c8705k.getClass();
        if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
            UtilsProvider utilsProvider = c8705k.f6057c;
            Function0 function0 = c8705k.f6058d;
            List list2 = c8705k.f6059e;
            C8701g c8701g = c8705k.f6060f;
            C8712r c8712r = new C8712r(utilsProvider, function0, list2, list, c8701g);
            c8701g.f6047c.add(c8712r);
            c8705k.f6057c.getUiExecutor().execute(new C8704j(c8705k, c8712r));
        }
        C8705k c8705k2 = this.f6048a;
        c8705k2.f6060f.m4892a(c8705k2);
    }
}
