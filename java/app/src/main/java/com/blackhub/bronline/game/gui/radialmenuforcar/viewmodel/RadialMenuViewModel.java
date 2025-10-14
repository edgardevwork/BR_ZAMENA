package com.blackhub.bronline.game.gui.radialmenuforcar.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.radialmenuforcar.netrowk.RadialMenuActionWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: RadialMenuViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RadialMenuViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final RadialMenuActionWithJSON actionWithJson;

    @Inject
    public RadialMenuViewModel(@NotNull RadialMenuActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
    }

    public final void sendServerThisOperation(int valueKey) throws JSONException {
        this.actionWithJson.sendServerThisOperation(valueKey);
    }

    public final void showMessageError() throws JSONException {
        this.actionWithJson.showMessageError();
    }
}

