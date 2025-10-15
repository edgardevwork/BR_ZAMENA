package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.T9 */
/* loaded from: classes5.dex */
public final class C9232T9 implements Parcelable {

    @NotNull
    public static final C9208S9 CREATOR = new C9208S9();

    /* renamed from: a */
    public final Boolean f7285a;

    /* renamed from: b */
    public final IdentifierStatus f7286b;

    /* renamed from: c */
    public final String f7287c;

    public C9232T9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f7285a = bool;
        this.f7286b = identifierStatus;
        this.f7287c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9232T9)) {
            return false;
        }
        C9232T9 c9232t9 = (C9232T9) obj;
        return Intrinsics.areEqual(this.f7285a, c9232t9.f7285a) && this.f7286b == c9232t9.f7286b && Intrinsics.areEqual(this.f7287c, c9232t9.f7287c);
    }

    public final int hashCode() {
        Boolean bool = this.f7285a;
        int iHashCode = (this.f7286b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f7287c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f7285a + ", status=" + this.f7286b + ", errorExplanation=" + this.f7287c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f7285a);
        parcel.writeString(this.f7286b.getValue());
        parcel.writeString(this.f7287c);
    }

    public C9232T9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
