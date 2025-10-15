package com.sdkit.paylib.paylibdomain.impl.mobileb.interactors;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.mobileb.SmsCodeVerificationException;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.RequestSmsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.VerifyPhoneNumberResponse;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b */
/* loaded from: classes6.dex */
public final class C8062b implements MoblieBOtpCodeInteractor {

    /* renamed from: d */
    public static final a f1387d = new a(null);

    /* renamed from: a */
    public final InvoiceHolder f1388a;

    /* renamed from: b */
    public final InvoiceNetworkClient f1389b;

    /* renamed from: c */
    public final CoroutineDispatchers f1390c;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1391a;

        /* renamed from: c */
        public int f1393c;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1391a = obj;
            this.f1393c |= Integer.MIN_VALUE;
            Object objMo15369requestSmsWithVerifyCodeIoAF18A = C8062b.this.mo15369requestSmsWithVerifyCodeIoAF18A(this);
            return objMo15369requestSmsWithVerifyCodeIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15369requestSmsWithVerifyCodeIoAF18A : Result.m15698boximpl(objMo15369requestSmsWithVerifyCodeIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1394a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8062b.this.new c(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            SmsConfirmConstraints smsConfirmConstraints;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1394a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Invoice> invoice = C8062b.this.f1388a.getInvoice();
                this.f1394a = 1;
                obj = FlowKt.first(invoice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    RequestSmsResponse requestSmsResponse = (RequestSmsResponse) obj;
                    smsConfirmConstraints = requestSmsResponse.getSmsConfirmConstraints();
                    if (smsConfirmConstraints != null) {
                        throw new IllegalStateException();
                    }
                    ErrorModel error = requestSmsResponse.getError();
                    if (error == null || error.getCode() != 0) {
                        throw new IllegalStateException();
                    }
                    return smsConfirmConstraints;
                }
                ResultKt.throwOnFailure(obj);
            }
            String invoiceId = ((Invoice) obj).getInvoiceId();
            InvoiceNetworkClient invoiceNetworkClient = C8062b.this.f1389b;
            this.f1394a = 2;
            obj = invoiceNetworkClient.requestSmsWithVerifyCode(invoiceId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RequestSmsResponse requestSmsResponse2 = (RequestSmsResponse) obj;
            smsConfirmConstraints = requestSmsResponse2.getSmsConfirmConstraints();
            if (smsConfirmConstraints != null) {
            }
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1396a;

        /* renamed from: c */
        public int f1398c;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1396a = obj;
            this.f1398c |= Integer.MIN_VALUE;
            Object objMo15370verifyPhoneNumbergIAlus = C8062b.this.mo15370verifyPhoneNumbergIAlus(null, this);
            return objMo15370verifyPhoneNumbergIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15370verifyPhoneNumbergIAlus : Result.m15698boximpl(objMo15370verifyPhoneNumbergIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1399a;

        /* renamed from: c */
        public final /* synthetic */ String f1401c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.f1401c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8062b.this.new e(this.f1401c, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Integer numBoxInt;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1399a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Invoice> invoice = C8062b.this.f1388a.getInvoice();
                this.f1399a = 1;
                obj = FlowKt.first(invoice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) obj;
                    ErrorModel error = verifyPhoneNumberResponse.getError();
                    numBoxInt = error == null ? Boxing.boxInt(error.getCode()) : null;
                    if (numBoxInt != null && numBoxInt.intValue() == 0) {
                        return Unit.INSTANCE;
                    }
                    if (numBoxInt != null || numBoxInt.intValue() != 5402) {
                        throw new IllegalStateException();
                    }
                    SmsConfirmConstraints smsConfirmConstraints = verifyPhoneNumberResponse.getSmsConfirmConstraints();
                    if (smsConfirmConstraints == null) {
                        throw new IllegalStateException();
                    }
                    throw new SmsCodeVerificationException(smsConfirmConstraints);
                }
                ResultKt.throwOnFailure(obj);
            }
            String invoiceId = ((Invoice) obj).getInvoiceId();
            InvoiceNetworkClient invoiceNetworkClient = C8062b.this.f1389b;
            String str = this.f1401c;
            this.f1399a = 2;
            obj = invoiceNetworkClient.verifyPhoneNumber(invoiceId, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            VerifyPhoneNumberResponse verifyPhoneNumberResponse2 = (VerifyPhoneNumberResponse) obj;
            ErrorModel error2 = verifyPhoneNumberResponse2.getError();
            if (error2 == null) {
            }
            if (numBoxInt != null) {
                return Unit.INSTANCE;
            }
            if (numBoxInt != null) {
            }
            throw new IllegalStateException();
        }
    }

    public C8062b(InvoiceHolder invoiceHolder, InvoiceNetworkClient invoiceNetworkClient, CoroutineDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoiceNetworkClient, "invoiceNetworkClient");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f1388a = invoiceHolder;
        this.f1389b = invoiceNetworkClient;
        this.f1390c = dispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor
    /* renamed from: requestSmsWithVerifyCode-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15369requestSmsWithVerifyCodeIoAF18A(Continuation continuation) throws Throwable {
        b bVar;
        Object objM15699constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f1393c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f1393c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objWithContext = bVar.f1391a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f1393c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = this.f1390c.getIo();
                c cVar = new c(null);
                bVar.f1393c = 1;
                objWithContext = BuildersKt.withContext(io2, cVar, bVar);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor
    /* renamed from: verifyPhoneNumber-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15370verifyPhoneNumbergIAlus(String str, Continuation continuation) throws Throwable {
        d dVar;
        Object objM15699constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.f1398c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f1398c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        }
        Object obj = dVar.f1396a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.f1398c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = this.f1390c.getIo();
                e eVar = new e(str, null);
                dVar.f1398c = 1;
                if (BuildersKt.withContext(io2, eVar, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        return AbstractC8609a.m4713a(objM15699constructorimpl);
    }
}
