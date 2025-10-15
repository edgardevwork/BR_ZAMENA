package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.error.AbstractC8110d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8229c;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d */
/* loaded from: classes5.dex */
public final class C8290d extends AbstractC8129a {

    /* renamed from: b */
    public final InterfaceC8097f f2996b;

    /* renamed from: c */
    public final InvoiceHolder f2997c;

    /* renamed from: d */
    public final InternalPaylibRouter f2998d;

    /* renamed from: e */
    public final InterfaceC8238l f2999e;

    /* renamed from: f */
    public final C8106e f3000f;

    /* renamed from: g */
    public final C8107a f3001g;

    /* renamed from: h */
    public final InterfaceC8131b f3002h;

    /* renamed from: i */
    public final C8229c f3003i;

    /* renamed from: j */
    public final PaylibLogger f3004j;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3005a;

        static {
            int[] iArr = new int[SbolPayFinishState.values().length];
            try {
                iArr[SbolPayFinishState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SbolPayFinishState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SbolPayFinishState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SbolPayFinishState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SbolPayFinishState.INCORRECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3005a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3006a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8290d f3008a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$b$a$a, reason: collision with other inner class name */
            public static final class C11924a extends Lambda implements Function1 {

                /* renamed from: a */
                public final /* synthetic */ String f3009a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11924a(String str) {
                    super(1);
                    this.f3009a = str;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C8293g invoke(C8293g reduceState) {
                    Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                    return C8293g.m2783a(reduceState, null, false, false, null, this.f3009a, 15, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8290d c8290d) {
                super(1);
                this.f3008a = c8290d;
            }

            /* renamed from: a */
            public final void m2766a(PaymentStatusPayload paymentStatusPayload) {
                String userMessage;
                if (paymentStatusPayload == null || (userMessage = paymentStatusPayload.getUserMessage()) == null) {
                    return;
                }
                this.f3008a.m2000a(new C11924a(userMessage));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2766a((PaymentStatusPayload) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C11925b extends FunctionReferenceImpl implements Function1 {
            public C11925b(Object obj) {
                super(1, obj, C8290d.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPaymentStatusPayload;)V", 0);
            }

            /* renamed from: a */
            public final void m2768a(AbstractC8110d.c p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8290d) this.receiver).m2753a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2768a((AbstractC8110d.c) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$b$c */
        /* loaded from: classes8.dex */
        public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
            public c(Object obj) {
                super(1, obj, C8290d.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPurchaseStatePayload;)V", 0);
            }

            /* renamed from: a */
            public final void m2769a(AbstractC8110d.d p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8290d) this.receiver).m2754a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2769a((AbstractC8110d.d) obj);
                return Unit.INSTANCE;
            }
        }

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
            return C8290d.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3006a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8106e c8106e = C8290d.this.f3000f;
                a aVar = new a(C8290d.this);
                C11925b c11925b = new C11925b(C8290d.this);
                c cVar = new c(C8290d.this);
                this.f3006a = 1;
                if (c8106e.m1886a((3 & 1) != 0 ? C8106e.b.f1862a : null, (3 & 2) != 0 ? C8106e.c.f1863a : null, (3 & 4) != 0 ? C8106e.d.f1864a : aVar, c11925b, cVar, null, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$c */
    /* loaded from: classes6.dex */
    public static final class c implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3010a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$c$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3011a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C11926a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3012a;

                /* renamed from: b */
                public int f3013b;

                public C11926a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3012a = obj;
                    this.f3013b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3011a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11926a c11926a;
                if (continuation instanceof C11926a) {
                    c11926a = (C11926a) continuation;
                    int i = c11926a.f3013b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11926a.f3013b = i - Integer.MIN_VALUE;
                    } else {
                        c11926a = new C11926a(continuation);
                    }
                }
                Object obj2 = c11926a.f3012a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11926a.f3013b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3011a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, false);
                    c11926a.f3013b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11926a) == coroutine_suspended) {
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
            this.f3010a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3010a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3015a;

        /* renamed from: b */
        public /* synthetic */ Object f3016b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3018a;

            /* renamed from: b */
            public final /* synthetic */ C8290d f3019b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8302e c8302e, C8290d c8290d) {
                super(1);
                this.f3018a = c8302e;
                this.f3019b = c8290d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8293g invoke(C8293g reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8293g.m2783a(reduceState, this.f3018a, !this.f3019b.f3002h.mo2007b(), this.f3019b.f3002h.isSandbox(), null, null, 24, null);
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8302e c8302e, Continuation continuation) {
            return ((d) create(c8302e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C8290d.this.new d(continuation);
            dVar.f3016b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3015a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8302e c8302e = (C8302e) this.f3016b;
            C8290d c8290d = C8290d.this;
            c8290d.m2000a(new a(c8302e, c8290d));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3020a;

        /* renamed from: c */
        public final /* synthetic */ String f3022c;

        /* renamed from: d */
        public final /* synthetic */ FinishReason f3023d;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public static final a f3024a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Библиотека находится в неконсистентном состоянии";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, FinishReason finishReason, Continuation continuation) {
            super(2, continuation);
            this.f3022c = str;
            this.f3023d = finishReason;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8290d.this.new e(this.f3022c, this.f3023d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM2273a;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3020a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8229c c8229c = C8290d.this.f3003i;
                String str = this.f3022c;
                this.f3020a = 1;
                objM2273a = c8229c.m2273a(str, true, this);
                if (objM2273a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM2273a = ((Result) obj).getValue();
            }
            FinishReason finishReason = this.f3023d;
            C8290d c8290d = C8290d.this;
            if (Result.m15706isSuccessimpl(objM2273a)) {
                if (finishReason instanceof FinishReason.SbolPayCompletedWithState) {
                    c8290d.m2750a(((FinishReason.SbolPayCompletedWithState) finishReason).getState());
                } else if (finishReason instanceof FinishReason.SbpPayCompletedWithState) {
                    c8290d.m2759d();
                } else if (finishReason instanceof FinishReason.TPayCompletedWithState) {
                    c8290d.m2758b(((FinishReason.TPayCompletedWithState) finishReason).isSuccessful());
                } else {
                    if (!(finishReason instanceof FinishReason.SbolPayCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PaylibLogger.DefaultImpls.e$default(c8290d.f3004j, null, a.f3024a, 1, null);
                    c8290d.m2755a(new AbstractC8110d.e(new PaylibIllegalStateException(), false));
                }
                AbstractC8375j.m3481a(Unit.INSTANCE);
            }
            C8290d c8290d2 = C8290d.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2273a);
            if (thM15702exceptionOrNullimpl != null) {
                c8290d2.m2755a(new AbstractC8110d.e(thM15702exceptionOrNullimpl, false));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f3025a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onViewPaused() LongPolling активен - недожидаемся и переходим на ручное обновление";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.d$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f3026a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onViewPaused() LongPolling не активен";
        }
    }

    public C8290d(InterfaceC8097f analytics, InvoiceHolder invoiceHolder, InternalPaylibRouter router, InterfaceC8238l paylibStateManager, C8106e paymentStateCheckerWithRetries, C8107a errorHandler, InterfaceC8131b config, C8229c loadInvoiceDetailsInteractor, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paymentStateCheckerWithRetries, "paymentStateCheckerWithRetries");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loadInvoiceDetailsInteractor, "loadInvoiceDetailsInteractor");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2996b = analytics;
        this.f2997c = invoiceHolder;
        this.f2998d = router;
        this.f2999e = paylibStateManager;
        this.f3000f = paymentStateCheckerWithRetries;
        this.f3001g = errorHandler;
        this.f3002h = config;
        this.f3003i = loadInvoiceDetailsInteractor;
        this.f3004j = loggerFactory.get("DeeplinkResultViewModel");
        m2762g();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8293g mo1999a() {
        return new C8293g(null, false, false, null, null);
    }

    /* renamed from: g */
    public final void m2762g() {
        m2001a(new c(this.f2997c.getInvoice()), new d(null));
    }

    /* renamed from: h */
    public final void m2763h() {
        FinishReason finishReasonM2316b;
        String strM2317c;
        AbstractC8237k abstractC8237kMo2351c = this.f2999e.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e.b) {
            AbstractC8237k.e.b bVar = (AbstractC8237k.e.b) abstractC8237kMo2351c;
            finishReasonM2316b = bVar.m2310b();
            strM2317c = bVar.mo2309a().m2311a();
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.b) {
            AbstractC8237k.g.b bVar2 = (AbstractC8237k.g.b) abstractC8237kMo2351c;
            finishReasonM2316b = bVar2.m2330b();
            strM2317c = bVar2.m2331c();
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.a.c) {
            AbstractC8237k.a.c cVar = (AbstractC8237k.a.c) abstractC8237kMo2351c;
            finishReasonM2316b = cVar.m2304b();
            strM2317c = cVar.m2305c();
        } else {
            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.f.b)) {
                if (abstractC8237kMo2351c instanceof AbstractC8237k.c) {
                    m2755a(new AbstractC8110d.e(new PaylibIllegalStateException(), false));
                } else {
                    if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.e.d ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a.d ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                AbstractC8375j.m3481a(Unit.INSTANCE);
            }
            AbstractC8237k.f.b bVar3 = (AbstractC8237k.f.b) abstractC8237kMo2351c;
            finishReasonM2316b = bVar3.m2316b();
            strM2317c = bVar3.m2317c();
        }
        m2751a(finishReasonM2316b, strM2317c);
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: i */
    public final void m2764i() {
        if (!this.f3000f.m1888a()) {
            PaylibLogger.DefaultImpls.d$default(this.f3004j, null, g.f3026a, 1, null);
        } else {
            PaylibLogger.DefaultImpls.d$default(this.f3004j, null, f.f3025a, 1, null);
            this.f2998d.mo2499d();
        }
    }

    /* renamed from: a */
    public final void m2749a(Bundle bundle) {
        AbstractC8128b abstractC8128b;
        if (bundle != null) {
            abstractC8128b = (AbstractC8128b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("ERROR_ACTION", AbstractC8128b.class) : bundle.getParcelable("ERROR_ACTION"));
        } else {
            abstractC8128b = null;
        }
        boolean z = bundle != null ? bundle.getBoolean("manual_update") : false;
        if (abstractC8128b != null) {
            m2756a(abstractC8128b);
        } else {
            m2757a(z);
        }
    }

    /* renamed from: b */
    public final void m2758b(boolean z) {
        if (z) {
            m2759d();
        } else {
            m2755a(new AbstractC8110d.e(null, false));
        }
    }

    /* renamed from: d */
    public final void m2759d() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    /* renamed from: e */
    public final void m2760e() {
        this.f2998d.mo2485a();
    }

    /* renamed from: a */
    public final void m2750a(SbolPayFinishState sbolPayFinishState) {
        AbstractC8110d.b bVar;
        int i = a.f3005a[sbolPayFinishState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AbstractC8096e.m1812l(this.f2996b);
                bVar = new AbstractC8110d.b(AbstractC8291e.m2778b(sbolPayFinishState), false);
            } else {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8096e.m1813m(this.f2996b);
                bVar = new AbstractC8110d.b(AbstractC8291e.m2778b(sbolPayFinishState), false);
            }
            m2752a(bVar);
        } else {
            m2759d();
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: a */
    public final void m2751a(FinishReason finishReason, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(str, finishReason, null), 3, null);
    }

    /* renamed from: a */
    public final void m2752a(AbstractC8110d.b bVar) {
        this.f3001g.m1915a(bVar, EnumC8262b.NONE, null);
    }

    /* renamed from: a */
    public final void m2753a(AbstractC8110d.c cVar) {
        this.f3001g.m1915a(new AbstractC8110d.b(AbstractC8291e.m2779b(cVar.m1931a().getPaymentStatus()), cVar.m1932b()), EnumC8262b.NONE, null);
    }

    /* renamed from: a */
    public final void m2754a(AbstractC8110d.d dVar) {
        this.f3001g.m1915a(dVar, EnumC8262b.PAYMENT, null);
    }

    /* renamed from: a */
    public final void m2755a(AbstractC8110d.e eVar) {
        this.f3001g.m1915a(eVar, EnumC8262b.NONE, null);
    }

    /* renamed from: a */
    public final void m2756a(AbstractC8128b abstractC8128b) {
        if (abstractC8128b instanceof AbstractC8128b.i) {
            m2759d();
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: a */
    public final void m2757a(boolean z) {
        if (z) {
            m2759d();
        } else {
            m2763h();
        }
    }
}
