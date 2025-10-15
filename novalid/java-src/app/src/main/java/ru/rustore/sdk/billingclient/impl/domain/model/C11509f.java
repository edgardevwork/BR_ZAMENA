package ru.rustore.sdk.billingclient.impl.domain.model;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.f */
/* loaded from: classes5.dex */
public final class C11509f {

    /* renamed from: a */
    public final long f10493a;

    /* renamed from: b */
    public final long f10494b;

    public C11509f(long j, long j2) {
        this.f10493a = j;
        this.f10494b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11509f)) {
            return false;
        }
        C11509f c11509f = (C11509f) obj;
        return this.f10493a == c11509f.f10493a && this.f10494b == c11509f.f10494b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10494b) + (Long.hashCode(this.f10493a) * 31);
    }

    public final String toString() {
        return "StoreVersion(versionMajor=" + this.f10493a + ", versionMinor=" + this.f10494b + ')';
    }
}
