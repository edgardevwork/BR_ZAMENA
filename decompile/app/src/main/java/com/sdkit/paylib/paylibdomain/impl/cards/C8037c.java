package com.sdkit.paylib.paylibdomain.impl.cards;

import com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor;
import com.sdkit.paylib.paylibdomain.impl.entity.mapper.AbstractC8056b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WayToAddCard;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.AddCardResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.CardsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.DeleteCardResponse;
import kotlin.NoWhenBranchMatchedException;
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

/* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c */
/* loaded from: classes6.dex */
public final class C8037c implements CardsInteractor {

    /* renamed from: a */
    public final CardsNetworkClient f1111a;

    /* renamed from: b */
    public final PaylibLogger f1112b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1113a;

        /* renamed from: c */
        public int f1115c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1113a = obj;
            this.f1115c |= Integer.MIN_VALUE;
            Object objMo15351addCard0E7RQCE = C8037c.this.mo15351addCard0E7RQCE(null, null, this);
            return objMo15351addCard0E7RQCE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15351addCard0E7RQCE : Result.m15698boximpl(objMo15351addCard0E7RQCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1116a;

        /* renamed from: b */
        public final /* synthetic */ WayToAddCard f1117b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, WayToAddCard wayToAddCard) {
            super(0);
            this.f1116a = str;
            this.f1117b = wayToAddCard;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "addCard orderId=" + this.f1116a + ", wayToAddCard=" + this.f1117b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1118a;

        /* renamed from: c */
        public final /* synthetic */ String f1120c;

        /* renamed from: d */
        public final /* synthetic */ WayToAddCard f1121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, WayToAddCard wayToAddCard, Continuation continuation) {
            super(1, continuation);
            this.f1120c = str;
            this.f1121d = wayToAddCard;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8037c.this.new c(this.f1120c, this.f1121d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1118a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardsNetworkClient cardsNetworkClient = C8037c.this.f1111a;
                String str = this.f1120c;
                WayToAddCard wayToAddCard = this.f1121d;
                this.f1118a = 1;
                obj = cardsNetworkClient.addCard(str, wayToAddCard, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$d */
    /* loaded from: classes7.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ WayToAddCard f1122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WayToAddCard wayToAddCard) {
            super(1);
            this.f1122a = wayToAddCard;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(AddCardResponse it) {
            String deeplink;
            Intrinsics.checkNotNullParameter(it, "it");
            WayToAddCard wayToAddCard = this.f1122a;
            if (wayToAddCard instanceof WayToAddCard.Web) {
                deeplink = it.getFormUrl();
                if (deeplink == null) {
                    throw new IllegalStateException("formUrl не может быть null");
                }
            } else {
                if (!(wayToAddCard instanceof WayToAddCard.Sbolpay)) {
                    throw new NoWhenBranchMatchedException();
                }
                deeplink = it.getDeeplink();
                if (deeplink == null) {
                    throw new IllegalStateException("deeplink не может быть null");
                }
            }
            return deeplink;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$e */
    /* loaded from: classes7.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1123a;

        /* renamed from: c */
        public int f1125c;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1123a = obj;
            this.f1125c |= Integer.MIN_VALUE;
            Object objMo15352deleteCardgIAlus = C8037c.this.mo15352deleteCardgIAlus(null, this);
            return objMo15352deleteCardgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15352deleteCardgIAlus : Result.m15698boximpl(objMo15352deleteCardgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f1126a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "deleteCard cardId=" + this.f1126a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$g */
    /* loaded from: classes5.dex */
    public static final class g extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1127a;

        /* renamed from: c */
        public final /* synthetic */ String f1129c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation continuation) {
            super(1, continuation);
            this.f1129c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8037c.this.new g(this.f1129c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1127a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardsNetworkClient cardsNetworkClient = C8037c.this.f1111a;
                String str = this.f1129c;
                this.f1127a = 1;
                obj = cardsNetworkClient.deleteCard(str, this);
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

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public static final h f1130a = new h();

        public h() {
            super(1);
        }

        /* renamed from: a */
        public final void m1455a(DeleteCardResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1455a((DeleteCardResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1131a;

        /* renamed from: c */
        public int f1133c;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1131a = obj;
            this.f1133c |= Integer.MIN_VALUE;
            Object objMo15353getCardsIoAF18A = C8037c.this.mo15353getCardsIoAF18A(this);
            return objMo15353getCardsIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15353getCardsIoAF18A : Result.m15698boximpl(objMo15353getCardsIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$j */
    /* loaded from: classes7.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public static final j f1134a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getCards";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.c$k */
    /* loaded from: classes5.dex */
    public static final class k extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public int f1135a;

        public k(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8037c.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1135a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardsNetworkClient cardsNetworkClient = C8037c.this.f1111a;
                this.f1135a = 1;
                obj = cardsNetworkClient.getCards(this);
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

    public C8037c(CardsNetworkClient cardsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(cardsNetworkClient, "cardsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1111a = cardsNetworkClient;
        this.f1112b = loggerFactory.get("CardsInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor
    /* renamed from: addCard-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15351addCard0E7RQCE(String str, WayToAddCard wayToAddCard, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f1115c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f1115c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj = aVar.f1113a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f1115c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1112b, null, new b(str, wayToAddCard), 1, null);
        c cVar = new c(str, wayToAddCard, null);
        d dVar = new d(wayToAddCard);
        aVar.f1115c = 1;
        Object objM1554b = AbstractC8056b.m1554b(cVar, dVar, aVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor
    /* renamed from: deleteCard-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15352deleteCardgIAlus(String str, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f1125c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f1125c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object obj = eVar.f1123a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.f1125c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1112b, null, new f(str), 1, null);
        g gVar = new g(str, null);
        h hVar = h.f1130a;
        eVar.f1125c = 1;
        Object objM1554b = AbstractC8056b.m1554b(gVar, hVar, eVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor
    /* renamed from: getCards-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15353getCardsIoAF18A(Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f1133c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f1133c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        Object obj = iVar.f1131a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f1133c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaylibLogger.DefaultImpls.d$default(this.f1112b, null, j.f1134a, 1, null);
        k kVar = new k(null);
        l lVar = new PropertyReference1Impl() { // from class: com.sdkit.paylib.paylibdomain.impl.cards.c.l
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj2) {
                return ((CardsResponse) obj2).getCards();
            }
        };
        iVar.f1133c = 1;
        Object objM1554b = AbstractC8056b.m1554b(kVar, lVar, iVar);
        return objM1554b == coroutine_suspended ? coroutine_suspended : objM1554b;
    }
}
