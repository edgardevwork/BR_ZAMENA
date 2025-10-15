package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {
    public static final boolean DEBUG = MediaSessionManager.DEBUG;
    public static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    public static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    public static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    public static final String TAG = "MediaSessionManager";
    public ContentResolver mContentResolver;
    public Context mContext;

    public MediaSessionManagerImplBase(Context context) {
        this.mContext = context;
        this.mContentResolver = context.getContentResolver();
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public Context getContext() {
        return this.mContext;
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        try {
            if (this.mContext.getPackageManager().getApplicationInfo(remoteUserInfoImpl.getPackageName(), 0) == null) {
                return false;
            }
            return isPermissionGranted(remoteUserInfoImpl, PERMISSION_STATUS_BAR_SERVICE) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_MEDIA_CONTENT_CONTROL) || remoteUserInfoImpl.getUid() == 1000 || isEnabledNotificationListener(remoteUserInfoImpl);
        } catch (PackageManager.NameNotFoundException unused) {
            if (DEBUG) {
                Log.d("MediaSessionManager", "Package " + remoteUserInfoImpl.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    public final boolean isPermissionGranted(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl, String str) {
        return remoteUserInfoImpl.getPid() < 0 ? this.mContext.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0 : this.mContext.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
    }

    public boolean isEnabledNotificationListener(@NonNull MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        String string = Settings.Secure.getString(this.mContentResolver, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(remoteUserInfoImpl.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {
        public String mPackageName;
        public int mPid;
        public int mUid;

        public RemoteUserInfoImplBase(String str, int i, int i2) {
            this.mPackageName = str;
            this.mPid = i;
            this.mUid = i2;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
            return this.mPackageName;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            return this.mPid;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            return this.mUid;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            return (this.mPid < 0 || remoteUserInfoImplBase.mPid < 0) ? TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mUid == remoteUserInfoImplBase.mUid : TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mPid == remoteUserInfoImplBase.mPid && this.mUid == remoteUserInfoImplBase.mUid;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mPackageName, Integer.valueOf(this.mUid));
        }
    }
}
