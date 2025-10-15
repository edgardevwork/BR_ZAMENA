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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemModel;", "", "title", "", "buttonText", "imageUri", "oldPrice", "", "actualPrice", "isDoublePrice", "", "valueOfSale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V", "getActualPrice", "()I", "getButtonText", "()Ljava/lang/String;", "getImageUri", "()Z", "getOldPrice", "getTitle", "getValueOfSale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
