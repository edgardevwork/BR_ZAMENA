package com.sdkit.paylib.paylibpayment.impl.domain.network.applications;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.ApplicationPurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.BuyApplicationResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.DeleteApplicationPurchaseResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.applications.BuyApplicationRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications.ApplicationPurchaseInfoJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications.BuyApplicationJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications.DeleteApplicationPurchaseJson;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a */
/* loaded from: classes6.dex */
public final class C8514a implements ApplicationsNetworkClient {

    /* renamed from: a */
    public final C8517d f4841a;

    /* renamed from: b */
    public final C8533f f4842b;

    /* renamed from: c */
    public final InterfaceC8556a f4843c;

    /* renamed from: d */
    public final PaylibLogger f4844d;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4845a;

        /* renamed from: b */
        public final /* synthetic */ String f4846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.f4845a = str;
            this.f4846b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("buyApplication(appsCode=");
            sb.append(this.f4845a);
            sb.append(", developerPayload=");
            return C8032c.m1430a(sb, this.f4846b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$b */
    /* loaded from: classes8.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f4847a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("deleteApplicationPurchase("), this.f4847a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$c */
    /* loaded from: classes8.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4848a;

        /* renamed from: b */
        public final /* synthetic */ PurchaseState f4849b;

        /* renamed from: c */
        public final /* synthetic */ Integer f4850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, PurchaseState purchaseState, Integer num) {
            super(0);
            this.f4848a = str;
            this.f4849b = purchaseState;
            this.f4850c = num;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getApplicationPurchaseInfo(" + this.f4848a + ", " + this.f4849b + ", waitSec=" + this.f4850c + ')';
        }
    }

    public C8514a(C8517d applicationsUrlPathProvider, C8533f networkClient, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(applicationsUrlPathProvider, "applicationsUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4841a = applicationsUrlPathProvider;
        this.f4842b = networkClient;
        this.f4843c = json;
        this.f4844d = loggerFactory.get("ApplicationsNetworkClientImpl");
    }

    /* renamed from: a */
    public static final BuyApplicationResponse m3957a(C8514a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4843c;
        return (BuyApplicationResponse) ((InterfaceC8572a) C8519f.m3975a(BuyApplicationJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: b */
    public static final DeleteApplicationPurchaseResponse m3958b(C8514a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4843c;
        return (DeleteApplicationPurchaseResponse) ((InterfaceC8572a) C8519f.m3975a(DeleteApplicationPurchaseJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: c */
    public static final ApplicationPurchaseInfoResponse m3959c(C8514a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4843c;
        return (ApplicationPurchaseInfoResponse) ((InterfaceC8572a) C8519f.m3975a(ApplicationPurchaseInfoJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient
    public Object buyApplication(String str, String str2, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4844d, null, new a(str, str2), 1, null);
        BuyApplicationRequestJson buyApplicationRequestJson = new BuyApplicationRequestJson(str, str2);
        C8533f c8533f = this.f4842b;
        String strM3968a = this.f4841a.m3968a();
        PaylibContext paylibContext = AbstractC8515b.f4851a;
        InterfaceC8556a interfaceC8556a = this.f4843c;
        return c8533f.m4040c(strM3968a, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(BuyApplicationRequestJson.class)), buyApplicationRequestJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8514a.m3957a(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient
    public Object deleteApplicationPurchase(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4844d, null, new b(str), 1, null);
        return this.f4842b.m4029a(this.f4841a.m3969a(str), AbstractC8515b.f4851a, (String) null, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8514a.m3958b(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient
    public Object getApplicationPurchaseInfo(String str, PurchaseState purchaseState, Integer num, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4844d, null, new c(str, purchaseState, num), 1, null);
        return C8533f.m4015a(this.f4842b, this.f4841a.m3970a(str, purchaseState, num), AbstractC8515b.f4851a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.a$$ExternalSyntheticLambda2
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8514a.m3959c(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }
}
