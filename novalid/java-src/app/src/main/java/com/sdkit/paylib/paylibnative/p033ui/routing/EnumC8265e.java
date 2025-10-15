package com.sdkit.paylib.paylibnative.p033ui.routing;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.routing.e */
/* loaded from: classes8.dex */
public enum EnumC8265e implements Parcelable {
    INVOICE_DETAILS,
    CARDS;

    public static final Parcelable.Creator<EnumC8265e> CREATOR = new Parcelable.Creator() { // from class: com.sdkit.paylib.paylibnative.ui.routing.e.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC8265e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EnumC8265e.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC8265e[] newArray(int i) {
            return new EnumC8265e[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
