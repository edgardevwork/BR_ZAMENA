package com.sdkit.paylib.paylibdomain.impl.subscriptions;

import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionStatus;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8056b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.ChangePaymentMethodPayload;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionsPayload;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.ChangePaymentMethodResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionDefaultResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionsResponse;
import com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient;
import java.util.List;
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

/* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a */
/* loaded from: classes5.dex */
public final class C8072a implements SubscriptionsInteractor {

    /* renamed from: a */
    public final SubscriptionsNetworkClient f1491a;

    /* renamed from: b */
    public final PaylibLogger f1492b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1493a;

        /* renamed from: c */
        public int f1495c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1493a = obj;
            this.f1495c |= Integer.MIN_VALUE;
            Object objMo15382changePaymentMethodgIAlus = C8072a.this.mo15382changePaymentMethodgIAlus(null, this);
            return objMo15382changePaymentMethodgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15382changePaymentMethodgIAlus : Result.m15698boximpl(objMo15382changePaymentMethodgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$a0 */
    public static final class a0 extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1496a;

        /* renamed from: c */
        public final /* synthetic */ SubscriptionStatus f1498c;

        /* renamed from: d */
        public final /* synthetic */ int f1499d;

        /* renamed from: e */
        public final /* synthetic */ int f1500e;

        /* renamed from: f */
        public final /* synthetic */ String f1501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(SubscriptionStatus subscriptionStatus, int i, int i2, String str, Continuation continuation) {
            super(1, continuation);
            this.f1498c = subscriptionStatus;
            this.f1499d = i;
            this.f1500e = i2;
            this.f1501f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((a0) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new a0(this.f1498c, this.f1499d, this.f1500e, this.f1501f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1496a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                int value = this.f1498c.getValue();
                int i2 = this.f1499d;
                int i3 = this.f1500e;
                String str = this.f1501f;
                this.f1496a = 1;
                obj = subscriptionsNetworkClient.getSubscriptionsV2(value, i2, i3, str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f1502a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "changePaymentMethod: " + this.f1502a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$b0 */
    /* loaded from: classes6.dex */
    public static final class b0 extends Lambda implements Function1 {

        /* renamed from: a */
        public static final b0 f1503a = new b0();

        public b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(SubscriptionsResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SubscriptionsPayload payload = it.getPayload();
            if (payload != null) {
                return payload.getPurchaseSubscriptions();
            }
            return null;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$c */
    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1504a;

        /* renamed from: c */
        public final /* synthetic */ String f1506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(1, continuation);
            this.f1506c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new c(this.f1506c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1504a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1506c;
                this.f1504a = 1;
                obj = subscriptionsNetworkClient.changePaymentMethod(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$c0 */
    /* loaded from: classes6.dex */
    public static final class c0 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1507a;

        /* renamed from: c */
        public int f1509c;

        public c0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1507a = obj;
            this.f1509c |= Integer.MIN_VALUE;
            Object objMo15389resetPromogIAlus = C8072a.this.mo15389resetPromogIAlus(null, this);
            return objMo15389resetPromogIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15389resetPromogIAlus : Result.m15698boximpl(objMo15389resetPromogIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final d f1510a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChangePaymentMethodPayload invoke(ChangePaymentMethodResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPayload();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$d0 */
    /* loaded from: classes6.dex */
    public static final class d0 extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str) {
            super(0);
            this.f1511a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "resetPromo: " + this.f1511a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1512a;

        /* renamed from: c */
        public int f1514c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1512a = obj;
            this.f1514c |= Integer.MIN_VALUE;
            Object objMo15383disableRecurrentgIAlus = C8072a.this.mo15383disableRecurrentgIAlus(null, this);
            return objMo15383disableRecurrentgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15383disableRecurrentgIAlus : Result.m15698boximpl(objMo15383disableRecurrentgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$e0 */
    public static final class e0 extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1515a;

        /* renamed from: c */
        public final /* synthetic */ String f1517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, Continuation continuation) {
            super(1, continuation);
            this.f1517c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((e0) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new e0(this.f1517c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1515a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1517c;
                this.f1515a = 1;
                obj = subscriptionsNetworkClient.resetPromo(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f1518a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "disableRecurrent: " + this.f1518a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$f0 */
    /* loaded from: classes6.dex */
    public static final class f0 extends Lambda implements Function1 {

        /* renamed from: a */
        public static final f0 f1519a = new f0();

        public f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m1671a(SubscriptionDefaultResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1671a((SubscriptionDefaultResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$g */
    public static final class g extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1520a;

        /* renamed from: c */
        public final /* synthetic */ String f1522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation continuation) {
            super(1, continuation);
            this.f1522c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new g(this.f1522c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1520a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1522c;
                this.f1520a = 1;
                obj = subscriptionsNetworkClient.disableRecurrent(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$h */
    /* loaded from: classes6.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public static final h f1523a = new h();

        public h() {
            super(1);
        }

        /* renamed from: a */
        public final void m1673a(SubscriptionDefaultResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1673a((SubscriptionDefaultResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$i */
    /* loaded from: classes6.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1524a;

        /* renamed from: c */
        public int f1526c;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1524a = obj;
            this.f1526c |= Integer.MIN_VALUE;
            Object objMo15384enableRecurrentgIAlus = C8072a.this.mo15384enableRecurrentgIAlus(null, this);
            return objMo15384enableRecurrentgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15384enableRecurrentgIAlus : Result.m15698boximpl(objMo15384enableRecurrentgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$j */
    /* loaded from: classes6.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f1527a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "enableRecurrent: " + this.f1527a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$k */
    public static final class k extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1528a;

        /* renamed from: c */
        public final /* synthetic */ String f1530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Continuation continuation) {
            super(1, continuation);
            this.f1530c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new k(this.f1530c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1528a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1530c;
                this.f1528a = 1;
                obj = subscriptionsNetworkClient.enableRecurrent(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$l */
    /* loaded from: classes6.dex */
    public static final class l extends Lambda implements Function1 {

        /* renamed from: a */
        public static final l f1531a = new l();

        public l() {
            super(1);
        }

        /* renamed from: a */
        public final void m1676a(SubscriptionDefaultResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1676a((SubscriptionDefaultResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$m */
    /* loaded from: classes6.dex */
    public static final class m extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1532a;

        /* renamed from: c */
        public int f1534c;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1532a = obj;
            this.f1534c |= Integer.MIN_VALUE;
            Object objMo15385getPurchaseInfogIAlus = C8072a.this.mo15385getPurchaseInfogIAlus(null, this);
            return objMo15385getPurchaseInfogIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15385getPurchaseInfogIAlus : Result.m15698boximpl(objMo15385getPurchaseInfogIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$n */
    /* loaded from: classes6.dex */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1535a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f1535a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionInfo: " + this.f1535a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$o */
    public static final class o extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1536a;

        /* renamed from: c */
        public final /* synthetic */ String f1538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Continuation continuation) {
            super(1, continuation);
            this.f1538c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new o(this.f1538c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1536a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1538c;
                this.f1536a = 1;
                obj = subscriptionsNetworkClient.getSubscriptionInfo(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$p */
    /* loaded from: classes6.dex */
    public static final class p extends Lambda implements Function1 {

        /* renamed from: a */
        public static final p f1539a = new p();

        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PurchaseSubscriptionInfo invoke(SubscriptionInfoResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPayload();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$q */
    /* loaded from: classes6.dex */
    public static final class q extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1540a;

        /* renamed from: c */
        public int f1542c;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1540a = obj;
            this.f1542c |= Integer.MIN_VALUE;
            Object objMo15386getSubscriptionInfoV2gIAlus = C8072a.this.mo15386getSubscriptionInfoV2gIAlus(null, this);
            return objMo15386getSubscriptionInfoV2gIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15386getSubscriptionInfoV2gIAlus : Result.m15698boximpl(objMo15386getSubscriptionInfoV2gIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$r */
    /* loaded from: classes6.dex */
    public static final class r extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1543a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(0);
            this.f1543a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionInfoV2: " + this.f1543a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$s */
    public static final class s extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1544a;

        /* renamed from: c */
        public final /* synthetic */ String f1546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Continuation continuation) {
            super(1, continuation);
            this.f1546c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new s(this.f1546c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1544a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                String str = this.f1546c;
                this.f1544a = 1;
                obj = subscriptionsNetworkClient.getSubscriptionInfoV2(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$t */
    /* loaded from: classes6.dex */
    public static final class t extends Lambda implements Function1 {

        /* renamed from: a */
        public static final t f1547a = new t();

        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PurchaseSubscriptionInfo invoke(SubscriptionInfoResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPayload();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$u */
    /* loaded from: classes6.dex */
    public static final class u extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1548a;

        /* renamed from: c */
        public int f1550c;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1548a = obj;
            this.f1550c |= Integer.MIN_VALUE;
            Object objMo15387getSubscriptionsyxL6bBk = C8072a.this.mo15387getSubscriptionsyxL6bBk(false, 0, 0, null, this);
            return objMo15387getSubscriptionsyxL6bBk == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15387getSubscriptionsyxL6bBk : Result.m15698boximpl(objMo15387getSubscriptionsyxL6bBk);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$v */
    /* loaded from: classes6.dex */
    public static final class v extends Lambda implements Function0 {

        /* renamed from: a */
        public static final v f1551a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptions";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$w */
    public static final class w extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1552a;

        /* renamed from: c */
        public final /* synthetic */ boolean f1554c;

        /* renamed from: d */
        public final /* synthetic */ int f1555d;

        /* renamed from: e */
        public final /* synthetic */ int f1556e;

        /* renamed from: f */
        public final /* synthetic */ List f1557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, int i, int i2, List list, Continuation continuation) {
            super(1, continuation);
            this.f1554c = z;
            this.f1555d = i;
            this.f1556e = i2;
            this.f1557f = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8072a.this.new w(this.f1554c, this.f1555d, this.f1556e, this.f1557f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1552a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubscriptionsNetworkClient subscriptionsNetworkClient = C8072a.this.f1491a;
                boolean z = this.f1554c;
                int i2 = this.f1555d;
                int i3 = this.f1556e;
                List<String> list = this.f1557f;
                this.f1552a = 1;
                obj = subscriptionsNetworkClient.getSubscriptions(z, i2, i3, list, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$x */
    /* loaded from: classes6.dex */
    public static final class x extends Lambda implements Function1 {

        /* renamed from: a */
        public static final x f1558a = new x();

        public x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(SubscriptionsResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SubscriptionsPayload payload = it.getPayload();
            if (payload != null) {
                return payload.getPurchaseSubscriptions();
            }
            return null;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$y */
    /* loaded from: classes6.dex */
    public static final class y extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1559a;

        /* renamed from: c */
        public int f1561c;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1559a = obj;
            this.f1561c |= Integer.MIN_VALUE;
            Object objMo15388getSubscriptionsV2yxL6bBk = C8072a.this.mo15388getSubscriptionsV2yxL6bBk(null, 0, 0, null, this);
            return objMo15388getSubscriptionsV2yxL6bBk == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15388getSubscriptionsV2yxL6bBk : Result.m15698boximpl(objMo15388getSubscriptionsV2yxL6bBk);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.subscriptions.a$z */
    /* loaded from: classes6.dex */
    public static final class z extends Lambda implements Function0 {

        /* renamed from: a */
        public static final z f1562a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionsV2";
        }
    }

    public C8072a(SubscriptionsNetworkClient subscriptionsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(subscriptionsNetworkClient, "subscriptionsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1491a = subscriptionsNetworkClient;
        this.f1492b = loggerFactory.get("SubscriptionsInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: changePaymentMethod-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15382changePaymentMethodgIAlus(String str, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1495c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1495c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1493a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1495c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new b(str), 1, null);
        c cVar = new c(str, null);
        d dVar = d.f1510a;
        aVar.f1495c = 1;
        Object objM1550a = AbstractC8056b.m1550a(cVar, dVar, aVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: disableRecurrent-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15383disableRecurrentgIAlus(String str, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f1514c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f1514c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object obj = eVar.f1512a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.f1514c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new f(str), 1, null);
        g gVar = new g(str, null);
        h hVar = h.f1523a;
        eVar.f1514c = 1;
        Object objM1550a = AbstractC8056b.m1550a(gVar, hVar, eVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: enableRecurrent-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15384enableRecurrentgIAlus(String str, Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f1526c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f1526c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        Object obj = iVar.f1524a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f1526c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new j(str), 1, null);
        k kVar = new k(str, null);
        l lVar = l.f1531a;
        iVar.f1526c = 1;
        Object objM1550a = AbstractC8056b.m1550a(kVar, lVar, iVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: getPurchaseInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15385getPurchaseInfogIAlus(String str, Continuation continuation) throws Throwable {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.f1534c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.f1534c = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        }
        Object obj = mVar.f1532a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar.f1534c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new n(str), 1, null);
        o oVar = new o(str, null);
        p pVar = p.f1539a;
        mVar.f1534c = 1;
        Object objM1550a = AbstractC8056b.m1550a(oVar, pVar, mVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: getSubscriptionInfoV2-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15386getSubscriptionInfoV2gIAlus(String str, Continuation continuation) throws Throwable {
        q qVar;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.f1542c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.f1542c = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        }
        Object obj = qVar.f1540a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qVar.f1542c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new r(str), 1, null);
        s sVar = new s(str, null);
        t tVar = t.f1547a;
        qVar.f1542c = 1;
        Object objM1550a = AbstractC8056b.m1550a(sVar, tVar, qVar);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: getSubscriptions-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15387getSubscriptionsyxL6bBk(boolean z2, int i2, int i3, List list, Continuation continuation) throws Throwable {
        u uVar;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i4 = uVar.f1550c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uVar.f1550c = i4 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        }
        u uVar2 = uVar;
        Object obj = uVar2.f1548a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = uVar2.f1550c;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, v.f1551a, 1, null);
        w wVar = new w(z2, i2, i3, list, null);
        x xVar = x.f1558a;
        uVar2.f1550c = 1;
        Object objM1550a = AbstractC8056b.m1550a(wVar, xVar, uVar2);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: getSubscriptionsV2-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15388getSubscriptionsV2yxL6bBk(SubscriptionStatus subscriptionStatus, int i2, int i3, String str, Continuation continuation) throws Throwable {
        y yVar;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i4 = yVar.f1561c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yVar.f1561c = i4 - Integer.MIN_VALUE;
            } else {
                yVar = new y(continuation);
            }
        }
        y yVar2 = yVar;
        Object obj = yVar2.f1559a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = yVar2.f1561c;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, z.f1562a, 1, null);
        a0 a0Var = new a0(subscriptionStatus, i2, i3, str, null);
        b0 b0Var = b0.f1503a;
        yVar2.f1561c = 1;
        Object objM1550a = AbstractC8056b.m1550a(a0Var, b0Var, yVar2);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor
    /* renamed from: resetPromo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15389resetPromogIAlus(String str, Continuation continuation) throws Throwable {
        c0 c0Var;
        if (continuation instanceof c0) {
            c0Var = (c0) continuation;
            int i2 = c0Var.f1509c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.f1509c = i2 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(continuation);
            }
        }
        Object obj = c0Var.f1507a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0Var.f1509c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1492b, null, new d0(str), 1, null);
        e0 e0Var = new e0(str, null);
        f0 f0Var = f0.f1519a;
        c0Var.f1509c = 1;
        Object objM1550a = AbstractC8056b.m1550a(e0Var, f0Var, c0Var);
        return objM1550a == coroutine_suspended ? coroutine_suspended : objM1550a;
    }
}
