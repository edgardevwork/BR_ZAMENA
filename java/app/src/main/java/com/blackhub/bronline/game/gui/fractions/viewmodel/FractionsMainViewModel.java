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

