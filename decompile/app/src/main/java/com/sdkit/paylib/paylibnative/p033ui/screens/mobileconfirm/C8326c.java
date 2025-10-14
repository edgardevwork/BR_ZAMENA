package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.mobileb.SmsCodeVerificationException;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor;
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
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8328e;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects.C8331a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c */
/* loaded from: classes5.dex */
public final class C8326c extends AbstractC8129a {

    /* renamed from: n */
    public static final a f3323n = new a(null);

    /* renamed from: b */
    public final Context f3324b;

    /* renamed from: c */
    public final MoblieBOtpCodeInteractor f3325c;

    /* renamed from: d */
    public final FinishCodeReceiver f3326d;

    /* renamed from: e */
    public final InternalPaylibRouter f3327e;

    /* renamed from: f */
    public final C8329f f3328f;

    /* renamed from: g */
    public final InterfaceC8097f f3329g;

    /* renamed from: h */
    public final InterfaceC8131b f3330h;

    /* renamed from: i */
    public final MutableSharedFlow f3331i;

    /* renamed from: j */
    public final SharedFlow f3332j;

    /* renamed from: k */
    public String f3333k;

    /* renamed from: l */
    public SmsConfirmConstraints f3334l;

    /* renamed from: m */
    public CountDownTimer f3335m;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ int f3337b;

        /* renamed from: c */
        public final /* synthetic */ SmsConfirmConstraints f3338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, SmsConfirmConstraints smsConfirmConstraints) {
            super(1);
            this.f3337b = i;
            this.f3338c = smsConfirmConstraints;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8328e invoke(C8328e reduceState) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            Resources resources = C8326c.this.f3324b.getResources();
            int i = C11403R.plurals.paylib_native_error_sms_code;
            int i2 = this.f3337b;
            String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2), Integer.valueOf(this.f3338c.getCodeEnterAttemptsNumber()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…                        )");
            return C8328e.m3113a(reduceState, false, 0, new C8328e.b.a(quantityString), null, new C8328e.a(false), false, 43, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: a */
        public static final c f3339a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8328e invoke(C8328e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8328e.m3113a(reduceState, false, 0, null, null, null, false, 62, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$d */
    public static final class d extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ C8326c f3340a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$d$a */
        /* loaded from: classes7.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public static final a f3341a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8328e.m3113a(reduceState, false, 0, null, C8328e.c.b.f3382a, null, false, 55, null);
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$d$b */
        /* loaded from: classes7.dex */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8326c f3342a;

            /* renamed from: b */
            public final /* synthetic */ long f3343b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C8326c c8326c, long j) {
                super(1);
                this.f3342a = c8326c;
                this.f3343b = j;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                String string = this.f3342a.f3324b.getString(C11403R.string.paylib_native_resend_code_after, Long.valueOf(this.f3343b));
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…after, timeLeftInSeconds)");
                return C8328e.m3113a(reduceState, false, 0, null, new C8328e.c.a(string), null, false, 55, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, C8326c c8326c) {
            super(j, 1000L);
            this.f3340a = c8326c;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f3340a.m2000a(a.f3341a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C8326c c8326c = this.f3340a;
            c8326c.m2000a(new b(c8326c, j / 1000));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$e */
    /* loaded from: classes7.dex */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ C8331a f3345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8331a c8331a) {
            super(1);
            this.f3345b = c8331a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8328e invoke(C8328e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            String string = C8326c.this.f3324b.getString(C11403R.string.paylib_native_enter_code_sent_on, this.f3345b.m3133a());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri… startParams.phoneNumber)");
            return C8328e.m3113a(reduceState, false, this.f3345b.m3134b().getSmsCodeLength(), new C8328e.b.C11933b(string), null, null, C8326c.this.f3330h.isSandbox(), 25, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3346a;

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
            return C8326c.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3346a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = C8326c.this.f3331i;
                Unit unit = Unit.INSTANCE;
                this.f3346a = 1;
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$g */
    /* loaded from: classes7.dex */
    public static final class g extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ String f3349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f3349b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8328e invoke(C8328e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            Context context = C8326c.this.f3324b;
            int i = C11403R.string.paylib_native_enter_code_sent_on;
            String str = C8326c.this.f3333k;
            SmsConfirmConstraints smsConfirmConstraints = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
                str = null;
            }
            String string = context.getString(i, str);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ode_sent_on, phoneNumber)");
            C8328e.b.C11933b c11933b = new C8328e.b.C11933b(string);
            C8328e.a aVarM3114a = reduceState.m3114a();
            C8329f c8329f = C8326c.this.f3328f;
            String str2 = this.f3349b;
            SmsConfirmConstraints smsConfirmConstraints2 = C8326c.this.f3334l;
            if (smsConfirmConstraints2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smsConstraints");
                smsConfirmConstraints2 = null;
            }
            Regex regex = new Regex(smsConfirmConstraints2.getValidationRegex());
            SmsConfirmConstraints smsConfirmConstraints3 = C8326c.this.f3334l;
            if (smsConfirmConstraints3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smsConstraints");
            } else {
                smsConfirmConstraints = smsConfirmConstraints3;
            }
            return C8328e.m3113a(reduceState, false, 0, c11933b, null, aVarM3114a.m3121a(c8329f.m3128a(str2, regex, smsConfirmConstraints.getSmsCodeLength())), false, 43, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$h$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8326c f3351a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8326c c8326c) {
                super(1);
                this.f3351a = c8326c;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                String string = this.f3351a.f3324b.getString(C11403R.string.paylib_native_sms_code_expired);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_native_sms_code_expired)");
                return C8328e.m3113a(reduceState, false, 0, new C8328e.b.a(string), null, new C8328e.a(false), false, 43, null);
            }
        }

        public h() {
            super(0);
        }

        /* renamed from: a */
        public final void m3101a() {
            C8326c c8326c = C8326c.this;
            c8326c.m2000a(new a(c8326c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3101a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        /* renamed from: a */
        public final void m3103a() {
            C8326c.this.m3085a(new AbstractC8337a.a(C11403R.string.paylib_native_sms_code_expired, null, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3103a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$j */
    /* loaded from: classes7.dex */
    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3353a;

        /* renamed from: c */
        public final /* synthetic */ String f3355c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$j$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public static final a f3356a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8328e.m3113a(reduceState, true, 0, null, null, null, false, 62, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Continuation continuation) {
            super(2, continuation);
            this.f3355c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8326c.this.new j(this.f3355c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15370verifyPhoneNumbergIAlus;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3353a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8326c.this.m2000a(a.f3356a);
                MoblieBOtpCodeInteractor moblieBOtpCodeInteractor = C8326c.this.f3325c;
                String str = this.f3355c;
                this.f3353a = 1;
                objMo15370verifyPhoneNumbergIAlus = moblieBOtpCodeInteractor.mo15370verifyPhoneNumbergIAlus(str, this);
                if (objMo15370verifyPhoneNumbergIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15370verifyPhoneNumbergIAlus = ((Result) obj).getValue();
            }
            C8326c c8326c = C8326c.this;
            if (Result.m15706isSuccessimpl(objMo15370verifyPhoneNumbergIAlus)) {
                InternalPaylibRouter.DefaultImpls.pushDeeplinkResultScreen$default(c8326c.f3327e, true, null, 2, null);
            }
            C8326c c8326c2 = C8326c.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15370verifyPhoneNumbergIAlus);
            if (thM15702exceptionOrNullimpl != null) {
                c8326c2.m3087a(thM15702exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$k */
    /* loaded from: classes7.dex */
    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public Object f3357a;

        /* renamed from: b */
        public Object f3358b;

        /* renamed from: c */
        public Object f3359c;

        /* renamed from: d */
        public int f3360d;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$k$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public static final a f3362a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8328e.m3113a(reduceState, true, 0, null, null, null, false, 62, null);
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$k$b */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a */
            public static final b f3363a = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8328e.m3113a(reduceState, false, 0, null, C8328e.c.C11934c.f3383a, null, false, 55, null);
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.c$k$c */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: a */
            public static final c f3364a = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8328e invoke(C8328e reduceState) {
                Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
                return C8328e.m3113a(reduceState, false, 0, null, null, null, false, 62, null);
            }
        }

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8326c.this.new k(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15369requestSmsWithVerifyCodeIoAF18A;
            C8326c c8326c;
            Object obj2;
            SmsConfirmConstraints smsConfirmConstraints;
            Throwable thM15702exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3360d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8326c.this.m2000a(a.f3362a);
                MoblieBOtpCodeInteractor moblieBOtpCodeInteractor = C8326c.this.f3325c;
                this.f3360d = 1;
                objMo15369requestSmsWithVerifyCodeIoAF18A = moblieBOtpCodeInteractor.mo15369requestSmsWithVerifyCodeIoAF18A(this);
                if (objMo15369requestSmsWithVerifyCodeIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    smsConfirmConstraints = (SmsConfirmConstraints) this.f3359c;
                    c8326c = (C8326c) this.f3358b;
                    obj2 = this.f3357a;
                    ResultKt.throwOnFailure(obj);
                    c8326c.f3335m = c8326c.m3083a(smsConfirmConstraints).start();
                    objMo15369requestSmsWithVerifyCodeIoAF18A = obj2;
                    C8326c c8326c2 = C8326c.this;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15369requestSmsWithVerifyCodeIoAF18A);
                    if (thM15702exceptionOrNullimpl != null) {
                        c8326c2.m3085a(AbstractC8369f.m3454a(thM15702exceptionOrNullimpl, (String) null, 1, (Object) null));
                    }
                    C8326c.this.m2000a(c.f3364a);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objMo15369requestSmsWithVerifyCodeIoAF18A = ((Result) obj).getValue();
            }
            c8326c = C8326c.this;
            if (Result.m15706isSuccessimpl(objMo15369requestSmsWithVerifyCodeIoAF18A)) {
                SmsConfirmConstraints smsConfirmConstraints2 = (SmsConfirmConstraints) objMo15369requestSmsWithVerifyCodeIoAF18A;
                c8326c.f3334l = smsConfirmConstraints2;
                if (smsConfirmConstraints2.isNewRequestSmsAvailable()) {
                    MutableSharedFlow mutableSharedFlow = c8326c.f3331i;
                    Unit unit = Unit.INSTANCE;
                    this.f3357a = objMo15369requestSmsWithVerifyCodeIoAF18A;
                    this.f3358b = c8326c;
                    this.f3359c = smsConfirmConstraints2;
                    this.f3360d = 2;
                    if (mutableSharedFlow.emit(unit, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = objMo15369requestSmsWithVerifyCodeIoAF18A;
                    smsConfirmConstraints = smsConfirmConstraints2;
                    c8326c.f3335m = c8326c.m3083a(smsConfirmConstraints).start();
                    objMo15369requestSmsWithVerifyCodeIoAF18A = obj2;
                } else {
                    c8326c.m2000a(b.f3363a);
                }
            }
            C8326c c8326c22 = C8326c.this;
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15369requestSmsWithVerifyCodeIoAF18A);
            if (thM15702exceptionOrNullimpl != null) {
            }
            C8326c.this.m2000a(c.f3364a);
            return Unit.INSTANCE;
        }
    }

    public C8326c(Context context, MoblieBOtpCodeInteractor moblieBOtpCodeInteractor, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter router, C8329f smsCodeValidator, InterfaceC8097f analytics, InterfaceC8131b config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moblieBOtpCodeInteractor, "moblieBOtpCodeInteractor");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(smsCodeValidator, "smsCodeValidator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f3324b = context;
        this.f3325c = moblieBOtpCodeInteractor;
        this.f3326d = finishCodeReceiver;
        this.f3327e = router;
        this.f3328f = smsCodeValidator;
        this.f3329g = analytics;
        this.f3330h = config;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3331i = mutableSharedFlowMutableSharedFlow$default;
        this.f3332j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8328e mo1999a() {
        return new C8328e(false, 20, new C8328e.b.C11933b(""), new C8328e.c.a(""), new C8328e.a(false), false);
    }

    /* renamed from: a */
    public final CountDownTimer m3083a(SmsConfirmConstraints smsConfirmConstraints) {
        return new d(smsConfirmConstraints.getSmsRequestInterval() * 1000, this);
    }

    /* renamed from: e */
    public final SharedFlow m3090e() {
        return this.f3332j;
    }

    /* renamed from: f */
    public final void m3091f() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    /* renamed from: g */
    public final void m3092g() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f3326d, null, 1, null);
        this.f3327e.mo2485a();
    }

    /* renamed from: h */
    public final void m3093h() {
        AbstractC8096e.m1824x(this.f3329g);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
    }

    /* renamed from: b */
    public final void m3088b(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        AbstractC8096e.m1806f(this.f3329g);
        C8329f c8329f = this.f3328f;
        SmsConfirmConstraints smsConfirmConstraints = this.f3334l;
        if (smsConfirmConstraints == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsConstraints");
            smsConfirmConstraints = null;
        }
        if (c8329f.m3127a(code, smsConfirmConstraints, new h(), new i())) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(code, null), 3, null);
        }
    }

    /* renamed from: a */
    public final void m3084a(C8331a startParams) {
        Intrinsics.checkNotNullParameter(startParams, "startParams");
        this.f3333k = startParams.m3133a();
        SmsConfirmConstraints smsConfirmConstraintsM3134b = startParams.m3134b();
        this.f3334l = smsConfirmConstraintsM3134b;
        if (smsConfirmConstraintsM3134b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsConstraints");
            smsConfirmConstraintsM3134b = null;
        }
        this.f3335m = m3083a(smsConfirmConstraintsM3134b).start();
        m2000a(new e(startParams));
    }

    /* renamed from: a */
    public final void m3085a(AbstractC8337a abstractC8337a) {
        this.f3327e.mo2491a(new C8340d(null, abstractC8337a, new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    /* renamed from: a */
    public final void m3086a(String newCode) {
        Intrinsics.checkNotNullParameter(newCode, "newCode");
        m2000a(new g(newCode));
    }

    /* renamed from: a */
    public final void m3087a(Throwable th) {
        if (th instanceof SmsCodeVerificationException) {
            SmsConfirmConstraints constraints = ((SmsCodeVerificationException) th).getConstraints();
            this.f3334l = constraints;
            m2000a(new b(constraints.getCodeEnterAttemptsNumber() - constraints.getSmsCodeEnterAttemptsNumber(), constraints));
        } else {
            m3085a(AbstractC8369f.m3454a(th, (String) null, 1, (Object) null));
        }
        m2000a(c.f3339a);
    }
}
