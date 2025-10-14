package com.sdkit.paylib.paylibnative.p033ui.core.longpolling;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.longpolling.a */
/* loaded from: classes8.dex */
public final class C8145a implements Parcelable {
    public static final Parcelable.Creator<C8145a> CREATOR = new a();

    /* renamed from: a */
    public final long f2009a;

    /* renamed from: b */
    public final long f2010b;

    /* renamed from: c */
    public final int f2011c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.longpolling.a$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8145a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8145a(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8145a[] newArray(int i) {
            return new C8145a[i];
        }
    }

    public C8145a(long j, long j2, int i) {
        this.f2009a = j;
        this.f2010b = j2;
        this.f2011c = i;
    }

    /* renamed from: a */
    public final long m2048a() {
        return this.f2009a;
    }

    /* renamed from: b */
    public final int m2049b() {
        return this.f2011c;
    }

    /* renamed from: c */
    public final long m2050c() {
        return this.f2010b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8145a)) {
            return false;
        }
        C8145a c8145a = (C8145a) obj;
        return this.f2009a == c8145a.f2009a && this.f2010b == c8145a.f2010b && this.f2011c == c8145a.f2011c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2011c) + ((Long.hashCode(this.f2010b) + (Long.hashCode(this.f2009a) * 31)) * 31);
    }

    public String toString() {
        return "LongPollingParams(firstWaitSec=" + this.f2009a + ", retryWaitSec=" + this.f2010b + ", retriesLimit=" + this.f2011c + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeLong(this.f2009a);
        out.writeLong(this.f2010b);
        out.writeInt(this.f2011c);
    }
}
