package ru.rustore.sdk.billingclient;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.C11417b;
import ru.rustore.sdk.billingclient.model.common.ConsoleApplicationId;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011H\u0007¨\u0006\u0012"}, m7105d2 = {"Lru/rustore/sdk/billingclient/RuStoreBillingClientFactory;", "", "()V", "create", "Lru/rustore/sdk/billingclient/RuStoreBillingClient;", "context", "Landroid/content/Context;", "consoleApplicationId", "", "deeplinkScheme", "themeProvider", "Lru/rustore/sdk/billingclient/provider/BillingClientThemeProvider;", "externalPaymentLoggerFactory", "Lru/rustore/sdk/billingclient/provider/logger/ExternalPaymentLoggerFactory;", "debugLogs", "", "internalConfig", "", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class RuStoreBillingClientFactory {
    public static final RuStoreBillingClientFactory INSTANCE = new RuStoreBillingClientFactory();

    public static /* synthetic */ RuStoreBillingClient create$default(RuStoreBillingClientFactory ruStoreBillingClientFactory, Context context, String str, String str2, BillingClientThemeProvider billingClientThemeProvider, ExternalPaymentLoggerFactory externalPaymentLoggerFactory, boolean z, Map map, int i, Object obj) {
        return ruStoreBillingClientFactory.create(context, str, str2, (i & 8) != 0 ? null : billingClientThemeProvider, (i & 16) != 0 ? null : externalPaymentLoggerFactory, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : map);
    }

    public final RuStoreBillingClient create(Context context, String consoleApplicationId, String deeplinkScheme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        return create$default(this, context, consoleApplicationId, deeplinkScheme, null, null, false, null, 120, null);
    }

    public final RuStoreBillingClient create(Context context, String consoleApplicationId, String deeplinkScheme, BillingClientThemeProvider billingClientThemeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        return create$default(this, context, consoleApplicationId, deeplinkScheme, billingClientThemeProvider, null, false, null, 112, null);
    }

    public final RuStoreBillingClient create(Context context, String consoleApplicationId, String deeplinkScheme, BillingClientThemeProvider billingClientThemeProvider, ExternalPaymentLoggerFactory externalPaymentLoggerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        return create$default(this, context, consoleApplicationId, deeplinkScheme, billingClientThemeProvider, externalPaymentLoggerFactory, false, null, 96, null);
    }

    public final RuStoreBillingClient create(Context context, String consoleApplicationId, String deeplinkScheme, BillingClientThemeProvider billingClientThemeProvider, ExternalPaymentLoggerFactory externalPaymentLoggerFactory, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        return create$default(this, context, consoleApplicationId, deeplinkScheme, billingClientThemeProvider, externalPaymentLoggerFactory, z, null, 64, null);
    }

    public final RuStoreBillingClient create(Context context, String consoleApplicationId, String deeplinkScheme, BillingClientThemeProvider themeProvider, ExternalPaymentLoggerFactory externalPaymentLoggerFactory, boolean debugLogs, Map<String, ? extends Object> internalConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        return new C11417b(context, ConsoleApplicationId.m17590constructorimpl(consoleApplicationId), deeplinkScheme, themeProvider, externalPaymentLoggerFactory, debugLogs, internalConfig);
    }
}
