package com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.core.common.AbstractC8136a;
import com.sdkit.paylib.paylibnative.p033ui.core.common.GmarktException;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.InterfaceC8155c;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8161d;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8162e;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.ApplicationPurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchaseInfoResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e */
/* loaded from: classes5.dex */
public final class C8151e implements InterfaceC8150d {

    /* renamed from: e */
    public static final a f2027e = new a(null);

    /* renamed from: a */
    public final InterfaceC8155c f2028a;

    /* renamed from: b */
    public final PurchasesNetworkClient f2029b;

    /* renamed from: c */
    public final ApplicationsNetworkClient f2030c;

    /* renamed from: d */
    public final PaylibLogger f2031d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e$a */
    /* loaded from: classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2032a;

        static {
            int[] iArr = new int[C8161d.a.values().length];
            try {
                iArr[C8161d.a.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8161d.a.PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8161d.a.CHANGE_PAYMENT_METHOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2032a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f2033a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateAction";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e$d */
    /* loaded from: classes6.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: a */
        public Object f2034a;

        /* renamed from: b */
        public Object f2035b;

        /* renamed from: c */
        public /* synthetic */ Object f2036c;

        /* renamed from: e */
        public int f2038e;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2036c = obj;
            this.f2038e |= Integer.MIN_VALUE;
            return C8151e.this.m2064a(null, null, this);
        }
    }

    public C8151e(InterfaceC8155c gmarktPurchasePayloadProvider, PurchasesNetworkClient purchasesNetworkClient, ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(gmarktPurchasePayloadProvider, "gmarktPurchasePayloadProvider");
        Intrinsics.checkNotNullParameter(purchasesNetworkClient, "purchasesNetworkClient");
        Intrinsics.checkNotNullParameter(applicationsNetworkClient, "applicationsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2028a = gmarktPurchasePayloadProvider;
        this.f2029b = purchasesNetworkClient;
        this.f2030c = applicationsNetworkClient;
        this.f2031d = loggerFactory.get("GetPurchaseInfoActionImpl");
    }

    /* renamed from: a */
    public final C8162e m2063a(ResponseWithCode responseWithCode, Function1 function1, C8161d.a aVar, String str) {
        Purchase purchase = (Purchase) function1.invoke(responseWithCode);
        if (purchase == null) {
            throw AbstractC8136a.m2021a(responseWithCode, "purchase(" + aVar + ") is null");
        }
        PurchaseState purchaseState = purchase.getPurchaseState();
        if (purchaseState != null) {
            return new C8162e(purchaseState, str);
        }
        throw AbstractC8136a.m2021a(responseWithCode, "purchaseState(" + aVar + ") is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6 A[PHI: r0 r1 r7 r8 r9
  0x00d6: PHI (r0v5 kotlin.jvm.functions.Function1) = (r0v3 kotlin.jvm.functions.Function1), (r0v4 kotlin.jvm.functions.Function1), (r0v8 kotlin.jvm.functions.Function1) binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r1v3 com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta) = 
  (r1v1 com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta)
  (r1v2 com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta)
  (r1v7 com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r7v7 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e) = 
  (r7v5 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
  (r7v6 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
  (r7v11 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r8v3 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a) = 
  (r8v1 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
  (r8v2 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
  (r8v6 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r9v14 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode) = 
  (r9v11 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
  (r9v13 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
  (r9v18 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[PHI: r0 r7 r8 r9
  0x00db: PHI (r0v7 kotlin.jvm.functions.Function1) = (r0v3 kotlin.jvm.functions.Function1), (r0v4 kotlin.jvm.functions.Function1), (r0v8 kotlin.jvm.functions.Function1) binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r7v10 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e) = 
  (r7v5 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
  (r7v6 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
  (r7v11 com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r8v5 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a) = 
  (r8v1 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
  (r8v2 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
  (r8v6 com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r9v16 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode) = 
  (r9v11 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
  (r9v13 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
  (r9v18 com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode)
 binds: [B:43:0x00d4, B:36:0x00b3, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2064a(String str, C8161d.a aVar, Continuation continuation) throws Throwable {
        d dVar;
        C8151e c8151e;
        ResponseWithCode responseWithCode;
        Function1 function1;
        RequestMeta meta;
        String traceId;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.f2038e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f2038e = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        }
        Object applicationPurchaseInfo = dVar.f2036c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.f2038e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(applicationPurchaseInfo);
            int i3 = b.f2032a[aVar.ordinal()];
            if (i3 == 1) {
                ApplicationsNetworkClient applicationsNetworkClient = this.f2030c;
                PurchaseState purchaseState = PurchaseState.INVOICE_CREATED;
                Integer numBoxInt = Boxing.boxInt(30);
                dVar.f2034a = this;
                dVar.f2035b = aVar;
                dVar.f2038e = 1;
                applicationPurchaseInfo = applicationsNetworkClient.getApplicationPurchaseInfo(str, purchaseState, numBoxInt, dVar);
                if (applicationPurchaseInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8151e = this;
                responseWithCode = (ApplicationPurchaseInfoResponse) applicationPurchaseInfo;
                function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.e
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((ApplicationPurchaseInfoResponse) obj).getPurchase();
                    }
                };
                meta = responseWithCode.getMeta();
                if (meta == null) {
                }
            } else if (i3 == 2) {
                PurchasesNetworkClient purchasesNetworkClient = this.f2029b;
                PurchaseState purchaseState2 = PurchaseState.INVOICE_CREATED;
                Integer numBoxInt2 = Boxing.boxInt(30);
                dVar.f2034a = this;
                dVar.f2035b = aVar;
                dVar.f2038e = 2;
                applicationPurchaseInfo = purchasesNetworkClient.getPurchaseInfoV2(str, purchaseState2, numBoxInt2, dVar);
                if (applicationPurchaseInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8151e = this;
                responseWithCode = (PurchaseInfoResponse) applicationPurchaseInfo;
                function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.f
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((PurchaseInfoResponse) obj).getPurchase();
                    }
                };
                meta = responseWithCode.getMeta();
                if (meta == null) {
                }
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ApplicationsNetworkClient applicationsNetworkClient2 = this.f2030c;
                PurchaseState purchaseState3 = PurchaseState.INVOICE_CREATED;
                Integer numBoxInt3 = Boxing.boxInt(30);
                dVar.f2034a = this;
                dVar.f2035b = aVar;
                dVar.f2038e = 3;
                applicationPurchaseInfo = applicationsNetworkClient2.getApplicationPurchaseInfo(str, purchaseState3, numBoxInt3, dVar);
                if (applicationPurchaseInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8151e = this;
                responseWithCode = (ApplicationPurchaseInfoResponse) applicationPurchaseInfo;
                function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.g
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((ApplicationPurchaseInfoResponse) obj).getPurchase();
                    }
                };
                meta = responseWithCode.getMeta();
                if (meta == null) {
                }
            }
        } else if (i2 == 1) {
            aVar = (C8161d.a) dVar.f2035b;
            c8151e = (C8151e) dVar.f2034a;
            ResultKt.throwOnFailure(applicationPurchaseInfo);
            responseWithCode = (ApplicationPurchaseInfoResponse) applicationPurchaseInfo;
            function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.e
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((ApplicationPurchaseInfoResponse) obj).getPurchase();
                }
            };
            meta = responseWithCode.getMeta();
            if (meta == null) {
            }
        } else if (i2 == 2) {
            aVar = (C8161d.a) dVar.f2035b;
            c8151e = (C8151e) dVar.f2034a;
            ResultKt.throwOnFailure(applicationPurchaseInfo);
            responseWithCode = (PurchaseInfoResponse) applicationPurchaseInfo;
            function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.f
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((PurchaseInfoResponse) obj).getPurchase();
                }
            };
            meta = responseWithCode.getMeta();
            if (meta == null) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (C8161d.a) dVar.f2035b;
            c8151e = (C8151e) dVar.f2034a;
            ResultKt.throwOnFailure(applicationPurchaseInfo);
            responseWithCode = (ApplicationPurchaseInfoResponse) applicationPurchaseInfo;
            function1 = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.e.g
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((ApplicationPurchaseInfoResponse) obj).getPurchase();
                }
            };
            meta = responseWithCode.getMeta();
            traceId = meta == null ? meta.getTraceId() : null;
        }
        return c8151e.m2063a(responseWithCode, function1, aVar, traceId);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.core.common.InterfaceC8139d
    /* renamed from: a */
    public Object mo2031a(Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f2031d, null, c.f2033a, 1, null);
        C8161d c8161dProvide = this.f2028a.provide();
        if (c8161dProvide != null) {
            return m2064a(c8161dProvide.m2083b(), c8161dProvide.m2084c(), continuation);
        }
        throw new GmarktException("createPurchaseState is null");
    }
}
