package ru.rustore.sdk.billingclient.impl.p067di;

import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import ru.rustore.sdk.billingclient.BuildConfig;

/* renamed from: ru.rustore.sdk.billingclient.impl.di.b */
/* loaded from: classes7.dex */
public final class C11498b implements BackendUrlProvider {
    @Override // com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider
    public final String baseUrl(PaylibContext paylibContext) {
        return BackendUrlProvider.DefaultImpls.baseUrl(this, paylibContext);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider
    public final String getBaseUrl() {
        return BuildConfig.SBER_BACKEND_URL;
    }
}
