package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\bh\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0002\u0010\u001fJ\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0011HÆ\u0003J\t\u0010s\u001a\u00020\u0013HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0019HÆ\u0003J\t\u0010y\u001a\u00020\u0019HÆ\u0003J\t\u0010z\u001a\u00020\u0019HÆ\u0003J\t\u0010{\u001a\u00020\u0019HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0019HÆ\u0003J\t\u0010~\u001a\u00020\u0019HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000fHÆ\u0003Jì\u0001\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019HÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0016\u0010\u0088\u0001\u001a\u00020\u00192\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010+\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u00102\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0011\u00104\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010&R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00107\"\u0004\bC\u00109R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00107\"\u0004\bE\u00109R\u0011\u0010F\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u0010&R\u0011\u0010H\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bI\u0010&R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010?\u001a\u0004\bJ\u0010>R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\bL\u0010/R\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010&R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010OR\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010OR\u0011\u0010\u001b\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010OR\u0011\u0010P\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bP\u0010OR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010O\"\u0004\bQ\u0010RR\u001a\u0010\u001c\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010O\"\u0004\bS\u0010RR\u001a\u0010\u001d\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010O\"\u0004\bT\u0010RR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00107R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010/\"\u0004\bY\u0010ZR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010/R\u0011\u0010]\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b^\u0010&R\u0011\u0010_\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b`\u0010&R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\bn\u0010/R\u0011\u0010o\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bp\u0010&¨\u0006\u008d\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "placeName", "", "moneyCash", "", "moneyCard", "fastestIndex", "demandedIndex", "prices", "", "coordinatesCurrent", "Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;", "coordinates", "selectedCompany", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;", "selectedRate", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;", "selectedPayment", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;", ClientCookie.COMMENT_ATTR, "driverName", "driverNumber", "driverAuto", "isAddressSelected", "", "isMapOpened", "isNeedClose", "isPointSelected", "isWaitingWindowOpened", "isOrderWindowVisible", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZ)V", "alpha", "", "getAlpha", "()F", "businessBorderColor", "getBusinessBorderColor", "()I", "businessPrice", "getBusinessPrice", "cardAlpha", "getCardAlpha", "cashAlpha", "getCashAlpha", "cityMobileButtonBrush", "getCityMobileButtonBrush", "()Ljava/util/List;", "cityMobileButtonPainter", "getCityMobileButtonPainter", "comfortBorderColor", "getComfortBorderColor", "comfortPrice", "getComfortPrice", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "getCoordinates", "()Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;", "getCoordinatesCurrent", "getDemandedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDriverAuto", "setDriverAuto", "getDriverName", "setDriverName", "getDriverNumber", "setDriverNumber", "economyBorderColor", "getEconomyBorderColor", "economyPrice", "getEconomyPrice", "getFastestIndex", "gettButtonBrush", "getGettButtonBrush", "gettButtonPainter", "getGettButtonPainter", "()Z", "isOrderButtonActive", "setOrderWindowVisible", "(Z)V", "setPointSelected", "setWaitingWindowOpened", "getMoneyCard", "getMoneyCash", "getPlaceName", "getPrices", "setPrices", "(Ljava/util/List;)V", "selectButtonBrush", "getSelectButtonBrush", "selectButtonColor", "getSelectButtonColor", "selectButtonText", "getSelectButtonText", "getSelectedCompany", "()Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;", "setSelectedCompany", "(Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;)V", "getSelectedPayment", "()Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;", "setSelectedPayment", "(Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;)V", "getSelectedRate", "()Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;", "setSelectedRate", "(Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;)V", "yandexButtonBrush", "getYandexButtonBrush", "yandexButtonPainter", "getYandexButtonPainter", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZ)Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderUiState;", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaxiOrderUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public String comment;

    @NotNull
    public final CoordinatesModel coordinates;

    @NotNull
    public final CoordinatesModel coordinatesCurrent;

    @Nullable
    public final Integer demandedIndex;

    @NotNull
    public String driverAuto;

    @NotNull
    public String driverName;

    @NotNull
    public String driverNumber;

    @Nullable
    public final Integer fastestIndex;
    public final boolean isAddressSelected;
    public final boolean isMapOpened;
    public final boolean isNeedClose;
    public boolean isOrderWindowVisible;
    public boolean isPointSelected;
    public boolean isWaitingWindowOpened;
    public final int moneyCard;
    public final int moneyCash;

    @NotNull
    public final String placeName;

    @NotNull
    public List<Integer> prices;

    @NotNull
    public TaxiCompanyEnum selectedCompany;

    @NotNull
    public TaxiPaymentEnum selectedPayment;

    @NotNull
    public TaxiRateEnum selectedRate;

    public TaxiOrderUiState() {
        this(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 2097151, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlaceName() {
        return this.placeName;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final TaxiRateEnum getSelectedRate() {
        return this.selectedRate;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final TaxiPaymentEnum getSelectedPayment() {
        return this.selectedPayment;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getDriverName() {
        return this.driverName;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getDriverNumber() {
        return this.driverNumber;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getDriverAuto() {
        return this.driverAuto;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsAddressSelected() {
        return this.isAddressSelected;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsMapOpened() {
        return this.isMapOpened;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsPointSelected() {
        return this.isPointSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMoneyCash() {
        return this.moneyCash;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsWaitingWindowOpened() {
        return this.isWaitingWindowOpened;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsOrderWindowVisible() {
        return this.isOrderWindowVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMoneyCard() {
        return this.moneyCard;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getFastestIndex() {
        return this.fastestIndex;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getDemandedIndex() {
        return this.demandedIndex;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.prices;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CoordinatesModel getCoordinatesCurrent() {
        return this.coordinatesCurrent;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CoordinatesModel getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final TaxiCompanyEnum getSelectedCompany() {
        return this.selectedCompany;
    }

    @NotNull
    public final TaxiOrderUiState copy(@NotNull String placeName, int moneyCash, int moneyCard, @Nullable Integer fastestIndex, @Nullable Integer demandedIndex, @NotNull List<Integer> prices, @NotNull CoordinatesModel coordinatesCurrent, @NotNull CoordinatesModel coordinates, @NotNull TaxiCompanyEnum selectedCompany, @NotNull TaxiRateEnum selectedRate, @NotNull TaxiPaymentEnum selectedPayment, @NotNull String str, @NotNull String driverName, @NotNull String driverNumber, @NotNull String driverAuto, boolean isAddressSelected, boolean isMapOpened, boolean isNeedClose, boolean isPointSelected, boolean isWaitingWindowOpened, boolean isOrderWindowVisible) {
        Intrinsics.checkNotNullParameter(placeName, "placeName");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(coordinatesCurrent, "coordinatesCurrent");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(selectedCompany, "selectedCompany");
        Intrinsics.checkNotNullParameter(selectedRate, "selectedRate");
        Intrinsics.checkNotNullParameter(selectedPayment, "selectedPayment");
        Intrinsics.checkNotNullParameter(str, "comment");
        Intrinsics.checkNotNullParameter(driverName, "driverName");
        Intrinsics.checkNotNullParameter(driverNumber, "driverNumber");
        Intrinsics.checkNotNullParameter(driverAuto, "driverAuto");
        return new TaxiOrderUiState(placeName, moneyCash, moneyCard, fastestIndex, demandedIndex, prices, coordinatesCurrent, coordinates, selectedCompany, selectedRate, selectedPayment, str, driverName, driverNumber, driverAuto, isAddressSelected, isMapOpened, isNeedClose, isPointSelected, isWaitingWindowOpened, isOrderWindowVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxiOrderUiState)) {
            return false;
        }
        TaxiOrderUiState taxiOrderUiState = (TaxiOrderUiState) other;
        return Intrinsics.areEqual(this.placeName, taxiOrderUiState.placeName) && this.moneyCash == taxiOrderUiState.moneyCash && this.moneyCard == taxiOrderUiState.moneyCard && Intrinsics.areEqual(this.fastestIndex, taxiOrderUiState.fastestIndex) && Intrinsics.areEqual(this.demandedIndex, taxiOrderUiState.demandedIndex) && Intrinsics.areEqual(this.prices, taxiOrderUiState.prices) && Intrinsics.areEqual(this.coordinatesCurrent, taxiOrderUiState.coordinatesCurrent) && Intrinsics.areEqual(this.coordinates, taxiOrderUiState.coordinates) && this.selectedCompany == taxiOrderUiState.selectedCompany && this.selectedRate == taxiOrderUiState.selectedRate && this.selectedPayment == taxiOrderUiState.selectedPayment && Intrinsics.areEqual(this.comment, taxiOrderUiState.comment) && Intrinsics.areEqual(this.driverName, taxiOrderUiState.driverName) && Intrinsics.areEqual(this.driverNumber, taxiOrderUiState.driverNumber) && Intrinsics.areEqual(this.driverAuto, taxiOrderUiState.driverAuto) && this.isAddressSelected == taxiOrderUiState.isAddressSelected && this.isMapOpened == taxiOrderUiState.isMapOpened && this.isNeedClose == taxiOrderUiState.isNeedClose && this.isPointSelected == taxiOrderUiState.isPointSelected && this.isWaitingWindowOpened == taxiOrderUiState.isWaitingWindowOpened && this.isOrderWindowVisible == taxiOrderUiState.isOrderWindowVisible;
    }

    public int hashCode() {
        int iHashCode = ((((this.placeName.hashCode() * 31) + Integer.hashCode(this.moneyCash)) * 31) + Integer.hashCode(this.moneyCard)) * 31;
        Integer num = this.fastestIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.demandedIndex;
        return ((((((((((((((((((((((((((((((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.prices.hashCode()) * 31) + this.coordinatesCurrent.hashCode()) * 31) + this.coordinates.hashCode()) * 31) + this.selectedCompany.hashCode()) * 31) + this.selectedRate.hashCode()) * 31) + this.selectedPayment.hashCode()) * 31) + this.comment.hashCode()) * 31) + this.driverName.hashCode()) * 31) + this.driverNumber.hashCode()) * 31) + this.driverAuto.hashCode()) * 31) + Boolean.hashCode(this.isAddressSelected)) * 31) + Boolean.hashCode(this.isMapOpened)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isPointSelected)) * 31) + Boolean.hashCode(this.isWaitingWindowOpened)) * 31) + Boolean.hashCode(this.isOrderWindowVisible);
    }

    @NotNull
    public String toString() {
        return "TaxiOrderUiState(placeName=" + this.placeName + ", moneyCash=" + this.moneyCash + ", moneyCard=" + this.moneyCard + ", fastestIndex=" + this.fastestIndex + ", demandedIndex=" + this.demandedIndex + ", prices=" + this.prices + ", coordinatesCurrent=" + this.coordinatesCurrent + ", coordinates=" + this.coordinates + ", selectedCompany=" + this.selectedCompany + ", selectedRate=" + this.selectedRate + ", selectedPayment=" + this.selectedPayment + ", comment=" + this.comment + ", driverName=" + this.driverName + ", driverNumber=" + this.driverNumber + ", driverAuto=" + this.driverAuto + ", isAddressSelected=" + this.isAddressSelected + ", isMapOpened=" + this.isMapOpened + ", isNeedClose=" + this.isNeedClose + ", isPointSelected=" + this.isPointSelected + ", isWaitingWindowOpened=" + this.isWaitingWindowOpened + ", isOrderWindowVisible=" + this.isOrderWindowVisible + ")";
    }

    public TaxiOrderUiState(@NotNull String placeName, int i, int i2, @Nullable Integer num, @Nullable Integer num2, @NotNull List<Integer> prices, @NotNull CoordinatesModel coordinatesCurrent, @NotNull CoordinatesModel coordinates, @NotNull TaxiCompanyEnum selectedCompany, @NotNull TaxiRateEnum selectedRate, @NotNull TaxiPaymentEnum selectedPayment, @NotNull String comment, @NotNull String driverName, @NotNull String driverNumber, @NotNull String driverAuto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(placeName, "placeName");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(coordinatesCurrent, "coordinatesCurrent");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(selectedCompany, "selectedCompany");
        Intrinsics.checkNotNullParameter(selectedRate, "selectedRate");
        Intrinsics.checkNotNullParameter(selectedPayment, "selectedPayment");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(driverName, "driverName");
        Intrinsics.checkNotNullParameter(driverNumber, "driverNumber");
        Intrinsics.checkNotNullParameter(driverAuto, "driverAuto");
        this.placeName = placeName;
        this.moneyCash = i;
        this.moneyCard = i2;
        this.fastestIndex = num;
        this.demandedIndex = num2;
        this.prices = prices;
        this.coordinatesCurrent = coordinatesCurrent;
        this.coordinates = coordinates;
        this.selectedCompany = selectedCompany;
        this.selectedRate = selectedRate;
        this.selectedPayment = selectedPayment;
        this.comment = comment;
        this.driverName = driverName;
        this.driverNumber = driverNumber;
        this.driverAuto = driverAuto;
        this.isAddressSelected = z;
        this.isMapOpened = z2;
        this.isNeedClose = z3;
        this.isPointSelected = z4;
        this.isWaitingWindowOpened = z5;
        this.isOrderWindowVisible = z6;
    }

    public /* synthetic */ TaxiOrderUiState(String str, int i, int i2, Integer num, Integer num2, List list, CoordinatesModel coordinatesModel, CoordinatesModel coordinatesModel2, TaxiCompanyEnum taxiCompanyEnum, TaxiRateEnum taxiRateEnum, TaxiPaymentEnum taxiPaymentEnum, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num, (i3 & 16) == 0 ? num2 : null, (i3 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? new CoordinatesModel(0.0d, 0.0d, 3, null) : coordinatesModel, (i3 & 128) != 0 ? new CoordinatesModel(0.0d, 0.0d, 3, null) : coordinatesModel2, (i3 & 256) != 0 ? TaxiCompanyEnum.YANDEX_TAXI : taxiCompanyEnum, (i3 & 512) != 0 ? TaxiRateEnum.ECONOMY : taxiRateEnum, (i3 & 1024) != 0 ? TaxiPaymentEnum.CASH : taxiPaymentEnum, (i3 & 2048) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 4096) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i3 & 8192) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i3 & 16384) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i3 & 32768) != 0 ? false : z, (i3 & 65536) != 0 ? false : z2, (i3 & 131072) != 0 ? false : z3, (i3 & 262144) != 0 ? false : z4, (i3 & 524288) != 0 ? false : z5, (i3 & 1048576) != 0 ? false : z6);
    }

    @NotNull
    public final String getPlaceName() {
        return this.placeName;
    }

    public final int getMoneyCash() {
        return this.moneyCash;
    }

    public final int getMoneyCard() {
        return this.moneyCard;
    }

    @Nullable
    public final Integer getFastestIndex() {
        return this.fastestIndex;
    }

    @Nullable
    public final Integer getDemandedIndex() {
        return this.demandedIndex;
    }

    @NotNull
    public final List<Integer> getPrices() {
        return this.prices;
    }

    public final void setPrices(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.prices = list;
    }

    @NotNull
    public final CoordinatesModel getCoordinatesCurrent() {
        return this.coordinatesCurrent;
    }

    @NotNull
    public final CoordinatesModel getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final TaxiCompanyEnum getSelectedCompany() {
        return this.selectedCompany;
    }

    public final void setSelectedCompany(@NotNull TaxiCompanyEnum taxiCompanyEnum) {
        Intrinsics.checkNotNullParameter(taxiCompanyEnum, "<set-?>");
        this.selectedCompany = taxiCompanyEnum;
    }

    @NotNull
    public final TaxiRateEnum getSelectedRate() {
        return this.selectedRate;
    }

    public final void setSelectedRate(@NotNull TaxiRateEnum taxiRateEnum) {
        Intrinsics.checkNotNullParameter(taxiRateEnum, "<set-?>");
        this.selectedRate = taxiRateEnum;
    }

    @NotNull
    public final TaxiPaymentEnum getSelectedPayment() {
        return this.selectedPayment;
    }

    public final void setSelectedPayment(@NotNull TaxiPaymentEnum taxiPaymentEnum) {
        Intrinsics.checkNotNullParameter(taxiPaymentEnum, "<set-?>");
        this.selectedPayment = taxiPaymentEnum;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final void setComment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.comment = str;
    }

    @NotNull
    public final String getDriverName() {
        return this.driverName;
    }

    public final void setDriverName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.driverName = str;
    }

    @NotNull
    public final String getDriverNumber() {
        return this.driverNumber;
    }

    public final void setDriverNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.driverNumber = str;
    }

    @NotNull
    public final String getDriverAuto() {
        return this.driverAuto;
    }

    public final void setDriverAuto(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.driverAuto = str;
    }

    public final boolean isAddressSelected() {
        return this.isAddressSelected;
    }

    public final boolean isMapOpened() {
        return this.isMapOpened;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isPointSelected() {
        return this.isPointSelected;
    }

    public final void setPointSelected(boolean z) {
        this.isPointSelected = z;
    }

    public final boolean isWaitingWindowOpened() {
        return this.isWaitingWindowOpened;
    }

    public final void setWaitingWindowOpened(boolean z) {
        this.isWaitingWindowOpened = z;
    }

    public final boolean isOrderWindowVisible() {
        return this.isOrderWindowVisible;
    }

    public final void setOrderWindowVisible(boolean z) {
        this.isOrderWindowVisible = z;
    }

    public final float getAlpha() {
        return this.isPointSelected ? 1.0f : 0.0f;
    }

    public final float getCardAlpha() {
        return this.selectedPayment == TaxiPaymentEnum.CARD ? 1.0f : 0.5f;
    }

    public final float getCashAlpha() {
        return this.selectedPayment == TaxiPaymentEnum.CASH ? 1.0f : 0.5f;
    }

    public final boolean isOrderButtonActive() {
        List<Integer> list = this.prices;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int iIntValue = this.prices.get((this.selectedCompany.getIndex() * 3) + this.selectedRate.getIndex()).intValue();
        if (this.isAddressSelected) {
            return this.moneyCash > iIntValue || this.moneyCard > iIntValue;
        }
        return false;
    }

    public final int getSelectButtonText() {
        return this.isAddressSelected ? R.string.common_change : R.string.common_select;
    }

    public final int getSelectButtonColor() {
        return this.isAddressSelected ? R.color.orange : R.color.transparent;
    }

    @NotNull
    public final List<Integer> getSelectButtonBrush() {
        if (this.isAddressSelected) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.transparent), Integer.valueOf(R.color.transparent)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)});
    }

    public final int getYandexButtonPainter() {
        return this.selectedCompany == TaxiCompanyEnum.YANDEX_TAXI ? R.drawable.ic_taxi_element_active : R.drawable.ic_taxi_element_inactive;
    }

    public final int getGettButtonPainter() {
        return this.selectedCompany == TaxiCompanyEnum.GETT_TAXI ? R.drawable.ic_taxi_element_active : R.drawable.ic_taxi_element_inactive;
    }

    public final int getCityMobileButtonPainter() {
        return this.selectedCompany == TaxiCompanyEnum.CITY_MOBILE_TAXI ? R.drawable.ic_taxi_element_active : R.drawable.ic_taxi_element_inactive;
    }

    @NotNull
    public final List<Integer> getYandexButtonBrush() {
        if (this.selectedCompany == TaxiCompanyEnum.YANDEX_TAXI) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.total_black_50), Integer.valueOf(R.color.total_black_50)});
    }

    @NotNull
    public final List<Integer> getGettButtonBrush() {
        if (this.selectedCompany == TaxiCompanyEnum.GETT_TAXI) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.total_black_50), Integer.valueOf(R.color.total_black_50)});
    }

    @NotNull
    public final List<Integer> getCityMobileButtonBrush() {
        if (this.selectedCompany == TaxiCompanyEnum.CITY_MOBILE_TAXI) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.total_black_50), Integer.valueOf(R.color.total_black_50)});
    }

    public final int getEconomyPrice() {
        List<Integer> list = this.prices;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.prices.get((this.selectedCompany.getIndex() * 3) + TaxiRateEnum.ECONOMY.getIndex()).intValue();
    }

    public final int getBusinessPrice() {
        List<Integer> list = this.prices;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.prices.get((this.selectedCompany.getIndex() * 3) + TaxiRateEnum.BUSINESS.getIndex()).intValue();
    }

    public final int getComfortPrice() {
        List<Integer> list = this.prices;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.prices.get((this.selectedCompany.getIndex() * 3) + TaxiRateEnum.COMFORTABLE.getIndex()).intValue();
    }

    public final int getEconomyBorderColor() {
        return this.selectedRate == TaxiRateEnum.ECONOMY ? R.color.orange : R.color.transparent;
    }

    public final int getComfortBorderColor() {
        return this.selectedRate == TaxiRateEnum.COMFORTABLE ? R.color.orange : R.color.transparent;
    }

    public final int getBusinessBorderColor() {
        return this.selectedRate == TaxiRateEnum.BUSINESS ? R.color.orange : R.color.transparent;
    }
}
