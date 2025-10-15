package com.sdkit.paylib.paylibpayment.impl.domain.info;

import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.g */
/* loaded from: classes6.dex */
public final class C8512g implements InterfaceC8511f {

    /* renamed from: a */
    public final InterfaceC8506a f4833a;

    /* renamed from: b */
    public final C8509d f4834b;

    /* renamed from: c */
    public final PaylibClientInfoProvider f4835c;

    /* renamed from: d */
    public final PayLibPaymentFeatureFlags f4836d;

    public C8512g(InterfaceC8506a device, C8509d deviceIdStorage, PaylibClientInfoProvider paylibClientInfoProvider, PayLibPaymentFeatureFlags paylibPaymentFeatureFlags) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(deviceIdStorage, "deviceIdStorage");
        Intrinsics.checkNotNullParameter(paylibPaymentFeatureFlags, "paylibPaymentFeatureFlags");
        this.f4833a = device;
        this.f4834b = deviceIdStorage;
        this.f4835c = paylibClientInfoProvider;
        this.f4836d = paylibPaymentFeatureFlags;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    /* renamed from: a */
    public String mo3953a() {
        return this.f4834b.m3949a();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getAuthConnector() {
        PaylibClientInfoProvider paylibClientInfoProvider;
        if (!this.f4836d.isUseChannelAndAuthConnector() || (paylibClientInfoProvider = this.f4835c) == null) {
            return null;
        }
        return paylibClientInfoProvider.getAuthConnector();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getChannel() {
        PaylibClientInfoProvider paylibClientInfoProvider;
        if (!this.f4836d.isUseChannelAndAuthConnector() || (paylibClientInfoProvider = this.f4835c) == null) {
            return null;
        }
        return paylibClientInfoProvider.getChannel();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getDeviceManufacturer() {
        String deviceManufacturer;
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        return (paylibClientInfoProvider == null || (deviceManufacturer = paylibClientInfoProvider.getDeviceManufacturer()) == null) ? this.f4833a.getDeviceManufacturer() : deviceManufacturer;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getDeviceModel() {
        String deviceModel;
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        return (paylibClientInfoProvider == null || (deviceModel = paylibClientInfoProvider.getDeviceModel()) == null) ? this.f4833a.getDeviceModel() : deviceModel;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getDevicePlatformType() {
        String devicePlatformType;
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        return (paylibClientInfoProvider == null || (devicePlatformType = paylibClientInfoProvider.getDevicePlatformType()) == null) ? this.f4833a.getDevicePlatformType() : devicePlatformType;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getDevicePlatformVersion() {
        String devicePlatformVersion;
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        return (paylibClientInfoProvider == null || (devicePlatformVersion = paylibClientInfoProvider.getDevicePlatformVersion()) == null) ? this.f4833a.getDevicePlatformVersion() : devicePlatformVersion;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getPackageName() {
        String packageName;
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        if (paylibClientInfoProvider != null && (packageName = paylibClientInfoProvider.getPackageName()) != null) {
            if (!(!StringsKt__StringsJVMKt.isBlank(packageName))) {
                packageName = null;
            }
            if (packageName != null) {
                return packageName;
            }
        }
        return this.f4833a.getPackageName();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getSurface() {
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        if (paylibClientInfoProvider != null) {
            return paylibClientInfoProvider.getSurface();
        }
        return null;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f
    public String getSurfaceVersion() {
        PaylibClientInfoProvider paylibClientInfoProvider = this.f4835c;
        if (paylibClientInfoProvider != null) {
            return paylibClientInfoProvider.getSurfaceVersion();
        }
        return null;
    }
}
