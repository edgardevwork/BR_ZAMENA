package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.d */
/* loaded from: classes5.dex */
public final class C8340d implements Parcelable {
    public static final Parcelable.Creator<C8340d> CREATOR = new a();

    /* renamed from: a */
    public final AbstractC8338b f3471a;

    /* renamed from: b */
    public final AbstractC8337a f3472b;

    /* renamed from: c */
    public final C8261a f3473c;

    /* renamed from: d */
    public final boolean f3474d;

    /* renamed from: e */
    public final EnumC8105d f3475e;

    /* renamed from: f */
    public final InterfaceC8112a f3476f;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.d$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8340d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8340d((AbstractC8338b) parcel.readParcelable(C8340d.class.getClassLoader()), (AbstractC8337a) parcel.readParcelable(C8340d.class.getClassLoader()), C8261a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, EnumC8105d.CREATOR.createFromParcel(parcel), (InterfaceC8112a) parcel.readParcelable(C8340d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8340d[] newArray(int i) {
            return new C8340d[i];
        }
    }

    public C8340d(AbstractC8338b abstractC8338b, AbstractC8337a errorMessage, C8261a errorAction, boolean z, EnumC8105d errorReason, InterfaceC8112a interfaceC8112a) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorAction, "errorAction");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        this.f3471a = abstractC8338b;
        this.f3472b = errorMessage;
        this.f3473c = errorAction;
        this.f3474d = z;
        this.f3475e = errorReason;
        this.f3476f = interfaceC8112a;
    }

    /* renamed from: a */
    public final C8261a m3236a() {
        return this.f3473c;
    }

    /* renamed from: b */
    public final boolean m3237b() {
        return this.f3474d;
    }

    /* renamed from: c */
    public final AbstractC8337a m3238c() {
        return this.f3472b;
    }

    /* renamed from: d */
    public final EnumC8105d m3239d() {
        return this.f3475e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final AbstractC8338b m3240e() {
        return this.f3471a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8340d)) {
            return false;
        }
        C8340d c8340d = (C8340d) obj;
        return Intrinsics.areEqual(this.f3471a, c8340d.f3471a) && Intrinsics.areEqual(this.f3472b, c8340d.f3472b) && Intrinsics.areEqual(this.f3473c, c8340d.f3473c) && this.f3474d == c8340d.f3474d && this.f3475e == c8340d.f3475e && Intrinsics.areEqual(this.f3476f, c8340d.f3476f);
    }

    /* renamed from: f */
    public final InterfaceC8112a m3241f() {
        return this.f3476f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        AbstractC8338b abstractC8338b = this.f3471a;
        int iHashCode = (this.f3473c.hashCode() + ((this.f3472b.hashCode() + ((abstractC8338b == null ? 0 : abstractC8338b.hashCode()) * 31)) * 31)) * 31;
        boolean z = this.f3474d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (this.f3475e.hashCode() + ((iHashCode + i) * 31)) * 31;
        InterfaceC8112a interfaceC8112a = this.f3476f;
        return iHashCode2 + (interfaceC8112a != null ? interfaceC8112a.hashCode() : 0);
    }

    public String toString() {
        return "PaymentErrorFragmentParameters(errorTitle=" + this.f3471a + ", errorMessage=" + this.f3472b + ", errorAction=" + this.f3473c + ", errorCancellationAvailable=" + this.f3474d + ", errorReason=" + this.f3475e + ", screenStartParameters=" + this.f3476f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f3471a, i);
        out.writeParcelable(this.f3472b, i);
        this.f3473c.writeToParcel(out, i);
        out.writeInt(this.f3474d ? 1 : 0);
        this.f3475e.writeToParcel(out, i);
        out.writeParcelable(this.f3476f, i);
    }

    public /* synthetic */ C8340d(AbstractC8338b abstractC8338b, AbstractC8337a abstractC8337a, C8261a c8261a, boolean z, EnumC8105d enumC8105d, InterfaceC8112a interfaceC8112a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : abstractC8338b, abstractC8337a, c8261a, (i & 8) != 0 ? true : z, enumC8105d, (i & 32) != 0 ? null : interfaceC8112a);
    }
}
