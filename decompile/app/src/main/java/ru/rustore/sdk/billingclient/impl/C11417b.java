package ru.rustore.sdk.billingclient.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.sdkit.paylib.paylibsdk.client.PaylibSdk;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.impl.analytics.C11405a;
import ru.rustore.sdk.billingclient.impl.analytics.C11412h;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory;
import ru.rustore.sdk.billingclient.usecase.ProductsUseCase;
import ru.rustore.sdk.billingclient.usecase.PurchasesUseCase;
import ru.rustore.sdk.billingclient.usecase.UserInfoUseCase;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.b */
/* loaded from: classes7.dex */
public final class C11417b implements RuStoreBillingClient {

    /* renamed from: a */
    public final ProductsUseCase f10183a;

    /* renamed from: b */
    public final PurchasesUseCase f10184b;

    /* renamed from: c */
    public final UserInfoUseCase f10185c;

    public C11417b(Context context, String consoleApplicationId, String scheme, BillingClientThemeProvider billingClientThemeProvider, ExternalPaymentLoggerFactory externalPaymentLoggerFactory, boolean z, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(scheme, "deeplinkScheme");
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11497a c11497aM7463a = C11497a.C11965b.m7463a();
        if (!StringsKt__StringsJVMKt.isBlank(consoleApplicationId)) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            String deeplink = scheme + "://ru.rustore.sdk.billingclient.back";
            c11497aM7463a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            c11497aM7463a.f10371i = new WeakReference<>(context);
            c11497aM7463a.f10359c = consoleApplicationId;
            Intrinsics.checkNotNullParameter(deeplink, "<set-?>");
            c11497aM7463a.f10355a = deeplink;
            c11497aM7463a.f10361d = billingClientThemeProvider;
            c11497aM7463a.f10363e = externalPaymentLoggerFactory;
            c11497aM7463a.f10365f = z;
            c11497aM7463a.f10357b = map;
        }
        C11405a c11405a = (C11405a) c11497aM7463a.f10397w.getValue();
        c11405a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) c11405a.f10166g.getValue());
        linkedHashMap.put("without_rustore", String.valueOf(c11405a.m7440a()));
        SingleSubscribeKt.subscribe$default(c11405a.f10160a.m7454a(new C11413i("sdkInfo", linkedHashMap), true), null, C11412h.f10176a, 1, null);
        this.f10183a = new ProductsUseCase((C11404a) C11497a.C11965b.m7463a().f10380m0.getValue());
        this.f10184b = new PurchasesUseCase(((PaylibSdk) C11497a.C11965b.m7463a().f10394t0.getValue()).purchasesInteractor(), ((PaylibSdk) C11497a.C11965b.m7463a().f10394t0.getValue()).paylibNativeRouter());
        this.f10185c = new UserInfoUseCase((C11418c) C11497a.C11965b.m7463a().f10392s0.getValue());
    }

    @Override // ru.rustore.sdk.billingclient.RuStoreBillingClient
    public final ProductsUseCase getProducts() {
        return this.f10183a;
    }

    @Override // ru.rustore.sdk.billingclient.RuStoreBillingClient
    public final PurchasesUseCase getPurchases() {
        return this.f10184b;
    }

    @Override // ru.rustore.sdk.billingclient.RuStoreBillingClient
    public final UserInfoUseCase getUserInfo() {
        return this.f10185c;
    }

    @Override // ru.rustore.sdk.billingclient.RuStoreBillingClient
    public final void onNewIntent(Intent intent) {
        Uri data;
        Lazy<C11497a> lazy = C11497a.f10328u0;
        PaylibSdk paylibSdk = (PaylibSdk) C11497a.C11965b.m7463a().f10394t0.getValue();
        String deeplink = C11497a.C11965b.m7463a().f10355a;
        if (deeplink == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deeplink");
            deeplink = null;
        }
        Intrinsics.checkNotNullParameter(paylibSdk, "paylibSdk");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) deeplink, false, 2, (Object) null)) {
            paylibSdk.paylibNativeDeeplinkRouter().finishPaylib(string);
        }
    }
}
