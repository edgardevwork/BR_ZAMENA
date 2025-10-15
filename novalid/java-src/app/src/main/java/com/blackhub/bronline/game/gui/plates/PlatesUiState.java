package com.blackhub.bronline.game.gui.plates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatesUiState.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006*"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/plates/PlatesUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "countryId", "", "plateNumber", "", "plateRegion", "hintMainText", "currencyType", "priceOfPurchasePlate", "priceOfRefreshPlate", "isNeedShowRefresh", "", "isNewPlateInfoFromServer", "isNeedClose", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZZZ)V", "getCountryId", "()I", "getCurrencyType", "getHintMainText", "()Ljava/lang/String;", "()Z", "getPlateNumber", "getPlateRegion", "getPriceOfPurchasePlate", "getPriceOfRefreshPlate", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlatesUiState implements UiState {
    public static final int $stable = 0;
    public final int countryId;
    public final int currencyType;

    @NotNull
    public final String hintMainText;
    public final boolean isNeedClose;
    public final boolean isNeedShowRefresh;
    public final boolean isNewPlateInfoFromServer;

    @NotNull
    public final String plateNumber;

    @NotNull
    public final String plateRegion;
    public final int priceOfPurchasePlate;
    public final int priceOfRefreshPlate;

    public PlatesUiState() {
        this(0, null, null, null, 0, 0, 0, false, false, false, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountryId() {
        return this.countryId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlateNumber() {
        return this.plateNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlateRegion() {
        return this.plateRegion;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHintMainText() {
        return this.hintMainText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrencyType() {
        return this.currencyType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPriceOfPurchasePlate() {
        return this.priceOfPurchasePlate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriceOfRefreshPlate() {
        return this.priceOfRefreshPlate;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsNeedShowRefresh() {
        return this.isNeedShowRefresh;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsNewPlateInfoFromServer() {
        return this.isNewPlateInfoFromServer;
    }

    @NotNull
    public final PlatesUiState copy(int countryId, @NotNull String plateNumber, @NotNull String plateRegion, @NotNull String hintMainText, int currencyType, int priceOfPurchasePlate, int priceOfRefreshPlate, boolean isNeedShowRefresh, boolean isNewPlateInfoFromServer, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        Intrinsics.checkNotNullParameter(hintMainText, "hintMainText");
        return new PlatesUiState(countryId, plateNumber, plateRegion, hintMainText, currencyType, priceOfPurchasePlate, priceOfRefreshPlate, isNeedShowRefresh, isNewPlateInfoFromServer, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatesUiState)) {
            return false;
        }
        PlatesUiState platesUiState = (PlatesUiState) other;
        return this.countryId == platesUiState.countryId && Intrinsics.areEqual(this.plateNumber, platesUiState.plateNumber) && Intrinsics.areEqual(this.plateRegion, platesUiState.plateRegion) && Intrinsics.areEqual(this.hintMainText, platesUiState.hintMainText) && this.currencyType == platesUiState.currencyType && this.priceOfPurchasePlate == platesUiState.priceOfPurchasePlate && this.priceOfRefreshPlate == platesUiState.priceOfRefreshPlate && this.isNeedShowRefresh == platesUiState.isNeedShowRefresh && this.isNewPlateInfoFromServer == platesUiState.isNewPlateInfoFromServer && this.isNeedClose == platesUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.countryId) * 31) + this.plateNumber.hashCode()) * 31) + this.plateRegion.hashCode()) * 31) + this.hintMainText.hashCode()) * 31) + Integer.hashCode(this.currencyType)) * 31) + Integer.hashCode(this.priceOfPurchasePlate)) * 31) + Integer.hashCode(this.priceOfRefreshPlate)) * 31) + Boolean.hashCode(this.isNeedShowRefresh)) * 31) + Boolean.hashCode(this.isNewPlateInfoFromServer)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "PlatesUiState(countryId=" + this.countryId + ", plateNumber=" + this.plateNumber + ", plateRegion=" + this.plateRegion + ", hintMainText=" + this.hintMainText + ", currencyType=" + this.currencyType + ", priceOfPurchasePlate=" + this.priceOfPurchasePlate + ", priceOfRefreshPlate=" + this.priceOfRefreshPlate + ", isNeedShowRefresh=" + this.isNeedShowRefresh + ", isNewPlateInfoFromServer=" + this.isNewPlateInfoFromServer + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public PlatesUiState(int i, @NotNull String plateNumber, @NotNull String plateRegion, @NotNull String hintMainText, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        Intrinsics.checkNotNullParameter(hintMainText, "hintMainText");
        this.countryId = i;
        this.plateNumber = plateNumber;
        this.plateRegion = plateRegion;
        this.hintMainText = hintMainText;
        this.currencyType = i2;
        this.priceOfPurchasePlate = i3;
        this.priceOfRefreshPlate = i4;
        this.isNeedShowRefresh = z;
        this.isNewPlateInfoFromServer = z2;
        this.isNeedClose = z3;
    }

    public final int getCountryId() {
        return this.countryId;
    }

    public /* synthetic */ PlatesUiState(int i, String str, String str2, String str3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i5 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? false : z2, (i5 & 512) == 0 ? z3 : false);
    }

    @NotNull
    public final String getPlateNumber() {
        return this.plateNumber;
    }

    @NotNull
    public final String getPlateRegion() {
        return this.plateRegion;
    }

    @NotNull
    public final String getHintMainText() {
        return this.hintMainText;
    }

    public final int getCurrencyType() {
        return this.currencyType;
    }

    public final int getPriceOfPurchasePlate() {
        return this.priceOfPurchasePlate;
    }

    public final int getPriceOfRefreshPlate() {
        return this.priceOfRefreshPlate;
    }

    public final boolean isNeedShowRefresh() {
        return this.isNeedShowRefresh;
    }

    public final boolean isNewPlateInfoFromServer() {
        return this.isNewPlateInfoFromServer;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}
