package com.sdkit.paylib.paylibnative.p033ui.widgets.bistro;

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

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c */
/* loaded from: classes6.dex */
public final class C8381c implements InterfaceC8380b {

    /* renamed from: a */
    public final InvoiceHolder f3690a;

    /* renamed from: b */
    public final InternalPaylibRouter f3691b;

    /* renamed from: c */
    public final InterfaceC8131b f3692c;

    /* renamed from: d */
    public final InterfaceC8412a f3693d;

    /* renamed from: e */
    public final PaylibLogger f3694e;

    /* renamed from: f */
    public final CoroutineScope f3695f;

    /* renamed from: g */
    public final MutableStateFlow f3696g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.f3697a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("init isSingleWidget("), this.f3697a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f3698a;

        /* renamed from: b */
        public /* synthetic */ Object f3699b;

        /* renamed from: d */
        public int f3701d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3699b = obj;
            this.f3701d |= Integer.MIN_VALUE;
            return C8381c.this.mo3486d(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.f3702a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isBistroAvailable isPaylibSbpEnabled("), this.f3702a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f3703a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.f3703a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isBistroAvailable isPaymentWaysContainsBistro("), this.f3703a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f3704a;

        /* renamed from: c */
        public int f3706c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3704a = obj;
            this.f3706c |= Integer.MIN_VALUE;
            return C8381c.this.m3491g(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f3707a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onBistroClicked";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f3708a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "performPayment";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.c$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public static final h f3709a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "reset";
        }
    }

    public C8381c(InvoiceHolder invoiceHolder, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8412a paymentWaySelector, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3690a = invoiceHolder;
        this.f3691b = router;
        this.f3692c = config;
        this.f3693d = paymentWaySelector;
        this.f3694e = loggerFactory.get("BistroWidgetHandlerImpl");
        this.f3695f = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f3696g = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        PaylibLogger.DefaultImpls.d$default(this.f3694e, null, g.f3708a, 1, null);
        InternalPaylibRouter.DefaultImpls.pushBanksScreen$default(this.f3691b, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.BistroProvider
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3486d(Continuation continuation) throws Throwable {
        b bVar;
        C8381c c8381c;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f3701d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f3701d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objM3491g = bVar.f3699b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f3701d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM3491g);
            boolean zIsPaylibSbpEnabled = this.f3692c.isPaylibSbpEnabled();
            PaylibLogger.DefaultImpls.d$default(this.f3694e, null, new c(zIsPaylibSbpEnabled), 1, null);
            if (zIsPaylibSbpEnabled) {
                bVar.f3698a = this;
                bVar.f3701d = 1;
                objM3491g = m3491g(bVar);
                if (objM3491g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8381c = this;
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c8381c = (C8381c) bVar.f3698a;
        ResultKt.throwOnFailure(objM3491g);
        Boolean bool = (Boolean) objM3491g;
        PaylibLogger.DefaultImpls.d$default(c8381c.f3694e, null, new d(bool.booleanValue()), 1, null);
        boolean z = bool.booleanValue();
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a
    /* renamed from: e */
    public void mo3488e() {
        PaylibLogger.DefaultImpls.d$default(this.f3694e, null, f.f3707a, 1, null);
        this.f3693d.mo3644a(InterfaceC8419e.a.BISTRO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3491g(Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f3706c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f3706c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object objFirst = eVar.f3704a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f3706c;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f3690a.getInvoice();
            eVar.f3706c = 1;
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
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.SBP) {
                    break;
                }
            }
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.BistroProvider
    /* renamed from: a */
    public void mo3484a() {
        PaylibLogger.DefaultImpls.d$default(this.f3694e, null, h.f3709a, 1, null);
        CoroutineScopeKt.cancel$default(this.f3695f, null, 1, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3487b() {
        return this.f3696g;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.BistroProvider
    /* renamed from: a */
    public void mo3485a(boolean z) {
        PaylibLogger.DefaultImpls.d$default(this.f3694e, null, new a(z), 1, null);
        mo3487b().setValue(Boolean.valueOf(z));
    }
}
