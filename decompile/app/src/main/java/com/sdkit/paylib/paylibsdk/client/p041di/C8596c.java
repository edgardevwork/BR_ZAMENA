package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies;
import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainToolsFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingToolsFactory;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativeToolsFactory;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibnetwork.impl.p036di.PaylibNetworkToolsFactory;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentToolsFactory;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformToolsFactory;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8604b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.c */
/* loaded from: classes5.dex */
public final class C8596c {
    /* renamed from: a */
    public final PaylibDomainTools m4679a(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibDomainDependencies, "paylibDomainDependencies");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return PaylibDomainToolsFactory.create(paylibDomainDependencies, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools);
    }

    /* renamed from: a */
    public final PaylibLoggingTools m4680a(PaylibLoggingDependencies paylibLoggingDependencies) {
        Intrinsics.checkNotNullParameter(paylibLoggingDependencies, "paylibLoggingDependencies");
        return PaylibLoggingToolsFactory.create(paylibLoggingDependencies);
    }

    /* renamed from: a */
    public final PaylibNativeTools m4681a(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibNativePayMethodsDependencies, "paylibNativePayMethodsDependencies");
        Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
        Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return PaylibNativeToolsFactory.usingOwnActivity(paylibNativePayMethodsDependencies, paylibDomainTools, paylibLoggingTools, paylibNetworkTools, paylibPaymentTools, paylibPlatformTools);
    }

    /* renamed from: a */
    public final PaylibNetworkTools m4682a(InterfaceC8604b interfaceC8604b, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return interfaceC8604b != null ? interfaceC8604b.mo4703a(paylibLoggingTools, paylibPlatformTools) : PaylibNetworkToolsFactory.create(paylibLoggingTools, paylibPlatformTools);
    }

    /* renamed from: a */
    public final PaylibPaymentTools m4683a(PaylibPaymentDependencies paylibPaymentDependencies, PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
        Intrinsics.checkNotNullParameter(paylibNetworkTools, "paylibNetworkTools");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return PaylibPaymentToolsFactory.create(paylibPaymentDependencies, paylibNetworkTools, paylibLoggingTools, paylibPlatformTools);
    }

    /* renamed from: a */
    public final PaylibPlatformTools m4684a(PaylibPlatformDependencies paylibPlatformDependencies) {
        Intrinsics.checkNotNullParameter(paylibPlatformDependencies, "paylibPlatformDependencies");
        return PaylibPlatformToolsFactory.create(paylibPlatformDependencies);
    }
}
