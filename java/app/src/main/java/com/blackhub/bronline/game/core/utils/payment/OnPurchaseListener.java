package com.blackhub.bronline.game.core.utils.payment;

import com.android.billingclient.api.Purchase;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnPurchaseListener.kt */
/* loaded from: classes3.dex */
public interface OnPurchaseListener {
    void onPurchaseFailure(@NotNull BillingError billingError);

    void onPurchaseSuccess(@Nullable Purchase purchase);
}

