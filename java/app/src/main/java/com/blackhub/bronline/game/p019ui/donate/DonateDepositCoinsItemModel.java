package com.blackhub.bronline.game.p019ui.donate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateDepositCoinsItemModel.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class DonateDepositCoinsItemModel {
    public static final int $stable = 0;
    public final int actualPrice;

    @NotNull
    public final String buttonText;

    @NotNull
    public final String imageUri;
    public final boolean isDoublePrice;
    public final int oldPrice;

    @NotNull
    public final String title;

    @NotNull
    public final String valueOfSale;

    public static /* synthetic */ DonateDepositCoinsItemModel copy$default(DonateDepositCoinsItemModel donateDepositCoinsItemModel, String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = donateDepositCoinsItemModel.title;
        }
        if ((i3 & 2) != 0) {
            str2 = donateDepositCoinsItemModel.buttonText;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = donateDepositCoinsItemModel.imageUri;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            i = donateDepositCoinsItemModel.oldPrice;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = donateDepositCoinsItemModel.actualPrice;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = donateDepositCoinsItemModel.isDoublePrice;
        }
        boolean z2 = z;
        if ((i3 & 64) != 0) {
            str4 = donateDepositCoinsItemModel.valueOfSale;
        }
        return donateDepositCoinsItemModel.copy(str, str5, str6, i4, i5, z2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageUri() {
        return this.imageUri;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOldPrice() {
        return this.oldPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final int getActualPrice() {
        return this.actualPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDoublePrice() {
        return this.isDoublePrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getValueOfSale() {
        return this.valueOfSale;
    }

    @NotNull
    public final DonateDepositCoinsItemModel copy(@NotNull String title, @NotNull String buttonText, @NotNull String imageUri, int oldPrice, int actualPrice, boolean isDoublePrice, @NotNull String valueOfSale) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(valueOfSale, "valueOfSale");
        return new DonateDepositCoinsItemModel(title, buttonText, imageUri, oldPrice, actualPrice, isDoublePrice, valueOfSale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonateDepositCoinsItemModel)) {
            return false;
        }
        DonateDepositCoinsItemModel donateDepositCoinsItemModel = (DonateDepositCoinsItemModel) other;
        return Intrinsics.areEqual(this.title, donateDepositCoinsItemModel.title) && Intrinsics.areEqual(this.buttonText, donateDepositCoinsItemModel.buttonText) && Intrinsics.areEqual(this.imageUri, donateDepositCoinsItemModel.imageUri) && this.oldPrice == donateDepositCoinsItemModel.oldPrice && this.actualPrice == donateDepositCoinsItemModel.actualPrice && this.isDoublePrice == donateDepositCoinsItemModel.isDoublePrice && Intrinsics.areEqual(this.valueOfSale, donateDepositCoinsItemModel.valueOfSale);
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.buttonText.hashCode()) * 31) + this.imageUri.hashCode()) * 31) + Integer.hashCode(this.oldPrice)) * 31) + Integer.hashCode(this.actualPrice)) * 31) + Boolean.hashCode(this.isDoublePrice)) * 31) + this.valueOfSale.hashCode();
    }

    @NotNull
    public String toString() {
        return "DonateDepositCoinsItemModel(title=" + this.title + ", buttonText=" + this.buttonText + ", imageUri=" + this.imageUri + ", oldPrice=" + this.oldPrice + ", actualPrice=" + this.actualPrice + ", isDoublePrice=" + this.isDoublePrice + ", valueOfSale=" + this.valueOfSale + ")";
    }

    public DonateDepositCoinsItemModel(@NotNull String title, @NotNull String buttonText, @NotNull String imageUri, int i, int i2, boolean z, @NotNull String valueOfSale) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(valueOfSale, "valueOfSale");
        this.title = title;
        this.buttonText = buttonText;
        this.imageUri = imageUri;
        this.oldPrice = i;
        this.actualPrice = i2;
        this.isDoublePrice = z;
        this.valueOfSale = valueOfSale;
    }

    public /* synthetic */ DonateDepositCoinsItemModel(String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, str3, i, i2, z, str4);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getImageUri() {
        return this.imageUri;
    }

    public final int getOldPrice() {
        return this.oldPrice;
    }

    public final int getActualPrice() {
        return this.actualPrice;
    }

    public final boolean isDoublePrice() {
        return this.isDoublePrice;
    }

    @NotNull
    public final String getValueOfSale() {
        return this.valueOfSale;
    }
}

