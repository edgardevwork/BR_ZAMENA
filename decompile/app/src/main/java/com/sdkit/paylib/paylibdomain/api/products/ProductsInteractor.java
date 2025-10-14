package com.sdkit.paylib.paylibdomain.api.products;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/products/ProductsInteractor;", "", "getProducts", "Lkotlin/Result;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/Product;", "productIds", "", "getProducts-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ProductsInteractor {
    /* renamed from: getProducts-gIAlu-s */
    Object mo15371getProductsgIAlus(List<String> list, Continuation<? super Result<? extends List<Product>>> continuation);
}
