package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8338b implements Parcelable {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC8338b {
        public static final Parcelable.Creator<a> CREATOR = new C11939a();

        /* renamed from: a */
        public final int f3460a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C11939a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(int i) {
            super(null);
            this.f3460a = i;
        }

        /* renamed from: a */
        public final int m3213a() {
            return this.f3460a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f3460a == ((a) obj).f3460a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f3460a);
        }

        public String toString() {
            return "ResId(stringResId=" + this.f3460a + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.f3460a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC8338b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        public final String f3461a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f3461a = text;
        }

        /* renamed from: a */
        public final String m3216a() {
            return this.f3461a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f3461a, ((b) obj).f3461a);
        }

        public int hashCode() {
            return this.f3461a.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Text(text="), this.f3461a, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f3461a);
        }
    }

    public AbstractC8338b() {
    }

    public /* synthetic */ AbstractC8338b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
