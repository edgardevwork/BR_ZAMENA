package com.sdkit.paylib.paylibdomain.impl.purchases;

import com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8056b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.ConfirmPurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.CreatePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.DeletePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchasesResponse;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a */
/* loaded from: classes5.dex */
public final class C8067a implements PurchasesInteractor {

    /* renamed from: a */
    public final PurchasesNetworkClient f1415a;

    /* renamed from: b */
    public final PaylibLogger f1416b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1417a;

        /* renamed from: c */
        public int f1419c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1417a = obj;
            this.f1419c |= Integer.MIN_VALUE;
            Object objMo15372confirmPurchase0E7RQCE = C8067a.this.mo15372confirmPurchase0E7RQCE(null, null, this);
            return objMo15372confirmPurchase0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15372confirmPurchase0E7RQCE : Result.m15698boximpl(objMo15372confirmPurchase0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$a0 */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a0 extends FunctionReferenceImpl implements Function1, SuspendFunction {
        public a0(Object obj) {
            super(1, obj, PurchasesNetworkClient.class, "getPurchasesV2", "getPurchasesV2(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((PurchasesNetworkClient) this.receiver).getPurchasesV2(continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1420a;

        /* renamed from: b */
        public final /* synthetic */ String f1421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f1420a = str;
            this.f1421b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "confirmPurchase purchaseId=" + this.f1420a + ", developerPayload=" + this.f1421b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$c */
    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1423a;

        /* renamed from: c */
        public final /* synthetic */ String f1425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(1, continuation);
            this.f1425c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8067a.this.new c(this.f1425c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1423a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PurchasesNetworkClient purchasesNetworkClient = C8067a.this.f1415a;
                String str = this.f1425c;
                this.f1423a = 1;
                obj = PurchasesNetworkClient.DefaultImpls.confirmPurchase$default(purchasesNetworkClient, str, null, this, 2, null);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final d f1426a = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1630a(ConfirmPurchaseResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1630a((ConfirmPurchaseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1427a;

        /* renamed from: c */
        public int f1429c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1427a = obj;
            this.f1429c |= Integer.MIN_VALUE;
            Object objMo15373createPurchaseyxL6bBk = C8067a.this.mo15373createPurchaseyxL6bBk(null, null, null, null, this);
            return objMo15373createPurchaseyxL6bBk == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15373createPurchaseyxL6bBk : Result.m15698boximpl(objMo15373createPurchaseyxL6bBk);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f1430a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f1430a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$g */
    public static final class g extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1431a;

        /* renamed from: c */
        public final /* synthetic */ String f1433c;

        /* renamed from: d */
        public final /* synthetic */ String f1434d;

        /* renamed from: e */
        public final /* synthetic */ Integer f1435e;

        /* renamed from: f */
        public final /* synthetic */ String f1436f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, Integer num, String str3, Continuation continuation) {
            super(1, continuation);
            this.f1433c = str;
            this.f1434d = str2;
            this.f1435e = num;
            this.f1436f = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8067a.this.new g(this.f1433c, this.f1434d, this.f1435e, this.f1436f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1431a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PurchasesNetworkClient purchasesNetworkClient = C8067a.this.f1415a;
                String str = this.f1433c;
                String str2 = this.f1434d;
                Integer num = this.f1435e;
                String str3 = this.f1436f;
                this.f1431a = 1;
                obj = purchasesNetworkClient.createPurchase(str, str2, num, str3, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$i */
    /* loaded from: classes6.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1438a;

        /* renamed from: c */
        public int f1440c;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1438a = obj;
            this.f1440c |= Integer.MIN_VALUE;
            Object objMo15374deletePurchasegIAlus = C8067a.this.mo15374deletePurchasegIAlus(null, this);
            return objMo15374deletePurchasegIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15374deletePurchasegIAlus : Result.m15698boximpl(objMo15374deletePurchasegIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$j */
    /* loaded from: classes6.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f1441a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "deletePurchase purchaseId=" + this.f1441a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$k */
    public static final class k extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1442a;

        /* renamed from: c */
        public final /* synthetic */ String f1444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Continuation continuation) {
            super(1, continuation);
            this.f1444c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8067a.this.new k(this.f1444c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1442a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PurchasesNetworkClient purchasesNetworkClient = C8067a.this.f1415a;
                String str = this.f1444c;
                this.f1442a = 1;
                obj = purchasesNetworkClient.deletePurchase(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$l */
    /* loaded from: classes6.dex */
    public static final class l extends Lambda implements Function1 {

        /* renamed from: a */
        public static final l f1445a = new l();

        public l() {
            super(1);
        }

        /* renamed from: a */
        public final void m1635a(DeletePurchaseResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1635a((DeletePurchaseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$m */
    /* loaded from: classes6.dex */
    public static final class m extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1446a;

        /* renamed from: c */
        public int f1448c;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1446a = obj;
            this.f1448c |= Integer.MIN_VALUE;
            Object objMo15375getPurchaseInfogIAlus = C8067a.this.mo15375getPurchaseInfogIAlus(null, this);
            return objMo15375getPurchaseInfogIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15375getPurchaseInfogIAlus : Result.m15698boximpl(objMo15375getPurchaseInfogIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$n */
    /* loaded from: classes6.dex */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f1449a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchaseInfo purchaseId=" + this.f1449a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$o */
    public static final class o extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1450a;

        /* renamed from: c */
        public final /* synthetic */ String f1452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Continuation continuation) {
            super(1, continuation);
            this.f1452c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8067a.this.new o(this.f1452c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1450a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PurchasesNetworkClient purchasesNetworkClient = C8067a.this.f1415a;
                String str = this.f1452c;
                this.f1450a = 1;
                obj = PurchasesNetworkClient.DefaultImpls.getPurchaseInfo$default(purchasesNetworkClient, str, null, null, this, 6, null);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$q */
    /* loaded from: classes6.dex */
    public static final class q extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1454a;

        /* renamed from: c */
        public int f1456c;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1454a = obj;
            this.f1456c |= Integer.MIN_VALUE;
            Object objMo15376getPurchaseInfoV2gIAlus = C8067a.this.mo15376getPurchaseInfoV2gIAlus(null, this);
            return objMo15376getPurchaseInfoV2gIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15376getPurchaseInfoV2gIAlus : Result.m15698boximpl(objMo15376getPurchaseInfoV2gIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$r */
    /* loaded from: classes6.dex */
    public static final class r extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(0);
            this.f1457a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchaseInfoV2 purchaseId=" + this.f1457a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$s */
    public static final class s extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1458a;

        /* renamed from: c */
        public final /* synthetic */ String f1460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Continuation continuation) {
            super(1, continuation);
            this.f1460c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8067a.this.new s(this.f1460c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1458a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PurchasesNetworkClient purchasesNetworkClient = C8067a.this.f1415a;
                String str = this.f1460c;
                this.f1458a = 1;
                obj = PurchasesNetworkClient.DefaultImpls.getPurchaseInfoV2$default(purchasesNetworkClient, str, null, null, this, 6, null);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$u */
    /* loaded from: classes6.dex */
    public static final class u extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1462a;

        /* renamed from: c */
        public int f1464c;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1462a = obj;
            this.f1464c |= Integer.MIN_VALUE;
            Object objMo15377getPurchasesIoAF18A = C8067a.this.mo15377getPurchasesIoAF18A(this);
            return objMo15377getPurchasesIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15377getPurchasesIoAF18A : Result.m15698boximpl(objMo15377getPurchasesIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$v */
    /* loaded from: classes6.dex */
    public static final class v extends Lambda implements Function0 {

        /* renamed from: a */
        public static final v f1465a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchases";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$w */
    /* loaded from: classes8.dex */
    public /* synthetic */ class w extends FunctionReferenceImpl implements Function1, SuspendFunction {
        public w(Object obj) {
            super(1, obj, PurchasesNetworkClient.class, "getPurchases", "getPurchases(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((PurchasesNetworkClient) this.receiver).getPurchases(continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$y */
    /* loaded from: classes6.dex */
    public static final class y extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1467a;

        /* renamed from: c */
        public int f1469c;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1467a = obj;
            this.f1469c |= Integer.MIN_VALUE;
            Object objMo15378getPurchasesV2IoAF18A = C8067a.this.mo15378getPurchasesV2IoAF18A(this);
            return objMo15378getPurchasesV2IoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15378getPurchasesV2IoAF18A : Result.m15698boximpl(objMo15378getPurchasesV2IoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.a$z */
    /* loaded from: classes6.dex */
    public static final class z extends Lambda implements Function0 {

        /* renamed from: a */
        public static final z f1470a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchasesV2";
        }
    }

    public C8067a(PurchasesNetworkClient purchasesNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(purchasesNetworkClient, "purchasesNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1415a = purchasesNetworkClient;
        this.f1416b = loggerFactory.get("PurchasesInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: confirmPurchase-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15372confirmPurchase0E7RQCE(String str, String str2, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1419c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1419c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1417a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1419c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, new b(str, str2), 1, null);
        c cVar = new c(str, null);
        d dVar = d.f1426a;
        aVar.f1419c = 1;
        Object objM1550a = AbstractC8056b.m1550a(cVar, dVar, aVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: createPurchase-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15373createPurchaseyxL6bBk(String str, String str2, Integer num, String str3, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f1429c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f1429c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        e eVar2 = eVar;
        Object obj = eVar2.f1427a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar2.f1429c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, new f("createPurchase productId=" + str + ", orderId=" + str2 + ", productQuantity=" + num + ",developerPayload=" + str3), 1, null);
        g gVar = new g(str, str2, num, str3, null);
        h hVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.purchases.a.h
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((CreatePurchaseResponse) obj2).getPurchaseInfo();
            }
        };
        eVar2.f1429c = 1;
        Object objM1550a = AbstractC8056b.m1550a(gVar, hVar, eVar2);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: deletePurchase-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15374deletePurchasegIAlus(String str, Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f1440c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f1440c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        Object obj = iVar.f1438a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f1440c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, new j(str), 1, null);
        k kVar = new k(str, null);
        l lVar = l.f1445a;
        iVar.f1440c = 1;
        Object objM1550a = AbstractC8056b.m1550a(kVar, lVar, iVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: getPurchaseInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15375getPurchaseInfogIAlus(String str, Continuation continuation) throws Throwable {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.f1448c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.f1448c = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        }
        Object obj = mVar.f1446a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar.f1448c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, new n(str), 1, null);
        o oVar = new o(str, null);
        p pVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.purchases.a.p
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((PurchaseInfoResponse) obj2).getPurchase();
            }
        };
        mVar.f1448c = 1;
        Object objM1550a = AbstractC8056b.m1550a(oVar, pVar, mVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: getPurchaseInfoV2-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15376getPurchaseInfoV2gIAlus(String str, Continuation continuation) throws Throwable {
        q qVar;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.f1456c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.f1456c = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        }
        Object obj = qVar.f1454a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qVar.f1456c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, new r(str), 1, null);
        s sVar = new s(str, null);
        t tVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.purchases.a.t
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((PurchaseInfoResponse) obj2).getPurchase();
            }
        };
        qVar.f1456c = 1;
        Object objM1550a = AbstractC8056b.m1550a(sVar, tVar, qVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: getPurchases-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15377getPurchasesIoAF18A(Continuation continuation) throws Throwable {
        u uVar;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.f1464c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.f1464c = i2 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        }
        Object obj = uVar.f1462a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = uVar.f1464c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, v.f1465a, 1, null);
        w wVar = new w(this.f1415a);
        x xVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.purchases.a.x
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((PurchasesResponse) obj2).getPurchases();
            }
        };
        uVar.f1464c = 1;
        Object objM1550a = AbstractC8056b.m1550a(wVar, xVar, uVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor
    /* renamed from: getPurchasesV2-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15378getPurchasesV2IoAF18A(Continuation continuation) throws Throwable {
        y yVar;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.f1469c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.f1469c = i2 - Integer.MIN_VALUE;
            } else {
                yVar = new y(continuation);
            }
        }
        Object obj = yVar.f1467a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = yVar.f1469c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1416b, null, z.f1470a, 1, null);
        a0 a0Var = new a0(this.f1415a);
        b0 b0Var = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.purchases.a.b0
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((PurchasesResponse) obj2).getPurchases();
            }
        };
        yVar.f1469c = 1;
        Object objM1550a = AbstractC8056b.m1550a(a0Var, b0Var, yVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }
}
