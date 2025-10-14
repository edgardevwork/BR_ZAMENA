package com.blackhub.bronline.game.gui.familysystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesMenuTheStoreOrTheSafeLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyMenuMainAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyMainItemData;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMenuFamilyStore.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UIMenuFamilyStore extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;

    @Nullable
    public Animation anim;
    public FamiliesMenuTheStoreOrTheSafeLayoutBinding binding;

    @Nullable
    public final JNIActivity mainActivity;

    @Nullable
    public FamilyMenuMainAdapter menuAdapter;
    public long oldTimerForClick;

    @Nullable
    public Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> onClickMenuList;

    @NotNull
    public final List<FamilyMainItemData> menuList = new ArrayList();
    public int currentStore = -1;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMenuFamilyStore(@Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
    }

    public final void setStartParameters(@NotNull List<Integer> otherState) {
        Intrinsics.checkNotNullParameter(otherState, "otherState");
        if (this.menuList.size() > 0) {
            int size = this.menuList.size();
            int i = 0;
            while (i < size) {
                this.menuList.get(i).setClicked(i == 0);
                FamilyMenuMainAdapter familyMenuMainAdapter = this.menuAdapter;
                if (familyMenuMainAdapter != null) {
                    familyMenuMainAdapter.notifyItemChanged(i);
                }
                i++;
            }
            this.currentStore = this.menuList.get(0).getItemsId();
            setVisibleForInfo(0);
            setTitle(this.menuList.get(0).getItemsTitle());
            FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
            if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                familiesMenuTheStoreOrTheSafeLayoutBinding = null;
            }
            familiesMenuTheStoreOrTheSafeLayoutBinding.buttonGoToTheContents.setVisibility(0);
        }
        if (otherState.size() == 12) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(otherState.get(0));
            arrayList.add(otherState.get(2));
            arrayList.add(otherState.get(4));
            arrayList.add(otherState.get(6));
            arrayList.add(otherState.get(8));
            setDescriptionForStore(arrayList);
        }
    }

    public final void updateParameters(@NotNull List<Integer> newParameters) {
        Intrinsics.checkNotNullParameter(newParameters, "newParameters");
        setDescriptionForStore(newParameters);
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        }
        ConstraintLayout root = familiesMenuTheStoreOrTheSafeLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBindingInflate = FamiliesMenuTheStoreOrTheSafeLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesMenuTheStoreOrTheSafeLayoutBindingInflate, "inflate(...)");
        this.binding = familiesMenuTheStoreOrTheSafeLayoutBindingInflate;
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        if (familiesMenuTheStoreOrTheSafeLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesMenuTheStoreOrTheSafeLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        setDataInMenu();
        setLogicForClickOnMenuList();
        setDataInView();
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding2 = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding2 = null;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding2.buttonGoToTheContents.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyStore$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMenuFamilyStore.onCreateView$lambda$2(this.f$0, view);
            }
        });
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding3 = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding3 = null;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding3.buttonBackToMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyStore$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIMenuFamilyStore.onCreateView$lambda$3(this.f$0, view);
            }
        });
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding4 = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding4 = null;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding4.allMoneyValue.setSelected(true);
        familiesMenuTheStoreOrTheSafeLayoutBinding4.materialsValue.setSelected(true);
        familiesMenuTheStoreOrTheSafeLayoutBinding4.masksValue.setSelected(true);
        familiesMenuTheStoreOrTheSafeLayoutBinding4.oilValue.setSelected(true);
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding5 = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuTheStoreOrTheSafeLayoutBinding = familiesMenuTheStoreOrTheSafeLayoutBinding5;
        }
        ConstraintLayout root = familiesMenuTheStoreOrTheSafeLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$2(final UIMenuFamilyStore this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animation = this$0.anim;
        if (animation != null) {
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyStore$onCreateView$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                    if (actionsWithJSON != null) {
                        actionsWithJSON.setClickOnStore(this.this$0.currentStore);
                    }
                }
            });
        }
        view.startAnimation(this$0.anim);
    }

    public static final void onCreateView$lambda$3(UIMenuFamilyStore this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
        if (actionsWithJSON != null) {
            actionsWithJSON.sendGetLayout(5);
        }
    }

    /* compiled from: UIMenuFamilyStore.kt */
    @Metadata(m7104d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ!\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuFamilyStore$setLogicForClickOnMenuList$1", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyMainItemData;", "Lkotlin/ParameterName;", "name", "item", "", "position", "Landroid/view/View;", "mView", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuMainList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyStore$setLogicForClickOnMenuList$1 */

    public static final class C40321 implements Function3<FamilyMainItemData, Integer, View, Unit> {
        public C40321() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) {
            invoke(familyMainItemData, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(mView, "mView");
            if (System.currentTimeMillis() - UIMenuFamilyStore.this.oldTimerForClick > 200) {
                UIMenuFamilyStore.this.oldTimerForClick = System.currentTimeMillis();
                mView.startAnimation(UIMenuFamilyStore.this.anim);
                UIMenuFamilyStore.this.currentStore = item.getItemsId();
                item.setClicked(true);
                FamilyMenuMainAdapter familyMenuMainAdapter = UIMenuFamilyStore.this.menuAdapter;
                if (familyMenuMainAdapter != null) {
                    familyMenuMainAdapter.notifyItemChanged(position);
                    familyMenuMainAdapter.setCheckOnlyElement(position);
                }
                int itemsId = item.getItemsId();
                FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = null;
                if (itemsId == 0) {
                    FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding2 = UIMenuFamilyStore.this.binding;
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        familiesMenuTheStoreOrTheSafeLayoutBinding2 = null;
                    }
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding2.titleContentsOfTheSafe.getVisibility() == 4) {
                        UIMenuFamilyStore.this.setVisibleForInfo(0);
                    }
                } else if (itemsId == 1) {
                    FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding3 = UIMenuFamilyStore.this.binding;
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        familiesMenuTheStoreOrTheSafeLayoutBinding3 = null;
                    }
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding3.titleContentsOfTheSafe.getVisibility() == 0) {
                        UIMenuFamilyStore.this.setVisibleForInfo(4);
                    }
                }
                UIMenuFamilyStore.this.setTitle(item.getItemsTitle());
                FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding4 = UIMenuFamilyStore.this.binding;
                if (familiesMenuTheStoreOrTheSafeLayoutBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    familiesMenuTheStoreOrTheSafeLayoutBinding4 = null;
                }
                if (familiesMenuTheStoreOrTheSafeLayoutBinding4.buttonGoToTheContents.getVisibility() == 4) {
                    FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding5 = UIMenuFamilyStore.this.binding;
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        familiesMenuTheStoreOrTheSafeLayoutBinding = familiesMenuTheStoreOrTheSafeLayoutBinding5;
                    }
                    familiesMenuTheStoreOrTheSafeLayoutBinding.buttonGoToTheContents.setVisibility(0);
                }
            }
        }
    }

    public final void setLogicForClickOnMenuList() {
        this.onClickMenuList = new Function3<FamilyMainItemData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuFamilyStore.setLogicForClickOnMenuList.1
            public C40321() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) {
                invoke(familyMainItemData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(mView, "mView");
                if (System.currentTimeMillis() - UIMenuFamilyStore.this.oldTimerForClick > 200) {
                    UIMenuFamilyStore.this.oldTimerForClick = System.currentTimeMillis();
                    mView.startAnimation(UIMenuFamilyStore.this.anim);
                    UIMenuFamilyStore.this.currentStore = item.getItemsId();
                    item.setClicked(true);
                    FamilyMenuMainAdapter familyMenuMainAdapter = UIMenuFamilyStore.this.menuAdapter;
                    if (familyMenuMainAdapter != null) {
                        familyMenuMainAdapter.notifyItemChanged(position);
                        familyMenuMainAdapter.setCheckOnlyElement(position);
                    }
                    int itemsId = item.getItemsId();
                    FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = null;
                    if (itemsId == 0) {
                        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding2 = UIMenuFamilyStore.this.binding;
                        if (familiesMenuTheStoreOrTheSafeLayoutBinding2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            familiesMenuTheStoreOrTheSafeLayoutBinding2 = null;
                        }
                        if (familiesMenuTheStoreOrTheSafeLayoutBinding2.titleContentsOfTheSafe.getVisibility() == 4) {
                            UIMenuFamilyStore.this.setVisibleForInfo(0);
                        }
                    } else if (itemsId == 1) {
                        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding3 = UIMenuFamilyStore.this.binding;
                        if (familiesMenuTheStoreOrTheSafeLayoutBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            familiesMenuTheStoreOrTheSafeLayoutBinding3 = null;
                        }
                        if (familiesMenuTheStoreOrTheSafeLayoutBinding3.titleContentsOfTheSafe.getVisibility() == 0) {
                            UIMenuFamilyStore.this.setVisibleForInfo(4);
                        }
                    }
                    UIMenuFamilyStore.this.setTitle(item.getItemsTitle());
                    FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding4 = UIMenuFamilyStore.this.binding;
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        familiesMenuTheStoreOrTheSafeLayoutBinding4 = null;
                    }
                    if (familiesMenuTheStoreOrTheSafeLayoutBinding4.buttonGoToTheContents.getVisibility() == 4) {
                        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding5 = UIMenuFamilyStore.this.binding;
                        if (familiesMenuTheStoreOrTheSafeLayoutBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            familiesMenuTheStoreOrTheSafeLayoutBinding = familiesMenuTheStoreOrTheSafeLayoutBinding5;
                        }
                        familiesMenuTheStoreOrTheSafeLayoutBinding.buttonGoToTheContents.setVisibility(0);
                    }
                }
            }
        };
    }

    public final void setDataInMenu() {
        List<FamilyMainItemData> list = this.menuList;
        list.clear();
        list.add(new FamilyMainItemData(0, "Сейф", false, 4, null));
        list.add(new FamilyMainItemData(1, "Склад", false, 4, null));
    }

    private final void setDataInView() {
        this.menuAdapter = new FamilyMenuMainAdapter(this.menuList, this.onClickMenuList, this.mainActivity);
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding2 = null;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesMenuTheStoreOrTheSafeLayoutBinding.upgradeList;
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding3 = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuTheStoreOrTheSafeLayoutBinding2 = familiesMenuTheStoreOrTheSafeLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesMenuTheStoreOrTheSafeLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.menuAdapter);
    }

    public final void setVisibleForInfo(int valueOfVisible) {
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding.titleContentsOfTheSafe.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.allMoney.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.allMoneyValue.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.materials.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.materialsValue.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.masks.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.masksValue.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.oil.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.oilValue.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.armor.setVisibility(valueOfVisible);
        familiesMenuTheStoreOrTheSafeLayoutBinding.armorValue.setVisibility(valueOfVisible);
    }

    public final void setTitle(String title) {
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding.storeTitle.setText(title);
        familiesMenuTheStoreOrTheSafeLayoutBinding.titleRightBlock.setText(title);
        TextView textView = familiesMenuTheStoreOrTheSafeLayoutBinding.actionTitle;
        if (!Intrinsics.areEqual(title, "")) {
            JNIActivity jNIActivity = this.mainActivity;
            title = jNIActivity != null ? jNIActivity.getString(R.string.families_store_use_title, title) : null;
        }
        textView.setText(title);
    }

    public final void setDescriptionForStore(List<Integer> otherState) {
        FamiliesMenuTheStoreOrTheSafeLayoutBinding familiesMenuTheStoreOrTheSafeLayoutBinding = this.binding;
        if (familiesMenuTheStoreOrTheSafeLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuTheStoreOrTheSafeLayoutBinding = null;
        }
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity == null || otherState.size() != 5) {
            return;
        }
        familiesMenuTheStoreOrTheSafeLayoutBinding.allMoneyValue.setText(jNIActivity.getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(otherState.get(0))));
        familiesMenuTheStoreOrTheSafeLayoutBinding.materialsValue.setText(jNIActivity.getString(R.string.families_store_materials, otherState.get(1)));
        familiesMenuTheStoreOrTheSafeLayoutBinding.masksValue.setText(jNIActivity.getString(R.string.families_store_masks, otherState.get(2)));
        familiesMenuTheStoreOrTheSafeLayoutBinding.oilValue.setText(jNIActivity.getString(R.string.families_store_oil, otherState.get(3)));
        familiesMenuTheStoreOrTheSafeLayoutBinding.armorValue.setText(jNIActivity.getString(R.string.families_store_armor, otherState.get(4)));
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.menuAdapter = null;
        this.onClickMenuList = null;
        this.menuList.clear();
    }
}

