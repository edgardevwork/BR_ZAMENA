package com.blackhub.bronline.game.core.utils.payment.rustore;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.billingclient.presentation.BillingClientTheme;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;

/* compiled from: BillingClientThemeProviderImpl.kt */
@StabilityInferred(parameters = 1)

public final class BillingClientThemeProviderImpl implements BillingClientThemeProvider {
    public static final int $stable = 0;

    @Override // ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider
    @NotNull
    public BillingClientTheme provide() {
        return BillingClientTheme.Dark;
    }
}

