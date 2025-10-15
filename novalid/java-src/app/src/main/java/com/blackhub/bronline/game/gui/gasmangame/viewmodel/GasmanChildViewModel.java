package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanChildUIState;
import com.caverock.androidsvg.SVG;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: GasmanChildViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J2\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initPlots", "", "listOfPlots", "", "Landroid/view/View;", "", "topPlotQuantity", "", "middlePlotQuantity", "botPlotQuantity", "pipeTurned", SVG.View.NODE_NAME, "isInPlace", "reduceBotPlotQuantity", "reduceMiddlePlotQuantity", "reduceTopPlotQuantity", "sendNotification", "text", "", "setAnimateGas", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGasmanChildViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanChildViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,87:1\n230#2,5:88\n230#2,5:93\n230#2,5:98\n230#2,5:103\n230#2,5:108\n230#2,5:113\n*S KotlinDebug\n*F\n+ 1 GasmanChildViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel\n*L\n26#1:88,5\n38#1:93,5\n52#1:98,5\n61#1:103,5\n69#1:108,5\n77#1:113,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GasmanChildViewModel extends BaseViewModel<GasmanChildUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<GasmanChildUIState> _uiState;

    @NotNull
    public final LocalNotification localNotification;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public GasmanChildViewModel(@NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new GasmanChildUIState(0, 0, 0, null, false, 31, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<GasmanChildUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<GasmanChildUIState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void initPlots(@NotNull Map<View, Boolean> listOfPlots, int topPlotQuantity, int middlePlotQuantity, int botPlotQuantity) {
        GasmanChildUIState value;
        Intrinsics.checkNotNullParameter(listOfPlots, "listOfPlots");
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copy(topPlotQuantity, middlePlotQuantity, botPlotQuantity, listOfPlots, false)));
    }

    public final void setAnimateGas() {
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanChildUIState.copy$default(get_uiState().getValue(), 0, 0, 0, null, true, 15, null))) {
        }
    }

    public final void pipeTurned(@NotNull View view, boolean isInPlace) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(get_uiState().getValue().getCheckIfPipesInPlaces().get(view), Boolean.valueOf(isInPlace))) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(get_uiState().getValue().getCheckIfPipesInPlaces());
        linkedHashMap.put(view, Boolean.valueOf(isInPlace));
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanChildUIState.copy$default(get_uiState().getValue(), 0, 0, 0, linkedHashMap, false, 23, null))) {
        }
    }

    public final void reduceTopPlotQuantity() {
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanChildUIState.copy$default(getUiState().getValue(), getUiState().getValue().getTopPlotQuantity() - 1, 0, 0, null, false, 30, null))) {
        }
    }

    public final void reduceMiddlePlotQuantity() {
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanChildUIState.copy$default(getUiState().getValue(), 0, getUiState().getValue().getMiddlePlotQuantity() - 1, 0, null, false, 29, null))) {
        }
    }

    public final void reduceBotPlotQuantity() {
        MutableStateFlow<GasmanChildUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanChildUIState.copy$default(getUiState().getValue(), 0, 0, getUiState().getValue().getBotPlotQuantity() - 1, null, false, 27, null))) {
        }
    }

    public final void sendNotification(@NotNull String text) throws JSONException {
        Intrinsics.checkNotNullParameter(text, "text");
        getLocalNotification().showErrorNotification(text);
    }
}
