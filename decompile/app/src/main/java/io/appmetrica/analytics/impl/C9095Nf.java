package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.Nf */
/* loaded from: classes5.dex */
public final class C9095Nf {
    public C9095Nf(InterfaceC9066Ma interfaceC9066Ma) {
    }

    /* renamed from: a */
    public static InterfaceC9066Ma m5443a(Context context, IHandlerExecutor iHandlerExecutor) {
        C8776Af c8776Af;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c8776Af = new C8776Af(InstallReferrerClient.newBuilder(context).build(), iHandlerExecutor);
            } catch (Throwable unused) {
            }
        } else {
            c8776Af = null;
        }
        return c8776Af == null ? new C9071Mf() : c8776Af;
    }
}
