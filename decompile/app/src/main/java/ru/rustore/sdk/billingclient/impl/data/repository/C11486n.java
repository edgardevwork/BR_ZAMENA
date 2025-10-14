package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11434l;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.n */
/* loaded from: classes5.dex */
public final class C11486n {

    /* renamed from: a */
    public final C11434l f10298a;

    public C11486n(C11434l dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f10298a = dataSource;
    }

    /* renamed from: a */
    public final int m7456a() {
        C11434l c11434l = this.f10298a;
        c11434l.getClass();
        return RuStoreUtils.INSTANCE.isRuStoreInstalled(c11434l.f10226a) ? 1 : 2;
    }
}
