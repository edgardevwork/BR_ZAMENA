package com.sdkit.paylib.paylibnative.p033ui.widgets.webpay;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.EnumC8219a;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8265e;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.d */
/* loaded from: classes6.dex */
public final class C8453d implements InterfaceC8452c {

    /* renamed from: a */
    public final InvoiceHolder f4083a;

    /* renamed from: b */
    public final InternalPaylibRouter f4084b;

    /* renamed from: c */
    public final InterfaceC8131b f4085c;

    /* renamed from: d */
    public final InterfaceC8412a f4086d;

    /* renamed from: e */
    public final InterfaceC8097f f4087e;

    /* renamed from: f */
    public final InterfaceC8220b f4088f;

    /* renamed from: g */
    public final CoroutineScope f4089g;

    /* renamed from: h */
    public final MutableStateFlow f4090h;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.d$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f4091a;

        /* renamed from: c */
        public int f4093c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4091a = obj;
            this.f4093c |= Integer.MIN_VALUE;
            return C8453d.this.mo3772c(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public boolean f4094a;

        /* renamed from: b */
        public int f4095b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8453d.this.new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            List<PaymentWay> paymentWays;
            Iterator<T> it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4095b;
            boolean z2 = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Invoice> invoice = C8453d.this.f4083a.getInvoice();
                this.f4095b = 1;
                obj = FlowKt.first(invoice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.f4094a;
                    ResultKt.throwOnFailure(obj);
                    paymentWays = ((Invoice) obj).getPaymentWays();
                    if ((paymentWays instanceof Collection) || !paymentWays.isEmpty()) {
                        it = paymentWays.iterator();
                        while (it.hasNext()) {
                            if (((PaymentWay) it.next()).getType() == PaymentWay.Type.CARD) {
                                break;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (C8453d.this.f4088f.mo2237a() == EnumC8219a.SHOW_SCREEN || !C8453d.this.f4085c.isPaylibUseSaveCardFlowEnabled() || !z2 || z) {
                        C8453d.this.f4084b.mo2493a(new C8357a(false, false, null, false));
                    } else {
                        C8453d.this.f4084b.mo2489a(EnumC8265e.INVOICE_DETAILS);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zIsSubscription = ((Invoice) obj).isSubscription();
            Flow<Invoice> invoice2 = C8453d.this.f4083a.getInvoice();
            this.f4094a = zIsSubscription;
            this.f4095b = 2;
            Object objFirst = FlowKt.first(invoice2, this);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zIsSubscription;
            obj = objFirst;
            paymentWays = ((Invoice) obj).getPaymentWays();
            if (paymentWays instanceof Collection) {
                it = paymentWays.iterator();
                while (it.hasNext()) {
                }
                z2 = false;
            }
            if (C8453d.this.f4088f.mo2237a() == EnumC8219a.SHOW_SCREEN) {
                C8453d.this.f4084b.mo2493a(new C8357a(false, false, null, false));
            }
            return Unit.INSTANCE;
        }
    }

    public C8453d(InvoiceHolder invoiceHolder, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8412a paymentWaySelector, CoroutineDispatchers coroutineDispatchers, InterfaceC8097f analytics, InterfaceC8220b paylibSaveCardScreenStateManager) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(paylibSaveCardScreenStateManager, "paylibSaveCardScreenStateManager");
        this.f4083a = invoiceHolder;
        this.f4084b = router;
        this.f4085c = config;
        this.f4086d = paymentWaySelector;
        this.f4087e = analytics;
        this.f4088f = paylibSaveCardScreenStateManager;
        this.f4089g = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f4090h = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a
    /* renamed from: e */
    public void mo3774e() {
        this.f4086d.mo3644a(InterfaceC8419e.a.WEBPAY);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3773b() {
        return this.f4090h;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.WebPayProvider
    /* renamed from: a */
    public void mo3770a() {
        CoroutineScopeKt.cancel$default(this.f4089g, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.WebPayProvider
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3772c(Continuation continuation) throws Throwable {
        a aVar;
        boolean z;
        boolean z2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f4093c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f4093c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objFirst = aVar.f4091a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f4093c;
        boolean z3 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f4083a.getInvoice();
            aVar.f4093c = 1;
            objFirst = FlowKt.first(invoice, aVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        Invoice invoice2 = (Invoice) objFirst;
        List<PaymentWay> paymentWays = invoice2.getPaymentWays();
        if ((paymentWays instanceof Collection) && paymentWays.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = paymentWays.iterator();
            while (it.hasNext()) {
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.NEW) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<PaymentWay> paymentWays2 = invoice2.getPaymentWays();
        if ((paymentWays2 instanceof Collection) && paymentWays2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it2 = paymentWays2.iterator();
            while (it2.hasNext()) {
                if (((PaymentWay) it2.next()).getType() == PaymentWay.Type.CARD) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (!z || (z2 && !invoice2.getCards().isEmpty())) {
            z3 = false;
        }
        return Boxing.boxBoolean(z3);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.WebPayProvider
    /* renamed from: a */
    public void mo3771a(boolean z) {
        mo3773b().setValue(Boolean.valueOf(z));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        if (!this.f4085c.isPaylibAddCardFlowWithProfileEnabled()) {
            BuildersKt__Builders_commonKt.launch$default(this.f4089g, null, null, new b(null), 3, null);
        } else {
            AbstractC8096e.m1789a(this.f4087e);
            this.f4084b.mo2495b();
        }
    }
}
