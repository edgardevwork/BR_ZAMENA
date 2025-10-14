package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.Oi */
/* loaded from: classes6.dex */
public final class C9122Oi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f7071a;

    public C9122Oi(UserProfile userProfile) {
        this.f7071a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportUserProfile(this.f7071a);
    }
}
