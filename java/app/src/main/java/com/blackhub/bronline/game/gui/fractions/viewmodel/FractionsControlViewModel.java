package com.blackhub.bronline.game.gui.fractions.viewmodel;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlListOfPlayers;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlPlayerInfo;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: FractionsControlViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFractionsControlViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsControlViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1855#2,2:126\n1#3:128\n*S KotlinDebug\n*F\n+ 1 FractionsControlViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel\n*L\n60#1:126,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsControlViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final LiveData<Integer> fractionIdLiveData;

    @NotNull
    public final MutableLiveData<Integer> fractionIdMutableLiveData;
    public int fractionsControlChosenAccountId;

    @NotNull
    public final LiveData<FractionControlPlayerInfo> infoAboutPlayerLiveData;

    @NotNull
    public final LiveData<Integer> menuSortedPressedLiveData;

    @NotNull
    public final MutableLiveData<FractionControlPlayerInfo> mutableInfoAboutPlayerLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableMenuSortedPressedMutableLiveData;

    @NotNull
    public final MutableLiveData<String> mutableNewPlayersPosition;

    @NotNull
    public final MutableLiveData<Integer> mutableNewPlayersRankLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableNewPlayersReprimandLiveData;

    @NotNull
    public final MutableLiveData<List<FractionControlListOfPlayers>> mutableSortedStaffList;

    @NotNull
    public final MutableLiveData<List<FractionControlListOfPlayers>> mutableStaffListLiveData;

    @NotNull
    public final LiveData<String> newPlayersPosition;

    @NotNull
    public final LiveData<Integer> newPlayersRankLiveData;

    @NotNull
    public final LiveData<Integer> newPlayersReprimandLiveData;

    @NotNull
    public final LiveData<List<FractionControlListOfPlayers>> sortedStaffListLiveData;

    @NotNull
    public final LiveData<List<FractionControlListOfPlayers>> staffListLiveData;

    @Inject
    public FractionsControlViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        this.fractionsControlChosenAccountId = -1;
        MutableLiveData<List<FractionControlListOfPlayers>> mutableLiveData = new MutableLiveData<>();
        this.mutableStaffListLiveData = mutableLiveData;
        this.staffListLiveData = mutableLiveData;
        MutableLiveData<List<FractionControlListOfPlayers>> mutableLiveData2 = new MutableLiveData<>();
        this.mutableSortedStaffList = mutableLiveData2;
        this.sortedStaffListLiveData = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutableMenuSortedPressedMutableLiveData = mutableLiveData3;
        this.menuSortedPressedLiveData = mutableLiveData3;
        MutableLiveData<FractionControlPlayerInfo> mutableLiveData4 = new MutableLiveData<>();
        this.mutableInfoAboutPlayerLiveData = mutableLiveData4;
        this.infoAboutPlayerLiveData = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableNewPlayersRankLiveData = mutableLiveData5;
        this.newPlayersRankLiveData = mutableLiveData5;
        MutableLiveData<String> mutableLiveData6 = new MutableLiveData<>();
        this.mutableNewPlayersPosition = mutableLiveData6;
        this.newPlayersPosition = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.mutableNewPlayersReprimandLiveData = mutableLiveData7;
        this.newPlayersReprimandLiveData = mutableLiveData7;
        MutableLiveData<Integer> mutableLiveData8 = new MutableLiveData<>();
        this.fractionIdMutableLiveData = mutableLiveData8;
        this.fractionIdLiveData = mutableLiveData8;
    }

    @NotNull
    public final FractionActionsWithJSON getActionsWithJSON() {
        return this.actionsWithJSON;
    }

    @NotNull
    public final LiveData<List<FractionControlListOfPlayers>> getStaffListLiveData() {
        return this.staffListLiveData;
    }

    @NotNull
    public final LiveData<List<FractionControlListOfPlayers>> getSortedStaffListLiveData() {
        return this.sortedStaffListLiveData;
    }

    @NotNull
    public final LiveData<Integer> getMenuSortedPressedLiveData() {
        return this.menuSortedPressedLiveData;
    }

    @NotNull
    public final LiveData<FractionControlPlayerInfo> getInfoAboutPlayerLiveData() {
        return this.infoAboutPlayerLiveData;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersRankLiveData() {
        return this.newPlayersRankLiveData;
    }

    @NotNull
    public final LiveData<String> getNewPlayersPosition() {
        return this.newPlayersPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersReprimandLiveData() {
        return this.newPlayersReprimandLiveData;
    }

    @NotNull
    public final LiveData<Integer> getFractionIdLiveData() {
        return this.fractionIdLiveData;
    }

    public final void setFractionId(int fractionId) {
        this.fractionIdMutableLiveData.setValue(Integer.valueOf(fractionId));
    }

    public final void setStaffListLiveData(@Nullable List<FractionControlListOfPlayers> list) {
        this.mutableStaffListLiveData.setValue(list);
    }

    public final void setSortedStaffListLiveData(@Nullable List<FractionControlListOfPlayers> list) throws JSONException {
        List<FractionControlListOfPlayers> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            sendPlayerChosenId(list.get(0).getId());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((FractionControlListOfPlayers) it.next()).setClicked(false);
            }
            list.get(0).setClicked(true);
        }
        this.mutableSortedStaffList.setValue(list);
    }

    public final void setMenuSortedPressed(int pressed) {
        this.mutableMenuSortedPressedMutableLiveData.setValue(Integer.valueOf(pressed));
    }

    public final void setInfoAboutPlayer(@Nullable FractionControlPlayerInfo item) {
        this.mutableInfoAboutPlayerLiveData.setValue(item);
        if (item == null) {
            return;
        }
        item.setId(this.fractionsControlChosenAccountId);
    }

    public final void setNewPlayersRankLiveData(int newRank) {
        this.mutableNewPlayersRankLiveData.setValue(Integer.valueOf(newRank));
    }

    public final void setNewPlayersPosition(@NotNull String newPosition) {
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        this.mutableNewPlayersPosition.setValue(newPosition);
    }

    public final void setNewPlayersReprimandLiveData(int newReprimand) {
        this.mutableNewPlayersReprimandLiveData.setValue(Integer.valueOf(newReprimand));
    }

    public final void dismissPlayerFromFraction(int dismissedPlayerId) {
        List<FractionControlListOfPlayers> value = this.mutableStaffListLiveData.getValue();
        List<FractionControlListOfPlayers> value2 = this.mutableStaffListLiveData.getValue();
        Object obj = null;
        if (value2 != null) {
            Iterator<T> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((FractionControlListOfPlayers) next).getId() == dismissedPlayerId) {
                    obj = next;
                    break;
                }
            }
            obj = (FractionControlListOfPlayers) obj;
        }
        if (value != null) {
            TypeIntrinsics.asMutableCollection(value).remove(obj);
        }
        List<FractionControlListOfPlayers> value3 = this.mutableSortedStaffList.getValue();
        if (value3 != null) {
            TypeIntrinsics.asMutableCollection(value3).remove(obj);
        }
        this.mutableStaffListLiveData.setValue(value);
        this.mutableSortedStaffList.setValue(value3);
    }

    public final void sendPlayerChosenId(int accountId) throws JSONException {
        if (this.fractionsControlChosenAccountId != accountId) {
            this.fractionsControlChosenAccountId = accountId;
            if (accountId > 0) {
                this.actionsWithJSON.sendPlayerChosenId(accountId);
            }
        }
    }

    public final void sendChangeRank(int changeRank) throws JSONException {
        this.actionsWithJSON.sendChangeRankOrReprimand(16, changeRank);
    }

    public final void sendChangeReprimands(int changeReprimand) throws JSONException {
        this.actionsWithJSON.sendChangeRankOrReprimand(17, changeReprimand);
    }

    public final void sendButtonPressed(int button) throws JSONException {
        this.actionsWithJSON.sendButtonPressed(9, button);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Log.d(Const.LOG_FRACTION_S, "FractionsControlViewModel cleared");
    }
}

