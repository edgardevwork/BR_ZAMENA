package com.sdkit.paylib.paylibdomain.impl.p028di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/impl/di/PaylibDomainToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/paylibdomain/api/di/PaylibDomainTools;", "paylibDomainDependencies", "Lcom/sdkit/paylib/paylibdomain/impl/di/PaylibDomainDependencies;", "paylibLoggingTools", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibPaymentTools", "Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "paylibPlatformTools", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "com-sdkit-assistant_paylib_domain"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class PaylibDomainToolsFactory {
    public static final PaylibDomainToolsFactory INSTANCE = new PaylibDomainToolsFactory();

    @JvmStatic
    public static final PaylibDomainTools create(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibDomainDependencies, "paylibDomainDependencies");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8050b.f1205a.m1516a(paylibDomainDependencies, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools);
    }
}
