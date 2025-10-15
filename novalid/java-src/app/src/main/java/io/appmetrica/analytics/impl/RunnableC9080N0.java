package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.N0 */
/* loaded from: classes8.dex */
public final class RunnableC9080N0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f7004a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7005b;

    public RunnableC9080N0(C9692m1 c9692m1, UserProfile userProfile) {
        this.f7005b = c9692m1;
        this.f7004a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7005b).reportUserProfile(this.f7004a);
    }
}
