package com.sdkit.paylib.paylibpayment.impl.domain.network.products;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.products.ProductsResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.GetProductsJson;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.products.a */
/* loaded from: classes8.dex */
public final class C8560a implements ProductsNetworkClient {

    /* renamed from: a */
    public final C8563d f5037a;

    /* renamed from: b */
    public final C8533f f5038b;

    /* renamed from: c */
    public final InterfaceC8511f f5039c;

    /* renamed from: d */
    public final InterfaceC8556a f5040d;

    /* renamed from: e */
    public final PaylibLogger f5041e;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.products.a$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f5042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.f5042a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getProducts ids=" + CollectionsKt___CollectionsKt.joinToString$default(this.f5042a, null, null, null, 0, null, null, 63, null);
        }
    }

    public C8560a(C8563d productsUrlPathProvider, C8533f networkClient, InterfaceC8511f infoProvider, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(productsUrlPathProvider, "productsUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f5037a = productsUrlPathProvider;
        this.f5038b = networkClient;
        this.f5039c = infoProvider;
        this.f5040d = json;
        this.f5041e = loggerFactory.get("ProductsNetworkClientImpl");
    }

    /* renamed from: a */
    public static final ProductsResponse m4156a(C8560a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f5040d;
        return (ProductsResponse) ((InterfaceC8572a) C8519f.m3975a(GetProductsJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient
    public Object getProducts(List list, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f5041e, null, new a(list), 1, null);
        return C8533f.m4015a(this.f5038b, this.f5037a.m4162a(this.f5039c.getPackageName(), list), AbstractC8561b.f5043a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.products.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8560a.m4156a(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }
}
