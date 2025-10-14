package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceProduct.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceProduct {
    public static final int $stable = 8;
    public final int count;

    @NotNull
    public final String description;
    public final int id;

    @NotNull
    public final String imageName;
    public final int inventoryId;
    public boolean isHaveLike;
    public final boolean isPlatinumVipProduct;
    public final boolean isPublished;
    public boolean isSelected;
    public final boolean isUser;

    @NotNull
    public final String name;

    @NotNull
    public final MarketplaceNotificationEnum notificationType;
    public final long price;

    @NotNull
    public final MarketplaceRarityEnum rarity;

    @NotNull
    public final CaseRenderAttachment renderInfo;

    @NotNull
    public final String seller;

    @NotNull
    public final MarketplaceHistoryStatusEnum statusForHistory;
    public final int time;
    public final int timeTemplate;

    @NotNull
    public final String timeText;
    public final int timeVipCard;

    @NotNull
    public final MarketplaceTypeProductCardEnum typeProductCard;
    public final int typeTextRes;
    public final double weight;

    /* compiled from: MarketplaceProduct.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MarketplaceHistoryStatusEnum.values().length];
            try {
                iArr[MarketplaceHistoryStatusEnum.SOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketplaceHistoryStatusEnum.PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketplaceHistoryStatusEnum.NOTHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketplaceRarityEnum.values().length];
            try {
                iArr2[MarketplaceRarityEnum.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketplaceRarityEnum.UNCOMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketplaceRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MarketplaceRarityEnum.EPIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MarketplaceRarityEnum.LEGENDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MarketplaceRarityEnum.SPECIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarketplaceTypeProductCardEnum.values().length];
            try {
                iArr3[MarketplaceTypeProductCardEnum.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[MarketplaceTypeProductCardEnum.HOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MarketplaceTypeProductCardEnum.IN_STOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MarketplaceTypeProductCardEnum.BEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public MarketplaceProduct() {
        this(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPlatinumVipProduct() {
        return this.isPlatinumVipProduct;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTimeTemplate() {
        return this.timeTemplate;
    }

    /* renamed from: component11, reason: from getter */
    public final int getInventoryId() {
        return this.inventoryId;
    }

    /* renamed from: component12, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getSeller() {
        return this.seller;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    /* renamed from: component17, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    /* renamed from: component18, reason: from getter */
    public final int getTypeTextRes() {
        return this.typeTextRes;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final MarketplaceHistoryStatusEnum getStatusForHistory() {
        return this.statusForHistory;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsUser() {
        return this.isUser;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsPublished() {
        return this.isPublished;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsHaveLike() {
        return this.isHaveLike;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final CaseRenderAttachment getRenderInfo() {
        return this.renderInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MarketplaceRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MarketplaceTypeProductCardEnum getTypeProductCard() {
        return this.typeProductCard;
    }

    /* renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final MarketplaceNotificationEnum getNotificationType() {
        return this.notificationType;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTimeVipCard() {
        return this.timeVipCard;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @NotNull
    public final MarketplaceProduct copy(boolean isPlatinumVipProduct, @NotNull String name, @NotNull String imageName, @NotNull MarketplaceRarityEnum rarity, @NotNull MarketplaceTypeProductCardEnum typeProductCard, int id, @NotNull MarketplaceNotificationEnum notificationType, int timeVipCard, int time, @StringRes int timeTemplate, int inventoryId, long price, int count, @NotNull String seller, @NotNull String description, @NotNull String timeText, double weight, @StringRes int typeTextRes, @NotNull MarketplaceHistoryStatusEnum statusForHistory, boolean isSelected, boolean isUser, boolean isPublished, boolean isHaveLike, @NotNull CaseRenderAttachment renderInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(typeProductCard, "typeProductCard");
        Intrinsics.checkNotNullParameter(notificationType, "notificationType");
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        Intrinsics.checkNotNullParameter(statusForHistory, "statusForHistory");
        Intrinsics.checkNotNullParameter(renderInfo, "renderInfo");
        return new MarketplaceProduct(isPlatinumVipProduct, name, imageName, rarity, typeProductCard, id, notificationType, timeVipCard, time, timeTemplate, inventoryId, price, count, seller, description, timeText, weight, typeTextRes, statusForHistory, isSelected, isUser, isPublished, isHaveLike, renderInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceProduct)) {
            return false;
        }
        MarketplaceProduct marketplaceProduct = (MarketplaceProduct) other;
        return this.isPlatinumVipProduct == marketplaceProduct.isPlatinumVipProduct && Intrinsics.areEqual(this.name, marketplaceProduct.name) && Intrinsics.areEqual(this.imageName, marketplaceProduct.imageName) && this.rarity == marketplaceProduct.rarity && this.typeProductCard == marketplaceProduct.typeProductCard && this.id == marketplaceProduct.id && this.notificationType == marketplaceProduct.notificationType && this.timeVipCard == marketplaceProduct.timeVipCard && this.time == marketplaceProduct.time && this.timeTemplate == marketplaceProduct.timeTemplate && this.inventoryId == marketplaceProduct.inventoryId && this.price == marketplaceProduct.price && this.count == marketplaceProduct.count && Intrinsics.areEqual(this.seller, marketplaceProduct.seller) && Intrinsics.areEqual(this.description, marketplaceProduct.description) && Intrinsics.areEqual(this.timeText, marketplaceProduct.timeText) && Double.compare(this.weight, marketplaceProduct.weight) == 0 && this.typeTextRes == marketplaceProduct.typeTextRes && this.statusForHistory == marketplaceProduct.statusForHistory && this.isSelected == marketplaceProduct.isSelected && this.isUser == marketplaceProduct.isUser && this.isPublished == marketplaceProduct.isPublished && this.isHaveLike == marketplaceProduct.isHaveLike && Intrinsics.areEqual(this.renderInfo, marketplaceProduct.renderInfo);
    }

    public final boolean getIsNeedToShowTimer(int tabValue) {
        return tabValue == 2 || tabValue == 4 || tabValue == 5;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.isPlatinumVipProduct) * 31) + this.name.hashCode()) * 31) + this.imageName.hashCode()) * 31) + this.rarity.hashCode()) * 31) + this.typeProductCard.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.notificationType.hashCode()) * 31) + Integer.hashCode(this.timeVipCard)) * 31) + Integer.hashCode(this.time)) * 31) + Integer.hashCode(this.timeTemplate)) * 31) + Integer.hashCode(this.inventoryId)) * 31) + Long.hashCode(this.price)) * 31) + Integer.hashCode(this.count)) * 31) + this.seller.hashCode()) * 31) + this.description.hashCode()) * 31) + this.timeText.hashCode()) * 31) + Double.hashCode(this.weight)) * 31) + Integer.hashCode(this.typeTextRes)) * 31) + this.statusForHistory.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isUser)) * 31) + Boolean.hashCode(this.isPublished)) * 31) + Boolean.hashCode(this.isHaveLike)) * 31) + this.renderInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketplaceProduct(isPlatinumVipProduct=" + this.isPlatinumVipProduct + ", name=" + this.name + ", imageName=" + this.imageName + ", rarity=" + this.rarity + ", typeProductCard=" + this.typeProductCard + ", id=" + this.id + ", notificationType=" + this.notificationType + ", timeVipCard=" + this.timeVipCard + ", time=" + this.time + ", timeTemplate=" + this.timeTemplate + ", inventoryId=" + this.inventoryId + ", price=" + this.price + ", count=" + this.count + ", seller=" + this.seller + ", description=" + this.description + ", timeText=" + this.timeText + ", weight=" + this.weight + ", typeTextRes=" + this.typeTextRes + ", statusForHistory=" + this.statusForHistory + ", isSelected=" + this.isSelected + ", isUser=" + this.isUser + ", isPublished=" + this.isPublished + ", isHaveLike=" + this.isHaveLike + ", renderInfo=" + this.renderInfo + ")";
    }

    public MarketplaceProduct(boolean z, @NotNull String name, @NotNull String imageName, @NotNull MarketplaceRarityEnum rarity, @NotNull MarketplaceTypeProductCardEnum typeProductCard, int i, @NotNull MarketplaceNotificationEnum notificationType, int i2, int i3, @StringRes int i4, int i5, long j, int i6, @NotNull String seller, @NotNull String description, @NotNull String timeText, double d, @StringRes int i7, @NotNull MarketplaceHistoryStatusEnum statusForHistory, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull CaseRenderAttachment renderInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(typeProductCard, "typeProductCard");
        Intrinsics.checkNotNullParameter(notificationType, "notificationType");
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        Intrinsics.checkNotNullParameter(statusForHistory, "statusForHistory");
        Intrinsics.checkNotNullParameter(renderInfo, "renderInfo");
        this.isPlatinumVipProduct = z;
        this.name = name;
        this.imageName = imageName;
        this.rarity = rarity;
        this.typeProductCard = typeProductCard;
        this.id = i;
        this.notificationType = notificationType;
        this.timeVipCard = i2;
        this.time = i3;
        this.timeTemplate = i4;
        this.inventoryId = i5;
        this.price = j;
        this.count = i6;
        this.seller = seller;
        this.description = description;
        this.timeText = timeText;
        this.weight = d;
        this.typeTextRes = i7;
        this.statusForHistory = statusForHistory;
        this.isSelected = z2;
        this.isUser = z3;
        this.isPublished = z4;
        this.isHaveLike = z5;
        this.renderInfo = renderInfo;
    }

    public final boolean isPlatinumVipProduct() {
        return this.isPlatinumVipProduct;
    }

    public /* synthetic */ MarketplaceProduct(boolean z, String str, String str2, MarketplaceRarityEnum marketplaceRarityEnum, MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum, int i, MarketplaceNotificationEnum marketplaceNotificationEnum, int i2, int i3, int i4, int i5, long j, int i6, String str3, String str4, String str5, double d, int i7, MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum, boolean z2, boolean z3, boolean z4, boolean z5, CaseRenderAttachment caseRenderAttachment, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z, (i8 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i8 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i8 & 8) != 0 ? MarketplaceRarityEnum.COMMON : marketplaceRarityEnum, (i8 & 16) != 0 ? MarketplaceTypeProductCardEnum.COMMON : marketplaceTypeProductCardEnum, (i8 & 32) != 0 ? 0 : i, (i8 & 64) != 0 ? MarketplaceNotificationEnum.NOTHING : marketplaceNotificationEnum, (i8 & 128) != 0 ? 0 : i2, (i8 & 256) != 0 ? 0 : i3, (i8 & 512) != 0 ? R.string.common_empty : i4, (i8 & 1024) != 0 ? 0 : i5, (i8 & 2048) != 0 ? 0L : j, (i8 & 4096) != 0 ? 1 : i6, (i8 & 8192) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i8 & 16384) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i8 & 32768) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i8 & 65536) != 0 ? 0.0d : d, (i8 & 131072) != 0 ? R.string.common_material : i7, (i8 & 262144) != 0 ? MarketplaceHistoryStatusEnum.NOTHING : marketplaceHistoryStatusEnum, (i8 & 524288) != 0 ? false : z2, (i8 & 1048576) != 0 ? false : z3, (i8 & 2097152) != 0 ? false : z4, (i8 & 4194304) != 0 ? false : z5, (i8 & 8388608) != 0 ? new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null) : caseRenderAttachment);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final MarketplaceRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    public final MarketplaceTypeProductCardEnum getTypeProductCard() {
        return this.typeProductCard;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final MarketplaceNotificationEnum getNotificationType() {
        return this.notificationType;
    }

    public final int getTimeVipCard() {
        return this.timeVipCard;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getTimeTemplate() {
        return this.timeTemplate;
    }

    public final int getInventoryId() {
        return this.inventoryId;
    }

    public final long getPrice() {
        return this.price;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getSeller() {
        return this.seller;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTimeText() {
        return this.timeText;
    }

    public final double getWeight() {
        return this.weight;
    }

    public final int getTypeTextRes() {
        return this.typeTextRes;
    }

    @NotNull
    public final MarketplaceHistoryStatusEnum getStatusForHistory() {
        return this.statusForHistory;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final boolean isUser() {
        return this.isUser;
    }

    public final boolean isPublished() {
        return this.isPublished;
    }

    public final boolean isHaveLike() {
        return this.isHaveLike;
    }

    public final void setHaveLike(boolean z) {
        this.isHaveLike = z;
    }

    @NotNull
    public final CaseRenderAttachment getRenderInfo() {
        return this.renderInfo;
    }

    public final boolean isHot() {
        return this.typeProductCard == MarketplaceTypeProductCardEnum.HOT;
    }

    public final boolean isShiningIconNeed() {
        return this.rarity == MarketplaceRarityEnum.LEGENDARY;
    }

    @StringRes
    public final int getHistoryTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.statusForHistory.ordinal()];
        if (i == 1) {
            return R.string.marketplace_history_sold_title;
        }
        if (i == 2) {
            return R.string.marketplace_history_purchased_title;
        }
        if (i == 3) {
            return R.string.common_empty;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getHistoryTitleColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.statusForHistory.ordinal()];
        if (i == 1) {
            return R.color.light_blue;
        }
        if (i == 2) {
            return R.color.dark_medium_green;
        }
        if (i == 3) {
            return R.color.white;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getBorderColorForLastPurchaseCardBorder() {
        return this.isSelected ? R.color.white : R.color.transparent;
    }

    @DrawableRes
    @Nullable
    public final Integer getHistoryCardIcon() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.statusForHistory.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.ic_currency);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.ic_shopping_bag);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    public final int getHistoryCardTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.statusForHistory.ordinal()];
        if (i == 1) {
            return R.string.marketplace_byer_with_dots;
        }
        if (i == 2) {
            return R.string.marketplace_seller_with_dots;
        }
        if (i == 3) {
            return R.string.marketplace_byer_with_dots;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getBgColor() {
        switch (WhenMappings.$EnumSwitchMapping$1[this.rarity.ordinal()]) {
            case 1:
                return R.color.gray_50;
            case 2:
                return R.color.green_50;
            case 3:
                return R.color.light_blue;
            case 4:
                return R.color.purpur;
            case 5:
                return R.color.yellow;
            case 6:
                return R.color.light_brown_2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @ColorRes
    public final int getBgBorderColor() {
        switch (WhenMappings.$EnumSwitchMapping$1[this.rarity.ordinal()]) {
            case 1:
            case 6:
                return R.color.white;
            case 2:
                return R.color.green;
            case 3:
                return R.color.light_blue;
            case 4:
                return R.color.purpur;
            case 5:
                return R.color.yellow;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @ColorRes
    public final int getRarityTextColor() {
        switch (WhenMappings.$EnumSwitchMapping$1[this.rarity.ordinal()]) {
            case 1:
                return R.color.white;
            case 2:
                return R.color.green;
            case 3:
                return R.color.light_blue;
            case 4:
                return R.color.purpur;
            case 5:
                return R.color.yellow;
            case 6:
                return R.color.light_brown_2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @ColorRes
    public final int getCardHeaderColor() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1) {
            return R.color.gray_blue;
        }
        if (i == 2) {
            return R.color.red;
        }
        if (i == 3) {
            return R.color.gray_blue;
        }
        if (i == 4) {
            return R.color.white;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getCardShadowColor() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1) {
            return R.color.transparent;
        }
        if (i == 2) {
            return R.color.red;
        }
        if (i == 3) {
            return R.color.transparent;
        }
        if (i == 4) {
            return R.color.white;
        }
        throw new NoWhenBranchMatchedException();
    }

    @DrawableRes
    @Nullable
    public final Integer getCardTitleIcon() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.ic_flame);
        }
        if (i == 3) {
            return null;
        }
        if (i == 4) {
            return Integer.valueOf(R.drawable.ic_vip_black);
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    public final int getCardTitle() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1) {
            return this.typeTextRes;
        }
        if (i == 2) {
            return R.string.marketplace_card_hot_title;
        }
        if (i == 3) {
            return R.string.marketplace_card_in_stock_title;
        }
        if (i == 4) {
            return R.string.marketplace_card_best_title;
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    @Nullable
    public final Integer getCardTitleLeftCountText() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.common_count);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.common_count);
        }
        if (i == 3) {
            return Integer.valueOf(R.string.common_count);
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    public final int getPriceTemplate() {
        return this.isPlatinumVipProduct ? R.string.common_price_per_mounth : R.string.common_string_with_ruble;
    }

    @StringRes
    public final int getWeightTemplate() {
        return this.isPlatinumVipProduct ? R.string.common_price_per_mounth : R.string.inv_items_weight;
    }

    @StringRes
    @Nullable
    public final Integer getCardTitleLeftTimeText() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return null;
        }
        if (i == 4) {
            return Integer.valueOf(R.string.common_hours_and_min);
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    public final int getCardButtonText() {
        boolean z = this.isUser;
        return (z && this.isPublished) ? R.string.common_change : z ? R.string.marketplace_card_button_text : R.string.common_buy;
    }

    @ColorRes
    public final int getButtonColor() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return R.color.dark_medium_green;
        }
        if (i == 4) {
            return R.color.white;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getCardTextColor() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.typeProductCard.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return R.color.white;
        }
        if (i == 4) {
            return R.color.total_black;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorRes
    public final int getHeartColor() {
        return this.isHaveLike ? R.color.red : R.color.total_black;
    }
}

