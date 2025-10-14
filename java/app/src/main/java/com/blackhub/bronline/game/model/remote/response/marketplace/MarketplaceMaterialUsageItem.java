package com.blackhub.bronline.game.model.remote.response.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceMaterialUsageItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class MarketplaceMaterialUsageItem {
    public static final int $stable = 0;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    @Nullable
    public final Integer count;

    @SerializedName("itemRank")
    @Nullable
    public final Integer itemRank;

    public MarketplaceMaterialUsageItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarketplaceMaterialUsageItem copy$default(MarketplaceMaterialUsageItem marketplaceMaterialUsageItem, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marketplaceMaterialUsageItem.itemRank;
        }
        if ((i & 2) != 0) {
            num2 = marketplaceMaterialUsageItem.count;
        }
        return marketplaceMaterialUsageItem.copy(num, num2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getItemRank() {
        return this.itemRank;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final MarketplaceMaterialUsageItem copy(@Nullable Integer itemRank, @Nullable Integer count) {
        return new MarketplaceMaterialUsageItem(itemRank, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceMaterialUsageItem)) {
            return false;
        }
        MarketplaceMaterialUsageItem marketplaceMaterialUsageItem = (MarketplaceMaterialUsageItem) other;
        return Intrinsics.areEqual(this.itemRank, marketplaceMaterialUsageItem.itemRank) && Intrinsics.areEqual(this.count, marketplaceMaterialUsageItem.count);
    }

    public int hashCode() {
        Integer num = this.itemRank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketplaceMaterialUsageItem(itemRank=" + this.itemRank + ", count=" + this.count + ")";
    }

    public MarketplaceMaterialUsageItem(@Nullable Integer num, @Nullable Integer num2) {
        this.itemRank = num;
        this.count = num2;
    }

    public /* synthetic */ MarketplaceMaterialUsageItem(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
    }

    @Nullable
    public final Integer getItemRank() {
        return this.itemRank;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }
}

