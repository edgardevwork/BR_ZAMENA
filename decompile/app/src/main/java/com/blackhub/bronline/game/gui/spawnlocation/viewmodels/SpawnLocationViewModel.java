package com.blackhub.bronline.game.gui.spawnlocation.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationActionsWithJson;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: SpawnLocationViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/viewmodels/SpawnLocationViewModel;", "Landroidx/lifecycle/ViewModel;", "spawnLocationActionsWithJson", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationActionsWithJson;", "spawnLocationRepository", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepository;", "(Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationActionsWithJson;Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepository;)V", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "errorLiveData", "Landroidx/lifecycle/LiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "errorMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "listOfAvailabilityLiveData", "", "", "getListOfAvailabilityLiveData", "listOfAvailabilityMutableLiveData", "onCleared", "", "sendChosenPlace", "id", "setListOfAvailability", "listOfAvailability", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class SpawnLocationViewModel extends ViewModel {
    public static final int $stable = 8;

    @Nullable
    public Disposable disposable;

    @NotNull
    public final LiveData<String> errorLiveData;

    @NotNull
    public final MutableLiveData<String> errorMutableLiveData;

    @NotNull
    public final MutableLiveData<List<Integer>> listOfAvailabilityMutableLiveData;

    @NotNull
    public final SpawnLocationActionsWithJson spawnLocationActionsWithJson;

    @NotNull
    public final SpawnLocationRepository spawnLocationRepository;

    @Inject
    public SpawnLocationViewModel(@NotNull SpawnLocationActionsWithJson spawnLocationActionsWithJson, @NotNull SpawnLocationRepository spawnLocationRepository) {
        Intrinsics.checkNotNullParameter(spawnLocationActionsWithJson, "spawnLocationActionsWithJson");
        Intrinsics.checkNotNullParameter(spawnLocationRepository, "spawnLocationRepository");
        this.spawnLocationActionsWithJson = spawnLocationActionsWithJson;
        this.spawnLocationRepository = spawnLocationRepository;
        this.listOfAvailabilityMutableLiveData = new MutableLiveData<>();
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.errorMutableLiveData = mutableLiveData;
        this.errorLiveData = mutableLiveData;
    }

    @NotNull
    public final LiveData<List<Integer>> getListOfAvailabilityLiveData() {
        return this.listOfAvailabilityMutableLiveData;
    }

    @NotNull
    public final LiveData<String> getErrorLiveData() {
        return this.errorLiveData;
    }

    public final void setListOfAvailability(@NotNull List<Integer> listOfAvailability) {
        Intrinsics.checkNotNullParameter(listOfAvailability, "listOfAvailability");
        this.listOfAvailabilityMutableLiveData.setValue(listOfAvailability);
    }

    public final void sendChosenPlace(int id) throws JSONException {
        this.spawnLocationActionsWithJson.sendKey(id);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.errorMutableLiveData.setValue(AnyExtensionKt.empty(this));
        this.listOfAvailabilityMutableLiveData.setValue(CollectionsKt__CollectionsKt.emptyList());
        super.onCleared();
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
