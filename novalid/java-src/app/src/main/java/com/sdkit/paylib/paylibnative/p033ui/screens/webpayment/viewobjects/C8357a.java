package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.viewobjects.a */
/* loaded from: classes6.dex */
public final class C8357a implements InterfaceC8112a {
    public static final Parcelable.Creator<C8357a> CREATOR = new a();

    /* renamed from: a */
    public final boolean f3649a;

    /* renamed from: b */
    public final boolean f3650b;

    /* renamed from: c */
    public final String f3651c;

    /* renamed from: d */
    public final boolean f3652d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.viewobjects.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8357a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8357a(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8357a[] newArray(int i) {
            return new C8357a[i];
        }
    }

    public C8357a(boolean z, boolean z2, String str, boolean z3) {
        this.f3649a = z;
        this.f3650b = z2;
        this.f3651c = str;
        this.f3652d = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C8357a m3418a(C8357a c8357a, boolean z, boolean z2, String str, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c8357a.f3649a;
        }
        if ((i & 2) != 0) {
            z2 = c8357a.f3650b;
        }
        if ((i & 4) != 0) {
            str = c8357a.f3651c;
        }
        if ((i & 8) != 0) {
            z3 = c8357a.f3652d;
        }
        return c8357a.m3419a(z, z2, str, z3);
    }

    /* renamed from: b */
    public final boolean m3421b() {
        return this.f3650b;
    }

    /* renamed from: c */
    public final boolean m3422c() {
        return this.f3649a;
    }

    /* renamed from: d */
    public final boolean m3423d() {
        return this.f3652d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8357a)) {
            return false;
        }
        C8357a c8357a = (C8357a) obj;
        return this.f3649a == c8357a.f3649a && this.f3650b == c8357a.f3650b && Intrinsics.areEqual(this.f3651c, c8357a.f3651c) && this.f3652d == c8357a.f3652d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f3649a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f3650b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        String str = this.f3651c;
        int iHashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.f3652d;
        return iHashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebScreenStartParams(isCardShouldBeSaved=");
        sb.append(this.f3649a);
        sb.append(", isBackEnabled=");
        sb.append(this.f3650b);
        sb.append(", paymentUrl=");
        sb.append(this.f3651c);
        sb.append(", isShouldRetry=");
        return C8030a.m1428a(sb, this.f3652d, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f3649a ? 1 : 0);
        out.writeInt(this.f3650b ? 1 : 0);
        out.writeString(this.f3651c);
        out.writeInt(this.f3652d ? 1 : 0);
    }

    /* renamed from: a */
    public final C8357a m3419a(boolean z, boolean z2, String str, boolean z3) {
        return new C8357a(z, z2, str, z3);
    }

    /* renamed from: a */
    public final String m3420a() {
        return this.f3651c;
    }
}
