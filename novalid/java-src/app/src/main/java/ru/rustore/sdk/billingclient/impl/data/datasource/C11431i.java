package ru.rustore.sdk.billingclient.impl.data.datasource;

import com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatchers;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.i */
/* loaded from: classes5.dex */
public final class C11431i {

    /* renamed from: a */
    public final ProductsInteractor f10220a;

    /* renamed from: b */
    public final Dispatchers f10221b;

    public C11431i(ProductsInteractor sberProductsApi, Dispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(sberProductsApi, "sberProductsApi");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f10220a = sberProductsApi;
        this.f10221b = dispatchers;
    }
}
