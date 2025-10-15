package com.sdkit.paylib.paylibdomain.impl.invoice;

import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibdomain.impl.entity.EnumC8053a;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8055a;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.MobileNumberVerificationInfoReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWithLoyaltyCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbolpayDeeplinkCreated;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbpUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.TPayUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WebPaymentLinkCreated;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.NoInvoiceIdError;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.WebPaymentLinkIsNullOrEmptyError;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c */
/* loaded from: classes6.dex */
public final class C8059c implements InvoicePaymentInteractor {

    /* renamed from: a */
    public final InvoiceHolder f1286a;

    /* renamed from: b */
    public final InvoiceNetworkClient f1287b;

    /* renamed from: c */
    public final CoroutineDispatchers f1288c;

    /* renamed from: d */
    public final PaymentMethodSelector f1289d;

    /* renamed from: e */
    public final PaylibLogger f1290e;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f1291a;

        /* renamed from: b */
        public Object f1292b;

        /* renamed from: c */
        public /* synthetic */ Object f1293c;

        /* renamed from: e */
        public int f1295e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1293c = obj;
            this.f1295e |= Integer.MIN_VALUE;
            Object objMo15356confirmPaymentIoAF18A = C8059c.this.mo15356confirmPaymentIoAF18A(this);
            return objMo15356confirmPaymentIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15356confirmPaymentIoAF18A : Result.m15698boximpl(objMo15356confirmPaymentIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f1296a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "confirmPayment() start...";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f1297a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "confirmPayment() finished!";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1298a;

        /* renamed from: c */
        public final /* synthetic */ String f1300c;

        /* renamed from: d */
        public final /* synthetic */ PaymentMethod f1301d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, PaymentMethod paymentMethod, Continuation continuation) {
            super(2, continuation);
            this.f1300c = str;
            this.f1301d = paymentMethod;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8059c.this.new d(this.f1300c, this.f1301d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1298a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8059c.this.f1287b;
                String str = this.f1300c;
                PaymentMethod paymentMethod = this.f1301d;
                this.f1298a = 1;
                obj = invoiceNetworkClient.postInvoice(str, paymentMethod, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public Object f1302a;

        /* renamed from: b */
        public /* synthetic */ Object f1303b;

        /* renamed from: d */
        public int f1305d;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1303b = obj;
            this.f1305d |= Integer.MIN_VALUE;
            Object objMo15357getPaymentStatusForExecutedInvoicegIAlus = C8059c.this.mo15357getPaymentStatusForExecutedInvoicegIAlus(null, this);
            return objMo15357getPaymentStatusForExecutedInvoicegIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15357getPaymentStatusForExecutedInvoicegIAlus : Result.m15698boximpl(objMo15357getPaymentStatusForExecutedInvoicegIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Long f1306a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Long l) {
            super(0);
            this.f1306a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPaymentStatusForExecutedInvoice(waitSec: " + this.f1306a + ") starting...";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaymentStatusPayload f1307a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PaymentStatusPayload paymentStatusPayload) {
            super(0);
            this.f1307a = paymentStatusPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getInvoiceStatus() completed " + this.f1307a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.c$h */
    /* loaded from: classes5.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1308a;

        /* renamed from: c */
        public final /* synthetic */ String f1310c;

        /* renamed from: d */
        public final /* synthetic */ Long f1311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Long l, Continuation continuation) {
            super(2, continuation);
            this.f1310c = str;
            this.f1311d = l;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8059c.this.new h(this.f1310c, this.f1311d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1308a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8059c.this.f1287b;
                String str = this.f1310c;
                String strM1524b = EnumC8053a.EXECUTED.m1524b();
                Long l = this.f1311d;
                this.f1308a = 1;
                obj = invoiceNetworkClient.getInvoice(str, strM1524b, l, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public C8059c(InvoiceHolder invoiceHolder, InvoiceNetworkClient invoiceNetworkClient, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory loggerFactory, PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoiceNetworkClient, "invoiceNetworkClient");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f1286a = invoiceHolder;
        this.f1287b = invoiceNetworkClient;
        this.f1288c = coroutineDispatchers;
        this.f1289d = paymentMethodSelector;
        this.f1290e = loggerFactory.get("InvoicePaymentInteractorImpl");
    }

    /* renamed from: a */
    public final PaymentAction m1577a(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.InsufficientFundsError, PayLibServiceFailure.PaymentFailure.PaymentError {
        ErrorModel error = postInvoiceResponse.getError();
        Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 501) {
            throw AbstractC8055a.m1538b(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
        if (numValueOf == null || numValueOf.intValue() != 0) {
            throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
        return PaymentCompleted.INSTANCE;
    }

    /* renamed from: b */
    public final PaymentAction m1578b(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.PaymentError {
        if (postInvoiceResponse.getSmsConfirmConstraints() != null) {
            return MobileNumberVerificationInfoReceived.INSTANCE;
        }
        throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
    }

    /* renamed from: c */
    public final PaymentAction m1579c(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.PaymentError {
        String sbolPayDeepLink = postInvoiceResponse.getSbolPayDeepLink();
        if (sbolPayDeepLink != null) {
            return new SbolpayDeeplinkCreated(sbolPayDeepLink);
        }
        throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor
    /* renamed from: confirmPayment-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15356confirmPaymentIoAF18A(Continuation continuation) throws Throwable {
        a aVar;
        C8059c c8059c;
        PaymentMethod paymentMethod;
        PaymentAction paymentActionM1581e;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1295e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1295e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objWithContext = aVar.f1293c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1295e;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.INSTANCE;
                PaylibLogger.DefaultImpls.d$default(this.f1290e, null, b.f1296a, 1, null);
                String invoiceId = this.f1286a.getInvoiceId();
                if (invoiceId == null) {
                    throw new IllegalStateException("Invoice is required to confirm payment".toString());
                }
                PaymentMethod paymentMethod2 = this.f1289d.getPaymentMethod();
                if (paymentMethod2 == null) {
                    throw new IllegalStateException("Payment method is required to confirm payment".toString());
                }
                CoroutineDispatcher io2 = this.f1288c.getIo();
                d dVar = new d(invoiceId, paymentMethod2, null);
                aVar.f1291a = this;
                aVar.f1292b = paymentMethod2;
                aVar.f1295e = 1;
                objWithContext = BuildersKt.withContext(io2, dVar, aVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8059c = this;
                paymentMethod = paymentMethod2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentMethod = (PaymentMethod) aVar.f1292b;
                c8059c = (C8059c) aVar.f1291a;
                ResultKt.throwOnFailure(objWithContext);
            }
            PostInvoiceResponse postInvoiceResponse = (PostInvoiceResponse) objWithContext;
            if (paymentMethod instanceof PaymentMethod.ByCard) {
                paymentActionM1581e = c8059c.m1577a(postInvoiceResponse);
            } else if (paymentMethod instanceof PaymentMethod.WithLoyalty) {
                paymentActionM1581e = c8059c.m1583g(postInvoiceResponse);
            } else if (paymentMethod instanceof PaymentMethod.ViaSbolPayLink) {
                paymentActionM1581e = c8059c.m1579c(postInvoiceResponse);
            } else if (paymentMethod instanceof PaymentMethod.Web) {
                paymentActionM1581e = c8059c.m1582f(postInvoiceResponse);
            } else if (paymentMethod instanceof PaymentMethod.Sbp) {
                paymentActionM1581e = c8059c.m1580d(postInvoiceResponse);
            } else if (paymentMethod instanceof PaymentMethod.Mobile) {
                paymentActionM1581e = c8059c.m1578b(postInvoiceResponse);
            } else {
                if (!(paymentMethod instanceof PaymentMethod.TPay)) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentActionM1581e = c8059c.m1581e(postInvoiceResponse);
            }
            PaylibLogger.DefaultImpls.d$default(c8059c.f1290e, null, c.f1297a, 1, null);
            RequestMeta meta = postInvoiceResponse.getMeta();
            return Result.m15699constructorimpl(new ConfirmPaymentResult(paymentActionM1581e, meta != null ? meta.getTraceId() : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: d */
    public final PaymentAction m1580d(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.PaymentError {
        String formUrl = postInvoiceResponse.getFormUrl();
        if (formUrl != null) {
            return new SbpUrlReceived(formUrl);
        }
        throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
    }

    /* renamed from: e */
    public final PaymentAction m1581e(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.PaymentError {
        String formUrl = postInvoiceResponse.getFormUrl();
        if (formUrl != null) {
            return new TPayUrlReceived(formUrl);
        }
        throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
    }

    /* renamed from: f */
    public final PaymentAction m1582f(PostInvoiceResponse postInvoiceResponse) throws WebPaymentLinkIsNullOrEmptyError, PayLibServiceFailure.PaymentFailure.PaymentError {
        ErrorModel error = postInvoiceResponse.getError();
        Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
        String formUrl = postInvoiceResponse.getFormUrl();
        if (formUrl == null || formUrl.length() == 0) {
            throw WebPaymentLinkIsNullOrEmptyError.INSTANCE;
        }
        return new WebPaymentLinkCreated(formUrl);
    }

    /* renamed from: g */
    public final PaymentAction m1583g(PostInvoiceResponse postInvoiceResponse) throws PayLibServiceFailure.PaymentFailure.InsufficientFundsError, PayLibServiceFailure.PaymentFailure.PaymentError {
        ErrorModel error = postInvoiceResponse.getError();
        Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 501) {
            throw AbstractC8055a.m1538b(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
        if (numValueOf == null || numValueOf.intValue() != 0) {
            throw AbstractC8055a.m1547f(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
        return PaymentWithLoyaltyCompleted.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor
    /* renamed from: getPaymentStatusForExecutedInvoice-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15357getPaymentStatusForExecutedInvoicegIAlus(Long l, Continuation continuation) throws Throwable {
        e eVar;
        C8059c c8059c;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f1305d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f1305d = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object objWithContext = eVar.f1303b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f1305d;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.INSTANCE;
                PaylibLogger.DefaultImpls.d$default(this.f1290e, null, new f(l), 1, null);
                String invoiceId = this.f1286a.getInvoiceId();
                if (invoiceId == null) {
                    throw NoInvoiceIdError.INSTANCE;
                }
                CoroutineDispatcher io2 = this.f1288c.getIo();
                h hVar = new h(invoiceId, l, null);
                eVar.f1302a = this;
                eVar.f1305d = 1;
                objWithContext = BuildersKt.withContext(io2, hVar, eVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8059c = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8059c = (C8059c) eVar.f1302a;
                ResultKt.throwOnFailure(objWithContext);
            }
            PaymentStatusPayload paymentStatusPayloadM1526a = AbstractC8055a.m1526a((GetInvoiceResponse) objWithContext);
            PaylibLogger.DefaultImpls.d$default(c8059c.f1290e, null, new g(paymentStatusPayloadM1526a), 1, null);
            return Result.m15699constructorimpl(paymentStatusPayloadM1526a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
    }
}
