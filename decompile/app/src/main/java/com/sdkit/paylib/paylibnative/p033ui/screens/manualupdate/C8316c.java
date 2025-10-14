package com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c */
/* loaded from: classes5.dex */
public final class C8316c extends AbstractC8129a {

    /* renamed from: b */
    public final InternalPaylibRouter f3234b;

    /* renamed from: c */
    public final InvoiceHolder f3235c;

    /* renamed from: d */
    public final InterfaceC8131b f3236d;

    /* renamed from: e */
    public final FinishCodeReceiver f3237e;

    /* renamed from: f */
    public final InterfaceC8412a f3238f;

    /* renamed from: g */
    public final PaylibLogger f3239g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public static final a f3240a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "init";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f3241a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "checkIfNeedUpdated";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f3242a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "closeRequested";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$d */
    /* loaded from: classes6.dex */
    public static final class d implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3243a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$d$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3244a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C11929a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3245a;

                /* renamed from: b */
                public int f3246b;

                public C11929a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3245a = obj;
                    this.f3246b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3244a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11929a c11929a;
                if (continuation instanceof C11929a) {
                    c11929a = (C11929a) continuation;
                    int i = c11929a.f3246b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11929a.f3246b = i - Integer.MIN_VALUE;
                    } else {
                        c11929a = new C11929a(continuation);
                    }
                }
                Object obj2 = c11929a.f3245a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11929a.f3246b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3244a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, false);
                    c11929a.f3246b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11929a) == coroutine_suspended) {
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

        public d(Flow flow) {
            this.f3243a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3243a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3248a;

        /* renamed from: b */
        public /* synthetic */ Object f3249b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$e$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3251a;

            /* renamed from: b */
            public final /* synthetic */ C8316c f3252b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8302e c8302e, C8316c c8316c) {
                super(1);
                this.f3251a = c8302e;
                this.f3252b = c8316c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8318e invoke(C8318e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return reduceState.m2988a(this.f3251a, !this.f3252b.f3236d.mo2007b(), this.f3252b.f3236d.isSandbox());
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8302e c8302e, Continuation continuation) {
            return ((e) create(c8302e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = C8316c.this.new e(continuation);
            eVar.f3249b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3248a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8302e c8302e = (C8302e) this.f3249b;
            C8316c c8316c = C8316c.this;
            c8316c.m2000a(new a(c8302e, c8316c));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f3253a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateDetails";
        }
    }

    public C8316c(InternalPaylibRouter router, InvoiceHolder invoiceHolder, InterfaceC8131b config, FinishCodeReceiver finishCodeReceiver, InterfaceC8412a paymentWaySelector, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3234b = router;
        this.f3235c = invoiceHolder;
        this.f3236d = config;
        this.f3237e = finishCodeReceiver;
        this.f3238f = paymentWaySelector;
        PaylibLogger paylibLogger = loggerFactory.get("ManualUpdateViewModel");
        this.f3239g = paylibLogger;
        PaylibLogger.DefaultImpls.i$default(paylibLogger, null, a.f3240a, 1, null);
        m2976g();
    }

    /* renamed from: d */
    public final void m2973d() {
        PaylibLogger.DefaultImpls.i$default(this.f3239g, null, b.f3241a, 1, null);
        if (this.f3238f.mo3643a().getValue() == InterfaceC8419e.a.BISTRO) {
            m2977h();
        }
    }

    /* renamed from: e */
    public final void m2974e() {
        PaylibLogger.DefaultImpls.i$default(this.f3239g, null, c.f3242a, 1, null);
        this.f3237e.mo2267a(EnumC8105d.CLOSED_BY_USER);
        this.f3234b.mo2485a();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8318e mo1999a() {
        return new C8318e(null, false, false);
    }

    /* renamed from: g */
    public final void m2976g() {
        m2001a(new d(this.f3235c.getInvoice()), new e(null));
    }

    /* renamed from: h */
    public final void m2977h() {
        PaylibLogger.DefaultImpls.i$default(this.f3239g, null, f.f3253a, 1, null);
        InternalPaylibRouter.DefaultImpls.pushDeeplinkResultScreen$default(this.f3234b, true, null, 2, null);
    }
}
