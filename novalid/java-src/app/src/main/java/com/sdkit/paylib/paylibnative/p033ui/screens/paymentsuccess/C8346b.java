package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.b */
/* loaded from: classes5.dex */
public final class C8346b implements Parcelable {
    public static final Parcelable.Creator<C8346b> CREATOR = new a();

    /* renamed from: a */
    public final boolean f3515a;

    /* renamed from: b */
    public final EnumC8105d f3516b;

    /* renamed from: c */
    public final String f3517c;

    /* renamed from: d */
    public final boolean f3518d;

    /* renamed from: e */
    public final String f3519e;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.b$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8346b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8346b(parcel.readInt() != 0, parcel.readInt() == 0 ? null : EnumC8105d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8346b[] newArray(int i) {
            return new C8346b[i];
        }
    }

    public C8346b(boolean z, EnumC8105d enumC8105d, String str, boolean z2, String str2) {
        this.f3515a = z;
        this.f3516b = enumC8105d;
        this.f3517c = str;
        this.f3518d = z2;
        this.f3519e = str2;
    }

    /* renamed from: a */
    public final String m3275a() {
        return this.f3519e;
    }

    /* renamed from: b */
    public final EnumC8105d m3276b() {
        return this.f3516b;
    }

    /* renamed from: c */
    public final String m3277c() {
        return this.f3517c;
    }

    /* renamed from: d */
    public final boolean m3278d() {
        return this.f3515a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m3279e() {
        return this.f3518d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8346b)) {
            return false;
        }
        C8346b c8346b = (C8346b) obj;
        return this.f3515a == c8346b.f3515a && this.f3516b == c8346b.f3516b && Intrinsics.areEqual(this.f3517c, c8346b.f3517c) && this.f3518d == c8346b.f3518d && Intrinsics.areEqual(this.f3519e, c8346b.f3519e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.f3515a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC8105d enumC8105d = this.f3516b;
        int iHashCode = (i + (enumC8105d == null ? 0 : enumC8105d.hashCode())) * 31;
        String str = this.f3517c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.f3518d;
        int i2 = (iHashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str2 = this.f3519e;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentSuccessFragmentParameters(isInvoiceDetailsShouldBeShown=");
        sb.append(this.f3515a);
        sb.append(", paymentReturnCode=");
        sb.append(this.f3516b);
        sb.append(", paymentVisibleAmountLabel=");
        sb.append(this.f3517c);
        sb.append(", isSubscription=");
        sb.append(this.f3518d);
        sb.append(", additionalMessage=");
        return C8032c.m1430a(sb, this.f3519e, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f3515a ? 1 : 0);
        EnumC8105d enumC8105d = this.f3516b;
        if (enumC8105d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            enumC8105d.writeToParcel(out, i);
        }
        out.writeString(this.f3517c);
        out.writeInt(this.f3518d ? 1 : 0);
        out.writeString(this.f3519e);
    }

    public /* synthetic */ C8346b(boolean z, EnumC8105d enumC8105d, String str, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : enumC8105d, (i & 4) != 0 ? null : str, z2, (i & 16) != 0 ? null : str2);
    }
}
