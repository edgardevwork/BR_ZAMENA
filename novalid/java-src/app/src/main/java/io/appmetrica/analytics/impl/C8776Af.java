package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.Af */
/* loaded from: classes7.dex */
public final class C8776Af implements InterfaceC9066Ma {

    /* renamed from: a */
    public final InstallReferrerClient f6325a;

    /* renamed from: b */
    public final ICommonExecutor f6326b;

    public C8776Af(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) throws Throwable {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9066Ma
    /* renamed from: a */
    public final void mo4955a(@NonNull InterfaceC9023Kf interfaceC9023Kf) throws Throwable {
        this.f6325a.startConnection(new C10006yf(this, interfaceC9023Kf));
    }

    public C8776Af(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f6325a = installReferrerClient;
        this.f6326b = iCommonExecutor;
    }
}
