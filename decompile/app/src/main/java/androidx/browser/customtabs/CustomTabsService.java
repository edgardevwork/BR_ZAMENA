package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    public final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap<>();
    public ICustomTabsService.Stub mBinder = new BinderC02231();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    @Nullable
    public abstract Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle);

    public boolean isEngagementSignalsApiAvailable(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean mayLaunchUrl(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    public abstract boolean newSession(@NonNull CustomTabsSessionToken customTabsSessionToken);

    public abstract int postMessage(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull String str, @Nullable Bundle bundle);

    public abstract boolean receiveFile(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, int i, @Nullable Bundle bundle);

    public abstract boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri);

    public boolean setEngagementSignalsCallback(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean updateVisuals(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Bundle bundle);

    public abstract boolean validateRelationship(@NonNull CustomTabsSessionToken customTabsSessionToken, int i, @NonNull Uri uri, @Nullable Bundle bundle);

    public abstract boolean warmup(long j);

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1 */
    public class BinderC02231 extends ICustomTabsService.Stub {
        public BinderC02231() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return CustomTabsService.this.warmup(j);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(@NonNull ICustomTabsCallback iCustomTabsCallback) {
            return newSessionInternal(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return newSessionInternal(iCustomTabsCallback, getSessionIdFromBundle(bundle));
        }

        public final boolean newSessionInternal(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda0
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f$0.lambda$newSessionInternal$0(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public final /* synthetic */ void lambda$newSessionInternal$0(CustomTabsSessionToken customTabsSessionToken) {
            CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(iCustomTabsCallback, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(@NonNull ICustomTabsCallback iCustomTabsCallback, int i, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), i, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, int i, @Nullable Bundle bundle) {
            return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, i, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, @NonNull Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull IBinder iBinder, @NonNull Bundle bundle) {
            return CustomTabsService.this.setEngagementSignalsCallback(new CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), EngagementSignalsCallbackRemote.fromBinder(iBinder), bundle);
        }

        @Nullable
        public final PendingIntent getSessionIdFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Nullable
        public final Uri getTargetOriginFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return (Uri) Api33Impl.getParcelable(bundle, CustomTabsSession.TARGET_ORIGIN_KEY, Uri.class);
            }
            return (Uri) bundle.getParcelable(CustomTabsSession.TARGET_ORIGIN_KEY);
        }
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    public boolean cleanUpSession(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                    if (callbackBinder == null) {
                        return false;
                    }
                    callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                    this.mDeathRecipientMap.remove(callbackBinder);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }
}
