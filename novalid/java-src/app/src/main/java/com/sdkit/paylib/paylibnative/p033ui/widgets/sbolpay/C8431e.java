package com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay;

import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.SbolPayDeeplinkResolver;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.AbstractC8427a;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.MobileNumberVerificationInfoReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethodRequired;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWithLoyaltyCompleted;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbolpayDeeplinkCreated;
import com.sdkit.paylib.paylibpayment.api.domain.entity.SbpUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.TPayUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WebPaymentLinkCreated;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.e */
/* loaded from: classes6.dex */
public final class C8431e implements InterfaceC8430d {

    /* renamed from: a */
    public final InvoicePaymentInteractor f3986a;

    /* renamed from: b */
    public final InterfaceC8097f f3987b;

    /* renamed from: c */
    public final InvoiceHolder f3988c;

    /* renamed from: d */
    public final InterfaceC8412a f3989d;

    /* renamed from: e */
    public final SbolPayDeeplinkResolver f3990e;

    /* renamed from: f */
    public final InternalPaylibRouter f3991f;

    /* renamed from: g */
    public final PaymentMethodSelector f3992g;

    /* renamed from: h */
    public final CoroutineScope f3993h;

    /* renamed from: i */
    public final MutableSharedFlow f3994i;

    /* renamed from: j */
    public final MutableStateFlow f3995j;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.e$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f3996a;

        /* renamed from: b */
        public /* synthetic */ Object f3997b;

        /* renamed from: d */
        public int f3999d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3997b = obj;
            this.f3999d |= Integer.MIN_VALUE;
            return C8431e.this.mo3711f(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.e$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f4000a;

        /* renamed from: b */
        public Object f4001b;

        /* renamed from: c */
        public /* synthetic */ Object f4002c;

        /* renamed from: e */
        public int f4004e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4002c = obj;
            this.f4004e |= Integer.MIN_VALUE;
            return C8431e.this.m3724a((ConfirmPaymentResult) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.e$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public Object f4005a;

        /* renamed from: b */
        public int f4006b;

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
            return C8431e.this.new c(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15356confirmPaymentIoAF18A;
            Object obj2;
            Throwable thM15702exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4006b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoicePaymentInteractor invoicePaymentInteractor = C8431e.this.f3986a;
                this.f4006b = 1;
                objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(this);
                if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.f4005a;
                    ResultKt.throwOnFailure(obj);
                    C8431e c8431e = C8431e.this;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(obj2);
                    if (thM15702exceptionOrNullimpl != null) {
                        this.f4005a = obj2;
                        this.f4006b = 3;
                        if (c8431e.m3725a(thM15702exceptionOrNullimpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objMo15356confirmPaymentIoAF18A = ((Result) obj).getValue();
            }
            obj2 = objMo15356confirmPaymentIoAF18A;
            C8431e c8431e2 = C8431e.this;
            if (Result.m15706isSuccessimpl(obj2)) {
                this.f4005a = obj2;
                this.f4006b = 2;
                if (c8431e2.m3724a((ConfirmPaymentResult) obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C8431e c8431e3 = C8431e.this;
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(obj2);
            if (thM15702exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public C8431e(InvoicePaymentInteractor invoicePaymentInteractor, InterfaceC8097f analytics, CoroutineDispatchers coroutineDispatchers, InvoiceHolder invoiceHolder, InterfaceC8412a paymentWaySelector, SbolPayDeeplinkResolver sbolPayDeeplinkResolver, InternalPaylibRouter router, PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(sbolPayDeeplinkResolver, "sbolPayDeeplinkResolver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f3986a = invoicePaymentInteractor;
        this.f3987b = analytics;
        this.f3988c = invoiceHolder;
        this.f3989d = paymentWaySelector;
        this.f3990e = sbolPayDeeplinkResolver;
        this.f3991f = router;
        this.f3992g = paymentMethodSelector;
        this.f3993h = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f3994i = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3995j = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        m3729j();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c
    /* renamed from: e */
    public void mo3720e() {
        this.f3989d.mo3644a(InterfaceC8419e.a.SBOLPAY);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.SbolPayProvider
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3711f(Continuation continuation) throws Throwable {
        a aVar;
        C8431e c8431e;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f3999d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f3999d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objFirst = aVar.f3997b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f3999d;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f3988c.getInvoice();
            aVar.f3996a = this;
            aVar.f3999d = 1;
            objFirst = FlowKt.first(invoice, aVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8431e = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8431e = (C8431e) aVar.f3996a;
            ResultKt.throwOnFailure(objFirst);
        }
        List<PaymentWay> paymentWays = ((Invoice) objFirst).getPaymentWays();
        if ((paymentWays instanceof Collection) && paymentWays.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = paymentWays.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.SBOLPAY) {
                    if (!c8431e.f3990e.m2095a()) {
                        break;
                    }
                }
            }
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.SbolPayProvider
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3710d() {
        return this.f3994i;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3719b() {
        return this.f3995j;
    }

    /* renamed from: j */
    public final void m3729j() {
        AbstractC8096e.m1816p(this.f3987b);
        Object objM2096b = this.f3990e.m2096b();
        if (Result.m15706isSuccessimpl(objM2096b)) {
            this.f3992g.selectPaymentMethod(new PaymentMethod.ViaSbolPayLink((String) objM2096b));
            BuildersKt__Builders_commonKt.launch$default(this.f3993h, null, null, new c(null), 3, null);
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2096b);
        if (thM15702exceptionOrNullimpl != null) {
            m3726a(thM15702exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3724a(ConfirmPaymentResult confirmPaymentResult, Continuation continuation) throws Throwable {
        b bVar;
        Object objM2094a;
        C8431e c8431e;
        Throwable thM15702exceptionOrNullimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f4004e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f4004e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object obj = bVar.f4002c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f4004e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentAction paymentAction = confirmPaymentResult.getPaymentAction();
            if (paymentAction instanceof SbolpayDeeplinkCreated) {
                objM2094a = this.f3990e.m2094a(((SbolpayDeeplinkCreated) paymentAction).getDeeplink());
                if (Result.m15706isSuccessimpl(objM2094a)) {
                    if (((Boolean) objM2094a).booleanValue()) {
                        this.f3991f.mo2499d();
                        MutableSharedFlow mutableSharedFlowMo3710d = mo3710d();
                        AbstractC8427a.b bVar2 = AbstractC8427a.b.f3978a;
                        bVar.f4000a = this;
                        bVar.f4001b = objM2094a;
                        bVar.f4004e = 1;
                        if (mutableSharedFlowMo3710d.emit(bVar2, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlowMo3710d2 = mo3710d();
                        AbstractC8427a.a aVar = new AbstractC8427a.a(null);
                        bVar.f4000a = this;
                        bVar.f4001b = objM2094a;
                        bVar.f4004e = 2;
                        if (mutableSharedFlowMo3710d2.emit(aVar, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                c8431e = this;
                thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2094a);
                if (thM15702exceptionOrNullimpl != null) {
                }
            } else {
                if (paymentAction instanceof PaymentMethodRequired ? true : paymentAction instanceof WebPaymentLinkCreated ? true : paymentAction instanceof PaymentCompleted ? true : paymentAction instanceof PaymentWithLoyaltyCompleted ? true : paymentAction instanceof SbpUrlReceived ? true : paymentAction instanceof MobileNumberVerificationInfoReceived) {
                    MutableSharedFlow mutableSharedFlowMo3710d3 = mo3710d();
                    AbstractC8427a.a aVar2 = new AbstractC8427a.a(null);
                    bVar.f4004e = 4;
                    if (mutableSharedFlowMo3710d3.emit(aVar2, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                boolean z = paymentAction instanceof TPayUrlReceived;
            }
        } else if (i2 == 1 || i2 == 2) {
            objM2094a = bVar.f4001b;
            c8431e = (C8431e) bVar.f4000a;
            ResultKt.throwOnFailure(obj);
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2094a);
            if (thM15702exceptionOrNullimpl != null) {
                MutableSharedFlow mutableSharedFlowMo3710d4 = c8431e.mo3710d();
                AbstractC8427a.a aVar3 = new AbstractC8427a.a(thM15702exceptionOrNullimpl);
                bVar.f4000a = objM2094a;
                bVar.f4001b = null;
                bVar.f4004e = 3;
                if (mutableSharedFlowMo3710d4.emit(aVar3, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object m3725a(Throwable th, Continuation continuation) {
        Object objEmit = mo3710d().emit(new AbstractC8427a.a(th), continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.SbolPayProvider
    /* renamed from: a */
    public void mo3708a() {
        CoroutineScopeKt.cancel$default(this.f3993h, null, 1, null);
    }

    /* renamed from: a */
    public final void m3726a(Throwable th) {
        this.f3991f.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.SbolPayProvider
    /* renamed from: a */
    public void mo3709a(boolean z) {
        mo3719b().setValue(Boolean.valueOf(z));
    }
}
