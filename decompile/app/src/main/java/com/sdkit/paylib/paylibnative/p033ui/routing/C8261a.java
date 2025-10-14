package com.sdkit.paylib.paylibnative.p033ui.routing;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.routing.a */
/* loaded from: classes8.dex */
public final class C8261a implements Parcelable {
    public static final Parcelable.Creator<C8261a> CREATOR = new a();

    /* renamed from: a */
    public final EnumC8262b f2717a;

    /* renamed from: b */
    public final AbstractC8128b f2718b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.a$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8261a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8261a(EnumC8262b.valueOf(parcel.readString()), (AbstractC8128b) parcel.readParcelable(C8261a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8261a[] newArray(int i) {
            return new C8261a[i];
        }
    }

    public C8261a(EnumC8262b nextScreen, AbstractC8128b actionButtonStyle) {
        Intrinsics.checkNotNullParameter(nextScreen, "nextScreen");
        Intrinsics.checkNotNullParameter(actionButtonStyle, "actionButtonStyle");
        this.f2717a = nextScreen;
        this.f2718b = actionButtonStyle;
    }

    /* renamed from: a */
    public final AbstractC8128b m2502a() {
        return this.f2718b;
    }

    /* renamed from: b */
    public final EnumC8262b m2503b() {
        return this.f2717a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8261a)) {
            return false;
        }
        C8261a c8261a = (C8261a) obj;
        return this.f2717a == c8261a.f2717a && Intrinsics.areEqual(this.f2718b, c8261a.f2718b);
    }

    public int hashCode() {
        return this.f2718b.hashCode() + (this.f2717a.hashCode() * 31);
    }

    public String toString() {
        return "ErrorAction(nextScreen=" + this.f2717a + ", actionButtonStyle=" + this.f2718b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f2717a.name());
        out.writeParcelable(this.f2718b, i);
    }
}
