package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;

/* loaded from: classes7.dex */
public class DataCollectionArbiter {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";

    @Nullable
    private Boolean crashlyticsDataCollectionEnabled;
    TaskCompletionSource<Void> dataCollectionEnabledTask;
    private final TaskCompletionSource<Void> dataCollectionExplicitlyApproved;
    private final FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final SharedPreferences sharedPreferences;
    private final Object taskLock;
    boolean taskResolved;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.taskLock = obj;
        this.dataCollectionEnabledTask = new TaskCompletionSource<>();
        this.taskResolved = false;
        this.setInManifest = false;
        this.dataCollectionExplicitlyApproved = new TaskCompletionSource<>();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.firebaseApp = firebaseApp;
        this.sharedPreferences = CommonUtils.getSharedPrefs(applicationContext);
        Boolean dataCollectionValueFromSharedPreferences = getDataCollectionValueFromSharedPreferences();
        this.crashlyticsDataCollectionEnabled = dataCollectionValueFromSharedPreferences == null ? getDataCollectionValueFromManifest(applicationContext) : dataCollectionValueFromSharedPreferences;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.dataCollectionEnabledTask.trySetResult(null);
                    this.taskResolved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zIsFirebaseDataCollectionDefaultEnabled;
        try {
            Boolean bool = this.crashlyticsDataCollectionEnabled;
            if (bool != null) {
                zIsFirebaseDataCollectionDefaultEnabled = bool.booleanValue();
            } else {
                zIsFirebaseDataCollectionDefaultEnabled = isFirebaseDataCollectionDefaultEnabled();
            }
            logDataCollectionState(zIsFirebaseDataCollectionDefaultEnabled);
        } catch (Throwable th) {
            throw th;
        }
        return zIsFirebaseDataCollectionDefaultEnabled;
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        try {
            return this.firebaseApp.isDataCollectionDefaultEnabled();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@Nullable Boolean bool) {
        if (bool != null) {
            try {
                this.setInManifest = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crashlyticsDataCollectionEnabled = bool != null ? bool : getDataCollectionValueFromManifest(this.firebaseApp.getApplicationContext());
        storeDataCollectionValueInSharedPreferences(this.sharedPreferences, bool);
        synchronized (this.taskLock) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.taskResolved) {
                        this.dataCollectionEnabledTask.trySetResult(null);
                        this.taskResolved = true;
                    }
                } else if (this.taskResolved) {
                    this.dataCollectionEnabledTask = new TaskCompletionSource<>();
                    this.taskResolved = false;
                }
            } finally {
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.taskLock) {
            task = this.dataCollectionEnabledTask.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return CrashlyticsTasks.race(this.dataCollectionExplicitlyApproved.getTask(), waitForAutomaticDataCollectionEnabled());
    }

    public void grantDataCollectionPermission(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.dataCollectionExplicitlyApproved.trySetResult(null);
    }

    private void logDataCollectionState(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.crashlyticsDataCollectionEnabled == null) {
            str = "global Firebase setting";
        } else {
            str = this.setInManifest ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.getLogger().m1355d(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    @Nullable
    private Boolean getDataCollectionValueFromSharedPreferences() {
        if (!this.sharedPreferences.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return null;
        }
        this.setInManifest = false;
        return Boolean.valueOf(this.sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true));
    }

    @Nullable
    private Boolean getDataCollectionValueFromManifest(Context context) {
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        if (crashlyticsDataCollectionEnabledFromManifest == null) {
            this.setInManifest = false;
            return null;
        }
        this.setInManifest = true;
        return Boolean.valueOf(Boolean.TRUE.equals(crashlyticsDataCollectionEnabledFromManifest));
    }

    @Nullable
    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().m1358e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, bool.booleanValue());
        } else {
            editorEdit.remove(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED);
        }
        editorEdit.apply();
    }
}
