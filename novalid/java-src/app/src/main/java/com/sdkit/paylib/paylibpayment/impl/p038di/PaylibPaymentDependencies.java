package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/di/PaylibPaymentDependencies;", "", "backendUrlProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "getBackendUrlProvider", "()Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "clientInfoProvider", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "getClientInfoProvider", "()Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "featureFlags", "Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "getFeatureFlags", "()Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "tokenProvider", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "getTokenProvider", "()Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PaylibPaymentDependencies {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.PaylibPaymentDependencies$DefaultImpls$a */
        /* loaded from: classes6.dex */
        public static final class C8495a implements PayLibPaymentFeatureFlags {
            @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
            public boolean isSslPinningEnabled() {
                return PayLibPaymentFeatureFlags.DefaultImpls.isSslPinningEnabled(this);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
            public Boolean isTracingEnabled() {
                return PayLibPaymentFeatureFlags.DefaultImpls.isTracingEnabled(this);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
            public boolean isUseChannelAndAuthConnector() {
                return PayLibPaymentFeatureFlags.DefaultImpls.isUseChannelAndAuthConnector(this);
            }
        }

        public static BackendUrlProvider getBackendUrlProvider(PaylibPaymentDependencies paylibPaymentDependencies) {
            return null;
        }

        public static PaylibClientInfoProvider getClientInfoProvider(PaylibPaymentDependencies paylibPaymentDependencies) {
            return null;
        }

        public static PayLibPaymentFeatureFlags getFeatureFlags(PaylibPaymentDependencies paylibPaymentDependencies) {
            return new C8495a();
        }
    }

    BackendUrlProvider getBackendUrlProvider();

    PaylibClientInfoProvider getClientInfoProvider();

    PayLibPaymentFeatureFlags getFeatureFlags();

    PaylibTokenProvider getTokenProvider();
}
