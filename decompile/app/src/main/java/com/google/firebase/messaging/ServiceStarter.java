package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
/* loaded from: classes5.dex */
public class ServiceStarter {
    static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;

    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    private static final String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static ServiceStarter instance;

    @Nullable
    @GuardedBy("this")
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasWakeLockPermission = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    public static synchronized ServiceStarter getInstance() {
        try {
            if (instance == null) {
                instance = new ServiceStarter();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    private ServiceStarter() {
    }

    @MainThread
    public Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    @MainThread
    public int startMessagingService(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent(ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }

    private int doStartService(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strResolveServiceClassName = resolveServiceClassName(context, intent);
        if (strResolveServiceClassName != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strResolveServiceClassName);
            }
            intent.setClassName(context.getPackageName(), strResolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentNameStartService = WakeLockHolder.startWakefulService(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    @Nullable
    private synchronized String resolveServiceClassName(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.firebaseMessagingServiceClassName;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.firebaseMessagingServiceClassName = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.firebaseMessagingServiceClassName = serviceInfo.name;
                    }
                    return this.firebaseMessagingServiceClassName;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission(DefaultConnectivityMonitorFactory.NETWORK_PERMISSION) == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }
}
