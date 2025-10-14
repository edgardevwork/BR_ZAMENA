package com.sdkit.paylib.paylibpayment.api.network.products;

import com.sdkit.paylib.paylibpayment.api.network.response.products.ProductsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/products/ProductsNetworkClient;", "", "getProducts", "Lcom/sdkit/paylib/paylibpayment/api/network/response/products/ProductsResponse;", "productIds", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ProductsNetworkClient {
    Object getProducts(List<String> list, Continuation<? super ProductsResponse> continuation);
}
