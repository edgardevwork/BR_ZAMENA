package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsMainViewModelFactory.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsMainViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    public FractionsMainViewModelFactory(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
    }

    @NotNull
    public final FractionActionsWithJSON getActionsWithJSON() {
        return this.actionsWithJSON;
    }
}

