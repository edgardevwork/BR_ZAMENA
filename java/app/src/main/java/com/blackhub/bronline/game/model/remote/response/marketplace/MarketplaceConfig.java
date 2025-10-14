package com.blackhub.bronline.game.model.remote.response.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceConfig.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class MarketplaceConfig {
    public static final int $stable = 0;

    @SerializedName("hotTicketCost")
    @Nullable
    public final Integer hotTicketCost;

    @SerializedName("hotTicketsMax")
    @Nullable
    public final Integer hotTicketsMax;

    @SerializedName("placementCost")
    @Nullable
    public final Integer placementCost;

    @SerializedName("placementHours")
    @Nullable
    public final Integer placementHours;

    @SerializedName("sellTax")
    @Nullable
    public final Integer sellTax;

    @SerializedName("ticketsMaxTotal")
    @Nullable
    public final Integer ticketsMaxTotal;

    @SerializedName("vipId")
    @Nullable
    public final Integer vipId;

    public MarketplaceConfig() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ MarketplaceConfig copy$default(MarketplaceConfig marketplaceConfig, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marketplaceConfig.vipId;
        }
        if ((i & 2) != 0) {
            num2 = marketplaceConfig.ticketsMaxTotal;
        }
        Integer num8 = num2;
        if ((i & 4) != 0) {
            num3 = marketplaceConfig.hotTicketsMax;
        }
        Integer num9 = num3;
        if ((i & 8) != 0) {
            num4 = marketplaceConfig.placementCost;
        }
        Integer num10 = num4;
        if ((i & 16) != 0) {
            num5 = marketplaceConfig.hotTicketCost;
        }
        Integer num11 = num5;
        if ((i & 32) != 0) {
            num6 = marketplaceConfig.sellTax;
        }
        Integer num12 = num6;
        if ((i & 64) != 0) {
            num7 = marketplaceConfig.placementHours;
        }
        return marketplaceConfig.copy(num, num8, num9, num10, num11, num12, num7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getVipId() {
        return this.vipId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTicketsMaxTotal() {
        return this.ticketsMaxTotal;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getHotTicketsMax() {
        return this.hotTicketsMax;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPlacementCost() {
        return this.placementCost;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getHotTicketCost() {
        return this.hotTicketCost;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getSellTax() {
        return this.sellTax;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPlacementHours() {
        return this.placementHours;
    }

    @NotNull
    public final MarketplaceConfig copy(@Nullable Integer vipId, @Nullable Integer ticketsMaxTotal, @Nullable Integer hotTicketsMax, @Nullable Integer placementCost, @Nullable Integer hotTicketCost, @Nullable Integer sellTax, @Nullable Integer placementHours) {
        return new MarketplaceConfig(vipId, ticketsMaxTotal, hotTicketsMax, placementCost, hotTicketCost, sellTax, placementHours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceConfig)) {
            return false;
        }
        MarketplaceConfig marketplaceConfig = (MarketplaceConfig) other;
        return Intrinsics.areEqual(this.vipId, marketplaceConfig.vipId) && Intrinsics.areEqual(this.ticketsMaxTotal, marketplaceConfig.ticketsMaxTotal) && Intrinsics.areEqual(this.hotTicketsMax, marketplaceConfig.hotTicketsMax) && Intrinsics.areEqual(this.placementCost, marketplaceConfig.placementCost) && Intrinsics.areEqual(this.hotTicketCost, marketplaceConfig.hotTicketCost) && Intrinsics.areEqual(this.sellTax, marketplaceConfig.sellTax) && Intrinsics.areEqual(this.placementHours, marketplaceConfig.placementHours);
    }

    public int hashCode() {
        Integer num = this.vipId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.ticketsMaxTotal;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hotTicketsMax;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.placementCost;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hotTicketCost;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.sellTax;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.placementHours;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketplaceConfig(vipId=" + this.vipId + ", ticketsMaxTotal=" + this.ticketsMaxTotal + ", hotTicketsMax=" + this.hotTicketsMax + ", placementCost=" + this.placementCost + ", hotTicketCost=" + this.hotTicketCost + ", sellTax=" + this.sellTax + ", placementHours=" + this.placementHours + ")";
    }

    public MarketplaceConfig(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7) {
        this.vipId = num;
        this.ticketsMaxTotal = num2;
        this.hotTicketsMax = num3;
        this.placementCost = num4;
        this.hotTicketCost = num5;
        this.sellTax = num6;
        this.placementHours = num7;
    }

    public /* synthetic */ MarketplaceConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? 0 : num4, (i & 16) != 0 ? 0 : num5, (i & 32) != 0 ? 0 : num6, (i & 64) != 0 ? 0 : num7);
    }

    @Nullable
    public final Integer getVipId() {
        return this.vipId;
    }

    @Nullable
    public final Integer getTicketsMaxTotal() {
        return this.ticketsMaxTotal;
    }

    @Nullable
    public final Integer getHotTicketsMax() {
        return this.hotTicketsMax;
    }

    @Nullable
    public final Integer getPlacementCost() {
        return this.placementCost;
    }

    @Nullable
    public final Integer getHotTicketCost() {
        return this.hotTicketCost;
    }

    @Nullable
    public final Integer getSellTax() {
        return this.sellTax;
    }

    @Nullable
    public final Integer getPlacementHours() {
        return this.placementHours;
    }
}

