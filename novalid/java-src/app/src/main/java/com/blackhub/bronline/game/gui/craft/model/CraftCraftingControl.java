package com.blackhub.bronline.game.gui.craft.model;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftCraftingControl.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u0081\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0011\u0010#\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u0011\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001c¨\u00069"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftCraftingControl;", "", "typeOfBlock", "", "selectedValueOfItem", "maxValueOfItems", "selectedWeight", "", "craftingCost", "", "timeUntilItemWillBePrepared", "isEnoughMoney", "", "isEnoughResources", "isLowLevel", "isWorkbenchLevelInsufficient", "isEnabledMainButton", "textSelectedValueOfItemColor", "(IIIFLjava/lang/String;IZZZZZI)V", "buttonAlpha", "getButtonAlpha", "()F", "getCraftingCost", "()Ljava/lang/String;", "()Z", "isEnabledMinus", "isEnabledPlus", "getMaxValueOfItems", "()I", "getSelectedValueOfItem", "getSelectedWeight", "selectedWeightStrValue", "getSelectedWeightStrValue", "textCurrentValueOfItems", "getTextCurrentValueOfItems", "textMoneyColor", "getTextMoneyColor", "getTextSelectedValueOfItemColor", "getTimeUntilItemWillBePrepared", "getTypeOfBlock", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CraftCraftingControl {
    public static final int $stable = 0;

    @NotNull
    public final String craftingCost;
    public final boolean isEnabledMainButton;
    public final boolean isEnoughMoney;
    public final boolean isEnoughResources;
    public final boolean isLowLevel;
    public final boolean isWorkbenchLevelInsufficient;
    public final int maxValueOfItems;
    public final int selectedValueOfItem;
    public final float selectedWeight;
    public final int textSelectedValueOfItemColor;
    public final int timeUntilItemWillBePrepared;
    public final int typeOfBlock;

    public CraftCraftingControl() {
        this(0, 0, 0, 0.0f, null, 0, false, false, false, false, false, 0, UnixStat.PERM_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTypeOfBlock() {
        return this.typeOfBlock;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsWorkbenchLevelInsufficient() {
        return this.isWorkbenchLevelInsufficient;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsEnabledMainButton() {
        return this.isEnabledMainButton;
    }

    /* renamed from: component12, reason: from getter */
    public final int getTextSelectedValueOfItemColor() {
        return this.textSelectedValueOfItemColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedValueOfItem() {
        return this.selectedValueOfItem;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxValueOfItems() {
        return this.maxValueOfItems;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSelectedWeight() {
        return this.selectedWeight;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCraftingCost() {
        return this.craftingCost;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTimeUntilItemWillBePrepared() {
        return this.timeUntilItemWillBePrepared;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEnoughMoney() {
        return this.isEnoughMoney;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsEnoughResources() {
        return this.isEnoughResources;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLowLevel() {
        return this.isLowLevel;
    }

    @NotNull
    public final CraftCraftingControl copy(int typeOfBlock, int selectedValueOfItem, int maxValueOfItems, float selectedWeight, @NotNull String craftingCost, int timeUntilItemWillBePrepared, boolean isEnoughMoney, boolean isEnoughResources, boolean isLowLevel, boolean isWorkbenchLevelInsufficient, boolean isEnabledMainButton, int textSelectedValueOfItemColor) {
        Intrinsics.checkNotNullParameter(craftingCost, "craftingCost");
        return new CraftCraftingControl(typeOfBlock, selectedValueOfItem, maxValueOfItems, selectedWeight, craftingCost, timeUntilItemWillBePrepared, isEnoughMoney, isEnoughResources, isLowLevel, isWorkbenchLevelInsufficient, isEnabledMainButton, textSelectedValueOfItemColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftCraftingControl)) {
            return false;
        }
        CraftCraftingControl craftCraftingControl = (CraftCraftingControl) other;
        return this.typeOfBlock == craftCraftingControl.typeOfBlock && this.selectedValueOfItem == craftCraftingControl.selectedValueOfItem && this.maxValueOfItems == craftCraftingControl.maxValueOfItems && Float.compare(this.selectedWeight, craftCraftingControl.selectedWeight) == 0 && Intrinsics.areEqual(this.craftingCost, craftCraftingControl.craftingCost) && this.timeUntilItemWillBePrepared == craftCraftingControl.timeUntilItemWillBePrepared && this.isEnoughMoney == craftCraftingControl.isEnoughMoney && this.isEnoughResources == craftCraftingControl.isEnoughResources && this.isLowLevel == craftCraftingControl.isLowLevel && this.isWorkbenchLevelInsufficient == craftCraftingControl.isWorkbenchLevelInsufficient && this.isEnabledMainButton == craftCraftingControl.isEnabledMainButton && this.textSelectedValueOfItemColor == craftCraftingControl.textSelectedValueOfItemColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.typeOfBlock) * 31) + Integer.hashCode(this.selectedValueOfItem)) * 31) + Integer.hashCode(this.maxValueOfItems)) * 31) + Float.hashCode(this.selectedWeight)) * 31) + this.craftingCost.hashCode()) * 31) + Integer.hashCode(this.timeUntilItemWillBePrepared)) * 31) + Boolean.hashCode(this.isEnoughMoney)) * 31) + Boolean.hashCode(this.isEnoughResources)) * 31) + Boolean.hashCode(this.isLowLevel)) * 31) + Boolean.hashCode(this.isWorkbenchLevelInsufficient)) * 31) + Boolean.hashCode(this.isEnabledMainButton)) * 31) + Integer.hashCode(this.textSelectedValueOfItemColor);
    }

    @NotNull
    public String toString() {
        return "CraftCraftingControl(typeOfBlock=" + this.typeOfBlock + ", selectedValueOfItem=" + this.selectedValueOfItem + ", maxValueOfItems=" + this.maxValueOfItems + ", selectedWeight=" + this.selectedWeight + ", craftingCost=" + this.craftingCost + ", timeUntilItemWillBePrepared=" + this.timeUntilItemWillBePrepared + ", isEnoughMoney=" + this.isEnoughMoney + ", isEnoughResources=" + this.isEnoughResources + ", isLowLevel=" + this.isLowLevel + ", isWorkbenchLevelInsufficient=" + this.isWorkbenchLevelInsufficient + ", isEnabledMainButton=" + this.isEnabledMainButton + ", textSelectedValueOfItemColor=" + this.textSelectedValueOfItemColor + ")";
    }

    public CraftCraftingControl(int i, int i2, int i3, float f, @NotNull String craftingCost, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i5) {
        Intrinsics.checkNotNullParameter(craftingCost, "craftingCost");
        this.typeOfBlock = i;
        this.selectedValueOfItem = i2;
        this.maxValueOfItems = i3;
        this.selectedWeight = f;
        this.craftingCost = craftingCost;
        this.timeUntilItemWillBePrepared = i4;
        this.isEnoughMoney = z;
        this.isEnoughResources = z2;
        this.isLowLevel = z3;
        this.isWorkbenchLevelInsufficient = z4;
        this.isEnabledMainButton = z5;
        this.textSelectedValueOfItemColor = i5;
    }

    public final int getTypeOfBlock() {
        return this.typeOfBlock;
    }

    public final int getSelectedValueOfItem() {
        return this.selectedValueOfItem;
    }

    public final int getMaxValueOfItems() {
        return this.maxValueOfItems;
    }

    public final float getSelectedWeight() {
        return this.selectedWeight;
    }

    public /* synthetic */ CraftCraftingControl(int i, int i2, int i3, float f, String str, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 1 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? true : z, (i6 & 128) != 0 ? true : z2, (i6 & 256) != 0 ? false : z3, (i6 & 512) == 0 ? z4 : false, (i6 & 1024) == 0 ? z5 : true, (i6 & 2048) != 0 ? R.color.white : i5);
    }

    @NotNull
    public final String getCraftingCost() {
        return this.craftingCost;
    }

    public final int getTimeUntilItemWillBePrepared() {
        return this.timeUntilItemWillBePrepared;
    }

    public final boolean isEnoughMoney() {
        return this.isEnoughMoney;
    }

    public final boolean isEnoughResources() {
        return this.isEnoughResources;
    }

    public final boolean isLowLevel() {
        return this.isLowLevel;
    }

    public final boolean isWorkbenchLevelInsufficient() {
        return this.isWorkbenchLevelInsufficient;
    }

    public final boolean isEnabledMainButton() {
        return this.isEnabledMainButton;
    }

    @ColorRes
    public final int getTextSelectedValueOfItemColor() {
        return this.textSelectedValueOfItemColor;
    }

    public final boolean isEnabledMinus() {
        return this.selectedValueOfItem > 1;
    }

    public final boolean isEnabledPlus() {
        return this.selectedValueOfItem < this.maxValueOfItems;
    }

    @ColorRes
    public final int getTextMoneyColor() {
        return this.isEnoughMoney ? R.color.white : R.color.rose_red;
    }

    public final float getButtonAlpha() {
        return this.isEnabledMainButton ? 1.0f : 0.5f;
    }

    public final float getTextCurrentValueOfItems() {
        return this.isLowLevel ? 0.5f : 1.0f;
    }

    @NotNull
    public final String getSelectedWeightStrValue() {
        float f = this.selectedWeight;
        return f % ((float) 1) == 0.0f ? String.valueOf((int) f) : String.valueOf(f);
    }
}
