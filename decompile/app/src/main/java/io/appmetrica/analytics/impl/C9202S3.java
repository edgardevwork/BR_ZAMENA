package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.S3 */
/* loaded from: classes5.dex */
public final class C9202S3 extends AbstractC9135P7 {
    @Override // io.appmetrica.analytics.impl.AbstractC9135P7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean mo5030a(@NotNull C8987J3 c8987j3, @NotNull C8987J3 c8987j32) {
        if (!AbstractC9664kn.m6345a(c8987j32.f6805a)) {
            if (AbstractC9664kn.m6345a(c8987j3.f6805a)) {
                return false;
            }
            EnumC9159Q7 enumC9159Q7 = c8987j3.f6806b;
            if (enumC9159Q7 == EnumC9159Q7.f7146c) {
                if (((Number) this.f7084a.m6635a(enumC9159Q7)).intValue() < ((Number) this.f7084a.m6635a(c8987j32.f6806b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f7084a.m6635a(enumC9159Q7)).intValue() <= ((Number) this.f7084a.m6635a(c8987j32.f6806b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
