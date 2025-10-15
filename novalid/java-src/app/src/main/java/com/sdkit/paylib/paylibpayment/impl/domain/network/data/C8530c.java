package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.c */
/* loaded from: classes8.dex */
public final class C8530c {

    /* renamed from: a */
    public final NetworkDetector f4880a;

    /* renamed from: b */
    public final PingInternetDetector f4881b;

    public C8530c(NetworkDetector networkDetector, PingInternetDetector internetDetector) {
        Intrinsics.checkNotNullParameter(networkDetector, "networkDetector");
        Intrinsics.checkNotNullParameter(internetDetector, "internetDetector");
        this.f4880a = networkDetector;
        this.f4881b = internetDetector;
    }

    /* renamed from: a */
    public final Object m4001a(Continuation continuation) {
        return m4002a() ? this.f4881b.isConnected(continuation) : Boxing.boxBoolean(false);
    }

    /* renamed from: a */
    public final boolean m4002a() {
        return this.f4880a.isConnected();
    }
}
