package com.sdkit.paylib.paylibnetwork.impl.domain;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.a */
/* loaded from: classes6.dex */
public final class C8460a implements NetworkDetector {

    /* renamed from: a */
    public final ConnectivityManager f4134a;

    public C8460a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Object systemService = appContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f4134a = (ConnectivityManager) systemService;
    }

    /* renamed from: a */
    public final boolean m3810a(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12);
    }

    /* renamed from: b */
    public final boolean m3811b(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1);
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector
    public boolean isConnected() {
        Network[] allNetworks = this.f4134a.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "manager.allNetworks");
        for (Network network : allNetworks) {
            NetworkCapabilities capabilities = this.f4134a.getNetworkCapabilities(network);
            if (capabilities != null) {
                Intrinsics.checkNotNullExpressionValue(capabilities, "capabilities");
                if (m3811b(capabilities) && m3810a(capabilities)) {
                    return true;
                }
            }
        }
        return false;
    }
}
