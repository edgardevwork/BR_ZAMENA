package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasePricesModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J¦\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0006HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u0006<"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CasePricesModel;", "", "priceOneCaseFormatted", "", "priceTenCasesFormatted", "priceOneCase", "", "priceTenCases", "discountOneCase", "discountTenCase", "salePriceOneCaseFormatted", "salePriceTenCasesFormatted", "salePriceOneCase", "salePriceTenCases", "oneAlpha", "", "tenAlpha", "typeOpenOneCaseButton", "typeOpenTenCaseButton", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;FFII)V", "getDiscountOneCase", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiscountTenCase", "getOneAlpha", "()F", "getPriceOneCase", "()I", "getPriceOneCaseFormatted", "()Ljava/lang/String;", "getPriceTenCases", "getPriceTenCasesFormatted", "getSalePriceOneCase", "getSalePriceOneCaseFormatted", "getSalePriceTenCases", "getSalePriceTenCasesFormatted", "getTenAlpha", "getTypeOpenOneCaseButton", "getTypeOpenTenCaseButton", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;FFII)Lcom/blackhub/bronline/game/gui/cases/model/CasePricesModel;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasePricesModel {
    public static final int $stable = 0;

    @Nullable
    public final Integer discountOneCase;

    @Nullable
    public final Integer discountTenCase;
    public final float oneAlpha;
    public final int priceOneCase;

    @NotNull
    public final String priceOneCaseFormatted;
    public final int priceTenCases;

    @NotNull
    public final String priceTenCasesFormatted;

    @Nullable
    public final Integer salePriceOneCase;

    @Nullable
    public final String salePriceOneCaseFormatted;

    @Nullable
    public final Integer salePriceTenCases;

    @Nullable
    public final String salePriceTenCasesFormatted;
    public final float tenAlpha;
    public final int typeOpenOneCaseButton;
    public final int typeOpenTenCaseButton;

    public CasePricesModel() {
        this(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPriceOneCaseFormatted() {
        return this.priceOneCaseFormatted;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getSalePriceTenCases() {
        return this.salePriceTenCases;
    }

    /* renamed from: component11, reason: from getter */
    public final float getOneAlpha() {
        return this.oneAlpha;
    }

    /* renamed from: component12, reason: from getter */
    public final float getTenAlpha() {
        return this.tenAlpha;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTypeOpenOneCaseButton() {
        return this.typeOpenOneCaseButton;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTypeOpenTenCaseButton() {
        return this.typeOpenTenCaseButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPriceTenCasesFormatted() {
        return this.priceTenCasesFormatted;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPriceOneCase() {
        return this.priceOneCase;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPriceTenCases() {
        return this.priceTenCases;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getDiscountOneCase() {
        return this.discountOneCase;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getDiscountTenCase() {
        return this.discountTenCase;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSalePriceOneCaseFormatted() {
        return this.salePriceOneCaseFormatted;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getSalePriceTenCasesFormatted() {
        return this.salePriceTenCasesFormatted;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getSalePriceOneCase() {
        return this.salePriceOneCase;
    }

    @NotNull
    public final CasePricesModel copy(@NotNull String priceOneCaseFormatted, @NotNull String priceTenCasesFormatted, int priceOneCase, int priceTenCases, @Nullable Integer discountOneCase, @Nullable Integer discountTenCase, @Nullable String salePriceOneCaseFormatted, @Nullable String salePriceTenCasesFormatted, @Nullable Integer salePriceOneCase, @Nullable Integer salePriceTenCases, float oneAlpha, float tenAlpha, int typeOpenOneCaseButton, int typeOpenTenCaseButton) {
        Intrinsics.checkNotNullParameter(priceOneCaseFormatted, "priceOneCaseFormatted");
        Intrinsics.checkNotNullParameter(priceTenCasesFormatted, "priceTenCasesFormatted");
        return new CasePricesModel(priceOneCaseFormatted, priceTenCasesFormatted, priceOneCase, priceTenCases, discountOneCase, discountTenCase, salePriceOneCaseFormatted, salePriceTenCasesFormatted, salePriceOneCase, salePriceTenCases, oneAlpha, tenAlpha, typeOpenOneCaseButton, typeOpenTenCaseButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasePricesModel)) {
            return false;
        }
        CasePricesModel casePricesModel = (CasePricesModel) other;
        return Intrinsics.areEqual(this.priceOneCaseFormatted, casePricesModel.priceOneCaseFormatted) && Intrinsics.areEqual(this.priceTenCasesFormatted, casePricesModel.priceTenCasesFormatted) && this.priceOneCase == casePricesModel.priceOneCase && this.priceTenCases == casePricesModel.priceTenCases && Intrinsics.areEqual(this.discountOneCase, casePricesModel.discountOneCase) && Intrinsics.areEqual(this.discountTenCase, casePricesModel.discountTenCase) && Intrinsics.areEqual(this.salePriceOneCaseFormatted, casePricesModel.salePriceOneCaseFormatted) && Intrinsics.areEqual(this.salePriceTenCasesFormatted, casePricesModel.salePriceTenCasesFormatted) && Intrinsics.areEqual(this.salePriceOneCase, casePricesModel.salePriceOneCase) && Intrinsics.areEqual(this.salePriceTenCases, casePricesModel.salePriceTenCases) && Float.compare(this.oneAlpha, casePricesModel.oneAlpha) == 0 && Float.compare(this.tenAlpha, casePricesModel.tenAlpha) == 0 && this.typeOpenOneCaseButton == casePricesModel.typeOpenOneCaseButton && this.typeOpenTenCaseButton == casePricesModel.typeOpenTenCaseButton;
    }

    public int hashCode() {
        int iHashCode = ((((((this.priceOneCaseFormatted.hashCode() * 31) + this.priceTenCasesFormatted.hashCode()) * 31) + Integer.hashCode(this.priceOneCase)) * 31) + Integer.hashCode(this.priceTenCases)) * 31;
        Integer num = this.discountOneCase;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discountTenCase;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.salePriceOneCaseFormatted;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.salePriceTenCasesFormatted;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.salePriceOneCase;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.salePriceTenCases;
        return ((((((((iHashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31) + Float.hashCode(this.oneAlpha)) * 31) + Float.hashCode(this.tenAlpha)) * 31) + Integer.hashCode(this.typeOpenOneCaseButton)) * 31) + Integer.hashCode(this.typeOpenTenCaseButton);
    }

    @NotNull
    public String toString() {
        return "CasePricesModel(priceOneCaseFormatted=" + this.priceOneCaseFormatted + ", priceTenCasesFormatted=" + this.priceTenCasesFormatted + ", priceOneCase=" + this.priceOneCase + ", priceTenCases=" + this.priceTenCases + ", discountOneCase=" + this.discountOneCase + ", discountTenCase=" + this.discountTenCase + ", salePriceOneCaseFormatted=" + this.salePriceOneCaseFormatted + ", salePriceTenCasesFormatted=" + this.salePriceTenCasesFormatted + ", salePriceOneCase=" + this.salePriceOneCase + ", salePriceTenCases=" + this.salePriceTenCases + ", oneAlpha=" + this.oneAlpha + ", tenAlpha=" + this.tenAlpha + ", typeOpenOneCaseButton=" + this.typeOpenOneCaseButton + ", typeOpenTenCaseButton=" + this.typeOpenTenCaseButton + ")";
    }

    public CasePricesModel(@NotNull String priceOneCaseFormatted, @NotNull String priceTenCasesFormatted, int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, float f, float f2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(priceOneCaseFormatted, "priceOneCaseFormatted");
        Intrinsics.checkNotNullParameter(priceTenCasesFormatted, "priceTenCasesFormatted");
        this.priceOneCaseFormatted = priceOneCaseFormatted;
        this.priceTenCasesFormatted = priceTenCasesFormatted;
        this.priceOneCase = i;
        this.priceTenCases = i2;
        this.discountOneCase = num;
        this.discountTenCase = num2;
        this.salePriceOneCaseFormatted = str;
        this.salePriceTenCasesFormatted = str2;
        this.salePriceOneCase = num3;
        this.salePriceTenCases = num4;
        this.oneAlpha = f;
        this.tenAlpha = f2;
        this.typeOpenOneCaseButton = i3;
        this.typeOpenTenCaseButton = i4;
    }

    public /* synthetic */ CasePricesModel(String str, String str2, int i, int i2, Integer num, Integer num2, String str3, String str4, Integer num3, Integer num4, float f, float f2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : num2, (i5 & 64) != 0 ? null : str3, (i5 & 128) != 0 ? null : str4, (i5 & 256) != 0 ? null : num3, (i5 & 512) == 0 ? num4 : null, (i5 & 1024) != 0 ? 1.0f : f, (i5 & 2048) == 0 ? f2 : 1.0f, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) == 0 ? i4 : 0);
    }

    @NotNull
    public final String getPriceOneCaseFormatted() {
        return this.priceOneCaseFormatted;
    }

    @NotNull
    public final String getPriceTenCasesFormatted() {
        return this.priceTenCasesFormatted;
    }

    public final int getPriceOneCase() {
        return this.priceOneCase;
    }

    public final int getPriceTenCases() {
        return this.priceTenCases;
    }

    @Nullable
    public final Integer getDiscountOneCase() {
        return this.discountOneCase;
    }

    @Nullable
    public final Integer getDiscountTenCase() {
        return this.discountTenCase;
    }

    @Nullable
    public final String getSalePriceOneCaseFormatted() {
        return this.salePriceOneCaseFormatted;
    }

    @Nullable
    public final String getSalePriceTenCasesFormatted() {
        return this.salePriceTenCasesFormatted;
    }

    @Nullable
    public final Integer getSalePriceOneCase() {
        return this.salePriceOneCase;
    }

    @Nullable
    public final Integer getSalePriceTenCases() {
        return this.salePriceTenCases;
    }

    public final float getOneAlpha() {
        return this.oneAlpha;
    }

    public final float getTenAlpha() {
        return this.tenAlpha;
    }

    public final int getTypeOpenOneCaseButton() {
        return this.typeOpenOneCaseButton;
    }

    public final int getTypeOpenTenCaseButton() {
        return this.typeOpenTenCaseButton;
    }
}
