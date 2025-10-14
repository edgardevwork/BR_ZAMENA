package ru.rustore.sdk.billingclient.impl.domain.interactor;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11529p;
import ru.rustore.sdk.billingclient.impl.utils.InterfaceC11549a;

@Deprecated(message = "RUSTORE-39826 Удалить эту логику вместе с PurchaseAvailabilityResult")
/* renamed from: ru.rustore.sdk.billingclient.impl.domain.interactor.b */
/* loaded from: classes5.dex */
public final class C11502b {

    /* renamed from: a */
    public final C11486n f10474a;

    /* renamed from: b */
    public final C11487o f10475b;

    /* renamed from: c */
    public final C11529p f10476c;

    /* renamed from: d */
    public final InterfaceC11549a f10477d;

    /* renamed from: e */
    public final String f10478e;

    public C11502b(C11486n ruStoreInstallStatusRepository, C11487o ruStoreUserIdRepository, C11529p updateRustoreAuthorizationInfoUseCase, InterfaceC11549a dispatchers, String packageName) {
        Intrinsics.checkNotNullParameter(ruStoreInstallStatusRepository, "ruStoreInstallStatusRepository");
        Intrinsics.checkNotNullParameter(ruStoreUserIdRepository, "ruStoreUserIdRepository");
        Intrinsics.checkNotNullParameter(updateRustoreAuthorizationInfoUseCase, "updateRustoreAuthorizationInfoUseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f10474a = ruStoreInstallStatusRepository;
        this.f10475b = ruStoreUserIdRepository;
        this.f10476c = updateRustoreAuthorizationInfoUseCase;
        this.f10477d = dispatchers;
        this.f10478e = packageName;
    }
}
