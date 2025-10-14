package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBannerDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class CasesBannerDto {
    public static final int $stable = 0;

    @SerializedName("backGroundDescription")
    @NotNull
    public final String backGroundDescription;

    @SerializedName("backGroundImage")
    @NotNull
    public final String backGroundImage;

    @SerializedName("backGroundTitle")
    @NotNull
    public final String backGroundTitle;

    @SerializedName("caseId")
    public final int caseId;

    @SerializedName("caseImage")
    @NotNull
    public final String caseImage;

    @SerializedName("caseRewardsPreviewId")
    public final int caseRewardsPreviewId;

    @SerializedName("rightImage")
    @NotNull
    public final String rightImage;

    public CasesBannerDto() {
        this(0, 0, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CasesBannerDto copy$default(CasesBannerDto casesBannerDto, int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = casesBannerDto.caseId;
        }
        if ((i3 & 2) != 0) {
            i2 = casesBannerDto.caseRewardsPreviewId;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = casesBannerDto.caseImage;
        }
        String str6 = str;
        if ((i3 & 8) != 0) {
            str2 = casesBannerDto.backGroundTitle;
        }
        String str7 = str2;
        if ((i3 & 16) != 0) {
            str3 = casesBannerDto.backGroundDescription;
        }
        String str8 = str3;
        if ((i3 & 32) != 0) {
            str4 = casesBannerDto.backGroundImage;
        }
        String str9 = str4;
        if ((i3 & 64) != 0) {
            str5 = casesBannerDto.rightImage;
        }
        return casesBannerDto.copy(i, i4, str6, str7, str8, str9, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCaseId() {
        return this.caseId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCaseRewardsPreviewId() {
        return this.caseRewardsPreviewId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCaseImage() {
        return this.caseImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackGroundTitle() {
        return this.backGroundTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackGroundDescription() {
        return this.backGroundDescription;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBackGroundImage() {
        return this.backGroundImage;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRightImage() {
        return this.rightImage;
    }

    @NotNull
    public final CasesBannerDto copy(int caseId, int caseRewardsPreviewId, @NotNull String caseImage, @NotNull String backGroundTitle, @NotNull String backGroundDescription, @NotNull String backGroundImage, @NotNull String rightImage) {
        Intrinsics.checkNotNullParameter(caseImage, "caseImage");
        Intrinsics.checkNotNullParameter(backGroundTitle, "backGroundTitle");
        Intrinsics.checkNotNullParameter(backGroundDescription, "backGroundDescription");
        Intrinsics.checkNotNullParameter(backGroundImage, "backGroundImage");
        Intrinsics.checkNotNullParameter(rightImage, "rightImage");
        return new CasesBannerDto(caseId, caseRewardsPreviewId, caseImage, backGroundTitle, backGroundDescription, backGroundImage, rightImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesBannerDto)) {
            return false;
        }
        CasesBannerDto casesBannerDto = (CasesBannerDto) other;
        return this.caseId == casesBannerDto.caseId && this.caseRewardsPreviewId == casesBannerDto.caseRewardsPreviewId && Intrinsics.areEqual(this.caseImage, casesBannerDto.caseImage) && Intrinsics.areEqual(this.backGroundTitle, casesBannerDto.backGroundTitle) && Intrinsics.areEqual(this.backGroundDescription, casesBannerDto.backGroundDescription) && Intrinsics.areEqual(this.backGroundImage, casesBannerDto.backGroundImage) && Intrinsics.areEqual(this.rightImage, casesBannerDto.rightImage);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.caseId) * 31) + Integer.hashCode(this.caseRewardsPreviewId)) * 31) + this.caseImage.hashCode()) * 31) + this.backGroundTitle.hashCode()) * 31) + this.backGroundDescription.hashCode()) * 31) + this.backGroundImage.hashCode()) * 31) + this.rightImage.hashCode();
    }

    @NotNull
    public String toString() {
        return "CasesBannerDto(caseId=" + this.caseId + ", caseRewardsPreviewId=" + this.caseRewardsPreviewId + ", caseImage=" + this.caseImage + ", backGroundTitle=" + this.backGroundTitle + ", backGroundDescription=" + this.backGroundDescription + ", backGroundImage=" + this.backGroundImage + ", rightImage=" + this.rightImage + ")";
    }

    public CasesBannerDto(int i, int i2, @NotNull String caseImage, @NotNull String backGroundTitle, @NotNull String backGroundDescription, @NotNull String backGroundImage, @NotNull String rightImage) {
        Intrinsics.checkNotNullParameter(caseImage, "caseImage");
        Intrinsics.checkNotNullParameter(backGroundTitle, "backGroundTitle");
        Intrinsics.checkNotNullParameter(backGroundDescription, "backGroundDescription");
        Intrinsics.checkNotNullParameter(backGroundImage, "backGroundImage");
        Intrinsics.checkNotNullParameter(rightImage, "rightImage");
        this.caseId = i;
        this.caseRewardsPreviewId = i2;
        this.caseImage = caseImage;
        this.backGroundTitle = backGroundTitle;
        this.backGroundDescription = backGroundDescription;
        this.backGroundImage = backGroundImage;
        this.rightImage = rightImage;
    }

    public final int getCaseId() {
        return this.caseId;
    }

    public final int getCaseRewardsPreviewId() {
        return this.caseRewardsPreviewId;
    }

    public /* synthetic */ CasesBannerDto(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i3 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i3 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5);
    }

    @NotNull
    public final String getCaseImage() {
        return this.caseImage;
    }

    @NotNull
    public final String getBackGroundTitle() {
        return this.backGroundTitle;
    }

    @NotNull
    public final String getBackGroundDescription() {
        return this.backGroundDescription;
    }

    @NotNull
    public final String getBackGroundImage() {
        return this.backGroundImage;
    }

    @NotNull
    public final String getRightImage() {
        return this.rightImage;
    }
}

