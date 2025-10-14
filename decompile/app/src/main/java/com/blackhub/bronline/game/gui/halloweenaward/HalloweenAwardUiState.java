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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "titleText", "", "premium", "", "money", "moneyBP", "scoreBP", "xpBP", "isNeedClose", "", "isBlockingLoading", "(Ljava/lang/String;IIIIIZZ)V", "()Z", "isHasPremium", "getMoney", "()I", "getMoneyBP", "getPremium", "getScoreBP", "getTitleText", "()Ljava/lang/String;", "getXpBP", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
