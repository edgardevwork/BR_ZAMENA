package com.blackhub.bronline.game.gui.familysystem;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesMenuMainLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyMenuMainAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyMainItemData;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMenuMain.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UIMenuMain extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;
    public Animation anim;
    public FamiliesMenuMainLayoutBinding binding;

    @Nullable
    public final LogicForDialogApply logicForDialogApply;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;
    public FamilyMenuMainAdapter menuAdapter;

    @NotNull
    public final List<FamilyMainItemData> menuList;
    public long oldTimer;
    public Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> onClickMenuMainList;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMenuMain(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON, @Nullable LogicForDialogApply logicForDialogApply) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
        this.logicForDialogApply = logicForDialogApply;
        this.menuList = new ArrayList();
    }

    public final void setStartParameters(@NotNull List<Integer> upgrades, @NotNull List<Integer> repPeopleSkin, @NotNull List<Integer> otherState, @NotNull String playersNickValue, int playersIdValue) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(upgrades, "upgrades");
        Intrinsics.checkNotNullParameter(repPeopleSkin, "repPeopleSkin");
        Intrinsics.checkNotNullParameter(otherState, "otherState");
        Intrinsics.checkNotNullParameter(playersNickValue, "playersNickValue");
        this.oldTimer = 0L;
        if (upgrades.size() == 6 && repPeopleSkin.size() == 3 && otherState.size() == 12) {
            FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding = this.binding;
            if (familiesMenuMainLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                familiesMenuMainLayoutBinding = null;
            }
            TextView textView = familiesMenuMainLayoutBinding.familyStatusValue;
            if (this.mainRoot.getFamilyStatus() == 0) {
                text = getContext().getText(R.string.families_menu_main_layout_brigade_status);
            } else {
                text = getContext().getText(R.string.families_menu_main_layout_syndicate_status);
            }
            textView.setText(text);
            familiesMenuMainLayoutBinding.reputationsValue.setText(String.valueOf(repPeopleSkin.get(0).intValue()));
            familiesMenuMainLayoutBinding.peopleValue.setText(String.valueOf(repPeopleSkin.get(1).intValue()));
            String string = getContext().getString(R.string.common_level_dot);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            familiesMenuMainLayoutBinding.upgradeStorageValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, upgrades.get(0), upgrades.get(1), string));
            familiesMenuMainLayoutBinding.upgradeWeaponValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, upgrades.get(2), upgrades.get(3), string));
            familiesMenuMainLayoutBinding.upgradePeopleValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, upgrades.get(4), upgrades.get(5), string));
            String string2 = getContext().getString(R.string.common_value);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            familiesMenuMainLayoutBinding.moneyValue.setText(getContext().getString(R.string.families_info_money, String.valueOf(otherState.get(0).intValue()), String.valueOf(otherState.get(1).intValue())));
            familiesMenuMainLayoutBinding.materialsValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, otherState.get(2), otherState.get(3), string2));
            familiesMenuMainLayoutBinding.masksValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, otherState.get(4), otherState.get(5), string2));
            familiesMenuMainLayoutBinding.oilsValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, otherState.get(6), otherState.get(7), string2));
            familiesMenuMainLayoutBinding.armorValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, otherState.get(8), otherState.get(9), string2));
            familiesMenuMainLayoutBinding.ammunitionValue.setText(getContext().getString(R.string.common_number_current_number_max_str_value, otherState.get(10), otherState.get(11), string2));
            familiesMenuMainLayoutBinding.playersNick.setText(getContext().getString(R.string.common_str_value_and_number_in_baskets, playersNickValue, Integer.valueOf(playersIdValue)));
            Useful useful = Useful.INSTANCE;
            int iIntValue = repPeopleSkin.get(2).intValue();
            FrameLayout familySkin = familiesMenuMainLayoutBinding.familySkin;
            Intrinsics.checkNotNullExpressionValue(familySkin, "familySkin");
            useful.renderSkin(2, 134, iIntValue, 1, familySkin);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding = this.binding;
        if (familiesMenuMainLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuMainLayoutBinding = null;
        }
        ConstraintLayout root = familiesMenuMainLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBindingInflate = FamiliesMenuMainLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesMenuMainLayoutBindingInflate, "inflate(...)");
        this.binding = familiesMenuMainLayoutBindingInflate;
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding = null;
        if (familiesMenuMainLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuMainLayoutBindingInflate = null;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(familiesMenuMainLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(...)");
        this.anim = animationLoadAnimation;
        addItemsInMenu();
        setLogicForMenuClick();
        setDataInView();
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding2 = this.binding;
        if (familiesMenuMainLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuMainLayoutBinding2 = null;
        }
        familiesMenuMainLayoutBinding2.playersNick.setSelected(true);
        familiesMenuMainLayoutBinding2.peopleValue.setSelected(true);
        familiesMenuMainLayoutBinding2.upgradeStorageValue.setSelected(true);
        familiesMenuMainLayoutBinding2.upgradeWeaponValue.setSelected(true);
        familiesMenuMainLayoutBinding2.upgradePeopleValue.setSelected(true);
        familiesMenuMainLayoutBinding2.moneyValue.setSelected(true);
        familiesMenuMainLayoutBinding2.materialsValue.setSelected(true);
        familiesMenuMainLayoutBinding2.masksValue.setSelected(true);
        familiesMenuMainLayoutBinding2.oilsValue.setSelected(true);
        familiesMenuMainLayoutBinding2.armorValue.setSelected(true);
        familiesMenuMainLayoutBinding2.ammunitionValue.setSelected(true);
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding3 = this.binding;
        if (familiesMenuMainLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuMainLayoutBinding = familiesMenuMainLayoutBinding3;
        }
        ConstraintLayout root = familiesMenuMainLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void addItemsInMenu() {
        List<FamilyMainItemData> list = this.menuList;
        list.clear();
        list.add(new FamilyMainItemData(1, "Настройка семьи", false, 4, null));
        list.add(new FamilyMainItemData(2, "Управление семьей", false, 4, null));
        list.add(new FamilyMainItemData(3, "Склад", false, 4, null));
        list.add(new FamilyMainItemData(7, "Улучшения", false, 4, null));
        list.add(new FamilyMainItemData(6, "Автопарк", false, 4, null));
        list.add(new FamilyMainItemData(4, "Семейные логи", false, 4, null));
        list.add(new FamilyMainItemData(5, "Черный список", false, 4, null));
        list.add(new FamilyMainItemData(8, "Покинуть семью", false, 4, null));
    }

    /* compiled from: UIMenuMain.kt */
    @Metadata(m7104d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ!\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuMain$setLogicForMenuClick$1", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyMainItemData;", "Lkotlin/ParameterName;", "name", "item", "", "position", "Landroid/view/View;", "mView", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuMainList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuMain$setLogicForMenuClick$1 */

    public static final class C40351 implements Function3<FamilyMainItemData, Integer, View, Unit> {
        public C40351() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) throws JSONException {
            invoke(familyMainItemData, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) throws JSONException {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(mView, "mView");
            if (System.currentTimeMillis() - UIMenuMain.this.oldTimer > 2000) {
                UIMenuMain.this.oldTimer = System.currentTimeMillis();
                int itemsId = item.getItemsId();
                if (itemsId == 3) {
                    UIMenuMain.this.mainRoot.listenerLayout(11);
                    return;
                }
                if (itemsId == 6) {
                    ActionsWithJSON actionsWithJSON = UIMenuMain.this.actionsWithJSON;
                    if (actionsWithJSON != null) {
                        actionsWithJSON.sendGetLayout(2);
                    }
                    UIMenuMain.this.mainRoot.setIfFromMainMenuForCarPark(false);
                    return;
                }
                if (itemsId == 7) {
                    ActionsWithJSON actionsWithJSON2 = UIMenuMain.this.actionsWithJSON;
                    if (actionsWithJSON2 != null) {
                        actionsWithJSON2.sendGetLayout(4);
                    }
                    UIMenuMain.this.mainRoot.setIfFromMainMenuForUpgrade(false);
                    return;
                }
                if (itemsId != 8) {
                    ActionsWithJSON actionsWithJSON3 = UIMenuMain.this.actionsWithJSON;
                    if (actionsWithJSON3 != null) {
                        actionsWithJSON3.setMenuPosition(item.getItemsId());
                        return;
                    }
                    return;
                }
                LogicForDialogApply logicForDialogApply = UIMenuMain.this.logicForDialogApply;
                if (logicForDialogApply != null) {
                    logicForDialogApply.showDialog(null, null, Boolean.TRUE, null);
                }
            }
        }
    }

    public final void setLogicForMenuClick() {
        this.onClickMenuMainList = new Function3<FamilyMainItemData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuMain.setLogicForMenuClick.1
            public C40351() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) throws JSONException {
                invoke(familyMainItemData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(mView, "mView");
                if (System.currentTimeMillis() - UIMenuMain.this.oldTimer > 2000) {
                    UIMenuMain.this.oldTimer = System.currentTimeMillis();
                    int itemsId = item.getItemsId();
                    if (itemsId == 3) {
                        UIMenuMain.this.mainRoot.listenerLayout(11);
                        return;
                    }
                    if (itemsId == 6) {
                        ActionsWithJSON actionsWithJSON = UIMenuMain.this.actionsWithJSON;
                        if (actionsWithJSON != null) {
                            actionsWithJSON.sendGetLayout(2);
                        }
                        UIMenuMain.this.mainRoot.setIfFromMainMenuForCarPark(false);
                        return;
                    }
                    if (itemsId == 7) {
                        ActionsWithJSON actionsWithJSON2 = UIMenuMain.this.actionsWithJSON;
                        if (actionsWithJSON2 != null) {
                            actionsWithJSON2.sendGetLayout(4);
                        }
                        UIMenuMain.this.mainRoot.setIfFromMainMenuForUpgrade(false);
                        return;
                    }
                    if (itemsId != 8) {
                        ActionsWithJSON actionsWithJSON3 = UIMenuMain.this.actionsWithJSON;
                        if (actionsWithJSON3 != null) {
                            actionsWithJSON3.setMenuPosition(item.getItemsId());
                            return;
                        }
                        return;
                    }
                    LogicForDialogApply logicForDialogApply = UIMenuMain.this.logicForDialogApply;
                    if (logicForDialogApply != null) {
                        logicForDialogApply.showDialog(null, null, Boolean.TRUE, null);
                    }
                }
            }
        };
    }

    private final void setDataInView() {
        List<FamilyMainItemData> list = this.menuList;
        Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> function3 = this.onClickMenuMainList;
        FamilyMenuMainAdapter familyMenuMainAdapter = null;
        if (function3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickMenuMainList");
            function3 = null;
        }
        this.menuAdapter = new FamilyMenuMainAdapter(list, function3, this.mainActivity);
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding = this.binding;
        if (familiesMenuMainLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuMainLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesMenuMainLayoutBinding.menuList;
        FamiliesMenuMainLayoutBinding familiesMenuMainLayoutBinding2 = this.binding;
        if (familiesMenuMainLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuMainLayoutBinding2 = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesMenuMainLayoutBinding2.getRoot().getContext(), 1, false));
        FamilyMenuMainAdapter familyMenuMainAdapter2 = this.menuAdapter;
        if (familyMenuMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        } else {
            familyMenuMainAdapter = familyMenuMainAdapter2;
        }
        recyclerView.setAdapter(familyMenuMainAdapter);
    }
}

