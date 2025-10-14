package com.blackhub.bronline.game.core.utils.payment.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BillingPurchaseRequest.kt */
@StabilityInferred(parameters = 0)
@Entity(tableName = "BillingPurchases")
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006-"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "", "systemPaymentId", "", "account", "paymentMethod", "server", "", "summa", FirebaseAnalytics.Param.CURRENCY, "bc", "source", "productId", BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getAccount", "()Ljava/lang/String;", "getAccountId", "()I", "setAccountId", "(I)V", "getBc", "getCurrency", "getPaymentMethod", "getProductId", "getServer", "getSource", "getSumma", "getSystemPaymentId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingPurchaseRequest {
    public static final int $stable = 8;

    @SerializedName("account")
    @NotNull
    public final String account;

    @SerializedName("player_id")
    public int accountId;

    @SerializedName("bc")
    public final int bc;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @NotNull
    public final String currency;

    @SerializedName("payment_method")
    @NotNull
    public final String paymentMethod;

    @SerializedName("product_id")
    @NotNull
    public final String productId;

    @SerializedName("server")
    public final int server;

    @SerializedName("source")
    @NotNull
    public final String source;

    @SerializedName("summa")
    @NotNull
    public final String summa;

    @SerializedName("system_payment_id")
    @PrimaryKey
    @NotNull
    public final String systemPaymentId;

    public BillingPurchaseRequest() {
        this(null, null, null, 0, null, null, 0, null, null, 0, 1023, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSystemPaymentId() {
        return this.systemPaymentId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final int getServer() {
        return this.server;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSumma() {
        return this.summa;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBc() {
        return this.bc;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final BillingPurchaseRequest copy(@NotNull String systemPaymentId, @NotNull String account, @NotNull String paymentMethod, int server, @NotNull String summa, @NotNull String currency, int bc, @NotNull String source, @NotNull String productId, int accountId) {
        Intrinsics.checkNotNullParameter(systemPaymentId, "systemPaymentId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(summa, "summa");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new BillingPurchaseRequest(systemPaymentId, account, paymentMethod, server, summa, currency, bc, source, productId, accountId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingPurchaseRequest)) {
            return false;
        }
        BillingPurchaseRequest billingPurchaseRequest = (BillingPurchaseRequest) other;
        return Intrinsics.areEqual(this.systemPaymentId, billingPurchaseRequest.systemPaymentId) && Intrinsics.areEqual(this.account, billingPurchaseRequest.account) && Intrinsics.areEqual(this.paymentMethod, billingPurchaseRequest.paymentMethod) && this.server == billingPurchaseRequest.server && Intrinsics.areEqual(this.summa, billingPurchaseRequest.summa) && Intrinsics.areEqual(this.currency, billingPurchaseRequest.currency) && this.bc == billingPurchaseRequest.bc && Intrinsics.areEqual(this.source, billingPurchaseRequest.source) && Intrinsics.areEqual(this.productId, billingPurchaseRequest.productId) && this.accountId == billingPurchaseRequest.accountId;
    }

    public int hashCode() {
        return (((((((((((((((((this.systemPaymentId.hashCode() * 31) + this.account.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + Integer.hashCode(this.server)) * 31) + this.summa.hashCode()) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.bc)) * 31) + this.source.hashCode()) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.accountId);
    }

    @NotNull
    public String toString() {
        return "BillingPurchaseRequest(systemPaymentId=" + this.systemPaymentId + ", account=" + this.account + ", paymentMethod=" + this.paymentMethod + ", server=" + this.server + ", summa=" + this.summa + ", currency=" + this.currency + ", bc=" + this.bc + ", source=" + this.source + ", productId=" + this.productId + ", accountId=" + this.accountId + ")";
    }

    public BillingPurchaseRequest(@NotNull String systemPaymentId, @NotNull String account, @NotNull String paymentMethod, int i, @NotNull String summa, @NotNull String currency, int i2, @NotNull String source, @NotNull String productId, int i3) {
        Intrinsics.checkNotNullParameter(systemPaymentId, "systemPaymentId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(summa, "summa");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.systemPaymentId = systemPaymentId;
        this.account = account;
        this.paymentMethod = paymentMethod;
        this.server = i;
        this.summa = summa;
        this.currency = currency;
        this.bc = i2;
        this.source = source;
        this.productId = productId;
        this.accountId = i3;
    }

    public /* synthetic */ BillingPurchaseRequest(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, String str7, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 4) != 0 ? BillingPurchaseRequestKt.PAYMENT_METHOD : str3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i4 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? BillingPurchaseRequestKt.SOURCE : str6, (i4 & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i4 & 512) == 0 ? i3 : 0);
    }

    @NotNull
    public final String getSystemPaymentId() {
        return this.systemPaymentId;
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final int getServer() {
        return this.server;
    }

    @NotNull
    public final String getSumma() {
        return this.summa;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int getBc() {
        return this.bc;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final void setAccountId(int i) {
        this.accountId = i;
    }
}
