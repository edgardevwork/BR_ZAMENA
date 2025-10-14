package com.blackhub.bronline.game.gui.rent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RentUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class RentUiState implements UiState {
    public static final int $stable = 0;
    public final boolean isNeedClose;

    public RentUiState() {
        this(false, 1, null);
    }

    public static /* synthetic */ RentUiState copy$default(RentUiState rentUiState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rentUiState.isNeedClose;
        }
        return rentUiState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final RentUiState copy(boolean isNeedClose) {
        return new RentUiState(isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RentUiState) && this.isNeedClose == ((RentUiState) other).isNeedClose;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "RentUiState(isNeedClose=" + this.isNeedClose + ")";
    }

    public RentUiState(boolean z) {
        this.isNeedClose = z;
    }

    public /* synthetic */ RentUiState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}

