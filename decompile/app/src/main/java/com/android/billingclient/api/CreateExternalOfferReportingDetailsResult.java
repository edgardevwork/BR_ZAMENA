package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "externalOfferReportingDetails", "Lcom/android/billingclient/api/ExternalOfferReportingDetails;", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/ExternalOfferReportingDetails;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getExternalOfferReportingDetails", "()Lcom/android/billingclient/api/ExternalOfferReportingDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateExternalOfferReportingDetailsResult {

    /* renamed from: zza, reason: from toString */
    @NotNull
    public final BillingResult billingResult;

    /* renamed from: zzb, reason: from toString */
    @Nullable
    public final ExternalOfferReportingDetails externalOfferReportingDetails;

    public CreateExternalOfferReportingDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.billingResult = billingResult;
        this.externalOfferReportingDetails = externalOfferReportingDetails;
    }

    @RecentlyNonNull
    public static /* synthetic */ CreateExternalOfferReportingDetailsResult copy$default(@RecentlyNonNull CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = createExternalOfferReportingDetailsResult.billingResult;
        }
        if ((i & 2) != 0) {
            externalOfferReportingDetails = createExternalOfferReportingDetailsResult.externalOfferReportingDetails;
        }
        return createExternalOfferReportingDetailsResult.copy(billingResult, externalOfferReportingDetails);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @RecentlyNullable
    /* renamed from: component2, reason: from getter */
    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.externalOfferReportingDetails;
    }

    @NotNull
    public final CreateExternalOfferReportingDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateExternalOfferReportingDetailsResult)) {
            return false;
        }
        CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult = (CreateExternalOfferReportingDetailsResult) other;
        return Intrinsics.areEqual(this.billingResult, createExternalOfferReportingDetailsResult.billingResult) && Intrinsics.areEqual(this.externalOfferReportingDetails, createExternalOfferReportingDetailsResult.externalOfferReportingDetails);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @RecentlyNullable
    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.externalOfferReportingDetails;
    }

    public int hashCode() {
        int iHashCode = this.billingResult.hashCode() * 31;
        ExternalOfferReportingDetails externalOfferReportingDetails = this.externalOfferReportingDetails;
        return iHashCode + (externalOfferReportingDetails == null ? 0 : externalOfferReportingDetails.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.billingResult + ", externalOfferReportingDetails=" + this.externalOfferReportingDetails + ")";
    }
}
