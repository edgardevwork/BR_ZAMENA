package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes7.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getActivityType", m1069id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", m1069id = 2)
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes4.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @NonNull
        public ActivityTransition build() {
            Preconditions.checkState(this.zza != -1, "Activity type not set.");
            Preconditions.checkState(this.zzb != -1, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        }

        @NonNull
        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i) {
            this.zza = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(m1070id = 1) int i, @SafeParcelable.Param(m1070id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.checkArgument(z, sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
