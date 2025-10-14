package com.sdkit.paylib.paylibpayment.impl.domain.network.purchases;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.ConfirmPurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.CreatePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.DeletePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchasesResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.purchases.ConfirmPurchaseRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.purchases.CreatePurchaseRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.ConfirmPurchaseJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.CreatePurchaseJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.DeletePurchaseJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.GetPurchaseInfoJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.GetPurchasesJson;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a */
/* loaded from: classes8.dex */
public final class C8565a implements PurchasesNetworkClient {

    /* renamed from: a */
    public final C8568d f5050a;

    /* renamed from: b */
    public final C8533f f5051b;

    /* renamed from: c */
    public final InterfaceC8511f f5052c;

    /* renamed from: d */
    public final InterfaceC8556a f5053d;

    /* renamed from: e */
    public final PaylibLogger f5054e;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f5055a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("confirmPurchase("), this.f5055a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f5056a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "createPurchase";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f5057a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("deletePurchase("), this.f5057a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f5058a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("getPurchaseInfo("), this.f5058a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f5059a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("getPurchaseInfoV2("), this.f5059a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f5060a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchases";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f5061a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getPurchasesV2";
        }
    }

    public C8565a(C8568d purchasesUrlPathProvider, C8533f networkClient, InterfaceC8511f infoProvider, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(purchasesUrlPathProvider, "purchasesUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f5050a = purchasesUrlPathProvider;
        this.f5051b = networkClient;
        this.f5052c = infoProvider;
        this.f5053d = json;
        this.f5054e = loggerFactory.get("PurchasesNetworkClientImpl");
    }

    /* renamed from: a */
    public static final ConfirmPurchaseResponse m4167a(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (ConfirmPurchaseResponse) ((InterfaceC8572a) C8519f.m3975a(ConfirmPurchaseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: b */
    public static final CreatePurchaseResponse m4168b(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (CreatePurchaseResponse) ((InterfaceC8572a) C8519f.m3975a(CreatePurchaseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: c */
    public static final DeletePurchaseResponse m4169c(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (DeletePurchaseResponse) ((InterfaceC8572a) C8519f.m3975a(DeletePurchaseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: d */
    public static final PurchaseInfoResponse m4170d(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (PurchaseInfoResponse) ((InterfaceC8572a) C8519f.m3975a(GetPurchaseInfoJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: e */
    public static final PurchaseInfoResponse m4171e(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (PurchaseInfoResponse) ((InterfaceC8572a) C8519f.m3975a(GetPurchaseInfoJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: f */
    public static final PurchasesResponse m4172f(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (PurchasesResponse) ((InterfaceC8572a) C8519f.m3975a(GetPurchasesJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: g */
    public static final PurchasesResponse m4173g(C8565a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5053d;
        return (PurchasesResponse) ((InterfaceC8572a) C8519f.m3975a(GetPurchasesJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object confirmPurchase(String str, String str2, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, new a(str), 1, null);
        ConfirmPurchaseRequestJson confirmPurchaseRequestJson = new ConfirmPurchaseRequestJson(str2);
        C8533f c8533f = this.f5051b;
        String strM4186a = this.f5050a.m4186a(this.f5052c.getPackageName(), str);
        PaylibContext paylibContext = AbstractC8566b.f5062a;
        InterfaceC8556a interfaceC8556a = this.f5053d;
        return c8533f.m4042d(strM4186a, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(ConfirmPurchaseRequestJson.class)), confirmPurchaseRequestJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda6
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4167a(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object createPurchase(String str, String str2, Integer num, String str3, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, b.f5056a, 1, null);
        CreatePurchaseRequestJson createPurchaseRequestJson = new CreatePurchaseRequestJson(str, str2, num, str3);
        C8533f c8533f = this.f5051b;
        String strM4185a = this.f5050a.m4185a(this.f5052c.getPackageName());
        PaylibContext paylibContext = AbstractC8566b.f5062a;
        InterfaceC8556a interfaceC8556a = this.f5053d;
        return c8533f.m4040c(strM4185a, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(CreatePurchaseRequestJson.class)), createPurchaseRequestJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda3
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4168b(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object deletePurchase(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, new c(str), 1, null);
        return this.f5051b.m4029a(this.f5050a.m4189b(this.f5052c.getPackageName(), str), AbstractC8566b.f5062a, (String) null, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda4
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4169c(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object getPurchaseInfo(String str, PurchaseState purchaseState, Integer num, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, new d(str), 1, null);
        return this.f5051b.m4028a(this.f5050a.m4187a(this.f5052c.getPackageName(), str, purchaseState, num), AbstractC8566b.f5062a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4170d(this.f$0, c8535h);
            }
        }, num != null ? Boxing.boxLong(num.intValue()) : null, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object getPurchaseInfoV2(String str, PurchaseState purchaseState, Integer num, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, new e(str), 1, null);
        return this.f5051b.m4028a(this.f5050a.m4190b(this.f5052c.getPackageName(), str, purchaseState, num), AbstractC8566b.f5062a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda2
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4171e(this.f$0, c8535h);
            }
        }, num != null ? Boxing.boxLong(num.intValue()) : null, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object getPurchases(Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, f.f5060a, 1, null);
        return C8533f.m4015a(this.f5051b, this.f5050a.m4185a(this.f5052c.getPackageName()), AbstractC8566b.f5062a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4172f(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient
    public Object getPurchasesV2(Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5054e, null, g.f5061a, 1, null);
        return C8533f.m4015a(this.f5051b, this.f5050a.m4188b(this.f5052c.getPackageName()), AbstractC8566b.f5062a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.a$$ExternalSyntheticLambda5
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8565a.m4173g(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }
}
