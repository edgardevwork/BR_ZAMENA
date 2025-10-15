package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.N0 */
/* loaded from: classes6.dex */
public final class C11692N0 extends Lambda implements Function0<C11686K0> {

    /* renamed from: a */
    public final /* synthetic */ C11694O0 f10835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11692N0(C11694O0 c11694o0) {
        super(0);
        this.f10835a = c11694o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11686K0 invoke() {
        C11686K0 c11686k0;
        C11694O0 c11694o0 = this.f10835a;
        synchronized (c11694o0.f10840d) {
            try {
                c11686k0 = c11694o0.f10837a.f10832a;
                if (c11686k0 == null) {
                    C11738g0 dto = c11694o0.f10838b.m7538a();
                    if (dto != null) {
                        c11694o0.f10839c.getClass();
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        c11686k0 = new C11686K0(new RemoteConfig(dto.f10928b), dto.f10930d);
                    } else {
                        c11686k0 = null;
                    }
                    c11694o0.f10837a.f10832a = c11686k0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11686k0;
    }
}
