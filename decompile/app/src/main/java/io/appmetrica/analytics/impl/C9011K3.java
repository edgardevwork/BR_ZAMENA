package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.K3 */
/* loaded from: classes6.dex */
public final class C9011K3 implements InterfaceC9111O7 {

    /* renamed from: a */
    public final C8987J3 f6854a;

    /* renamed from: b */
    public final List f6855b;

    public C9011K3(@NotNull C8987J3 c8987j3, @NotNull List<C8987J3> list) {
        this.f6854a = c8987j3;
        this.f6855b = list;
    }

    @NotNull
    /* renamed from: a */
    public final C9011K3 m5320a(@NotNull C8987J3 c8987j3, @NotNull List<C8987J3> list) {
        return new C9011K3(c8987j3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9111O7
    /* renamed from: b */
    public final Object mo5322b() {
        return this.f6854a;
    }

    @NotNull
    /* renamed from: c */
    public final C8987J3 m5323c() {
        return this.f6854a;
    }

    @NotNull
    /* renamed from: d */
    public final List<C8987J3> m5324d() {
        return this.f6855b;
    }

    @NotNull
    /* renamed from: e */
    public final C8987J3 m5325e() {
        return this.f6854a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9011K3)) {
            return false;
        }
        C9011K3 c9011k3 = (C9011K3) obj;
        return Intrinsics.areEqual(this.f6854a, c9011k3.f6854a) && Intrinsics.areEqual(this.f6855b, c9011k3.f6855b);
    }

    public final int hashCode() {
        return this.f6855b.hashCode() + (this.f6854a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f6854a + ", candidates=" + this.f6855b + ')';
    }

    /* renamed from: a */
    public static C9011K3 m5319a(C9011K3 c9011k3, C8987J3 c8987j3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c8987j3 = c9011k3.f6854a;
        }
        if ((i & 2) != 0) {
            list = c9011k3.f6855b;
        }
        c9011k3.getClass();
        return new C9011K3(c8987j3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9111O7
    @NotNull
    /* renamed from: a */
    public final List<C8987J3> mo5321a() {
        return this.f6855b;
    }
}
