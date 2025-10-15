package com.blackhub.bronline.game.gui.fuelfill.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel;
import com.blackhub.bronline.game.gui.fuelfill.network.FuelFillActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FuelFillViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J%\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0002¢\u0006\u0002\u0010\u001dJ#\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0012J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u000eH\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/viewmodel/FuelFillViewModel;", "Landroidx/lifecycle/ViewModel;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/fuelfill/network/FuelFillActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/fuelfill/network/FuelFillActionWithJSON;)V", "allFuelList", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/blackhub/bronline/game/gui/fuelfill/data/TypeAndPriceOfFuel;", "getAllFuelList", "()Lkotlinx/coroutines/flow/StateFlow;", "allFuelListMutable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentTypeOfFuel", "", "getCurrentTypeOfFuel", "currentTypeOfFuelMutable", "maxValueOfFuel", "", "getMaxValueOfFuel", "maxValueOfFuelMutable", "selectedFuelPos", "closeInterface", "", "initFuelList", "jsonArray", "Lorg/json/JSONArray;", "fuelTitle", "", "(Lorg/json/JSONArray;[Ljava/lang/String;)V", "initParams", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;[Ljava/lang/String;)V", "purchaseOfFuel", "valueOfFuel", "selectFuel", "currentPos", "setCurrentTypeOfFuel", "typeOfFuel", "setMaxValueOfFuel", "maxValue", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FuelFillViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FuelFillActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<List<TypeAndPriceOfFuel>> allFuelList;

    @NotNull
    public final MutableStateFlow<List<TypeAndPriceOfFuel>> allFuelListMutable;

    @NotNull
    public final StateFlow<String> currentTypeOfFuel;

    @NotNull
    public final MutableStateFlow<String> currentTypeOfFuelMutable;

    @NotNull
    public final StateFlow<Integer> maxValueOfFuel;

    @NotNull
    public final MutableStateFlow<Integer> maxValueOfFuelMutable;

    @NotNull
    public final MutableStateFlow<Integer> selectedFuelPos;

    @Inject
    public FuelFillViewModel(@NotNull FuelFillActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.maxValueOfFuelMutable = MutableStateFlow;
        this.maxValueOfFuel = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.currentTypeOfFuelMutable = MutableStateFlow2;
        this.currentTypeOfFuel = MutableStateFlow2;
        MutableStateFlow<List<TypeAndPriceOfFuel>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.allFuelListMutable = MutableStateFlow3;
        this.allFuelList = MutableStateFlow3;
        this.selectedFuelPos = StateFlowKt.MutableStateFlow(0);
    }

    @NotNull
    public final StateFlow<Integer> getMaxValueOfFuel() {
        return this.maxValueOfFuel;
    }

    @NotNull
    public final StateFlow<String> getCurrentTypeOfFuel() {
        return this.currentTypeOfFuel;
    }

    @NotNull
    public final StateFlow<List<TypeAndPriceOfFuel>> getAllFuelList() {
        return this.allFuelList;
    }

    public final void initParams(@Nullable JSONObject json, @NotNull String[] fuelTitle) {
        Intrinsics.checkNotNullParameter(fuelTitle, "fuelTitle");
        if (json != null) {
            setMaxValueOfFuel(json.optInt("m"));
            String strOptString = json.optString("h");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            setCurrentTypeOfFuel(strOptString);
            initFuelList(json.optJSONArray("ma"), fuelTitle);
        }
    }

    public final void setMaxValueOfFuel(int maxValue) {
        this.maxValueOfFuelMutable.setValue(Integer.valueOf(maxValue));
    }

    public final void setCurrentTypeOfFuel(String typeOfFuel) {
        this.currentTypeOfFuelMutable.setValue(typeOfFuel);
    }

    public final void initFuelList(JSONArray jsonArray, String[] fuelTitle) {
        Unit unit;
        if (jsonArray != null) {
            List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(jsonArray);
            if (mutableIntList.size() == fuelTitle.length) {
                ArrayList arrayList = new ArrayList();
                int size = mutableIntList.size();
                int i = 0;
                while (i < size) {
                    arrayList.add(new TypeAndPriceOfFuel(fuelTitle[i], mutableIntList.get(i).intValue(), i == 0));
                    i++;
                }
                this.allFuelListMutable.setValue(arrayList);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log("jsonArray = null");
            firebaseCrashlytics.recordException(new Throwable());
        }
    }

    public final void closeInterface() throws JSONException {
        this.actionWithJSON.closeInterface();
    }

    public final void selectFuel(int currentPos) {
        this.selectedFuelPos.setValue(Integer.valueOf(currentPos));
    }

    public final void purchaseOfFuel(int valueOfFuel) throws JSONException {
        this.actionWithJSON.purchaseOfFuel(this.selectedFuelPos.getValue().intValue(), valueOfFuel);
    }
}
