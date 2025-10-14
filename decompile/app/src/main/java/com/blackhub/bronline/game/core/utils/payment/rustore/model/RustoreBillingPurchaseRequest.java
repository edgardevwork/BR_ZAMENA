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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "", BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "", "productIdFromRustore", "serverId", "summa", "invoiceId", "appmetricaDeviceId", "purchaseId", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()I", "setAccountId", "(I)V", "getAppmetricaDeviceId", "()Ljava/lang/String;", "getInvoiceId", "getNickname", "getProductIdFromRustore", "getPurchaseId", "getServerId", "getSumma", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProductIdFromRustore() {
        return this.productIdFromRustore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getServerId() {
        return this.serverId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSumma() {
        return this.summa;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getAppmetricaDeviceId() {
        return this.appmetricaDeviceId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

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
