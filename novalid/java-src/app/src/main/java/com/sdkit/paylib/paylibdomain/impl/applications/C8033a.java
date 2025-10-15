package com.sdkit.paylib.paylibdomain.impl.applications;

import com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8056b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.ApplicationPurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.BuyApplicationResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.DeleteApplicationPurchaseResponse;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a */
/* loaded from: classes6.dex */
public final class C8033a implements ApplicationsInteractor {

    /* renamed from: a */
    public final ApplicationsNetworkClient f1077a;

    /* renamed from: b */
    public final PaylibLogger f1078b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1079a;

        /* renamed from: c */
        public int f1081c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1079a = obj;
            this.f1081c |= Integer.MIN_VALUE;
            Object objMo15347buyApplication0E7RQCE = C8033a.this.mo15347buyApplication0E7RQCE(null, null, this);
            return objMo15347buyApplication0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15347buyApplication0E7RQCE : Result.m15698boximpl(objMo15347buyApplication0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1082a;

        /* renamed from: b */
        public final /* synthetic */ String f1083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f1082a = str;
            this.f1083b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "buyApplication appsCode=" + this.f1082a + ", developerPayload=" + this.f1083b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1084a;

        /* renamed from: c */
        public final /* synthetic */ String f1086c;

        /* renamed from: d */
        public final /* synthetic */ String f1087d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f1086c = str;
            this.f1087d = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8033a.this.new c(this.f1086c, this.f1087d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1084a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApplicationsNetworkClient applicationsNetworkClient = C8033a.this.f1077a;
                String str = this.f1086c;
                String str2 = this.f1087d;
                this.f1084a = 1;
                obj = applicationsNetworkClient.buyApplication(str, str2, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1089a;

        /* renamed from: c */
        public int f1091c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1089a = obj;
            this.f1091c |= Integer.MIN_VALUE;
            Object objMo15348deleteApplicationPurchasegIAlus = C8033a.this.mo15348deleteApplicationPurchasegIAlus(null, this);
            return objMo15348deleteApplicationPurchasegIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15348deleteApplicationPurchasegIAlus : Result.m15698boximpl(objMo15348deleteApplicationPurchasegIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1092a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f1092a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "deletePurchase purchaseId=" + this.f1092a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$g */
    /* loaded from: classes5.dex */
    public static final class g extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1093a;

        /* renamed from: c */
        public final /* synthetic */ String f1095c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation continuation) {
            super(1, continuation);
            this.f1095c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8033a.this.new g(this.f1095c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1093a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApplicationsNetworkClient applicationsNetworkClient = C8033a.this.f1077a;
                String str = this.f1095c;
                this.f1093a = 1;
                obj = applicationsNetworkClient.deleteApplicationPurchase(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$h */
    /* loaded from: classes7.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public static final h f1096a = new h();

        public h() {
            super(1);
        }

        /* renamed from: a */
        public final void m1438a(DeleteApplicationPurchaseResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1438a((DeleteApplicationPurchaseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$i */
    /* loaded from: classes7.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1097a;

        /* renamed from: c */
        public int f1099c;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1097a = obj;
            this.f1099c |= Integer.MIN_VALUE;
            Object objMo15349getApplicationPurchaseInfogIAlus = C8033a.this.mo15349getApplicationPurchaseInfogIAlus(null, this);
            return objMo15349getApplicationPurchaseInfogIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15349getApplicationPurchaseInfogIAlus : Result.m15698boximpl(objMo15349getApplicationPurchaseInfogIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$j */
    /* loaded from: classes7.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1100a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f1100a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getApplicationPurchaseInfo purchaseId=" + this.f1100a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.a$k */
    /* loaded from: classes5.dex */
    public static final class k extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1101a;

        /* renamed from: c */
        public final /* synthetic */ String f1103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Continuation continuation) {
            super(1, continuation);
            this.f1103c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8033a.this.new k(this.f1103c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1101a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApplicationsNetworkClient applicationsNetworkClient = C8033a.this.f1077a;
                String str = this.f1103c;
                this.f1101a = 1;
                obj = ApplicationsNetworkClient.DefaultImpls.getApplicationPurchaseInfo$default(applicationsNetworkClient, str, null, null, this, 6, null);
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

    public C8033a(ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(applicationsNetworkClient, "applicationsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1077a = applicationsNetworkClient;
        this.f1078b = loggerFactory.get("ApplicationsInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor
    /* renamed from: buyApplication-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15347buyApplication0E7RQCE(String str, String str2, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1081c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1081c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1079a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1081c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1078b, null, new b(str, str2), 1, null);
        c cVar = new c(str, str2, null);
        d dVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.applications.a.d
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((BuyApplicationResponse) obj2).getAppInfo();
            }
        };
        aVar.f1081c = 1;
        Object objM1550a = AbstractC8056b.m1550a(cVar, dVar, aVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor
    /* renamed from: deleteApplicationPurchase-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15348deleteApplicationPurchasegIAlus(String str, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f1091c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f1091c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object obj = eVar.f1089a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.f1091c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1078b, null, new f(str), 1, null);
        g gVar = new g(str, null);
        h hVar = h.f1096a;
        eVar.f1091c = 1;
        Object objM1550a = AbstractC8056b.m1550a(gVar, hVar, eVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor
    /* renamed from: getApplicationPurchaseInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15349getApplicationPurchaseInfogIAlus(String str, Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f1099c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f1099c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        Object obj = iVar.f1097a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f1099c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1078b, null, new j(str), 1, null);
        k kVar = new k(str, null);
        l lVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.applications.a.l
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((ApplicationPurchaseInfoResponse) obj2).getPurchase();
            }
        };
        iVar.f1099c = 1;
        Object objM1550a = AbstractC8056b.m1550a(kVar, lVar, iVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }
}
