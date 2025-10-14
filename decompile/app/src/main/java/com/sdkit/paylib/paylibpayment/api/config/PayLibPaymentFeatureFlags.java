package com.sdkit.paylib.paylibpayment.api.config;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "", "isSslPinningEnabled", "", "()Z", "isTracingEnabled", "()Ljava/lang/Boolean;", "isUseChannelAndAuthConnector", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PayLibPaymentFeatureFlags {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static boolean isSslPinningEnabled(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags) {
            return true;
        }

        public static Boolean isTracingEnabled(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags) {
            return null;
        }

        public static boolean isUseChannelAndAuthConnector(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags) {
            return true;
        }
    }

    boolean isSslPinningEnabled();

    Boolean isTracingEnabled();

    boolean isUseChannelAndAuthConnector();
}
