package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11431i;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11452g;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.u */
/* loaded from: classes5.dex */
public final class C11493u {

    /* renamed from: a */
    public final C11431i f10323a;

    /* renamed from: b */
    public final C11452g f10324b;

    public C11493u(C11431i dataSource, C11452g mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f10323a = dataSource;
        this.f10324b = mapper;
    }
}
