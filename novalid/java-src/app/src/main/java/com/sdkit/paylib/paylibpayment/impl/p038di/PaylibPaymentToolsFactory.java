package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/di/PaylibPaymentToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "paylibPaymentDependencies", "Lcom/sdkit/paylib/paylibpayment/impl/di/PaylibPaymentDependencies;", "paylibNetworkTools", "Lcom/sdkit/paylib/paylibnetwork/api/di/PaylibNetworkTools;", "paylibLoggingTools", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibPlatformTools", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class PaylibPaymentToolsFactory {
    public static final PaylibPaymentToolsFactory INSTANCE = new PaylibPaymentToolsFactory();

    @JvmStatic
    public static final PaylibPaymentTools create(PaylibPaymentDependencies paylibPaymentDependencies, PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
        Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8497b.f4818a.m3923a(paylibPaymentDependencies, paylibNetworkTools, paylibLoggingTools, paylibPlatformTools);
    }
}
