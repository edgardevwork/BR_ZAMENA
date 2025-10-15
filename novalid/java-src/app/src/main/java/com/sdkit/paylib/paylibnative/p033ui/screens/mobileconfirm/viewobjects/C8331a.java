package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.viewobjects.a */
/* loaded from: classes6.dex */
public final class C8331a implements InterfaceC8112a {
    public static final Parcelable.Creator<C8331a> CREATOR = new a();

    /* renamed from: a */
    public final String f3385a;

    /* renamed from: b */
    public final SmsConfirmConstraints f3386b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.viewobjects.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8331a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8331a(parcel.readString(), (SmsConfirmConstraints) parcel.readParcelable(C8331a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8331a[] newArray(int i) {
            return new C8331a[i];
        }
    }

    public C8331a(String phoneNumber, SmsConfirmConstraints smsConfirmConstraints) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(smsConfirmConstraints, "smsConfirmConstraints");
        this.f3385a = phoneNumber;
        this.f3386b = smsConfirmConstraints;
    }

    /* renamed from: a */
    public final String m3133a() {
        return this.f3385a;
    }

    /* renamed from: b */
    public final SmsConfirmConstraints m3134b() {
        return this.f3386b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8331a)) {
            return false;
        }
        C8331a c8331a = (C8331a) obj;
        return Intrinsics.areEqual(this.f3385a, c8331a.f3385a) && Intrinsics.areEqual(this.f3386b, c8331a.f3386b);
    }

    public int hashCode() {
        return this.f3386b.hashCode() + (this.f3385a.hashCode() * 31);
    }

    public String toString() {
        return "MobileConfirmationStartParams(phoneNumber=" + this.f3385a + ", smsConfirmConstraints=" + this.f3386b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f3385a);
        out.writeParcelable(this.f3386b, i);
    }
}
