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
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/FinalWindowViewModel;", "Landroidx/lifecycle/ViewModel;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;)V", "isWinner", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "mutableIsWinner", "Lkotlinx/coroutines/flow/MutableStateFlow;", "sendPressButton", "", "typeKey", "", "updateResult", "json", "Lorg/json/JSONObject;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
