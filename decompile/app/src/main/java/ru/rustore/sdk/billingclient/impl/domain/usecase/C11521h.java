package ru.rustore.sdk.billingclient.impl.domain.usecase;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11430h;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11431i;
import ru.rustore.sdk.billingclient.impl.data.repository.C11492t;
import ru.rustore.sdk.billingclient.impl.data.repository.C11493u;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;
import ru.rustore.sdk.billingclient.impl.utils.C11552d;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.h */
/* loaded from: classes5.dex */
public final class C11521h extends Lambda implements Function1<String, Single<UnauthorizedProductType>> {

    /* renamed from: a */
    public final /* synthetic */ C11523j f10518a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11521h(C11523j c11523j) {
        super(1);
        this.f10518a = c11523j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<UnauthorizedProductType> invoke(String str) {
        String productId = str;
        Intrinsics.checkNotNullParameter(productId, "productId");
        C11493u c11493u = this.f10518a.f10521b;
        c11493u.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        C11431i c11431i = c11493u.f10323a;
        List productIds = CollectionsKt__CollectionsJVMKt.listOf(productId);
        c11431i.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        C11430h invoke = new C11430h(c11431i, productIds, null);
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        return SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.create(new C11552d(invoke)), c11431i.f10221b.getIo()), new C11492t(c11493u));
    }
}
