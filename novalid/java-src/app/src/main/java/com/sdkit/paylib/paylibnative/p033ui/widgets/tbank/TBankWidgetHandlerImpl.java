package com.sdkit.paylib.paylibnative.p033ui.widgets.tbank;

import android.content.Context;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.AbstractC8449e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.TPayUrlReceived;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import ru.rustore.sdk.billingclient.C11403R;

/* loaded from: classes6.dex */
public final class TBankWidgetHandlerImpl implements InterfaceC8446b {

    /* renamed from: a */
    public final InvoiceHolder f4016a;

    /* renamed from: b */
    public final InvoicePaymentInteractor f4017b;

    /* renamed from: c */
    public final InternalPaylibRouter f4018c;

    /* renamed from: d */
    public final InterfaceC8131b f4019d;

    /* renamed from: e */
    public final InterfaceC8412a f4020e;

    /* renamed from: f */
    public final DeeplinkSupportInteractor f4021f;

    /* renamed from: g */
    public final TBankAvailabilityInteractor f4022g;

    /* renamed from: h */
    public final DeeplinkHandler f4023h;

    /* renamed from: i */
    public final InterfaceC8238l f4024i;

    /* renamed from: j */
    public final PaylibDeeplinkFactory f4025j;

    /* renamed from: k */
    public final Context f4026k;

    /* renamed from: l */
    public final PaymentMethodSelector f4027l;

    /* renamed from: m */
    public final PaylibLogger f4028m;

    /* renamed from: n */
    public final CoroutineScope f4029n;

    /* renamed from: o */
    public final MutableSharedFlow f4030o;

    /* renamed from: p */
    public final MutableStateFlow f4031p;

    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/widgets/tbank/TBankWidgetHandlerImpl$TPayDeeplinkError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class TPayDeeplinkError extends RuntimeException {
        public TPayDeeplinkError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TPayDeeplinkError(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ TPayDeeplinkError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/widgets/tbank/TBankWidgetHandlerImpl$TPayWidgetError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/TraceIdContainer;", "", "a", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "traceId", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final class TPayWidgetError extends RuntimeException implements TraceIdContainer {

        /* renamed from: a, reason: from kotlin metadata */
        public final String traceId;

        public TPayWidgetError(String str, String str2, Throwable th) {
            super(str2, th);
            this.traceId = str;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
        public String getTraceId() {
            return this.traceId;
        }

        public /* synthetic */ TPayWidgetError(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$a */
    public static final class C8433a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f4033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8433a(boolean z) {
            super(0);
            this.f4033a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("init isSingleWidget("), this.f4033a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$b */
    public static final class C8434b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f4034a;

        /* renamed from: c */
        public int f4036c;

        public C8434b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4034a = obj;
            this.f4036c |= Integer.MIN_VALUE;
            return TBankWidgetHandlerImpl.this.m3746g(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$c */
    public static final class C8435c extends ContinuationImpl {

        /* renamed from: a */
        public Object f4037a;

        /* renamed from: b */
        public /* synthetic */ Object f4038b;

        /* renamed from: d */
        public int f4040d;

        public C8435c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4038b = obj;
            this.f4040d |= Integer.MIN_VALUE;
            return TBankWidgetHandlerImpl.this.mo3736b(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$d */
    public static final class C8436d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f4041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8436d(boolean z) {
            super(0);
            this.f4041a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isTBankAvailable isPaylibTBankEnabled("), this.f4041a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$e */
    public static final class C8437e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f4042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8437e(boolean z) {
            super(0);
            this.f4042a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isTBankAvailable isPaymentWaysContainsTBank("), this.f4042a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$f */
    public static final class C8438f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f4043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8438f(boolean z) {
            super(0);
            this.f4043a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isTBankAvailable isTBankSupported("), this.f4043a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$g */
    public static final class C8439g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f4044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8439g(boolean z) {
            super(0);
            this.f4044a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8030a.m1428a(new StringBuilder("isTBankAvailable showTBankPayWidgetForcibly("), this.f4044a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$h */
    public static final class C8440h extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8440h f4045a = new C8440h();

        public C8440h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onTBankClicked";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$i */
    public static final class C8441i extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8441i f4046a = new C8441i();

        public C8441i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "performPayment";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$j */
    /* loaded from: classes7.dex */
    public static final class C8442j extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public Object f4047a;

        /* renamed from: b */
        public int f4048b;

        public C8442j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8442j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TBankWidgetHandlerImpl.this.new C8442j(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            TBankWidgetHandlerImpl tBankWidgetHandlerImpl;
            Object objMo15356confirmPaymentIoAF18A;
            AbstractC8449e abstractC8449eM3741a;
            MutableSharedFlow mutableSharedFlowMo3737h;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4048b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlowMo3737h2 = TBankWidgetHandlerImpl.this.mo3737h();
                AbstractC8449e.b bVar = AbstractC8449e.b.f4074a;
                this.f4048b = 1;
                if (mutableSharedFlowMo3737h2.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    tBankWidgetHandlerImpl = (TBankWidgetHandlerImpl) this.f4047a;
                    ResultKt.throwOnFailure(obj);
                    objMo15356confirmPaymentIoAF18A = ((Result) obj).getValue();
                    abstractC8449eM3741a = tBankWidgetHandlerImpl.m3741a(objMo15356confirmPaymentIoAF18A);
                    mutableSharedFlowMo3737h = TBankWidgetHandlerImpl.this.mo3737h();
                    this.f4047a = abstractC8449eM3741a;
                    this.f4048b = 3;
                    if (mutableSharedFlowMo3737h.emit(abstractC8449eM3741a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            tBankWidgetHandlerImpl = TBankWidgetHandlerImpl.this;
            InvoicePaymentInteractor invoicePaymentInteractor = tBankWidgetHandlerImpl.f4017b;
            this.f4047a = tBankWidgetHandlerImpl;
            this.f4048b = 2;
            objMo15356confirmPaymentIoAF18A = invoicePaymentInteractor.mo15356confirmPaymentIoAF18A(this);
            if (objMo15356confirmPaymentIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC8449eM3741a = tBankWidgetHandlerImpl.m3741a(objMo15356confirmPaymentIoAF18A);
            mutableSharedFlowMo3737h = TBankWidgetHandlerImpl.this.mo3737h();
            this.f4047a = abstractC8449eM3741a;
            this.f4048b = 3;
            if (mutableSharedFlowMo3737h.emit(abstractC8449eM3741a, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$k */
    public static final class C8443k extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8443k f4050a = new C8443k();

        public C8443k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "reset";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl$l */
    public static final class C8444l extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8444l f4051a = new C8444l();

        public C8444l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "showError";
        }
    }

    public TBankWidgetHandlerImpl(InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, InternalPaylibRouter router, InterfaceC8131b config, InterfaceC8412a paymentWaySelector, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory loggerFactory, DeeplinkSupportInteractor deeplinkSupportInteractor, TBankAvailabilityInteractor tbankAvailabilityInteractor, DeeplinkHandler deeplinkHandler, InterfaceC8238l paylibStateManager, PaylibDeeplinkFactory paylibDeeplinkFactory, Context context, PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(deeplinkSupportInteractor, "deeplinkSupportInteractor");
        Intrinsics.checkNotNullParameter(tbankAvailabilityInteractor, "tbankAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paylibDeeplinkFactory, "paylibDeeplinkFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f4016a = invoiceHolder;
        this.f4017b = invoicePaymentInteractor;
        this.f4018c = router;
        this.f4019d = config;
        this.f4020e = paymentWaySelector;
        this.f4021f = deeplinkSupportInteractor;
        this.f4022g = tbankAvailabilityInteractor;
        this.f4023h = deeplinkHandler;
        this.f4024i = paylibStateManager;
        this.f4025j = paylibDeeplinkFactory;
        this.f4026k = context;
        this.f4027l = paymentMethodSelector;
        this.f4028m = loggerFactory.get("TBankWidgetHandlerImpl");
        this.f4029n = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f4030o = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f4031p = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[PHI: r0
  0x0081: PHI (r0v5 com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl) = 
  (r0v3 com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl)
  (r0v7 com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl)
  (r0v7 com.sdkit.paylib.paylibnative.ui.widgets.tbank.TBankWidgetHandlerImpl)
 binds: [B:25:0x0080, B:21:0x006b, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.TBankProvider
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3736b(Continuation continuation) throws Throwable {
        C8435c c8435c;
        TBankWidgetHandlerImpl tBankWidgetHandlerImpl;
        boolean zMo2008c;
        if (continuation instanceof C8435c) {
            c8435c = (C8435c) continuation;
            int i = c8435c.f4040d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8435c.f4040d = i - Integer.MIN_VALUE;
            } else {
                c8435c = new C8435c(continuation);
            }
        }
        Object objM3746g = c8435c.f4038b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c8435c.f4040d;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM3746g);
            boolean zIsPaylibTPayEnabled = this.f4019d.isPaylibTPayEnabled();
            PaylibLogger.DefaultImpls.d$default(this.f4028m, null, new C8436d(zIsPaylibTPayEnabled), 1, null);
            if (!zIsPaylibTPayEnabled) {
                tBankWidgetHandlerImpl = this;
                zMo2008c = tBankWidgetHandlerImpl.f4019d.mo2008c();
                PaylibLogger.DefaultImpls.d$default(tBankWidgetHandlerImpl.f4028m, null, new C8439g(zMo2008c), 1, null);
                if (!zMo2008c) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
            c8435c.f4037a = this;
            c8435c.f4040d = 1;
            objM3746g = m3746g(c8435c);
            if (objM3746g == coroutine_suspended) {
                return coroutine_suspended;
            }
            tBankWidgetHandlerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tBankWidgetHandlerImpl = (TBankWidgetHandlerImpl) c8435c.f4037a;
            ResultKt.throwOnFailure(objM3746g);
        }
        Boolean bool = (Boolean) objM3746g;
        PaylibLogger.DefaultImpls.d$default(tBankWidgetHandlerImpl.f4028m, null, new C8437e(bool.booleanValue()), 1, null);
        if (bool.booleanValue()) {
            boolean zIsTBankSupported = tBankWidgetHandlerImpl.f4022g.isTBankSupported();
            PaylibLogger.DefaultImpls.d$default(tBankWidgetHandlerImpl.f4028m, null, new C8438f(zIsTBankSupported), 1, null);
            if (!zIsTBankSupported) {
                zMo2008c = tBankWidgetHandlerImpl.f4019d.mo2008c();
                PaylibLogger.DefaultImpls.d$default(tBankWidgetHandlerImpl.f4028m, null, new C8439g(zMo2008c), 1, null);
                if (!zMo2008c) {
                }
            }
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j
    /* renamed from: c */
    public void mo3490c() {
        Throwable th = null;
        byte b = 0;
        PaylibLogger.DefaultImpls.d$default(this.f4028m, null, C8441i.f4046a, 1, null);
        String strProvideInitialReturnDeepLink = this.f4023h.provideInitialReturnDeepLink();
        if (!(!StringsKt__StringsJVMKt.isBlank(strProvideInitialReturnDeepLink))) {
            m3742a((Throwable) new TPayDeeplinkError("provideInitialReturnDeepLink вернул '" + strProvideInitialReturnDeepLink + ExtendedMessageFormat.QUOTE, th, 2, b == true ? 1 : 0));
            return;
        }
        SourceState sourceStateM3749j = m3749j();
        if (sourceStateM3749j == null) {
            throw new PaylibIllegalStateException();
        }
        try {
            this.f4027l.selectPaymentMethod(new PaymentMethod.TPay(this.f4025j.createDeeplink(strProvideInitialReturnDeepLink, new DeeplinkDetails(sourceStateM3749j, new DeeplinkPaymentType.TBank(true))), this.f4025j.createDeeplink(strProvideInitialReturnDeepLink, new DeeplinkDetails(sourceStateM3749j, new DeeplinkPaymentType.TBank(false)))));
            BuildersKt__Builders_commonKt.launch$default(this.f4029n, null, null, new C8442j(null), 3, null);
        } catch (ReturnDeeplinkParseError e) {
            m3742a((Throwable) e);
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a
    /* renamed from: e */
    public void mo3745e() {
        PaylibLogger.DefaultImpls.d$default(this.f4028m, null, C8440h.f4045a, 1, null);
        this.f4020e.mo3644a(InterfaceC8419e.a.TBANK);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3746g(Continuation continuation) throws Throwable {
        C8434b c8434b;
        if (continuation instanceof C8434b) {
            c8434b = (C8434b) continuation;
            int i = c8434b.f4036c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8434b.f4036c = i - Integer.MIN_VALUE;
            } else {
                c8434b = new C8434b(continuation);
            }
        }
        Object objFirst = c8434b.f4034a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c8434b.f4036c;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f4016a.getInvoice();
            c8434b.f4036c = 1;
            objFirst = FlowKt.first(invoice, c8434b);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        List<PaymentWay> paymentWays = ((Invoice) objFirst).getPaymentWays();
        if ((paymentWays instanceof Collection) && paymentWays.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = paymentWays.iterator();
            while (it.hasNext()) {
                if (((PaymentWay) it.next()).getType() == PaymentWay.Type.TPAY) {
                    break;
                }
            }
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.TBankProvider
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3737h() {
        return this.f4030o;
    }

    /* renamed from: j */
    public final SourceState m3749j() {
        AbstractC8237k abstractC8237kMo2351c = this.f4024i.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e.d) {
            return new SourceState.Invoice(((AbstractC8237k.e.d) abstractC8237kMo2351c).mo2309a().m2311a());
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
            AbstractC8237k.g.c cVar = (AbstractC8237k.g.c) abstractC8237kMo2351c;
            return new SourceState.Product(cVar.m2335b(), cVar.m2336c(), cVar.mo2322a().m2341c(), cVar.mo2322a().m2340b(), cVar.mo2322a().m2342d(), cVar.mo2322a().m2339a());
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.a.d) {
            AbstractC8237k.a.d dVar = (AbstractC8237k.a.d) abstractC8237kMo2351c;
            return new SourceState.Application(dVar.mo2298a().m2299a(), dVar.m2307b(), dVar.m2308c(), dVar.mo2298a().m2300b());
        }
        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.f.c)) {
            return null;
        }
        AbstractC8237k.f.c cVar2 = (AbstractC8237k.f.c) abstractC8237kMo2351c;
        return new SourceState.PaymentMethodChangeState(cVar2.m2319b(), cVar2.mo2312a().m2321a(), cVar2.m2320c());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3744b() {
        return this.f4031p;
    }

    /* renamed from: a */
    public final AbstractC8449e m3741a(Object obj) {
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(obj);
        if (thM15702exceptionOrNullimpl != null) {
            return new AbstractC8449e.a(thM15702exceptionOrNullimpl);
        }
        ConfirmPaymentResult confirmPaymentResult = (ConfirmPaymentResult) obj;
        PaymentAction paymentAction = confirmPaymentResult.getPaymentAction();
        if (!(paymentAction instanceof TPayUrlReceived)) {
            return new AbstractC8449e.a(new TPayWidgetError(confirmPaymentResult.getTraceId(), "not valid content(" + paymentAction + ')', null, 4, null));
        }
        String formUrl = ((TPayUrlReceived) paymentAction).getFormUrl();
        if (!this.f4021f.isDeepLinkSupported(formUrl)) {
            return new AbstractC8449e.a(new TPayWidgetError(confirmPaymentResult.getTraceId(), "isDeepLinkSupported -> false", null, 4, null));
        }
        if (m3743a(formUrl)) {
            this.f4018c.mo2499d();
            return AbstractC8449e.c.f4075a;
        }
        return new AbstractC8449e.a(new TPayWidgetError(confirmPaymentResult.getTraceId(), "openTBankDeeplink -> false", null, 4, null));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.TBankProvider
    /* renamed from: a */
    public void mo3734a() {
        PaylibLogger.DefaultImpls.d$default(this.f4028m, null, C8443k.f4050a, 1, null);
        CoroutineScopeKt.cancel$default(this.f4029n, null, 1, null);
    }

    /* renamed from: a */
    public final void m3742a(Throwable th) {
        this.f4028m.mo1701e(th, C8444l.f4051a);
        this.f4018c.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.TBankProvider
    /* renamed from: a */
    public void mo3735a(boolean z) {
        PaylibLogger.DefaultImpls.d$default(this.f4028m, null, new C8433a(z), 1, null);
        mo3744b().setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean m3743a(String str) {
        return this.f4023h.openDeeplink(str, this.f4026k.getString(C11403R.string.paylib_native_tbank_application_package_name));
    }
}
