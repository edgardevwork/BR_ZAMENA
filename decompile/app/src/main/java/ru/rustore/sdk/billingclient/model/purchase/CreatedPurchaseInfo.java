package ru.rustore.sdk.billingclient.model.purchase;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/CreatedPurchaseInfo;", "", "purchaseId", "", "invoiceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getInvoiceId", "()Ljava/lang/String;", "getPurchaseId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CreatedPurchaseInfo {
    private final String invoiceId;
    private final String purchaseId;

    public CreatedPurchaseInfo(String purchaseId, String str) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.purchaseId = purchaseId;
        this.invoiceId = str;
    }

    public static /* synthetic */ CreatedPurchaseInfo copy$default(CreatedPurchaseInfo createdPurchaseInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createdPurchaseInfo.purchaseId;
        }
        if ((i & 2) != 0) {
            str2 = createdPurchaseInfo.invoiceId;
        }
        return createdPurchaseInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final CreatedPurchaseInfo copy(String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return new CreatedPurchaseInfo(purchaseId, invoiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatedPurchaseInfo)) {
            return false;
        }
        CreatedPurchaseInfo createdPurchaseInfo = (CreatedPurchaseInfo) other;
        return Intrinsics.areEqual(this.purchaseId, createdPurchaseInfo.purchaseId) && Intrinsics.areEqual(this.invoiceId, createdPurchaseInfo.invoiceId);
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public int hashCode() {
        int iHashCode = this.purchaseId.hashCode() * 31;
        String str = this.invoiceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreatedPurchaseInfo(purchaseId=");
        sb.append(this.purchaseId);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.invoiceId, ')');
    }
}
