package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.C9305Wa;

/* loaded from: classes8.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new C9305Wa();

    @Nullable
    public final String errorExplanation;

    /* renamed from: id */
    @Nullable
    public final String f9419id;

    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(@Nullable String str, @NonNull IdentifierStatus identifierStatus, @Nullable String str2) {
        this.f9419id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) obj;
        String str = this.f9419id;
        if (str == null ? identifiersResult.f9419id != null : !str.equals(identifiersResult.f9419id)) {
            return false;
        }
        if (this.status != identifiersResult.status) {
            return false;
        }
        String str2 = this.errorExplanation;
        return str2 != null ? str2.equals(identifiersResult.errorExplanation) : identifiersResult.errorExplanation == null;
    }

    public int hashCode() {
        String str = this.f9419id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IdentifiersResult{id='" + this.f9419id + "', status=" + this.status + ", errorExplanation='" + this.errorExplanation + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9419id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
