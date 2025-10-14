package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.r */
/* loaded from: classes5.dex */
public final class C11759r {

    /* renamed from: a */
    public final long f10971a;

    /* renamed from: b */
    public final String f10972b;

    public C11759r(long j, String configFingerprint) {
        Intrinsics.checkNotNullParameter(configFingerprint, "configFingerprint");
        this.f10971a = j;
        this.f10972b = configFingerprint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11759r)) {
            return false;
        }
        C11759r c11759r = (C11759r) obj;
        return this.f10971a == c11759r.f10971a && Intrinsics.areEqual(this.f10972b, c11759r.f10972b);
    }

    public final int hashCode() {
        return this.f10972b.hashCode() + (C11763t.m7552a(this.f10971a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigMetadata(version=");
        sb.append((Object) ("ConfigVersion(value=" + this.f10971a + ')'));
        sb.append(", configFingerprint=");
        sb.append((Object) ("ConfigFingerprint(value=" + this.f10972b + ')'));
        sb.append(')');
        return sb.toString();
    }
}
