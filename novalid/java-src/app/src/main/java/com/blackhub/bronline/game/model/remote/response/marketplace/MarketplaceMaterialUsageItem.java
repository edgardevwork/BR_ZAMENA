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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceMaterialUsageItem;", "", "itemRank", "", CatchStreamerKeys.COUNT_KEY, "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemRank", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceMaterialUsageItem;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
