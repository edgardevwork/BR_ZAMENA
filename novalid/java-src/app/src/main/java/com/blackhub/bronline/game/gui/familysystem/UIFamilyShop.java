package com.blackhub.bronline.game.gui.familysystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesShopLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyShopAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemShopObj;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIFamilyShop.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0006\u0010'\u001a\u00020\u0018J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0011J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\u0006\u0010-\u001a\u00020\u0018R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013j\u0004\u0018\u0001`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/UIFamilyShop;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;", "mainActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "logicForDialogApply", "Lcom/blackhub/bronline/game/gui/familysystem/LogicForDialogApply;", "(Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;Lcom/blackhub/bronline/game/core/JNIActivity;Lcom/blackhub/bronline/game/gui/familysystem/LogicForDialogApply;)V", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesShopLayoutBinding;", "currentItems", "", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemShopObj;", "itemsId", "", "onClickItemInShopList", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thisItem", "position", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickItemInShopList;", "shopAdapter", "Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyShopAdapter;", "getView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "onLayoutShown", "setDataInView", "setLogicForClickItemInShop", "setNullableParameters", "setStartParameters", "familyStatus", "setVisibleForSyndicateItemAndUncheck", "ifLeader", "uncheckItems", "updateAfterPurchase", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class UIFamilyShop extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public Animation anim;
    public FamiliesShopLayoutBinding binding;

    @NotNull
    public final List<FamilySystemShopObj> currentItems;
    public int itemsId;

    @Nullable
    public final LogicForDialogApply logicForDialogApply;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    @Nullable
    public Function2<? super FamilySystemShopObj, ? super Integer, Unit> onClickItemInShopList;

    @Nullable
    public FamilyShopAdapter shopAdapter;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIFamilyShop(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable LogicForDialogApply logicForDialogApply) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.logicForDialogApply = logicForDialogApply;
        this.currentItems = new ArrayList();
        this.itemsId = -1;
    }

    public final void setStartParameters(int familyStatus) {
        this.itemsId = -1;
        uncheckItems();
        setDataInView();
        setVisibleForSyndicateItemAndUncheck(familyStatus, this.mainRoot.getIfLeader());
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesShopLayoutBinding familiesShopLayoutBinding = this.binding;
        if (familiesShopLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesShopLayoutBinding = null;
        }
        ConstraintLayout root = familiesShopLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesShopLayoutBinding familiesShopLayoutBindingInflate = FamiliesShopLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesShopLayoutBindingInflate, "inflate(...)");
        this.binding = familiesShopLayoutBindingInflate;
        FamiliesShopLayoutBinding familiesShopLayoutBinding = null;
        if (familiesShopLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesShopLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesShopLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        List<FamilySystemShopObj> list = this.currentItems;
        list.clear();
        FamilySystemList familySystemListFromJson = this.mainRoot.getFamilySystemListFromJson();
        if (familySystemListFromJson != null) {
            list.addAll(familySystemListFromJson.getShopList());
        }
        setLogicForClickItemInShop();
        FamiliesShopLayoutBinding familiesShopLayoutBinding2 = this.binding;
        if (familiesShopLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesShopLayoutBinding = familiesShopLayoutBinding2;
        }
        ConstraintLayout root = familiesShopLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* compiled from: UIFamilyShop.kt */
    @Metadata(m7104d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIFamilyShop$setLogicForClickItemInShop$1", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemShopObj;", "Lkotlin/ParameterName;", "name", "thisItem", "", "position", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickItemInShopList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIFamilyShop$setLogicForClickItemInShop$1 */
    public static final class C40201 implements Function2<FamilySystemShopObj, Integer, Unit> {
        public C40201() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FamilySystemShopObj familySystemShopObj, Integer num) {
            invoke(familySystemShopObj, num.intValue());
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilySystemShopObj thisItem, int position) {
            Intrinsics.checkNotNullParameter(thisItem, "thisItem");
            if (UIFamilyShop.this.itemsId == thisItem.getId()) {
                LogicForDialogApply logicForDialogApply = UIFamilyShop.this.logicForDialogApply;
                if (logicForDialogApply != null) {
                    logicForDialogApply.showDialog(thisItem, null, null, null);
                    return;
                }
                return;
            }
            thisItem.setClicked(true);
            FamilyShopAdapter familyShopAdapter = UIFamilyShop.this.shopAdapter;
            if (familyShopAdapter != null) {
                familyShopAdapter.notifyItemChanged(position);
                familyShopAdapter.setCheckOnlyElement(position);
            }
            UIFamilyShop.this.itemsId = thisItem.getId();
        }
    }

    public final void setLogicForClickItemInShop() {
        this.onClickItemInShopList = new Function2<FamilySystemShopObj, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyShop.setLogicForClickItemInShop.1
            public C40201() {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FamilySystemShopObj familySystemShopObj, Integer num) {
                invoke(familySystemShopObj, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilySystemShopObj thisItem, int position) {
                Intrinsics.checkNotNullParameter(thisItem, "thisItem");
                if (UIFamilyShop.this.itemsId == thisItem.getId()) {
                    LogicForDialogApply logicForDialogApply = UIFamilyShop.this.logicForDialogApply;
                    if (logicForDialogApply != null) {
                        logicForDialogApply.showDialog(thisItem, null, null, null);
                        return;
                    }
                    return;
                }
                thisItem.setClicked(true);
                FamilyShopAdapter familyShopAdapter = UIFamilyShop.this.shopAdapter;
                if (familyShopAdapter != null) {
                    familyShopAdapter.notifyItemChanged(position);
                    familyShopAdapter.setCheckOnlyElement(position);
                }
                UIFamilyShop.this.itemsId = thisItem.getId();
            }
        };
    }

    private final void setDataInView() {
        this.shopAdapter = new FamilyShopAdapter(this.currentItems, this.onClickItemInShopList);
        FamiliesShopLayoutBinding familiesShopLayoutBinding = this.binding;
        FamiliesShopLayoutBinding familiesShopLayoutBinding2 = null;
        if (familiesShopLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesShopLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesShopLayoutBinding.marketList;
        FamiliesShopLayoutBinding familiesShopLayoutBinding3 = this.binding;
        if (familiesShopLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesShopLayoutBinding2 = familiesShopLayoutBinding3;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(familiesShopLayoutBinding2.getRoot().getContext(), 3));
        recyclerView.setAdapter(this.shopAdapter);
    }

    public final void uncheckItems() {
        for (FamilySystemShopObj familySystemShopObj : this.currentItems) {
            if (familySystemShopObj.isClicked()) {
                familySystemShopObj.setClicked(false);
            }
        }
    }

    public final void setVisibleForSyndicateItemAndUncheck(int familyStatus, int ifLeader) {
        if (familyStatus == 1 || ifLeader == 0) {
            int size = this.currentItems.size();
            for (int i = 0; i < size; i++) {
                if (this.currentItems.get(i).getTypeId() == 4) {
                    this.currentItems.remove(i);
                    FamilyShopAdapter familyShopAdapter = this.shopAdapter;
                    if (familyShopAdapter != null) {
                        familyShopAdapter.notifyItemRemoved(i);
                    }
                }
            }
        }
    }

    public final void updateAfterPurchase() {
        if (this.itemsId == 8) {
            this.mainRoot.setFamilyStatus(1);
            setVisibleForSyndicateItemAndUncheck(1, this.mainRoot.getIfLeader());
            this.itemsId = -1;
        }
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.shopAdapter = null;
        this.onClickItemInShopList = null;
        this.currentItems.clear();
    }
}
