package ru.rustore.sdk.billingclient.impl.data.repository;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11452g;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.t */
/* loaded from: classes8.dex */
public final class C11492t extends Lambda implements Function1<List<? extends Product>, UnauthorizedProductType> {

    /* renamed from: a */
    public final /* synthetic */ C11493u f10322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11492t(C11493u c11493u) {
        super(1);
        this.f10322a = c11493u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final UnauthorizedProductType invoke(List<? extends Product> list) {
        List<? extends Product> products = list;
        Intrinsics.checkNotNullParameter(products, "products");
        C11452g c11452g = this.f10322a.f10324b;
        Product product = (Product) CollectionsKt___CollectionsKt.first((List) products);
        c11452g.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        ProductType productType = product.getProductType();
        int i = productType == null ? -1 : C11452g.a.f10236a[productType.ordinal()];
        if (i == -1) {
            return UnauthorizedProductType.UNKNOWN;
        }
        if (i == 1) {
            return UnauthorizedProductType.NON_CONSUMABLE;
        }
        if (i == 2) {
            return UnauthorizedProductType.CONSUMABLE;
        }
        if (i == 3) {
            return UnauthorizedProductType.SUBSCRIPTION;
        }
        if (i == 4) {
            return UnauthorizedProductType.APPLICATION;
        }
        throw new NoWhenBranchMatchedException();
    }
}
