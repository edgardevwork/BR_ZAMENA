package com.sdkit.paylib.paylibnative.p033ui.screens.mobileb;

import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects.C8331a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.c */
/* loaded from: classes5.dex */
public final class C8321c extends AbstractC8129a {

    /* renamed from: g */
    public static final b f3279g = new b(null);

    /* renamed from: b */
    public final FinishCodeReceiver f3280b;

    /* renamed from: c */
    public final MobileBPaymentsInteractor f3281c;

    /* renamed from: d */
    public final InternalPaylibRouter f3282d;

    /* renamed from: e */
    public final InterfaceC8097f f3283e;

    /* renamed from: f */
    public final InterfaceC8131b f3284f;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3285a;

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
            return C8321c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15367getDisclaimerIoAF18A;
            Object value;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3285a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MobileBPaymentsInteractor mobileBPaymentsInteractor = C8321c.this.f3281c;
                this.f3285a = 1;
                objMo15367getDisclaimerIoAF18A = mobileBPaymentsInteractor.mo15367getDisclaimerIoAF18A(this);
                if (objMo15367getDisclaimerIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15367getDisclaimerIoAF18A = ((Result) obj).getValue();
            }
            C8321c c8321c = C8321c.this;
            if (Result.m15706isSuccessimpl(objMo15367getDisclaimerIoAF18A)) {
                String str = (String) objMo15367getDisclaimerIoAF18A;
                MutableStateFlow mutableStateFlowM2002b = c8321c.m2002b();
                do {
                    value = mutableStateFlowM2002b.getValue();
                } while (!mutableStateFlowM2002b.compareAndSet(value, C8323e.m3033a((C8323e) value, str, null, false, false, false, 30, null)));
            }
            C8321c c8321c2 = C8321c.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15367getDisclaimerIoAF18A);
            if (thM15702exceptionOrNullimpl != null) {
                c8321c2.m3021a(thM15702exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.c$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3287a;

        /* renamed from: c */
        public final /* synthetic */ String f3289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f3289c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8321c.this.new c(this.f3289c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15368startPaymentgIAlus;
            Object value;
            Object value2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3287a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MobileBPaymentsInteractor mobileBPaymentsInteractor = C8321c.this.f3281c;
                String str = this.f3289c;
                this.f3287a = 1;
                objMo15368startPaymentgIAlus = mobileBPaymentsInteractor.mo15368startPaymentgIAlus(str, this);
                if (objMo15368startPaymentgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15368startPaymentgIAlus = ((Result) obj).getValue();
            }
            C8321c c8321c = C8321c.this;
            String str2 = this.f3289c;
            if (Result.m15706isSuccessimpl(objMo15368startPaymentgIAlus)) {
                c8321c.f3282d.mo2490a(new C8331a(str2, (SmsConfirmConstraints) objMo15368startPaymentgIAlus));
            }
            C8321c c8321c2 = C8321c.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15368startPaymentgIAlus);
            if (thM15702exceptionOrNullimpl != null) {
                if (thM15702exceptionOrNullimpl instanceof PayLibServiceFailure.PaymentFailure.PhoneValidationError) {
                    MutableStateFlow mutableStateFlowM2002b = c8321c2.m2002b();
                    do {
                        value2 = mutableStateFlowM2002b.getValue();
                    } while (!mutableStateFlowM2002b.compareAndSet(value2, C8323e.m3033a((C8323e) value2, null, ((PayLibServiceFailure.PaymentFailure.PhoneValidationError) thM15702exceptionOrNullimpl).getUserMessage(), false, false, false, 25, null)));
                } else {
                    c8321c2.m3021a(thM15702exceptionOrNullimpl);
                }
            }
            MutableStateFlow mutableStateFlowM2002b2 = C8321c.this.m2002b();
            do {
                value = mutableStateFlowM2002b2.getValue();
            } while (!mutableStateFlowM2002b2.compareAndSet(value, C8323e.m3033a((C8323e) value, null, null, false, false, false, 23, null)));
            return Unit.INSTANCE;
        }
    }

    public C8321c(FinishCodeReceiver finishCodeReceiver, MobileBPaymentsInteractor mobileBPaymentsInteractor, InternalPaylibRouter router, InterfaceC8097f analytics, InterfaceC8131b config) {
        Object value;
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(mobileBPaymentsInteractor, "mobileBPaymentsInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f3280b = finishCodeReceiver;
        this.f3281c = mobileBPaymentsInteractor;
        this.f3282d = router;
        this.f3283e = analytics;
        this.f3284f = config;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        MutableStateFlow mutableStateFlowM2002b = m2002b();
        do {
            value = mutableStateFlowM2002b.getValue();
        } while (!mutableStateFlowM2002b.compareAndSet(value, C8323e.m3033a((C8323e) value, null, null, false, false, this.f3284f.isSandbox(), 15, null)));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8323e mo1999a() {
        return new C8323e(null, null, false, false, false);
    }

    /* renamed from: e */
    public final void m3026e() {
        InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f3282d, null, 1, null);
    }

    /* renamed from: f */
    public final void m3027f() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f3280b, null, 1, null);
        this.f3282d.mo2485a();
    }

    /* renamed from: b */
    public final void m3023b(String phoneNumber) {
        Object value;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        AbstractC8096e.m1803c(this.f3283e);
        if (m3022a(phoneNumber)) {
            MutableStateFlow mutableStateFlowM2002b = m2002b();
            do {
                value = mutableStateFlowM2002b.getValue();
            } while (!mutableStateFlowM2002b.compareAndSet(value, C8323e.m3033a((C8323e) value, null, null, false, true, false, 23, null)));
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(phoneNumber, null), 3, null);
        }
    }

    /* renamed from: c */
    public final void m3024c(String phoneInput) {
        Object value;
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        MutableStateFlow mutableStateFlowM2002b = m2002b();
        do {
            value = mutableStateFlowM2002b.getValue();
        } while (!mutableStateFlowM2002b.compareAndSet(value, C8323e.m3033a((C8323e) value, null, null, m3022a(phoneInput), false, false, 25, null)));
    }

    /* renamed from: a */
    public final void m3021a(Throwable th) {
        this.f3282d.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    /* renamed from: a */
    public final boolean m3022a(String str) {
        return str.length() == 18;
    }
}
