package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies;
import com.sdkit.paylib.paylibsdk.client.PaylibSdk;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8605c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.b */
/* loaded from: classes5.dex */
public interface InterfaceC8595b {

    /* renamed from: a */
    public static final a f5841a = a.f5842a;

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f5842a = new a();

        /* renamed from: a */
        public final InterfaceC8595b m4678a(InterfaceC8605c externalPaylibNetworkToolsFactoryProvider, PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingDependencies paylibLoggingDependencies, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformDependencies paylibPlatformDependencies, PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            Intrinsics.checkNotNullParameter(externalPaylibNetworkToolsFactoryProvider, "externalPaylibNetworkToolsFactoryProvider");
            Intrinsics.checkNotNullParameter(paylibDomainDependencies, "paylibDomainDependencies");
            Intrinsics.checkNotNullParameter(paylibLoggingDependencies, "paylibLoggingDependencies");
            Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
            Intrinsics.checkNotNullParameter(paylibPlatformDependencies, "paylibPlatformDependencies");
            Intrinsics.checkNotNullParameter(paylibNativePayMethodsDependencies, "paylibNativePayMethodsDependencies");
            InterfaceC8595b interfaceC8595bM4674a = AbstractC8594a.m4667a().m4673a(externalPaylibNetworkToolsFactoryProvider).m4668a(paylibDomainDependencies).m4669a(paylibLoggingDependencies).m4671a(paylibPaymentDependencies).m4672a(paylibPlatformDependencies).m4670a(paylibNativePayMethodsDependencies).m4674a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8595bM4674a, "builder()\n            .e…ies)\n            .build()");
            return interfaceC8595bM4674a;
        }
    }

    /* renamed from: a */
    PaylibSdk mo4675a();
}
