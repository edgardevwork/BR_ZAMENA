package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8337a implements Parcelable {

    /* renamed from: a */
    public final String f3452a;

    /* renamed from: b */
    public final String f3453b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC8337a {
        public static final Parcelable.Creator<a> CREATOR = new C11938a();

        /* renamed from: c */
        public final int f3454c;

        /* renamed from: d */
        public final String f3455d;

        /* renamed from: e */
        public final String f3456e;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C11938a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(int i, String str, String str2) {
            super(str, str2, null);
            this.f3454c = i;
            this.f3455d = str;
            this.f3456e = str2;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a
        /* renamed from: a */
        public String mo3205a() {
            return this.f3456e;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a
        /* renamed from: b */
        public String mo3206b() {
            return this.f3455d;
        }

        /* renamed from: c */
        public final int m3207c() {
            return this.f3454c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3454c == aVar.f3454c && Intrinsics.areEqual(this.f3455d, aVar.f3455d) && Intrinsics.areEqual(this.f3456e, aVar.f3456e);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f3454c) * 31;
            String str = this.f3455d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f3456e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ResId(stringResId=");
            sb.append(this.f3454c);
            sb.append(", traceId=");
            sb.append(this.f3455d);
            sb.append(", code=");
            return C8032c.m1430a(sb, this.f3456e, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.f3454c);
            out.writeString(this.f3455d);
            out.writeString(this.f3456e);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC8337a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c */
        public final String f3457c;

        /* renamed from: d */
        public final String f3458d;

        /* renamed from: e */
        public final String f3459e;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String text, String str, String str2) {
            super(str, str2, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f3457c = text;
            this.f3458d = str;
            this.f3459e = str2;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a
        /* renamed from: a */
        public String mo3205a() {
            return this.f3459e;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a
        /* renamed from: b */
        public String mo3206b() {
            return this.f3458d;
        }

        /* renamed from: c */
        public final String m3210c() {
            return this.f3457c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f3457c, bVar.f3457c) && Intrinsics.areEqual(this.f3458d, bVar.f3458d) && Intrinsics.areEqual(this.f3459e, bVar.f3459e);
        }

        public int hashCode() {
            int iHashCode = this.f3457c.hashCode() * 31;
            String str = this.f3458d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f3459e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Text(text=");
            sb.append(this.f3457c);
            sb.append(", traceId=");
            sb.append(this.f3458d);
            sb.append(", code=");
            return C8032c.m1430a(sb, this.f3459e, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f3457c);
            out.writeString(this.f3458d);
            out.writeString(this.f3459e);
        }
    }

    public AbstractC8337a(String str, String str2) {
        this.f3452a = str;
        this.f3453b = str2;
    }

    /* renamed from: a */
    public abstract String mo3205a();

    /* renamed from: b */
    public abstract String mo3206b();

    public /* synthetic */ AbstractC8337a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
