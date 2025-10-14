package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.BuildConfig;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11436n;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11437o;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11438p;
import ru.rustore.sdk.billingclient.impl.domain.model.C11508e;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.q */
/* loaded from: classes5.dex */
public final class C11489q {

    /* renamed from: a */
    public final C11436n f10312a;

    /* renamed from: b */
    public final C11437o f10313b;

    /* renamed from: c */
    public final C11438p f10314c;

    public C11489q(C11436n sdkNameDataSource, C11437o sdkTypeDataSource, C11438p sdkVersionDataSource) {
        Intrinsics.checkNotNullParameter(sdkNameDataSource, "sdkNameDataSource");
        Intrinsics.checkNotNullParameter(sdkTypeDataSource, "sdkTypeDataSource");
        Intrinsics.checkNotNullParameter(sdkVersionDataSource, "sdkVersionDataSource");
        this.f10312a = sdkNameDataSource;
        this.f10313b = sdkTypeDataSource;
        this.f10314c = sdkVersionDataSource;
    }

    /* renamed from: a */
    public final C11508e m7459a() {
        this.f10312a.getClass();
        C11437o c11437o = this.f10313b;
        c11437o.getClass();
        String value = RuStoreInternalConfig.INSTANCE.create(c11437o.f10229a).getSdkType().getValue();
        this.f10314c.getClass();
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("8.0.0", "value");
        return new C11508e(value);
    }
}
