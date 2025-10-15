package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.b */
/* loaded from: classes5.dex */
public interface InterfaceC8211b extends PaylibNativeTools {

    /* renamed from: b */
    public static final a f2347b = a.f2348a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.di.b$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f2348a = new a();

        /* renamed from: a */
        public final InterfaceC8211b m2209a(InterfaceC8134e paylibNativeDependenciesWrapper, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(paylibNativeDependenciesWrapper, "paylibNativeDependenciesWrapper");
            Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
            Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8211b interfaceC8211bM2193a = AbstractC8210a.m2186a().m2187a(paylibDomainTools).m2188a(paylibLoggingTools).m2190a(paylibNetworkTools).m2191a(paylibPaymentTools).m2192a(paylibPlatformTools).m2189a(paylibNativeDependenciesWrapper).m2193a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8211bM2193a, "builder()\n            .p…per)\n            .build()");
            return interfaceC8211bM2193a;
        }
    }
}
