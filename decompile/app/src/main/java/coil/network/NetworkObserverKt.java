package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.network.NetworkObserver;
import coil.util.Contexts;
import coil.util.Logger;
import coil.util.Logs;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkObserver.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"TAG", "", "NetworkObserver", "Lcoil/network/NetworkObserver;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/network/NetworkObserver$Listener;", "logger", "Lcoil/util/Logger;", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
/* loaded from: classes2.dex */
public final class NetworkObserverKt {

    @NotNull
    public static final String TAG = "NetworkObserver";

    @NotNull
    public static final NetworkObserver NetworkObserver(@NotNull Context context, @NotNull NetworkObserver.Listener listener, @Nullable Logger logger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && Contexts.isPermissionGranted(context, DefaultConnectivityMonitorFactory.NETWORK_PERMISSION)) {
            try {
                return new RealNetworkObserver(connectivityManager, listener);
            } catch (Exception e) {
                if (logger != null) {
                    Logs.log(logger, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                }
                return new EmptyNetworkObserver();
            }
        }
        if (logger != null && logger.getLevel() <= 5) {
            logger.log("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new EmptyNetworkObserver();
    }
}
