package com.sdkit.paylib.paylibdomain.impl.products;

import com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor;
import com.sdkit.paylib.paylibdomain.api.products.entity.PaylibProductsException;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.products.ProductsResponse;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.products.a */
/* loaded from: classes5.dex */
public final class C8065a implements ProductsInteractor {

    /* renamed from: a */
    public final ProductsNetworkClient f1406a;

    /* renamed from: b */
    public final PaylibLogger f1407b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.products.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f1408a;

        /* renamed from: b */
        public /* synthetic */ Object f1409b;

        /* renamed from: d */
        public int f1411d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1409b = obj;
            this.f1411d |= Integer.MIN_VALUE;
            Object objMo15371getProductsgIAlus = C8065a.this.mo15371getProductsgIAlus(null, this);
            return objMo15371getProductsgIAlus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15371getProductsgIAlus : Result.m15698boximpl(objMo15371getProductsgIAlus);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.products.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f1412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f1412a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getProducts ids=" + CollectionsKt___CollectionsKt.joinToString$default(this.f1412a, null, null, null, 0, null, null, 63, null);
        }
    }

    public C8065a(ProductsNetworkClient productsNetworkClient, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(productsNetworkClient, "productsNetworkClient");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1406a = productsNetworkClient;
        this.f1407b = loggerFactory.get("ProductsInteractorImpl");
    }

    /* renamed from: a */
    public final PaylibProductsException m1621a(ProductsResponse productsResponse) {
        return new PaylibProductsException(productsResponse.getMeta(), productsResponse.getCode(), productsResponse.getErrorMessage(), productsResponse.getRu.rustore.sdk.activitylauncher.ActivityLauncherAnalytics.ERROR_DESCRIPTION java.lang.String(), productsResponse.getErrors());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor
    /* renamed from: getProducts-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15371getProductsgIAlus(List list, Continuation continuation) throws Throwable {
        a aVar;
        Object objM15699constructorimpl;
        C8065a c8065a;
        ProductsResponse productsResponse;
        List<Product> products;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1411d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1411d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object products2 = aVar.f1409b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1411d;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(products2);
                PaylibLogger.DefaultImpls.d$default(this.f1407b, null, new b(list), 1, null);
                Result.Companion companion = Result.INSTANCE;
                ProductsNetworkClient productsNetworkClient = this.f1406a;
                aVar.f1408a = this;
                aVar.f1411d = 1;
                products2 = productsNetworkClient.getProducts(list, aVar);
                if (products2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8065a = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8065a = (C8065a) aVar.f1408a;
                ResultKt.throwOnFailure(products2);
            }
            productsResponse = (ProductsResponse) products2;
            products = productsResponse.getProducts();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (productsResponse.getCode() != 0 || products == null) {
            throw c8065a.m1621a(productsResponse);
        }
        objM15699constructorimpl = Result.m15699constructorimpl(products);
        return AbstractC8609a.m4713a(objM15699constructorimpl);
    }
}
