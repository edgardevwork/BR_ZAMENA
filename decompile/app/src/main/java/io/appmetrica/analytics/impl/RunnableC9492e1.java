package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e1 */
/* loaded from: classes6.dex */
public final class RunnableC9492e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f7982a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7983b;

    public RunnableC9492e1(C9692m1 c9692m1, List list) {
        this.f7983b = c9692m1;
        this.f7982a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7983b).reportAnr(CollectionUtils.getMapFromList(this.f7982a));
    }
}
