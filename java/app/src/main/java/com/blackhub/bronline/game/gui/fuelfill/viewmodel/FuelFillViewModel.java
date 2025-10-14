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

