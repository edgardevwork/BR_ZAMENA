package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.hh */
/* loaded from: classes5.dex */
public final class RunnableC9583hh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f8281a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8282b;

    public RunnableC9583hh(C8778Ah c8778Ah, UserProfile userProfile) {
        this.f8282b = c8778Ah;
        this.f8281a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8282b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportUserProfile(this.f8281a);
    }
}
