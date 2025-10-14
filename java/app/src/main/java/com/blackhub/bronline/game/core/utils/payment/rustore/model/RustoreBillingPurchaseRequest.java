package com.blackhub.bronline.game.core.utils.payment.rustore.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RustoreBillingPurchaseRequest.kt */
@StabilityInferred(parameters = 0)
@Entity(tableName = "BillingRustorePurchases")
/* loaded from: classes3.dex */
public final /* data */ class RustoreBillingPurchaseRequest {
    public static final int $stable = 8;

    @SerializedName("playerId")
    public int accountId;

    @SerializedName("appmetricaDeviceId")
    @Nullable
    public final String appmetricaDeviceId;

    @SerializedName("invoiceId")
    @NotNull
    public final String invoiceId;

    @SerializedName("account")
    @NotNull
    public final String nickname;

    @SerializedName("productId")
    @NotNull
    public final String productIdFromRustore;

    @SerializedName("purchaseId")
    @PrimaryKey
    @NotNull
    public final String purchaseId;

    @SerializedName("serverId")
    public final int serverId;

    @SerializedName("summa")
    public final int summa;

    @NotNull
    public final RustoreBillingPurchaseRequest copy(@NotNull String nickname, int accountId, @NotNull String productIdFromRustore, int serverId, int summa, @NotNull String invoiceId, @Nullable String appmetricaDeviceId, @NotNull String purchaseId) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(productIdFromRustore, "productIdFromRustore");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return new RustoreBillingPurchaseRequest(nickname, accountId, productIdFromRustore, serverId, summa, invoiceId, appmetricaDeviceId, purchaseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RustoreBillingPurchaseRequest)) {
            return false;
        }
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = (RustoreBillingPurchaseRequest) other;
        return Intrinsics.areEqual(this.nickname, rustoreBillingPurchaseRequest.nickname) && this.accountId == rustoreBillingPurchaseRequest.accountId && Intrinsics.areEqual(this.productIdFromRustore, rustoreBillingPurchaseRequest.productIdFromRustore) && this.serverId == rustoreBillingPurchaseRequest.serverId && this.summa == rustoreBillingPurchaseRequest.summa && Intrinsics.areEqual(this.invoiceId, rustoreBillingPurchaseRequest.invoiceId) && Intrinsics.areEqual(this.appmetricaDeviceId, rustoreBillingPurchaseRequest.appmetricaDeviceId) && Intrinsics.areEqual(this.purchaseId, rustoreBillingPurchaseRequest.purchaseId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.nickname.hashCode() * 31) + Integer.hashCode(this.accountId)) * 31) + this.productIdFromRustore.hashCode()) * 31) + Integer.hashCode(this.serverId)) * 31) + Integer.hashCode(this.summa)) * 31) + this.invoiceId.hashCode()) * 31;
        String str = this.appmetricaDeviceId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.purchaseId.hashCode();
    }

    @NotNull
    public String toString() {
        return "RustoreBillingPurchaseRequest(nickname=" + this.nickname + ", accountId=" + this.accountId + ", productIdFromRustore=" + this.productIdFromRustore + ", serverId=" + this.serverId + ", summa=" + this.summa + ", invoiceId=" + this.invoiceId + ", appmetricaDeviceId=" + this.appmetricaDeviceId + ", purchaseId=" + this.purchaseId + ")";
    }

    public RustoreBillingPurchaseRequest(@NotNull String nickname, int i, @NotNull String productIdFromRustore, int i2, int i3, @NotNull String invoiceId, @Nullable String str, @NotNull String purchaseId) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(productIdFromRustore, "productIdFromRustore");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.nickname = nickname;
        this.accountId = i;
        this.productIdFromRustore = productIdFromRustore;
        this.serverId = i2;
        this.summa = i3;
        this.invoiceId = invoiceId;
        this.appmetricaDeviceId = str;
        this.purchaseId = purchaseId;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final void setAccountId(int i) {
        this.accountId = i;
    }

    @NotNull
    public final String getProductIdFromRustore() {
        return this.productIdFromRustore;
    }

    public final int getServerId() {
        return this.serverId;
    }

    public final int getSumma() {
        return this.summa;
    }

    @NotNull
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @Nullable
    public final String getAppmetricaDeviceId() {
        return this.appmetricaDeviceId;
    }

    @NotNull
    public final String getPurchaseId() {
        return this.purchaseId;
    }
}

