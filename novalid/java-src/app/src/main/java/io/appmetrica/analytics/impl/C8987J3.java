package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.J3 */
/* loaded from: classes6.dex */
public final class C8987J3 implements InterfaceC9182R7 {

    /* renamed from: a */
    public final Map f6805a;

    /* renamed from: b */
    public final EnumC9159Q7 f6806b;

    public C8987J3(@Nullable Map<String, String> map, @NotNull EnumC9159Q7 enumC9159Q7) {
        this.f6805a = map;
        this.f6806b = enumC9159Q7;
    }

    @NotNull
    /* renamed from: a */
    public final C8987J3 m5285a(@Nullable Map<String, String> map, @NotNull EnumC9159Q7 enumC9159Q7) {
        return new C8987J3(map, enumC9159Q7);
    }

    @Nullable
    /* renamed from: b */
    public final Map<String, String> m5286b() {
        return this.f6805a;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC9159Q7 m5287c() {
        return this.f6806b;
    }

    @Nullable
    /* renamed from: d */
    public final Map<String, String> m5288d() {
        return this.f6805a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8987J3)) {
            return false;
        }
        C8987J3 c8987j3 = (C8987J3) obj;
        return Intrinsics.areEqual(this.f6805a, c8987j3.f6805a) && this.f6806b == c8987j3.f6806b;
    }

    public final int hashCode() {
        Map map = this.f6805a;
        return this.f6806b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f6805a + ", source=" + this.f6806b + ')';
    }

    /* renamed from: a */
    public static C8987J3 m5284a(C8987J3 c8987j3, Map map, EnumC9159Q7 enumC9159Q7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c8987j3.f6805a;
        }
        if ((i & 2) != 0) {
            enumC9159Q7 = c8987j3.f6806b;
        }
        c8987j3.getClass();
        return new C8987J3(map, enumC9159Q7);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9182R7
    @NotNull
    /* renamed from: a */
    public final EnumC9159Q7 mo5271a() {
        return this.f6806b;
    }
}
