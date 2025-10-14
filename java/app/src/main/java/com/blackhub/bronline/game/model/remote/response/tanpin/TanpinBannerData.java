package com.blackhub.bronline.game.model.remote.response.tanpin;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TanpinBannerData.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class TanpinBannerData {
    public static final int $stable = 0;

    @SerializedName("backGroundImage")
    @NotNull
    public final String bannerBgImage;

    @SerializedName("leftImage")
    @NotNull
    public final String bannerCaseImage;

    @SerializedName("rightImage")
    @NotNull
    public final String bannerRightImage;

    @SerializedName("buttonText")
    @NotNull
    public final String buttonText;

    @SerializedName("title2")
    @NotNull
    public final String congratulationText;

    @SerializedName("description1")
    @NotNull
    public final String currentCaseTitle;

    @SerializedName("title3")
    @NotNull
    public final String currentPrizesText;

    @SerializedName("description2")
    @NotNull
    public final String description;

    @SerializedName("description3")
    @NotNull
    public final String instructionRight;

    @SerializedName("title1")
    @NotNull
    public final String title;

    public TanpinBannerData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCurrentCaseTitle() {
        return this.currentCaseTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCongratulationText() {
        return this.congratulationText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCurrentPrizesText() {
        return this.currentPrizesText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInstructionRight() {
        return this.instructionRight;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBannerBgImage() {
        return this.bannerBgImage;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getBannerCaseImage() {
        return this.bannerCaseImage;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getBannerRightImage() {
        return this.bannerRightImage;
    }

    @NotNull
    public final TanpinBannerData copy(@NotNull String title, @NotNull String currentCaseTitle, @NotNull String congratulationText, @NotNull String description, @NotNull String currentPrizesText, @NotNull String instructionRight, @NotNull String bannerBgImage, @NotNull String bannerCaseImage, @NotNull String bannerRightImage, @NotNull String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currentCaseTitle, "currentCaseTitle");
        Intrinsics.checkNotNullParameter(congratulationText, "congratulationText");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(currentPrizesText, "currentPrizesText");
        Intrinsics.checkNotNullParameter(instructionRight, "instructionRight");
        Intrinsics.checkNotNullParameter(bannerBgImage, "bannerBgImage");
        Intrinsics.checkNotNullParameter(bannerCaseImage, "bannerCaseImage");
        Intrinsics.checkNotNullParameter(bannerRightImage, "bannerRightImage");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new TanpinBannerData(title, currentCaseTitle, congratulationText, description, currentPrizesText, instructionRight, bannerBgImage, bannerCaseImage, bannerRightImage, buttonText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TanpinBannerData)) {
            return false;
        }
        TanpinBannerData tanpinBannerData = (TanpinBannerData) other;
        return Intrinsics.areEqual(this.title, tanpinBannerData.title) && Intrinsics.areEqual(this.currentCaseTitle, tanpinBannerData.currentCaseTitle) && Intrinsics.areEqual(this.congratulationText, tanpinBannerData.congratulationText) && Intrinsics.areEqual(this.description, tanpinBannerData.description) && Intrinsics.areEqual(this.currentPrizesText, tanpinBannerData.currentPrizesText) && Intrinsics.areEqual(this.instructionRight, tanpinBannerData.instructionRight) && Intrinsics.areEqual(this.bannerBgImage, tanpinBannerData.bannerBgImage) && Intrinsics.areEqual(this.bannerCaseImage, tanpinBannerData.bannerCaseImage) && Intrinsics.areEqual(this.bannerRightImage, tanpinBannerData.bannerRightImage) && Intrinsics.areEqual(this.buttonText, tanpinBannerData.buttonText);
    }

    public int hashCode() {
        return (((((((((((((((((this.title.hashCode() * 31) + this.currentCaseTitle.hashCode()) * 31) + this.congratulationText.hashCode()) * 31) + this.description.hashCode()) * 31) + this.currentPrizesText.hashCode()) * 31) + this.instructionRight.hashCode()) * 31) + this.bannerBgImage.hashCode()) * 31) + this.bannerCaseImage.hashCode()) * 31) + this.bannerRightImage.hashCode()) * 31) + this.buttonText.hashCode();
    }

    @NotNull
    public String toString() {
        return "TanpinBannerData(title=" + this.title + ", currentCaseTitle=" + this.currentCaseTitle + ", congratulationText=" + this.congratulationText + ", description=" + this.description + ", currentPrizesText=" + this.currentPrizesText + ", instructionRight=" + this.instructionRight + ", bannerBgImage=" + this.bannerBgImage + ", bannerCaseImage=" + this.bannerCaseImage + ", bannerRightImage=" + this.bannerRightImage + ", buttonText=" + this.buttonText + ")";
    }

    public TanpinBannerData(@NotNull String title, @NotNull String currentCaseTitle, @NotNull String congratulationText, @NotNull String description, @NotNull String currentPrizesText, @NotNull String instructionRight, @NotNull String bannerBgImage, @NotNull String bannerCaseImage, @NotNull String bannerRightImage, @NotNull String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currentCaseTitle, "currentCaseTitle");
        Intrinsics.checkNotNullParameter(congratulationText, "congratulationText");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(currentPrizesText, "currentPrizesText");
        Intrinsics.checkNotNullParameter(instructionRight, "instructionRight");
        Intrinsics.checkNotNullParameter(bannerBgImage, "bannerBgImage");
        Intrinsics.checkNotNullParameter(bannerCaseImage, "bannerCaseImage");
        Intrinsics.checkNotNullParameter(bannerRightImage, "bannerRightImage");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.title = title;
        this.currentCaseTitle = currentCaseTitle;
        this.congratulationText = congratulationText;
        this.description = description;
        this.currentPrizesText = currentPrizesText;
        this.instructionRight = instructionRight;
        this.bannerBgImage = bannerBgImage;
        this.bannerCaseImage = bannerCaseImage;
        this.bannerRightImage = bannerRightImage;
        this.buttonText = buttonText;
    }

    public /* synthetic */ TanpinBannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str8, (i & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str9, (i & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str10);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getCurrentCaseTitle() {
        return this.currentCaseTitle;
    }

    @NotNull
    public final String getCongratulationText() {
        return this.congratulationText;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getCurrentPrizesText() {
        return this.currentPrizesText;
    }

    @NotNull
    public final String getInstructionRight() {
        return this.instructionRight;
    }

    @NotNull
    public final String getBannerBgImage() {
        return this.bannerBgImage;
    }

    @NotNull
    public final String getBannerCaseImage() {
        return this.bannerCaseImage;
    }

    @NotNull
    public final String getBannerRightImage() {
        return this.bannerRightImage;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }
}

