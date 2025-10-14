package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsShopViewModelFactory.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsShopViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    public FractionsShopViewModelFactory(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
    }

    @NotNull
    public final FractionActionsWithJSON getActionsWithJSON() {
        return this.actionsWithJSON;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new FractionsShopViewModel(this.actionsWithJSON);
    }
}

