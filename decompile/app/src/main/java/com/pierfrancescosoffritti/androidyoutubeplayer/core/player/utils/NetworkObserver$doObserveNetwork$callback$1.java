package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkObserver;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: NetworkObserver.kt */
@Metadata(m7104d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"com/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "mainThreadHandler", "Landroid/os/Handler;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n*L\n62#1:123,2\n69#1:125,2\n*E\n"})
/* loaded from: classes8.dex */
public final class NetworkObserver$doObserveNetwork$callback$1 extends ConnectivityManager.NetworkCallback {

    @NotNull
    public final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    public final /* synthetic */ NetworkObserver this$0;

    public NetworkObserver$doObserveNetwork$callback$1(NetworkObserver networkObserver) {
        this.this$0 = networkObserver;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        Handler handler = this.mainThreadHandler;
        final NetworkObserver networkObserver = this.this$0;
        handler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkObserver$doObserveNetwork$callback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NetworkObserver$doObserveNetwork$callback$1.onAvailable$lambda$1(networkObserver);
            }
        });
    }

    public static final void onAvailable$lambda$1(NetworkObserver this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.getListeners().iterator();
        while (it.hasNext()) {
            ((NetworkObserver.Listener) it.next()).onNetworkAvailable();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        Handler handler = this.mainThreadHandler;
        final NetworkObserver networkObserver = this.this$0;
        handler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkObserver$doObserveNetwork$callback$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NetworkObserver$doObserveNetwork$callback$1.onLost$lambda$3(networkObserver);
            }
        });
    }

    public static final void onLost$lambda$3(NetworkObserver this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.getListeners().iterator();
        while (it.hasNext()) {
            ((NetworkObserver.Listener) it.next()).onNetworkUnavailable();
        }
    }
}
