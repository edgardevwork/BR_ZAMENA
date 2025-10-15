package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m7105d2 = {"Lcom/android/billingclient/api/PurchaseHistoryResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchaseHistoryRecordList", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getPurchaseHistoryRecordList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseHistoryResult {

    /* renamed from: zza, reason: from toString */
    @NotNull
    public final BillingResult billingResult;

    /* renamed from: zzb, reason: from toString */
    @Nullable
    public final List purchaseHistoryRecordList;

    public PurchaseHistoryResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.billingResult = billingResult;
        this.purchaseHistoryRecordList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchaseHistoryResult copy$default(@RecentlyNonNull PurchaseHistoryResult purchaseHistoryResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = purchaseHistoryResult.billingResult;
        }
        if ((i & 2) != 0) {
            list = purchaseHistoryResult.purchaseHistoryRecordList;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> component2() {
        return this.purchaseHistoryRecordList;
    }

    @NotNull
    public final PurchaseHistoryResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> purchaseHistoryRecordList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, purchaseHistoryRecordList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) other;
        return Intrinsics.areEqual(this.billingResult, purchaseHistoryResult.billingResult) && Intrinsics.areEqual(this.purchaseHistoryRecordList, purchaseHistoryResult.purchaseHistoryRecordList);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.purchaseHistoryRecordList;
    }

    public int hashCode() {
        int iHashCode = this.billingResult.hashCode() * 31;
        List list = this.purchaseHistoryRecordList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.billingResult + ", purchaseHistoryRecordList=" + this.purchaseHistoryRecordList + ")";
    }
}
