package com.blackhub.bronline.game.gui.rateapp;

import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.common.AppMetricaDescription;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RateAppUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003JU\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006,"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/rateapp/RateAppUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "listOfCheckedStars", "", "", "starChecked", "", "categoryId", "isFiveStars", "isButtonEnabled", "isNeedToRequestReview", "isNeedClose", "(Ljava/util/List;IIZZZZ)V", "categoryDescription", "", "getCategoryDescription", "()Ljava/lang/String;", "getCategoryId", "()I", "heightForButtonRatePlusShadow", "getHeightForButtonRatePlusShadow", "heightForItem", "getHeightForItem", "()Z", "getListOfCheckedStars", "()Ljava/util/List;", "paddingForButtonRate", "getPaddingForButtonRate", "getStarChecked", "widthForButtonRatePlusShadow", "getWidthForButtonRatePlusShadow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRateAppUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppUiState.kt\ncom/blackhub/bronline/game/gui/rateapp/RateAppUiState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class RateAppUiState implements UiState {
    public static final int $stable = 8;
    public final int categoryId;
    public final boolean isButtonEnabled;
    public final boolean isFiveStars;
    public final boolean isNeedClose;
    public final boolean isNeedToRequestReview;

    @NotNull
    public final List<Boolean> listOfCheckedStars;
    public final int starChecked;

    public RateAppUiState() {
        this(null, 0, 0, false, false, false, false, 127, null);
    }

    public static /* synthetic */ RateAppUiState copy$default(RateAppUiState rateAppUiState, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = rateAppUiState.listOfCheckedStars;
        }
        if ((i3 & 2) != 0) {
            i = rateAppUiState.starChecked;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = rateAppUiState.categoryId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z = rateAppUiState.isFiveStars;
        }
        boolean z5 = z;
        if ((i3 & 16) != 0) {
            z2 = rateAppUiState.isButtonEnabled;
        }
        boolean z6 = z2;
        if ((i3 & 32) != 0) {
            z3 = rateAppUiState.isNeedToRequestReview;
        }
        boolean z7 = z3;
        if ((i3 & 64) != 0) {
            z4 = rateAppUiState.isNeedClose;
        }
        return rateAppUiState.copy(list, i4, i5, z5, z6, z7, z4);
    }

    @NotNull
    public final List<Boolean> component1() {
        return this.listOfCheckedStars;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStarChecked() {
        return this.starChecked;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFiveStars() {
        return this.isFiveStars;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNeedToRequestReview() {
        return this.isNeedToRequestReview;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final RateAppUiState copy(@NotNull List<Boolean> listOfCheckedStars, int starChecked, int categoryId, boolean isFiveStars, boolean isButtonEnabled, boolean isNeedToRequestReview, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(listOfCheckedStars, "listOfCheckedStars");
        return new RateAppUiState(listOfCheckedStars, starChecked, categoryId, isFiveStars, isButtonEnabled, isNeedToRequestReview, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAppUiState)) {
            return false;
        }
        RateAppUiState rateAppUiState = (RateAppUiState) other;
        return Intrinsics.areEqual(this.listOfCheckedStars, rateAppUiState.listOfCheckedStars) && this.starChecked == rateAppUiState.starChecked && this.categoryId == rateAppUiState.categoryId && this.isFiveStars == rateAppUiState.isFiveStars && this.isButtonEnabled == rateAppUiState.isButtonEnabled && this.isNeedToRequestReview == rateAppUiState.isNeedToRequestReview && this.isNeedClose == rateAppUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((((((this.listOfCheckedStars.hashCode() * 31) + Integer.hashCode(this.starChecked)) * 31) + Integer.hashCode(this.categoryId)) * 31) + Boolean.hashCode(this.isFiveStars)) * 31) + Boolean.hashCode(this.isButtonEnabled)) * 31) + Boolean.hashCode(this.isNeedToRequestReview)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "RateAppUiState(listOfCheckedStars=" + this.listOfCheckedStars + ", starChecked=" + this.starChecked + ", categoryId=" + this.categoryId + ", isFiveStars=" + this.isFiveStars + ", isButtonEnabled=" + this.isButtonEnabled + ", isNeedToRequestReview=" + this.isNeedToRequestReview + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public RateAppUiState(@NotNull List<Boolean> listOfCheckedStars, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(listOfCheckedStars, "listOfCheckedStars");
        this.listOfCheckedStars = listOfCheckedStars;
        this.starChecked = i;
        this.categoryId = i2;
        this.isFiveStars = z;
        this.isButtonEnabled = z2;
        this.isNeedToRequestReview = z3;
        this.isNeedClose = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public /* synthetic */ RateAppUiState(List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        List arrayList;
        if ((i3 & 1) != 0) {
            arrayList = new ArrayList(5);
            for (int i4 = 0; i4 < 5; i4++) {
                arrayList.add(Boolean.FALSE);
            }
        } else {
            arrayList = list;
        }
        this(arrayList, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) == 0 ? z4 : false);
    }

    @NotNull
    public final List<Boolean> getListOfCheckedStars() {
        return this.listOfCheckedStars;
    }

    public final int getStarChecked() {
        return this.starChecked;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final boolean isFiveStars() {
        return this.isFiveStars;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isNeedToRequestReview() {
        return this.isNeedToRequestReview;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @DimenRes
    public final int getHeightForItem() {
        return this.isFiveStars ? R.dimen._141sdp : R.dimen._170sdp;
    }

    @DimenRes
    public final int getHeightForButtonRatePlusShadow() {
        return this.isButtonEnabled ? R.dimen._40sdp : R.dimen._30sdp;
    }

    @DimenRes
    public final int getWidthForButtonRatePlusShadow() {
        return this.isButtonEnabled ? R.dimen._130sdp : R.dimen._117sdp;
    }

    @DimenRes
    public final int getPaddingForButtonRate() {
        return this.isButtonEnabled ? R.dimen.zero_dp : R.dimen._5sdp;
    }

    @NotNull
    public final String getCategoryDescription() {
        switch (this.categoryId) {
            case 1:
                return AppMetricaDescription.BOUGHT_HOUSE;
            case 2:
                return AppMetricaDescription.BOUGHT_CAR;
            case 3:
                return AppMetricaDescription.OPENED_CASE;
            case 4:
                return AppMetricaDescription.BOUGHT_BUSINESS;
            case 5:
                return AppMetricaDescription.DONATE;
            case 6:
                return AppMetricaDescription.JOINED_FAMILY_OR_FRACTION;
            case 7:
                return AppMetricaDescription.GOT_INCREASE_IN_FRACTION;
            case 8:
                return AppMetricaDescription.TASK_COMPLETED;
            case 9:
                return AppMetricaDescription.BOUGHT_SOMETHING_IN_DONATE;
            case 10:
                return AppMetricaDescription.SUCCESSFULLY_OPENED_CONTAINER;
            case 11:
                return AppMetricaDescription.BOUGHT_ACCESSORY;
            case 12:
                return AppMetricaDescription.BOUGHT_CLOTHES;
            case 13:
                return AppMetricaDescription.SET_LEADER;
            case 14:
                return AppMetricaDescription.SET_ADMIN;
            case 15:
                return AppMetricaDescription.WON_IN_CASINO;
            case 16:
                return AppMetricaDescription.AFTER_WORK;
            default:
                return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
    }
}
