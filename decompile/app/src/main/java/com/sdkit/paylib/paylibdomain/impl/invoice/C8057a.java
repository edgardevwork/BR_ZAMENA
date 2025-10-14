package com.sdkit.paylib.paylibdomain.impl.invoice;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.entity.ResultInfo;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8055a;
import com.sdkit.paylib.paylibdomain.impl.utils.AbstractC8074a;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a */
/* loaded from: classes6.dex */
public final class C8057a implements InvoiceHolder {

    /* renamed from: a */
    public final CardsHolder f1239a;

    /* renamed from: b */
    public final CoroutineDispatchers f1240b;

    /* renamed from: c */
    public final PaylibDomainFeatureFlags f1241c;

    /* renamed from: d */
    public final InvoiceNetworkClient f1242d;

    /* renamed from: e */
    public final PaylibLogger f1243e;

    /* renamed from: f */
    public final MutableStateFlow f1244f;

    /* renamed from: g */
    public final MutableStateFlow f1245g;

    /* renamed from: h */
    public String f1246h;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f1247a;

        /* renamed from: b */
        public Object f1248b;

        /* renamed from: c */
        public Object f1249c;

        /* renamed from: d */
        public /* synthetic */ Object f1250d;

        /* renamed from: f */
        public int f1252f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1250d = obj;
            this.f1252f |= Integer.MIN_VALUE;
            return C8057a.this.fetchAllInvoiceDetails(this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f1253a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchAllInvoiceDetails() updating...";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1254a;

        /* renamed from: b */
        public final /* synthetic */ Invoice f1255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Invoice invoice) {
            super(0);
            this.f1254a = str;
            this.f1255b = invoice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("fetchAllInvoiceDetails() invoiceId(");
            sb.append(this.f1254a);
            sb.append(") currentInvoiceId(");
            Invoice invoice = this.f1255b;
            return C8032c.m1430a(sb, invoice != null ? invoice.getInvoiceId() : null, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public static final d f1256a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchAllInvoiceDetails() completed";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public static final e f1257a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchAllInvoiceDetails() not changed";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1258a;

        /* renamed from: c */
        public final /* synthetic */ String f1260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.f1260c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8057a.this.new f(this.f1260c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1258a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8057a.this.f1242d;
                String str = this.f1260c;
                this.f1258a = 1;
                obj = invoiceNetworkClient.getFullInvoice(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f1261a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchAllInvoiceDetails() failure";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$h */
    public static final class h extends ContinuationImpl {

        /* renamed from: a */
        public Object f1262a;

        /* renamed from: b */
        public Object f1263b;

        /* renamed from: c */
        public Object f1264c;

        /* renamed from: d */
        public boolean f1265d;

        /* renamed from: e */
        public /* synthetic */ Object f1266e;

        /* renamed from: g */
        public int f1268g;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1266e = obj;
            this.f1268g |= Integer.MIN_VALUE;
            Object objMo15354fetchInvoiceDetailsgIAlus = C8057a.this.mo15354fetchInvoiceDetailsgIAlus(false, this);
            return objMo15354fetchInvoiceDetailsgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15354fetchInvoiceDetailsgIAlus : Result.m15698boximpl(objMo15354fetchInvoiceDetailsgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$i */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: a */
        public static final i f1269a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchInvoiceDetails() updating...";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$j */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1270a;

        /* renamed from: b */
        public final /* synthetic */ Invoice f1271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Invoice invoice) {
            super(0);
            this.f1270a = str;
            this.f1271b = invoice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("fetchAllInvoiceDetails() invoiceId(");
            sb.append(this.f1270a);
            sb.append(") currentInvoiceId(");
            Invoice invoice = this.f1271b;
            return C8032c.m1430a(sb, invoice != null ? invoice.getInvoiceId() : null, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$k */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: a */
        public static final k f1272a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchInvoiceDetails() completed";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$l */
    public static final class l extends Lambda implements Function0 {

        /* renamed from: a */
        public static final l f1273a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "fetchInvoiceDetails() not changed";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$m */
    /* loaded from: classes5.dex */
    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1274a;

        /* renamed from: c */
        public final /* synthetic */ String f1276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Continuation continuation) {
            super(2, continuation);
            this.f1276c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8057a.this.new m(this.f1276c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1274a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8057a.this.f1242d;
                String str = this.f1276c;
                this.f1274a = 1;
                obj = invoiceNetworkClient.getInvoice(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$n */
    /* loaded from: classes5.dex */
    public static final class n extends SuspendLambda implements Function3 {

        /* renamed from: a */
        public int f1277a;

        /* renamed from: b */
        public /* synthetic */ Object f1278b;

        /* renamed from: c */
        public /* synthetic */ Object f1279c;

        public n(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Invoice invoice, Invoice invoice2, Continuation continuation) {
            n nVar = new n(continuation);
            nVar.f1278b = invoice;
            nVar.f1279c = invoice2;
            return nVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1277a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Invoice invoice = (Invoice) this.f1278b;
            Invoice invoice2 = (Invoice) this.f1279c;
            return invoice2 == null ? invoice : invoice2;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.a$o */
    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "set invoiceId (" + C8057a.this.getInvoiceId() + ')';
        }
    }

    public C8057a(CardsHolder cardsHolder, CoroutineDispatchers coroutineDispatchers, PaylibDomainFeatureFlags domainFeatureFlags, InvoiceNetworkClient invoiceNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(cardsHolder, "cardsHolder");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(domainFeatureFlags, "domainFeatureFlags");
        Intrinsics.checkNotNullParameter(invoiceNetworkClient, "invoiceNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1239a = cardsHolder;
        this.f1240b = coroutineDispatchers;
        this.f1241c = domainFeatureFlags;
        this.f1242d = invoiceNetworkClient;
        this.f1243e = loggerFactory.get("InvoiceHolderImpl");
        this.f1244f = StateFlowKt.MutableStateFlow(null);
        this.f1245g = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchAllInvoiceDetails(Continuation continuation) throws Throwable {
        a aVar;
        C8057a c8057a;
        String invoiceId;
        String str;
        C8057a c8057a2;
        Object objM15699constructorimpl;
        Object value;
        Invoice invoice;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1252f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1252f = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1250d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1252f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            PaylibLogger.DefaultImpls.d$default(this.f1243e, null, b.f1253a, 1, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                invoiceId = getInvoiceId();
            } catch (Throwable th) {
                th = th;
                c8057a = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                if (Result.m15702exceptionOrNullimpl(AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e))) != null) {
                }
                return Unit.INSTANCE;
            }
            if (invoiceId == null) {
                throw new IllegalStateException("InvoiceId is required to fetch all details".toString());
            }
            Invoice invoice2 = (Invoice) this.f1245g.getValue();
            PaylibLogger.DefaultImpls.d$default(this.f1243e, null, new c(invoiceId, invoice2), 1, null);
            if (invoice2 != null && Intrinsics.areEqual(invoice2.getInvoiceId(), invoiceId)) {
                PaylibLogger.DefaultImpls.d$default(this.f1243e, null, e.f1257a, 1, null);
                c8057a = this;
                objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
                if (Result.m15702exceptionOrNullimpl(AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e))) != null) {
                    PaylibLogger.DefaultImpls.d$default(c8057a.f1243e, null, g.f1261a, 1, null);
                    if (c8057a.f1245g.getValue() != null) {
                        MutableStateFlow mutableStateFlow = c8057a.f1245g;
                        do {
                            value = mutableStateFlow.getValue();
                            invoice = (Invoice) value;
                        } while (!mutableStateFlow.compareAndSet(value, invoice != null ? invoice.copy((7167 & 1) != 0 ? invoice.invoiceId : null, (7167 & 2) != 0 ? invoice.orderId : null, (7167 & 4) != 0 ? invoice.icon : null, (7167 & 8) != 0 ? invoice.title : null, (7167 & 16) != 0 ? invoice.amountValue : 0L, (7167 & 32) != 0 ? invoice.visibleAmount : null, (7167 & 64) != 0 ? invoice.currency : null, (7167 & 128) != 0 ? invoice.cards : null, (7167 & 256) != 0 ? invoice.paymentWays : null, (7167 & 512) != 0 ? invoice.paymentInstrument : null, (7167 & 1024) != 0 ? invoice.loyaltyInfoState : Invoice.LoyaltyInfoState.NONE, (7167 & 2048) != 0 ? invoice.isSubscription : false, (7167 & 4096) != 0 ? invoice.canSaveBindings : null) : null));
                    } else {
                        MutableStateFlow mutableStateFlow2 = c8057a.f1245g;
                        Invoice invoice3 = (Invoice) c8057a.f1244f.getValue();
                        mutableStateFlow2.setValue(invoice3 != null ? invoice3.copy((7167 & 1) != 0 ? invoice3.invoiceId : null, (7167 & 2) != 0 ? invoice3.orderId : null, (7167 & 4) != 0 ? invoice3.icon : null, (7167 & 8) != 0 ? invoice3.title : null, (7167 & 16) != 0 ? invoice3.amountValue : 0L, (7167 & 32) != 0 ? invoice3.visibleAmount : null, (7167 & 64) != 0 ? invoice3.currency : null, (7167 & 128) != 0 ? invoice3.cards : null, (7167 & 256) != 0 ? invoice3.paymentWays : null, (7167 & 512) != 0 ? invoice3.paymentInstrument : null, (7167 & 1024) != 0 ? invoice3.loyaltyInfoState : Invoice.LoyaltyInfoState.NONE, (7167 & 2048) != 0 ? invoice3.isSubscription : false, (7167 & 4096) != 0 ? invoice3.canSaveBindings : null) : null);
                    }
                }
                return Unit.INSTANCE;
            }
            CoroutineDispatcher io2 = this.f1240b.getIo();
            f fVar = new f(invoiceId, null);
            aVar.f1247a = this;
            aVar.f1248b = this;
            aVar.f1249c = invoiceId;
            aVar.f1252f = 1;
            Object objWithContext = BuildersKt.withContext(io2, fVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = invoiceId;
            c8057a2 = this;
            obj = objWithContext;
            c8057a = c8057a2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar.f1249c;
            c8057a2 = (C8057a) aVar.f1248b;
            c8057a = (C8057a) aVar.f1247a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                if (Result.m15702exceptionOrNullimpl(AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e))) != null) {
                }
                return Unit.INSTANCE;
            }
        }
        Invoice invoiceM1531a = AbstractC8055a.m1531a((GetInvoiceResponse) obj, str, c8057a2.f1241c.isCheckInvoiceExecutedStatusEnabled(), false);
        PaylibLogger.DefaultImpls.d$default(c8057a2.f1243e, null, d.f1256a, 1, null);
        c8057a2.f1245g.setValue(invoiceM1531a.copy((7167 & 1) != 0 ? invoiceM1531a.invoiceId : null, (7167 & 2) != 0 ? invoiceM1531a.orderId : null, (7167 & 4) != 0 ? invoiceM1531a.icon : null, (7167 & 8) != 0 ? invoiceM1531a.title : null, (7167 & 16) != 0 ? invoiceM1531a.amountValue : 0L, (7167 & 32) != 0 ? invoiceM1531a.visibleAmount : null, (7167 & 64) != 0 ? invoiceM1531a.currency : null, (7167 & 128) != 0 ? invoiceM1531a.cards : null, (7167 & 256) != 0 ? invoiceM1531a.paymentWays : null, (7167 & 512) != 0 ? invoiceM1531a.paymentInstrument : null, (7167 & 1024) != 0 ? invoiceM1531a.loyaltyInfoState : Invoice.LoyaltyInfoState.LOADED, (7167 & 2048) != 0 ? invoiceM1531a.isSubscription : false, (7167 & 4096) != 0 ? invoiceM1531a.canSaveBindings : null));
        c8057a2.f1239a.updateCardsList(invoiceM1531a.getCards());
        objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        if (Result.m15702exceptionOrNullimpl(AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e))) != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder
    /* renamed from: fetchInvoiceDetails-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15354fetchInvoiceDetailsgIAlus(boolean z, Continuation continuation) throws Throwable {
        h hVar;
        C8057a c8057a;
        String invoiceId;
        C8057a c8057a2;
        String str;
        ResultInfo resultInfo;
        Object objM15699constructorimpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.f1268g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.f1268g = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        }
        Object obj = hVar.f1266e;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hVar.f1268g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            PaylibLogger.DefaultImpls.d$default(this.f1243e, null, i.f1269a, 1, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                invoiceId = getInvoiceId();
            } catch (Throwable th) {
                th = th;
                c8057a = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                return AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e));
            }
            if (invoiceId == null) {
                throw new IllegalStateException("InvoiceId is required to fetch details".toString());
            }
            Invoice invoice = (Invoice) this.f1244f.getValue();
            PaylibLogger.DefaultImpls.d$default(this.f1243e, null, new j(invoiceId, invoice), 1, null);
            if (invoice != null && Intrinsics.areEqual(invoice.getInvoiceId(), invoiceId)) {
                PaylibLogger.DefaultImpls.d$default(this.f1243e, null, l.f1273a, 1, null);
                resultInfo = new ResultInfo(null);
                c8057a = this;
                objM15699constructorimpl = Result.m15699constructorimpl(resultInfo);
                return AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e));
            }
            CoroutineDispatcher io2 = this.f1240b.getIo();
            m mVar = new m(invoiceId, null);
            hVar.f1262a = this;
            hVar.f1263b = this;
            hVar.f1264c = invoiceId;
            hVar.f1265d = z;
            hVar.f1268g = 1;
            Object objWithContext = BuildersKt.withContext(io2, mVar, hVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8057a2 = this;
            str = invoiceId;
            obj = objWithContext;
            c8057a = c8057a2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = hVar.f1265d;
            str = (String) hVar.f1264c;
            c8057a2 = (C8057a) hVar.f1263b;
            c8057a = (C8057a) hVar.f1262a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                return AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e));
            }
        }
        GetInvoiceResponse getInvoiceResponse = (GetInvoiceResponse) obj;
        Invoice invoiceM1531a = AbstractC8055a.m1531a(getInvoiceResponse, str, c8057a2.f1241c.isCheckInvoiceExecutedStatusEnabled(), z);
        PaylibLogger.DefaultImpls.d$default(c8057a2.f1243e, null, k.f1272a, 1, null);
        c8057a2.f1245g.setValue(null);
        c8057a2.f1244f.setValue(invoiceM1531a);
        CardWithLoyalty cardWithLoyaltyM1527a = AbstractC8055a.m1527a(invoiceM1531a);
        if (cardWithLoyaltyM1527a != null) {
            c8057a2.f1239a.updateCardsList(invoiceM1531a.getCards());
            c8057a2.f1239a.selectCard(cardWithLoyaltyM1527a.getId());
        }
        RequestMeta meta = getInvoiceResponse.getMeta();
        resultInfo = new ResultInfo(meta != null ? meta.getTraceId() : null);
        objM15699constructorimpl = Result.m15699constructorimpl(resultInfo);
        return AbstractC8609a.m4713a(AbstractC8074a.m1688a(objM15699constructorimpl, c8057a.f1243e));
    }

    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder
    public Flow getInvoice() {
        return FlowKt.filterNotNull(FlowKt.flowCombine(this.f1244f, this.f1245g, new n(null)));
    }

    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder
    public String getInvoiceId() {
        return this.f1246h;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder
    public void setInvoiceId(String str) {
        PaylibLogger.DefaultImpls.d$default(this.f1243e, null, new o(), 1, null);
        this.f1246h = str;
        this.f1244f.setValue(null);
        this.f1245g.setValue(null);
    }
}
