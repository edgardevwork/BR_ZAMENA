package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import androidx.fragment.app.FragmentFactory;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.p034di.C8212c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8252f;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.b */
/* loaded from: classes8.dex */
public interface InterfaceC8254b {

    /* renamed from: a */
    public static final a f2708a = a.f2709a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f2709a = new a();

        /* renamed from: a */
        public final InterfaceC8254b m2473a(C8212c api, PaylibPaymentTools paylibPaymentTools, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(paylibPaymentTools, "paylibPaymentTools");
            Intrinsics.checkNotNullParameter(paylibDomainTools, "paylibDomainTools");
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8254b interfaceC8254bM2435a = AbstractC8253a.m2429a().m2432a(api).m2433a(paylibPaymentTools).m2430a(paylibDomainTools).m2431a(paylibLoggingTools).m2434a(paylibPlatformTools).m2435a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8254bM2435a, "builder()\n              …\n                .build()");
            return interfaceC8254bM2435a;
        }
    }

    /* renamed from: a */
    InternalPaylibRouter mo2436a();

    /* renamed from: b */
    C8252f mo2438b();

    /* renamed from: c */
    C8241o mo2439c();

    /* renamed from: d */
    InterfaceC8131b mo2440d();

    /* renamed from: e */
    C8103b mo2441e();

    /* renamed from: f */
    FragmentFactory mo2442f();

    PaylibHostRouter getHostRouter();

    PaylibLoggerFactory getLoggerFactory();
}
