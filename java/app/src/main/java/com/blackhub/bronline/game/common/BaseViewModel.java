package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseViewModel.kt */
@StabilityInferred(parameters = 2)
/* loaded from: classes3.dex */
public abstract class BaseViewModel<UiState extends UiState> extends BaseProjectViewModel {
    public static final int $stable = 0;

    public static /* synthetic */ void get_uiState$annotations() {
    }

    @NotNull
    public abstract StateFlow<UiState> getUiState();

    @NotNull
    public abstract MutableStateFlow<? extends UiState> get_uiState();
}

