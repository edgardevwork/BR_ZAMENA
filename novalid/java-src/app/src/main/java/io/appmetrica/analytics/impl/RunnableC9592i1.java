package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i1 */
/* loaded from: classes5.dex */
public final class RunnableC9592i1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8322a;

    /* renamed from: b */
    public final /* synthetic */ List f8323b;

    /* renamed from: c */
    public final /* synthetic */ C9692m1 f8324c;

    public RunnableC9592i1(C9692m1 c9692m1, String str, List list) {
        this.f8324c = c9692m1;
        this.f8322a = str;
        this.f8323b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8324c).reportEvent(this.f8322a, CollectionUtils.getMapFromList(this.f8323b));
    }
}
