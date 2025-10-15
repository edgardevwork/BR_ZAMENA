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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBannerDto;", "", "caseId", "", "caseRewardsPreviewId", "caseImage", "", "backGroundTitle", "backGroundDescription", "backGroundImage", "rightImage", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackGroundDescription", "()Ljava/lang/String;", "getBackGroundImage", "getBackGroundTitle", "getCaseId", "()I", "getCaseImage", "getCaseRewardsPreviewId", "getRightImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
