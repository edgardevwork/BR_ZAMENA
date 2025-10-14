package com.sdkit.paylib.paylibdomain.impl.mobileb.interactors;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8055a;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.a */
/* loaded from: classes6.dex */
public final class C8061a implements MobileBPaymentsInteractor {

    /* renamed from: d */
    public static final a f1373d = new a(null);

    /* renamed from: e */
    public static final List f1374e = CollectionsKt__CollectionsKt.listOf((Object[]) new IntRange[]{new IntRange(4551, 4553), new IntRange(3100, 3110)});

    /* renamed from: a */
    public final CoroutineDispatchers f1375a;

    /* renamed from: b */
    public final InvoiceHolder f1376b;

    /* renamed from: c */
    public final InvoiceNetworkClient f1377c;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1378a;

        /* renamed from: c */
        public int f1380c;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1378a = obj;
            this.f1380c |= Integer.MIN_VALUE;
            Object objMo15367getDisclaimerIoAF18A = C8061a.this.mo15367getDisclaimerIoAF18A(this);
            return objMo15367getDisclaimerIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15367getDisclaimerIoAF18A : Result.m15698boximpl(objMo15367getDisclaimerIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1381a;

        /* renamed from: c */
        public int f1383c;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1381a = obj;
            this.f1383c |= Integer.MIN_VALUE;
            Object objMo15368startPaymentgIAlus = C8061a.this.mo15368startPaymentgIAlus(null, this);
            return objMo15368startPaymentgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15368startPaymentgIAlus : Result.m15698boximpl(objMo15368startPaymentgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1384a;

        /* renamed from: c */
        public final /* synthetic */ String f1386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation continuation) {
            super(2, continuation);
            this.f1386c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8061a.this.new d(this.f1386c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1384a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String invoiceId = C8061a.this.f1376b.getInvoiceId();
                if (invoiceId == null) {
                    throw new IllegalStateException("There is no invoice id in current paylib state.");
                }
                InvoiceNetworkClient invoiceNetworkClient = C8061a.this.f1377c;
                String str = this.f1386c;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (Character.isDigit(cCharAt) || cCharAt == '+') {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
                PaymentMethod.Mobile mobile = new PaymentMethod.Mobile(string);
                this.f1384a = 1;
                obj = invoiceNetworkClient.postInvoice(invoiceId, mobile, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C8061a c8061a = C8061a.this;
            PostInvoiceResponse postInvoiceResponse = (PostInvoiceResponse) obj;
            SmsConfirmConstraints smsConfirmConstraints = postInvoiceResponse.getSmsConfirmConstraints();
            if (smsConfirmConstraints != null) {
                return smsConfirmConstraints;
            }
            throw c8061a.m1611a(postInvoiceResponse.getError(), postInvoiceResponse.getMeta());
        }
    }

    public C8061a(CoroutineDispatchers coroutineDispatchers, InvoiceHolder invoiceHolder, InvoiceNetworkClient invoiceNetworkClient) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoiceNetworkClient, "invoiceNetworkClient");
        this.f1375a = coroutineDispatchers;
        this.f1376b = invoiceHolder;
        this.f1377c = invoiceNetworkClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor
    /* renamed from: getDisclaimer-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15367getDisclaimerIoAF18A(Continuation continuation) throws Throwable {
        b bVar;
        Object objM15699constructorimpl;
        Object next;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f1380c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f1380c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objFirstOrNull = bVar.f1378a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f1380c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Result.Companion companion = Result.INSTANCE;
                Flow<Invoice> invoice = this.f1376b.getInvoice();
                bVar.f1380c = 1;
                objFirstOrNull = FlowKt.firstOrNull(invoice, bVar);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
            }
            Invoice invoice2 = (Invoice) objFirstOrNull;
            String disclaimer = null;
            if (invoice2 != null) {
                Iterator<T> it = invoice2.getPaymentWays().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((PaymentWay) next).getType() == PaymentWay.Type.MOBILE) {
                        break;
                    }
                }
                PaymentWay paymentWay = (PaymentWay) next;
                if (paymentWay != null) {
                    disclaimer = paymentWay.getDisclaimer();
                }
            }
            objM15699constructorimpl = Result.m15699constructorimpl(disclaimer);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        return AbstractC8609a.m4713a(objM15699constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor
    /* renamed from: startPayment-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15368startPaymentgIAlus(String str, Continuation continuation) throws Throwable {
        c cVar;
        Object objM15699constructorimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f1383c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f1383c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        Object objWithContext = cVar.f1381a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f1383c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = this.f1375a.getIo();
                d dVar = new d(str, null);
                cVar.f1383c = 1;
                objWithContext = BuildersKt.withContext(io2, dVar, cVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            objM15699constructorimpl = Result.m15699constructorimpl((SmsConfirmConstraints) objWithContext);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        return AbstractC8609a.m4713a(objM15699constructorimpl);
    }

    /* renamed from: a */
    public final PaylibException m1611a(ErrorModel errorModel, RequestMeta requestMeta) {
        List<IntRange> list = f1374e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (IntRange intRange : list) {
                Integer numValueOf = errorModel != null ? Integer.valueOf(errorModel.getCode()) : null;
                if (numValueOf != null && intRange.contains(numValueOf.intValue())) {
                    return new PayLibServiceFailure.PaymentFailure.PhoneValidationError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
                }
            }
        }
        return AbstractC8055a.m1547f(errorModel, requestMeta);
    }
}
