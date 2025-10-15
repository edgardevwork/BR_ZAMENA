package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.Jm */
/* loaded from: classes8.dex */
public final class C9006Jm {

    /* renamed from: a */
    public final C9298W3 f6843a;

    /* renamed from: b */
    public final C8809Bn f6844b;

    /* renamed from: c */
    public final ConjunctiveCompositeThreadSafeToggle f6845c;

    public C9006Jm(Toggle toggle) {
        C9298W3 c9298w3 = new C9298W3(C9676la.m6362h().m6386w());
        this.f6843a = c9298w3;
        C8809Bn c8809Bn = new C8809Bn();
        this.f6844b = c8809Bn;
        this.f6845c = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt__CollectionsKt.listOf((Object[]) new Toggle[]{c9298w3, c8809Bn, toggle == null ? new C9914un() : toggle}), "loc-def");
    }
}
