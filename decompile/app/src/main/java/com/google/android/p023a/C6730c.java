package com.google.android.p023a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Codecs.java */
/* renamed from: com.google.android.a.c */
/* loaded from: classes4.dex */
public final class C6730c {
    static {
        C6730c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m1041a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m1042b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m1043c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }
}
