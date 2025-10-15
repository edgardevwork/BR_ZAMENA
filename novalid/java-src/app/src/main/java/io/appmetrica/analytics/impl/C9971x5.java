package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.x5 */
/* loaded from: classes5.dex */
public final class C9971x5 implements InterfaceC8823Cc {

    /* renamed from: a */
    public final String f9297a;

    public C9971x5(@NotNull String str) {
        this.f9297a = str;
    }

    @NotNull
    /* renamed from: a */
    public final C9971x5 m6953a(@NotNull String str) {
        return new C9971x5(str);
    }

    @NotNull
    /* renamed from: b */
    public final String m6954b() {
        return this.f9297a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9971x5) && Intrinsics.areEqual(this.f9297a, ((C9971x5) obj).f9297a);
    }

    public final int hashCode() {
        return this.f9297a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f9297a + ')';
    }

    /* renamed from: a */
    public static C9971x5 m6952a(C9971x5 c9971x5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c9971x5.f9297a;
        }
        c9971x5.getClass();
        return new C9971x5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8823Cc
    @NotNull
    /* renamed from: a */
    public final String mo5027a() {
        return this.f9297a;
    }
}
