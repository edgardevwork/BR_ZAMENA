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

