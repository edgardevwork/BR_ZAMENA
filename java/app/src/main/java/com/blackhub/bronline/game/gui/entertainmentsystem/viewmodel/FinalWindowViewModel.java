package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FinalWindowViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFinalWindowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinalWindowViewModel.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/FinalWindowViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* loaded from: classes3.dex */
public final class FinalWindowViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final EntertainmentSystemActionsWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<Boolean> isWinner;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsWinner;

    @Inject
    public FinalWindowViewModel(@NotNull EntertainmentSystemActionsWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsWinner = MutableStateFlow;
        this.isWinner = MutableStateFlow;
    }

    @NotNull
    public final StateFlow<Boolean> isWinner() {
        return this.isWinner;
    }

    public final void updateResult(@Nullable JSONObject json) {
        if (json != null) {
            this.mutableIsWinner.setValue(Boolean.valueOf(json.optInt("st") == 1));
        }
    }

    public final void sendPressButton(int typeKey) throws JSONException {
        this.actionWithJSON.sendPressButtonForFinalWindow(typeKey);
    }
}

