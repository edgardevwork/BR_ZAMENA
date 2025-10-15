package com.sdkit.paylib.paylibnative.sbol;

import android.app.Activity;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibPurchaseApplicationParams;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibPurchaseParams;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibSbolPayReturnDeepLinkProvider;
import com.sdkit.paylib.paylibnative.sbol.analytics.AbstractC8083b;
import com.sdkit.paylib.paylibnative.sbol.analytics.EnumC8082a;
import com.sdkit.paylib.paylibnative.sbol.domain.C8087a;
import com.sdkit.paylib.paylibnative.sbol.utils.AbstractC8088a;
import com.sdkit.paylib.paylibnative.sbol.utils.AbstractC8089b;
import com.sdkit.paylib.paylibpayment.api.domain.entity.MobileNumberVerificationInfoReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethodRequired;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWithLoyaltyCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbolpayDeeplinkCreated;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbpUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.TPayUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WebPaymentLinkCreated;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.a */
/* loaded from: classes5.dex */
public final class C8081a implements PaylibNativeRouter, PaylibNativeDeeplinkRouter {

    /* renamed from: a */
    public final InvoiceHolder f1651a;

    /* renamed from: b */
    public final InvoicePaymentInteractor f1652b;

    /* renamed from: c */
    public final PaylibSbolPayReturnDeepLinkProvider f1653c;

    /* renamed from: d */
    public final CustomPaylibAnalytics f1654d;

    /* renamed from: e */
    public final PaylibDeeplinkParser f1655e;

    /* renamed from: f */
    public final PaylibDeeplinkFactory f1656f;

    /* renamed from: g */
    public final PaymentMethodSelector f1657g;

    /* renamed from: h */
    public final PaylibLogger f1658h;

    /* renamed from: i */
    public final CoroutineScope f1659i;

    /* renamed from: j */
    public MutableStateFlow f1660j;

    /* renamed from: k */
    public final C8087a f1661k;

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1662a;

        static {
            int[] iArr = new int[C8087a.a.values().length];
            try {
                iArr[C8087a.a.STORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8087a.a.THE_VERY_SAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8087a.a.BAD_INVOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1662a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f1663a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: change payment method";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f1664a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("finishPaylib("), this.f1664a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f1665a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("launchPaylib: invoiceId("), this.f1665a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public static final e f1666a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: SbolPay deeplink is turned off. See PaylibSbolPayReturnDeepLinkProvider for details.";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1667a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8081a.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15356confirmPaymentIoAF18A;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1667a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoicePaymentInteractor invoicePaymentInteractor = C8081a.this.f1652b;
                this.f1667a = 1;
                objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(this);
                if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15356confirmPaymentIoAF18A = ((Result) obj).getValue();
            }
            C8081a c8081a = C8081a.this;
            if (Result.m15706isSuccessimpl(objMo15356confirmPaymentIoAF18A)) {
                c8081a.m1730a((ConfirmPaymentResult) objMo15356confirmPaymentIoAF18A);
            }
            C8081a c8081a2 = C8081a.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15356confirmPaymentIoAF18A);
            if (thM15702exceptionOrNullimpl != null) {
                c8081a2.m1732a(thM15702exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$g */
    /* loaded from: classes6.dex */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f1669a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: Already in progress";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$h */
    /* loaded from: classes6.dex */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public static final h f1670a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: Bad invoice!";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$i */
    /* loaded from: classes6.dex */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: a */
        public static final i f1671a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onPayScenarioFailed()";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$j */
    /* loaded from: classes6.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public static final j f1672a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onPaymentError";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$k */
    /* loaded from: classes6.dex */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ConfirmPaymentResult f1673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ConfirmPaymentResult confirmPaymentResult) {
            super(0);
            this.f1673a = confirmPaymentResult;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onPaymentSuccess(" + this.f1673a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$l */
    /* loaded from: classes6.dex */
    public static final class l extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ SbolPayFinishState f1674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SbolPayFinishState sbolPayFinishState) {
            super(0);
            this.f1674a = sbolPayFinishState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onReturnDeeplinkReceived(state: " + this.f1674a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$m */
    /* loaded from: classes6.dex */
    public static final class m extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.f1675a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("openDeeplink(deeplink: "), this.f1675a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$n */
    /* loaded from: classes6.dex */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public static final n f1676a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: purchase application";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$o */
    /* loaded from: classes6.dex */
    public static final class o extends Lambda implements Function0 {

        /* renamed from: a */
        public static final o f1677a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "launchPaylib: purchase product";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.a$p */
    /* loaded from: classes6.dex */
    public static final class p extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ReturnDeeplinkParseError f1678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ReturnDeeplinkParseError returnDeeplinkParseError) {
            super(0);
            this.f1678a = returnDeeplinkParseError;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "retrieveDeeplink: deeplink parse error: " + this.f1678a.getMessage();
        }
    }

    public C8081a(InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, CoroutineDispatchers coroutineDispatchers, PaylibSbolPayReturnDeepLinkProvider returnDeepLinkProvider, CustomPaylibAnalytics analytics, PaylibLoggerFactory loggerFactory, PaylibDeeplinkParser deeplinkParser, PaylibDeeplinkFactory paylibDeeplinkFactory, PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(returnDeepLinkProvider, "returnDeepLinkProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(paylibDeeplinkFactory, "paylibDeeplinkFactory");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f1651a = invoiceHolder;
        this.f1652b = invoicePaymentInteractor;
        this.f1653c = returnDeepLinkProvider;
        this.f1654d = analytics;
        this.f1655e = deeplinkParser;
        this.f1656f = paylibDeeplinkFactory;
        this.f1657g = paymentMethodSelector;
        this.f1658h = loggerFactory.get("SbolPaylibNativeRouterImpl");
        this.f1659i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f1660j = StateFlowKt.MutableStateFlow(null);
        this.f1661k = new C8087a();
    }

    /* renamed from: b */
    public final void m1733b() {
        PaylibLogger.DefaultImpls.d$default(this.f1658h, null, i.f1671a, 1, null);
        m1728a();
        AbstractC8083b.m1752a(this.f1654d, EnumC8082a.SMARTPAY_PAYMENTS_FAILED);
        m1729a(SbolPayFinishState.FAILED);
    }

    /* renamed from: c */
    public final String m1735c() {
        String strProvideInitialReturnDeepLink = this.f1653c.provideInitialReturnDeepLink();
        String strCreateDeeplink = null;
        if (!(!StringsKt__StringsJVMKt.isBlank(strProvideInitialReturnDeepLink))) {
            strProvideInitialReturnDeepLink = null;
        }
        if (strProvideInitialReturnDeepLink != null) {
            try {
                strCreateDeeplink = this.f1656f.createDeeplink(strProvideInitialReturnDeepLink, new DeeplinkDetails(null, DeeplinkPaymentType.Sbolpay.INSTANCE));
            } catch (ReturnDeeplinkParseError e2) {
                this.f1658h.mo1701e(e2, new p(e2));
            }
            if (strCreateDeeplink != null) {
                return strCreateDeeplink;
            }
        }
        return this.f1653c.provideReturnDeepLink();
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
        PaylibLogger paylibLogger;
        Function0 function0;
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        PaylibLogger.DefaultImpls.i$default(this.f1658h, null, new d(invoiceId), 1, null);
        int i2 = a.f1662a[this.f1661k.m1775a(invoiceId).ordinal()];
        if (i2 == 1) {
            AbstractC8083b.m1752a(this.f1654d, EnumC8082a.SMARTPAY_PAYMENTS_OPEN);
            if (this.f1653c.isSbolPayDeepLinkSupported()) {
                this.f1651a.setInvoiceId(invoiceId);
                this.f1657g.selectPaymentMethod(new PaymentMethod.ViaSbolPayLink(m1735c()));
                BuildersKt__Builders_commonKt.launch$default(this.f1659i, null, null, new f(null), 3, null);
                return;
            }
            paylibLogger = this.f1658h;
            function0 = e.f1666a;
        } else if (i2 == 2) {
            PaylibLogger.DefaultImpls.e$default(this.f1658h, null, g.f1669a, 1, null);
            return;
        } else {
            if (i2 != 3) {
                return;
            }
            AbstractC8083b.m1752a(this.f1654d, EnumC8082a.SMARTPAY_PAYMENTS_OPEN);
            paylibLogger = this.f1658h;
            function0 = h.f1670a;
        }
        PaylibLogger.DefaultImpls.e$default(paylibLogger, null, function0, 1, null);
        m1733b();
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
        return FlowKt.filterNotNull(this.f1660j);
    }

    /* renamed from: a */
    public final void m1728a() {
        JobKt__JobKt.cancelChildren$default(this.f1659i.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: b */
    public final void m1734b(SbolPayFinishState sbolPayFinishState) {
        PaylibLogger.DefaultImpls.d$default(this.f1658h, null, new l(sbolPayFinishState), 1, null);
        m1728a();
        AbstractC8083b.m1752a(this.f1654d, EnumC8082a.SMARTPAY_PAYMENTS_CLOSED);
        m1729a(sbolPayFinishState);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void changePaymentMethod(String purchaseId, Activity activity) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        PaylibLogger.DefaultImpls.i$default(this.f1658h, null, b.f1663a, 1, null);
        m1733b();
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter
    public void finishPaylib(String deeplink, Activity activity) {
        SbolPayFinishState state;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        PaylibLogger.DefaultImpls.i$default(this.f1658h, null, new c(deeplink), 1, null);
        FinishReason finishDeeplink = this.f1655e.parseFinishDeeplink(deeplink);
        if (finishDeeplink instanceof FinishReason.SbpPayCompletedWithState) {
            m1733b();
        } else {
            if (finishDeeplink instanceof FinishReason.SbolPayCompletedWithState) {
                state = ((FinishReason.SbolPayCompletedWithState) finishDeeplink).getState();
            } else if (finishDeeplink instanceof FinishReason.SbolPayCompleted) {
                state = ((FinishReason.SbolPayCompleted) finishDeeplink).getState();
            } else {
                if (!(finishDeeplink instanceof FinishReason.TPayCompletedWithState)) {
                    throw new NoWhenBranchMatchedException();
                }
                m1733b();
            }
            m1734b(state);
        }
        AbstractC8089b.m1780a(Unit.INSTANCE);
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseApplication(PaylibPurchaseApplicationParams params, Activity activity) {
        Intrinsics.checkNotNullParameter(params, "params");
        PaylibLogger.DefaultImpls.i$default(this.f1658h, null, n.f1676a, 1, null);
        m1733b();
    }

    @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter
    public void purchaseProduct(PaylibPurchaseParams params, Activity activity) {
        Intrinsics.checkNotNullParameter(params, "params");
        PaylibLogger.DefaultImpls.i$default(this.f1658h, null, o.f1677a, 1, null);
        m1733b();
    }

    /* renamed from: a */
    public final void m1729a(SbolPayFinishState sbolPayFinishState) {
        String strM1776a = this.f1661k.m1776a();
        this.f1660j.tryEmit(new PaylibResultPayment.Invoice((strM1776a == null || StringsKt__StringsJVMKt.isBlank(strM1776a)) ? AbstractC8088a.m1779a(strM1776a) : AbstractC8088a.m1778a(sbolPayFinishState, strM1776a)));
        this.f1660j = StateFlowKt.MutableStateFlow(null);
    }

    /* renamed from: a */
    public final void m1730a(ConfirmPaymentResult confirmPaymentResult) {
        PaylibLogger.DefaultImpls.d$default(this.f1658h, null, new k(confirmPaymentResult), 1, null);
        PaymentAction paymentAction = confirmPaymentResult.getPaymentAction();
        if (paymentAction instanceof SbolpayDeeplinkCreated) {
            m1731a(((SbolpayDeeplinkCreated) paymentAction).getDeeplink());
            return;
        }
        if ((paymentAction instanceof PaymentMethodRequired) || (paymentAction instanceof WebPaymentLinkCreated) || (paymentAction instanceof SbpUrlReceived) || (paymentAction instanceof MobileNumberVerificationInfoReceived) || (paymentAction instanceof TPayUrlReceived)) {
            return;
        }
        if (Intrinsics.areEqual(paymentAction, PaymentCompleted.INSTANCE) || Intrinsics.areEqual(paymentAction, PaymentWithLoyaltyCompleted.INSTANCE)) {
            m1733b();
        }
    }

    /* renamed from: a */
    public final void m1731a(String str) {
        PaylibLogger.DefaultImpls.d$default(this.f1658h, null, new m(str), 1, null);
        m1728a();
        AbstractC8083b.m1752a(this.f1654d, EnumC8082a.SMARTPAY_PAYMENTS_CALLED_DEEPLINK);
        this.f1653c.openSbolPayDeepLink(str);
    }

    /* renamed from: a */
    public final void m1732a(Throwable th) {
        this.f1658h.mo1700d(th, j.f1672a);
        m1733b();
    }
}
