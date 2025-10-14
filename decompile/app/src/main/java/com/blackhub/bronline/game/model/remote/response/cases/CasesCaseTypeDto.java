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
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c¨\u00063"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/cases/CasesCaseTypeDto;", "", "id", "", "name", "", "dates", "", "", FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.DISCOUNT, "discountType", "sale", "image", "bgImage", "awards", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "bonus", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBonusDto;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAwards", "()Ljava/util/List;", "getBgImage", "()Ljava/lang/String;", "getBonus", "getDates", "getDiscount", "getDiscountType", "()I", "getId", "getImage", "getName", "getPrice", "getSale", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
