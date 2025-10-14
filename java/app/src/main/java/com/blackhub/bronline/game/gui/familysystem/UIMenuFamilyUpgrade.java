package com.blackhub.bronline.game.gui.familysystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesUpgradesLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.blackhub.bronline.game.common.gravitysnaphelper.GravitySnapHelper;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyUpgradeAdapter;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyUpgradeParentItemAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemUpgradeObj;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyUpgradeData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyUpgradeValueData;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMenuFamilyUpgrade.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UIMenuFamilyUpgrade extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;

    @Nullable
    public Animation anim;
    public FamiliesUpgradesLayoutBinding binding;

    @Nullable
    public Function2<? super FamilyUpgradeData, ? super Integer, Unit> clickUpdateItem;
    public int currentUpgradeId;

    @Nullable
    public FamilyUpgradeParentItemAdapter familyUpgradeParentItemAdapter;

    @NotNull
    public final List<Integer> levels;

    @Nullable
    public final LogicForDialogApply logicForDialogApply;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;
    public int maxFamilyLevel;
    public int maxMoney;
    public int maxStoreLevel;
    public int maxWeaponsLevel;
    public int oldMoney;
    public long oldTimerForClickOnUpgrade;
    public int thisPrice;

    @Nullable
    public FamilyUpgradeAdapter upgradeAdapter;

    @NotNull
    public final List<FamilySystemUpgradeObj> upgradeAllListFromApp;

    @NotNull
    public final List<FamilyUpgradeValueData> upgradeCurrentValueList;

    @NotNull
    public final List<FamilyUpgradeData> upgradeList;

    @NotNull
    public final List<FamilyUpgradeValueData> upgradeNewValueList;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMenuFamilyUpgrade(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON, @Nullable LogicForDialogApply logicForDialogApply) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
        this.logicForDialogApply = logicForDialogApply;
        this.upgradeList = new ArrayList();
        this.currentUpgradeId = -1;
        this.oldMoney = -1;
        this.maxMoney = -1;
        this.upgradeAllListFromApp = new ArrayList();
        this.upgradeCurrentValueList = new ArrayList();
        this.upgradeNewValueList = new ArrayList();
        this.levels = new ArrayList();
    }

    public final void setVisibleButtonBackToMenu(boolean ifFromMainMenu) {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        familiesUpgradesLayoutBinding.buttonBackToMenu.setVisibility(ifFromMainMenu ? 4 : 0);
    }

    public final void setStartData(int currentMoneyOnStore, @NotNull List<Integer> currentUpgrades) {
        Intrinsics.checkNotNullParameter(currentUpgrades, "currentUpgrades");
        this.currentUpgradeId = -1;
        this.thisPrice = 0;
        this.oldMoney = currentMoneyOnStore;
        if (this.upgradeList.size() > 0 && this.upgradeList.size() == currentUpgrades.size()) {
            int size = this.upgradeList.size();
            for (int i = 0; i < size; i++) {
                FamilyUpgradeData familyUpgradeData = this.upgradeList.get(i);
                familyUpgradeData.setClicked(false);
                familyUpgradeData.setUpgradeCurrentLevel(currentUpgrades.get(i).intValue());
                if (i == 0) {
                    this.maxMoney = getMaxMoney(familyUpgradeData.getUpgradeId(), familyUpgradeData.getUpgradeCurrentLevel(), this.upgradeAllListFromApp);
                }
                FamilyUpgradeAdapter familyUpgradeAdapter = this.upgradeAdapter;
                if (familyUpgradeAdapter != null) {
                    familyUpgradeAdapter.notifyItemChanged(i);
                }
            }
        }
        setCurrentMoney(this.oldMoney, this.maxMoney);
        clearInfoAboutUpgrade(4);
    }

    public final void setCurrentMoney(int getCurrentMoney, int getMaxMoney) {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        TextView textView = familiesUpgradesLayoutBinding.moneyOnStoreValue;
        JNIActivity jNIActivity = this.mainActivity;
        textView.setText(jNIActivity != null ? jNIActivity.getString(R.string.families_info_money, UsefulKt.getPriceWithSpaces(Integer.valueOf(getCurrentMoney)), UsefulKt.getPriceWithSpaces(Integer.valueOf(getMaxMoney))) : null);
        textView.setSelected(true);
    }

    public final int getMaxMoney(int currentId, int currentLevel, List<FamilySystemUpgradeObj> currentCollection) {
        for (FamilySystemUpgradeObj familySystemUpgradeObj : currentCollection) {
            if (familySystemUpgradeObj.getId() == currentId && familySystemUpgradeObj.getLevel() == currentLevel) {
                return familySystemUpgradeObj.getMoney();
            }
        }
        return 0;
    }

    public final void updateState(int currentId) throws IllegalStateException {
        int size = this.upgradeList.size();
        for (int i = 0; i < size; i++) {
            if (this.upgradeList.get(i).getUpgradeId() == currentId) {
                FamilyUpgradeData familyUpgradeData = this.upgradeList.get(i);
                familyUpgradeData.setUpgradeCurrentLevel(familyUpgradeData.getUpgradeCurrentLevel() + 1);
                FamilyUpgradeAdapter familyUpgradeAdapter = this.upgradeAdapter;
                if (familyUpgradeAdapter != null) {
                    familyUpgradeAdapter.notifyItemChanged(i);
                }
                this.oldMoney -= this.thisPrice;
                if (currentId == 0) {
                    this.maxMoney = getMaxMoney(currentId, this.upgradeList.get(i).getUpgradeCurrentLevel(), this.upgradeAllListFromApp);
                }
                setCurrentMoney(this.oldMoney, this.maxMoney);
                updateDataForUpgrade(this.upgradeList.get(i));
                return;
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        ConstraintLayout root = familiesUpgradesLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBindingInflate = FamiliesUpgradesLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesUpgradesLayoutBindingInflate, "inflate(...)");
        this.binding = familiesUpgradesLayoutBindingInflate;
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = null;
        if (familiesUpgradesLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesUpgradesLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        List<FamilySystemUpgradeObj> list = this.upgradeAllListFromApp;
        list.clear();
        FamilySystemList familySystemListFromJson = this.mainRoot.getFamilySystemListFromJson();
        if (familySystemListFromJson != null) {
            list.addAll(familySystemListFromJson.getUpgradeList());
        }
        setLogicForClickUpdateItem();
        setUpgradeData();
        setUpgradeDataInView();
        setUpdateDataList();
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding2 = this.binding;
        if (familiesUpgradesLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding2 = null;
        }
        familiesUpgradesLayoutBinding2.buttonUpgrade.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMenuFamilyUpgrade.onCreateView$lambda$5(this.f$0, view);
            }
        });
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding3 = this.binding;
        if (familiesUpgradesLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding3 = null;
        }
        familiesUpgradesLayoutBinding3.buttonBackToMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIMenuFamilyUpgrade.onCreateView$lambda$6(this.f$0, view);
            }
        });
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding4 = this.binding;
        if (familiesUpgradesLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesUpgradesLayoutBinding = familiesUpgradesLayoutBinding4;
        }
        ConstraintLayout root = familiesUpgradesLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$5(final UIMenuFamilyUpgrade this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animation = this$0.anim;
        if (animation != null) {
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade$onCreateView$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    LogicForDialogApply logicForDialogApply = this.this$0.logicForDialogApply;
                    if (logicForDialogApply != null) {
                        logicForDialogApply.showDialog(null, Integer.valueOf(this.this$0.thisPrice), null, null);
                    }
                }
            });
        }
        if (view.getAlpha() != 1.0f || this$0.currentUpgradeId == -1) {
            return;
        }
        view.startAnimation(this$0.anim);
    }

    public static final void onCreateView$lambda$6(UIMenuFamilyUpgrade this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
        if (actionsWithJSON != null) {
            actionsWithJSON.sendGetLayout(5);
        }
    }

    public final void upgradeFamily() throws JSONException {
        ActionsWithJSON actionsWithJSON;
        int i = this.currentUpgradeId;
        if (i == -1 || (actionsWithJSON = this.actionsWithJSON) == null) {
            return;
        }
        actionsWithJSON.setUpgradeForFamily(i);
    }

    /* compiled from: UIMenuFamilyUpgrade.kt */
    @Metadata(m7104d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuFamilyUpgrade$setLogicForClickUpdateItem$1", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyUpgradeData;", "Lkotlin/ParameterName;", "name", "updateItem", "", "position", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickUpdateItem;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade$setLogicForClickUpdateItem$1 */

    public static final class C40331 implements Function2<FamilyUpgradeData, Integer, Unit> {
        public C40331() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FamilyUpgradeData familyUpgradeData, Integer num) throws IllegalStateException {
            invoke(familyUpgradeData, num.intValue());
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyUpgradeData updateItem, int position) throws IllegalStateException {
            Intrinsics.checkNotNullParameter(updateItem, "updateItem");
            if (System.currentTimeMillis() - UIMenuFamilyUpgrade.this.oldTimerForClickOnUpgrade > 1000) {
                UIMenuFamilyUpgrade.this.oldTimerForClickOnUpgrade = System.currentTimeMillis();
                updateItem.setClicked(true);
                FamilyUpgradeAdapter familyUpgradeAdapter = UIMenuFamilyUpgrade.this.upgradeAdapter;
                if (familyUpgradeAdapter != null) {
                    familyUpgradeAdapter.notifyItemChanged(position);
                    familyUpgradeAdapter.setCheckOnlyElement(position);
                }
                UIMenuFamilyUpgrade.this.updateTitleForRightBlock(updateItem);
                UIMenuFamilyUpgrade.this.currentUpgradeId = updateItem.getUpgradeId();
                UIMenuFamilyUpgrade.this.clearInfoAboutUpgrade(0);
                UIMenuFamilyUpgrade.this.updateDataForUpgrade(updateItem);
            }
        }
    }

    public final void setLogicForClickUpdateItem() {
        this.clickUpdateItem = new Function2<FamilyUpgradeData, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade.setLogicForClickUpdateItem.1
            public C40331() {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FamilyUpgradeData familyUpgradeData, Integer num) throws IllegalStateException {
                invoke(familyUpgradeData, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyUpgradeData updateItem, int position) throws IllegalStateException {
                Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                if (System.currentTimeMillis() - UIMenuFamilyUpgrade.this.oldTimerForClickOnUpgrade > 1000) {
                    UIMenuFamilyUpgrade.this.oldTimerForClickOnUpgrade = System.currentTimeMillis();
                    updateItem.setClicked(true);
                    FamilyUpgradeAdapter familyUpgradeAdapter = UIMenuFamilyUpgrade.this.upgradeAdapter;
                    if (familyUpgradeAdapter != null) {
                        familyUpgradeAdapter.notifyItemChanged(position);
                        familyUpgradeAdapter.setCheckOnlyElement(position);
                    }
                    UIMenuFamilyUpgrade.this.updateTitleForRightBlock(updateItem);
                    UIMenuFamilyUpgrade.this.currentUpgradeId = updateItem.getUpgradeId();
                    UIMenuFamilyUpgrade.this.clearInfoAboutUpgrade(0);
                    UIMenuFamilyUpgrade.this.updateDataForUpgrade(updateItem);
                }
            }
        };
    }

    public final void updateDataForUpgrade(FamilyUpgradeData updateItem) throws IllegalStateException {
        setCurrentUpgradePrice(updateItem.getUpgradeId(), updateItem.getUpgradeCurrentLevel());
        setUpgradeLevels(updateItem.getUpgradeId(), updateItem.getUpgradeCurrentLevel());
        setUpdateDataList();
        setVisibleButtonUpgrade(this.thisPrice);
    }

    public final void updateTitleForRightBlock(FamilyUpgradeData updateItem) {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        familiesUpgradesLayoutBinding.upgradeTitle.setText(updateItem.getUpgradeDescription());
    }

    public final void setUpgradeDataInView() {
        this.upgradeAdapter = new FamilyUpgradeAdapter(this.upgradeList, this.clickUpdateItem, this.mainActivity);
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding2 = null;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesUpgradesLayoutBinding.upgradeList;
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding3 = this.binding;
        if (familiesUpgradesLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesUpgradesLayoutBinding2 = familiesUpgradesLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesUpgradesLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.upgradeAdapter);
    }

    public final void setUpgradeData() {
        this.maxStoreLevel = 0;
        this.maxWeaponsLevel = 0;
        this.maxFamilyLevel = 0;
        Iterator<FamilySystemUpgradeObj> it = this.upgradeAllListFromApp.iterator();
        while (it.hasNext()) {
            int id = it.next().getId();
            if (id == 0) {
                this.maxStoreLevel++;
            } else if (id == 1) {
                this.maxWeaponsLevel++;
            } else if (id == 2) {
                this.maxFamilyLevel++;
            }
        }
        List<FamilyUpgradeData> list = this.upgradeList;
        list.clear();
        list.add(new FamilyUpgradeData(0, "Улучшить склад", "Склад", 0, this.maxStoreLevel, false, 32, null));
        list.add(new FamilyUpgradeData(1, "Улучшить оружейный склад", "Оружейный склад", 0, this.maxWeaponsLevel, false, 32, null));
        list.add(new FamilyUpgradeData(2, "Улучшить кол-во членов семьи", "Число участников", 0, this.maxFamilyLevel, false, 32, null));
    }

    public final void clearInfoAboutUpgrade(int setVisible) {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        familiesUpgradesLayoutBinding.bodyUpgradeInfoNewLayout.setVisibility(setVisible);
        familiesUpgradesLayoutBinding.buttonUpgrade.setVisibility(setVisible);
    }

    public final void setVisibleButtonUpgrade(int getPrice) {
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        if (getPrice == 0) {
            familiesUpgradesLayoutBinding.buttonUpgrade.setAlpha(0.5f);
        } else {
            familiesUpgradesLayoutBinding.buttonUpgrade.setAlpha(1.0f);
        }
    }

    public final void setCurrentUpgradePrice(int thisId, int thisLevel) {
        if (thisId != 0) {
            if (thisId == 1) {
                if (thisLevel == this.maxWeaponsLevel) {
                    this.thisPrice = 0;
                }
            } else if (thisId == 2 && thisLevel == this.maxFamilyLevel) {
                this.thisPrice = 0;
            }
        } else if (thisLevel == this.maxStoreLevel) {
            this.thisPrice = 0;
        }
        int i = thisLevel + 1;
        for (FamilySystemUpgradeObj familySystemUpgradeObj : this.upgradeAllListFromApp) {
            if (familySystemUpgradeObj.getId() == thisId && familySystemUpgradeObj.getLevel() == i) {
                this.thisPrice = familySystemUpgradeObj.getPrice();
                return;
            }
        }
    }

    public final void setUpgradeLevels(int currentId, int currentLevel) {
        actionWithCollection(this.upgradeCurrentValueList, currentId, currentLevel);
        int i = currentLevel + 1;
        actionWithCollection(this.upgradeNewValueList, currentId, i);
        List<Integer> list = this.levels;
        list.clear();
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = null;
        if (this.upgradeNewValueList.size() != 0) {
            list.add(Integer.valueOf(currentLevel));
            list.add(Integer.valueOf(i));
            FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding2 = this.binding;
            if (familiesUpgradesLayoutBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesUpgradesLayoutBinding = familiesUpgradesLayoutBinding2;
            }
            familiesUpgradesLayoutBinding.viewDotIndicator.setVisibility(0);
            return;
        }
        list.add(Integer.valueOf(currentLevel));
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding3 = this.binding;
        if (familiesUpgradesLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesUpgradesLayoutBinding = familiesUpgradesLayoutBinding3;
        }
        familiesUpgradesLayoutBinding.viewDotIndicator.setVisibility(8);
    }

    public final List<FamilyUpgradeValueData> actionWithCollection(List<FamilyUpgradeValueData> currentCollection, int currentId, int currentLevel) {
        currentCollection.clear();
        for (FamilySystemUpgradeObj familySystemUpgradeObj : this.upgradeAllListFromApp) {
            if (currentId == familySystemUpgradeObj.getId() && currentLevel == familySystemUpgradeObj.getLevel()) {
                if (familySystemUpgradeObj.getMoney() != 0) {
                    currentCollection.add(setCurrentData("money", familySystemUpgradeObj.getMoney()));
                }
                if (familySystemUpgradeObj.getMaterials() != 0) {
                    currentCollection.add(setCurrentData("materials", familySystemUpgradeObj.getMaterials()));
                }
                if (familySystemUpgradeObj.getMasks() != 0) {
                    currentCollection.add(setCurrentData("masks", familySystemUpgradeObj.getMasks()));
                }
                if (familySystemUpgradeObj.getGasoline() != 0) {
                    currentCollection.add(setCurrentData("gasoline", familySystemUpgradeObj.getGasoline()));
                }
                if (familySystemUpgradeObj.getArmour() != 0) {
                    currentCollection.add(setCurrentData("armour", familySystemUpgradeObj.getArmour()));
                }
                if (familySystemUpgradeObj.getPeople() != 0) {
                    currentCollection.add(setCurrentData("people", familySystemUpgradeObj.getPeople()));
                }
                if (familySystemUpgradeObj.getAmmo() != 0) {
                    currentCollection.add(setCurrentData("ammo", familySystemUpgradeObj.getAmmo()));
                }
            }
        }
        return currentCollection;
    }

    public final FamilyUpgradeValueData setCurrentData(String description, int value) {
        return new FamilyUpgradeValueData(description, value);
    }

    public final void setUpdateDataList() throws IllegalStateException {
        this.familyUpgradeParentItemAdapter = new FamilyUpgradeParentItemAdapter(this.levels, this.upgradeCurrentValueList, this.upgradeNewValueList, this.mainActivity);
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding = this.binding;
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding2 = null;
        if (familiesUpgradesLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesUpgradesLayoutBinding.allUpgradeParameters;
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding3 = this.binding;
        if (familiesUpgradesLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding3 = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesUpgradesLayoutBinding3.getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.familyUpgradeParentItemAdapter);
        GravitySnapHelper gravitySnapHelper = new GravitySnapHelper(GravityCompat.START);
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding4 = this.binding;
        if (familiesUpgradesLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding4 = null;
        }
        gravitySnapHelper.attachToRecyclerView(familiesUpgradesLayoutBinding4.allUpgradeParameters);
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding5 = this.binding;
        if (familiesUpgradesLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesUpgradesLayoutBinding5 = null;
        }
        DotViewIndicator dotViewIndicator = familiesUpgradesLayoutBinding5.viewDotIndicator;
        dotViewIndicator.setItemCount(2);
        dotViewIndicator.setCurrentPosition(0);
        FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding6 = this.binding;
        if (familiesUpgradesLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesUpgradesLayoutBinding2 = familiesUpgradesLayoutBinding6;
        }
        familiesUpgradesLayoutBinding2.allUpgradeParameters.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade.setUpdateDataList.3
            public C40343() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                    FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding7 = UIMenuFamilyUpgrade.this.binding;
                    if (familiesUpgradesLayoutBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        familiesUpgradesLayoutBinding7 = null;
                    }
                    familiesUpgradesLayoutBinding7.viewDotIndicator.setCurrentPosition(iFindFirstVisibleItemPosition);
                }
            }
        });
    }

    /* compiled from: UIMenuFamilyUpgrade.kt */
    @Metadata(m7104d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuFamilyUpgrade$setUpdateDataList$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyUpgrade$setUpdateDataList$3 */
    public static final class C40343 extends RecyclerView.OnScrollListener {
        public C40343() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
            super.onScrollStateChanged(recyclerView2, newState);
            if (newState == 0) {
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                FamiliesUpgradesLayoutBinding familiesUpgradesLayoutBinding7 = UIMenuFamilyUpgrade.this.binding;
                if (familiesUpgradesLayoutBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    familiesUpgradesLayoutBinding7 = null;
                }
                familiesUpgradesLayoutBinding7.viewDotIndicator.setCurrentPosition(iFindFirstVisibleItemPosition);
            }
        }
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.upgradeAdapter = null;
        this.clickUpdateItem = null;
        this.familyUpgradeParentItemAdapter = null;
        this.upgradeList.clear();
        this.upgradeAllListFromApp.clear();
        this.upgradeCurrentValueList.clear();
        this.upgradeNewValueList.clear();
        this.levels.clear();
    }
}

