package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.PendingIntentCompat;

/* loaded from: classes.dex */
public class PendingIntentActivityWrapper {
    public final Context mContext;
    public final int mFlags;

    @NonNull
    public final Intent mIntent;
    public final boolean mIsMutable;

    @Nullable
    public final Bundle mOptions;

    @Nullable
    public final PendingIntent mPendingIntent;
    public final int mRequestCode;

    public PendingIntentActivityWrapper(@NonNull Context context, int i, @NonNull Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    public PendingIntentActivityWrapper(@NonNull Context context, int i, @NonNull Intent intent, int i2, @Nullable Bundle bundle, boolean z) {
        this.mContext = context;
        this.mRequestCode = i;
        this.mIntent = intent;
        this.mFlags = i2;
        this.mOptions = bundle;
        this.mIsMutable = z;
        this.mPendingIntent = createPendingIntent();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    public int getFlags() {
        return this.mFlags;
    }

    @NonNull
    public Bundle getOptions() {
        return this.mOptions;
    }

    public boolean isMutable() {
        return this.mIsMutable;
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    @Nullable
    public final PendingIntent createPendingIntent() {
        Bundle bundle = this.mOptions;
        if (bundle == null) {
            return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, this.mIsMutable);
        }
        return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, bundle, this.mIsMutable);
    }
}
