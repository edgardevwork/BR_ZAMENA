package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11489q;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.a */
/* loaded from: classes5.dex */
public final class C11534a {

    /* renamed from: a */
    public final C11486n f10550a;

    /* renamed from: b */
    public final C11489q f10551b;

    /* renamed from: c */
    public final C11474b f10552c;

    /* renamed from: d */
    public final Context f10553d;

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10554a;

        static {
            int[] iArr = new int[UnauthorizedProductType.values().length];
            try {
                iArr[UnauthorizedProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnauthorizedProductType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnauthorizedProductType.NON_CONSUMABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10554a = iArr;
        }
    }

    public C11534a(C11486n ruStoreInstallStatusRepository, C11489q sdkInfoRepository, C11474b billingAnalyticsRepository, Context context) {
        Intrinsics.checkNotNullParameter(ruStoreInstallStatusRepository, "ruStoreInstallStatusRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(billingAnalyticsRepository, "billingAnalyticsRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10550a = ruStoreInstallStatusRepository;
        this.f10551b = sdkInfoRepository;
        this.f10552c = billingAnalyticsRepository;
        this.f10553d = context;
    }
}
