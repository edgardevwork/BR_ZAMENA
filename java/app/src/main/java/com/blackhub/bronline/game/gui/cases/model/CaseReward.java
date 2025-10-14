package com.blackhub.bronline.game.gui.cases.model;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseReward.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CaseReward {
    public static final int $stable = 8;
    public final boolean alreadySprayed;
    public final int count;

    @NotNull
    public final String dustCountText;

    @NotNull
    public final String dustSprayedText;
    public final int dustValue;

    @Nullable
    public final Bitmap imageBitmap;

    @NotNull
    public final String imageName;
    public final int internalId;
    public final boolean isRender;
    public final boolean isSelected;

    @NotNull
    public final CommonRarityEnum rarity;

    @NotNull
    public final CaseRenderAttachment renderAttachment;
    public final int rewardId;

    @NotNull
    public final String rewardName;

    @Nullable
    public final String rewardNameStore;
    public final int rewardType;
    public final boolean sprayed;

    /* compiled from: CaseReward.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRarityEnum.PRIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonRarityEnum.COMMON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CaseReward() {
        this(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSprayed() {
        return this.sprayed;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getAlreadySprayed() {
        return this.alreadySprayed;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsRender() {
        return this.isRender;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final CaseRenderAttachment getRenderAttachment() {
        return this.renderAttachment;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* renamed from: component17, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRewardName() {
        return this.rewardName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRewardNameStore() {
        return this.rewardNameStore;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDustCountText() {
        return this.dustCountText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDustSprayedText() {
        return this.dustSprayedText;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDustValue() {
        return this.dustValue;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    public final CaseReward copy(int rewardId, int rewardType, @NotNull String rewardName, @Nullable String rewardNameStore, @NotNull String dustCountText, @NotNull String dustSprayedText, int dustValue, @Nullable Bitmap imageBitmap, @NotNull CommonRarityEnum rarity, boolean sprayed, boolean alreadySprayed, boolean isSelected, int i, boolean isRender, @NotNull CaseRenderAttachment renderAttachment, @NotNull String imageName, int internalId) {
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(dustCountText, "dustCountText");
        Intrinsics.checkNotNullParameter(dustSprayedText, "dustSprayedText");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(renderAttachment, "renderAttachment");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new CaseReward(rewardId, rewardType, rewardName, rewardNameStore, dustCountText, dustSprayedText, dustValue, imageBitmap, rarity, sprayed, alreadySprayed, isSelected, i, isRender, renderAttachment, imageName, internalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseReward)) {
            return false;
        }
        CaseReward caseReward = (CaseReward) other;
        return this.rewardId == caseReward.rewardId && this.rewardType == caseReward.rewardType && Intrinsics.areEqual(this.rewardName, caseReward.rewardName) && Intrinsics.areEqual(this.rewardNameStore, caseReward.rewardNameStore) && Intrinsics.areEqual(this.dustCountText, caseReward.dustCountText) && Intrinsics.areEqual(this.dustSprayedText, caseReward.dustSprayedText) && this.dustValue == caseReward.dustValue && Intrinsics.areEqual(this.imageBitmap, caseReward.imageBitmap) && this.rarity == caseReward.rarity && this.sprayed == caseReward.sprayed && this.alreadySprayed == caseReward.alreadySprayed && this.isSelected == caseReward.isSelected && this.count == caseReward.count && this.isRender == caseReward.isRender && Intrinsics.areEqual(this.renderAttachment, caseReward.renderAttachment) && Intrinsics.areEqual(this.imageName, caseReward.imageName) && this.internalId == caseReward.internalId;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.rewardId) * 31) + Integer.hashCode(this.rewardType)) * 31) + this.rewardName.hashCode()) * 31;
        String str = this.rewardNameStore;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dustCountText.hashCode()) * 31) + this.dustSprayedText.hashCode()) * 31) + Integer.hashCode(this.dustValue)) * 31;
        Bitmap bitmap = this.imageBitmap;
        return ((((((((((((((((((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + this.rarity.hashCode()) * 31) + Boolean.hashCode(this.sprayed)) * 31) + Boolean.hashCode(this.alreadySprayed)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.isRender)) * 31) + this.renderAttachment.hashCode()) * 31) + this.imageName.hashCode()) * 31) + Integer.hashCode(this.internalId);
    }

    @NotNull
    public String toString() {
        return "CaseReward(rewardId=" + this.rewardId + ", rewardType=" + this.rewardType + ", rewardName=" + this.rewardName + ", rewardNameStore=" + this.rewardNameStore + ", dustCountText=" + this.dustCountText + ", dustSprayedText=" + this.dustSprayedText + ", dustValue=" + this.dustValue + ", imageBitmap=" + this.imageBitmap + ", rarity=" + this.rarity + ", sprayed=" + this.sprayed + ", alreadySprayed=" + this.alreadySprayed + ", isSelected=" + this.isSelected + ", count=" + this.count + ", isRender=" + this.isRender + ", renderAttachment=" + this.renderAttachment + ", imageName=" + this.imageName + ", internalId=" + this.internalId + ")";
    }

    public CaseReward(int i, int i2, @NotNull String rewardName, @Nullable String str, @NotNull String dustCountText, @NotNull String dustSprayedText, int i3, @Nullable Bitmap bitmap, @NotNull CommonRarityEnum rarity, boolean z, boolean z2, boolean z3, int i4, boolean z4, @NotNull CaseRenderAttachment renderAttachment, @NotNull String imageName, int i5) {
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(dustCountText, "dustCountText");
        Intrinsics.checkNotNullParameter(dustSprayedText, "dustSprayedText");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(renderAttachment, "renderAttachment");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.rewardId = i;
        this.rewardType = i2;
        this.rewardName = rewardName;
        this.rewardNameStore = str;
        this.dustCountText = dustCountText;
        this.dustSprayedText = dustSprayedText;
        this.dustValue = i3;
        this.imageBitmap = bitmap;
        this.rarity = rarity;
        this.sprayed = z;
        this.alreadySprayed = z2;
        this.isSelected = z3;
        this.count = i4;
        this.isRender = z4;
        this.renderAttachment = renderAttachment;
        this.imageName = imageName;
        this.internalId = i5;
    }

    public final int getRewardId() {
        return this.rewardId;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public /* synthetic */ CaseReward(int i, int i2, String str, String str2, String str3, String str4, int i3, Bitmap bitmap, CommonRarityEnum commonRarityEnum, boolean z, boolean z2, boolean z3, int i4, boolean z4, CaseRenderAttachment caseRenderAttachment, String str5, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i6 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) == 0 ? bitmap : null, (i6 & 256) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum, (i6 & 512) != 0 ? false : z, (i6 & 1024) != 0 ? false : z2, (i6 & 2048) != 0 ? false : z3, (i6 & 4096) != 0 ? 0 : i4, (i6 & 8192) != 0 ? false : z4, (i6 & 16384) != 0 ? new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null) : caseRenderAttachment, (i6 & 32768) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i6 & 65536) != 0 ? 0 : i5);
    }

    @NotNull
    public final String getRewardName() {
        return this.rewardName;
    }

    @Nullable
    public final String getRewardNameStore() {
        return this.rewardNameStore;
    }

    @NotNull
    public final String getDustCountText() {
        return this.dustCountText;
    }

    @NotNull
    public final String getDustSprayedText() {
        return this.dustSprayedText;
    }

    public final int getDustValue() {
        return this.dustValue;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    @NotNull
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    public final boolean getSprayed() {
        return this.sprayed;
    }

    public final boolean getAlreadySprayed() {
        return this.alreadySprayed;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean isRender() {
        return this.isRender;
    }

    @NotNull
    public final CaseRenderAttachment getRenderAttachment() {
        return this.renderAttachment;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    public final int getInternalId() {
        return this.internalId;
    }

    @ColorRes
    public final int getBgColorTop() {
        return this.alreadySprayed ? R.color.total_black_50 : R.color.total_black;
    }

    @ColorRes
    public final int getBgColorBottom() {
        if (this.alreadySprayed) {
            return R.color.total_black_50;
        }
        CommonRarityEnum commonRarityEnum = this.rarity;
        return commonRarityEnum == CommonRarityEnum.PRIZE ? R.color.red : commonRarityEnum == CommonRarityEnum.LEGENDARY ? R.color.yellow : commonRarityEnum == CommonRarityEnum.EPIC ? R.color.purpur : commonRarityEnum == CommonRarityEnum.RARE ? R.color.light_blue_50 : commonRarityEnum == CommonRarityEnum.UNCOMMON ? R.color.green_50 : commonRarityEnum == CommonRarityEnum.COMMON ? R.color.gray_50 : R.color.black_10;
    }

    @ColorRes
    public final int getBgColorBottomReward() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.gray_50 : R.color.red : R.color.yellow : R.color.purpur_50 : R.color.light_blue_50 : R.color.green_50;
    }

    @ColorRes
    public final int getShadowColor() {
        if ((this.isSelected && this.sprayed) || this.alreadySprayed) {
            return R.color.transparent;
        }
        CommonRarityEnum commonRarityEnum = this.rarity;
        return commonRarityEnum == CommonRarityEnum.LEGENDARY ? R.color.yellow_orange : commonRarityEnum == CommonRarityEnum.EPIC ? R.color.purple : commonRarityEnum == CommonRarityEnum.PRIZE ? R.color.red : R.color.transparent;
    }

    @DimenRes
    public final int getShadowWeight() {
        if (this.alreadySprayed) {
            return R.dimen._05wdp;
        }
        CommonRarityEnum commonRarityEnum = this.rarity;
        return commonRarityEnum == CommonRarityEnum.LEGENDARY ? R.dimen._10wdp : (commonRarityEnum == CommonRarityEnum.EPIC || commonRarityEnum == CommonRarityEnum.PRIZE) ? R.dimen._5wdp : R.dimen._05wdp;
    }

    @NotNull
    public final List<Integer> getBrushColors() {
        boolean z = this.alreadySprayed;
        Integer numValueOf = Integer.valueOf(R.color.dark_gray);
        if (z) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, numValueOf});
        }
        CommonRarityEnum commonRarityEnum = this.rarity;
        if (commonRarityEnum == CommonRarityEnum.PRIZE) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.orange), Integer.valueOf(R.color.red)});
        }
        if (commonRarityEnum == CommonRarityEnum.LEGENDARY) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.yellow), Integer.valueOf(R.color.yellow_orange)});
        }
        if (commonRarityEnum == CommonRarityEnum.EPIC) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.purpur), Integer.valueOf(R.color.purple)});
        }
        if (commonRarityEnum == CommonRarityEnum.RARE) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.light_blue), Integer.valueOf(R.color.light_blue)});
        }
        if (commonRarityEnum == CommonRarityEnum.UNCOMMON) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.dark_medium_green), Integer.valueOf(R.color.dark_medium_green)});
        }
        if (commonRarityEnum == CommonRarityEnum.COMMON) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, numValueOf});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, numValueOf});
    }

    @ColorRes
    public final int getCheckBgColor() {
        return (!this.sprayed || this.alreadySprayed) ? R.color.transparent : this.isSelected ? R.color.yellow_orange : R.color.white_5;
    }

    @ColorRes
    public final int getCheckBorderColor() {
        return (!this.sprayed || this.alreadySprayed || this.isSelected) ? R.color.transparent : R.color.white;
    }

    public final float getCheckTransparency() {
        return (this.sprayed && !this.alreadySprayed && this.isSelected) ? 1.0f : 0.0f;
    }

    public final float getCardTransparency() {
        return this.alreadySprayed ? 0.5f : 1.0f;
    }

    @ColorRes
    public final int getTextColor() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()]) {
            case 1:
                return R.color.dark_medium_green;
            case 2:
                return R.color.light_blue;
            case 3:
                return R.color.purpur;
            case 4:
                return R.color.yellow;
            case 5:
                return R.color.red;
            case 6:
                return R.color.white;
            default:
                return R.color.black_10;
        }
    }

    @ColorRes
    public final int getBorderColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 4 ? i != 5 ? R.color.transparent : R.color.red : R.color.yellow;
    }

    @ColorRes
    public final int getCrossColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.transparent : R.color.red : R.color.yellow : R.color.purple : R.color.light_blue;
    }

    @DimenRes
    public final int getShadowWeightAnim() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 3 ? (i == 4 || i == 5) ? R.dimen._20wdp : R.dimen._05wdp : R.dimen._10wdp;
    }

    @NotNull
    public final LottieClipSpec.Progress getSpec(boolean isFullAnim) {
        if (isFullAnim) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
            if (i == 1) {
                return new LottieClipSpec.Progress(0.0f, 0.24f);
            }
            if (i == 2) {
                return new LottieClipSpec.Progress(0.0f, 0.4f);
            }
            if (i == 3) {
                return new LottieClipSpec.Progress(0.0f, 0.55f);
            }
            if (i == 4) {
                return new LottieClipSpec.Progress(0.0f, 1.0f);
            }
            if (i == 6) {
                return new LottieClipSpec.Progress(0.0f, 0.084f);
            }
            return new LottieClipSpec.Progress(0.0f, 0.084f);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        if (i2 == 1) {
            return new LottieClipSpec.Progress(0.0f, 0.0f);
        }
        if (i2 == 2) {
            return new LottieClipSpec.Progress(0.309f, 0.4f);
        }
        if (i2 == 3) {
            return new LottieClipSpec.Progress(0.46f, 0.55f);
        }
        if (i2 == 4) {
            return new LottieClipSpec.Progress(0.63f, 0.69f);
        }
        if (i2 == 6) {
            return new LottieClipSpec.Progress(0.0f, 0.0f);
        }
        return new LottieClipSpec.Progress(0.0f, 0.084f);
    }

    public final long getDelay(boolean isFullAnim) {
        if (!isFullAnim) {
            return 630L;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        if (i == 1) {
            return 1680L;
        }
        if (i == 2) {
            return 2800L;
        }
        if (i == 3) {
            return 3850L;
        }
        if (i != 4) {
            return 588L;
        }
        return CaseRewardKt.LEGENDARY_DELAY;
    }

    @DimenRes
    public final int getTitleTextSize() {
        return this.rarity == CommonRarityEnum.SPRAYED ? R.dimen._12wsp : R.dimen._10wsp;
    }

    public final boolean isLegendaryReward() {
        return this.rarity == CommonRarityEnum.LEGENDARY;
    }

    public final boolean isSprayedReward() {
        return this.rarity == CommonRarityEnum.SPRAYED;
    }
}

