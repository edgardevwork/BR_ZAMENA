package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.blackhub.bronline.game.gui.fractions.Const;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateDepositCoinsViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DonateDepositCoinsViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedCloseFragment;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedShowDonatePackage;

    @NotNull
    public final MutableStateFlow<Boolean> _isShowFragment;

    @NotNull
    public final DonateActionWithJSON actionsWithJson;

    @NotNull
    public final MutableLiveData<Integer> coinsMutableLiveData;

    @NotNull
    public final MutableLiveData<Boolean> doubleDonateValueMutableLiveData;

    @NotNull
    public final MutableLiveData<String> emailMutableLiveData;

    @NotNull
    public final MutableLiveData<Integer> inputCoinsMutableLiveData;

    @NotNull
    public final MutableLiveData<Integer> intermediatePremiumPriceMutableLiveData;

    @NotNull
    public final StateFlow<Boolean> isNeedCloseFragment;

    @NotNull
    public final StateFlow<Boolean> isNeedShowDonatePackage;

    @NotNull
    public final StateFlow<Boolean> isShowFragment;

    @NotNull
    public final MutableLiveData<String> nicknameMutableLiveData;

    @NotNull
    public final MutableLiveData<Integer> serverNumberMutableLiveData;

    @Inject
    public DonateDepositCoinsViewModel(@NotNull DonateActionWithJSON actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
        this.doubleDonateValueMutableLiveData = new MutableLiveData<>();
        this.serverNumberMutableLiveData = new MutableLiveData<>();
        this.nicknameMutableLiveData = new MutableLiveData<>();
        this.emailMutableLiveData = new MutableLiveData<>();
        this.coinsMutableLiveData = new MutableLiveData<>();
        this.inputCoinsMutableLiveData = new MutableLiveData<>();
        this.intermediatePremiumPriceMutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this._isNeedCloseFragment = MutableStateFlow;
        this.isNeedCloseFragment = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this._isShowFragment = MutableStateFlow2;
        this.isShowFragment = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this._isNeedShowDonatePackage = MutableStateFlow3;
        this.isNeedShowDonatePackage = FlowKt.asStateFlow(MutableStateFlow3);
    }

    @NotNull
    public final LiveData<Boolean> getDoubleDonateLiveData() {
        return this.doubleDonateValueMutableLiveData;
    }

    @NotNull
    public final LiveData<Integer> getServerNumberLiveData() {
        return this.serverNumberMutableLiveData;
    }

    @NotNull
    public final LiveData<String> getNicknameLiveData() {
        return this.nicknameMutableLiveData;
    }

    @NotNull
    public final LiveData<String> getEmailLiveData() {
        return this.emailMutableLiveData;
    }

    @NotNull
    public final LiveData<Integer> getCoinsLiveData() {
        return this.coinsMutableLiveData;
    }

    @NotNull
    public final LiveData<Integer> getInputCoinsLiveData() {
        return this.inputCoinsMutableLiveData;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedCloseFragment() {
        return this.isNeedCloseFragment;
    }

    @NotNull
    public final StateFlow<Boolean> isShowFragment() {
        return this.isShowFragment;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedShowDonatePackage() {
        return this.isNeedShowDonatePackage;
    }

    public final void setDoubleDonateValue(boolean isWithDouble) {
        this.doubleDonateValueMutableLiveData.setValue(Boolean.valueOf(isWithDouble));
    }

    public final void setServerNumber(int serverNumber) {
        this.serverNumberMutableLiveData.setValue(Integer.valueOf(serverNumber));
    }

    public final void setNickname(@NotNull String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.nicknameMutableLiveData.setValue(nickname);
    }

    public final void setEmail(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.emailMutableLiveData.setValue(email);
    }

    public final void setCoins(int coins) {
        this.coinsMutableLiveData.setValue(Integer.valueOf(coins));
    }

    public final void setInputCoins(int inputCoins) {
        this.inputCoinsMutableLiveData.setValue(Integer.valueOf(inputCoins));
    }

    public final boolean sendBuyTokens(int value) {
        return this.actionsWithJson.sendBuyTokens(value);
    }

    public final void saveIntermediatePremiumPrice(int newPrice) {
        this.intermediatePremiumPriceMutableLiveData.setValue(Integer.valueOf(newPrice));
    }

    public final void setPriceIfNotPurchasePremium() {
        this.inputCoinsMutableLiveData.setValue(this.intermediatePremiumPriceMutableLiveData.getValue());
    }

    public final void closeDepositCoinsFragment(boolean isNeedClose) {
        this._isNeedCloseFragment.setValue(Boolean.valueOf(isNeedClose));
    }

    public final void changeShowStateOfFragment(boolean newState) {
        this._isShowFragment.setValue(Boolean.valueOf(newState));
    }

    public final void setFlagForOpenDonatePackage(boolean isNeedToShowDonatePackage) {
        this._isNeedShowDonatePackage.setValue(Boolean.valueOf(isNeedToShowDonatePackage));
    }
}

