package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11481i;
import ru.rustore.sdk.billingclient.impl.data.repository.C11494v;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.a */
/* loaded from: classes5.dex */
public final class C11514a {

    /* renamed from: a */
    public final C11494v f10505a;

    /* renamed from: b */
    public final C11481i f10506b;

    /* renamed from: c */
    public final C11496x f10507c;

    public C11514a(C11494v unauthorizedTokenRepository, C11481i pendingPurchaseRepository, C11496x webAuthorizationInfoRepository) {
        Intrinsics.checkNotNullParameter(unauthorizedTokenRepository, "unauthorizedTokenRepository");
        Intrinsics.checkNotNullParameter(pendingPurchaseRepository, "pendingPurchaseRepository");
        Intrinsics.checkNotNullParameter(webAuthorizationInfoRepository, "webAuthorizationInfoRepository");
        this.f10505a = unauthorizedTokenRepository;
        this.f10506b = pendingPurchaseRepository;
        this.f10507c = webAuthorizationInfoRepository;
    }

    /* renamed from: a */
    public final void m7468a() {
        this.f10507c.m7462a(null);
        synchronized (this.f10505a) {
            Unit unit = Unit.INSTANCE;
        }
        this.f10506b.m7455a(null);
    }
}
