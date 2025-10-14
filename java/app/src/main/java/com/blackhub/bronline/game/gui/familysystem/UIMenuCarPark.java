package com.blackhub.bronline.game.gui.familysystem;

import android.annotation.SuppressLint;
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
import com.blackhub.bronline.databinding.FamiliesMenuCarParkLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyMenuMainAdapter;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyMainItemData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayersAction;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMenuCarPark.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UIMenuCarPark extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;

    @Nullable
    public Animation anim;
    public FamiliesMenuCarParkLayoutBinding binding;

    @Nullable
    public FamilyPlayersActionAdapter carsActionAdapter;

    @Nullable
    public FamilyMenuMainAdapter carsAdapter;

    @Nullable
    public Function2<? super FamilyPlayersAction, ? super Integer, Unit> clickActionsButton;

    @Nullable
    public final JNIActivity mainActivity;
    public long oldTimerForClick;
    public int savedRank;

    @Nullable
    public Function3<? super FamilyMainItemData, ? super Integer, ? super View, Unit> setClickCar;

    @NotNull
    public final List<FamilyMainItemData> carList = new ArrayList();

    @NotNull
    public final List<FamilyPlayersAction> actionsList = new ArrayList();
    public int currentCarsId = -1;
    public int currentAction = -1;
    public int oldActionsId = -1;
    public int garage = -1;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMenuCarPark(@Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
    }

    public final void setVisibleButtonBackToMenu(boolean ifFromMainMenu) {
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = this.binding;
        if (familiesMenuCarParkLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding = null;
        }
        familiesMenuCarParkLayoutBinding.buttonBackToMenu.setVisibility(ifFromMainMenu ? 4 : 0);
    }

    public final void setStartData() throws JSONException {
        this.currentCarsId = -1;
        this.currentAction = -1;
        this.oldActionsId = -1;
        this.savedRank = 0;
        if (this.carList.size() != 0) {
            getCarsInfo(this.carList.get(0), 0);
            setVisibleForCarInfo(0);
        } else {
            setVisibleForCarInfo(4);
        }
    }

    public final void setVisibleForCarInfo(int isVisible) {
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = this.binding;
        if (familiesMenuCarParkLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding = null;
        }
        familiesMenuCarParkLayoutBinding.actionWithCar.setVisibility(isVisible);
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = this.binding;
        if (familiesMenuCarParkLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding = null;
        }
        ConstraintLayout root = familiesMenuCarParkLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBindingInflate = FamiliesMenuCarParkLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesMenuCarParkLayoutBindingInflate, "inflate(...)");
        this.binding = familiesMenuCarParkLayoutBindingInflate;
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = null;
        if (familiesMenuCarParkLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesMenuCarParkLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        setLogicForCarClick();
        setDataWithCarsListInView();
        setLogicForActionClick();
        setDataWithActionsInView();
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding2 = this.binding;
        if (familiesMenuCarParkLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding2 = null;
        }
        familiesMenuCarParkLayoutBinding2.buttonBackToMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuCarPark$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIMenuCarPark.onCreateView$lambda$3$lambda$2(this.f$0, view);
            }
        });
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding3 = this.binding;
        if (familiesMenuCarParkLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuCarParkLayoutBinding = familiesMenuCarParkLayoutBinding3;
        }
        ConstraintLayout root = familiesMenuCarParkLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$3$lambda$2(UIMenuCarPark this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
        if (actionsWithJSON != null) {
            actionsWithJSON.sendGetLayout(5);
        }
    }

    /* compiled from: UIMenuCarPark.kt */
    @Metadata(m7104d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ!\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuCarPark$setLogicForCarClick$1", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyMainItemData;", "Lkotlin/ParameterName;", "name", "item", "", "position", "Landroid/view/View;", "mView", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickMenuMainList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuCarPark$setLogicForCarClick$1 */
    public static final class C40221 implements Function3<FamilyMainItemData, Integer, View, Unit> {
        public C40221() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) throws JSONException {
            invoke(familyMainItemData, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) throws JSONException {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(mView, "mView");
            if (System.currentTimeMillis() - UIMenuCarPark.this.oldTimerForClick > 700) {
                UIMenuCarPark.this.oldTimerForClick = System.currentTimeMillis();
                mView.startAnimation(UIMenuCarPark.this.anim);
                UIMenuCarPark.this.getCarsInfo(item, position);
                FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = UIMenuCarPark.this.binding;
                if (familiesMenuCarParkLayoutBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    familiesMenuCarParkLayoutBinding = null;
                }
                if (familiesMenuCarParkLayoutBinding.actionWithCar.getVisibility() == 4) {
                    UIMenuCarPark.this.setVisibleForCarInfo(0);
                }
            }
        }
    }

    public final void setLogicForCarClick() {
        this.setClickCar = new Function3<FamilyMainItemData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuCarPark.setLogicForCarClick.1
            public C40221() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FamilyMainItemData familyMainItemData, Integer num, View view) throws JSONException {
                invoke(familyMainItemData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyMainItemData item, int position, @NotNull View mView) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(mView, "mView");
                if (System.currentTimeMillis() - UIMenuCarPark.this.oldTimerForClick > 700) {
                    UIMenuCarPark.this.oldTimerForClick = System.currentTimeMillis();
                    mView.startAnimation(UIMenuCarPark.this.anim);
                    UIMenuCarPark.this.getCarsInfo(item, position);
                    FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = UIMenuCarPark.this.binding;
                    if (familiesMenuCarParkLayoutBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        familiesMenuCarParkLayoutBinding = null;
                    }
                    if (familiesMenuCarParkLayoutBinding.actionWithCar.getVisibility() == 4) {
                        UIMenuCarPark.this.setVisibleForCarInfo(0);
                    }
                }
            }
        };
    }

    public final void setDataWithCarsListInView() {
        this.carsAdapter = new FamilyMenuMainAdapter(this.carList, this.setClickCar, this.mainActivity);
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = this.binding;
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding2 = null;
        if (familiesMenuCarParkLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesMenuCarParkLayoutBinding.carList;
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding3 = this.binding;
        if (familiesMenuCarParkLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuCarParkLayoutBinding2 = familiesMenuCarParkLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesMenuCarParkLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.carsAdapter);
    }

    public final void getCarsInfo(FamilyMainItemData currentCar, int currentPosition) throws JSONException {
        this.currentCarsId = currentCar.getItemsId();
        currentCar.setClicked(true);
        FamilyMenuMainAdapter familyMenuMainAdapter = this.carsAdapter;
        if (familyMenuMainAdapter != null) {
            familyMenuMainAdapter.notifyItemChanged(currentPosition);
            familyMenuMainAdapter.setCheckOnlyElement(currentPosition);
        }
        ActionsWithJSON actionsWithJSON = this.actionsWithJSON;
        if (actionsWithJSON != null) {
            actionsWithJSON.clickOnCar(currentCar.getItemsId());
        }
    }

    /* compiled from: UIMenuCarPark.kt */
    @Metadata(m7104d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIMenuCarPark$setLogicForActionClick$1", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyPlayersAction;", "Lkotlin/ParameterName;", "name", "thisAction", "", "action", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickActionsButton;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIMenuCarPark$setLogicForActionClick$1 */
    public static final class C40211 implements Function2<FamilyPlayersAction, Integer, Unit> {
        public C40211() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FamilyPlayersAction familyPlayersAction, Integer num) throws JSONException {
            invoke(familyPlayersAction, num.intValue());
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilyPlayersAction thisAction, int action) throws JSONException {
            ActionsWithJSON actionsWithJSON;
            Intrinsics.checkNotNullParameter(thisAction, "thisAction");
            if (System.currentTimeMillis() - UIMenuCarPark.this.oldTimerForClick > 700) {
                UIMenuCarPark.this.oldTimerForClick = System.currentTimeMillis();
                UIMenuCarPark.this.oldActionsId = thisAction.getActionsId();
                if (UIMenuCarPark.this.currentCarsId != -1) {
                    if (action == 0) {
                        ActionsWithJSON actionsWithJSON2 = UIMenuCarPark.this.actionsWithJSON;
                        if (actionsWithJSON2 != null) {
                            actionsWithJSON2.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), 0);
                        }
                        UIMenuCarPark.this.currentAction = 0;
                        return;
                    }
                    if (action != 1) {
                        if (action == 3 && (actionsWithJSON = UIMenuCarPark.this.actionsWithJSON) != null) {
                            actionsWithJSON.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), -1);
                            return;
                        }
                        return;
                    }
                    ActionsWithJSON actionsWithJSON3 = UIMenuCarPark.this.actionsWithJSON;
                    if (actionsWithJSON3 != null) {
                        actionsWithJSON3.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), 1);
                    }
                    UIMenuCarPark.this.currentAction = 1;
                }
            }
        }
    }

    public final void setLogicForActionClick() {
        this.clickActionsButton = new Function2<FamilyPlayersAction, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMenuCarPark.setLogicForActionClick.1
            public C40211() {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FamilyPlayersAction familyPlayersAction, Integer num) throws JSONException {
                invoke(familyPlayersAction, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilyPlayersAction thisAction, int action) throws JSONException {
                ActionsWithJSON actionsWithJSON;
                Intrinsics.checkNotNullParameter(thisAction, "thisAction");
                if (System.currentTimeMillis() - UIMenuCarPark.this.oldTimerForClick > 700) {
                    UIMenuCarPark.this.oldTimerForClick = System.currentTimeMillis();
                    UIMenuCarPark.this.oldActionsId = thisAction.getActionsId();
                    if (UIMenuCarPark.this.currentCarsId != -1) {
                        if (action == 0) {
                            ActionsWithJSON actionsWithJSON2 = UIMenuCarPark.this.actionsWithJSON;
                            if (actionsWithJSON2 != null) {
                                actionsWithJSON2.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), 0);
                            }
                            UIMenuCarPark.this.currentAction = 0;
                            return;
                        }
                        if (action != 1) {
                            if (action == 3 && (actionsWithJSON = UIMenuCarPark.this.actionsWithJSON) != null) {
                                actionsWithJSON.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), -1);
                                return;
                            }
                            return;
                        }
                        ActionsWithJSON actionsWithJSON3 = UIMenuCarPark.this.actionsWithJSON;
                        if (actionsWithJSON3 != null) {
                            actionsWithJSON3.setActionWithCar(UIMenuCarPark.this.currentCarsId, thisAction.getActionsId(), 1);
                        }
                        UIMenuCarPark.this.currentAction = 1;
                    }
                }
            }
        };
    }

    public final void setDataWithActionsInView() {
        this.carsActionAdapter = new FamilyPlayersActionAdapter(this.actionsList, this.clickActionsButton);
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding = this.binding;
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding2 = null;
        if (familiesMenuCarParkLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMenuCarParkLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesMenuCarParkLayoutBinding.actionWithCar;
        FamiliesMenuCarParkLayoutBinding familiesMenuCarParkLayoutBinding3 = this.binding;
        if (familiesMenuCarParkLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMenuCarParkLayoutBinding2 = familiesMenuCarParkLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesMenuCarParkLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.carsActionAdapter);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setCarsList(@NotNull List<Integer> carsId, @NotNull List<String> carsName) {
        Intrinsics.checkNotNullParameter(carsId, "carsId");
        Intrinsics.checkNotNullParameter(carsName, "carsName");
        if (carsId.size() == carsName.size()) {
            this.carList.clear();
            int size = carsId.size();
            for (int i = 0; i < size; i++) {
                this.carList.add(new FamilyMainItemData(carsId.get(i).intValue(), carsName.get(i), false, 4, null));
            }
            FamilyMenuMainAdapter familyMenuMainAdapter = this.carsAdapter;
            if (familyMenuMainAdapter != null) {
                familyMenuMainAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void setGarage(int garageStatus) {
        this.garage = garageStatus;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setActionsIfDownload(int garageStatus) {
        List<FamilyPlayersAction> list = this.actionsList;
        list.clear();
        list.add(new FamilyPlayersAction(0, "Отметить на GPS", 0, 2));
        list.add(new FamilyPlayersAction(1, "Загрузить транспорт на парковке", 0, 2));
        list.add(new FamilyPlayersAction(6, "Загрузить транспорт на месте выгрузки", 0, 2));
        if (garageStatus == 1) {
            list.add(new FamilyPlayersAction(5, "Загрузить транспорт в гараж", 0, 2));
        }
        list.add(new FamilyPlayersAction(2, "Вернуть из семьи", 0, 2));
        list.add(new FamilyPlayersAction(3, "Выдать доступ", this.savedRank, 0));
        list.add(new FamilyPlayersAction(7, "Сбросить парковку", 0, 2));
        FamilyPlayersActionAdapter familyPlayersActionAdapter = this.carsActionAdapter;
        if (familyPlayersActionAdapter != null) {
            familyPlayersActionAdapter.notifyDataSetChanged();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setActionsIfUnload() {
        List<FamilyPlayersAction> list = this.actionsList;
        list.clear();
        list.add(new FamilyPlayersAction(0, "Отметить на GPS", 0, 2));
        list.add(new FamilyPlayersAction(4, "Выгрузить транспорт", 0, 2));
        list.add(new FamilyPlayersAction(2, "Вернуть из семьи", 0, 2));
        list.add(new FamilyPlayersAction(3, "Выдать доступ", this.savedRank, 0));
        list.add(new FamilyPlayersAction(7, "Сбросить парковку", 0, 2));
        FamilyPlayersActionAdapter familyPlayersActionAdapter = this.carsActionAdapter;
        if (familyPlayersActionAdapter != null) {
            familyPlayersActionAdapter.notifyDataSetChanged();
        }
    }

    public final void setCurrentRankAndStatus(int carsRank, int carsStatus) {
        if (carsStatus == 0) {
            setActionsIfDownload(this.garage);
        } else if (carsStatus == 1) {
            setActionsIfUnload();
        }
        List<FamilyPlayersAction> list = this.actionsList;
        if (list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getActionsId() == 3) {
                    list.get(i).setActionsValue(carsRank);
                    this.savedRank = carsRank;
                    FamilyPlayersActionAdapter familyPlayersActionAdapter = this.carsActionAdapter;
                    if (familyPlayersActionAdapter != null) {
                        familyPlayersActionAdapter.notifyItemChanged(i);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void updateStatusAfterAction() {
        List<FamilyPlayersAction> list = this.actionsList;
        if (list.size() > 0) {
            switch (this.oldActionsId) {
                case 1:
                case 5:
                case 6:
                    setActionsIfUnload();
                    break;
                case 2:
                    deleteCar(this.currentCarsId);
                    break;
                case 3:
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (list.get(i).getActionsId() == 3) {
                            int i2 = this.currentAction;
                            if (i2 == 0) {
                                FamilyPlayersAction familyPlayersAction = list.get(i);
                                familyPlayersAction.setActionsValue(familyPlayersAction.getActionsValue() - 1);
                                this.savedRank = list.get(i).getActionsValue();
                            } else if (i2 == 1) {
                                FamilyPlayersAction familyPlayersAction2 = list.get(i);
                                familyPlayersAction2.setActionsValue(familyPlayersAction2.getActionsValue() + 1);
                                this.savedRank = list.get(i).getActionsValue();
                            }
                            FamilyPlayersActionAdapter familyPlayersActionAdapter = this.carsActionAdapter;
                            if (familyPlayersActionAdapter != null) {
                                familyPlayersActionAdapter.notifyItemChanged(i);
                                break;
                            }
                        } else {
                            i++;
                        }
                    }
                    break;
                case 4:
                    setActionsIfDownload(this.garage);
                    break;
            }
            this.currentAction = -1;
            this.oldActionsId = -1;
        }
    }

    public final void deleteCar(int carId) {
        if (this.carList.size() > 0) {
            int size = this.carList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (this.carList.get(i).getItemsId() == carId) {
                    this.carList.remove(i);
                    FamilyMenuMainAdapter familyMenuMainAdapter = this.carsAdapter;
                    if (familyMenuMainAdapter != null) {
                        familyMenuMainAdapter.notifyItemRemoved(i);
                    }
                } else {
                    i++;
                }
            }
            this.currentCarsId = -1;
            this.currentAction = -1;
            this.oldActionsId = -1;
            setVisibleForCarInfo(4);
        }
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.carsAdapter = null;
        this.setClickCar = null;
        this.carsActionAdapter = null;
        this.clickActionsButton = null;
        this.carList.clear();
        this.actionsList.clear();
    }
}

