package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.fractions.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceProfileInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "", "playerId", "", "bestMarketplaceProduct", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "countSoldProductsText", "allRevenueText", "(Ljava/lang/String;ILcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;Ljava/lang/String;Ljava/lang/String;)V", "getAllRevenueText", "()Ljava/lang/String;", "getBestMarketplaceProduct", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "getCountSoldProductsText", "getNickname", "getPlayerId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceProfileInfo {
    public static final int $stable = 8;

    @NotNull
    public final String allRevenueText;

    @Nullable
    public final MarketplaceProduct bestMarketplaceProduct;

    @NotNull
    public final String countSoldProductsText;

    @NotNull
    public final String nickname;
    public final int playerId;

    public MarketplaceProfileInfo() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ MarketplaceProfileInfo copy$default(MarketplaceProfileInfo marketplaceProfileInfo, String str, int i, MarketplaceProduct marketplaceProduct, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marketplaceProfileInfo.nickname;
        }
        if ((i2 & 2) != 0) {
            i = marketplaceProfileInfo.playerId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            marketplaceProduct = marketplaceProfileInfo.bestMarketplaceProduct;
        }
        MarketplaceProduct marketplaceProduct2 = marketplaceProduct;
        if ((i2 & 8) != 0) {
            str2 = marketplaceProfileInfo.countSoldProductsText;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = marketplaceProfileInfo.allRevenueText;
        }
        return marketplaceProfileInfo.copy(str, i3, marketplaceProduct2, str4, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MarketplaceProduct getBestMarketplaceProduct() {
        return this.bestMarketplaceProduct;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCountSoldProductsText() {
        return this.countSoldProductsText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAllRevenueText() {
        return this.allRevenueText;
    }

    @NotNull
    public final MarketplaceProfileInfo copy(@NotNull String nickname, int playerId, @Nullable MarketplaceProduct bestMarketplaceProduct, @NotNull String countSoldProductsText, @NotNull String allRevenueText) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(countSoldProductsText, "countSoldProductsText");
        Intrinsics.checkNotNullParameter(allRevenueText, "allRevenueText");
        return new MarketplaceProfileInfo(nickname, playerId, bestMarketplaceProduct, countSoldProductsText, allRevenueText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceProfileInfo)) {
            return false;
        }
        MarketplaceProfileInfo marketplaceProfileInfo = (MarketplaceProfileInfo) other;
        return Intrinsics.areEqual(this.nickname, marketplaceProfileInfo.nickname) && this.playerId == marketplaceProfileInfo.playerId && Intrinsics.areEqual(this.bestMarketplaceProduct, marketplaceProfileInfo.bestMarketplaceProduct) && Intrinsics.areEqual(this.countSoldProductsText, marketplaceProfileInfo.countSoldProductsText) && Intrinsics.areEqual(this.allRevenueText, marketplaceProfileInfo.allRevenueText);
    }

    public int hashCode() {
        int iHashCode = ((this.nickname.hashCode() * 31) + Integer.hashCode(this.playerId)) * 31;
        MarketplaceProduct marketplaceProduct = this.bestMarketplaceProduct;
        return ((((iHashCode + (marketplaceProduct == null ? 0 : marketplaceProduct.hashCode())) * 31) + this.countSoldProductsText.hashCode()) * 31) + this.allRevenueText.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketplaceProfileInfo(nickname=" + this.nickname + ", playerId=" + this.playerId + ", bestMarketplaceProduct=" + this.bestMarketplaceProduct + ", countSoldProductsText=" + this.countSoldProductsText + ", allRevenueText=" + this.allRevenueText + ")";
    }

    public MarketplaceProfileInfo(@NotNull String nickname, int i, @Nullable MarketplaceProduct marketplaceProduct, @NotNull String countSoldProductsText, @NotNull String allRevenueText) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(countSoldProductsText, "countSoldProductsText");
        Intrinsics.checkNotNullParameter(allRevenueText, "allRevenueText");
        this.nickname = nickname;
        this.playerId = i;
        this.bestMarketplaceProduct = marketplaceProduct;
        this.countSoldProductsText = countSoldProductsText;
        this.allRevenueText = allRevenueText;
    }

    public /* synthetic */ MarketplaceProfileInfo(String str, int i, MarketplaceProduct marketplaceProduct, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : marketplaceProduct, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    @Nullable
    public final MarketplaceProduct getBestMarketplaceProduct() {
        return this.bestMarketplaceProduct;
    }

    @NotNull
    public final String getCountSoldProductsText() {
        return this.countSoldProductsText;
    }

    @NotNull
    public final String getAllRevenueText() {
        return this.allRevenueText;
    }
}
