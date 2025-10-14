package com.sdkit.paylib.paylibnative.p033ui.launcher;

import android.app.Activity;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibPurchaseApplicationParams;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibPurchaseParams;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.p034di.C8212c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8242a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c */
/* loaded from: classes5.dex */
public final class C8225c implements PaylibNativeRouter, PaylibNativeDeeplinkRouter {

    /* renamed from: a */
    public final InternalLauncher f2407a;

    /* renamed from: b */
    public final FinishCodeReceiver f2408b;

    /* renamed from: c */
    public final InterfaceC8238l f2409c;

    /* renamed from: d */
    public final C8212c f2410d;

    /* renamed from: e */
    public final PaylibDeeplinkParser f2411e;

    /* renamed from: f */
    public final PaylibLogger f2412f;

    /* renamed from: g */
    public final g f2413g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2414a;

        /* renamed from: b */
        public final /* synthetic */ C8225c f2415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C8225c c8225c) {
            super(0);
            this.f2414a = str;
            this.f2415b = c8225c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "changePaymentMethod: purchaseId(\"" + this.f2414a + "\") via " + Reflection.getOrCreateKotlinClass(this.f2415b.f2407a.getClass()).getSimpleName();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2416a;

        /* renamed from: b */
        public final /* synthetic */ C8225c f2417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C8225c c8225c) {
            super(0);
            this.f2416a = str;
            this.f2417b = c8225c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "finishPaylib " + this.f2416a + " via " + Reflection.getOrCreateKotlinClass(this.f2417b.f2407a.getClass()).getSimpleName();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ReturnDeeplinkParseError f2418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReturnDeeplinkParseError returnDeeplinkParseError) {
            super(0);
            this.f2418a = returnDeeplinkParseError;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "При парсинге диплинка произошла ошибка " + this.f2418a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2419a;

        /* renamed from: b */
        public final /* synthetic */ C8225c f2420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C8225c c8225c) {
            super(0);
            this.f2419a = str;
            this.f2420b = c8225c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib invoiceId(\"" + this.f2419a + "\") via " + Reflection.getOrCreateKotlinClass(this.f2420b.f2407a.getClass()).getSimpleName();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$e */
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaylibPurchaseApplicationParams f2421a;

        /* renamed from: b */
        public final /* synthetic */ C8225c f2422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PaylibPurchaseApplicationParams paylibPurchaseApplicationParams, C8225c c8225c) {
            super(0);
            this.f2421a = paylibPurchaseApplicationParams;
            this.f2422b = c8225c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "purchaseApplication: appId(\"" + this.f2421a.getApplicationId() + "\"), devPayload(\"" + this.f2421a.getDeveloperPayload() + "\") via " + Reflection.getOrCreateKotlinClass(this.f2422b.f2407a.getClass()).getSimpleName();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$f */
    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaylibPurchaseParams f2423a;

        /* renamed from: b */
        public final /* synthetic */ C8225c f2424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PaylibPurchaseParams paylibPurchaseParams, C8225c c8225c) {
            super(0);
            this.f2423a = paylibPurchaseParams;
            this.f2424b = c8225c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "purchaseProduct: productId(\"" + this.f2423a.getProductId() + "\"), orderId(\"" + this.f2423a.getOrderId() + "\"), quantity(\"" + this.f2423a.getQuantity() + "\") developerPayload(\"" + this.f2423a.getDeveloperPayload() + "\"), via " + Reflection.getOrCreateKotlinClass(this.f2424b.f2407a.getClass()).getSimpleName();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.c$g */
    public static final class g implements C8241o.a {
        public g() {
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o.a
        /* renamed from: a */
        public void mo2263a() {
            C8225c.this.m2254a();
        }
    }

    public C8225c(InternalLauncher internalLauncher, C8241o rootFragmentListenerHolder, FinishCodeReceiver finishCodeReceiver, InterfaceC8238l paylibStateManager, C8212c paylibNativeInternalApi, PaylibLoggerFactory loggerFactory, PaylibDeeplinkParser paylibDeeplinkParser) {
        Intrinsics.checkNotNullParameter(internalLauncher, "internalLauncher");
        Intrinsics.checkNotNullParameter(rootFragmentListenerHolder, "rootFragmentListenerHolder");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paylibNativeInternalApi, "paylibNativeInternalApi");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(paylibDeeplinkParser, "paylibDeeplinkParser");
        this.f2407a = internalLauncher;
        this.f2408b = finishCodeReceiver;
        this.f2409c = paylibStateManager;
        this.f2410d = paylibNativeInternalApi;
        this.f2411e = paylibDeeplinkParser;
        this.f2412f = loggerFactory.get("PaylibNativeRouterLauncherImpl");
        g gVar = new g();
        this.f2413g = gVar;
        m2256b();
        rootFragmentListenerHolder.m2361a(gVar);
    }

    /* renamed from: b */
    public final void m2256b() {
        C8242a.f2529a.m2363a(this.f2410d);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void changePaymentMethod(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        changePaymentMethod(purchaseId, null);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter
    public void finishPaylib(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        finishPaylib(deeplink, null);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void launchPaylib(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        PaylibLogger.DefaultImpls.i$default(this.f2412f, null, new d(invoiceId, this), 1, null);
        this.f2409c.mo2346a(new AbstractC8237k.e.c(invoiceId));
        m2255a((Activity) null);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseApplication(PaylibPurchaseApplicationParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        purchaseApplication(params, null);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseProduct(PaylibPurchaseParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        purchaseProduct(params, null);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public Flow resultObserver() {
        return this.f2408b.resultObserver();
    }

    /* renamed from: a */
    public final void m2254a() {
        C8242a.f2529a.m2364b();
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void changePaymentMethod(String purchaseId, Activity activity) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        PaylibLogger.DefaultImpls.i$default(this.f2412f, null, new a(purchaseId, this), 1, null);
        this.f2409c.mo2346a(new AbstractC8237k.f.d(purchaseId));
        m2255a(activity);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter
    public void finishPaylib(String deeplink, Activity activity) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        PaylibLogger.DefaultImpls.i$default(this.f2412f, null, new b(deeplink, this), 1, null);
        try {
            this.f2409c.mo2345a(this.f2411e.parseFinishDeeplink(deeplink));
            m2255a(activity);
        } catch (ReturnDeeplinkParseError e2) {
            PaylibLogger.DefaultImpls.e$default(this.f2412f, null, new c(e2), 1, null);
        }
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseApplication(PaylibPurchaseApplicationParams params, Activity activity) {
        Intrinsics.checkNotNullParameter(params, "params");
        PaylibLogger.DefaultImpls.i$default(this.f2412f, null, new e(params, this), 1, null);
        this.f2409c.mo2346a(new AbstractC8237k.a.C11912a(params.getApplicationId(), params.getDeveloperPayload()));
        m2255a(activity);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseProduct(PaylibPurchaseParams params, Activity activity) {
        Intrinsics.checkNotNullParameter(params, "params");
        PaylibLogger.DefaultImpls.i$default(this.f2412f, null, new f(params, this), 1, null);
        this.f2409c.mo2346a(new AbstractC8237k.g.d(params.getProductId(), params.getOrderId(), params.getQuantity(), params.getDeveloperPayload()));
        m2255a(activity);
    }

    /* renamed from: a */
    public final void m2255a(Activity activity) {
        m2256b();
        this.f2407a.mo2244a(activity);
    }
}
