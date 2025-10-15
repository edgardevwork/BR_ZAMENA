package com.blackhub.bronline.game.gui.fractions.viewmodel;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.fractions.data.FractionsNewRankRewardItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsProgressStaffItem;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: FractionsMainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0016\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007J&\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0007J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010\u0016J\u000e\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\t¨\u00062"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;)V", "addAddTokensBCValueLiveData", "Landroidx/lifecycle/LiveData;", "", "getAddAddTokensBCValueLiveData", "()Landroidx/lifecycle/LiveData;", "addTokensPriceLiveData", "getAddTokensPriceLiveData", "fractionIdLiveData", "getFractionIdLiveData", "fractionTokensLiveData", "getFractionTokensLiveData", "mutableAddTokensBCValueLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutableAddTokensPriceLiveData", "mutableFractionIdLiveData", "mutableFractionTokensLiveData", "mutableNewRankRewardItemLiveData", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsNewRankRewardItem;", "mutableProgressStaffItemLiveData", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsProgressStaffItem;", "newRankRewardItemLiveData", "getNewRankRewardItemLiveData", "progressStaffItemLiveData", "getProgressStaffItemLiveData", "onCleared", "", "sendButtonPressed", "currentLayout", "typeKey", "sendKeyWithType", "currentPage", "mainKey", "", "value", "setAddTokensPrice", FirebaseAnalytics.Param.PRICE, "setBCValue", "bcValue", "setFractionId", "fractionId", "setFractionTokens", "fractionTokens", "setFractionsNewRankRewardItem", "item", "setFractionsProgressStaffItem", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FractionsMainViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final LiveData<Integer> addAddTokensBCValueLiveData;

    @NotNull
    public final LiveData<Integer> addTokensPriceLiveData;

    @NotNull
    public final LiveData<Integer> fractionIdLiveData;

    @NotNull
    public final LiveData<Integer> fractionTokensLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableAddTokensBCValueLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableAddTokensPriceLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableFractionIdLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableFractionTokensLiveData;

    @NotNull
    public final MutableLiveData<FractionsNewRankRewardItem> mutableNewRankRewardItemLiveData;

    @NotNull
    public final MutableLiveData<FractionsProgressStaffItem> mutableProgressStaffItemLiveData;

    @NotNull
    public final LiveData<FractionsNewRankRewardItem> newRankRewardItemLiveData;

    @NotNull
    public final LiveData<FractionsProgressStaffItem> progressStaffItemLiveData;

    @Inject
    public FractionsMainViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableFractionTokensLiveData = mutableLiveData;
        this.fractionTokensLiveData = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableFractionIdLiveData = mutableLiveData2;
        this.fractionIdLiveData = mutableLiveData2;
        MutableLiveData<FractionsProgressStaffItem> mutableLiveData3 = new MutableLiveData<>();
        this.mutableProgressStaffItemLiveData = mutableLiveData3;
        this.progressStaffItemLiveData = mutableLiveData3;
        MutableLiveData<FractionsNewRankRewardItem> mutableLiveData4 = new MutableLiveData<>();
        this.mutableNewRankRewardItemLiveData = mutableLiveData4;
        this.newRankRewardItemLiveData = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableAddTokensPriceLiveData = mutableLiveData5;
        this.addTokensPriceLiveData = mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.mutableAddTokensBCValueLiveData = mutableLiveData6;
        this.addAddTokensBCValueLiveData = mutableLiveData6;
    }

    @NotNull
    public final LiveData<Integer> getFractionTokensLiveData() {
        return this.fractionTokensLiveData;
    }

    @NotNull
    public final LiveData<Integer> getFractionIdLiveData() {
        return this.fractionIdLiveData;
    }

    @NotNull
    public final LiveData<FractionsProgressStaffItem> getProgressStaffItemLiveData() {
        return this.progressStaffItemLiveData;
    }

    @NotNull
    public final LiveData<FractionsNewRankRewardItem> getNewRankRewardItemLiveData() {
        return this.newRankRewardItemLiveData;
    }

    @NotNull
    public final LiveData<Integer> getAddTokensPriceLiveData() {
        return this.addTokensPriceLiveData;
    }

    @NotNull
    public final LiveData<Integer> getAddAddTokensBCValueLiveData() {
        return this.addAddTokensBCValueLiveData;
    }

    public final void setFractionId(int fractionId) {
        this.mutableFractionIdLiveData.setValue(Integer.valueOf(fractionId));
    }

    public final void setFractionTokens(int fractionTokens) {
        this.mutableFractionTokensLiveData.setValue(Integer.valueOf(fractionTokens));
    }

    public final void setFractionsProgressStaffItem(@NotNull FractionsProgressStaffItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mutableProgressStaffItemLiveData.setValue(item);
    }

    public final void setFractionsNewRankRewardItem(@Nullable FractionsNewRankRewardItem item) {
        this.mutableNewRankRewardItemLiveData.setValue(item);
    }

    public final void setAddTokensPrice(int price) {
        this.mutableAddTokensPriceLiveData.setValue(Integer.valueOf(price));
    }

    public final void setBCValue(int bcValue) {
        this.mutableAddTokensBCValueLiveData.setValue(Integer.valueOf(bcValue));
    }

    public final void sendButtonPressed(int currentLayout, int typeKey) throws JSONException {
        this.actionsWithJSON.sendButtonPressed(currentLayout, typeKey);
    }

    public final void sendKeyWithType(int currentPage, int typeKey, @NotNull String mainKey, int value) throws JSONException {
        Intrinsics.checkNotNullParameter(mainKey, "mainKey");
        this.actionsWithJSON.sendKeyWithType(currentPage, typeKey, mainKey, value);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Log.d(Const.LOG_FRACTION_S, "FractionsMainViewModel cleared");
    }
}
