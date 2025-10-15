package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.identifiers.impl.c */
/* loaded from: classes6.dex */
public final class C8741c {

    /* renamed from: a */
    public final IdentifierStatus f6277a;

    /* renamed from: b */
    public final C8739a f6278b;

    /* renamed from: c */
    public final String f6279c;

    public C8741c(IdentifierStatus identifierStatus, C8739a c8739a, String str) {
        this.f6277a = identifierStatus;
        this.f6278b = c8739a;
        this.f6279c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8741c)) {
            return false;
        }
        C8741c c8741c = (C8741c) obj;
        return this.f6277a == c8741c.f6277a && Intrinsics.areEqual(this.f6278b, c8741c.f6278b) && Intrinsics.areEqual(this.f6279c, c8741c.f6279c);
    }

    public final int hashCode() {
        int iHashCode = this.f6277a.hashCode() * 31;
        C8739a c8739a = this.f6278b;
        int iHashCode2 = (iHashCode + (c8739a == null ? 0 : c8739a.hashCode())) * 31;
        String str = this.f6279c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f6277a + ", advIdInfo=" + this.f6278b + ", errorExplanation=" + this.f6279c + ')';
    }

    public /* synthetic */ C8741c(IdentifierStatus identifierStatus, C8739a c8739a, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : c8739a, (i & 4) != 0 ? null : str);
    }
}
