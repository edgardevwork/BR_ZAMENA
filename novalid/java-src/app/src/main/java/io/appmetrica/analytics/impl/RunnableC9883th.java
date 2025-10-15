package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.th */
/* loaded from: classes7.dex */
public final class RunnableC9883th implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f9122a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f9123b;

    public RunnableC9883th(C8778Ah c8778Ah, List list) {
        this.f9123b = c8778Ah;
        this.f9122a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9123b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportAnr(CollectionUtils.getMapFromList(this.f9122a));
    }
}
