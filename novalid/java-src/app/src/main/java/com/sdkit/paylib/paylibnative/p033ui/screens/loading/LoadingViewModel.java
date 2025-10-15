package com.sdkit.paylib.paylibnative.p033ui.screens.loading;

import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibdomain.api.entity.ResultInfo;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8161d;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.InterfaceC8163a;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.SbolPayDeeplinkResolver;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8229c;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentInstrument;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.ChangePaymentMethodPayload;
import com.sdkit.paylib.paylibutils.lib.AbstractC8611c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

/* loaded from: classes5.dex */
public final class LoadingViewModel extends AbstractC8129a {

    /* renamed from: b */
    public final InvoiceHolder f3173b;

    /* renamed from: c */
    public final C8229c f3174c;

    /* renamed from: d */
    public final InterfaceC8163a f3175d;

    /* renamed from: e */
    public final FinishCodeReceiver f3176e;

    /* renamed from: f */
    public final InterfaceC8238l f3177f;

    /* renamed from: g */
    public final InternalPaylibRouter f3178g;

    /* renamed from: h */
    public final InterfaceC8131b f3179h;

    /* renamed from: i */
    public final SbolPayDeeplinkResolver f3180i;

    /* renamed from: j */
    public final SubscriptionsInteractor f3181j;

    /* renamed from: k */
    public final PaylibLogger f3182k;

    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/screens/loading/LoadingViewModel$SbolPayUnavailable;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/TraceIdContainer;", "", "a", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "traceId", "", "cause", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class SbolPayUnavailable extends RuntimeException implements TraceIdContainer {

        /* renamed from: a, reason: from kotlin metadata */
        public final String traceId;

        public SbolPayUnavailable(String str, Throwable th) {
            super("traceId(" + str + ')', th);
            this.traceId = str;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
        public String getTraceId() {
            return this.traceId;
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/screens/loading/LoadingViewModel$UnknownPayment;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/TraceIdContainer;", "", "a", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "traceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class UnknownPayment extends RuntimeException implements TraceIdContainer {

        /* renamed from: a, reason: from kotlin metadata */
        public final String traceId;

        public UnknownPayment(String str) {
            super("traceId(" + str + ')');
            this.traceId = str;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
        public String getTraceId() {
            return this.traceId;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$a */
    /* loaded from: classes7.dex */
    public static final class C8305a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3185a;

        /* renamed from: c */
        public final /* synthetic */ String f3187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8305a(String str, Continuation continuation) {
            super(2, continuation);
            this.f3187c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8305a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoadingViewModel.this.new C8305a(this.f3187c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15382changePaymentMethodgIAlus;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3185a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsInteractor subscriptionsInteractor = LoadingViewModel.this.f3181j;
                String str = this.f3187c;
                this.f3185a = 1;
                objMo15382changePaymentMethodgIAlus = subscriptionsInteractor.mo15382changePaymentMethodgIAlus(str, this);
                if (objMo15382changePaymentMethodgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15382changePaymentMethodgIAlus = ((Result) obj).getValue();
            }
            LoadingViewModel loadingViewModel = LoadingViewModel.this;
            if (Result.m15706isSuccessimpl(objMo15382changePaymentMethodgIAlus)) {
                ChangePaymentMethodPayload changePaymentMethodPayload = (ChangePaymentMethodPayload) objMo15382changePaymentMethodgIAlus;
                String purchaseId = changePaymentMethodPayload.getPurchaseId();
                String invoiceId = changePaymentMethodPayload.getInvoiceId();
                loadingViewModel.f3177f.mo2348a(invoiceId, purchaseId);
                loadingViewModel.m2932b(invoiceId);
            }
            LoadingViewModel loadingViewModel2 = LoadingViewModel.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15382changePaymentMethodgIAlus);
            if (thM15702exceptionOrNullimpl != null) {
                loadingViewModel2.f3177f.mo2349a(thM15702exceptionOrNullimpl);
                loadingViewModel2.m2929a(thM15702exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$b */
    /* loaded from: classes7.dex */
    public static final class C8306b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3188a;

        /* renamed from: b */
        public /* synthetic */ Object f3189b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$b$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ AsyncState f3191a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AsyncState asyncState) {
                super(0);
                this.f3191a = asyncState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "createInvoiceForProduct createPurchaseModel.update: " + this.f3191a;
            }
        }

        public C8306b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(AsyncState asyncState, Continuation continuation) {
            return ((C8306b) create(asyncState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C8306b c8306b = LoadingViewModel.this.new C8306b(continuation);
            c8306b.f3189b = obj;
            return c8306b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3188a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AsyncState asyncState = (AsyncState) this.f3189b;
            PaylibLogger.DefaultImpls.d$default(LoadingViewModel.this.f3182k, null, new a(asyncState), 1, null);
            if (!(Intrinsics.areEqual(asyncState, AsyncState.None.INSTANCE) ? true : Intrinsics.areEqual(asyncState, AsyncState.Loading.INSTANCE))) {
                if (asyncState instanceof AsyncState.Content) {
                    AsyncState.Content content = (AsyncState.Content) asyncState;
                    LoadingViewModel.this.f3177f.mo2348a(((C8161d) content.getContent()).m2082a(), ((C8161d) content.getContent()).m2083b());
                    LoadingViewModel.this.m2932b(((C8161d) content.getContent()).m2082a());
                } else if (asyncState instanceof AsyncState.Error) {
                    AsyncState.Error error = (AsyncState.Error) asyncState;
                    LoadingViewModel.this.f3177f.mo2349a(error.getError());
                    LoadingViewModel.this.m2929a(error.getError());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$c */
    /* loaded from: classes7.dex */
    public static final class C8307c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8307c f3192a = new C8307c();

        public C8307c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "fetchInvoice() started...";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$d */
    /* loaded from: classes7.dex */
    public static final class C8308d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public Object f3193a;

        /* renamed from: b */
        public Object f3194b;

        /* renamed from: c */
        public Object f3195c;

        /* renamed from: d */
        public int f3196d;

        /* renamed from: f */
        public final /* synthetic */ String f3198f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8308d(String str, Continuation continuation) {
            super(2, continuation);
            this.f3198f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8308d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoadingViewModel.this.new C8308d(this.f3198f, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM2273a;
            LoadingViewModel loadingViewModel;
            ResultInfo resultInfo;
            Object obj2;
            Throwable thM15702exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3196d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8229c c8229c = LoadingViewModel.this.f3174c;
                String str = this.f3198f;
                this.f3196d = 1;
                objM2273a = c8229c.m2273a(str, false, this);
                if (objM2273a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    resultInfo = (ResultInfo) this.f3195c;
                    loadingViewModel = (LoadingViewModel) this.f3194b;
                    obj2 = this.f3193a;
                    ResultKt.throwOnFailure(obj);
                    loadingViewModel.m2927a((Invoice) obj, resultInfo);
                    objM2273a = obj2;
                    LoadingViewModel loadingViewModel2 = LoadingViewModel.this;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2273a);
                    if (thM15702exceptionOrNullimpl != null) {
                        loadingViewModel2.m2929a(thM15702exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objM2273a = ((Result) obj).getValue();
            }
            loadingViewModel = LoadingViewModel.this;
            if (Result.m15706isSuccessimpl(objM2273a)) {
                ResultInfo resultInfo2 = (ResultInfo) objM2273a;
                Flow<Invoice> invoice = loadingViewModel.f3173b.getInvoice();
                this.f3193a = objM2273a;
                this.f3194b = loadingViewModel;
                this.f3195c = resultInfo2;
                this.f3196d = 2;
                Object objFirst = FlowKt.first(invoice, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                resultInfo = resultInfo2;
                obj2 = objM2273a;
                obj = objFirst;
                loadingViewModel.m2927a((Invoice) obj, resultInfo);
                objM2273a = obj2;
            }
            LoadingViewModel loadingViewModel22 = LoadingViewModel.this;
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2273a);
            if (thM15702exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel$e */
    /* loaded from: classes7.dex */
    public static final class C8309e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f3199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8309e(Throwable th) {
            super(0);
            this.f3199a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("showError error(");
            Throwable th = this.f3199a;
            return C8032c.m1430a(sb, th != null ? AbstractC8611c.m4716a(th) : null, ')');
        }
    }

    public LoadingViewModel(InvoiceHolder invoiceHolder, C8229c loadInvoiceDetailsInteractor, InterfaceC8163a createPurchaseModel, FinishCodeReceiver finishCodeReceiver, InterfaceC8238l paylibStateManager, InternalPaylibRouter router, InterfaceC8131b config, SbolPayDeeplinkResolver sbolPayDeeplinkResolver, SubscriptionsInteractor subscriptionsInteractor, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(loadInvoiceDetailsInteractor, "loadInvoiceDetailsInteractor");
        Intrinsics.checkNotNullParameter(createPurchaseModel, "createPurchaseModel");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sbolPayDeeplinkResolver, "sbolPayDeeplinkResolver");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3173b = invoiceHolder;
        this.f3174c = loadInvoiceDetailsInteractor;
        this.f3175d = createPurchaseModel;
        this.f3176e = finishCodeReceiver;
        this.f3177f = paylibStateManager;
        this.f3178g = router;
        this.f3179h = config;
        this.f3180i = sbolPayDeeplinkResolver;
        this.f3181j = subscriptionsInteractor;
        this.f3182k = loggerFactory.get("LoadingViewModel");
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: f */
    public C8313d mo1999a() {
        return new C8313d();
    }

    /* renamed from: g */
    public final void m2936g() {
        PaylibLogger.DefaultImpls.d$default(this.f3182k, null, C8307c.f3192a, 1, null);
        AbstractC8237k abstractC8237kMo2351c = this.f3177f.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e) {
            m2932b(((AbstractC8237k.e) abstractC8237kMo2351c).mo2309a().m2311a());
        } else {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g) {
                m2934e();
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f) {
                m2928a(((AbstractC8237k.f) abstractC8237kMo2351c).mo2312a().m2321a());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.c) {
                m2929a(new PaylibIllegalStateException());
            } else if (!(abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: b */
    public final void m2932b(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C8308d(str, null), 3, null);
    }

    /* renamed from: d */
    public final void m2933d() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f3176e, null, 1, null);
        this.f3178g.mo2485a();
    }

    /* renamed from: e */
    public final void m2934e() {
        m2001a(this.f3175d.mo2032a(), new C8306b(null));
    }

    /* renamed from: a */
    public final Collection m2926a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PaymentWay) obj).getType() != PaymentWay.Type.SBOLPAY || this.f3180i.m2095a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((PaymentWay) next).getType() != PaymentWay.Type.SBP || this.f3179h.isPaylibSbpEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((PaymentWay) next2).getType() != PaymentWay.Type.MOBILE || this.f3179h.isPaylibMobileEnabled()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (((PaymentWay) next3).getType() != PaymentWay.Type.TPAY || this.f3179h.isPaylibTPayEnabled()) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    /* renamed from: a */
    public final void m2927a(Invoice invoice, ResultInfo resultInfo) {
        String url;
        String url2;
        Collection collectionM2926a = m2926a((List) invoice.getPaymentWays());
        PaymentInstrument paymentInstrument = invoice.getPaymentInstrument();
        if (paymentInstrument instanceof PaymentInstrument.SbolPay) {
            url2 = ((PaymentInstrument.SbolPay) paymentInstrument).getUrl();
            url = null;
        } else if (paymentInstrument instanceof PaymentInstrument.Web) {
            url = ((PaymentInstrument.Web) paymentInstrument).getUrl();
            url2 = null;
        } else {
            if (paymentInstrument != null) {
                throw new NoWhenBranchMatchedException();
            }
            url = null;
            url2 = null;
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
        if (collectionM2926a.isEmpty() || m2931a(collectionM2926a, invoice.getCards())) {
            m2929a(new UnknownPayment(resultInfo.getTraceId()));
            return;
        }
        if (m2930a(collectionM2926a) || url != null) {
            this.f3178g.mo2493a(new C8357a(false, false, url, false));
            return;
        }
        if (!this.f3179h.isSbolPayInExecutedStatusAvailable() || !this.f3180i.m2095a() || url2 == null) {
            InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f3178g, null, 1, null);
            return;
        }
        Object objM2094a = this.f3180i.m2094a(url2);
        if (Result.m15706isSuccessimpl(objM2094a)) {
            if (((Boolean) objM2094a).booleanValue()) {
                this.f3178g.mo2499d();
            } else {
                m2929a(new SbolPayUnavailable(resultInfo.getTraceId(), null));
            }
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM2094a);
        if (thM15702exceptionOrNullimpl != null) {
            m2929a(new SbolPayUnavailable(resultInfo.getTraceId(), thM15702exceptionOrNullimpl));
        }
    }

    /* renamed from: a */
    public final void m2928a(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C8305a(str, null), 3, null);
    }

    /* renamed from: a */
    public final void m2929a(Throwable th) {
        PaylibLogger.DefaultImpls.e$default(this.f3182k, null, new C8309e(th), 1, null);
        AbstractC8128b abstractC8128bM3449a = AbstractC8369f.m3449a(th, false, 1, (Object) null);
        this.f3178g.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(abstractC8128bM3449a instanceof AbstractC8128b.h ? EnumC8262b.LOADING : EnumC8262b.NONE, abstractC8128bM3449a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
    }

    /* renamed from: a */
    public final boolean m2930a(Collection collection) {
        return collection.size() == 1 && ((PaymentWay) CollectionsKt___CollectionsKt.first(collection)).getType() == PaymentWay.Type.NEW;
    }

    /* renamed from: a */
    public final boolean m2931a(Collection collection, List list) {
        return collection.size() == 1 && ((PaymentWay) CollectionsKt___CollectionsKt.first(collection)).getType() == PaymentWay.Type.CARD && list.isEmpty();
    }
}
