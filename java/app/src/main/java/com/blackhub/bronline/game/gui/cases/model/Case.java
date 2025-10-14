package com.blackhub.bronline.game.gui.cases.model;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Case.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class Case {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImageBitmap;

    @NotNull
    public final List<CaseBonus> caseBonusList;

    @NotNull
    public final List<CaseReward> caseRewardList;
    public int count;

    @Nullable
    public final String dates;

    @NotNull
    public final List<Integer> discount;
    public final int discountType;
    public final int id;

    @Nullable
    public final Bitmap imageBitmap;
    public final boolean isSale;
    public final boolean isUsedSale;

    @NotNull
    public final String name;

    @NotNull
    public final List<Integer> price;
    public final int scrolledPosition;

    @NotNull
    public final CaseReward scrolledReward;
    public final int type;

    public Case() {
        this(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<Integer> component10() {
        return this.discount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getDiscountType() {
        return this.discountType;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSale() {
        return this.isSale;
    }

    @NotNull
    public final List<CaseReward> component13() {
        return this.caseRewardList;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final CaseReward getScrolledReward() {
        return this.scrolledReward;
    }

    /* renamed from: component15, reason: from getter */
    public final int getScrolledPosition() {
        return this.scrolledPosition;
    }

    @NotNull
    public final List<CaseBonus> component16() {
        return this.caseBonusList;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsUsedSale() {
        return this.isUsedSale;
    }

    /* renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getDates() {
        return this.dates;
    }

    @NotNull
    public final List<Integer> component9() {
        return this.price;
    }

    @NotNull
    public final Case copy(int id, @NotNull String name, @Nullable Bitmap imageBitmap, @Nullable Bitmap bgImageBitmap, int count, boolean isUsedSale, int type, @Nullable String dates, @NotNull List<Integer> price, @NotNull List<Integer> discount, int discountType, boolean isSale, @NotNull List<CaseReward> caseRewardList, @NotNull CaseReward scrolledReward, int scrolledPosition, @NotNull List<CaseBonus> caseBonusList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(caseRewardList, "caseRewardList");
        Intrinsics.checkNotNullParameter(scrolledReward, "scrolledReward");
        Intrinsics.checkNotNullParameter(caseBonusList, "caseBonusList");
        return new Case(id, name, imageBitmap, bgImageBitmap, count, isUsedSale, type, dates, price, discount, discountType, isSale, caseRewardList, scrolledReward, scrolledPosition, caseBonusList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Case)) {
            return false;
        }
        Case r5 = (Case) other;
        return this.id == r5.id && Intrinsics.areEqual(this.name, r5.name) && Intrinsics.areEqual(this.imageBitmap, r5.imageBitmap) && Intrinsics.areEqual(this.bgImageBitmap, r5.bgImageBitmap) && this.count == r5.count && this.isUsedSale == r5.isUsedSale && this.type == r5.type && Intrinsics.areEqual(this.dates, r5.dates) && Intrinsics.areEqual(this.price, r5.price) && Intrinsics.areEqual(this.discount, r5.discount) && this.discountType == r5.discountType && this.isSale == r5.isSale && Intrinsics.areEqual(this.caseRewardList, r5.caseRewardList) && Intrinsics.areEqual(this.scrolledReward, r5.scrolledReward) && this.scrolledPosition == r5.scrolledPosition && Intrinsics.areEqual(this.caseBonusList, r5.caseBonusList);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31;
        Bitmap bitmap = this.imageBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.bgImageBitmap;
        int iHashCode3 = (((((((iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.isUsedSale)) * 31) + Integer.hashCode(this.type)) * 31;
        String str = this.dates;
        return ((((((((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.price.hashCode()) * 31) + this.discount.hashCode()) * 31) + Integer.hashCode(this.discountType)) * 31) + Boolean.hashCode(this.isSale)) * 31) + this.caseRewardList.hashCode()) * 31) + this.scrolledReward.hashCode()) * 31) + Integer.hashCode(this.scrolledPosition)) * 31) + this.caseBonusList.hashCode();
    }

    @NotNull
    public String toString() {
        return "Case(id=" + this.id + ", name=" + this.name + ", imageBitmap=" + this.imageBitmap + ", bgImageBitmap=" + this.bgImageBitmap + ", count=" + this.count + ", isUsedSale=" + this.isUsedSale + ", type=" + this.type + ", dates=" + this.dates + ", price=" + this.price + ", discount=" + this.discount + ", discountType=" + this.discountType + ", isSale=" + this.isSale + ", caseRewardList=" + this.caseRewardList + ", scrolledReward=" + this.scrolledReward + ", scrolledPosition=" + this.scrolledPosition + ", caseBonusList=" + this.caseBonusList + ")";
    }

    public Case(int i, @NotNull String name, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, int i2, boolean z, int i3, @Nullable String str, @NotNull List<Integer> price, @NotNull List<Integer> discount, int i4, boolean z2, @NotNull List<CaseReward> caseRewardList, @NotNull CaseReward scrolledReward, int i5, @NotNull List<CaseBonus> caseBonusList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(caseRewardList, "caseRewardList");
        Intrinsics.checkNotNullParameter(scrolledReward, "scrolledReward");
        Intrinsics.checkNotNullParameter(caseBonusList, "caseBonusList");
        this.id = i;
        this.name = name;
        this.imageBitmap = bitmap;
        this.bgImageBitmap = bitmap2;
        this.count = i2;
        this.isUsedSale = z;
        this.type = i3;
        this.dates = str;
        this.price = price;
        this.discount = discount;
        this.discountType = i4;
        this.isSale = z2;
        this.caseRewardList = caseRewardList;
        this.scrolledReward = scrolledReward;
        this.scrolledPosition = i5;
        this.caseBonusList = caseBonusList;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ Case(int i, String str, Bitmap bitmap, Bitmap bitmap2, int i2, boolean z, int i3, String str2, List list, List list2, int i4, boolean z2, List list3, CaseReward caseReward, int i5, List list4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 4) != 0 ? null : bitmap, (i6 & 8) != 0 ? null : bitmap2, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? false : z, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) == 0 ? str2 : null, (i6 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i6 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i6 & 1024) != 0 ? 1 : i4, (i6 & 2048) != 0 ? false : z2, (i6 & 4096) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i6 & 8192) != 0 ? new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null) : caseReward, (i6 & 16384) != 0 ? 0 : i5, (i6 & 32768) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    @Nullable
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final boolean isUsedSale() {
        return this.isUsedSale;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getDates() {
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

    public final boolean isSale() {
        return this.isSale;
    }

    @NotNull
    public final List<CaseReward> getCaseRewardList() {
        return this.caseRewardList;
    }

    @NotNull
    public final CaseReward getScrolledReward() {
        return this.scrolledReward;
    }

    public final int getScrolledPosition() {
        return this.scrolledPosition;
    }

    @NotNull
    public final List<CaseBonus> getCaseBonusList() {
        return this.caseBonusList;
    }
}

