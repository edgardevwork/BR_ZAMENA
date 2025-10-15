package com.blackhub.bronline.game.core.utils.payment;

import com.android.billingclient.api.ProductDetails;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnQueryProductsListener.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/OnQueryProductsListener;", "", "onFailure", "", "billingError", "Lcom/blackhub/bronline/game/core/utils/payment/BillingError;", "onSuccess", "products", "", "Lcom/android/billingclient/api/ProductDetails;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface OnQueryProductsListener {
    void onFailure(@NotNull BillingError billingError);

    void onSuccess(@NotNull List<ProductDetails> products);
}
