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

