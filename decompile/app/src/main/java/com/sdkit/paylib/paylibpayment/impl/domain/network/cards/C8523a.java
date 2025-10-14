package com.sdkit.paylib.paylibpayment.impl.domain.network.cards;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.WayToAddCard;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.AddCardResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.CardsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.DeleteCardResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.AbstractC8503a;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.AbstractC8559b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.cards.AddCardBySbolpayRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.cards.AddCardByWebRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.AddCardJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.DeleteCardJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.GetCardsJson;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a */
/* loaded from: classes6.dex */
public final class C8523a implements CardsNetworkClient {

    /* renamed from: a */
    public final C8526d f4865a;

    /* renamed from: b */
    public final C8533f f4866b;

    /* renamed from: c */
    public final InterfaceC8511f f4867c;

    /* renamed from: d */
    public final InterfaceC8556a f4868d;

    /* renamed from: e */
    public final PaylibLogger f4869e;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public static final a f4870a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "addCard";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$b */
    /* loaded from: classes8.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f4871a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("deleteCard("), this.f4871a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$c */
    /* loaded from: classes8.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f4872a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getCards";
        }
    }

    public C8523a(C8526d cardsUrlPathProvider, C8533f networkClient, InterfaceC8511f infoProvider, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(cardsUrlPathProvider, "cardsUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4865a = cardsUrlPathProvider;
        this.f4866b = networkClient;
        this.f4867c = infoProvider;
        this.f4868d = json;
        this.f4869e = loggerFactory.get("CardsNetworkClientImpl");
    }

    /* renamed from: a */
    public static final AddCardResponse m3982a(C8523a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4868d;
        return (AddCardResponse) ((InterfaceC8572a) C8519f.m3975a(AddCardJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: b */
    public static final DeleteCardResponse m3983b(C8523a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4868d;
        return (DeleteCardResponse) ((InterfaceC8572a) C8519f.m3975a(DeleteCardJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: c */
    public static final CardsResponse m3984c(C8523a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4868d;
        return (CardsResponse) ((InterfaceC8572a) C8519f.m3975a(GetCardsJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient
    public Object addCard(String str, WayToAddCard wayToAddCard, Continuation continuation) {
        Object addCardByWebRequestJson;
        InterfaceC8556a interfaceC8556a;
        SerializersModule serializersModule;
        Class cls;
        PaylibLogger.DefaultImpls.d$default(this.f4869e, null, a.f4870a, 1, null);
        C8533f c8533f = this.f4866b;
        String strM3993a = this.f4865a.m3993a();
        PaylibContext paylibContext = AbstractC8524b.f4873a;
        if (wayToAddCard instanceof WayToAddCard.Sbolpay) {
            addCardByWebRequestJson = new AddCardBySbolpayRequestJson(m3985a(), str, (String) null, ((WayToAddCard.Sbolpay) wayToAddCard).getReturnDeeplink(), 4, (DefaultConstructorMarker) null);
            interfaceC8556a = this.f4868d;
            serializersModule = interfaceC8556a.getSerializersModule();
            cls = AddCardBySbolpayRequestJson.class;
        } else {
            if (!(wayToAddCard instanceof WayToAddCard.Web)) {
                throw new NoWhenBranchMatchedException();
            }
            WayToAddCard.Web web = (WayToAddCard.Web) wayToAddCard;
            addCardByWebRequestJson = new AddCardByWebRequestJson(m3985a(), str, (String) null, web.getReturnUrl(), web.getFailUrl(), 4, (DefaultConstructorMarker) null);
            interfaceC8556a = this.f4868d;
            serializersModule = interfaceC8556a.getSerializersModule();
            cls = AddCardByWebRequestJson.class;
        }
        return c8533f.m4040c(strM3993a, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(serializersModule, Reflection.typeOf(cls)), addCardByWebRequestJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8523a.m3982a(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient
    public Object deleteCard(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4869e, null, new b(str), 1, null);
        return this.f4866b.m4029a(this.f4865a.m3994a(str), AbstractC8524b.f4873a, (String) null, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$$ExternalSyntheticLambda2
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8523a.m3983b(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient
    public Object getCards(Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4869e, null, c.f4872a, 1, null);
        return C8533f.m4015a(this.f4866b, this.f4865a.m3993a(), AbstractC8524b.f4873a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8523a.m3984c(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    /* renamed from: a */
    public final Map m3985a() {
        return AbstractC8559b.m4154a(AbstractC8503a.m3941a(this.f4867c));
    }
}
