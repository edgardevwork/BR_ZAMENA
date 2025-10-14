package ru.rustore.sdk.billingclient.usecase;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.impl.C11404a;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11430h;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11431i;
import ru.rustore.sdk.billingclient.impl.data.repository.C11484l;
import ru.rustore.sdk.billingclient.impl.data.repository.C11485m;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11518e;
import ru.rustore.sdk.billingclient.impl.utils.C11552d;
import ru.rustore.sdk.billingclient.impl.utils.C11556h;
import ru.rustore.sdk.billingclient.model.product.Product;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/billingclient/usecase/ProductsUseCase;", "", "Lru/rustore/sdk/billingclient/impl/a;", "controller", SegmentConstantPool.INITSTRING, "(Lru/rustore/sdk/billingclient/impl/a;)V", "", "", "productIds", "Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/model/product/Product;", "getProducts", "(Ljava/util/List;)Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/impl/a;", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class ProductsUseCase {
    public final C11404a controller;

    public ProductsUseCase(C11404a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public final Task<List<Product>> getProducts(List<String> productIds) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11404a c11404a = this.controller;
        c11404a.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11518e c11518e = c11404a.f10159a;
        c11518e.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11485m c11485m = c11518e.f10513a;
        c11485m.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11431i c11431i = c11485m.f10296a;
        c11431i.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11430h invoke = new C11430h(c11431i, productIds, null);
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        return C11556h.m7481a(SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.create(new C11552d(invoke)), c11431i.f10221b.getIo()), new C11484l(c11485m.f10297b)));
    }
}
