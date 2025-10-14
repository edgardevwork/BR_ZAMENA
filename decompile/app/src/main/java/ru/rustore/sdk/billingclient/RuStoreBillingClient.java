package ru.rustore.sdk.billingclient;

import android.content.Intent;
import kotlin.Metadata;
import ru.rustore.sdk.billingclient.usecase.ProductsUseCase;
import ru.rustore.sdk.billingclient.usecase.PurchasesUseCase;
import ru.rustore.sdk.billingclient.usecase.UserInfoUseCase;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m7105d2 = {"Lru/rustore/sdk/billingclient/RuStoreBillingClient;", "", "products", "Lru/rustore/sdk/billingclient/usecase/ProductsUseCase;", "getProducts", "()Lru/rustore/sdk/billingclient/usecase/ProductsUseCase;", "purchases", "Lru/rustore/sdk/billingclient/usecase/PurchasesUseCase;", "getPurchases", "()Lru/rustore/sdk/billingclient/usecase/PurchasesUseCase;", "userInfo", "Lru/rustore/sdk/billingclient/usecase/UserInfoUseCase;", "getUserInfo", "()Lru/rustore/sdk/billingclient/usecase/UserInfoUseCase;", "onNewIntent", "", "intent", "Landroid/content/Intent;", "Companion", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface RuStoreBillingClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/billingclient/RuStoreBillingClient$Companion;", "", "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    ProductsUseCase getProducts();

    PurchasesUseCase getPurchases();

    UserInfoUseCase getUserInfo();

    void onNewIntent(Intent intent);
}
