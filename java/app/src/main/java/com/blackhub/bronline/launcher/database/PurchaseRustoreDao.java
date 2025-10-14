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

