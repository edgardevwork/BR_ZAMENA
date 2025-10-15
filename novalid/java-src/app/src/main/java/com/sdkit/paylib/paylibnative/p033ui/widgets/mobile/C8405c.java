package com.sdkit.paylib.paylibnative.p033ui.widgets.mobile;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c */
/* loaded from: classes6.dex */
public final class C8405c implements InterfaceC8404b {

    /* renamed from: a */
    public final InvoiceHolder f3829a;

    /* renamed from: b */
    public final InternalPaylibRouter f3830b;

    /* renamed from: c */
    public final InterfaceC8131b f3831c;

    /* renamed from: d */
    public final InterfaceC8412a f3832d;

    /* renamed from: e */
    public final PaylibLogger f3833e;

    /* renamed from: f */
    public final CoroutineScope f3834f;

    /* renamed from: g */
    public final MutableStateFlow f3835g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.f3836a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("init isSingleWidget("), this.f3836a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f3837a;

        /* renamed from: b */
        public /* synthetic */ Object f3838b;

        /* renamed from: d */
        public int f3840d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3838b = obj;
            this.f3840d |= Integer.MIN_VALUE;
            return C8405c.this.mo3603e(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.f3841a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isMobileAvailable isPaylibMobileEnabled("), this.f3841a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3842a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.f3842a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isMobileAvailable isPaymentWaysContainsMobile("), this.f3842a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f3843a;

        /* renamed from: c */
        public int f3845c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3843a = obj;
            this.f3845c |= Integer.MIN_VALUE;
            return C8405c.this.m3607g(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f3846a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onMobileClicked";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f3847a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "performPayment";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.c$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public static final h f3848a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "reset";
        }
    }

    public C8405c(InvoiceHolder invoiceHolder, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8412a paymentWaySelector, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3829a = invoiceHolder;
        this.f3830b = router;
        this.f3831c = config;
        this.f3832d = paymentWaySelector;
        this.f3833e = loggerFactory.get("MobileWidgetHandlerImpl");
        this.f3834f = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f3835g = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        PaylibLogger.DefaultImpls.d$default(this.f3833e, null, g.f3847a, 1, null);
        this.f3830b.mo2497c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.MobileProvider
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3603e(Continuation continuation) throws Throwable {
        b bVar;
        C8405c c8405c;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f3840d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f3840d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objM3607g = bVar.f3838b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f3840d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM3607g);
            boolean zIsPaylibMobileEnabled = this.f3831c.isPaylibMobileEnabled();
            PaylibLogger.DefaultImpls.d$default(this.f3833e, null, new c(zIsPaylibMobileEnabled), 1, null);
            if (zIsPaylibMobileEnabled) {
                bVar.f3837a = this;
                bVar.f3840d = 1;
                objM3607g = m3607g(bVar);
                if (objM3607g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8405c = this;
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c8405c = (C8405c) bVar.f3837a;
        ResultKt.throwOnFailure(objM3607g);
        Boolean bool = (Boolean) objM3607g;
        PaylibLogger.DefaultImpls.d$default(c8405c.f3833e, null, new d(bool.booleanValue()), 1, null);
        boolean z = bool.booleanValue();
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3607g(Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f3845c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f3845c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object objFirst = eVar.f3843a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f3845c;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f3829a.getInvoice();
            eVar.f3845c = 1;
            objFirst = FlowKt.first(invoice, eVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        List<PaymentWay> paymentWays = ((Invoice) objFirst).getPaymentWays();
        if ((paymentWays instanceof Collection) && paymentWays.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = paymentWays.iterator();
            while (it.hasNext()) {
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.MOBILE) {
                    break;
                }
            }
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.MobileProvider
    /* renamed from: a */
    public void mo3601a() {
        PaylibLogger.DefaultImpls.d$default(this.f3833e, null, h.f3848a, 1, null);
        CoroutineScopeKt.cancel$default(this.f3834f, null, 1, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a
    /* renamed from: e */
    public void mo3605e() {
        PaylibLogger.DefaultImpls.d$default(this.f3833e, null, f.f3846a, 1, null);
        this.f3832d.mo3644a(InterfaceC8419e.a.MOBILE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3604b() {
        return this.f3835g;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.MobileProvider
    /* renamed from: a */
    public void mo3602a(boolean z) {
        PaylibLogger.DefaultImpls.d$default(this.f3833e, null, new a(z), 1, null);
        mo3604b().setValue(Boolean.valueOf(z));
    }
}
