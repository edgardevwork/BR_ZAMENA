package com.blackhub.bronline.game.model.remote.response.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceLimitsResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class MarketplaceLimitsResponse {
    public static final int $stable = 8;

    @SerializedName("vipMarketLimits")
    @Nullable
    public final List<MarketplaceConfig> marketplaceLimitsList;

    public MarketplaceLimitsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketplaceLimitsResponse copy$default(MarketplaceLimitsResponse marketplaceLimitsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketplaceLimitsResponse.marketplaceLimitsList;
        }
        return marketplaceLimitsResponse.copy(list);
    }

    @Nullable
    public final List<MarketplaceConfig> component1() {
        return this.marketplaceLimitsList;
    }

    @NotNull
    public final MarketplaceLimitsResponse copy(@Nullable List<MarketplaceConfig> marketplaceLimitsList) {
        return new MarketplaceLimitsResponse(marketplaceLimitsList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketplaceLimitsResponse) && Intrinsics.areEqual(this.marketplaceLimitsList, ((MarketplaceLimitsResponse) other).marketplaceLimitsList);
    }

    public int hashCode() {
        List<MarketplaceConfig> list = this.marketplaceLimitsList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketplaceLimitsResponse(marketplaceLimitsList=" + this.marketplaceLimitsList + ")";
    }

    public MarketplaceLimitsResponse(@Nullable List<MarketplaceConfig> list) {
        this.marketplaceLimitsList = list;
    }

    public /* synthetic */ MarketplaceLimitsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<MarketplaceConfig> getMarketplaceLimitsList() {
        return this.marketplaceLimitsList;
    }
}

