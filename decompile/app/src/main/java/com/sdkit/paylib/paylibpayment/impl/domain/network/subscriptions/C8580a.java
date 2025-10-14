package com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.ChangePaymentMethodResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionDefaultResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionsResponse;
import com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.ChangePaymentMethodJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.GetSubscriptionsJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.SubscriptionDefaultResponseJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.SubscriptionInfoResponseJson;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a */
/* loaded from: classes8.dex */
public final class C8580a implements SubscriptionsNetworkClient {

    /* renamed from: a */
    public final C8582c f5765a;

    /* renamed from: b */
    public final C8533f f5766b;

    /* renamed from: c */
    public final InterfaceC8556a f5767c;

    /* renamed from: d */
    public final PaylibLogger f5768d;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f5769a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "changePaymentMethod: " + this.f5769a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f5770a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "disableRecurrent: " + this.f5770a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f5771a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "enableRecurrent: " + this.f5771a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f5772a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionInfo: " + this.f5772a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f5773a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionInfoV2: " + this.f5773a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f5774a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptions";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$g */
    /* loaded from: classes5.dex */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f5775a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getSubscriptionsV2";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$h */
    /* loaded from: classes5.dex */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5776a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f5776a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "resetPromo: " + this.f5776a;
        }
    }

    public C8580a(C8582c subscriptionsUrlPathProvider, C8533f networkClient, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(subscriptionsUrlPathProvider, "subscriptionsUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f5765a = subscriptionsUrlPathProvider;
        this.f5766b = networkClient;
        this.f5767c = json;
        this.f5768d = loggerFactory.get("SubscriptionsNetworkClientImpl");
    }

    /* renamed from: a */
    public static final ChangePaymentMethodResponse m4613a(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (ChangePaymentMethodResponse) ((InterfaceC8572a) C8519f.m3975a(ChangePaymentMethodJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: b */
    public static final SubscriptionDefaultResponse m4614b(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionDefaultResponse) ((InterfaceC8572a) C8519f.m3975a(SubscriptionDefaultResponseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: c */
    public static final SubscriptionDefaultResponse m4615c(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionDefaultResponse) ((InterfaceC8572a) C8519f.m3975a(SubscriptionDefaultResponseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: d */
    public static final SubscriptionInfoResponse m4616d(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionInfoResponse) ((InterfaceC8572a) C8519f.m3975a(SubscriptionInfoResponseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: e */
    public static final SubscriptionInfoResponse m4617e(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionInfoResponse) ((InterfaceC8572a) C8519f.m3975a(SubscriptionInfoResponseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: f */
    public static final SubscriptionsResponse m4618f(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionsResponse) ((InterfaceC8572a) C8519f.m3975a(GetSubscriptionsJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: g */
    public static final SubscriptionsResponse m4619g(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionsResponse) ((InterfaceC8572a) C8519f.m3975a(GetSubscriptionsJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: h */
    public static final SubscriptionDefaultResponse m4620h(C8580a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5767c;
        return (SubscriptionDefaultResponse) ((InterfaceC8572a) C8519f.m3975a(SubscriptionDefaultResponseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object changePaymentMethod(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new a(str), 1, null);
        return this.f5766b.m4040c(this.f5765a.m4633a(str), PaylibContext.SUBSCRIPTIONS, "", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4613a(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object disableRecurrent(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new b(str), 1, null);
        return this.f5766b.m4042d(this.f5765a.m4635b(str), PaylibContext.SUBSCRIPTIONS, "", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda2
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4614b(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object enableRecurrent(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new c(str), 1, null);
        return this.f5766b.m4042d(this.f5765a.m4636c(str), PaylibContext.SUBSCRIPTIONS, "", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda5
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4615c(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object getSubscriptionInfo(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new d(str), 1, null);
        return C8533f.m4015a(this.f5766b, this.f5765a.m4637d(str), PaylibContext.SUBSCRIPTIONS, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda4
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4616d(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object getSubscriptionInfoV2(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new e(str), 1, null);
        return C8533f.m4015a(this.f5766b, this.f5765a.m4638e(str), PaylibContext.SUBSCRIPTIONS, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4617e(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object getSubscriptions(boolean z, int i, int i2, List list, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, f.f5774a, 1, null);
        return C8533f.m4015a(this.f5766b, this.f5765a.m4634a(z, i, i2, list), PaylibContext.SUBSCRIPTIONS, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda6
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4618f(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object getSubscriptionsV2(int i, int i2, int i3, String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, g.f5775a, 1, null);
        return C8533f.m4015a(this.f5766b, this.f5765a.m4632a(i, i2, i3, str), PaylibContext.SUBSCRIPTIONS, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda7
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4619g(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient
    public Object resetPromo(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5768d, null, new h(str), 1, null);
        return this.f5766b.m4042d(this.f5765a.m4639f(str), PaylibContext.SUBSCRIPTIONS, "", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.a$$ExternalSyntheticLambda3
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8580a.m4620h(this.f$0, c8535h);
            }
        }, continuation);
    }
}
