package com.sdkit.paylib.paylibsdk.client.domain;

import com.blackhub.bronline.BuildConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibsdk/client/domain/PaylibClientInfoProviderMerge;", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", BuildConfig.CDN_USERNAME, "overrides", "(Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;)V", "authConnector", "", "getAuthConnector", "()Ljava/lang/String;", "channel", "getChannel", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "devicePlatformType", "getDevicePlatformType", "devicePlatformVersion", "getDevicePlatformVersion", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "surface", "getSurface", "surfaceVersion", "getSurfaceVersion", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class PaylibClientInfoProviderMerge implements PaylibClientInfoProvider {
    private final PaylibClientInfoProvider main;
    private final PaylibClientInfoProvider overrides;

    public PaylibClientInfoProviderMerge(PaylibClientInfoProvider main, PaylibClientInfoProvider overrides) {
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.main = main;
        this.overrides = overrides;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getAuthConnector() {
        String authConnector = this.overrides.getAuthConnector();
        return authConnector == null ? this.main.getAuthConnector() : authConnector;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getChannel() {
        String channel = this.overrides.getChannel();
        return channel == null ? this.main.getChannel() : channel;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDeviceManufacturer() {
        String deviceManufacturer = this.overrides.getDeviceManufacturer();
        return deviceManufacturer == null ? this.main.getDeviceManufacturer() : deviceManufacturer;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDeviceModel() {
        String deviceModel = this.overrides.getDeviceModel();
        return deviceModel == null ? this.main.getDeviceModel() : deviceModel;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDevicePlatformType() {
        String devicePlatformType = this.overrides.getDevicePlatformType();
        return devicePlatformType == null ? this.main.getDevicePlatformType() : devicePlatformType;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDevicePlatformVersion() {
        String devicePlatformVersion = this.overrides.getDevicePlatformVersion();
        return devicePlatformVersion == null ? this.main.getDevicePlatformVersion() : devicePlatformVersion;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getPackageName() {
        String packageName = this.overrides.getPackageName();
        return packageName == null ? this.main.getPackageName() : packageName;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getSurface() {
        String surface = this.overrides.getSurface();
        return surface == null ? this.main.getSurface() : surface;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getSurfaceVersion() {
        String surfaceVersion = this.overrides.getSurfaceVersion();
        return surfaceVersion == null ? this.main.getSurfaceVersion() : surfaceVersion;
    }
}
