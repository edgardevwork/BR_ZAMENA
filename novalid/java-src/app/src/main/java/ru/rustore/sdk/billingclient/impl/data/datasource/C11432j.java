package ru.rustore.sdk.billingclient.impl.data.datasource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.provider.C11467k;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.j */
/* loaded from: classes5.dex */
public final class C11432j {

    /* renamed from: a */
    public final Context f10222a;

    /* renamed from: b */
    public final C11467k f10223b;

    public C11432j(Context context, C11467k ruStoreAppPayInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruStoreAppPayInfoProvider, "ruStoreAppPayInfoProvider");
        this.f10222a = context;
        this.f10223b = ruStoreAppPayInfoProvider;
    }
}
