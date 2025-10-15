package com.sdkit.paylib.paylibnative.p033ui.screens.payment;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncStateKt;
import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.EnumC8092a;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.AbstractC8110d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.C8206a;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.C8208c;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.InterfaceC8207b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWithLoyaltyCompleted;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c */
/* loaded from: classes5.dex */
public final class C8334c extends AbstractC8129a {

    /* renamed from: b */
    public final InterfaceC8097f f3400b;

    /* renamed from: c */
    public final C8208c f3401c;

    /* renamed from: d */
    public final InvoicePaymentInteractor f3402d;

    /* renamed from: e */
    public final FinishCodeReceiver f3403e;

    /* renamed from: f */
    public final InternalPaylibRouter f3404f;

    /* renamed from: g */
    public final InterfaceC8131b f3405g;

    /* renamed from: h */
    public final InterfaceC8093b f3406h;

    /* renamed from: i */
    public final C8106e f3407i;

    /* renamed from: j */
    public final C8107a f3408j;

    /* renamed from: k */
    public final InterfaceC8238l f3409k;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3410a;

        /* renamed from: b */
        public /* synthetic */ Object f3411b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$a$a, reason: collision with other inner class name */
        public static final class C11935a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8302e f3413a;

            /* renamed from: b */
            public final /* synthetic */ C8334c f3414b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11935a(C8302e c8302e, C8334c c8334c) {
                super(1);
                this.f3413a = c8302e;
                this.f3414b = c8334c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8336e invoke(C8336e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8336e.m3198a(reduceState, null, this.f3413a, false, !this.f3414b.f3405g.mo2007b(), this.f3414b.f3405g.isSandbox(), null, 37, null);
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8302e c8302e, Continuation continuation) {
            return ((a) create(c8302e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C8334c.this.new a(continuation);
            aVar.f3411b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3410a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8302e c8302e = (C8302e) this.f3411b;
            C8334c c8334c = C8334c.this;
            c8334c.m2000a(new C11935a(c8302e, c8334c));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3415a;

        /* renamed from: b */
        public final /* synthetic */ boolean f3416b;

        /* renamed from: c */
        public final /* synthetic */ C8334c f3417c;

        /* renamed from: d */
        public final /* synthetic */ Fragment f3418d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, C8334c c8334c, Fragment fragment, Continuation continuation) {
            super(2, continuation);
            this.f3416b = z;
            this.f3417c = c8334c;
            this.f3418d = fragment;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f3416b, this.f3417c, this.f3418d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8207b interfaceC8207b;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3415a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f3416b && this.f3417c.f3405g.mo2006a()) {
                    C8208c c8208c = this.f3417c.f3401c;
                    Fragment fragment = this.f3418d;
                    String string = fragment.getString(C11403R.string.paylib_native_payment_card_device_auth_prompt_title);
                    Intrinsics.checkNotNullExpressionValue(string, "fragment.getString(R.str…device_auth_prompt_title)");
                    String string2 = this.f3418d.getString(C11403R.string.paylib_native_payment_cancel);
                    Intrinsics.checkNotNullExpressionValue(string2, "fragment.getString(R.str…ib_native_payment_cancel)");
                    C8206a c8206a = new C8206a(string, string2, null, null, 12, null);
                    this.f3415a = 1;
                    obj = c8208c.m2179a(fragment, c8206a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC8207b = (InterfaceC8207b) obj;
                    if (!(interfaceC8207b instanceof InterfaceC8207b.b)) {
                    }
                } else {
                    C8334c c8334c = this.f3417c;
                    this.f3415a = 3;
                    if (c8334c.m3171a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                interfaceC8207b = (InterfaceC8207b) obj;
                if (!(interfaceC8207b instanceof InterfaceC8207b.b)) {
                    C8334c c8334c2 = this.f3417c;
                    this.f3415a = 2;
                    if (c8334c2.m3171a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC8207b instanceof InterfaceC8207b.a) {
                    C8334c c8334c3 = this.f3417c;
                    AbstractC8128b.h hVar = AbstractC8128b.h.f1940a;
                    String string3 = this.f3418d.getString(this.f3417c.m3170a((InterfaceC8207b.a) interfaceC8207b));
                    Intrinsics.checkNotNullExpressionValue(string3, "fragment.getString(devic…eResId(deviceAuthResult))");
                    c8334c3.m3179a(hVar, new AbstractC8337a.b(string3, null, null));
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3419a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$c$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8334c f3421a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8334c c8334c) {
                super(0);
                this.f3421a = c8334c;
            }

            /* renamed from: a */
            public final void m3189a() {
                AbstractC8096e.m1801b(this.f3421a.f3400b, this.f3421a.f3409k.mo2350b());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3189a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$c$b */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8334c f3422a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C8334c c8334c) {
                super(1);
                this.f3422a = c8334c;
            }

            /* renamed from: a */
            public final void m3190a(PaymentStatusPayload paymentStatusPayload) {
                Object value;
                MutableStateFlow mutableStateFlowM2002b = this.f3422a.m2002b();
                do {
                    value = mutableStateFlowM2002b.getValue();
                } while (!mutableStateFlowM2002b.compareAndSet(value, C8336e.m3198a((C8336e) value, null, null, false, false, false, paymentStatusPayload != null ? paymentStatusPayload.getUserMessage() : null, 31, null)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3190a((PaymentStatusPayload) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$c$c, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C11936c extends FunctionReferenceImpl implements Function1 {
            public C11936c(Object obj) {
                super(1, obj, C8334c.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPaymentStatusPayload;)V", 0);
            }

            /* renamed from: a */
            public final void m3191a(AbstractC8110d.c p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8334c) this.receiver).m3175a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3191a((AbstractC8110d.c) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$c$d */
        /* loaded from: classes8.dex */
        public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
            public d(Object obj) {
                super(1, obj, C8334c.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPurchaseStatePayload;)V", 0);
            }

            /* renamed from: a */
            public final void m3192a(AbstractC8110d.d p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8334c) this.receiver).m3176a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3192a((AbstractC8110d.d) obj);
                return Unit.INSTANCE;
            }
        }

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
            return C8334c.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3419a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8106e c8106e = C8334c.this.f3407i;
                a aVar = new a(C8334c.this);
                b bVar = new b(C8334c.this);
                C11936c c11936c = new C11936c(C8334c.this);
                d dVar = new d(C8334c.this);
                this.f3419a = 1;
                if (c8106e.m1886a((3 & 1) != 0 ? C8106e.b.f1862a : null, (3 & 2) != 0 ? C8106e.c.f1863a : aVar, (3 & 4) != 0 ? C8106e.d.f1864a : bVar, c11936c, dVar, null, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$d */
    /* loaded from: classes7.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: a */
        public Object f3423a;

        /* renamed from: b */
        public /* synthetic */ Object f3424b;

        /* renamed from: d */
        public int f3426d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3424b = obj;
            this.f3426d |= Integer.MIN_VALUE;
            return C8334c.this.m3171a(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$e */
    /* loaded from: classes7.dex */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: a */
        public static final e f3427a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8336e invoke(C8336e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8336e.m3198a(reduceState, AsyncStateKt.mapUnit(reduceState.m3203d()), null, false, false, false, null, 62, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3428a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8334c.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3428a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8334c c8334c = C8334c.this;
                this.f3428a = 1;
                if (c8334c.m3171a(this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$g */
    /* loaded from: classes6.dex */
    public static final class g implements Flow {

        /* renamed from: a */
        public final /* synthetic */ Flow f3430a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$g$a */
        public static final class a implements FlowCollector, SuspendFunction {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f3431a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.c$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C11937a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f3432a;

                /* renamed from: b */
                public int f3433b;

                public C11937a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3432a = obj;
                    this.f3433b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f3431a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C11937a c11937a;
                if (continuation instanceof C11937a) {
                    c11937a = (C11937a) continuation;
                    int i = c11937a.f3433b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c11937a.f3433b = i - Integer.MIN_VALUE;
                    } else {
                        c11937a = new C11937a(continuation);
                    }
                }
                Object obj2 = c11937a.f3432a;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c11937a.f3433b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f3431a;
                    C8302e c8302eM3450a = AbstractC8369f.m3450a((Invoice) obj, false);
                    c11937a.f3433b = 1;
                    if (flowCollector.emit(c8302eM3450a, c11937a) == coroutine_suspended) {
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
            this.f3430a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f3430a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    public C8334c(InterfaceC8097f analytics, C8208c deviceAuthenticator, InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8093b paymentMethodProvider, C8106e paymentStateCheckerWithRetries, C8107a errorHandler, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(deviceAuthenticator, "deviceAuthenticator");
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentMethodProvider, "paymentMethodProvider");
        Intrinsics.checkNotNullParameter(paymentStateCheckerWithRetries, "paymentStateCheckerWithRetries");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f3400b = analytics;
        this.f3401c = deviceAuthenticator;
        this.f3402d = invoicePaymentInteractor;
        this.f3403e = finishCodeReceiver;
        this.f3404f = router;
        this.f3405g = config;
        this.f3406h = paymentMethodProvider;
        this.f3407i = paymentStateCheckerWithRetries;
        this.f3408j = errorHandler;
        this.f3409k = paylibStateManager;
        m2001a(new g(invoiceHolder.getInvoice()), new a(null));
    }

    /* renamed from: a */
    public final int m3170a(InterfaceC8207b.a aVar) {
        if (aVar instanceof InterfaceC8207b.a.b) {
            return C11403R.string.paylib_native_payment_card_device_auth_error_cannot_authenticate;
        }
        if (aVar instanceof InterfaceC8207b.a.C11910a) {
            return C11403R.string.paylib_native_payment_card_device_auth_error_cancelled;
        }
        if (aVar instanceof InterfaceC8207b.a.c) {
            return C11403R.string.paylib_native_payment_card_device_auth_error_unknown;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8336e mo1999a() {
        return new C8336e(AsyncState.None.INSTANCE, null, false, true, false, null);
    }

    /* renamed from: g */
    public final void m3184g() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    /* renamed from: d */
    public final void m3181d() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    /* renamed from: e */
    public final void m3182e() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f3403e, null, 1, null);
        this.f3404f.mo2485a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3171a(Continuation continuation) throws Throwable {
        d dVar;
        C8334c c8334c;
        Object value;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.f3426d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f3426d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        }
        Object obj = dVar.f3424b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.f3426d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC8096e.m1801b(this.f3400b, this.f3409k.mo2350b());
            m2000a(e.f3427a);
            InvoicePaymentInteractor invoicePaymentInteractor = this.f3402d;
            dVar.f3423a = this;
            dVar.f3426d = 1;
            Object objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(dVar);
            if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8334c = this;
            value = objMo15356confirmPaymentIoAF18A;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8334c = (C8334c) dVar.f3423a;
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
        }
        if (Result.m15706isSuccessimpl(value)) {
            c8334c.m3174a((ConfirmPaymentResult) value);
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(value);
        if (thM15702exceptionOrNullimpl != null) {
            c8334c.m3180a(thM15702exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void m3172a(Bundle bundle, Fragment fragment) {
        AbstractC8128b abstractC8128b;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (bundle != null) {
            abstractC8128b = (AbstractC8128b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("ERROR_ACTION", AbstractC8128b.class) : bundle.getParcelable("ERROR_ACTION"));
        } else {
            abstractC8128b = null;
        }
        if (abstractC8128b != null) {
            m3178a(abstractC8128b);
        } else {
            m3173a(fragment);
        }
    }

    /* renamed from: a */
    public final void m3173a(Fragment fragment) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(this.f3406h.getPaymentMethod() == EnumC8092a.CARD, this, fragment, null), 3, null);
    }

    /* renamed from: a */
    public final void m3174a(ConfirmPaymentResult confirmPaymentResult) {
        if (confirmPaymentResult.getPaymentAction() instanceof PaymentWithLoyaltyCompleted) {
            AbstractC8096e.m1822v(this.f3400b);
        } else {
            AbstractC8096e.m1802b(this.f3400b, this.f3409k.mo2350b(), this.f3406h.getPaymentMethod());
        }
        m3181d();
    }

    /* renamed from: a */
    public final void m3175a(AbstractC8110d.c cVar) {
        this.f3408j.m1915a(cVar, EnumC8262b.PAYMENT, null);
    }

    /* renamed from: a */
    public final void m3176a(AbstractC8110d.d dVar) {
        this.f3408j.m1915a(dVar, EnumC8262b.PAYMENT, null);
    }

    /* renamed from: a */
    public final void m3177a(AbstractC8110d.e eVar) {
        this.f3408j.m1915a(eVar, EnumC8262b.PAYMENT, null);
    }

    /* renamed from: a */
    public final void m3178a(AbstractC8128b abstractC8128b) {
        if (abstractC8128b instanceof AbstractC8128b.i) {
            m3181d();
        } else if (abstractC8128b instanceof AbstractC8128b.h) {
            m3184g();
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: a */
    public final void m3179a(AbstractC8128b abstractC8128b, AbstractC8337a abstractC8337a) {
        this.f3404f.mo2491a(new C8340d(null, abstractC8337a, new C8261a(EnumC8262b.PAYMENT, abstractC8128b), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    /* renamed from: a */
    public final void m3180a(Throwable th) {
        AbstractC8096e.m1792a(this.f3400b, this.f3409k.mo2350b(), this.f3406h.getPaymentMethod());
        m3177a(new AbstractC8110d.e(th, false));
    }
}
