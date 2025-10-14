package com.sdkit.paylib.paylibnative.p033ui.widgets.card;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8396b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8397c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8399e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers.InterfaceC8400a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Loyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperation;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperationType;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f */
/* loaded from: classes6.dex */
public final class C8393f implements InterfaceC8392e {

    /* renamed from: a */
    public final InvoiceHolder f3754a;

    /* renamed from: b */
    public final PaymentMethodSelector f3755b;

    /* renamed from: c */
    public final InternalPaylibRouter f3756c;

    /* renamed from: d */
    public final InterfaceC8097f f3757d;

    /* renamed from: e */
    public final InterfaceC8400a f3758e;

    /* renamed from: f */
    public final InterfaceC8412a f3759f;

    /* renamed from: g */
    public final C8397c f3760g;

    /* renamed from: h */
    public final CardsHolder f3761h;

    /* renamed from: i */
    public final CoroutineScope f3762i;

    /* renamed from: j */
    public final MutableSharedFlow f3763j;

    /* renamed from: k */
    public final MutableStateFlow f3764k;

    /* renamed from: l */
    public final MutableStateFlow f3765l;

    /* renamed from: m */
    public final MutableStateFlow f3766m;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f3767a;

        /* renamed from: c */
        public int f3769c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3767a = obj;
            this.f3769c |= Integer.MIN_VALUE;
            return C8393f.this.mo3509a(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$b */
    public static final class b implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3770a;

        /* renamed from: b */
        public final /* synthetic */ C8393f f3771b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$b$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3772a;

            /* renamed from: b */
            public final /* synthetic */ C8393f f3773b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$b$a$a, reason: collision with other inner class name */
            public static final class C11945a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3774a;

                /* renamed from: b */
                public int f3775b;

                public C11945a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3774a = obj;
                    this.f3775b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, C8393f c8393f) {
                this.f3772a = flowCollector;
                this.f3773b = c8393f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11945a c11945a;
                if (continuation instanceof C11945a) {
                    c11945a = (C11945a) continuation;
                    int i = c11945a.f3775b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11945a.f3775b = i - Integer.MIN_VALUE;
                    } else {
                        c11945a = new C11945a(continuation);
                    }
                }
                Object obj2 = c11945a.f3774a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11945a.f3775b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3772a;
                    if (this.f3773b.m3559a((Invoice) obj)) {
                        c11945a.f3775b = 1;
                        if (flowCollector.emit(obj, c11945a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public b(Flow flow, C8393f c8393f) {
            this.f3770a = flow;
            this.f3771b = c8393f;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3770a.collect(new a(flowCollector, this.f3771b), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$c */
    public static final class c implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3777a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$c$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3778a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$c$a$a, reason: collision with other inner class name */
            public static final class C11946a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3779a;

                /* renamed from: b */
                public int f3780b;

                public C11946a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3779a = obj;
                    this.f3780b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3778a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11946a c11946a;
                if (continuation instanceof C11946a) {
                    c11946a = (C11946a) continuation;
                    int i = c11946a.f3780b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11946a.f3780b = i - Integer.MIN_VALUE;
                    } else {
                        c11946a = new C11946a(continuation);
                    }
                }
                Object obj2 = c11946a.f3779a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11946a.f3780b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3778a;
                    Invoice invoice = (Invoice) ((Triple) obj).component1();
                    c11946a.f3780b = 1;
                    if (flowCollector.emit(invoice, c11946a) == coroutine_suspended) {
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

        public c(Flow flow) {
            this.f3777a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3777a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function3 {

        /* renamed from: a */
        public int f3782a;

        /* renamed from: b */
        public /* synthetic */ Object f3783b;

        /* renamed from: c */
        public /* synthetic */ Object f3784c;

        public d(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Invoice invoice, CardWithLoyalty cardWithLoyalty, Continuation continuation) {
            d dVar = C8393f.this.new d(continuation);
            dVar.f3783b = invoice;
            dVar.f3784c = cardWithLoyalty;
            return dVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String id;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3782a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Invoice invoice = (Invoice) this.f3783b;
            CardWithLoyalty cardWithLoyalty = (CardWithLoyalty) this.f3784c;
            CardWithLoyalty cardWithLoyaltyFindCard = (cardWithLoyalty == null || (id = cardWithLoyalty.getId()) == null) ? null : C8393f.this.f3761h.findCard(id);
            boolean zM3582a = C8393f.this.f3760g.m3582a();
            C8399e c8399eMo3596a = C8393f.this.f3758e.mo3596a(invoice.getLoyaltyInfoState(), cardWithLoyaltyFindCard, zM3582a);
            C8393f.this.getSelectedCard().setValue(cardWithLoyaltyFindCard != null ? AbstractC8369f.m3455a(cardWithLoyaltyFindCard) : null);
            C8393f.this.mo3546j().setValue(c8399eMo3596a);
            return new Triple(invoice, cardWithLoyaltyFindCard, Boxing.boxBoolean(zM3582a));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3786a;

        /* renamed from: b */
        public /* synthetic */ Object f3787b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Triple triple, Continuation continuation) {
            return ((e) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = C8393f.this.new e(continuation);
            eVar.f3787b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String actionLabel;
            Loyalty loyalty;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3786a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.f3787b;
                Invoice invoice = (Invoice) triple.component1();
                CardWithLoyalty cardWithLoyalty = (CardWithLoyalty) triple.component2();
                if (((Boolean) triple.component3()).booleanValue()) {
                    if (cardWithLoyalty == null || (loyalty = cardWithLoyalty.getLoyalty()) == null || (actionLabel = loyalty.getActionLabel()) == null) {
                        actionLabel = "";
                    }
                    MutableSharedFlow mutableSharedFlowMo3512f = C8393f.this.mo3512f();
                    C8385b c8385b = new C8385b(new AbstractC8128b.e(actionLabel));
                    this.f3786a = 1;
                    if (mutableSharedFlowMo3512f.emit(c8385b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    C8302e c8302eM3450a = AbstractC8369f.m3450a(invoice, true);
                    MutableSharedFlow mutableSharedFlowMo3512f2 = C8393f.this.mo3512f();
                    C8385b c8385b2 = new C8385b(new AbstractC8128b.d(c8302eM3450a.m2913h(), c8302eM3450a.m2910e()));
                    this.f3786a = 2;
                    if (mutableSharedFlowMo3512f2.emit(c8385b2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3789a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Invoice invoice, Continuation continuation) {
            return ((f) create(invoice, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8393f.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3789a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceHolder invoiceHolder = C8393f.this.f3754a;
                this.f3789a = 1;
                if (invoiceHolder.fetchAllInvoiceDetails(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AbstractC8096e.m1807g(C8393f.this.f3757d);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$g */
    public static final class g implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3791a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$g$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3792a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$g$a$a, reason: collision with other inner class name */
            public static final class C11947a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3793a;

                /* renamed from: b */
                public int f3794b;

                public C11947a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3793a = obj;
                    this.f3794b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3792a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11947a c11947a;
                if (continuation instanceof C11947a) {
                    c11947a = (C11947a) continuation;
                    int i = c11947a.f3794b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11947a.f3794b = i - Integer.MIN_VALUE;
                    } else {
                        c11947a = new C11947a(continuation);
                    }
                }
                Object obj2 = c11947a.f3793a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11947a.f3794b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3792a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, true);
                    c11947a.f3794b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11947a) == coroutine_suspended) {
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

        public g(Flow flow) {
            this.f3791a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3791a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$h */
    /* loaded from: classes7.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3796a;

        /* renamed from: c */
        public final /* synthetic */ String f3798c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation continuation) {
            super(2, continuation);
            this.f3798c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8393f.this.new h(this.f3798c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3796a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlowMo3512f = C8393f.this.mo3512f();
                C8385b c8385b = new C8385b(new AbstractC8128b.e(this.f3798c));
                this.f3796a = 1;
                if (mutableSharedFlowMo3512f.emit(c8385b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.f$i */
    /* loaded from: classes7.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3799a;

        /* renamed from: b */
        public /* synthetic */ Object f3800b;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8302e c8302e, Continuation continuation) {
            return ((i) create(c8302e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            i iVar = C8393f.this.new i(continuation);
            iVar.f3800b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3799a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8302e c8302e = (C8302e) this.f3800b;
                MutableSharedFlow mutableSharedFlowMo3512f = C8393f.this.mo3512f();
                C8385b c8385b = new C8385b(new AbstractC8128b.d(c8302e.m2913h(), c8302e.m2910e()));
                this.f3799a = 1;
                if (mutableSharedFlowMo3512f.emit(c8385b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public C8393f(InvoiceHolder invoiceHolder, PaymentMethodSelector paymentMethodSelector, InternalPaylibRouter router, InterfaceC8097f analytics, CoroutineDispatchers coroutineDispatchers, InterfaceC8400a loyaltyStateMapper, InterfaceC8412a paymentWaySelector, C8397c loyaltyStateHolder, CardsHolder cardsHolder) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loyaltyStateMapper, "loyaltyStateMapper");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(loyaltyStateHolder, "loyaltyStateHolder");
        Intrinsics.checkNotNullParameter(cardsHolder, "cardsHolder");
        this.f3754a = invoiceHolder;
        this.f3755b = paymentMethodSelector;
        this.f3756c = router;
        this.f3757d = analytics;
        this.f3758e = loyaltyStateMapper;
        this.f3759f = paymentWaySelector;
        this.f3760g = loyaltyStateHolder;
        this.f3761h = cardsHolder;
        this.f3762i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f3763j = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3764k = StateFlowKt.MutableStateFlow(null);
        this.f3765l = StateFlowKt.MutableStateFlow(null);
        this.f3766m = StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: g */
    public void mo3544g() {
        C8397c c8397c = this.f3760g;
        c8397c.m3581a(!c8397c.m3582a());
        MutableStateFlow mutableStateFlowMo3546j = mo3546j();
        C8399e c8399e = (C8399e) mo3546j().getValue();
        mutableStateFlowMo3546j.setValue(c8399e != null ? C8399e.m3588a(c8399e, false, false, null, false, null, Boolean.valueOf(c8397c.m3582a()), 31, null) : null);
        m3567q();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: i */
    public void mo3545i() {
        AbstractC8096e.m1805e(this.f3757d);
        m3566p();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8384a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3512f() {
        return this.f3763j;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3543e() {
        return this.f3765l;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3546j() {
        return this.f3766m;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow getSelectedCard() {
        return this.f3764k;
    }

    /* renamed from: o */
    public final void m3565o() {
        FlowKt.launchIn(FlowKt.onEach(new b(new c(FlowKt.onEach(FlowKt.flowCombine(this.f3754a.getInvoice(), this.f3761h.getSelectedCard(), new d(null)), new e(null))), this), new f(null)), this.f3762i);
    }

    /* renamed from: p */
    public final void m3566p() {
        this.f3759f.mo3644a(InterfaceC8419e.a.CARD);
        m3567q();
        InternalPaylibRouter.DefaultImpls.pushCardsScreen$default(this.f3756c, null, 1, null);
    }

    /* renamed from: q */
    public final void m3567q() {
        String strM3579d;
        CardWithLoyalty cardWithLoyaltyFindCard;
        String actionLabel;
        C8395a c8395a = (C8395a) getSelectedCard().getValue();
        if (c8395a == null || (strM3579d = c8395a.m3579d()) == null || (cardWithLoyaltyFindCard = this.f3761h.findCard(strM3579d)) == null) {
            throw new IllegalStateException("No selected cards");
        }
        if (!this.f3760g.m3582a()) {
            this.f3761h.selectCard(cardWithLoyaltyFindCard.getId());
            FlowKt.launchIn(FlowKt.onEach(new g(this.f3754a.getInvoice()), new i(null)), this.f3762i);
            return;
        }
        Loyalty loyalty = cardWithLoyaltyFindCard.getLoyalty();
        if (loyalty == null || (actionLabel = loyalty.getActionLabel()) == null) {
            return;
        }
        this.f3755b.selectPaymentMethod(new PaymentMethod.WithLoyalty(CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentOperation[]{new PaymentOperation(PaymentOperationType.PAYMENT, "card", cardWithLoyaltyFindCard.getId()), new PaymentOperation(PaymentOperationType.PAYMENT_LOYALTY_POINTS, loyalty.getServiceCode(), String.valueOf(loyalty.getMaxAmount()))})));
        BuildersKt__Builders_commonKt.launch$default(this.f3762i, null, null, new h(actionLabel, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8384a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3509a(Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f3769c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f3769c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objFirst = aVar.f3767a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f3769c;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f3754a.getInvoice();
            aVar.f3769c = 1;
            objFirst = FlowKt.first(invoice, aVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.CARD) {
                    if (!(!r5.getCards().isEmpty())) {
                        break;
                    }
                }
            }
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d
    /* renamed from: b */
    public void mo3542b() {
        this.f3759f.mo3644a(InterfaceC8419e.a.CARD);
        m3567q();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        InternalPaylibRouter.DefaultImpls.pushPaymentScreen$default(this.f3756c, null, 1, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8384a
    /* renamed from: a */
    public void mo3510a() {
        CoroutineScopeKt.cancel$default(this.f3762i, null, 1, null);
    }

    /* renamed from: b */
    public final void m3560b(boolean z) {
        mo3543e().setValue(new C8396b(!z));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8384a
    /* renamed from: a */
    public void mo3511a(boolean z) {
        m3560b(z);
        m3565o();
    }

    /* renamed from: a */
    public final boolean m3559a(Invoice invoice) {
        return invoice.getLoyaltyInfoState() == Invoice.LoyaltyInfoState.READY_TO_LOAD;
    }
}
