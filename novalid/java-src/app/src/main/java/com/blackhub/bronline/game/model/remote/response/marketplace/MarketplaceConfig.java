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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJb\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006#"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceConfig;", "", "vipId", "", "ticketsMaxTotal", "hotTicketsMax", "placementCost", "hotTicketCost", "sellTax", "placementHours", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHotTicketCost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHotTicketsMax", "getPlacementCost", "getPlacementHours", "getSellTax", "getTicketsMaxTotal", "getVipId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceConfig;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
