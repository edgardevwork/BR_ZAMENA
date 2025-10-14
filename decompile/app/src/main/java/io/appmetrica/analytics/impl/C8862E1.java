package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.E1 */
/* loaded from: classes7.dex */
public final class C8862E1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C8912G1 f6511a;

    public C8862E1(C8912G1 c8912g1) {
        this.f6511a = c8912g1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f6511a.m5208a((File) obj);
    }
}
