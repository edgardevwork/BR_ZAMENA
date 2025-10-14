package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesCaseTypeDto.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CasesCaseTypeDto {
    public static final int $stable = 8;

    @SerializedName("awards")
    @NotNull
    public final List<CasesAwardDto> awards;

    @SerializedName("bgImage")
    @NotNull
    public final String bgImage;

    @SerializedName("bonus")
    @NotNull
    public final List<CasesBonusDto> bonus;

    @SerializedName("dates")
    @NotNull
    public final List<Long> dates;

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    @NotNull
    public final List<Integer> discount;

    @SerializedName("discountType")
    public final int discountType;

    @SerializedName("id")
    public final int id;

    @SerializedName("image")
    @NotNull
    public final String image;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @NotNull
    public final List<Integer> price;

    @SerializedName("sale")
    public final int sale;

    public CasesCaseTypeDto() {
        this(0, null, null, null, null, 0, 0, null, null, null, null, DoubleToDecimal.BQ_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<CasesAwardDto> component10() {
        return this.awards;
    }

    @NotNull
    public final List<CasesBonusDto> component11() {
        return this.bonus;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Long> component3() {
        return this.dates;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.price;
    }

    @NotNull
    public final List<Integer> component5() {
        return this.discount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDiscountType() {
        return this.discountType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSale() {
        return this.sale;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final CasesCaseTypeDto copy(int id, @NotNull String name, @NotNull List<Long> dates, @NotNull List<Integer> price, @NotNull List<Integer> discount, int discountType, int sale, @NotNull String image, @NotNull String bgImage, @NotNull List<CasesAwardDto> awards, @NotNull List<CasesBonusDto> bonus) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(awards, "awards");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        return new CasesCaseTypeDto(id, name, dates, price, discount, discountType, sale, image, bgImage, awards, bonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesCaseTypeDto)) {
            return false;
        }
        CasesCaseTypeDto casesCaseTypeDto = (CasesCaseTypeDto) other;
        return this.id == casesCaseTypeDto.id && Intrinsics.areEqual(this.name, casesCaseTypeDto.name) && Intrinsics.areEqual(this.dates, casesCaseTypeDto.dates) && Intrinsics.areEqual(this.price, casesCaseTypeDto.price) && Intrinsics.areEqual(this.discount, casesCaseTypeDto.discount) && this.discountType == casesCaseTypeDto.discountType && this.sale == casesCaseTypeDto.sale && Intrinsics.areEqual(this.image, casesCaseTypeDto.image) && Intrinsics.areEqual(this.bgImage, casesCaseTypeDto.bgImage) && Intrinsics.areEqual(this.awards, casesCaseTypeDto.awards) && Intrinsics.areEqual(this.bonus, casesCaseTypeDto.bonus);
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.dates.hashCode()) * 31) + this.price.hashCode()) * 31) + this.discount.hashCode()) * 31) + Integer.hashCode(this.discountType)) * 31) + Integer.hashCode(this.sale)) * 31) + this.image.hashCode()) * 31) + this.bgImage.hashCode()) * 31) + this.awards.hashCode()) * 31) + this.bonus.hashCode();
    }

    @NotNull
    public String toString() {
        return "CasesCaseTypeDto(id=" + this.id + ", name=" + this.name + ", dates=" + this.dates + ", price=" + this.price + ", discount=" + this.discount + ", discountType=" + this.discountType + ", sale=" + this.sale + ", image=" + this.image + ", bgImage=" + this.bgImage + ", awards=" + this.awards + ", bonus=" + this.bonus + ")";
    }

    public CasesCaseTypeDto(int i, @NotNull String name, @NotNull List<Long> dates, @NotNull List<Integer> price, @NotNull List<Integer> discount, int i2, int i3, @NotNull String image, @NotNull String bgImage, @NotNull List<CasesAwardDto> awards, @NotNull List<CasesBonusDto> bonus) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(awards, "awards");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        this.id = i;
        this.name = name;
        this.dates = dates;
        this.price = price;
        this.discount = discount;
        this.discountType = i2;
        this.sale = i3;
        this.image = image;
        this.bgImage = bgImage;
        this.awards = awards;
        this.bonus = bonus;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ CasesCaseTypeDto(int i, String str, List list, List list2, List list3, int i2, int i3, String str2, String str3, List list4, List list5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i4 & 32) != 0 ? 1 : i2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i4 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Long> getDates() {
        return this.dates;
    }

    @NotNull
    public final List<Integer> getPrice() {
        return this.price;
    }

    @NotNull
    public final List<Integer> getDiscount() {
        return this.discount;
    }

    public final int getDiscountType() {
        return this.discountType;
    }

    public final int getSale() {
        return this.sale;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final List<CasesAwardDto> getAwards() {
        return this.awards;
    }

    @NotNull
    public final List<CasesBonusDto> getBonus() {
        return this.bonus;
    }
}

