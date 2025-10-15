package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Ff */
/* loaded from: classes6.dex */
public final class C8901Ff {

    /* renamed from: a */
    public final String f6595a;

    /* renamed from: b */
    public final long f6596b;

    /* renamed from: c */
    public final long f6597c;

    /* renamed from: d */
    public final EnumC8876Ef f6598d;

    public C8901Ff(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C8926Gf c8926GfM5226a = C8926Gf.m5226a(bArr);
        this.f6595a = c8926GfM5226a.f6671a;
        this.f6596b = c8926GfM5226a.f6673c;
        this.f6597c = c8926GfM5226a.f6672b;
        this.f6598d = m5146a(c8926GfM5226a.f6674d);
    }

    /* renamed from: a */
    public final byte[] m5147a() {
        C8926Gf c8926Gf = new C8926Gf();
        c8926Gf.f6671a = this.f6595a;
        c8926Gf.f6673c = this.f6596b;
        c8926Gf.f6672b = this.f6597c;
        int iOrdinal = this.f6598d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        c8926Gf.f6674d = i;
        return MessageNano.toByteArray(c8926Gf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8901Ff.class != obj.getClass()) {
            return false;
        }
        C8901Ff c8901Ff = (C8901Ff) obj;
        return this.f6596b == c8901Ff.f6596b && this.f6597c == c8901Ff.f6597c && this.f6595a.equals(c8901Ff.f6595a) && this.f6598d == c8901Ff.f6598d;
    }

    public final int hashCode() {
        int iHashCode = this.f6595a.hashCode() * 31;
        long j = this.f6596b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f6597c;
        return this.f6598d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f6595a + "', referrerClickTimestampSeconds=" + this.f6596b + ", installBeginTimestampSeconds=" + this.f6597c + ", source=" + this.f6598d + '}';
    }

    public C8901Ff(String str, long j, long j2, EnumC8876Ef enumC8876Ef) {
        this.f6595a = str;
        this.f6596b = j;
        this.f6597c = j2;
        this.f6598d = enumC8876Ef;
    }

    /* renamed from: a */
    public static EnumC8876Ef m5146a(int i) {
        if (i == 1) {
            return EnumC8876Ef.f6549c;
        }
        if (i != 2) {
            return EnumC8876Ef.f6548b;
        }
        return EnumC8876Ef.f6550d;
    }
}
