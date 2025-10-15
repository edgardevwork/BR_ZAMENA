package com.sdkit.paylib.paylibsdk.client;

import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.impl.p038di.AdditionalPaylibPaymentDependencies;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import com.sdkit.paylib.paylibsdk.client.domain.DefaultPaylibClientInfoProvider;
import com.sdkit.paylib.paylibsdk.client.domain.PaylibClientInfoProviderMerge;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8603a;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8608f;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m7105d2 = {"com/sdkit/paylib/paylibsdk/client/PaylibSdkClient$installDefault$paylibPaymentDependencies$1", "Lcom/sdkit/paylib/paylibpayment/impl/di/PaylibPaymentDependencies;", "Lcom/sdkit/paylib/paylibpayment/impl/di/AdditionalPaylibPaymentDependencies;", "Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "a", "Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "getConfigProvider", "()Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "configProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "b", "Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "getBackendUrlProvider", "()Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "backendUrlProvider", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "c", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "getClientInfoProvider", "()Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "clientInfoProvider", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "d", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "getTokenProvider", "()Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "tokenProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "e", "Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "getFeatureFlags", "()Lcom/sdkit/paylib/paylibpayment/api/config/PayLibPaymentFeatureFlags;", "featureFlags", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class PaylibSdkClient$installDefault$paylibPaymentDependencies$1 implements PaylibPaymentDependencies, AdditionalPaylibPaymentDependencies {

    /* renamed from: a, reason: from kotlin metadata */
    public final InternalConfigProvider configProvider;

    /* renamed from: b, reason: from kotlin metadata */
    public final BackendUrlProvider backendUrlProvider;

    /* renamed from: c, reason: from kotlin metadata */
    public final PaylibClientInfoProvider clientInfoProvider;

    /* renamed from: d, reason: from kotlin metadata */
    public final PaylibTokenProvider tokenProvider;

    /* renamed from: e, reason: from kotlin metadata */
    public final PayLibPaymentFeatureFlags featureFlags;

    public PaylibSdkClient$installDefault$paylibPaymentDependencies$1(InternalConfigProvider internalConfigProvider, BackendUrlProvider backendUrlProvider, PaylibClientInfoProvider paylibClientInfoProvider, PaylibTokenProvider paylibTokenProvider, C8608f c8608f) {
        this.configProvider = internalConfigProvider == null ? new C8603a() : internalConfigProvider;
        this.backendUrlProvider = backendUrlProvider;
        this.clientInfoProvider = paylibClientInfoProvider != null ? new PaylibClientInfoProviderMerge(DefaultPaylibClientInfoProvider.INSTANCE, paylibClientInfoProvider) : DefaultPaylibClientInfoProvider.INSTANCE;
        this.tokenProvider = paylibTokenProvider;
        this.featureFlags = c8608f.m4712c();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies
    public BackendUrlProvider getBackendUrlProvider() {
        return this.backendUrlProvider;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies
    public PaylibClientInfoProvider getClientInfoProvider() {
        return this.clientInfoProvider;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.p038di.AdditionalPaylibPaymentDependencies
    public InternalConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies
    public PayLibPaymentFeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies
    public PaylibTokenProvider getTokenProvider() {
        return this.tokenProvider;
    }
}
