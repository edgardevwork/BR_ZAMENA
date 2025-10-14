package com.blackhub.bronline.game.core.utils.payment;

import com.android.billingclient.api.ProductDetails;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnQueryProductsListener.kt */
/* loaded from: classes3.dex */
public interface OnQueryProductsListener {
    void onFailure(@NotNull BillingError billingError);

    void onSuccess(@NotNull List<ProductDetails> products);
}

