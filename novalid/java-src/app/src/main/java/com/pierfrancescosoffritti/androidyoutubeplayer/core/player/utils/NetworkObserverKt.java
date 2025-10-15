package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkObserver.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0003¨\u0006\u0005"}, m7105d2 = {"isConnectedToInternet", "", "context", "Landroid/content/Context;", "Landroid/net/NetworkCapabilities;", "core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class NetworkObserverKt {
    public static final boolean isConnectedToInternet(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return isConnectedToInternet(networkCapabilities);
    }

    @RequiresApi(21)
    public static final boolean isConnectedToInternet(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }
}
