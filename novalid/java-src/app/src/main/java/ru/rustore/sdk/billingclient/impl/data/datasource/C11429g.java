package ru.rustore.sdk.billingclient.impl.data.datasource;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.deserializer.C11445a;
import ru.rustore.sdk.billingclient.impl.data.network.C11456b;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.g */
/* loaded from: classes5.dex */
public final class C11429g {

    /* renamed from: a */
    public final C11456b f10215a;

    /* renamed from: b */
    public final C11445a f10216b;

    public C11429g(C11456b httpClient, C11445a deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f10215a = httpClient;
        this.f10216b = deserializer;
    }
}
