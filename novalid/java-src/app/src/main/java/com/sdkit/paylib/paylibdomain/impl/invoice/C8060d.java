package com.sdkit.paylib.paylibdomain.impl.invoice;

import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.DeeplinkPayRoute;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.ExternalPayRoute;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.ExternalPayType;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.LoyaltyPoints;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.WebFormPayRoute;
import com.sdkit.paylib.paylibdomain.impl.entity.EnumC8053a;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8055a;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8056b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperation;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperationType;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.CancelInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoicesResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d */
/* loaded from: classes6.dex */
public final class C8060d implements InvoicesInteractor {

    /* renamed from: a */
    public final InvoiceNetworkClient f1312a;

    /* renamed from: b */
    public final PaylibLogger f1313b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1314a;

        /* renamed from: c */
        public int f1316c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1314a = obj;
            this.f1316c |= Integer.MIN_VALUE;
            Object objMo15359cancelInvoicegIAlus = C8060d.this.mo15359cancelInvoicegIAlus(null, this);
            return objMo15359cancelInvoicegIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15359cancelInvoicegIAlus : Result.m15698boximpl(objMo15359cancelInvoicegIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f1317a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "cancelInvoice";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1318a;

        /* renamed from: c */
        public final /* synthetic */ String f1320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(1, continuation);
            this.f1320c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8060d.this.new c(this.f1320c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1318a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8060d.this.f1312a;
                String str = this.f1320c;
                this.f1318a = 1;
                obj = invoiceNetworkClient.cancelInvoice(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final d f1321a = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1593a(CancelInvoiceResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1593a((CancelInvoiceResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1322a;

        /* renamed from: c */
        public int f1324c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1322a = obj;
            this.f1324c |= Integer.MIN_VALUE;
            Object objMo15360getInvoice0E7RQCE = C8060d.this.mo15360getInvoice0E7RQCE(null, false, this);
            return objMo15360getInvoice0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15360getInvoice0E7RQCE : Result.m15698boximpl(objMo15360getInvoice0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f1325a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getInvoice";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$g */
    /* loaded from: classes5.dex */
    public static final class g extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1326a;

        /* renamed from: b */
        public final /* synthetic */ boolean f1327b;

        /* renamed from: c */
        public final /* synthetic */ C8060d f1328c;

        /* renamed from: d */
        public final /* synthetic */ String f1329d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, C8060d c8060d, String str, Continuation continuation) {
            super(1, continuation);
            this.f1327b = z;
            this.f1328c = c8060d;
            this.f1329d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new g(this.f1327b, this.f1328c, this.f1329d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1326a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f1327b) {
                    InvoiceNetworkClient invoiceNetworkClient = this.f1328c.f1312a;
                    String str = this.f1329d;
                    this.f1326a = 1;
                    obj = invoiceNetworkClient.getFullInvoice(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InvoiceNetworkClient invoiceNetworkClient2 = this.f1328c.f1312a;
                    String str2 = this.f1329d;
                    this.f1326a = 2;
                    obj = invoiceNetworkClient2.getInvoice(str2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (GetInvoiceResponse) obj;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$h */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public static final h f1330a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetInvoiceResponse invoke(GetInvoiceResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1331a;

        /* renamed from: c */
        public int f1333c;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1331a = obj;
            this.f1333c |= Integer.MIN_VALUE;
            Object objMo15361getInvoiceseH_QyT8 = C8060d.this.mo15361getInvoiceseH_QyT8(0, 0, null, null, null, null, null, this);
            return objMo15361getInvoiceseH_QyT8 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15361getInvoiceseH_QyT8 : Result.m15698boximpl(objMo15361getInvoiceseH_QyT8);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$j */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public static final j f1334a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptions";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$k */
    /* loaded from: classes5.dex */
    public static final class k extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1335a;

        /* renamed from: c */
        public final /* synthetic */ int f1337c;

        /* renamed from: d */
        public final /* synthetic */ int f1338d;

        /* renamed from: e */
        public final /* synthetic */ ClosedRange f1339e;

        /* renamed from: f */
        public final /* synthetic */ List f1340f;

        /* renamed from: g */
        public final /* synthetic */ IntRange f1341g;

        /* renamed from: h */
        public final /* synthetic */ String f1342h;

        /* renamed from: i */
        public final /* synthetic */ String f1343i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i, int i2, ClosedRange closedRange, List list, IntRange intRange, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f1337c = i;
            this.f1338d = i2;
            this.f1339e = closedRange;
            this.f1340f = list;
            this.f1341g = intRange;
            this.f1342h = str;
            this.f1343i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8060d.this.new k(this.f1337c, this.f1338d, this.f1339e, this.f1340f, this.f1341g, this.f1342h, this.f1343i, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1335a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8060d.this.f1312a;
                int i2 = this.f1337c;
                int i3 = this.f1338d;
                ClosedRange<Date> closedRange = this.f1339e;
                List<String> list = this.f1340f;
                IntRange intRange = this.f1341g;
                String str = this.f1342h;
                String str2 = this.f1343i;
                this.f1335a = 1;
                obj = invoiceNetworkClient.getInvoices(i2, i3, closedRange, list, intRange, str, str2, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$m */
    public static final class m extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1345a;

        /* renamed from: c */
        public int f1347c;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1345a = obj;
            this.f1347c |= Integer.MIN_VALUE;
            Object objMo15362getPaymentStatusForExecutedInvoice0E7RQCE = C8060d.this.mo15362getPaymentStatusForExecutedInvoice0E7RQCE(null, 0L, this);
            return objMo15362getPaymentStatusForExecutedInvoice0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15362getPaymentStatusForExecutedInvoice0E7RQCE : Result.m15698boximpl(objMo15362getPaymentStatusForExecutedInvoice0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$n */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public static final n f1348a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPaymentStatusForExecutedInvoice";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$o */
    /* loaded from: classes5.dex */
    public static final class o extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1349a;

        /* renamed from: c */
        public final /* synthetic */ String f1351c;

        /* renamed from: d */
        public final /* synthetic */ long f1352d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, long j, Continuation continuation) {
            super(1, continuation);
            this.f1351c = str;
            this.f1352d = j;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8060d.this.new o(this.f1351c, this.f1352d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1349a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8060d.this.f1312a;
                String str = this.f1351c;
                String strM1524b = EnumC8053a.EXECUTED.m1524b();
                Long lBoxLong = Boxing.boxLong(this.f1352d);
                this.f1349a = 1;
                obj = invoiceNetworkClient.getInvoice(str, strM1524b, lBoxLong, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$p */
    /* loaded from: classes8.dex */
    public /* synthetic */ class p extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final p f1353a = new p();

        public p() {
            super(1, AbstractC8055a.class, "getPaymentStatusForExecutedInvoice", "getPaymentStatusForExecutedInvoice(Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoiceResponse;)Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatusPayload;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentStatusPayload invoke(GetInvoiceResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return AbstractC8055a.m1526a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$q */
    public static final class q extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1354a;

        /* renamed from: c */
        public int f1356c;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1354a = obj;
            this.f1356c |= Integer.MIN_VALUE;
            Object objMo15363payByCardBWLJW6A = C8060d.this.mo15363payByCardBWLJW6A(null, null, null, this);
            return objMo15363payByCardBWLJW6A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15363payByCardBWLJW6A : Result.m15698boximpl(objMo15363payByCardBWLJW6A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$r */
    public static final class r extends Lambda implements Function0 {

        /* renamed from: a */
        public static final r f1357a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "payByCard";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$s */
    /* loaded from: classes5.dex */
    public static final class s extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1358a;

        /* renamed from: c */
        public final /* synthetic */ String f1360c;

        /* renamed from: d */
        public final /* synthetic */ LoyaltyPoints f1361d;

        /* renamed from: e */
        public final /* synthetic */ String f1362e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, LoyaltyPoints loyaltyPoints, String str2, Continuation continuation) {
            super(1, continuation);
            this.f1360c = str;
            this.f1361d = loyaltyPoints;
            this.f1362e = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8060d.this.new s(this.f1360c, this.f1361d, this.f1362e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1358a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8060d.this.f1312a;
                String str = this.f1360c;
                PaymentMethod withLoyalty = this.f1361d != null ? new PaymentMethod.WithLoyalty(CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentOperation[]{new PaymentOperation(PaymentOperationType.PAYMENT, "card", this.f1362e), new PaymentOperation(PaymentOperationType.PAYMENT_LOYALTY_POINTS, this.f1361d.getServiceCode(), String.valueOf(this.f1361d.getAmount()))})) : new PaymentMethod.ByCard(this.f1362e);
                this.f1358a = 1;
                obj = invoiceNetworkClient.postInvoice(str, withLoyalty, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$t */
    public static final class t extends Lambda implements Function1 {

        /* renamed from: a */
        public static final t f1363a = new t();

        public t() {
            super(1);
        }

        /* renamed from: a */
        public final void m1604a(PostInvoiceResponse response) throws PayLibServiceFailure.PaymentFailure.InsufficientFundsError {
            Intrinsics.checkNotNullParameter(response, "response");
            ErrorModel error = response.getError();
            Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
            if (numValueOf != null && numValueOf.intValue() == 501) {
                throw AbstractC8055a.m1538b(response.getError(), response.getMeta());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws PayLibServiceFailure.PaymentFailure.InsufficientFundsError {
            m1604a((PostInvoiceResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$u */
    public static final class u extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1364a;

        /* renamed from: c */
        public int f1366c;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1364a = obj;
            this.f1366c |= Integer.MIN_VALUE;
            Object objMo15364payExternally0E7RQCE = C8060d.this.mo15364payExternally0E7RQCE(null, null, this);
            return objMo15364payExternally0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15364payExternally0E7RQCE : Result.m15698boximpl(objMo15364payExternally0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$v */
    public static final class v extends Lambda implements Function0 {

        /* renamed from: a */
        public static final v f1367a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "payExternally";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$w */
    /* loaded from: classes5.dex */
    public static final class w extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1368a;

        /* renamed from: c */
        public final /* synthetic */ String f1370c;

        /* renamed from: d */
        public final /* synthetic */ ExternalPayType f1371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, ExternalPayType externalPayType, Continuation continuation) {
            super(1, continuation);
            this.f1370c = str;
            this.f1371d = externalPayType;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8060d.this.new w(this.f1370c, this.f1371d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            PaymentMethod web;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1368a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvoiceNetworkClient invoiceNetworkClient = C8060d.this.f1312a;
                String str = this.f1370c;
                ExternalPayType externalPayType = this.f1371d;
                if (externalPayType instanceof ExternalPayType.SbolPay) {
                    web = new PaymentMethod.ViaSbolPayLink(((ExternalPayType.SbolPay) externalPayType).getReturnDeepLink());
                } else if (externalPayType instanceof ExternalPayType.Sbp) {
                    web = new PaymentMethod.Sbp(((ExternalPayType.Sbp) externalPayType).getReturnDeeplink());
                } else if (externalPayType instanceof ExternalPayType.TPay) {
                    web = new PaymentMethod.TPay(((ExternalPayType.TPay) externalPayType).getSuccessUrl(), ((ExternalPayType.TPay) this.f1371d).getFailUrl());
                } else {
                    if (!(externalPayType instanceof ExternalPayType.Web)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    web = new PaymentMethod.Web(((ExternalPayType.Web) externalPayType).getSaveCard());
                }
                this.f1368a = 1;
                obj = invoiceNetworkClient.postInvoice(str, web, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.d$x */
    public static final class x extends Lambda implements Function1 {

        /* renamed from: a */
        public static final x f1372a = new x();

        public x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExternalPayRoute invoke(PostInvoiceResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            String formUrl = response.getFormUrl();
            if (formUrl != null) {
                return new WebFormPayRoute(formUrl);
            }
            String sbolPayDeepLink = response.getSbolPayDeepLink();
            if (sbolPayDeepLink != null) {
                return new DeeplinkPayRoute(sbolPayDeepLink);
            }
            return null;
        }
    }

    public C8060d(InvoiceNetworkClient invoiceNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceNetworkClient, "invoiceNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1312a = invoiceNetworkClient;
        this.f1313b = loggerFactory.get("InvoicesInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: cancelInvoice-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15359cancelInvoicegIAlus(String str, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1316c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1316c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1314a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1316c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, b.f1317a, 1, null);
        c cVar = new c(str, null);
        d dVar = d.f1321a;
        aVar.f1316c = 1;
        Object objM1554b = AbstractC8056b.m1554b(cVar, dVar, aVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: getInvoice-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15360getInvoice0E7RQCE(String str, boolean z, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f1324c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f1324c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object obj = eVar.f1322a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.f1324c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, f.f1325a, 1, null);
        g gVar = new g(z, this, str, null);
        h hVar = h.f1330a;
        eVar.f1324c = 1;
        Object objM1554b = AbstractC8056b.m1554b(gVar, hVar, eVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: getInvoices-eH_QyT8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15361getInvoiceseH_QyT8(int i2, int i3, ClosedRange closedRange, List list, IntRange intRange, String str, String str2, Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i4 = iVar.f1333c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f1333c = i4 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        i iVar2 = iVar;
        Object obj = iVar2.f1331a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = iVar2.f1333c;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, j.f1334a, 1, null);
        k kVar = new k(i2, i3, closedRange, list, intRange, str, str2, null);
        l lVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.invoice.d.l
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((GetInvoicesResponse) obj2).getInvoices();
            }
        };
        iVar2.f1333c = 1;
        Object objM1554b = AbstractC8056b.m1554b(kVar, lVar, iVar2);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: getPaymentStatusForExecutedInvoice-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15362getPaymentStatusForExecutedInvoice0E7RQCE(String str, long j2, Continuation continuation) throws Throwable {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.f1347c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.f1347c = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        }
        Object obj = mVar.f1345a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar.f1347c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, n.f1348a, 1, null);
        o oVar = new o(str, j2, null);
        p pVar = p.f1353a;
        mVar.f1347c = 1;
        Object objM1554b = AbstractC8056b.m1554b(oVar, pVar, mVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: payByCard-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15363payByCardBWLJW6A(String str, String str2, LoyaltyPoints loyaltyPoints, Continuation continuation) throws Throwable {
        q qVar;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.f1356c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.f1356c = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        }
        Object obj = qVar.f1354a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qVar.f1356c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, r.f1357a, 1, null);
        s sVar = new s(str, loyaltyPoints, str2, null);
        t tVar = t.f1363a;
        qVar.f1356c = 1;
        Object objM1554b = AbstractC8056b.m1554b(sVar, tVar, qVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor
    /* renamed from: payExternally-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15364payExternally0E7RQCE(String str, ExternalPayType externalPayType, Continuation continuation) throws Throwable {
        u uVar;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.f1366c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.f1366c = i2 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        }
        Object obj = uVar.f1364a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = uVar.f1366c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1313b, null, v.f1367a, 1, null);
        w wVar = new w(str, externalPayType, null);
        x xVar = x.f1372a;
        uVar.f1366c = 1;
        Object objM1554b = AbstractC8056b.m1554b(wVar, xVar, uVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }
}
