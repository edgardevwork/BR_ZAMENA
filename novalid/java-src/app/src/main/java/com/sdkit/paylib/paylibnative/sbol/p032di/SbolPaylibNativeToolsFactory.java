package com.sdkit.paylib.paylibnative.sbol.p032di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/sbol/di/SbolPaylibNativeToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/paylibnative/api/di/PaylibNativeTools;", "sbolAnalyticsPaylibNativeDependencies", "Lcom/sdkit/paylib/paylibnative/sbol/di/SbolAnalyticsPaylibNativeDependencies;", "sbolPaylibNativeDependencies", "Lcom/sdkit/paylib/paylibnative/sbol/di/SbolPaylibNativeDependencies;", "paylibDomainTools", "Lcom/sdkit/paylib/paylibdomain/api/di/PaylibDomainTools;", "paylibLoggingTools", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibPaymentTools", "Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "paylibPlatformTools", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "com-sdkit-assistant_paylib_native_sbolpay"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class SbolPaylibNativeToolsFactory {
    public static final SbolPaylibNativeToolsFactory INSTANCE = new SbolPaylibNativeToolsFactory();

    @JvmStatic
    public static final PaylibNativeTools create(SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies, SbolPaylibNativeDependencies sbolPaylibNativeDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(sbolAnalyticsPaylibNativeDependencies, "sbolAnalyticsPaylibNativeDependencies");
        Intrinsics.checkNotNullParameter(sbolPaylibNativeDependencies, "sbolPaylibNativeDependencies");
        Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8086b.f1720a.m1774a(sbolAnalyticsPaylibNativeDependencies, sbolPaylibNativeDependencies, paylibDomainTools, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools);
    }
}
