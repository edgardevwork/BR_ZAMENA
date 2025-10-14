package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseViewModel.kt */
@StabilityInferred(parameters = 2)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006X¤\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/BaseViewModel;", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "Lcom/blackhub/bronline/game/common/BaseProjectViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState$annotations", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
