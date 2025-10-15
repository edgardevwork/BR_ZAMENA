package com.blackhub.bronline.game.gui.familysystem;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesMenuFamilySettingLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyMenuFamilySettingAdapter;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyMenuMainAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyMainItemData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyRankOrColorData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemColorsObj;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMenuFamilySetting.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u00102\u001a\u00020'2\u0006\u0010-\u001a\u00020\u0013H\u0002J\b\u00103\u001a\u00020*H\u0016J\u001a\u00104\u001a\u00020*2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020'H\u0016J\b\u0010:\u001a\u00020'H\u0016J\b\u0010;\u001a\u00020'H\u0002J\b\u0010<\u001a\u00020'H\u0002J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020'H\u0002J\u0006\u0010?\u001a\u00020'J*\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020\u00132\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130\nJ\u0010\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020\u0013H\u0002J\u0010\u0010F\u001a\u00020'2\u0006\u0010E\u001a\u00020\u0013H\u0002J&\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u0013J\u000e\u0010L\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010M\u001a\u00020'2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003J\u000e\u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000RW\u0010 \u001aK\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0!j\u0002`(X\u0082.¢\u0006\u0002\n\u0000RW\u0010)\u001aK\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110*¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020'0!j\u0002`,X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006Q"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/UIMenuFamilySetting;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;", "mainActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/familysystem/network/ActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;Lcom/blackhub/bronline/game/core/JNIActivity;Lcom/blackhub/bronline/game/gui/familysystem/network/ActionsWithJSON;)V", "adaptersCollection", "", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyRankOrColorData;", "allColorsFromServer", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemColorsObj;", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesMenuFamilySettingLayoutBinding;", "currentRankId", "", "familyAccess", "familyAccessInt", "familyChatsColors", "familyRanks", "familySettingAdapter", "Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyMenuFamilySettingAdapter;", "menuAdapter", "Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyMenuMainAdapter;", "menuList", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyMainItemData;", "newRankName", "", "onClickMenuFamilyList", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "item", "position", "clicksType", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuFamilyList;", "onClickMenuMainList", "Landroid/view/View;", "mView", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuMainList;", "ranksPosition", "getRanksPosition", "()I", "setRanksPosition", "(I)V", "getActualAccess", "getView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "onLayoutShown", "setAccess", "setDataInView", "setLogicForOnClickMenuFamilyList", "setLogicForOnClickMenuMainList", "setNullableParameters", "setStartData", SVGParser.CURRENTCOLOR, "ranksNames", "ranksAccess", "setVisibleEditRanksName", "valueVisible", "setVisibleEditRanksText", "updateAccess", "ifTrueOperation", "oldAccessPosition", "oldRanksPosition", "newAccessStatus", "updateRankName", "updateRightBlock", "newCollection", "updateStartColor", "oldPosition", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUIMenuFamilySetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIMenuFamilySetting.kt\ncom/blackhub/bronline/game/gui/familysystem/UIMenuFamilySetting\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
/* loaded from: classes3.dex */
public final class UIMenuFamilySetting extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;

    @NotNull
    public final List<FamilyRankOrColorData> adaptersCollection;

    @Nullable
    public final List<FamilySystemColorsObj> allColorsFromServer;

    @Nullable
    public Animation anim;
    public FamiliesMenuFamilySettingLayoutBinding binding;
    public int currentRankId;

    @NotNull
    public final List<FamilyRankOrColorData> familyAccess;

    @NotNull
    public final List<Integer> familyAccessInt;

    @NotNull
    public final List<FamilyRankOrColorData> familyChatsColors;

    @NotNull
    public final List<FamilyRankOrColorData> familyRanks;
    public FamilyMenuFamilySettingAdapter familySettingAdapter;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;
    public FamilyMenuMainAdapter menuAdapter;

    @NotNull
    public final List<FamilyMainItemData> menuList;

    @NotNull
    public String newRankName;
    public Function3<? super FamilyRankOrColorData, ? super Integer, ? super Integer, Unit> onClickMenuFamilyList;
    public Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> onClickMenuMainList;
    public int ranksPosition;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMenuFamilySetting(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
        this.familyRanks = new ArrayList();
        this.familyAccess = new ArrayList();
        this.familyChatsColors = new ArrayList();
        this.adaptersCollection = new ArrayList();
        this.newRankName = "";
        this.familyAccessInt = new ArrayList();
        this.menuList = CollectionsKt__CollectionsKt.mutableListOf(new FamilyMainItemData(0, "Настройка рангов", true), new FamilyMainItemData(1, "Цвет чата семьи", false, 4, null));
        FamilySystemList familySystemListFromJson = mainRoot.getFamilySystemListFromJson();
        this.allColorsFromServer = familySystemListFromJson != null ? familySystemListFromJson.getColorsList() : null;
    }

    public final int getRanksPosition() {
        return this.ranksPosition;
    }

    public final void setRanksPosition(int i) {
        this.ranksPosition = i;
    }

    public final void setStartData(int i, @NotNull List<String> ranksNames, @NotNull List<Integer> ranksAccess) {
        Intrinsics.checkNotNullParameter(ranksNames, "ranksNames");
        Intrinsics.checkNotNullParameter(ranksAccess, "ranksAccess");
        this.familyRanks.clear();
        Iterator<String> it = ranksNames.iterator();
        while (it.hasNext()) {
            this.familyRanks.add(new FamilyRankOrColorData(0, it.next(), null, null, null, null));
        }
        List<Integer> list = this.familyAccessInt;
        list.clear();
        list.addAll(ranksAccess);
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = null;
        if (this.menuList.size() > 0) {
            int size = this.menuList.size();
            int i2 = 0;
            while (i2 < size) {
                this.menuList.get(i2).setClicked(i2 == 0);
                FamilyMenuMainAdapter familyMenuMainAdapter = this.menuAdapter;
                if (familyMenuMainAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
                    familyMenuMainAdapter = null;
                }
                familyMenuMainAdapter.notifyItemChanged(i2);
                i2++;
            }
        }
        List<FamilyRankOrColorData> list2 = this.familyChatsColors;
        list2.clear();
        List<FamilySystemColorsObj> list3 = this.allColorsFromServer;
        if (list3 != null) {
            for (FamilySystemColorsObj familySystemColorsObj : list3) {
                list2.add(new FamilyRankOrColorData(2, familySystemColorsObj.getTitle(), null, familySystemColorsObj.getColor(), Boolean.valueOf(familySystemColorsObj.getId() == i), Boolean.FALSE));
            }
        }
        setVisibleEditRanksName(4);
        setVisibleEditRanksText(4);
        this.currentRankId = 0;
        this.newRankName = "";
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding2;
        }
        familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка рангов");
        updateRightBlock(this.familyRanks);
    }

    public final void updateRankName(int currentRankId) {
        int i = currentRankId - 1;
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = null;
        if (familiesMenuFamilySettingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding = null;
        }
        if (Intrinsics.areEqual(this.newRankName, "")) {
            return;
        }
        familiesMenuFamilySettingLayoutBinding.titleRank.setText(this.newRankName);
        if (this.familyRanks.size() >= currentRankId) {
            int size = this.familyRanks.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 == i) {
                    this.familyRanks.get(i).setStatusName(this.newRankName);
                    FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter2 = this.familySettingAdapter;
                    if (familyMenuFamilySettingAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
                    } else {
                        familyMenuFamilySettingAdapter = familyMenuFamilySettingAdapter2;
                    }
                    familyMenuFamilySettingAdapter.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
        if (familiesMenuFamilySettingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding = null;
        }
        ConstraintLayout root = familiesMenuFamilySettingLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBindingInflate = FamiliesMenuFamilySettingLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesMenuFamilySettingLayoutBindingInflate, "inflate(...)");
        this.binding = familiesMenuFamilySettingLayoutBindingInflate;
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = null;
        if (familiesMenuFamilySettingLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesMenuFamilySettingLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        setAccess();
        setLogicForOnClickMenuFamilyList();
        setLogicForOnClickMenuMainList();
        setDataInView();
        final FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding2 = null;
        }
        familiesMenuFamilySettingLayoutBinding2.buttonBackToMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIMenuFamilySetting.onCreateView$lambda$6$lambda$3(this.f$0, view);
            }
        });
        familiesMenuFamilySettingLayoutBinding2.editRanksName.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMenuFamilySetting.onCreateView$lambda$6$lambda$4(this.f$0, view);
            }
        });
        familiesMenuFamilySettingLayoutBinding2.buttonApplyRename.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIMenuFamilySetting.onCreateView$lambda$6$lambda$5(this.f$0, familiesMenuFamilySettingLayoutBinding2, view);
            }
        });
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding3 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding3;
        }
        ConstraintLayout root = familiesMenuFamilySettingLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$6$lambda$3(UIMenuFamilySetting this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
        if (actionsWithJSON != null) {
            actionsWithJSON.sendGetLayout(5);
        }
    }

    public static final void onCreateView$lambda$6$lambda$4(UIMenuFamilySetting this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibleEditRanksName(4);
        this$0.setVisibleEditRanksText(0);
    }

    public static final void onCreateView$lambda$6$lambda$5(UIMenuFamilySetting this$0, FamiliesMenuFamilySettingLayoutBinding this_apply, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.setVisibleEditRanksText(4);
        this$0.setVisibleEditRanksName(0);
        Editable text = this_apply.editTextRankName.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() <= 0) {
            Intrinsics.checkNotNullExpressionValue(this_apply.editTextRankName.getText(), "getText(...)");
            if (!(!StringsKt__StringsJVMKt.isBlank(r3))) {
                return;
            }
        }
        if (this$0.currentRankId != 0) {
            String string = this_apply.editTextRankName.getText().toString();
            this$0.newRankName = string;
            ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
            if (actionsWithJSON != null) {
                actionsWithJSON.clickOnRank(this$0.currentRankId, string);
            }
        }
        this_apply.editTextRankName.getText().clear();
    }

    /* compiled from: UIMenuFamilySetting.kt */
    @Metadata(m7104d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096\u0002¨\u0006\f"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuFamilySetting$setLogicForOnClickMenuFamilyList$1", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyRankOrColorData;", "Lkotlin/ParameterName;", "name", "item", "", "position", "clicksType", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuFamilyList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting$setLogicForOnClickMenuFamilyList$1 */
    public static final class C40301 implements Function3<FamilyRankOrColorData, Integer, Integer, Unit> {
        public C40301() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FamilyRankOrColorData familyRankOrColorData, Integer num, Integer num2) throws JSONException {
            invoke(familyRankOrColorData, num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void invoke(@NotNull FamilyRankOrColorData item, int position, int clicksType) throws JSONException {
            ActionsWithJSON actionsWithJSON;
            Intrinsics.checkNotNullParameter(item, "item");
            if (clicksType == 0) {
                UIMenuFamilySetting.this.currentRankId = position + 1;
                UIMenuFamilySetting uIMenuFamilySetting = UIMenuFamilySetting.this;
                uIMenuFamilySetting.getActualAccess(uIMenuFamilySetting.currentRankId);
                return;
            }
            if (clicksType == 1) {
                if (item.getCurrentStatus() != null) {
                    Integer currentStatus = item.getCurrentStatus();
                    int i = (currentStatus == null || currentStatus.intValue() != 0) ? 0 : 1;
                    ActionsWithJSON actionsWithJSON2 = UIMenuFamilySetting.this.actionsWithJSON;
                    if (actionsWithJSON2 != null) {
                        actionsWithJSON2.clickOnAccess(UIMenuFamilySetting.this.currentRankId, position, i);
                        return;
                    }
                    return;
                }
                return;
            }
            if (clicksType != 2) {
                return;
            }
            if (item.isClicked() != null) {
                Boolean boolIsClicked = item.isClicked();
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(boolIsClicked, bool)) {
                    item.setClicked(bool);
                } else if (item.isClicked() != null && !Intrinsics.areEqual(item.getIfStartedColor(), Boolean.TRUE) && (actionsWithJSON = UIMenuFamilySetting.this.actionsWithJSON) != null) {
                    actionsWithJSON.setStartColor(position);
                }
            }
            FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = UIMenuFamilySetting.this.familySettingAdapter;
            if (familyMenuFamilySettingAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
                familyMenuFamilySettingAdapter = null;
            }
            familyMenuFamilySettingAdapter.notifyItemChanged(position);
            familyMenuFamilySettingAdapter.setCheckOnlyElement(position);
        }
    }

    public final void setLogicForOnClickMenuFamilyList() {
        this.onClickMenuFamilyList = new Function3<FamilyRankOrColorData, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting.setLogicForOnClickMenuFamilyList.1
            public C40301() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FamilyRankOrColorData familyRankOrColorData, Integer num, Integer num2) throws JSONException {
                invoke(familyRankOrColorData, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:56:0x0026  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void invoke(@NotNull FamilyRankOrColorData item, int position, int clicksType) throws JSONException {
                ActionsWithJSON actionsWithJSON;
                Intrinsics.checkNotNullParameter(item, "item");
                if (clicksType == 0) {
                    UIMenuFamilySetting.this.currentRankId = position + 1;
                    UIMenuFamilySetting uIMenuFamilySetting = UIMenuFamilySetting.this;
                    uIMenuFamilySetting.getActualAccess(uIMenuFamilySetting.currentRankId);
                    return;
                }
                if (clicksType == 1) {
                    if (item.getCurrentStatus() != null) {
                        Integer currentStatus = item.getCurrentStatus();
                        int i = (currentStatus == null || currentStatus.intValue() != 0) ? 0 : 1;
                        ActionsWithJSON actionsWithJSON2 = UIMenuFamilySetting.this.actionsWithJSON;
                        if (actionsWithJSON2 != null) {
                            actionsWithJSON2.clickOnAccess(UIMenuFamilySetting.this.currentRankId, position, i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (clicksType != 2) {
                    return;
                }
                if (item.isClicked() != null) {
                    Boolean boolIsClicked = item.isClicked();
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.areEqual(boolIsClicked, bool)) {
                        item.setClicked(bool);
                    } else if (item.isClicked() != null && !Intrinsics.areEqual(item.getIfStartedColor(), Boolean.TRUE) && (actionsWithJSON = UIMenuFamilySetting.this.actionsWithJSON) != null) {
                        actionsWithJSON.setStartColor(position);
                    }
                }
                FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = UIMenuFamilySetting.this.familySettingAdapter;
                if (familyMenuFamilySettingAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
                    familyMenuFamilySettingAdapter = null;
                }
                familyMenuFamilySettingAdapter.notifyItemChanged(position);
                familyMenuFamilySettingAdapter.setCheckOnlyElement(position);
            }
        };
    }

    public final void getActualAccess(int ranksPosition) {
        String statusName;
        if (this.familyAccessInt.size() == 6) {
            int size = this.familyAccess.size();
            for (int i = 0; i < size; i++) {
                if (this.familyAccessInt.get(i).intValue() <= ranksPosition) {
                    this.familyAccess.get(i).setCurrentStatus(1);
                } else {
                    this.familyAccess.get(i).setCurrentStatus(0);
                }
            }
            updateRightBlock(this.familyAccess);
            setVisibleEditRanksName(0);
            setVisibleEditRanksText(4);
            int i2 = ranksPosition - 1;
            if (this.familyRanks.size() > i2) {
                statusName = this.familyRanks.get(i2).getStatusName();
            } else {
                statusName = "";
            }
            FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
            FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = null;
            if (familiesMenuFamilySettingLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                familiesMenuFamilySettingLayoutBinding = null;
            }
            familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка —");
            FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding3 = this.binding;
            if (familiesMenuFamilySettingLayoutBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesMenuFamilySettingLayoutBinding2 = familiesMenuFamilySettingLayoutBinding3;
            }
            familiesMenuFamilySettingLayoutBinding2.titleRank.setText(statusName);
        }
    }

    public final void setVisibleEditRanksName(int valueVisible) {
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
        if (familiesMenuFamilySettingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding = null;
        }
        familiesMenuFamilySettingLayoutBinding.titleRank.setVisibility(valueVisible);
        familiesMenuFamilySettingLayoutBinding.editRanksName.setVisibility(valueVisible);
    }

    public final void setVisibleEditRanksText(int valueVisible) {
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
        if (familiesMenuFamilySettingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding = null;
        }
        familiesMenuFamilySettingLayoutBinding.editTextRankName.setVisibility(valueVisible);
        familiesMenuFamilySettingLayoutBinding.buttonApplyRename.setVisibility(valueVisible);
    }

    /* compiled from: UIMenuFamilySetting.kt */
    @Metadata(m7104d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ!\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuFamilySetting$setLogicForOnClickMenuMainList$1", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyMainItemData;", "Lkotlin/ParameterName;", "name", "item", "", "position", "Landroid/view/View;", "mView", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuMainList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting$setLogicForOnClickMenuMainList$1 */
    /* loaded from: classes2.dex */
    public static final class C40311 implements Function3<FamilyMainItemData, Integer, View, Unit> {
        public C40311() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) {
            invoke(familyMainItemData, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(mView, "mView");
            mView.startAnimation(UIMenuFamilySetting.this.anim);
            item.setClicked(true);
            FamilyMenuMainAdapter familyMenuMainAdapter = UIMenuFamilySetting.this.menuAdapter;
            FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = null;
            if (familyMenuMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
                familyMenuMainAdapter = null;
            }
            familyMenuMainAdapter.notifyItemChanged(position);
            familyMenuMainAdapter.setCheckOnlyElement(position);
            UIMenuFamilySetting.this.setVisibleEditRanksName(4);
            UIMenuFamilySetting.this.setVisibleEditRanksText(4);
            UIMenuFamilySetting.this.adaptersCollection.clear();
            if (position == 0) {
                FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = UIMenuFamilySetting.this.binding;
                if (familiesMenuFamilySettingLayoutBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding2;
                }
                familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка рангов");
                UIMenuFamilySetting uIMenuFamilySetting = UIMenuFamilySetting.this;
                uIMenuFamilySetting.updateRightBlock(uIMenuFamilySetting.familyRanks);
                return;
            }
            if (position != 1) {
                return;
            }
            FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding3 = UIMenuFamilySetting.this.binding;
            if (familiesMenuFamilySettingLayoutBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding3;
            }
            familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка цвета чата");
            UIMenuFamilySetting uIMenuFamilySetting2 = UIMenuFamilySetting.this;
            uIMenuFamilySetting2.updateRightBlock(uIMenuFamilySetting2.familyChatsColors);
        }
    }

    public final void setLogicForOnClickMenuMainList() {
        this.onClickMenuMainList = new Function3<FamilyMainItemData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilySetting.setLogicForOnClickMenuMainList.1
            public C40311() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) {
                invoke(familyMainItemData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(mView, "mView");
                mView.startAnimation(UIMenuFamilySetting.this.anim);
                item.setClicked(true);
                FamilyMenuMainAdapter familyMenuMainAdapter = UIMenuFamilySetting.this.menuAdapter;
                FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = null;
                if (familyMenuMainAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
                    familyMenuMainAdapter = null;
                }
                familyMenuMainAdapter.notifyItemChanged(position);
                familyMenuMainAdapter.setCheckOnlyElement(position);
                UIMenuFamilySetting.this.setVisibleEditRanksName(4);
                UIMenuFamilySetting.this.setVisibleEditRanksText(4);
                UIMenuFamilySetting.this.adaptersCollection.clear();
                if (position == 0) {
                    FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = UIMenuFamilySetting.this.binding;
                    if (familiesMenuFamilySettingLayoutBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding2;
                    }
                    familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка рангов");
                    UIMenuFamilySetting uIMenuFamilySetting = UIMenuFamilySetting.this;
                    uIMenuFamilySetting.updateRightBlock(uIMenuFamilySetting.familyRanks);
                    return;
                }
                if (position != 1) {
                    return;
                }
                FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding3 = UIMenuFamilySetting.this.binding;
                if (familiesMenuFamilySettingLayoutBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    familiesMenuFamilySettingLayoutBinding = familiesMenuFamilySettingLayoutBinding3;
                }
                familiesMenuFamilySettingLayoutBinding.titleRightBlock.setText("Настройка цвета чата");
                UIMenuFamilySetting uIMenuFamilySetting2 = UIMenuFamilySetting.this;
                uIMenuFamilySetting2.updateRightBlock(uIMenuFamilySetting2.familyChatsColors);
            }
        };
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateRightBlock(List<FamilyRankOrColorData> newCollection) {
        List<FamilyRankOrColorData> list = this.adaptersCollection;
        list.clear();
        list.addAll(newCollection);
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = this.familySettingAdapter;
        if (familyMenuFamilySettingAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
            familyMenuFamilySettingAdapter = null;
        }
        familyMenuFamilySettingAdapter.notifyDataSetChanged();
    }

    private final void setDataInView() {
        JNIActivity jNIActivity = this.mainActivity;
        List<FamilyRankOrColorData> list = this.adaptersCollection;
        Function3<? super FamilyRankOrColorData, ? super Integer, ? super Integer, Unit> function3 = this.onClickMenuFamilyList;
        FamilyMenuMainAdapter familyMenuMainAdapter = null;
        if (function3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickMenuFamilyList");
            function3 = null;
        }
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = new FamilyMenuFamilySettingAdapter(jNIActivity, list, function3);
        this.familySettingAdapter = familyMenuFamilySettingAdapter;
        familyMenuFamilySettingAdapter.setHasStableIds(true);
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding = this.binding;
        if (familiesMenuFamilySettingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesMenuFamilySettingLayoutBinding.ranksOrChatsColorSetting;
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding2 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding2 = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesMenuFamilySettingLayoutBinding2.getRoot().getContext(), 1, false));
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter2 = this.familySettingAdapter;
        if (familyMenuFamilySettingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
            familyMenuFamilySettingAdapter2 = null;
        }
        recyclerView.setAdapter(familyMenuFamilySettingAdapter2);
        List<FamilySystemColorsObj> list2 = this.allColorsFromServer;
        if (list2 != null) {
            recyclerView.setItemViewCacheSize(list2.size());
        }
        List<FamilyMainItemData> list3 = this.menuList;
        Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> function32 = this.onClickMenuMainList;
        if (function32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickMenuMainList");
            function32 = null;
        }
        this.menuAdapter = new FamilyMenuMainAdapter(list3, function32, this.mainActivity);
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding3 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding3 = null;
        }
        RecyclerView recyclerView2 = familiesMenuFamilySettingLayoutBinding3.menuList;
        FamiliesMenuFamilySettingLayoutBinding familiesMenuFamilySettingLayoutBinding4 = this.binding;
        if (familiesMenuFamilySettingLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuFamilySettingLayoutBinding4 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(familiesMenuFamilySettingLayoutBinding4.getRoot().getContext(), 1, false));
        FamilyMenuMainAdapter familyMenuMainAdapter2 = this.menuAdapter;
        if (familyMenuMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        } else {
            familyMenuMainAdapter = familyMenuMainAdapter2;
        }
        recyclerView2.setAdapter(familyMenuMainAdapter);
    }

    public final void setAccess() {
        List<FamilyRankOrColorData> list = this.familyAccess;
        list.clear();
        list.add(new FamilyRankOrColorData(1, "принять игрока", 0, null, null, null));
        list.add(new FamilyRankOrColorData(1, "выгнать игрока", 0, null, null, null));
        list.add(new FamilyRankOrColorData(1, "изменить ранг", 0, null, null, null));
        list.add(new FamilyRankOrColorData(1, "выдать мут", 0, null, null, null));
        list.add(new FamilyRankOrColorData(1, "участия в войне семей", 0, null, null, null));
        list.add(new FamilyRankOrColorData(1, "складу", 0, null, null, null));
    }

    public final void updateStartColor(int oldPosition) {
        if (this.familyChatsColors.size() > oldPosition && this.familyChatsColors.get(oldPosition).getIfStartedColor() != null) {
            this.familyChatsColors.get(oldPosition).setIfStartedColor(Boolean.TRUE);
        }
        if (this.adaptersCollection.size() <= oldPosition || this.adaptersCollection.get(oldPosition).getIfStartedColor() == null) {
            return;
        }
        this.adaptersCollection.get(oldPosition).setIfStartedColor(Boolean.TRUE);
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = this.familySettingAdapter;
        if (familyMenuFamilySettingAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
            familyMenuFamilySettingAdapter = null;
        }
        familyMenuFamilySettingAdapter.notifyItemChanged(oldPosition);
        familyMenuFamilySettingAdapter.setOnlyStartColor(oldPosition);
    }

    public final void updateAccess(int ifTrueOperation, int oldAccessPosition, int oldRanksPosition, int newAccessStatus) {
        FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter = null;
        if (ifTrueOperation == 0) {
            if (this.adaptersCollection.size() > oldAccessPosition && this.adaptersCollection.get(oldAccessPosition).getCurrentStatus() != null) {
                FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter2 = this.familySettingAdapter;
                if (familyMenuFamilySettingAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
                } else {
                    familyMenuFamilySettingAdapter = familyMenuFamilySettingAdapter2;
                }
                familyMenuFamilySettingAdapter.notifyItemChanged(oldAccessPosition);
            }
            if (this.familyAccessInt.size() > oldAccessPosition) {
                this.familyAccessInt.get(oldAccessPosition);
                return;
            }
            return;
        }
        if (ifTrueOperation != 1) {
            return;
        }
        if (this.adaptersCollection.size() > oldAccessPosition && this.adaptersCollection.get(oldAccessPosition).getCurrentStatus() != null) {
            this.adaptersCollection.get(oldAccessPosition).setCurrentStatus(Integer.valueOf(newAccessStatus));
            FamilyMenuFamilySettingAdapter familyMenuFamilySettingAdapter3 = this.familySettingAdapter;
            if (familyMenuFamilySettingAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("familySettingAdapter");
            } else {
                familyMenuFamilySettingAdapter = familyMenuFamilySettingAdapter3;
            }
            familyMenuFamilySettingAdapter.notifyItemChanged(oldAccessPosition);
        }
        if (this.familyAccessInt.size() > oldAccessPosition) {
            if (newAccessStatus == 0) {
                this.familyAccessInt.set(oldAccessPosition, 5);
            } else {
                this.familyAccessInt.set(oldAccessPosition, Integer.valueOf(oldRanksPosition));
            }
        }
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.familyRanks.clear();
        this.familyAccess.clear();
        this.familyChatsColors.clear();
        this.adaptersCollection.clear();
    }
}
