package com.blackhub.bronline.game.gui.rent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RentUiState.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/rent/RentUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "isNeedClose", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
