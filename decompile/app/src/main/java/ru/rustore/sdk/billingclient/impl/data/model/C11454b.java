package ru.rustore.sdk.billingclient.impl.data.model;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* renamed from: ru.rustore.sdk.billingclient.impl.data.model.b */
/* loaded from: classes5.dex */
public final class C11454b {

    /* renamed from: a */
    public final String f10240a;

    public final boolean equals(Object obj) {
        return (obj instanceof C11454b) && Intrinsics.areEqual(this.f10240a, ((C11454b) obj).f10240a);
    }

    public final int hashCode() {
        return this.f10240a.hashCode();
    }

    public final String toString() {
        return "ProductTokenDto(value=" + this.f10240a + ')';
    }
}
