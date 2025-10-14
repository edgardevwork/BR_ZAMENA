package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11479g;
import ru.rustore.sdk.billingclient.impl.data.repository.C11489q;
import ru.rustore.sdk.billingclient.impl.domain.factory.C11499a;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.b */
/* loaded from: classes5.dex */
public final class C11515b {

    /* renamed from: a */
    public final C11479g f10508a;

    /* renamed from: b */
    public final C11489q f10509b;

    /* renamed from: c */
    public final C11499a f10510c;

    /* renamed from: d */
    public final String f10511d;

    public C11515b(C11479g deviceIdRepository, C11489q sdkInfoRepository, C11499a signatureFactory, String packageName) {
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(signatureFactory, "signatureFactory");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f10508a = deviceIdRepository;
        this.f10509b = sdkInfoRepository;
        this.f10510c = signatureFactory;
        this.f10511d = packageName;
    }
}
