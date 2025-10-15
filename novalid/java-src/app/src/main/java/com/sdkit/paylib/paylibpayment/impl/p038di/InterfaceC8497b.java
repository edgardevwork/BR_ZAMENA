package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.b */
/* loaded from: classes6.dex */
public interface InterfaceC8497b extends PaylibPaymentTools {

    /* renamed from: a */
    public static final a f4818a = a.f4819a;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.b$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f4819a = new a();

        /* renamed from: a */
        public final InterfaceC8497b m3923a(PaylibPaymentDependencies paylibPaymentDependencies, PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
            Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8497b interfaceC8497bM3912a = AbstractC8496a.m3907a().m3909a(paylibNetworkTools).m3908a(paylibLoggingTools).m3910a(paylibPaymentDependencies).m3911a(paylibPlatformTools).m3912a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8497bM3912a, "builder()\n            .p…ols)\n            .build()");
            return interfaceC8497bM3912a;
        }
    }
}
