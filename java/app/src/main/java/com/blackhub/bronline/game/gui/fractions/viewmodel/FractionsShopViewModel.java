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

