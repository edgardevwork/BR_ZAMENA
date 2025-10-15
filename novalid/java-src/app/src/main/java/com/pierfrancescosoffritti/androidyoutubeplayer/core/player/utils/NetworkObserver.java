package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkObserver.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listeners", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$Listener;", "getListeners", "()Ljava/util/List;", "networkBroadcastReceiver", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkBroadcastReceiver;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "destroy", "", "doObserveNetwork", "doObserveNetworkLegacy", "observeNetwork", "Listener", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/* loaded from: classes8.dex */
public final class NetworkObserver {

    @NotNull
    public final Context context;

    @NotNull
    public final List<Listener> listeners;

    @Nullable
    public NetworkBroadcastReceiver networkBroadcastReceiver;

    @Nullable
    public ConnectivityManager.NetworkCallback networkCallback;

    /* compiled from: NetworkObserver.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$Listener;", "", "onNetworkAvailable", "", "onNetworkUnavailable", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public interface Listener {
        void onNetworkAvailable();

        void onNetworkUnavailable();
    }

    public NetworkObserver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.listeners = new ArrayList();
    }

    @NotNull
    public final List<Listener> getListeners() {
        return this.listeners;
    }

    public final void observeNetwork() {
        doObserveNetwork(this.context);
    }

    public final void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback == null) {
            return;
        }
        Object systemService = this.context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
        this.listeners.clear();
        this.networkCallback = null;
        this.networkBroadcastReceiver = null;
    }

    @RequiresApi(24)
    public final void doObserveNetwork(Context context) {
        NetworkObserver$doObserveNetwork$callback$1 networkObserver$doObserveNetwork$callback$1 = new NetworkObserver$doObserveNetwork$callback$1(this);
        this.networkCallback = networkObserver$doObserveNetwork$callback$1;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(networkObserver$doObserveNetwork$callback$1);
    }

    public final void doObserveNetworkLegacy(Context context) {
        NetworkBroadcastReceiver networkBroadcastReceiver = new NetworkBroadcastReceiver(new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkObserver.doObserveNetworkLegacy.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<T> it = NetworkObserver.this.getListeners().iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onNetworkAvailable();
                }
            }
        }, new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkObserver.doObserveNetworkLegacy.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<T> it = NetworkObserver.this.getListeners().iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onNetworkUnavailable();
                }
            }
        });
        this.networkBroadcastReceiver = networkBroadcastReceiver;
        context.registerReceiver(networkBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
