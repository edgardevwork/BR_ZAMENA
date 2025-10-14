package com.blackhub.bronline.launcher.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseRustoreDao.kt */
@Dao
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/database/PurchaseRustoreDao;", "", "clearTable", "", "deletePurchaseByToken", "purchaseId", "", "getAllPurchases", "", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "getPurchaseByToken", "insertAll", "purchasesList", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface PurchaseRustoreDao {
    @Query("DELETE FROM BillingRustorePurchases")
    void clearTable();

    @Query("DELETE FROM BillingRustorePurchases WHERE purchaseId LIKE :purchaseId")
    void deletePurchaseByToken(@NotNull String purchaseId);

    @Query("SELECT * FROM BillingRustorePurchases")
    @NotNull
    List<RustoreBillingPurchaseRequest> getAllPurchases();

    @Query("SELECT * FROM BillingRustorePurchases WHERE purchaseId LIKE :purchaseId")
    @Nullable
    RustoreBillingPurchaseRequest getPurchaseByToken(@NotNull String purchaseId);

    @Insert(onConflict = 5)
    void insertAll(@NotNull List<RustoreBillingPurchaseRequest> purchasesList);
}
