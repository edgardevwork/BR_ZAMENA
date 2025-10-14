package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.w */
/* loaded from: classes6.dex */
public final class C11769w extends Lambda implements Function0<C11765u> {

    /* renamed from: a */
    public final /* synthetic */ C11771x f10979a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11769w(C11771x c11771x) {
        super(0);
        this.f10979a = c11771x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11765u invoke() {
        C11738g0 dto = this.f10979a.f10983a.m7538a();
        if (dto == null) {
            return null;
        }
        this.f10979a.f10984b.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new C11765u(new RemoteConfig(dto.f10928b), dto.f10930d);
    }
}
