package com.blackhub.bronline.game.gui.halloweenaward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HalloweenAwardUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class HalloweenAwardUiState implements UiState {
    public static final int $stable = 0;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final int money;
    public final int moneyBP;
    public final int premium;
    public final int scoreBP;

    @NotNull
    public final String titleText;
    public final int xpBP;

    public HalloweenAwardUiState() {
        this(null, 0, 0, 0, 0, 0, false, false, 255, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPremium() {
        return this.premium;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMoneyBP() {
        return this.moneyBP;
    }

    /* renamed from: component5, reason: from getter */
    public final int getScoreBP() {
        return this.scoreBP;
    }

    /* renamed from: component6, reason: from getter */
    public final int getXpBP() {
        return this.xpBP;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    public final HalloweenAwardUiState copy(@NotNull String titleText, int premium, int money, int moneyBP, int scoreBP, int xpBP, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        return new HalloweenAwardUiState(titleText, premium, money, moneyBP, scoreBP, xpBP, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HalloweenAwardUiState)) {
            return false;
        }
        HalloweenAwardUiState halloweenAwardUiState = (HalloweenAwardUiState) other;
        return Intrinsics.areEqual(this.titleText, halloweenAwardUiState.titleText) && this.premium == halloweenAwardUiState.premium && this.money == halloweenAwardUiState.money && this.moneyBP == halloweenAwardUiState.moneyBP && this.scoreBP == halloweenAwardUiState.scoreBP && this.xpBP == halloweenAwardUiState.xpBP && this.isNeedClose == halloweenAwardUiState.isNeedClose && this.isBlockingLoading == halloweenAwardUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((((((this.titleText.hashCode() * 31) + Integer.hashCode(this.premium)) * 31) + Integer.hashCode(this.money)) * 31) + Integer.hashCode(this.moneyBP)) * 31) + Integer.hashCode(this.scoreBP)) * 31) + Integer.hashCode(this.xpBP)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "HalloweenAwardUiState(titleText=" + this.titleText + ", premium=" + this.premium + ", money=" + this.money + ", moneyBP=" + this.moneyBP + ", scoreBP=" + this.scoreBP + ", xpBP=" + this.xpBP + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public HalloweenAwardUiState(@NotNull String titleText, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        this.titleText = titleText;
        this.premium = i;
        this.money = i2;
        this.moneyBP = i3;
        this.scoreBP = i4;
        this.xpBP = i5;
        this.isNeedClose = z;
        this.isBlockingLoading = z2;
    }

    public /* synthetic */ HalloweenAwardUiState(String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? false : z, (i6 & 128) == 0 ? z2 : false);
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    public final int getPremium() {
        return this.premium;
    }

    public final int getMoney() {
        return this.money;
    }

    public final int getMoneyBP() {
        return this.moneyBP;
    }

    public final int getScoreBP() {
        return this.scoreBP;
    }

    public final int getXpBP() {
        return this.xpBP;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    public final boolean isHasPremium() {
        return this.premium == 1;
    }
}

