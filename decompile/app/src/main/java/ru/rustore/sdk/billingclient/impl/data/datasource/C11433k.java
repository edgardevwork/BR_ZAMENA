package ru.rustore.sdk.billingclient.impl.data.datasource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.provider.C11472p;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.k */
/* loaded from: classes5.dex */
public final class C11433k {

    /* renamed from: a */
    public final Context f10224a;

    /* renamed from: b */
    public final C11472p f10225b;

    public C11433k(Context context, C11472p ruStoreAppPayTokenProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruStoreAppPayTokenProvider, "ruStoreAppPayTokenProvider");
        this.f10224a = context;
        this.f10225b = ruStoreAppPayTokenProvider;
    }
}
