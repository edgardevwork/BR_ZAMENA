package com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp;

import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.entity.BankOpenUnavailableException;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.DefaultPaymentException;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbpUrlReceived;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b */
/* loaded from: classes5.dex */
public final class C8143b implements InterfaceC8142a {

    /* renamed from: a */
    public final InvoicePaymentInteractor f1985a;

    /* renamed from: b */
    public final DeeplinkHandler f1986b;

    /* renamed from: c */
    public final PaylibDeeplinkFactory f1987c;

    /* renamed from: d */
    public final InterfaceC8238l f1988d;

    /* renamed from: e */
    public final PaymentMethodSelector f1989e;

    /* renamed from: f */
    public final PaylibLogger f1990f;

    /* renamed from: g */
    public String f1991g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public static final a f1992a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Библиотека находится в неконсистентном состоянии";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ReturnDeeplinkParseError f1993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReturnDeeplinkParseError returnDeeplinkParseError) {
            super(0);
            this.f1993a = returnDeeplinkParseError;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "retrieveDeeplink: deeplink parse error: " + this.f1993a.getMessage();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b$c */
    /* loaded from: classes6.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: a */
        public Object f1994a;

        /* renamed from: b */
        public Object f1995b;

        /* renamed from: c */
        public /* synthetic */ Object f1996c;

        /* renamed from: e */
        public int f1998e;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1996c = obj;
            this.f1998e |= Integer.MIN_VALUE;
            Object objMo2036a = C8143b.this.mo2036a((String) null, this);
            return objMo2036a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo2036a : Result.m15698boximpl(objMo2036a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ SbpUrlReceived f1999a;

        /* renamed from: b */
        public final /* synthetic */ String f2000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SbpUrlReceived sbpUrlReceived, String str) {
            super(0);
            this.f1999a = sbpUrlReceived;
            this.f2000b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("openBankApp urlState(");
            sb.append(this.f1999a);
            sb.append(") bankSchema(");
            return C8032c.m1430a(sb, this.f2000b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2001a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f2001a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("openBankApp deeplink("), this.f2001a, ')');
        }
    }

    public C8143b(InvoicePaymentInteractor invoicePaymentInteractor, DeeplinkHandler deeplinkHandler, PaylibDeeplinkFactory payDeeplinkFactory, InterfaceC8238l paylibStateManager, PaylibLoggerFactory loggerFactory, PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(payDeeplinkFactory, "payDeeplinkFactory");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f1985a = invoicePaymentInteractor;
        this.f1986b = deeplinkHandler;
        this.f1987c = payDeeplinkFactory;
        this.f1988d = paylibStateManager;
        this.f1989e = paymentMethodSelector;
        this.f1990f = loggerFactory.get("OpenBankAppInteractorImpl");
    }

    /* renamed from: a */
    public final Object m2038a(SbpUrlReceived sbpUrlReceived, String str) {
        PaylibLogger.DefaultImpls.d$default(this.f1990f, null, new d(sbpUrlReceived, str), 1, null);
        String string = Uri.parse(sbpUrlReceived.getFormUrl()).buildUpon().scheme(str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "parse(urlState.formUrl)\n…me(bankSchema).toString()");
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean zM2039a = m2039a(string);
            PaylibLogger.DefaultImpls.d$default(this.f1990f, null, new e(string), 1, null);
            if (zM2039a) {
                return Result.m15699constructorimpl(Unit.INSTANCE);
            }
            throw BankOpenUnavailableException.f2008a;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: b */
    public final String m2040b() {
        SourceState paymentMethodChangeState;
        AbstractC8237k abstractC8237kMo2351c = this.f1988d.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e.d) {
            paymentMethodChangeState = new SourceState.Invoice(((AbstractC8237k.e.d) abstractC8237kMo2351c).mo2309a().m2311a());
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
            AbstractC8237k.g.c cVar = (AbstractC8237k.g.c) abstractC8237kMo2351c;
            paymentMethodChangeState = new SourceState.Product(cVar.m2335b(), cVar.m2336c(), cVar.mo2322a().m2341c(), cVar.mo2322a().m2340b(), cVar.mo2322a().m2342d(), cVar.mo2322a().m2339a());
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.a.d) {
            AbstractC8237k.a.d dVar = (AbstractC8237k.a.d) abstractC8237kMo2351c;
            paymentMethodChangeState = new SourceState.Application(dVar.mo2298a().m2299a(), dVar.m2307b(), dVar.m2308c(), dVar.mo2298a().m2300b());
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f.c) {
            AbstractC8237k.f.c cVar2 = (AbstractC8237k.f.c) abstractC8237kMo2351c;
            paymentMethodChangeState = new SourceState.PaymentMethodChangeState(cVar2.m2319b(), cVar2.mo2312a().m2321a(), cVar2.m2320c());
        } else {
            paymentMethodChangeState = null;
        }
        if (paymentMethodChangeState == null) {
            PaylibLogger.DefaultImpls.e$default(this.f1990f, null, a.f1992a, 1, null);
        }
        if (paymentMethodChangeState == null) {
            return null;
        }
        String strProvideInitialReturnDeepLink = this.f1986b.provideInitialReturnDeepLink();
        if (!(true ^ StringsKt__StringsJVMKt.isBlank(strProvideInitialReturnDeepLink))) {
            strProvideInitialReturnDeepLink = null;
        }
        if (strProvideInitialReturnDeepLink == null) {
            return null;
        }
        try {
            return this.f1987c.createDeeplink(strProvideInitialReturnDeepLink, new DeeplinkDetails(paymentMethodChangeState, DeeplinkPaymentType.Sbp.INSTANCE));
        } catch (ReturnDeeplinkParseError e2) {
            this.f1990f.mo1701e(e2, new b(e2));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo2036a(String str, Continuation continuation) throws Throwable {
        c cVar;
        Object objMo15356confirmPaymentIoAF18A;
        String str2;
        C8143b c8143b;
        Object objM15699constructorimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f1998e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f1998e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        Object obj = cVar.f1996c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f1998e;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                this.f1991g = str;
                String strM2040b = m2040b();
                if (strM2040b == null) {
                    throw new PaylibIllegalStateException();
                }
                this.f1989e.selectPaymentMethod(new PaymentMethod.Sbp(strM2040b));
                InvoicePaymentInteractor invoicePaymentInteractor = this.f1985a;
                cVar.f1994a = str;
                cVar.f1995b = this;
                cVar.f1998e = 1;
                objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(cVar);
                if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                c8143b = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8143b = (C8143b) cVar.f1995b;
                str2 = (String) cVar.f1994a;
                ResultKt.throwOnFailure(obj);
                objMo15356confirmPaymentIoAF18A = ((Result) obj).getValue();
            }
            if (Result.m15706isSuccessimpl(objMo15356confirmPaymentIoAF18A)) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    PaymentAction paymentAction = ((ConfirmPaymentResult) objMo15356confirmPaymentIoAF18A).getPaymentAction();
                    SbpUrlReceived sbpUrlReceived = paymentAction instanceof SbpUrlReceived ? (SbpUrlReceived) paymentAction : null;
                    if (sbpUrlReceived == null) {
                        throw DefaultPaymentException.f2386a;
                    }
                    Object objM2038a = c8143b.m2038a(sbpUrlReceived, str2);
                    Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2038a);
                    if (thM15702exceptionOrNullimpl != null) {
                        throw thM15702exceptionOrNullimpl;
                    }
                    objM15699constructorimpl = Result.m15699constructorimpl(Result.m15698boximpl(objM2038a));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                objM15699constructorimpl = Result.m15699constructorimpl(objMo15356confirmPaymentIoAF18A);
            }
            Throwable thM15702exceptionOrNullimpl2 = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
            if (thM15702exceptionOrNullimpl2 == null) {
                return Result.m15699constructorimpl(Unit.INSTANCE);
            }
            throw thM15702exceptionOrNullimpl2;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m15699constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a
    /* renamed from: a */
    public String mo2037a() {
        return this.f1991g;
    }

    /* renamed from: a */
    public final boolean m2039a(String str) {
        return this.f1986b.openDeeplink(str, null);
    }
}
