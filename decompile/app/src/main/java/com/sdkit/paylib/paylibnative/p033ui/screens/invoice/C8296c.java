package com.sdkit.paylib.paylibnative.p033ui.screens.invoice;

import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibdomain.api.entity.ResultInfo;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.EnumC8219a;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8301d;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8303f;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.InterfaceC8298a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.AbstractC8420f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8421g;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c */
/* loaded from: classes5.dex */
public final class C8296c extends AbstractC8129a {

    /* renamed from: b */
    public final InvoiceHolder f3075b;

    /* renamed from: c */
    public final FinishCodeReceiver f3076c;

    /* renamed from: d */
    public final InterfaceC8097f f3077d;

    /* renamed from: e */
    public final InternalPaylibRouter f3078e;

    /* renamed from: f */
    public final InterfaceC8238l f3079f;

    /* renamed from: g */
    public final InterfaceC8298a f3080g;

    /* renamed from: h */
    public final C8303f f3081h;

    /* renamed from: i */
    public final InterfaceC8412a f3082i;

    /* renamed from: j */
    public final InterfaceC8421g f3083j;

    /* renamed from: k */
    public final CardsHolder f3084k;

    /* renamed from: l */
    public final InterfaceC8220b f3085l;

    /* renamed from: m */
    public final PaylibLogger f3086m;

    /* renamed from: n */
    public final MutableSharedFlow f3087n;

    /* renamed from: o */
    public final Flow f3088o;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3089a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8296c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3089a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8296c c8296c = C8296c.this;
                this.f3089a = 1;
                if (c8296c.m2849a(this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3091a;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3091a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: a */
        public Object f3092a;

        /* renamed from: b */
        public /* synthetic */ Object f3093b;

        /* renamed from: d */
        public int f3095d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3093b = obj;
            this.f3095d |= Integer.MIN_VALUE;
            return C8296c.this.m2849a(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public static final d f3096a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchInvoice() fetchInvoiceDetails completed";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$e */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ AsyncState f3097a;

        /* renamed from: b */
        public final /* synthetic */ C8296c f3098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AsyncState asyncState, C8296c c8296c) {
            super(1);
            this.f3097a = asyncState;
            this.f3098b = c8296c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8301d invoke(C8301d reduceState) {
            List listM2911f;
            Object next;
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            AsyncState asyncState = this.f3097a;
            C8302e c8302eM2894a = reduceState.m2894a();
            String actionTitle = null;
            String strM2913h = c8302eM2894a != null ? c8302eM2894a.m2913h() : null;
            C8302e c8302eM2894a2 = reduceState.m2894a();
            if (c8302eM2894a2 != null && (listM2911f = c8302eM2894a2.m2911f()) != null) {
                C8296c c8296c = this.f3098b;
                Iterator it = listM2911f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InterfaceC8419e.a aVarM3456a = AbstractC8369f.m3456a((PaymentWay) next);
                    Integer numValueOf = aVarM3456a != null ? Integer.valueOf(aVarM3456a.ordinal()) : null;
                    InterfaceC8419e.a aVar = (InterfaceC8419e.a) c8296c.f3082i.mo3643a().getValue();
                    if (Intrinsics.areEqual(numValueOf, aVar != null ? Integer.valueOf(aVar.ordinal()) : null)) {
                        break;
                    }
                }
                PaymentWay paymentWay = (PaymentWay) next;
                if (paymentWay != null) {
                    actionTitle = paymentWay.getActionTitle();
                }
            }
            return this.f3098b.f3080g.mo2888a(reduceState.m2894a(), this.f3097a, this.f3098b.f3081h.m2914a(AbstractC8369f.m3447a(asyncState, strM2913h, actionTitle, false)), reduceState.m2898e());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3099a;

        /* renamed from: b */
        public /* synthetic */ Object f3100b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8296c f3102a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8296c c8296c) {
                super(1);
                this.f3102a = c8296c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8301d invoke(C8301d reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return this.f3102a.f3080g.mo2888a(reduceState.m2894a(), AsyncState.Loading.INSTANCE, reduceState.m2899f(), reduceState.m2898e());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$f$b */
        /* loaded from: classes5.dex */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8296c f3103a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C8296c c8296c) {
                super(1);
                this.f3103a = c8296c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8301d invoke(C8301d reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return this.f3103a.f3080g.mo2888a(reduceState.m2894a(), AsyncState.None.INSTANCE, reduceState.m2899f(), reduceState.m2898e());
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8420f abstractC8420f, Continuation continuation) {
            return ((f) create(abstractC8420f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = C8296c.this.new f(continuation);
            fVar.f3100b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C8296c c8296c;
            Function1 bVar;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3099a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AbstractC8420f abstractC8420f = (AbstractC8420f) this.f3100b;
            if (abstractC8420f instanceof AbstractC8420f.b) {
                c8296c = C8296c.this;
                bVar = new a(c8296c);
            } else {
                if (!(abstractC8420f instanceof AbstractC8420f.c)) {
                    if (abstractC8420f instanceof AbstractC8420f.a) {
                        C8296c.this.m2852a(((AbstractC8420f.a) abstractC8420f).m3673a());
                    }
                    return Unit.INSTANCE;
                }
                c8296c = C8296c.this;
                bVar = new b(c8296c);
            }
            c8296c.m2000a(bVar);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$g */
    /* loaded from: classes6.dex */
    public static final class g implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3104a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$g$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3105a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C11927a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3106a;

                /* renamed from: b */
                public int f3107b;

                public C11927a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3106a = obj;
                    this.f3107b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3105a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11927a c11927a;
                if (continuation instanceof C11927a) {
                    c11927a = (C11927a) continuation;
                    int i = c11927a.f3107b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11927a.f3107b = i - Integer.MIN_VALUE;
                    } else {
                        c11927a = new C11927a(continuation);
                    }
                }
                Object obj2 = c11927a.f3106a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11927a.f3107b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3105a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, true);
                    c11927a.f3107b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11927a) == coroutine_suspended) {
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
            this.f3104a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3104a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3109a;

        /* renamed from: b */
        public /* synthetic */ Object f3110b;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Invoice invoice, Continuation continuation) {
            return ((h) create(invoice, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = C8296c.this.new h(continuation);
            hVar.f3110b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3109a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8296c.this.f3085l.mo2238a(Intrinsics.areEqual(((Invoice) this.f3110b).getCanSaveBindings(), Boxing.boxBoolean(true)) ? EnumC8219a.SHOW_SCREEN : EnumC8219a.NOT_SHOW_SCREEN);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3112a;

        /* renamed from: b */
        public /* synthetic */ Object f3113b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8302e c8302e) {
                super(0);
                this.f3115a = c8302e;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "getInvoiceDetails completed: invoice(" + this.f3115a.m2908c() + ") loyaltyInfoState(" + this.f3115a.m2909d() + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$i$b */
        /* loaded from: classes5.dex */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3116a;

            /* renamed from: b */
            public final /* synthetic */ C8296c f3117b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C8302e c8302e, C8296c c8296c) {
                super(1);
                this.f3116a = c8302e;
                this.f3117b = c8296c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8301d invoke(C8301d reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                AbstractC8128b dVar = this.f3116a.m2906a() ? new AbstractC8128b.d(this.f3116a.m2913h(), this.f3116a.m2910e()) : AbstractC8128b.a.f1932a;
                return this.f3117b.f3080g.mo2888a(this.f3116a, new AsyncState.Content(Unit.INSTANCE), this.f3117b.f3081h.m2914a(dVar), reduceState.m2898e());
            }
        }

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
            i iVar = C8296c.this.new i(continuation);
            iVar.f3113b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3112a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8302e c8302e = (C8302e) this.f3113b;
            PaylibLogger.DefaultImpls.d$default(C8296c.this.f3086m, null, new a(c8302e), 1, null);
            C8296c c8296c = C8296c.this;
            c8296c.m2000a(new b(c8302e, c8296c));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$j */
    /* loaded from: classes7.dex */
    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3118a;

        /* renamed from: b */
        public /* synthetic */ Object f3119b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$j$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8296c f3121a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC8128b f3122b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8296c c8296c, AbstractC8128b abstractC8128b) {
                super(1);
                this.f3121a = c8296c;
                this.f3122b = abstractC8128b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8301d invoke(C8301d reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return this.f3121a.f3080g.mo2888a(reduceState.m2894a(), new AsyncState.Content(Unit.INSTANCE), this.f3121a.f3081h.m2914a(this.f3122b), reduceState.m2898e());
            }
        }

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8128b abstractC8128b, Continuation continuation) {
            return ((j) create(abstractC8128b, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = C8296c.this.new j(continuation);
            jVar.f3119b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3118a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AbstractC8128b abstractC8128b = (AbstractC8128b) this.f3119b;
            C8296c c8296c = C8296c.this;
            c8296c.m2000a(new a(c8296c, abstractC8128b));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$k */
    /* loaded from: classes7.dex */
    public /* synthetic */ class k extends AdaptedFunctionReference implements Function3, SuspendFunction {

        /* renamed from: a */
        public static final k f3123a = new k();

        public k() {
            super(3, Pair.class, SegmentConstantPool.INITSTRING, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8419e.a aVar, CardWithLoyalty cardWithLoyalty, Continuation continuation) {
            return C8296c.m2843b(aVar, cardWithLoyalty, continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$l */
    /* loaded from: classes7.dex */
    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3124a;

        /* renamed from: b */
        public /* synthetic */ Object f3125b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$l$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8296c f3127a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC8419e.a f3128b;

            /* renamed from: c */
            public final /* synthetic */ CardWithLoyalty f3129c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8296c c8296c, InterfaceC8419e.a aVar, CardWithLoyalty cardWithLoyalty) {
                super(1);
                this.f3127a = c8296c;
                this.f3128b = aVar;
                this.f3129c = cardWithLoyalty;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final C8301d invoke(C8301d reduceState) {
                String actionTitle;
                boolean z;
                List listM2911f;
                Object next;
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                C8302e c8302eM2894a = reduceState.m2894a();
                String strM2913h = c8302eM2894a != null ? c8302eM2894a.m2913h() : null;
                if (strM2913h == null) {
                    strM2913h = "";
                }
                C8302e c8302eM2894a2 = reduceState.m2894a();
                if (c8302eM2894a2 == null || (listM2911f = c8302eM2894a2.m2911f()) == null) {
                    actionTitle = null;
                } else {
                    InterfaceC8419e.a aVar = this.f3128b;
                    Iterator it = listM2911f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        InterfaceC8419e.a aVarM3456a = AbstractC8369f.m3456a((PaymentWay) next);
                        if (aVarM3456a != null && aVarM3456a.ordinal() == aVar.ordinal()) {
                            break;
                        }
                    }
                    PaymentWay paymentWay = (PaymentWay) next;
                    if (paymentWay != null) {
                        actionTitle = paymentWay.getActionTitle();
                    }
                }
                AbstractC8128b.d dVar = new AbstractC8128b.d(strM2913h, actionTitle != null ? actionTitle : "");
                InterfaceC8298a interfaceC8298a = this.f3127a.f3080g;
                AsyncState.Content content = new AsyncState.Content(Unit.INSTANCE);
                C8302e c8302eM2894a3 = reduceState.m2894a();
                C8301d.a aVarM2914a = this.f3127a.f3081h.m2914a(dVar);
                C8296c c8296c = this.f3127a;
                InterfaceC8419e.a aVar2 = this.f3128b;
                if (aVar2 != InterfaceC8419e.a.CARD) {
                    z = false;
                } else {
                    CardWithLoyalty cardWithLoyalty = this.f3129c;
                    if ((cardWithLoyalty != null ? cardWithLoyalty.getPaymentWay() : null) == CardWithLoyalty.PaymentWay.MOBILE) {
                        z = true;
                    }
                }
                return interfaceC8298a.mo2888a(c8302eM2894a3, content, aVarM2914a, c8296c.m2853a(aVar2, z));
            }
        }

        public l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, Continuation continuation) {
            return ((l) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            l lVar = C8296c.this.new l(continuation);
            lVar.f3125b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3124a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.f3125b;
            InterfaceC8419e.a aVar = (InterfaceC8419e.a) pair.component1();
            CardWithLoyalty cardWithLoyalty = (CardWithLoyalty) pair.component2();
            C8296c c8296c = C8296c.this;
            c8296c.m2000a(new a(c8296c, aVar, cardWithLoyalty));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$m */
    /* loaded from: classes7.dex */
    public static final class m extends Lambda implements Function0 {

        /* renamed from: a */
        public static final m f3130a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onPaymentButtonClick";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$n */
    /* loaded from: classes7.dex */
    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3131a;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8296c.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3131a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC8419e interfaceC8419eM2857g = C8296c.this.m2857g();
                this.f3131a = 1;
                obj = interfaceC8419eM2857g.mo3666a(this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C8296c c8296c = C8296c.this;
                this.f3131a = 2;
                if (c8296c.m2849a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$o */
    /* loaded from: classes7.dex */
    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3133a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.c$o$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f3135a;

            static {
                int[] iArr = new int[InterfaceC8419e.a.values().length];
                try {
                    iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InterfaceC8419e.a.CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InterfaceC8419e.a.TBANK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f3135a = iArr;
            }
        }

        public o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8296c.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3133a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC8419e.a aVar = (InterfaceC8419e.a) C8296c.this.f3082i.mo3643a().getValue();
                switch (aVar == null ? -1 : a.f3135a[aVar.ordinal()]) {
                    case -1:
                    case 4:
                    case 5:
                    case 6:
                        str = null;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        str = "https://money.mail.ru/img/cards_conditions.pdf";
                        break;
                    case 2:
                    case 3:
                        str = "https://help.rustore.ru/rustore/legal_info/offers";
                        break;
                }
                if (str != null) {
                    MutableSharedFlow mutableSharedFlow = C8296c.this.f3087n;
                    this.f3133a = 1;
                    if (mutableSharedFlow.emit(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public C8296c(InvoiceHolder invoiceHolder, FinishCodeReceiver finishCodeReceiver, InterfaceC8097f analytics, InternalPaylibRouter router, InterfaceC8238l paylibStateManager, PaylibLoggerFactory loggerFactory, InterfaceC8298a mapper, C8303f paymentButtonFactory, InterfaceC8412a paymentWaySelector, InterfaceC8421g paymentWaysWidgetHandler, CardsHolder cardsHolder, InterfaceC8220b paylibSaveCardScreenStateManager) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(paymentButtonFactory, "paymentButtonFactory");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(paymentWaysWidgetHandler, "paymentWaysWidgetHandler");
        Intrinsics.checkNotNullParameter(cardsHolder, "cardsHolder");
        Intrinsics.checkNotNullParameter(paylibSaveCardScreenStateManager, "paylibSaveCardScreenStateManager");
        this.f3075b = invoiceHolder;
        this.f3076c = finishCodeReceiver;
        this.f3077d = analytics;
        this.f3078e = router;
        this.f3079f = paylibStateManager;
        this.f3080g = mapper;
        this.f3081h = paymentButtonFactory;
        this.f3082i = paymentWaySelector;
        this.f3083j = paymentWaysWidgetHandler;
        this.f3084k = cardsHolder;
        this.f3085l = paylibSaveCardScreenStateManager;
        this.f3086m = loggerFactory.get("InvoiceDetailsViewModel");
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3087n = mutableSharedFlowMutableSharedFlow$default;
        this.f3088o = mutableSharedFlowMutableSharedFlow$default;
        AbstractC8096e.m1808h(analytics);
        m2859i();
        m2862l();
        m2861k();
        m2863m();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C8301d mo1999a() {
        return new C8301d(null, null, false, false, false, true, false, false);
    }

    /* renamed from: f */
    public final InterfaceC8418d m2856f() {
        return this.f3083j;
    }

    /* renamed from: g */
    public final InterfaceC8419e m2857g() {
        return this.f3083j;
    }

    /* renamed from: h */
    public final Flow m2858h() {
        return this.f3088o;
    }

    /* renamed from: i */
    public final void m2859i() {
        m2001a(m2857g().mo3671l(), new f(null));
        m2857g().mo3670j();
    }

    /* renamed from: j */
    public final void m2860j() {
        m2854d();
    }

    /* renamed from: k */
    public final void m2861k() {
        Flow<Invoice> invoice = this.f3075b.getInvoice();
        m2001a(invoice, new h(null));
        m2001a(new g(invoice), new i(null));
    }

    /* renamed from: l */
    public final void m2862l() {
        m2001a(m2857g().mo3669i(), new j(null));
    }

    /* renamed from: m */
    public final void m2863m() {
        m2001a(FlowKt.flowCombine(FlowKt.filterNotNull(this.f3082i.mo3643a()), this.f3084k.getSelectedCard(), k.f3123a), new l(null));
    }

    /* renamed from: n */
    public final void m2864n() {
        InterfaceC8419e.a aVar = (InterfaceC8419e.a) this.f3082i.mo3643a().getValue();
        if (aVar != null) {
            AbstractC8096e.m1793a(this.f3077d, this.f3079f.mo2350b(), aVar);
        }
        PaylibLogger.DefaultImpls.d$default(this.f3086m, null, m.f3130a, 1, null);
        m2857g().mo3668c();
    }

    /* renamed from: o */
    public final void m2865o() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new n(null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        m2857g().mo3667a();
        super.onCleared();
    }

    /* renamed from: p */
    public final void m2866p() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o(null), 3, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m2843b(InterfaceC8419e.a aVar, CardWithLoyalty cardWithLoyalty, Continuation continuation) {
        return new Pair(aVar, cardWithLoyalty);
    }

    /* renamed from: d */
    public final void m2854d() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f3076c, null, 1, null);
        this.f3078e.mo2485a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2849a(Continuation continuation) throws Throwable {
        c cVar;
        Object objM15355fetchInvoiceDetailsgIAlus$default;
        C8296c c8296c;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f3095d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f3095d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        Object obj = cVar.f3093b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.f3095d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC8237k abstractC8237kMo2351c = this.f3079f.mo2351c();
            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8096e.m1791a(this.f3077d, this.f3079f.mo2350b());
                m2850a(AsyncState.Loading.INSTANCE);
                InvoiceHolder invoiceHolder = this.f3075b;
                cVar.f3092a = this;
                cVar.f3095d = 1;
                objM15355fetchInvoiceDetailsgIAlus$default = InvoiceHolder.DefaultImpls.m15355fetchInvoiceDetailsgIAlus$default(invoiceHolder, false, cVar, 1, null);
                if (objM15355fetchInvoiceDetailsgIAlus$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8296c = this;
            }
            Unit unit = Unit.INSTANCE;
            AbstractC8375j.m3481a(unit);
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c8296c = (C8296c) cVar.f3092a;
        ResultKt.throwOnFailure(obj);
        objM15355fetchInvoiceDetailsgIAlus$default = ((Result) obj).getValue();
        PaylibLogger.DefaultImpls.d$default(c8296c.f3086m, null, d.f3096a, 1, null);
        if (Result.m15706isSuccessimpl(objM15355fetchInvoiceDetailsgIAlus$default)) {
            AbstractC8096e.m1809i(c8296c.f3077d);
            c8296c.m2850a(new AsyncState.Content((ResultInfo) objM15355fetchInvoiceDetailsgIAlus$default));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15355fetchInvoiceDetailsgIAlus$default);
        if (thM15702exceptionOrNullimpl != null) {
            AbstractC8096e.m1797a(c8296c.f3077d, thM15702exceptionOrNullimpl);
            c8296c.m2852a(thM15702exceptionOrNullimpl);
        }
        Unit unit2 = Unit.INSTANCE;
        AbstractC8375j.m3481a(unit2);
        return unit2;
    }

    /* renamed from: a */
    public final void m2850a(AsyncState asyncState) {
        m2000a(new e(asyncState, this));
    }

    /* renamed from: a */
    public final void m2851a(AbstractC8128b paymentActionStyle) {
        Intrinsics.checkNotNullParameter(paymentActionStyle, "paymentActionStyle");
        if (paymentActionStyle instanceof AbstractC8128b.g ? true : paymentActionStyle instanceof AbstractC8128b.h) {
            m2865o();
        } else {
            if (paymentActionStyle instanceof AbstractC8128b.d ? true : paymentActionStyle instanceof AbstractC8128b.e ? true : paymentActionStyle instanceof AbstractC8128b.f) {
                InternalPaylibRouter.DefaultImpls.pushPaymentScreen$default(this.f3078e, null, 1, null);
            } else if (paymentActionStyle instanceof AbstractC8128b.c) {
                InternalPaylibRouter.DefaultImpls.pushCardsScreen$default(this.f3078e, null, 1, null);
            } else if (paymentActionStyle instanceof AbstractC8128b.b) {
                this.f3078e.mo2495b();
            } else {
                if (!(paymentActionStyle instanceof AbstractC8128b.a ? true : paymentActionStyle instanceof AbstractC8128b.i)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: a */
    public final void m2852a(Throwable th) {
        this.f3078e.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.INVOICE_DETAILS, AbstractC8369f.m3449a(th, false, 1, (Object) null)), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    /* renamed from: a */
    public final boolean m2853a(InterfaceC8419e.a aVar, boolean z) {
        switch (b.f3091a[aVar.ordinal()]) {
            case 1:
            case 2:
                z = true;
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return ((Boolean) AbstractC8375j.m3481a(Boolean.valueOf(z))).booleanValue();
    }
}
