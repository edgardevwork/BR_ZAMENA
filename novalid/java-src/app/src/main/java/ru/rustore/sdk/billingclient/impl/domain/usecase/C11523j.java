package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11481i;
import ru.rustore.sdk.billingclient.impl.data.repository.C11493u;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.j */
/* loaded from: classes5.dex */
public final class C11523j {

    /* renamed from: a */
    public final C11481i f10520a;

    /* renamed from: b */
    public final C11493u f10521b;

    public C11523j(C11481i pendingPurchaseRepository, C11493u productTypeRepository) {
        Intrinsics.checkNotNullParameter(pendingPurchaseRepository, "pendingPurchaseRepository");
        Intrinsics.checkNotNullParameter(productTypeRepository, "productTypeRepository");
        this.f10520a = pendingPurchaseRepository;
        this.f10521b = productTypeRepository;
    }
}
