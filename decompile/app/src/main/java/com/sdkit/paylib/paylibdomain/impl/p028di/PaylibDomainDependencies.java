package com.sdkit.paylib.paylibdomain.impl.p028di;

import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/impl/di/PaylibDomainDependencies;", "", "featureFlags", "Lcom/sdkit/paylib/paylibdomain/api/config/PaylibDomainFeatureFlags;", "getFeatureFlags", "()Lcom/sdkit/paylib/paylibdomain/api/config/PaylibDomainFeatureFlags;", "com-sdkit-assistant_paylib_domain"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibDomainDependencies {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.PaylibDomainDependencies$DefaultImpls$a */
        public static final class C8048a implements PaylibDomainFeatureFlags {
            @Override // com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags
            public boolean isCheckInvoiceExecutedStatusEnabled() {
                return PaylibDomainFeatureFlags.DefaultImpls.isCheckInvoiceExecutedStatusEnabled(this);
            }
        }

        public static PaylibDomainFeatureFlags getFeatureFlags(PaylibDomainDependencies paylibDomainDependencies) {
            return new C8048a();
        }
    }

    PaylibDomainFeatureFlags getFeatureFlags();
}
