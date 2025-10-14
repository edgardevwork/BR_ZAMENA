package com.sdkit.paylib.paylibpayment.api.config;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "paylibContext", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaylibContext;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface BackendUrlProvider {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static String baseUrl(BackendUrlProvider backendUrlProvider, PaylibContext paylibContext) {
            Intrinsics.checkNotNullParameter(paylibContext, "paylibContext");
            return null;
        }
    }

    String baseUrl(PaylibContext paylibContext);

    String getBaseUrl();
}
