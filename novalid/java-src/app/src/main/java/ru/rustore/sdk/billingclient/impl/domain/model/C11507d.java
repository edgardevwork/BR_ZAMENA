package ru.rustore.sdk.billingclient.impl.domain.model;

import kotlin.jvm.JvmInline;

@JvmInline
/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.d */
/* loaded from: classes5.dex */
public final class C11507d {

    /* renamed from: a */
    public final boolean f10489a;

    public /* synthetic */ C11507d(boolean z) {
        this.f10489a = z;
    }

    /* renamed from: a */
    public static int m7467a(boolean z) {
        return Boolean.hashCode(z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11507d) && this.f10489a == ((C11507d) obj).f10489a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10489a);
    }

    public final String toString() {
        return "SandboxInfo(enabled=" + this.f10489a + ')';
    }
}
