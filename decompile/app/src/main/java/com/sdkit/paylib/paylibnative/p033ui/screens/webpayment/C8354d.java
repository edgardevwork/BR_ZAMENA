package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.AbstractC8110d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.AbstractC8353c;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WebPaymentLinkCreated;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d */
/* loaded from: classes5.dex */
public final class C8354d extends AbstractC8129a {

    /* renamed from: b */
    public final InvoicePaymentInteractor f3598b;

    /* renamed from: c */
    public final FinishCodeReceiver f3599c;

    /* renamed from: d */
    public final InterfaceC8097f f3600d;

    /* renamed from: e */
    public final InternalPaylibRouter f3601e;

    /* renamed from: f */
    public final C8106e f3602f;

    /* renamed from: g */
    public final C8107a f3603g;

    /* renamed from: h */
    public final PaymentMethodSelector f3604h;

    /* renamed from: i */
    public final InterfaceC8131b f3605i;

    /* renamed from: j */
    public final InterfaceC8238l f3606j;

    /* renamed from: k */
    public final PaylibLogger f3607k;

    /* renamed from: l */
    public CoroutineScope f3608l;

    /* renamed from: m */
    public C8357a f3609m;

    /* renamed from: n */
    public final MutableSharedFlow f3610n;

    /* renamed from: o */
    public final Flow f3611o;

    /* renamed from: p */
    public final MutableSharedFlow f3612p;

    /* renamed from: q */
    public final Flow f3613q;

    /* renamed from: r */
    public final List f3614r;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3615a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C11944a extends FunctionReferenceImpl implements Function1 {
            public C11944a(Object obj) {
                super(1, obj, C8354d.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPaymentStatusPayload;)V", 0);
            }

            /* renamed from: a */
            public final void m3393a(AbstractC8110d.c p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8354d) this.receiver).m3369a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3393a((AbstractC8110d.c) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$b */
        /* loaded from: classes8.dex */
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
            public b(Object obj) {
                super(1, obj, C8354d.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithPurchaseStatePayload;)V", 0);
            }

            /* renamed from: a */
            public final void m3394a(AbstractC8110d.d p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8354d) this.receiver).m3370a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3394a((AbstractC8110d.d) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$c */
        /* loaded from: classes8.dex */
        public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
            public c(Object obj) {
                super(1, obj, C8354d.class, "showError", "showError(Lcom/sdkit/paylib/paylibnative/ui/common/error/ErrorType$WithThrowable;)V", 0);
            }

            /* renamed from: a */
            public final void m3395a(AbstractC8110d.e p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C8354d) this.receiver).m3371a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3395a((AbstractC8110d.e) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$d */
        public static final class d extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8354d f3617a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C8354d c8354d) {
                super(0);
                this.f3617a = c8354d;
            }

            /* renamed from: a */
            public final void m3396a() {
                AbstractC8096e.m1821u(this.f3617a.f3600d);
                this.f3617a.m3385g();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3396a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$e */
        public static final class e extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8354d f3618a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C8354d c8354d) {
                super(0);
                this.f3618a = c8354d;
            }

            /* renamed from: a */
            public final void m3397a() {
                AbstractC8096e.m1801b(this.f3618a.f3600d, this.f3618a.f3606j.mo2350b());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3397a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$a$f */
        public static final class f extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8354d f3619a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C8354d c8354d) {
                super(1);
                this.f3619a = c8354d;
            }

            /* renamed from: a */
            public final void m3398a(PaymentStatusPayload paymentStatusPayload) {
                this.f3619a.m3379c(paymentStatusPayload != null ? paymentStatusPayload.getUserMessage() : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m3398a((PaymentStatusPayload) obj);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8354d.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3615a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8106e c8106e = C8354d.this.f3602f;
                C11944a c11944a = new C11944a(C8354d.this);
                b bVar = new b(C8354d.this);
                c cVar = new c(C8354d.this);
                d dVar = new d(C8354d.this);
                e eVar = new e(C8354d.this);
                f fVar = new f(C8354d.this);
                this.f3615a = 1;
                if (c8106e.m1886a(dVar, eVar, fVar, c11944a, bVar, cVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Uri f3620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri) {
            super(0);
            this.f3620a = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("checkUrlLoading() uri.path(\"");
            Uri uri = this.f3620a;
            sb.append(uri != null ? uri.getPath() : null);
            sb.append(")\"");
            return sb.toString();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3621a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8354d.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3621a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = C8354d.this.f3610n;
                Unit unit = Unit.INSTANCE;
                this.f3621a = 1;
                if (mutableSharedFlow.emit(unit, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3623a;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8354d.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15356confirmPaymentIoAF18A;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3623a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoicePaymentInteractor invoicePaymentInteractor = C8354d.this.f3598b;
                this.f3623a = 1;
                objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(this);
                if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15356confirmPaymentIoAF18A = ((Result) obj).getValue();
            }
            C8354d c8354d = C8354d.this;
            if (Result.m15706isSuccessimpl(objMo15356confirmPaymentIoAF18A)) {
                c8354d.m3368a((ConfirmPaymentResult) objMo15356confirmPaymentIoAF18A);
            }
            C8354d c8354d2 = C8354d.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15356confirmPaymentIoAF18A);
            if (thM15702exceptionOrNullimpl != null) {
                c8354d2.m3371a(new AbstractC8110d.e(thM15702exceptionOrNullimpl, false));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8357a f3625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8357a c8357a) {
            super(0);
            this.f3625a = c8357a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "initWebPaymentViewModel: " + this.f3625a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8356f invoke(C8356f reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8356f.m3413a(reduceState, null, null, C8354d.this.f3605i.isSandbox(), 3, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$g */
    /* loaded from: classes7.dex */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f3627a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f3627a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("openUrl("), this.f3627a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$h */
    /* loaded from: classes7.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public static final h f3628a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8356f invoke(C8356f reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8356f.m3413a(reduceState, AbstractC8353c.d.f3597a, null, false, 6, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$i */
    /* loaded from: classes7.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3629a;

        /* renamed from: c */
        public final /* synthetic */ String f3631c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Continuation continuation) {
            super(2, continuation);
            this.f3631c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8354d.this.new i(this.f3631c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3629a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = C8354d.this.f3612p;
                String str = this.f3631c;
                this.f3629a = 1;
                if (mutableSharedFlow.emit(str, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$j */
    /* loaded from: classes7.dex */
    public static final class j extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f3632a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.f3632a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8356f invoke(C8356f reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8356f.m3413a(reduceState, AbstractC8353c.c.f3596a, this.f3632a, false, 4, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$k */
    /* loaded from: classes7.dex */
    public static final class k extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8353c f3633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC8353c abstractC8353c) {
            super(1);
            this.f3633a = abstractC8353c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8356f invoke(C8356f reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8356f.m3413a(reduceState, this.f3633a, null, false, 6, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.d$l */
    /* loaded from: classes7.dex */
    public static final class l extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f3634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.f3634a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8356f invoke(C8356f reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8356f.m3413a(reduceState, new AbstractC8353c.b(this.f3634a), null, false, 6, null);
        }
    }

    public C8354d(InvoicePaymentInteractor invoicePaymentInteractor, FinishCodeReceiver finishCodeReceiver, InterfaceC8097f analytics, InternalPaylibRouter router, C8106e paymentStateCheckerWithRetries, C8107a errorHandler, PaylibLoggerFactory loggerFactory, CoroutineDispatchers coroutineDispatchers, PaymentMethodSelector paymentMethodSelector, InterfaceC8131b config, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(paymentStateCheckerWithRetries, "paymentStateCheckerWithRetries");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f3598b = invoicePaymentInteractor;
        this.f3599c = finishCodeReceiver;
        this.f3600d = analytics;
        this.f3601e = router;
        this.f3602f = paymentStateCheckerWithRetries;
        this.f3603g = errorHandler;
        this.f3604h = paymentMethodSelector;
        this.f3605i = config;
        this.f3606j = paylibStateManager;
        this.f3607k = loggerFactory.get("WebPaymentViewModel");
        this.f3608l = CoroutineScopeKt.CoroutineScope(coroutineDispatchers.getUi().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3610n = mutableSharedFlowMutableSharedFlow$default;
        this.f3611o = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3612p = mutableSharedFlowMutableSharedFlow$default2;
        this.f3613q = mutableSharedFlowMutableSharedFlow$default2;
        StringBuilder sb = new StringBuilder();
        C8610b c8610b = C8610b.f5886a;
        sb.append(c8610b.m4714a());
        sb.append("bank.ru");
        this.f3614r = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"gu-st.ru", sb.toString(), c8610b.m4714a() + "bank.com", c8610b.m4714a() + "devices.ru"});
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: f */
    public C8356f mo1999a() {
        return new C8356f(new AbstractC8353c.b(null, 1, null), null, false);
    }

    /* renamed from: i */
    public final Flow m3387i() {
        return this.f3613q;
    }

    /* renamed from: j */
    public final void m3388j() {
        AbstractC8096e.m1818r(this.f3600d);
        C8357a c8357a = this.f3609m;
        if (c8357a == null || !c8357a.m3421b()) {
            m3383e();
        } else {
            this.f3601e.mo2501f();
        }
    }

    /* renamed from: k */
    public final void m3389k() {
        AbstractC8096e.m1818r(this.f3600d);
        m3383e();
    }

    /* renamed from: l */
    public final void m3390l() {
        AbstractC8096e.m1825y(this.f3600d);
    }

    /* renamed from: m */
    public final void m3391m() {
        m3371a(new AbstractC8110d.e(null, false));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        CoroutineScopeKt.cancel$default(this.f3608l, null, 1, null);
        super.onCleared();
    }

    /* renamed from: a */
    public final void m3368a(ConfirmPaymentResult confirmPaymentResult) {
        PaymentAction paymentAction = confirmPaymentResult.getPaymentAction();
        WebPaymentLinkCreated webPaymentLinkCreated = paymentAction instanceof WebPaymentLinkCreated ? (WebPaymentLinkCreated) paymentAction : null;
        if (webPaymentLinkCreated != null) {
            m3374a(webPaymentLinkCreated.getWebPaymentLink());
        } else {
            m3391m();
        }
    }

    /* renamed from: b */
    public final void m3377b(String str) {
        m2000a(new j(str));
    }

    /* renamed from: c */
    public final void m3379c(String str) {
        m2000a(new l(str));
    }

    /* renamed from: d */
    public final void m3381d() {
        BuildersKt__Builders_commonKt.launch$default(this.f3608l, null, null, new a(null), 3, null);
    }

    /* renamed from: e */
    public final void m3383e() {
        this.f3599c.mo2267a(EnumC8105d.CLOSED_BY_USER);
        this.f3601e.mo2485a();
    }

    /* renamed from: g */
    public final void m3385g() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    /* renamed from: h */
    public final Flow m3386h() {
        return this.f3611o;
    }

    /* renamed from: a */
    public final void m3369a(AbstractC8110d.c cVar) {
        this.f3603g.m1915a(cVar, EnumC8262b.PAYMENT, this.f3609m);
        m3385g();
    }

    /* renamed from: b */
    public final boolean m3378b(Uri uri) {
        return StringsKt__StringsJVMKt.endsWith$default(String.valueOf(uri), ".pdf", false, 2, null);
    }

    /* renamed from: c */
    public final boolean m3380c(Uri uri) {
        return CollectionsKt___CollectionsKt.contains(this.f3614r, uri != null ? uri.getHost() : null);
    }

    /* renamed from: d */
    public final boolean m3382d(Uri uri) {
        String strValueOf;
        if (Intrinsics.areEqual(uri != null ? uri.getHost() : null, C8610b.f5886a.m4714a() + "devices.ru")) {
            String path = uri.getPath();
            if (path != null) {
                int iHashCode = path.hashCode();
                if (iHashCode != -1899712272) {
                    if (iHashCode == -650574613 && path.equals("/payment/success")) {
                        m3360a(this, (String) null, 1, (Object) null);
                        m3381d();
                        return false;
                    }
                } else if (path.equals("/payment/error")) {
                    m3391m();
                    return false;
                }
            }
            strValueOf = uri.toString();
            Intrinsics.checkNotNullExpressionValue(strValueOf, "uri.toString()");
        } else {
            strValueOf = String.valueOf(uri);
        }
        m3377b(strValueOf);
        return true;
    }

    /* renamed from: a */
    public final void m3370a(AbstractC8110d.d dVar) {
        this.f3603g.m1915a(dVar, EnumC8262b.WEB, this.f3609m);
        m3385g();
    }

    /* renamed from: a */
    public final void m3371a(AbstractC8110d.e eVar) {
        AbstractC8096e.m1819s(this.f3600d);
        Throwable thM1935a = eVar.m1935a();
        AbstractC8110d abstractC8110d = eVar;
        if (thM1935a == null) {
            abstractC8110d = AbstractC8110d.a.f1873b;
        }
        this.f3603g.m1915a(abstractC8110d, EnumC8262b.WEB, this.f3609m);
        m3385g();
    }

    /* renamed from: a */
    public final void m3372a(AbstractC8353c newViewState) {
        Intrinsics.checkNotNullParameter(newViewState, "newViewState");
        m2000a(new k(newViewState));
    }

    /* renamed from: a */
    public static /* synthetic */ void m3358a(C8354d c8354d, AbstractC8353c abstractC8353c, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC8353c = AbstractC8353c.a.f3594a;
        }
        c8354d.m3372a(abstractC8353c);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3360a(C8354d c8354d, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        c8354d.m3379c(str);
    }

    /* renamed from: a */
    public final void m3373a(C8357a webScreenStartParams) {
        Intrinsics.checkNotNullParameter(webScreenStartParams, "webScreenStartParams");
        Unit unit = null;
        PaylibLogger.DefaultImpls.d$default(this.f3607k, null, new e(webScreenStartParams), 1, null);
        this.f3609m = webScreenStartParams;
        if (webScreenStartParams.m3423d()) {
            m3381d();
        } else {
            String strM3420a = webScreenStartParams.m3420a();
            if (strM3420a != null) {
                m3374a(strM3420a);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m3375a(webScreenStartParams.m3422c());
            }
        }
        m2000a(new f());
    }

    /* renamed from: a */
    public final void m3374a(String str) {
        PaylibLogger.DefaultImpls.d$default(this.f3607k, null, new g(str), 1, null);
        AbstractC8096e.m1820t(this.f3600d);
        m2000a(h.f3628a);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(str, null), 3, null);
    }

    /* renamed from: a */
    public final void m3375a(boolean z) {
        AbstractC8096e.m1817q(this.f3600d);
        this.f3604h.selectPaymentMethod(new PaymentMethod.Web(z));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    /* renamed from: a */
    public final boolean m3376a(Uri uri) {
        PaylibLogger.DefaultImpls.d$default(this.f3607k, null, new b(uri), 1, null);
        if (m3378b(uri)) {
            m3377b(String.valueOf(uri));
            return true;
        }
        if (m3380c(uri)) {
            return m3382d(uri);
        }
        return false;
    }
}
