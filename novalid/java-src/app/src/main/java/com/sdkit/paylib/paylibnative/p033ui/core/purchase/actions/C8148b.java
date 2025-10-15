package com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.core.common.AbstractC8136a;
import com.sdkit.paylib.paylibnative.p033ui.core.common.GmarktException;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.C8153a;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8158a;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8160c;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8161d;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.InterfaceC8159b;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.entity.applications.ApplicationInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.CreatedPurchaseInfo;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.BuyApplicationResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.CreatePurchaseResponse;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.b */
/* loaded from: classes5.dex */
public final class C8148b implements InterfaceC8147a {

    /* renamed from: a */
    public final C8153a f2012a;

    /* renamed from: b */
    public final PurchasesNetworkClient f2013b;

    /* renamed from: c */
    public final ApplicationsNetworkClient f2014c;

    /* renamed from: d */
    public final PaylibLogger f2015d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public static final a f2016a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateAction";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f2017a;

        /* renamed from: c */
        public int f2019c;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2017a = obj;
            this.f2019c |= Integer.MIN_VALUE;
            return C8148b.this.m2057a(null, null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.b$c */
    /* loaded from: classes6.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f2020a;

        /* renamed from: c */
        public int f2022c;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2020a = obj;
            this.f2022c |= Integer.MIN_VALUE;
            return C8148b.this.m2056a(null, null, null, null, this);
        }
    }

    public C8148b(C8153a productPayloadProvider, PurchasesNetworkClient purchasesNetworkClient, ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(productPayloadProvider, "productPayloadProvider");
        Intrinsics.checkNotNullParameter(purchasesNetworkClient, "purchasesNetworkClient");
        Intrinsics.checkNotNullParameter(applicationsNetworkClient, "applicationsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2012a = productPayloadProvider;
        this.f2013b = purchasesNetworkClient;
        this.f2014c = applicationsNetworkClient;
        this.f2015d = loggerFactory.get("CreatePurchaseActionImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2056a(String str, String str2, Integer num, String str3, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f2022c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f2022c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        c cVar2 = cVar;
        Object objCreatePurchase = cVar2.f2020a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar2.f2022c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreatePurchase);
            PurchasesNetworkClient purchasesNetworkClient = this.f2013b;
            cVar2.f2022c = 1;
            objCreatePurchase = purchasesNetworkClient.createPurchase(str, str2, num, str3, cVar2);
            if (objCreatePurchase == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreatePurchase);
        }
        CreatePurchaseResponse createPurchaseResponse = (CreatePurchaseResponse) objCreatePurchase;
        CreatedPurchaseInfo purchaseInfo = createPurchaseResponse.getPurchaseInfo();
        if (purchaseInfo != null) {
            return new C8161d(C8161d.a.PRODUCT, purchaseInfo.getPurchaseId(), purchaseInfo.getInvoiceId());
        }
        throw AbstractC8136a.m2021a(createPurchaseResponse, "purchaseInfo is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2057a(String str, String str2, Continuation continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f2019c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f2019c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objBuyApplication = bVar.f2017a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f2019c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBuyApplication);
            ApplicationsNetworkClient applicationsNetworkClient = this.f2014c;
            bVar.f2019c = 1;
            objBuyApplication = applicationsNetworkClient.buyApplication(str, str2, bVar);
            if (objBuyApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objBuyApplication);
        }
        BuyApplicationResponse buyApplicationResponse = (BuyApplicationResponse) objBuyApplication;
        ApplicationInfo appInfo = buyApplicationResponse.getAppInfo();
        if (appInfo == null) {
            throw AbstractC8136a.m2021a(buyApplicationResponse, "appInfo is null");
        }
        C8161d.a aVar = C8161d.a.APPLICATION;
        String purchaseId = appInfo.getPurchaseId();
        if (purchaseId == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String invoiceId = appInfo.getInvoiceId();
        if (invoiceId != null) {
            return new C8161d(aVar, purchaseId, invoiceId);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.core.common.InterfaceC8139d
    /* renamed from: a */
    public Object mo2031a(Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f2015d, null, a.f2016a, 1, null);
        InterfaceC8159b interfaceC8159bM2069a = this.f2012a.m2069a();
        if (interfaceC8159bM2069a instanceof C8160c) {
            C8160c c8160c = (C8160c) interfaceC8159bM2069a;
            return m2056a(c8160c.m2080c(), c8160c.m2079b(), c8160c.m2081d(), c8160c.m2078a(), continuation);
        }
        if (!(interfaceC8159bM2069a instanceof C8158a)) {
            throw new GmarktException("invalid gmarktPayload.");
        }
        C8158a c8158a = (C8158a) interfaceC8159bM2069a;
        return m2057a(c8158a.m2076a(), c8158a.m2077b(), continuation);
    }
}
