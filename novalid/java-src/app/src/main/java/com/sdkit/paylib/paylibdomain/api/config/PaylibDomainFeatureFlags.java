package com.sdkit.paylib.paylibdomain.api.config;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/config/PaylibDomainFeatureFlags;", "", "isCheckInvoiceExecutedStatusEnabled", "", "()Z", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibDomainFeatureFlags {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static boolean isCheckInvoiceExecutedStatusEnabled(PaylibDomainFeatureFlags paylibDomainFeatureFlags) {
            return false;
        }
    }

    boolean isCheckInvoiceExecutedStatusEnabled();
}
