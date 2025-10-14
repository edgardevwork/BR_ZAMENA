package com.blackhub.bronline.game.gui.tanpinbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TanpinBannerUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class TanpinBannerUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final CasesBannerAttachment bannerAttachment;
    public final boolean isNeedToClose;

    public TanpinBannerUiState() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ TanpinBannerUiState copy$default(TanpinBannerUiState tanpinBannerUiState, CasesBannerAttachment casesBannerAttachment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            casesBannerAttachment = tanpinBannerUiState.bannerAttachment;
        }
        if ((i & 2) != 0) {
            z = tanpinBannerUiState.isNeedToClose;
        }
        return tanpinBannerUiState.copy(casesBannerAttachment, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNeedToClose() {
        return this.isNeedToClose;
    }

    @NotNull
    public final TanpinBannerUiState copy(@NotNull CasesBannerAttachment bannerAttachment, boolean isNeedToClose) {
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        return new TanpinBannerUiState(bannerAttachment, isNeedToClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TanpinBannerUiState)) {
            return false;
        }
        TanpinBannerUiState tanpinBannerUiState = (TanpinBannerUiState) other;
        return Intrinsics.areEqual(this.bannerAttachment, tanpinBannerUiState.bannerAttachment) && this.isNeedToClose == tanpinBannerUiState.isNeedToClose;
    }

    public int hashCode() {
        return (this.bannerAttachment.hashCode() * 31) + Boolean.hashCode(this.isNeedToClose);
    }

    @NotNull
    public String toString() {
        return "TanpinBannerUiState(bannerAttachment=" + this.bannerAttachment + ", isNeedToClose=" + this.isNeedToClose + ")";
    }

    public TanpinBannerUiState(@NotNull CasesBannerAttachment bannerAttachment, boolean z) {
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        this.bannerAttachment = bannerAttachment;
        this.isNeedToClose = z;
    }

    public /* synthetic */ TanpinBannerUiState(CasesBannerAttachment casesBannerAttachment, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CasesBannerAttachment(null, null, null, null, null, null, null, null, null, null, null, DoubleToDecimal.BQ_MASK, null) : casesBannerAttachment, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    public final boolean isNeedToClose() {
        return this.isNeedToClose;
    }
}

