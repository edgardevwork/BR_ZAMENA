package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    @Nullable
    @GuardedBy("sLk")
    private static Storage zab;
    private final Lock zac = new ReentrantLock();

    @GuardedBy("mLk")
    private final SharedPreferences zad;

    @VisibleForTesting
    public Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final String zae(String str, String str2) {
        return str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInAccount", strZaa2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(strZaa);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInOptions", strZaa2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(strZaa);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    @Nullable
    public final String zaa(@NonNull String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    public final void zab(@NonNull String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String strZaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa)) {
            return;
        }
        zab(zae("googleSignInAccount", strZaa));
        zab(zae("googleSignInOptions", strZaa));
    }

    public final void zad(@NonNull String str, @NonNull String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
