package com.blackhub.bronline.game.gui.craft.model;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftElement.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCraftElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftElement.kt\ncom/blackhub/bronline/game/gui/craft/model/CraftElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,57:1\n86#2,2:58\n33#2,6:60\n88#2:66\n*S KotlinDebug\n*F\n+ 1 CraftElement.kt\ncom/blackhub/bronline/game/gui/craft/model/CraftElement\n*L\n56#1:58,2\n56#1:60,6\n56#1:66\n*E\n"})

public final /* data */ class CraftElement {
    public static final int $stable = 8;

    @NotNull
    public final List<CraftIngredient> componentsList;
    public final int craftingCost;
    public final int elementId;

    @NotNull
    public final CommonRarityEnum elementRarity;

    @NotNull
    public final CraftElementStatusEnum elementState;

    @NotNull
    public final String imageName;
    public final int imageType;
    public final int itemCategory;
    public final int preparationTime;
    public final int rarityName;
    public final int serverId;

    @NotNull
    public final CraftItemTextBlock textBlock;
    public final int timeUntilItemPreparation;

    @Nullable
    public final Integer timeWhenElementCreated;
    public final int valueOfPercent;
    public final int valueOfPipeline;

    @Nullable
    public final Long valueOfTimer;

    /* compiled from: CraftElement.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CraftElement() {
        this(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getElementId() {
        return this.elementId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getValueOfPipeline() {
        return this.valueOfPipeline;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final CraftItemTextBlock getTextBlock() {
        return this.textBlock;
    }

    @NotNull
    public final List<CraftIngredient> component12() {
        return this.componentsList;
    }

    /* renamed from: component13, reason: from getter */
    public final int getValueOfPercent() {
        return this.valueOfPercent;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getValueOfTimer() {
        return this.valueOfTimer;
    }

    /* renamed from: component15, reason: from getter */
    public final int getCraftingCost() {
        return this.craftingCost;
    }

    /* renamed from: component16, reason: from getter */
    public final int getItemCategory() {
        return this.itemCategory;
    }

    /* renamed from: component2, reason: from getter */
    public final int getServerId() {
        return this.serverId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getImageType() {
        return this.imageType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTimeUntilItemPreparation() {
        return this.timeUntilItemPreparation;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPreparationTime() {
        return this.preparationTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTimeWhenElementCreated() {
        return this.timeWhenElementCreated;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CommonRarityEnum getElementRarity() {
        return this.elementRarity;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CraftElementStatusEnum getElementState() {
        return this.elementState;
    }

    @NotNull
    public final CraftElement copy(int elementId, int serverId, @NotNull String imageName, int imageType, int timeUntilItemPreparation, int preparationTime, @Nullable Integer timeWhenElementCreated, @NotNull CommonRarityEnum elementRarity, @NotNull CraftElementStatusEnum elementState, int valueOfPipeline, @NotNull CraftItemTextBlock textBlock, @NotNull List<CraftIngredient> componentsList, int valueOfPercent, @Nullable Long valueOfTimer, int craftingCost, int itemCategory) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(elementRarity, "elementRarity");
        Intrinsics.checkNotNullParameter(elementState, "elementState");
        Intrinsics.checkNotNullParameter(textBlock, "textBlock");
        Intrinsics.checkNotNullParameter(componentsList, "componentsList");
        return new CraftElement(elementId, serverId, imageName, imageType, timeUntilItemPreparation, preparationTime, timeWhenElementCreated, elementRarity, elementState, valueOfPipeline, textBlock, componentsList, valueOfPercent, valueOfTimer, craftingCost, itemCategory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftElement)) {
            return false;
        }
        CraftElement craftElement = (CraftElement) other;
        return this.elementId == craftElement.elementId && this.serverId == craftElement.serverId && Intrinsics.areEqual(this.imageName, craftElement.imageName) && this.imageType == craftElement.imageType && this.timeUntilItemPreparation == craftElement.timeUntilItemPreparation && this.preparationTime == craftElement.preparationTime && Intrinsics.areEqual(this.timeWhenElementCreated, craftElement.timeWhenElementCreated) && this.elementRarity == craftElement.elementRarity && this.elementState == craftElement.elementState && this.valueOfPipeline == craftElement.valueOfPipeline && Intrinsics.areEqual(this.textBlock, craftElement.textBlock) && Intrinsics.areEqual(this.componentsList, craftElement.componentsList) && this.valueOfPercent == craftElement.valueOfPercent && Intrinsics.areEqual(this.valueOfTimer, craftElement.valueOfTimer) && this.craftingCost == craftElement.craftingCost && this.itemCategory == craftElement.itemCategory;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.elementId) * 31) + Integer.hashCode(this.serverId)) * 31) + this.imageName.hashCode()) * 31) + Integer.hashCode(this.imageType)) * 31) + Integer.hashCode(this.timeUntilItemPreparation)) * 31) + Integer.hashCode(this.preparationTime)) * 31;
        Integer num = this.timeWhenElementCreated;
        int iHashCode2 = (((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.elementRarity.hashCode()) * 31) + this.elementState.hashCode()) * 31) + Integer.hashCode(this.valueOfPipeline)) * 31) + this.textBlock.hashCode()) * 31) + this.componentsList.hashCode()) * 31) + Integer.hashCode(this.valueOfPercent)) * 31;
        Long l = this.valueOfTimer;
        return ((((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + Integer.hashCode(this.craftingCost)) * 31) + Integer.hashCode(this.itemCategory);
    }

    @NotNull
    public String toString() {
        return "CraftElement(elementId=" + this.elementId + ", serverId=" + this.serverId + ", imageName=" + this.imageName + ", imageType=" + this.imageType + ", timeUntilItemPreparation=" + this.timeUntilItemPreparation + ", preparationTime=" + this.preparationTime + ", timeWhenElementCreated=" + this.timeWhenElementCreated + ", elementRarity=" + this.elementRarity + ", elementState=" + this.elementState + ", valueOfPipeline=" + this.valueOfPipeline + ", textBlock=" + this.textBlock + ", componentsList=" + this.componentsList + ", valueOfPercent=" + this.valueOfPercent + ", valueOfTimer=" + this.valueOfTimer + ", craftingCost=" + this.craftingCost + ", itemCategory=" + this.itemCategory + ")";
    }

    public CraftElement(int i, int i2, @NotNull String imageName, int i3, int i4, int i5, @Nullable Integer num, @NotNull CommonRarityEnum elementRarity, @NotNull CraftElementStatusEnum elementState, int i6, @NotNull CraftItemTextBlock textBlock, @NotNull List<CraftIngredient> componentsList, int i7, @Nullable Long l, int i8, int i9) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(elementRarity, "elementRarity");
        Intrinsics.checkNotNullParameter(elementState, "elementState");
        Intrinsics.checkNotNullParameter(textBlock, "textBlock");
        Intrinsics.checkNotNullParameter(componentsList, "componentsList");
        this.elementId = i;
        this.serverId = i2;
        this.imageName = imageName;
        this.imageType = i3;
        this.timeUntilItemPreparation = i4;
        this.preparationTime = i5;
        this.timeWhenElementCreated = num;
        this.elementRarity = elementRarity;
        this.elementState = elementState;
        this.valueOfPipeline = i6;
        this.textBlock = textBlock;
        this.componentsList = componentsList;
        this.valueOfPercent = i7;
        this.valueOfTimer = l;
        this.craftingCost = i8;
        this.itemCategory = i9;
        this.rarityName = CommonRarityEnum.INSTANCE.getRarityName(elementRarity);
    }

    public final int getElementId() {
        return this.elementId;
    }

    public final int getServerId() {
        return this.serverId;
    }

    public /* synthetic */ CraftElement(int i, int i2, String str, int i3, int i4, int i5, Integer num, CommonRarityEnum commonRarityEnum, CraftElementStatusEnum craftElementStatusEnum, int i6, CraftItemTextBlock craftItemTextBlock, List list, int i7, Long l, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i10 & 8) != 0 ? 0 : i3, (i10 & 16) != 0 ? 0 : i4, (i10 & 32) != 0 ? 0 : i5, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum, (i10 & 256) != 0 ? CraftElementStatusEnum.NONE : craftElementStatusEnum, (i10 & 512) != 0 ? 0 : i6, (i10 & 1024) != 0 ? new CraftItemTextBlock(null, null, 0, 0, 0.0f, null, 63, null) : craftItemTextBlock, (i10 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4096) != 0 ? 0 : i7, (i10 & 8192) == 0 ? l : null, (i10 & 16384) != 0 ? 0 : i8, (i10 & 32768) != 0 ? 0 : i9);
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    public final int getImageType() {
        return this.imageType;
    }

    public final int getTimeUntilItemPreparation() {
        return this.timeUntilItemPreparation;
    }

    public final int getPreparationTime() {
        return this.preparationTime;
    }

    @Nullable
    public final Integer getTimeWhenElementCreated() {
        return this.timeWhenElementCreated;
    }

    @NotNull
    public final CommonRarityEnum getElementRarity() {
        return this.elementRarity;
    }

    @NotNull
    public final CraftElementStatusEnum getElementState() {
        return this.elementState;
    }

    public final int getValueOfPipeline() {
        return this.valueOfPipeline;
    }

    @NotNull
    public final CraftItemTextBlock getTextBlock() {
        return this.textBlock;
    }

    @NotNull
    public final List<CraftIngredient> getComponentsList() {
        return this.componentsList;
    }

    public final int getValueOfPercent() {
        return this.valueOfPercent;
    }

    @Nullable
    public final Long getValueOfTimer() {
        return this.valueOfTimer;
    }

    public final int getCraftingCost() {
        return this.craftingCost;
    }

    public final int getItemCategory() {
        return this.itemCategory;
    }

    @StringRes
    public final int getRarityName() {
        return this.rarityName;
    }

    @ColorRes
    public final int getBottomBgColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.elementRarity.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.gray : R.color.yellow : R.color.purpur : R.color.light_blue : R.color.green : R.color.gray;
    }

    @ColorRes
    public final int getBorderColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.elementRarity.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.white : R.color.yellow : R.color.purpur : R.color.light_blue : R.color.green : R.color.white;
    }

    public final boolean isEnoughResources() {
        List<CraftIngredient> list = this.componentsList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!list.get(i).isEnough()) {
                return false;
            }
        }
        return true;
    }
}

