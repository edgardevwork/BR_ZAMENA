package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopList;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: FractionsShopViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsShopViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;)V", "getActionsWithJSON", "()Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "mutableShopListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "shopListLiveData", "Landroidx/lifecycle/LiveData;", "getShopListLiveData", "()Landroidx/lifecycle/LiveData;", "getShopList", "", "shopListObj", "sendItemPressed", "uniqueId", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FractionsShopViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final MutableLiveData<FractionsShopList> mutableShopListLiveData;

    @NotNull
    public final LiveData<FractionsShopList> shopListLiveData;

    @Inject
    public FractionsShopViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        MutableLiveData<FractionsShopList> mutableLiveData = new MutableLiveData<>();
        this.mutableShopListLiveData = mutableLiveData;
        this.shopListLiveData = mutableLiveData;
    }

    @NotNull
    public final FractionActionsWithJSON getActionsWithJSON() {
        return this.actionsWithJSON;
    }

    @NotNull
    public final LiveData<FractionsShopList> getShopListLiveData() {
        return this.shopListLiveData;
    }

    public final void getShopList(@NotNull FractionsShopList shopListObj) {
        Intrinsics.checkNotNullParameter(shopListObj, "shopListObj");
        shopListObj.setItemClicked(-1);
        if (Intrinsics.areEqual(shopListObj, this.mutableShopListLiveData.getValue())) {
            return;
        }
        this.mutableShopListLiveData.postValue(shopListObj);
    }

    public final void sendItemPressed(int uniqueId) throws JSONException {
        this.actionsWithJSON.sendItemInShopPressed(20, uniqueId);
    }
}
