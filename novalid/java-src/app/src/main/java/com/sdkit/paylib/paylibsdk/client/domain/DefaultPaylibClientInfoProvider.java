package com.sdkit.paylib.paylibsdk.client.domain;

import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibsdk/client/domain/DefaultPaylibClientInfoProvider;", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "()V", "authConnector", "", "getAuthConnector", "()Ljava/lang/String;", "channel", "getChannel", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "devicePlatformType", "getDevicePlatformType", "devicePlatformVersion", "getDevicePlatformVersion", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "surface", "getSurface", "surfaceVersion", "getSurfaceVersion", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DefaultPaylibClientInfoProvider implements PaylibClientInfoProvider {
    public static final DefaultPaylibClientInfoProvider INSTANCE = new DefaultPaylibClientInfoProvider();

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getAuthConnector() {
        return null;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getChannel() {
        return null;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDeviceManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDeviceModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDevicePlatformType() {
        return "ANDROID";
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getDevicePlatformVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getPackageName() {
        return null;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getSurface() {
        return "PAYLIB_SDK";
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider
    public String getSurfaceVersion() {
        return "30.0.0.20";
    }
}
