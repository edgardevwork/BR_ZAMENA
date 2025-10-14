package com.sdkit.paylib.paylibdomain.impl.p028di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.di.b */
/* loaded from: classes6.dex */
public interface InterfaceC8050b extends PaylibDomainTools {

    /* renamed from: a */
    public static final a f1205a = a.f1206a;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f1206a = new a();

        /* renamed from: a */
        public final InterfaceC8050b m1516a(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(paylibDomainDependencies, "paylibDomainDependencies");
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8050b interfaceC8050bM1498a = AbstractC8049a.m1493a().m1494a(paylibDomainDependencies).m1495a(paylibLoggingTools).m1496a(paylibPaymentTools).m1497a(paylibPlatformTools).m1498a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8050bM1498a, "builder()\n            .p…ols)\n            .build()");
            return interfaceC8050bM1498a;
        }
    }
}
