package com.sdkit.paylib.paylibpayment.impl.domain.network.bistro;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.bistro.BanksListResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.bistro.BanksListJson;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.a */
/* loaded from: classes6.dex */
public final class C8521a implements BistroNetworkClient {

    /* renamed from: d */
    public static final a f4857d = new a(null);

    /* renamed from: a */
    public final C8533f f4858a;

    /* renamed from: b */
    public final InterfaceC8556a f4859b;

    /* renamed from: c */
    public final PaylibLogger f4860c;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.a$a */
    /* loaded from: classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.a$b */
    /* loaded from: classes8.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f4861a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getBanksList";
        }
    }

    public C8521a(C8533f networkClient, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4858a = networkClient;
        this.f4859b = json;
        this.f4860c = loggerFactory.get("BistroNetworkClientImpl");
    }

    /* renamed from: a */
    public static final BanksListResponse m3977a(C8521a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4859b;
        return (BanksListResponse) ((InterfaceC8572a) C8519f.m3975a(BanksListJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient
    public Object getBanksList(Continuation continuation) {
        PaylibLogger.DefaultImpls.i$default(this.f4860c, null, b.f4861a, 1, null);
        return this.f4858a.m4030a("https://qr.nspk.ru/proxyapp/c2bmembers.json", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8521a.m3977a(this.f$0, c8535h);
            }
        }, continuation);
    }
}
