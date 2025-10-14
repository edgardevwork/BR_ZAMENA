package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11431i;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11449d;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.m */
/* loaded from: classes5.dex */
public final class C11485m {

    /* renamed from: a */
    public final C11431i f10296a;

    /* renamed from: b */
    public final C11449d f10297b;

    public C11485m(C11431i productsDataSource, C11449d mapper) {
        Intrinsics.checkNotNullParameter(productsDataSource, "productsDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f10296a = productsDataSource;
        this.f10297b = mapper;
    }
}
