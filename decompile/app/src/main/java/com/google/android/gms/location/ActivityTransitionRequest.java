package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes7.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();

    @NonNull
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzn();

    @SafeParcelable.Field(getter = "getActivityTransitions", m1069id = 1)
    private final List<ActivityTransition> zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTag", m1069id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getClients", m1069id = 3)
    private final List<ClientIdentity> zzc;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getContextAttributionTag", m1069id = 4)
    private String zzd;

    public ActivityTransitionRequest(@NonNull List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.equal(this.zza, activityTransitionRequest.zza) && Objects.equal(this.zzb, activityTransitionRequest.zzb) && Objects.equal(this.zzd, activityTransitionRequest.zzd) && Objects.equal(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.zzc;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.zzd;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        String str = this.zzb;
        String strValueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(strValueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final ActivityTransitionRequest zza(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@NonNull @SafeParcelable.Param(m1070id = 1) List<ActivityTransition> list, @Nullable @SafeParcelable.Param(m1070id = 2) String str, @Nullable @SafeParcelable.Param(m1070id = 3) List<ClientIdentity> list2, @Nullable @SafeParcelable.Param(m1070id = 4) String str2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        for (ActivityTransition activityTransition : list) {
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzd = str2;
    }
}
