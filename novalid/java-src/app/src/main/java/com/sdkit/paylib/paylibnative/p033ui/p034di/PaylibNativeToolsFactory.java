package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibnative.p033ui.config.AbstractC8130a;
import com.sdkit.paylib.paylibnative.p033ui.config.C8135f;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J:\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativeToolsFactory;", "", "()V", "usingHostRouter", "Lcom/sdkit/paylib/paylibnative/api/di/PaylibNativeTools;", "paylibNativeDependencies", "Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativeDependencies;", "paylibDomainTools", "Lcom/sdkit/paylib/paylibdomain/api/di/PaylibDomainTools;", "paylibLoggingTools", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibNetworkTools", "Lcom/sdkit/paylib/paylibnetwork/api/di/PaylibNetworkTools;", "paylibPaymentTools", "Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "paylibPlatformTools", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "usingOwnActivity", "paylibNativePayMethodsDependencies", "Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativePayMethodsDependencies;", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class PaylibNativeToolsFactory {
    public static final PaylibNativeToolsFactory INSTANCE = new PaylibNativeToolsFactory();

    @JvmStatic
    public static final PaylibNativeTools usingHostRouter(PaylibNativeDependencies paylibNativeDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibNativeDependencies, "paylibNativeDependencies");
        Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8211b.f2347b.m2209a(C8135f.f1954a.m2020a(paylibNativeDependencies, new AbstractC8130a.b(paylibNativeDependencies.getHostRouter())), paylibDomainTools, paylibLoggingTools, paylibNetworkTools, paylibPaymentTools, paylibPlatformTools);
    }

    @JvmStatic
    public static final PaylibNativeTools usingOwnActivity(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8211b.f2347b.m2209a(C8135f.f1954a.m2020a(paylibNativePayMethodsDependencies, AbstractC8130a.a.f1946a), paylibDomainTools, paylibLoggingTools, paylibNetworkTools, paylibPaymentTools, paylibPlatformTools);
    }
}
