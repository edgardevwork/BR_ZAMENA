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
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\fJ\u000e\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u0007J\u000e\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\u0015J\u000e\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0007J\u000e\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\fJ\u000e\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0015J\u0006\u0010<\u001a\u00020(J\u000e\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;)V", "_isNeedCloseFragment", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isNeedShowDonatePackage", "_isShowFragment", "coinsLiveData", "Landroidx/lifecycle/LiveData;", "", "getCoinsLiveData", "()Landroidx/lifecycle/LiveData;", "coinsMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "doubleDonateLiveData", "getDoubleDonateLiveData", "doubleDonateValueMutableLiveData", "emailLiveData", "", "getEmailLiveData", "emailMutableLiveData", "inputCoinsLiveData", "getInputCoinsLiveData", "inputCoinsMutableLiveData", "intermediatePremiumPriceMutableLiveData", "isNeedCloseFragment", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isNeedShowDonatePackage", "isShowFragment", "nicknameLiveData", "getNicknameLiveData", "nicknameMutableLiveData", "serverNumberLiveData", "getServerNumberLiveData", "serverNumberMutableLiveData", "changeShowStateOfFragment", "", "newState", "closeDepositCoinsFragment", "isNeedClose", "saveIntermediatePremiumPrice", "newPrice", "sendBuyTokens", "value", "setCoins", "coins", "setDoubleDonateValue", "isWithDouble", "setEmail", "email", "setFlagForOpenDonatePackage", "isNeedToShowDonatePackage", "setInputCoins", "inputCoins", "setNickname", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "setPriceIfNotPurchasePremium", "setServerNumber", "serverNumber", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
