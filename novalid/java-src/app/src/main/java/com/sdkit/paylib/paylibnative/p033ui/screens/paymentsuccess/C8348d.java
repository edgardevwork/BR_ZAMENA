package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.EnumC8092a;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d */
/* loaded from: classes5.dex */
public final class C8348d extends AbstractC8129a {

    /* renamed from: m */
    public static final a f3522m = new a(null);

    /* renamed from: b */
    public final InterfaceC8097f f3523b;

    /* renamed from: c */
    public final CoroutineDispatchers f3524c;

    /* renamed from: d */
    public final InvoiceHolder f3525d;

    /* renamed from: e */
    public final FinishCodeReceiver f3526e;

    /* renamed from: f */
    public final InternalPaylibRouter f3527f;

    /* renamed from: g */
    public final InterfaceC8131b f3528g;

    /* renamed from: h */
    public final InterfaceC8093b f3529h;

    /* renamed from: i */
    public final InterfaceC8238l f3530i;

    /* renamed from: j */
    public EnumC8105d f3531j;

    /* renamed from: k */
    public String f3532k;

    /* renamed from: l */
    public final List f3533l;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$b */
    /* loaded from: classes6.dex */
    public static final class b implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3534a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$b$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3535a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C11941a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3536a;

                /* renamed from: b */
                public int f3537b;

                public C11941a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3536a = obj;
                    this.f3537b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3535a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11941a c11941a;
                if (continuation instanceof C11941a) {
                    c11941a = (C11941a) continuation;
                    int i = c11941a.f3537b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11941a.f3537b = i - Integer.MIN_VALUE;
                    } else {
                        c11941a = new C11941a(continuation);
                    }
                }
                Object obj2 = c11941a.f3536a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11941a.f3537b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3535a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, false);
                    c11941a.f3537b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11941a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(Flow flow) {
            this.f3534a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3534a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3539a;

        /* renamed from: b */
        public /* synthetic */ Object f3540b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$c$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3542a;

            /* renamed from: b */
            public final /* synthetic */ C8348d f3543b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8302e c8302e, C8348d c8348d) {
                super(1);
                this.f3542a = c8302e;
                this.f3543b = c8348d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8350f invoke(C8350f reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                C8302e c8302e = this.f3542a;
                String strM2913h = this.f3543b.f3532k;
                if (strM2913h == null) {
                    strM2913h = this.f3542a.m2913h();
                }
                return C8350f.m3307a(reduceState, c8302e.m2905a((247 & 1) != 0 ? c8302e.f3160a : null, (247 & 2) != 0 ? c8302e.f3161b : null, (247 & 4) != 0 ? c8302e.f3162c : null, (247 & 8) != 0 ? c8302e.f3163d : strM2913h, (247 & 16) != 0 ? c8302e.f3164e : false, (247 & 32) != 0 ? c8302e.f3165f : null, (247 & 64) != 0 ? c8302e.f3166g : null, (247 & 128) != 0 ? c8302e.f3167h : null), !this.f3543b.f3528g.mo2007b(), this.f3543b.f3528g.isSandbox(), 0, null, 24, null);
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8302e c8302e, Continuation continuation) {
            return ((c) create(c8302e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = C8348d.this.new c(continuation);
            cVar.f3540b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8302e c8302e = (C8302e) this.f3540b;
            C8348d c8348d = C8348d.this;
            c8348d.m2000a(new a(c8302e, c8348d));
            C8348d.this.m3299h();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3544a;

        /* renamed from: b */
        public /* synthetic */ Object f3545b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f3545b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3544a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.f3545b;
                this.f3545b = flowCollector;
                this.f3544a = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.f3545b;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            this.f3545b = null;
            this.f3544a = 2;
            if (flowCollector.emit(unit, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3546a;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((e) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8348d.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3546a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AbstractC8096e.m1810j(C8348d.this.f3523b);
            C8348d.this.f3526e.mo2267a(C8348d.this.f3531j);
            C8348d.this.f3527f.mo2485a();
            return Unit.INSTANCE;
        }
    }

    public C8348d(InterfaceC8097f analytics, CoroutineDispatchers coroutineDispatchers, InvoiceHolder invoiceHolder, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8093b paymentMethodProvider, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentMethodProvider, "paymentMethodProvider");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f3523b = analytics;
        this.f3524c = coroutineDispatchers;
        this.f3525d = invoiceHolder;
        this.f3526e = finishCodeReceiver;
        this.f3527f = router;
        this.f3528g = config;
        this.f3529h = paymentMethodProvider;
        this.f3530i = paylibStateManager;
        this.f3533l = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC8092a[]{EnumC8092a.NEW, EnumC8092a.SBOLPAY});
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C8350f mo1999a() {
        return new C8350f(null, true, false, C11403R.string.paylib_native_payment_success_label, null);
    }

    /* renamed from: h */
    public final void m3299h() {
        AbstractC8096e.m1802b(this.f3523b, this.f3530i.mo2350b(), this.f3529h.getPaymentMethod());
        m2001a(FlowKt.flowOn(FlowKt.flow(new d(null)), this.f3524c.getIo()), new e(null));
    }

    /* renamed from: d */
    public final void m3295d() {
        AbstractC8096e.m1811k(this.f3523b);
        this.f3526e.mo2267a(this.f3531j);
        this.f3527f.mo2485a();
    }

    /* renamed from: f */
    public final void m3297f() {
        m2001a(new b(this.f3525d.getInvoice()), new c(null));
    }

    /* renamed from: g */
    public final boolean m3298g() {
        return CollectionsKt___CollectionsKt.contains(this.f3533l, this.f3529h.getPaymentMethod());
    }

    /* renamed from: a */
    public final Pair m3293a(boolean z, String str) {
        return this.f3529h.getPaymentMethod() == EnumC8092a.MOBILE ? new Pair(Integer.valueOf(C11403R.string.paylib_native_payment_success_disclaimer_mobile), null) : (z && m3298g()) ? new Pair(Integer.valueOf(C11403R.string.paylib_native_subscription_added_card_label), str) : new Pair(null, null);
    }

    /* renamed from: a */
    public final void m3294a(boolean z, EnumC8105d enumC8105d, String str, boolean z2, String str2) {
        Object value;
        this.f3531j = enumC8105d;
        this.f3532k = str;
        if (z) {
            m3297f();
        } else {
            m3299h();
        }
        MutableStateFlow mutableStateFlowM2002b = m2002b();
        do {
            value = mutableStateFlowM2002b.getValue();
        } while (!mutableStateFlowM2002b.compareAndSet(value, C8350f.m3307a((C8350f) value, null, false, false, z2 ? C11403R.string.paylib_native_subscription_success_label : C11403R.string.paylib_native_payment_success_label, m3293a(z2, str2), 7, null)));
    }
}
