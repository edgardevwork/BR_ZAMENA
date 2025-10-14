package com.sdkit.paylib.paylibpayment.api.domain;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u0016"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "", "authConnector", "", "getAuthConnector", "()Ljava/lang/String;", "channel", "getChannel", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "devicePlatformType", "getDevicePlatformType", "devicePlatformVersion", "getDevicePlatformVersion", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "surface", "getSurface", "surfaceVersion", "getSurfaceVersion", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibClientInfoProvider {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static String getAuthConnector(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getChannel(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getDeviceManufacturer(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getDeviceModel(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getDevicePlatformType(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getDevicePlatformVersion(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getPackageName(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getSurface(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }

        public static String getSurfaceVersion(PaylibClientInfoProvider paylibClientInfoProvider) {
            return null;
        }
    }

    String getAuthConnector();

    String getChannel();

    String getDeviceManufacturer();

    String getDeviceModel();

    String getDevicePlatformType();

    String getDevicePlatformVersion();

    String getPackageName();

    String getSurface();

    String getSurfaceVersion();
}
