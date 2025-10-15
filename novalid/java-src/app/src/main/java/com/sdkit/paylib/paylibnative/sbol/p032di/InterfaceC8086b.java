package com.sdkit.paylib.paylibnative.sbol.p032di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.di.b */
/* loaded from: classes5.dex */
public interface InterfaceC8086b extends PaylibNativeTools {

    /* renamed from: a */
    public static final a f1720a = a.f1721a;

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.b$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f1721a = new a();

        /* renamed from: a */
        public final InterfaceC8086b m1774a(SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies, SbolPaylibNativeDependencies sbolPaylibNativeDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(sbolAnalyticsPaylibNativeDependencies, "sbolAnalyticsPaylibNativeDependencies");
            Intrinsics.checkNotNullParameter(sbolPaylibNativeDependencies, "sbolPaylibNativeDependencies");
            Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8086b interfaceC8086bM1763a = AbstractC8085a.m1756a().m1757a(paylibDomainTools).m1758a(paylibLoggingTools).m1761a(paylibPaymentTools).m1762a(paylibPlatformTools).m1759a(sbolAnalyticsPaylibNativeDependencies).m1760a(sbolPaylibNativeDependencies).m1763a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8086bM1763a, "builder()\n              …\n                .build()");
            return interfaceC8086bM1763a;
        }
    }
}
