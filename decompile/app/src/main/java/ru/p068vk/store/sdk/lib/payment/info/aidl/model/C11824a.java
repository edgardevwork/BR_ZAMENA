package ru.p068vk.store.sdk.lib.payment.info.aidl.model;

import java.util.Objects;

/* renamed from: ru.vk.store.sdk.lib.payment.info.aidl.model.a */
/* loaded from: classes5.dex */
public final class C11824a {

    /* renamed from: a */
    public final String f11063a;

    /* renamed from: b */
    public final String f11064b;

    /* renamed from: c */
    public final boolean f11065c;

    public C11824a(String str, String str2, boolean z) {
        this.f11063a = str;
        this.f11064b = str2;
        this.f11065c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11824a)) {
            return false;
        }
        C11824a c11824a = (C11824a) obj;
        return this.f11065c == c11824a.f11065c && this.f11063a.equals(c11824a.f11063a) && this.f11064b.equals(c11824a.f11064b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11063a, this.f11064b, Boolean.valueOf(this.f11065c));
    }
}
