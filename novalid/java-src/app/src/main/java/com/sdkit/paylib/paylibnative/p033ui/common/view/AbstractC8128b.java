package com.sdkit.paylib.paylibnative.p033ui.common.view;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8128b implements Parcelable {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8128b {

        /* renamed from: a */
        public static final a f1932a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C11908a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C11908a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return a.f1932a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8128b {

        /* renamed from: a */
        public static final b f1933a = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$b$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return b.f1933a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC8128b {

        /* renamed from: a */
        public static final c f1934a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$c$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return c.f1934a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC8128b {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        public final String f1935a;

        /* renamed from: b */
        public final String f1936b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$d$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String amount, String action) {
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f1935a = amount;
            this.f1936b = action;
        }

        /* renamed from: b */
        public final String m1983b() {
            return this.f1936b;
        }

        /* renamed from: c */
        public final String m1984c() {
            return this.f1935a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f1935a, dVar.f1935a) && Intrinsics.areEqual(this.f1936b, dVar.f1936b);
        }

        public int hashCode() {
            return this.f1936b.hashCode() + (this.f1935a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Pay(amount=");
            sb.append(this.f1935a);
            sb.append(", action=");
            return C8032c.m1430a(sb, this.f1936b, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1935a);
            out.writeString(this.f1936b);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC8128b {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a */
        public final String f1937a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$e$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new e(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.f1937a = label;
        }

        /* renamed from: b */
        public final String m1987b() {
            return this.f1937a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f1937a, ((e) obj).f1937a);
        }

        public int hashCode() {
            return this.f1937a.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PayLabel(label="), this.f1937a, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1937a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC8128b {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a */
        public final int f1938a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$f$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new f(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(int i) {
            super(null);
            this.f1938a = i;
        }

        /* renamed from: b */
        public final int m1990b() {
            return this.f1938a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f1938a == ((f) obj).f1938a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f1938a);
        }

        public String toString() {
            return "PayRes(resId=" + this.f1938a + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.f1938a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC8128b {

        /* renamed from: a */
        public static final g f1939a = new g();
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$g$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return g.f1939a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC8128b {

        /* renamed from: a */
        public static final h f1940a = new h();
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$h$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return h.f1940a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        public h() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC8128b {

        /* renamed from: a */
        public static final i f1941a = new i();
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.b$i$a */
        /* loaded from: classes8.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return i.f1941a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        public i() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public AbstractC8128b() {
    }

    /* renamed from: a */
    public final String m1975a(Resources resources) {
        int iM1990b;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this instanceof d) {
            d dVar = (d) this;
            return resources.getString(C11403R.string.paylib_native_payment_pay, dVar.m1983b(), dVar.m1984c());
        }
        if (this instanceof e) {
            return ((e) this).m1987b();
        }
        if (this instanceof f) {
            iM1990b = ((f) this).m1990b();
        } else if (this instanceof g) {
            iM1990b = C11403R.string.paylib_native_update;
        } else {
            if (this instanceof h ? true : this instanceof i) {
                iM1990b = C11403R.string.paylib_native_payment_retry;
            } else if (this instanceof c) {
                iM1990b = C11403R.string.paylib_native_payment_change_card;
            } else {
                if (!(this instanceof b)) {
                    if (this instanceof a) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                iM1990b = C11403R.string.paylib_native_payment_add_card;
            }
        }
        return resources.getString(iM1990b);
    }

    public /* synthetic */ AbstractC8128b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final boolean m1976a() {
        return !(this instanceof a);
    }
}
