package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.AbstractC8217a;
import com.sdkit.paylib.paylibnative.p033ui.domain.InterfaceC8218b;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.EnumC8219a;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8265e;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.viewobjects.AbstractC8281b;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.viewobjects.C8280a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8397c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.AbstractC8427a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8430d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.SbolPayProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d */
/* loaded from: classes5.dex */
public final class C8277d extends AbstractC8129a {

    /* renamed from: b */
    public final FinishCodeReceiver f2867b;

    /* renamed from: c */
    public final InvoiceHolder f2868c;

    /* renamed from: d */
    public final InternalPaylibRouter f2869d;

    /* renamed from: e */
    public final InterfaceC8430d f2870e;

    /* renamed from: f */
    public final InterfaceC8131b f2871f;

    /* renamed from: g */
    public final C8397c f2872g;

    /* renamed from: h */
    public final InterfaceC8097f f2873h;

    /* renamed from: i */
    public final InterfaceC8412a f2874i;

    /* renamed from: j */
    public final CardsHolder f2875j;

    /* renamed from: k */
    public final InterfaceC8220b f2876k;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2877a;

        /* renamed from: b */
        public /* synthetic */ Object f2878b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C11916a implements Flow {

            /* renamed from: a */
            public final /* synthetic */ Flow f2880a;

            /* renamed from: b */
            public final /* synthetic */ List f2881b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$a$a$a, reason: collision with other inner class name */
            public static final class C11917a implements FlowCollector, SuspendFunction {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f2882a;

                /* renamed from: b */
                public final /* synthetic */ List f2883b;

                /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C11918a extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f2884a;

                    /* renamed from: b */
                    public int f2885b;

                    public C11918a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f2884a = obj;
                        this.f2885b |= Integer.MIN_VALUE;
                        return C11917a.this.emit(null, this);
                    }
                }

                public C11917a(FlowCollector flowCollector, List list) {
                    this.f2882a = flowCollector;
                    this.f2883b = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    C11918a c11918a;
                    if (continuation instanceof C11918a) {
                        c11918a = (C11918a) continuation;
                        int i = c11918a.f2885b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c11918a.f2885b = i - Integer.MIN_VALUE;
                        } else {
                            c11918a = new C11918a(continuation);
                        }
                    }
                    Object obj2 = c11918a.f2884a;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = c11918a.f2885b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f2882a;
                        Pair pairM7112to = TuplesKt.m7112to(this.f2883b, (Invoice) obj);
                        c11918a.f2885b = 1;
                        if (flowCollector.emit(pairM7112to, c11918a) == coroutine_suspended) {
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

            public C11916a(Flow flow, List list) {
                this.f2880a = flow;
                this.f2881b = list;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f2880a.collect(new C11917a(flowCollector, this.f2881b), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C8277d.this.new a(continuation);
            aVar.f2878b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2877a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new C11916a(C8277d.this.f2868c.getInvoice(), (List) this.f2878b);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2887a;

        /* renamed from: b */
        public /* synthetic */ Object f2888b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements Flow {

            /* renamed from: a */
            public final /* synthetic */ Flow f2890a;

            /* renamed from: b */
            public final /* synthetic */ List f2891b;

            /* renamed from: c */
            public final /* synthetic */ Invoice f2892c;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$b$a$a, reason: collision with other inner class name */
            public static final class C11919a implements FlowCollector, SuspendFunction {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f2893a;

                /* renamed from: b */
                public final /* synthetic */ List f2894b;

                /* renamed from: c */
                public final /* synthetic */ Invoice f2895c;

                /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C11920a extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f2896a;

                    /* renamed from: b */
                    public int f2897b;

                    public C11920a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f2896a = obj;
                        this.f2897b |= Integer.MIN_VALUE;
                        return C11919a.this.emit(null, this);
                    }
                }

                public C11919a(FlowCollector flowCollector, List list, Invoice invoice) {
                    this.f2893a = flowCollector;
                    this.f2894b = list;
                    this.f2895c = invoice;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    C11920a c11920a;
                    if (continuation instanceof C11920a) {
                        c11920a = (C11920a) continuation;
                        int i = c11920a.f2897b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c11920a.f2897b = i - Integer.MIN_VALUE;
                        } else {
                            c11920a = new C11920a(continuation);
                        }
                    }
                    Object obj2 = c11920a.f2896a;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = c11920a.f2897b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f2893a;
                        Triple triple = new Triple(this.f2894b, this.f2895c, (CardWithLoyalty) obj);
                        c11920a.f2897b = 1;
                        if (flowCollector.emit(triple, c11920a) == coroutine_suspended) {
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

            public a(Flow flow, List list, Invoice invoice) {
                this.f2890a = flow;
                this.f2891b = list;
                this.f2892c = invoice;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f2890a.collect(new C11919a(flowCollector, this.f2891b, this.f2892c), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, Continuation continuation) {
            return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = C8277d.this.new b(continuation);
            bVar.f2888b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.f2888b;
            return new a(FlowKt.filterNotNull(C8277d.this.f2875j.getSelectedCard()), (List) pair.component1(), (Invoice) pair.component2());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2899a;

        /* renamed from: b */
        public /* synthetic */ Object f2900b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ Invoice f2902a;

            /* renamed from: b */
            public final /* synthetic */ C8277d f2903b;

            /* renamed from: c */
            public final /* synthetic */ List f2904c;

            /* renamed from: d */
            public final /* synthetic */ boolean f2905d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Invoice invoice, C8277d c8277d, List list, boolean z) {
                super(1);
                this.f2902a = invoice;
                this.f2903b = c8277d;
                this.f2904c = list;
                this.f2905d = z;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8279f invoke(C8279f reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8279f.m2673a(reduceState, this.f2904c, this.f2905d, null, AbstractC8369f.m3450a(this.f2902a, false), !this.f2903b.f2871f.mo2007b(), this.f2903b.f2871f.isSandbox(), this.f2903b.f2871f.isPaylibAddCardFlowWithProfileEnabled() ? C11403R.string.paylib_native_payment_add_new_card : C11403R.string.paylib_native_add_card_and_pay, 4, null);
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, Continuation continuation) {
            return ((c) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = C8277d.this.new c(continuation);
            cVar.f2900b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2899a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.f2900b;
            List list = (List) pair.component1();
            Invoice invoice = (Invoice) pair.component2();
            List<PaymentWay> paymentWays = invoice.getPaymentWays();
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
            C8277d c8277d = C8277d.this;
            c8277d.m2000a(new a(invoice, c8277d, list, z));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2906a;

        /* renamed from: b */
        public /* synthetic */ Object f2907b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public static final a f2909a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8279f invoke(C8279f reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8279f.m2673a(reduceState, null, false, AbstractC8217a.a.f2384a, null, false, false, 0, 123, null);
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8427a abstractC8427a, Continuation continuation) {
            return ((d) create(abstractC8427a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C8277d.this.new d(continuation);
            dVar.f2907b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C8277d c8277d;
            Throwable thMo2235a;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = (AbstractC8427a) this.f2907b;
            if (obj2 instanceof AbstractC8427a.b) {
                C8277d.this.m2000a(a.f2909a);
            } else {
                if (obj2 instanceof AbstractC8427a.a) {
                    c8277d = C8277d.this;
                    thMo2235a = ((AbstractC8427a.a) obj2).mo2235a();
                } else if (obj2 instanceof InterfaceC8218b) {
                    c8277d = C8277d.this;
                    thMo2235a = ((InterfaceC8218b) obj2).mo2235a();
                }
                c8277d.m2654a(thMo2235a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2910a;

        /* renamed from: c */
        public final /* synthetic */ C8395a f2912c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8277d f2913a;

            /* renamed from: b */
            public final /* synthetic */ C8395a f2914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8277d c8277d, C8395a c8395a) {
                super(1);
                this.f2913a = c8277d;
                this.f2914b = c8395a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8279f invoke(C8279f reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8279f.m2673a(reduceState, this.f2913a.m2652a(reduceState.m2677c(), this.f2914b), false, null, null, false, false, 0, 126, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8395a c8395a, Continuation continuation) {
            super(2, continuation);
            this.f2912c = c8395a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8277d.this.new e(this.f2912c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2910a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(C8277d.this.f2875j.getSelectedCard());
                this.f2910a = 1;
                obj = FlowKt.first(flowFilterNotNull, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean z = !Intrinsics.areEqual(((CardWithLoyalty) obj).getId(), this.f2912c.m3579d());
            C8277d.this.f2875j.selectCard(this.f2912c.m3579d());
            C8277d c8277d = C8277d.this;
            c8277d.m2000a(new a(c8277d, this.f2912c));
            if (z) {
                C8277d.this.f2872g.m3583b();
            }
            InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(C8277d.this.f2869d, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$f */
    public static final class f extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ C8395a f2915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C8395a c8395a) {
            super(1);
            this.f2915a = c8395a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8280a invoke(C8280a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C8280a.m2682a(it, null, Intrinsics.areEqual(it.m2684a(), this.f2915a), 1, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$g */
    /* loaded from: classes7.dex */
    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2916a;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8277d.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2916a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Invoice> invoice = C8277d.this.f2868c.getInvoice();
                this.f2916a = 1;
                obj = FlowKt.first(invoice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zIsSubscription = ((Invoice) obj).isSubscription();
            if (C8277d.this.f2871f.isPaylibUseSaveCardFlowEnabled() && !zIsSubscription && C8277d.this.f2876k.mo2237a() == EnumC8219a.SHOW_SCREEN) {
                C8277d.this.f2869d.mo2489a(EnumC8265e.CARDS);
            } else {
                C8277d.this.f2869d.mo2493a(new C8357a(false, false, null, false));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$h */
    /* loaded from: classes6.dex */
    public static final class h implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f2918a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$h$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f2919a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C11921a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f2920a;

                /* renamed from: b */
                public int f2921b;

                public C11921a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f2920a = obj;
                    this.f2921b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f2919a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11921a c11921a;
                if (continuation instanceof C11921a) {
                    c11921a = (C11921a) continuation;
                    int i = c11921a.f2921b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11921a.f2921b = i - Integer.MIN_VALUE;
                    } else {
                        c11921a = new C11921a(continuation);
                    }
                }
                Object obj2 = c11921a.f2920a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11921a.f2921b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f2919a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC8369f.m3455a((CardWithLoyalty) it.next()));
                    }
                    c11921a.f2921b = 1;
                    if (flowCollector.emit(arrayList, c11921a) == coroutine_suspended) {
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

        public h(Flow flow) {
            this.f2918a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f2918a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$i */
    /* loaded from: classes6.dex */
    public static final class i implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f2923a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$i$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f2924a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.d$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C11922a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f2925a;

                /* renamed from: b */
                public int f2926b;

                public C11922a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f2925a = obj;
                    this.f2926b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f2924a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11922a c11922a;
                if (continuation instanceof C11922a) {
                    c11922a = (C11922a) continuation;
                    int i = c11922a.f2926b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11922a.f2926b = i - Integer.MIN_VALUE;
                    } else {
                        c11922a = new C11922a(continuation);
                    }
                }
                Object obj2 = c11922a.f2925a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11922a.f2926b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f2924a;
                    Triple triple = (Triple) obj;
                    List list = (List) triple.component1();
                    Pair pairM7112to = TuplesKt.m7112to(AbstractC8281b.m2686a(list, ((CardWithLoyalty) triple.component3()).getId()), (Invoice) triple.component2());
                    c11922a.f2926b = 1;
                    if (flowCollector.emit(pairM7112to, c11922a) == coroutine_suspended) {
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

        public i(Flow flow) {
            this.f2923a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f2923a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    public C8277d(FinishCodeReceiver finishCodeReceiver, InvoiceHolder invoiceHolder, InternalPaylibRouter router, InterfaceC8430d sbolPayWidgetHandler, InterfaceC8131b config, C8397c loyaltyStateHolder, InterfaceC8097f analytics, InterfaceC8412a paymentWaySelector, CardsHolder cardsHolder, InterfaceC8220b paylibSaveCardScreenStateManager) {
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(sbolPayWidgetHandler, "sbolPayWidgetHandler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loyaltyStateHolder, "loyaltyStateHolder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(cardsHolder, "cardsHolder");
        Intrinsics.checkNotNullParameter(paylibSaveCardScreenStateManager, "paylibSaveCardScreenStateManager");
        this.f2867b = finishCodeReceiver;
        this.f2868c = invoiceHolder;
        this.f2869d = router;
        this.f2870e = sbolPayWidgetHandler;
        this.f2871f = config;
        this.f2872g = loyaltyStateHolder;
        this.f2873h = analytics;
        this.f2874i = paymentWaySelector;
        this.f2875j = cardsHolder;
        this.f2876k = paylibSaveCardScreenStateManager;
        m2001a(new i(FlowKt.flatMapConcat(FlowKt.flatMapConcat(new h(cardsHolder.getCards()), new a(null)), new b(null))), new c(null));
        m2001a(sbolPayWidgetHandler.mo3710d(), new d(null));
        SbolPayProvider.DefaultImpls.init$default(sbolPayWidgetHandler, false, 1, null);
        AbstractC8096e.m1804d(analytics);
    }

    /* renamed from: g */
    public final void m2658g() {
        this.f2874i.mo3644a(InterfaceC8419e.a.WEBPAY);
        if (this.f2871f.isPaylibAddCardFlowWithProfileEnabled()) {
            AbstractC8096e.m1789a(this.f2873h);
            this.f2869d.mo2495b();
        } else {
            AbstractC8096e.m1800b(this.f2873h);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
        }
    }

    /* renamed from: h */
    public final void m2659h() {
        this.f2870e.mo3490c();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f2870e.mo3708a();
        super.onCleared();
    }

    /* renamed from: d */
    public final void m2655d() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f2867b, null, 1, null);
        this.f2869d.mo2485a();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C8279f mo1999a() {
        return new C8279f(CollectionsKt__CollectionsKt.emptyList(), false, AbstractC8217a.a.f2384a, null, true, false, C11403R.string.paylib_native_add_card_and_pay);
    }

    /* renamed from: f */
    public final void m2657f() {
        InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f2869d, null, 1, null);
    }

    /* renamed from: a */
    public final List m2652a(List list, C8395a c8395a) {
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(list), new f(c8395a)));
    }

    /* renamed from: a */
    public final void m2653a(C8395a card) {
        Intrinsics.checkNotNullParameter(card, "card");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(card, null), 3, null);
    }

    /* renamed from: a */
    public final void m2654a(Throwable th) {
        this.f2869d.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.CARDS, AbstractC8369f.m3449a(th, false, 1, (Object) null)), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }
}
