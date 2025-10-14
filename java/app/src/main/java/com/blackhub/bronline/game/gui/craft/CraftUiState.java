package com.blackhub.bronline.game.gui.craft;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.text.ttml.TtmlParser;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl;
import com.blackhub.bronline.game.gui.craft.model.CraftDialogConfirmationAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftForcedTutorialAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.gui.craft.model.CraftScreenTypeObject;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.bless.client.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final List<CraftElement> allElementsForCraftAfterFilter;

    @Nullable
    public final Bitmap backgroundImage;

    @NotNull
    public final ButtonAnimatedAttachment buttonAnimatedAttachment;

    @NotNull
    public final String buttonWithLineText;

    @NotNull
    public final List<CommonButtonCategory> categories;

    @Nullable
    public final String craftIconAlarmText;

    @NotNull
    public final CraftItemTextBlock craftItemTextBlock;

    @NotNull
    public final CraftScreenTypeObject craftScreenTypeObject;

    @NotNull
    public final CraftCraftingControl craftingControlInfo;

    @NotNull
    public final CraftScreenTypeEnum currentScreen;

    @NotNull
    public final CraftDialogConfirmationAttachment dialogConfirmationAttachment;

    @NotNull
    public final List<CraftCategoryFilter> filterList;

    @NotNull
    public final List<CraftForcedTutorialAttachment> forcedTutorialAttachment;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final boolean isNeedToShowDialogConfirmation;
    public final boolean isNeedToShowFilter;
    public final boolean isNeedToShowForcedTutorial;
    public final boolean isNeedToShowHints;
    public final boolean isNeedToShowLevelUpDialog;
    public final boolean isNeedToShowSplit;
    public final boolean isNeedToShowTutorial;
    public final boolean isPlayerHasVip;
    public final boolean isWithIndicationFilter;
    public final int levelOfSkill;

    @NotNull
    public final List<CraftElement> listOfLevelUpElements;

    @NotNull
    public final List<CraftElement> listWithProductionItems;

    @NotNull
    public final List<CraftElement> listWithStorageItems;

    @NotNull
    public final Map<Integer, List<CraftElement>> mapOfCraftElements;
    public final int percentOfSkill;

    @Nullable
    public final String progressIconAlarmText;
    public final int quantityInQueue;
    public final int quantityInStorage;
    public final int quantityOfNewItemsInStorage;
    public final int queueMax;

    @NotNull
    public final CommonButtonCategory selectedCategory;
    public final int selectedCategoryIndex;

    @NotNull
    public final CraftElement selectedElement;

    @Nullable
    public final String stashIconAlarmText;
    public final int storageMax;
    public final int valueOfRubles;
    public final int workbenchLevel;

    /* compiled from: CraftUiState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CraftUiState() {
        this(null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, null, null, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, 0, 0, false, null, false, null, false, -1, 1023, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CraftScreenTypeEnum getCurrentScreen() {
        return this.currentScreen;
    }

    /* renamed from: component10, reason: from getter */
    public final int getQuantityInQueue() {
        return this.quantityInQueue;
    }

    /* renamed from: component11, reason: from getter */
    public final int getQueueMax() {
        return this.queueMax;
    }

    /* renamed from: component12, reason: from getter */
    public final int getQuantityInStorage() {
        return this.quantityInStorage;
    }

    /* renamed from: component13, reason: from getter */
    public final int getStorageMax() {
        return this.storageMax;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsPlayerHasVip() {
        return this.isPlayerHasVip;
    }

    /* renamed from: component15, reason: from getter */
    public final int getQuantityOfNewItemsInStorage() {
        return this.quantityOfNewItemsInStorage;
    }

    @NotNull
    public final Map<Integer, List<CraftElement>> component16() {
        return this.mapOfCraftElements;
    }

    @NotNull
    public final List<CraftElement> component17() {
        return this.listWithStorageItems;
    }

    @NotNull
    public final List<CraftElement> component18() {
        return this.listWithProductionItems;
    }

    @NotNull
    public final List<CraftElement> component19() {
        return this.listOfLevelUpElements;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CraftScreenTypeObject getCraftScreenTypeObject() {
        return this.craftScreenTypeObject;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Bitmap getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final ButtonAnimatedAttachment getButtonAnimatedAttachment() {
        return this.buttonAnimatedAttachment;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsNeedToShowFilter() {
        return this.isNeedToShowFilter;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsNeedToShowTutorial() {
        return this.isNeedToShowTutorial;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsNeedToShowHints() {
        return this.isNeedToShowHints;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsNeedToShowLevelUpDialog() {
        return this.isNeedToShowLevelUpDialog;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsNeedToShowSplit() {
        return this.isNeedToShowSplit;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsWithIndicationFilter() {
        return this.isWithIndicationFilter;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final CraftElement getSelectedElement() {
        return this.selectedElement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CraftItemTextBlock getCraftItemTextBlock() {
        return this.craftItemTextBlock;
    }

    @NotNull
    public final List<CraftElement> component30() {
        return this.allElementsForCraftAfterFilter;
    }

    @NotNull
    public final List<CommonButtonCategory> component31() {
        return this.categories;
    }

    @NotNull
    /* renamed from: component32, reason: from getter */
    public final CommonButtonCategory getSelectedCategory() {
        return this.selectedCategory;
    }

    @NotNull
    public final List<CraftCategoryFilter> component33() {
        return this.filterList;
    }

    @NotNull
    /* renamed from: component34, reason: from getter */
    public final String getButtonWithLineText() {
        return this.buttonWithLineText;
    }

    @NotNull
    /* renamed from: component35, reason: from getter */
    public final CraftCraftingControl getCraftingControlInfo() {
        return this.craftingControlInfo;
    }

    /* renamed from: component36, reason: from getter */
    public final int getValueOfRubles() {
        return this.valueOfRubles;
    }

    /* renamed from: component37, reason: from getter */
    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getIsNeedToShowDialogConfirmation() {
        return this.isNeedToShowDialogConfirmation;
    }

    @NotNull
    /* renamed from: component39, reason: from getter */
    public final CraftDialogConfirmationAttachment getDialogConfirmationAttachment() {
        return this.dialogConfirmationAttachment;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCraftIconAlarmText() {
        return this.craftIconAlarmText;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsNeedToShowForcedTutorial() {
        return this.isNeedToShowForcedTutorial;
    }

    @NotNull
    public final List<CraftForcedTutorialAttachment> component41() {
        return this.forcedTutorialAttachment;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getStashIconAlarmText() {
        return this.stashIconAlarmText;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getProgressIconAlarmText() {
        return this.progressIconAlarmText;
    }

    /* renamed from: component7, reason: from getter */
    public final int getWorkbenchLevel() {
        return this.workbenchLevel;
    }

    /* renamed from: component8, reason: from getter */
    public final int getLevelOfSkill() {
        return this.levelOfSkill;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPercentOfSkill() {
        return this.percentOfSkill;
    }

    @NotNull
    public final CraftUiState copy(@NotNull CraftScreenTypeEnum currentScreen, @NotNull CraftScreenTypeObject craftScreenTypeObject, @NotNull CraftItemTextBlock craftItemTextBlock, @Nullable String craftIconAlarmText, @Nullable String stashIconAlarmText, @Nullable String progressIconAlarmText, int workbenchLevel, int levelOfSkill, int percentOfSkill, int quantityInQueue, int queueMax, int quantityInStorage, int storageMax, boolean isPlayerHasVip, int quantityOfNewItemsInStorage, @NotNull Map<Integer, ? extends List<CraftElement>> mapOfCraftElements, @NotNull List<CraftElement> listWithStorageItems, @NotNull List<CraftElement> listWithProductionItems, @NotNull List<CraftElement> listOfLevelUpElements, @Nullable Bitmap bitmap, @NotNull ButtonAnimatedAttachment buttonAnimatedAttachment, boolean isNeedToShowFilter, boolean isNeedToShowTutorial, boolean isNeedToShowHints, boolean isNeedToShowLevelUpDialog, boolean isNeedToShowSplit, boolean isNeedClose, boolean isWithIndicationFilter, @NotNull CraftElement selectedElement, @NotNull List<CraftElement> allElementsForCraftAfterFilter, @NotNull List<CommonButtonCategory> categories, @NotNull CommonButtonCategory selectedCategory, @NotNull List<CraftCategoryFilter> filterList, @NotNull String buttonWithLineText, @NotNull CraftCraftingControl craftingControlInfo, int valueOfRubles, int selectedCategoryIndex, boolean isNeedToShowDialogConfirmation, @NotNull CraftDialogConfirmationAttachment dialogConfirmationAttachment, boolean isNeedToShowForcedTutorial, @NotNull List<CraftForcedTutorialAttachment> forcedTutorialAttachment, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(craftScreenTypeObject, "craftScreenTypeObject");
        Intrinsics.checkNotNullParameter(craftItemTextBlock, "craftItemTextBlock");
        Intrinsics.checkNotNullParameter(mapOfCraftElements, "mapOfCraftElements");
        Intrinsics.checkNotNullParameter(listWithStorageItems, "listWithStorageItems");
        Intrinsics.checkNotNullParameter(listWithProductionItems, "listWithProductionItems");
        Intrinsics.checkNotNullParameter(listOfLevelUpElements, "listOfLevelUpElements");
        Intrinsics.checkNotNullParameter(buttonAnimatedAttachment, "buttonAnimatedAttachment");
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        Intrinsics.checkNotNullParameter(allElementsForCraftAfterFilter, "allElementsForCraftAfterFilter");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(buttonWithLineText, "buttonWithLineText");
        Intrinsics.checkNotNullParameter(craftingControlInfo, "craftingControlInfo");
        Intrinsics.checkNotNullParameter(dialogConfirmationAttachment, "dialogConfirmationAttachment");
        Intrinsics.checkNotNullParameter(forcedTutorialAttachment, "forcedTutorialAttachment");
        return new CraftUiState(currentScreen, craftScreenTypeObject, craftItemTextBlock, craftIconAlarmText, stashIconAlarmText, progressIconAlarmText, workbenchLevel, levelOfSkill, percentOfSkill, quantityInQueue, queueMax, quantityInStorage, storageMax, isPlayerHasVip, quantityOfNewItemsInStorage, mapOfCraftElements, listWithStorageItems, listWithProductionItems, listOfLevelUpElements, bitmap, buttonAnimatedAttachment, isNeedToShowFilter, isNeedToShowTutorial, isNeedToShowHints, isNeedToShowLevelUpDialog, isNeedToShowSplit, isNeedClose, isWithIndicationFilter, selectedElement, allElementsForCraftAfterFilter, categories, selectedCategory, filterList, buttonWithLineText, craftingControlInfo, valueOfRubles, selectedCategoryIndex, isNeedToShowDialogConfirmation, dialogConfirmationAttachment, isNeedToShowForcedTutorial, forcedTutorialAttachment, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftUiState)) {
            return false;
        }
        CraftUiState craftUiState = (CraftUiState) other;
        return this.currentScreen == craftUiState.currentScreen && Intrinsics.areEqual(this.craftScreenTypeObject, craftUiState.craftScreenTypeObject) && Intrinsics.areEqual(this.craftItemTextBlock, craftUiState.craftItemTextBlock) && Intrinsics.areEqual(this.craftIconAlarmText, craftUiState.craftIconAlarmText) && Intrinsics.areEqual(this.stashIconAlarmText, craftUiState.stashIconAlarmText) && Intrinsics.areEqual(this.progressIconAlarmText, craftUiState.progressIconAlarmText) && this.workbenchLevel == craftUiState.workbenchLevel && this.levelOfSkill == craftUiState.levelOfSkill && this.percentOfSkill == craftUiState.percentOfSkill && this.quantityInQueue == craftUiState.quantityInQueue && this.queueMax == craftUiState.queueMax && this.quantityInStorage == craftUiState.quantityInStorage && this.storageMax == craftUiState.storageMax && this.isPlayerHasVip == craftUiState.isPlayerHasVip && this.quantityOfNewItemsInStorage == craftUiState.quantityOfNewItemsInStorage && Intrinsics.areEqual(this.mapOfCraftElements, craftUiState.mapOfCraftElements) && Intrinsics.areEqual(this.listWithStorageItems, craftUiState.listWithStorageItems) && Intrinsics.areEqual(this.listWithProductionItems, craftUiState.listWithProductionItems) && Intrinsics.areEqual(this.listOfLevelUpElements, craftUiState.listOfLevelUpElements) && Intrinsics.areEqual(this.backgroundImage, craftUiState.backgroundImage) && Intrinsics.areEqual(this.buttonAnimatedAttachment, craftUiState.buttonAnimatedAttachment) && this.isNeedToShowFilter == craftUiState.isNeedToShowFilter && this.isNeedToShowTutorial == craftUiState.isNeedToShowTutorial && this.isNeedToShowHints == craftUiState.isNeedToShowHints && this.isNeedToShowLevelUpDialog == craftUiState.isNeedToShowLevelUpDialog && this.isNeedToShowSplit == craftUiState.isNeedToShowSplit && this.isNeedClose == craftUiState.isNeedClose && this.isWithIndicationFilter == craftUiState.isWithIndicationFilter && Intrinsics.areEqual(this.selectedElement, craftUiState.selectedElement) && Intrinsics.areEqual(this.allElementsForCraftAfterFilter, craftUiState.allElementsForCraftAfterFilter) && Intrinsics.areEqual(this.categories, craftUiState.categories) && Intrinsics.areEqual(this.selectedCategory, craftUiState.selectedCategory) && Intrinsics.areEqual(this.filterList, craftUiState.filterList) && Intrinsics.areEqual(this.buttonWithLineText, craftUiState.buttonWithLineText) && Intrinsics.areEqual(this.craftingControlInfo, craftUiState.craftingControlInfo) && this.valueOfRubles == craftUiState.valueOfRubles && this.selectedCategoryIndex == craftUiState.selectedCategoryIndex && this.isNeedToShowDialogConfirmation == craftUiState.isNeedToShowDialogConfirmation && Intrinsics.areEqual(this.dialogConfirmationAttachment, craftUiState.dialogConfirmationAttachment) && this.isNeedToShowForcedTutorial == craftUiState.isNeedToShowForcedTutorial && Intrinsics.areEqual(this.forcedTutorialAttachment, craftUiState.forcedTutorialAttachment) && this.isBlockingLoading == craftUiState.isBlockingLoading;
    }

    public int hashCode() {
        int iHashCode = ((((this.currentScreen.hashCode() * 31) + this.craftScreenTypeObject.hashCode()) * 31) + this.craftItemTextBlock.hashCode()) * 31;
        String str = this.craftIconAlarmText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stashIconAlarmText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.progressIconAlarmText;
        int iHashCode4 = (((((((((((((((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.workbenchLevel)) * 31) + Integer.hashCode(this.levelOfSkill)) * 31) + Integer.hashCode(this.percentOfSkill)) * 31) + Integer.hashCode(this.quantityInQueue)) * 31) + Integer.hashCode(this.queueMax)) * 31) + Integer.hashCode(this.quantityInStorage)) * 31) + Integer.hashCode(this.storageMax)) * 31) + Boolean.hashCode(this.isPlayerHasVip)) * 31) + Integer.hashCode(this.quantityOfNewItemsInStorage)) * 31) + this.mapOfCraftElements.hashCode()) * 31) + this.listWithStorageItems.hashCode()) * 31) + this.listWithProductionItems.hashCode()) * 31) + this.listOfLevelUpElements.hashCode()) * 31;
        Bitmap bitmap = this.backgroundImage;
        return ((((((((((((((((((((((((((((((((((((((((((((iHashCode4 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + this.buttonAnimatedAttachment.hashCode()) * 31) + Boolean.hashCode(this.isNeedToShowFilter)) * 31) + Boolean.hashCode(this.isNeedToShowTutorial)) * 31) + Boolean.hashCode(this.isNeedToShowHints)) * 31) + Boolean.hashCode(this.isNeedToShowLevelUpDialog)) * 31) + Boolean.hashCode(this.isNeedToShowSplit)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isWithIndicationFilter)) * 31) + this.selectedElement.hashCode()) * 31) + this.allElementsForCraftAfterFilter.hashCode()) * 31) + this.categories.hashCode()) * 31) + this.selectedCategory.hashCode()) * 31) + this.filterList.hashCode()) * 31) + this.buttonWithLineText.hashCode()) * 31) + this.craftingControlInfo.hashCode()) * 31) + Integer.hashCode(this.valueOfRubles)) * 31) + Integer.hashCode(this.selectedCategoryIndex)) * 31) + Boolean.hashCode(this.isNeedToShowDialogConfirmation)) * 31) + this.dialogConfirmationAttachment.hashCode()) * 31) + Boolean.hashCode(this.isNeedToShowForcedTutorial)) * 31) + this.forcedTutorialAttachment.hashCode()) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "CraftUiState(currentScreen=" + this.currentScreen + ", craftScreenTypeObject=" + this.craftScreenTypeObject + ", craftItemTextBlock=" + this.craftItemTextBlock + ", craftIconAlarmText=" + this.craftIconAlarmText + ", stashIconAlarmText=" + this.stashIconAlarmText + ", progressIconAlarmText=" + this.progressIconAlarmText + ", workbenchLevel=" + this.workbenchLevel + ", levelOfSkill=" + this.levelOfSkill + ", percentOfSkill=" + this.percentOfSkill + ", quantityInQueue=" + this.quantityInQueue + ", queueMax=" + this.queueMax + ", quantityInStorage=" + this.quantityInStorage + ", storageMax=" + this.storageMax + ", isPlayerHasVip=" + this.isPlayerHasVip + ", quantityOfNewItemsInStorage=" + this.quantityOfNewItemsInStorage + ", mapOfCraftElements=" + this.mapOfCraftElements + ", listWithStorageItems=" + this.listWithStorageItems + ", listWithProductionItems=" + this.listWithProductionItems + ", listOfLevelUpElements=" + this.listOfLevelUpElements + ", backgroundImage=" + this.backgroundImage + ", buttonAnimatedAttachment=" + this.buttonAnimatedAttachment + ", isNeedToShowFilter=" + this.isNeedToShowFilter + ", isNeedToShowTutorial=" + this.isNeedToShowTutorial + ", isNeedToShowHints=" + this.isNeedToShowHints + ", isNeedToShowLevelUpDialog=" + this.isNeedToShowLevelUpDialog + ", isNeedToShowSplit=" + this.isNeedToShowSplit + ", isNeedClose=" + this.isNeedClose + ", isWithIndicationFilter=" + this.isWithIndicationFilter + ", selectedElement=" + this.selectedElement + ", allElementsForCraftAfterFilter=" + this.allElementsForCraftAfterFilter + ", categories=" + this.categories + ", selectedCategory=" + this.selectedCategory + ", filterList=" + this.filterList + ", buttonWithLineText=" + this.buttonWithLineText + ", craftingControlInfo=" + this.craftingControlInfo + ", valueOfRubles=" + this.valueOfRubles + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ", isNeedToShowDialogConfirmation=" + this.isNeedToShowDialogConfirmation + ", dialogConfirmationAttachment=" + this.dialogConfirmationAttachment + ", isNeedToShowForcedTutorial=" + this.isNeedToShowForcedTutorial + ", forcedTutorialAttachment=" + this.forcedTutorialAttachment + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CraftUiState(@NotNull CraftScreenTypeEnum currentScreen, @NotNull CraftScreenTypeObject craftScreenTypeObject, @NotNull CraftItemTextBlock craftItemTextBlock, @Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, @NotNull Map<Integer, ? extends List<CraftElement>> mapOfCraftElements, @NotNull List<CraftElement> listWithStorageItems, @NotNull List<CraftElement> listWithProductionItems, @NotNull List<CraftElement> listOfLevelUpElements, @Nullable Bitmap bitmap, @NotNull ButtonAnimatedAttachment buttonAnimatedAttachment, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull CraftElement selectedElement, @NotNull List<CraftElement> allElementsForCraftAfterFilter, @NotNull List<CommonButtonCategory> categories, @NotNull CommonButtonCategory selectedCategory, @NotNull List<CraftCategoryFilter> filterList, @NotNull String buttonWithLineText, @NotNull CraftCraftingControl craftingControlInfo, int i9, int i10, boolean z9, @NotNull CraftDialogConfirmationAttachment dialogConfirmationAttachment, boolean z10, @NotNull List<CraftForcedTutorialAttachment> forcedTutorialAttachment, boolean z11) {
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(craftScreenTypeObject, "craftScreenTypeObject");
        Intrinsics.checkNotNullParameter(craftItemTextBlock, "craftItemTextBlock");
        Intrinsics.checkNotNullParameter(mapOfCraftElements, "mapOfCraftElements");
        Intrinsics.checkNotNullParameter(listWithStorageItems, "listWithStorageItems");
        Intrinsics.checkNotNullParameter(listWithProductionItems, "listWithProductionItems");
        Intrinsics.checkNotNullParameter(listOfLevelUpElements, "listOfLevelUpElements");
        Intrinsics.checkNotNullParameter(buttonAnimatedAttachment, "buttonAnimatedAttachment");
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        Intrinsics.checkNotNullParameter(allElementsForCraftAfterFilter, "allElementsForCraftAfterFilter");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(buttonWithLineText, "buttonWithLineText");
        Intrinsics.checkNotNullParameter(craftingControlInfo, "craftingControlInfo");
        Intrinsics.checkNotNullParameter(dialogConfirmationAttachment, "dialogConfirmationAttachment");
        Intrinsics.checkNotNullParameter(forcedTutorialAttachment, "forcedTutorialAttachment");
        this.currentScreen = currentScreen;
        this.craftScreenTypeObject = craftScreenTypeObject;
        this.craftItemTextBlock = craftItemTextBlock;
        this.craftIconAlarmText = str;
        this.stashIconAlarmText = str2;
        this.progressIconAlarmText = str3;
        this.workbenchLevel = i;
        this.levelOfSkill = i2;
        this.percentOfSkill = i3;
        this.quantityInQueue = i4;
        this.queueMax = i5;
        this.quantityInStorage = i6;
        this.storageMax = i7;
        this.isPlayerHasVip = z;
        this.quantityOfNewItemsInStorage = i8;
        this.mapOfCraftElements = mapOfCraftElements;
        this.listWithStorageItems = listWithStorageItems;
        this.listWithProductionItems = listWithProductionItems;
        this.listOfLevelUpElements = listOfLevelUpElements;
        this.backgroundImage = bitmap;
        this.buttonAnimatedAttachment = buttonAnimatedAttachment;
        this.isNeedToShowFilter = z2;
        this.isNeedToShowTutorial = z3;
        this.isNeedToShowHints = z4;
        this.isNeedToShowLevelUpDialog = z5;
        this.isNeedToShowSplit = z6;
        this.isNeedClose = z7;
        this.isWithIndicationFilter = z8;
        this.selectedElement = selectedElement;
        this.allElementsForCraftAfterFilter = allElementsForCraftAfterFilter;
        this.categories = categories;
        this.selectedCategory = selectedCategory;
        this.filterList = filterList;
        this.buttonWithLineText = buttonWithLineText;
        this.craftingControlInfo = craftingControlInfo;
        this.valueOfRubles = i9;
        this.selectedCategoryIndex = i10;
        this.isNeedToShowDialogConfirmation = z9;
        this.dialogConfirmationAttachment = dialogConfirmationAttachment;
        this.isNeedToShowForcedTutorial = z10;
        this.forcedTutorialAttachment = forcedTutorialAttachment;
        this.isBlockingLoading = z11;
    }

    public /* synthetic */ CraftUiState(CraftScreenTypeEnum craftScreenTypeEnum, CraftScreenTypeObject craftScreenTypeObject, CraftItemTextBlock craftItemTextBlock, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, Map map, List list, List list2, List list3, Bitmap bitmap, ButtonAnimatedAttachment buttonAnimatedAttachment, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CraftElement craftElement, List list4, List list5, CommonButtonCategory commonButtonCategory, List list6, String str4, CraftCraftingControl craftCraftingControl, int i9, int i10, boolean z9, CraftDialogConfirmationAttachment craftDialogConfirmationAttachment, boolean z10, List list7, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CraftScreenTypeEnum.CRAFT : craftScreenTypeEnum, (i11 & 2) != 0 ? new CraftScreenTypeObject(null, null, 3, null) : craftScreenTypeObject, (i11 & 4) != 0 ? new CraftItemTextBlock(null, null, 0, 0, 0.0f, null, 63, null) : craftItemTextBlock, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? 0 : i, (i11 & 128) != 0 ? 0 : i2, (i11 & 256) != 0 ? 0 : i3, (i11 & 512) != 0 ? 0 : i4, (i11 & 1024) != 0 ? 0 : i5, (i11 & 2048) != 0 ? 0 : i6, (i11 & 4096) != 0 ? 0 : i7, (i11 & 8192) != 0 ? false : z, (i11 & 16384) != 0 ? 0 : i8, (i11 & 32768) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i11 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i11 & 131072) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i11 & 262144) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i11 & 524288) != 0 ? null : bitmap, (i11 & 1048576) != 0 ? new ButtonAnimatedAttachment(false, false, false, 7, null) : buttonAnimatedAttachment, (i11 & 2097152) != 0 ? false : z2, (i11 & 4194304) != 0 ? false : z3, (i11 & 8388608) != 0 ? false : z4, (i11 & 16777216) != 0 ? false : z5, (i11 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? false : z6, (i11 & 67108864) != 0 ? false : z7, (i11 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z8, (i11 & 268435456) != 0 ? new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null) : craftElement, (i11 & 536870912) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i11 & 1073741824) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i11 & Integer.MIN_VALUE) != 0 ? new CommonButtonCategory(0, null, null, false, false, null, null, 127, null) : commonButtonCategory, (i12 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i12 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i12 & 4) != 0 ? new CraftCraftingControl(0, 0, 0, 0.0f, null, 0, false, false, false, false, false, 0, UnixStat.PERM_MASK, null) : craftCraftingControl, (i12 & 8) != 0 ? 0 : i9, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? false : z9, (i12 & 64) != 0 ? new CraftDialogConfirmationAttachment(0, null, 0, null, 0, 31, null) : craftDialogConfirmationAttachment, (i12 & 128) != 0 ? false : z10, (i12 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i12 & 512) != 0 ? true : z11);
    }

    @NotNull
    public final CraftScreenTypeEnum getCurrentScreen() {
        return this.currentScreen;
    }

    @NotNull
    public final CraftScreenTypeObject getCraftScreenTypeObject() {
        return this.craftScreenTypeObject;
    }

    @NotNull
    public final CraftItemTextBlock getCraftItemTextBlock() {
        return this.craftItemTextBlock;
    }

    @Nullable
    public final String getCraftIconAlarmText() {
        return this.craftIconAlarmText;
    }

    @Nullable
    public final String getStashIconAlarmText() {
        return this.stashIconAlarmText;
    }

    @Nullable
    public final String getProgressIconAlarmText() {
        return this.progressIconAlarmText;
    }

    public final int getWorkbenchLevel() {
        return this.workbenchLevel;
    }

    public final int getLevelOfSkill() {
        return this.levelOfSkill;
    }

    public final int getPercentOfSkill() {
        return this.percentOfSkill;
    }

    public final int getQuantityInQueue() {
        return this.quantityInQueue;
    }

    public final int getQueueMax() {
        return this.queueMax;
    }

    public final int getQuantityInStorage() {
        return this.quantityInStorage;
    }

    public final int getStorageMax() {
        return this.storageMax;
    }

    public final boolean isPlayerHasVip() {
        return this.isPlayerHasVip;
    }

    public final int getQuantityOfNewItemsInStorage() {
        return this.quantityOfNewItemsInStorage;
    }

    @NotNull
    public final Map<Integer, List<CraftElement>> getMapOfCraftElements() {
        return this.mapOfCraftElements;
    }

    @NotNull
    public final List<CraftElement> getListWithStorageItems() {
        return this.listWithStorageItems;
    }

    @NotNull
    public final List<CraftElement> getListWithProductionItems() {
        return this.listWithProductionItems;
    }

    @NotNull
    public final List<CraftElement> getListOfLevelUpElements() {
        return this.listOfLevelUpElements;
    }

    @Nullable
    public final Bitmap getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final ButtonAnimatedAttachment getButtonAnimatedAttachment() {
        return this.buttonAnimatedAttachment;
    }

    public final boolean isNeedToShowFilter() {
        return this.isNeedToShowFilter;
    }

    public final boolean isNeedToShowTutorial() {
        return this.isNeedToShowTutorial;
    }

    public final boolean isNeedToShowHints() {
        return this.isNeedToShowHints;
    }

    public final boolean isNeedToShowLevelUpDialog() {
        return this.isNeedToShowLevelUpDialog;
    }

    public final boolean isNeedToShowSplit() {
        return this.isNeedToShowSplit;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isWithIndicationFilter() {
        return this.isWithIndicationFilter;
    }

    @NotNull
    public final CraftElement getSelectedElement() {
        return this.selectedElement;
    }

    @NotNull
    public final List<CraftElement> getAllElementsForCraftAfterFilter() {
        return this.allElementsForCraftAfterFilter;
    }

    @NotNull
    public final List<CommonButtonCategory> getCategories() {
        return this.categories;
    }

    @NotNull
    public final CommonButtonCategory getSelectedCategory() {
        return this.selectedCategory;
    }

    @NotNull
    public final List<CraftCategoryFilter> getFilterList() {
        return this.filterList;
    }

    @NotNull
    public final String getButtonWithLineText() {
        return this.buttonWithLineText;
    }

    @NotNull
    public final CraftCraftingControl getCraftingControlInfo() {
        return this.craftingControlInfo;
    }

    public final int getValueOfRubles() {
        return this.valueOfRubles;
    }

    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final boolean isNeedToShowDialogConfirmation() {
        return this.isNeedToShowDialogConfirmation;
    }

    @NotNull
    public final CraftDialogConfirmationAttachment getDialogConfirmationAttachment() {
        return this.dialogConfirmationAttachment;
    }

    public final boolean isNeedToShowForcedTutorial() {
        return this.isNeedToShowForcedTutorial;
    }

    @NotNull
    public final List<CraftForcedTutorialAttachment> getForcedTutorialAttachment() {
        return this.forcedTutorialAttachment;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    @ColorRes
    public final int getDividerColor() {
        return this.isNeedToShowHints ? R.color.white_5 : R.color.white_40;
    }

    @ColorRes
    public final int getTopColorFilterButton() {
        return this.isNeedToShowFilter ? R.color.white : R.color.gray_blue;
    }

    @ColorRes
    public final int getBottomColorFilterButton() {
        return this.isNeedToShowFilter ? R.color.white : R.color.black_gray_blue_2;
    }

    @ColorRes
    public final int getIconColorFilterButton() {
        return this.isNeedToShowFilter ? R.color.black : R.color.white;
    }

    public final boolean isNeedToShowFilterButton() {
        return this.currentScreen == CraftScreenTypeEnum.CRAFT;
    }

    @ColorRes
    public final int getProdProgressBarThumbColor() {
        return isQueueFilled() ? R.color.yellow_orange : R.color.dark_green;
    }

    @ColorRes
    public final int getStashProgressBarThumbColor() {
        return isStorageFilled() ? R.color.yellow_orange : R.color.dark_green;
    }

    public final boolean isQueueFilled() {
        return this.quantityInQueue >= this.queueMax;
    }

    public final boolean isStorageFilled() {
        return this.quantityInStorage >= this.storageMax;
    }

    @StringRes
    public final int getTextForEmptyList() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.currentScreen.ordinal()];
        return i != 1 ? i != 2 ? R.string.craft_no_items : R.string.craft_no_items_in_production : R.string.craft_no_items_in_storage;
    }
}

