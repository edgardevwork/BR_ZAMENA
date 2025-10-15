package com.blackhub.bronline.launcher.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseDao.kt */
@Dao
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/database/PurchaseDao;", "", "getAllPurchases", "", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "getPurchaseByToken", "systemPaymentId", "", "insertAll", "", "purchasesList", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface PurchaseDao {
    @Query("SELECT * FROM BillingPurchases")
    @NotNull
    List<BillingPurchaseRequest> getAllPurchases();

    @Query("SELECT * FROM BillingPurchases WHERE systemPaymentId LIKE :systemPaymentId")
    @Nullable
    BillingPurchaseRequest getPurchaseByToken(@NotNull String systemPaymentId);

    @Insert(onConflict = 5)
    void insertAll(@NotNull List<BillingPurchaseRequest> purchasesList);
}
