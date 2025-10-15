package ru.rustore.sdk.billingclient.impl.data.datasource;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.q */
/* loaded from: classes8.dex */
public final class C11439q extends Lambda implements Function1<StoreVersionInfo, StoreVersionInfo> {

    /* renamed from: a */
    public static final C11439q f10230a = new C11439q();

    public C11439q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final StoreVersionInfo invoke(StoreVersionInfo storeVersionInfo) {
        StoreVersionInfo value = storeVersionInfo;
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
