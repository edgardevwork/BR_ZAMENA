package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ah */
/* loaded from: classes6.dex */
public final class RunnableC9408ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7723a;

    /* renamed from: b */
    public final /* synthetic */ List f7724b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f7725c;

    public RunnableC9408ah(C8778Ah c8778Ah, String str, List list) {
        this.f7725c = c8778Ah;
        this.f7723a = str;
        this.f7724b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f7725c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportEvent(this.f7723a, CollectionUtils.getMapFromList(this.f7724b));
    }
}
