package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    public static final String TAG = Logger.tagWithPrefix("SystemFgService");

    @Nullable
    public static SystemForegroundService sForegroundService = null;
    public SystemForegroundDispatcher mDispatcher;
    public Handler mHandler;
    public boolean mIsShutdown;
    public NotificationManager mNotificationManager;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @MainThread
    private void initializeDispatcher() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$1 */
    /* loaded from: classes.dex */
    public class RunnableC33271 implements Runnable {
        public final /* synthetic */ Notification val$notification;
        public final /* synthetic */ int val$notificationId;
        public final /* synthetic */ int val$notificationType;

        public RunnableC33271(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            val$notificationId = val$notificationId;
            val$notification = val$notification;
            val$notificationType = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                Api31Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
            } else if (i >= 29) {
                Api29Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
            } else {
                SystemForegroundService.this.startForeground(val$notificationId, val$notification);
            }
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(final int notificationId, final int notificationType, @NonNull final Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            public final /* synthetic */ Notification val$notification;
            public final /* synthetic */ int val$notificationId;
            public final /* synthetic */ int val$notificationType;

            public RunnableC33271(final int notificationId2, final Notification notification2, final int notificationType2) {
                val$notificationId = notificationId2;
                val$notification = notification2;
                val$notificationType = notificationType2;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    Api31Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
                } else if (i >= 29) {
                    Api29Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
                } else {
                    SystemForegroundService.this.startForeground(val$notificationId, val$notification);
                }
            }
        });
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$2 */
    /* loaded from: classes.dex */
    public class RunnableC33282 implements Runnable {
        public final /* synthetic */ Notification val$notification;
        public final /* synthetic */ int val$notificationId;

        public RunnableC33282(final int val$notificationId, final Notification val$notification) {
            val$notificationId = val$notificationId;
            val$notification = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.notify(val$notificationId, val$notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(final int notificationId, @NonNull final Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            public final /* synthetic */ Notification val$notification;
            public final /* synthetic */ int val$notificationId;

            public RunnableC33282(final int notificationId2, final Notification notification2) {
                val$notificationId = notificationId2;
                val$notification = notification2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.notify(val$notificationId, val$notification);
            }
        });
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$3 */
    /* loaded from: classes.dex */
    public class RunnableC33293 implements Runnable {
        public final /* synthetic */ int val$notificationId;

        public RunnableC33293(final int val$notificationId) {
            val$notificationId = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.cancel(val$notificationId);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(final int notificationId) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            public final /* synthetic */ int val$notificationId;

            public RunnableC33293(final int notificationId2) {
                val$notificationId = notificationId2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.cancel(val$notificationId);
            }
        });
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void startForeground(Service service, int id, Notification notification, int foregroundServiceType) {
            service.startForeground(id, notification, foregroundServiceType);
        }
    }

    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static class Api31Impl {
        @DoNotInline
        public static void startForeground(Service service, int id, Notification notification, int foregroundServiceType) {
            try {
                service.startForeground(id, notification, foregroundServiceType);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e);
            }
        }
    }
}
