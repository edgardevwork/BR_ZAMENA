package com.blackhub.bronline.launcher.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PurchaseDatabase.kt */
@StabilityInferred(parameters = 1)
@Database(entities = {BillingPurchaseRequest.class, RustoreBillingPurchaseRequest.class}, version = 5)
/* loaded from: classes4.dex */
public abstract class PurchaseDatabase extends RoomDatabase {
    public static final int $stable = 0;

    @NotNull
    public abstract PurchaseDao purchaseDao();

    @NotNull
    public abstract PurchaseRustoreDao purchaseRustoreDao();
}

