package ru.rustore.sdk.billingclient.impl.domain.model;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.a */
/* loaded from: classes5.dex */
public final class C11504a {

    /* renamed from: a */
    public final String f10485a;

    public final boolean equals(Object obj) {
        return (obj instanceof C11504a) && Intrinsics.areEqual(this.f10485a, ((C11504a) obj).f10485a);
    }

    public final int hashCode() {
        return this.f10485a.hashCode();
    }

    public final String toString() {
        return "ProductToken(value=" + this.f10485a + ')';
    }
}
