package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.g */
/* loaded from: classes6.dex */
public final class C11737g extends Lambda implements Function1<C11708W, C11716a> {

    /* renamed from: a */
    public final /* synthetic */ C11739h f10926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11737g(C11739h c11739h) {
        super(1);
        this.f10926a = c11739h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11716a invoke(C11708W c11708w) {
        C11708W dto = c11708w;
        Intrinsics.checkNotNullParameter(dto, "networkConfigDto");
        this.f10926a.f10933c.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new C11716a(new RemoteConfig(dto.f10865a), dto.f10867c);
    }
}
