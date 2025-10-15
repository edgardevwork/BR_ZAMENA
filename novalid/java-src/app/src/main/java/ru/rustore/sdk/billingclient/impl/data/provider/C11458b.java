package ru.rustore.sdk.billingclient.impl.data.provider;

import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.b */
/* loaded from: classes7.dex */
public final class C11458b implements PaylibClientInfoProvider {

    /* renamed from: a */
    public final String f10247a;

    public C11458b(String consoleApplicationId) {
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        this.f10247a = consoleApplicationId;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getAuthConnector() {
        return PaylibClientInfoProvider.DefaultImpls.getAuthConnector(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getChannel() {
        return PaylibClientInfoProvider.DefaultImpls.getChannel(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getDeviceManufacturer() {
        return PaylibClientInfoProvider.DefaultImpls.getDeviceManufacturer(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getDeviceModel() {
        return PaylibClientInfoProvider.DefaultImpls.getDeviceModel(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getDevicePlatformType() {
        return PaylibClientInfoProvider.DefaultImpls.getDevicePlatformType(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getDevicePlatformVersion() {
        return PaylibClientInfoProvider.DefaultImpls.getDevicePlatformVersion(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getPackageName() {
        return this.f10247a;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getSurface() {
        return PaylibClientInfoProvider.DefaultImpls.getSurface(this);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public final String getSurfaceVersion() {
        return PaylibClientInfoProvider.DefaultImpls.getSurfaceVersion(this);
    }
}
