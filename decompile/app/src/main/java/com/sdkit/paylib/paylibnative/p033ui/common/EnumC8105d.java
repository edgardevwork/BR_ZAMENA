package com.sdkit.paylib.paylibnative.p033ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.d */
/* loaded from: classes8.dex */
public enum EnumC8105d implements Parcelable {
    SUCCESSFUL_PAYMENT,
    CLOSED_BY_USER,
    UNHANDLED_FORM_ERROR,
    PAYMENT_TIMEOUT,
    DECLINED_BY_SERVER,
    RESULT_UNKNOWN;

    public static final Parcelable.Creator<EnumC8105d> CREATOR = new Parcelable.Creator() { // from class: com.sdkit.paylib.paylibnative.ui.common.d.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC8105d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EnumC8105d.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC8105d[] newArray(int i) {
            return new EnumC8105d[i];
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
