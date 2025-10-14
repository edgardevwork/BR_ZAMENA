package com.blackhub.bronline.game.gui.blackpassbanner;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpassbanner/BlackPassBannerUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "bannerTitle", "", "bgImage", "Landroid/graphics/Bitmap;", "rightImage", "leftImage", "seasonColor", "", "prizesAttachment", "", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "isNeedClose", "", "(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILjava/util/List;Z)V", "getBannerTitle", "()Ljava/lang/String;", "getBgImage", "()Landroid/graphics/Bitmap;", "()Z", "getLeftImage", "getPrizesAttachment", "()Ljava/util/List;", "getRightImage", "getSeasonColor", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlackPassBannerUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final String bannerTitle;

    @Nullable
    public final Bitmap bgImage;
    public final boolean isNeedClose;

    @Nullable
    public final Bitmap leftImage;

    @NotNull
    public final List<ImageModel> prizesAttachment;

    @Nullable
    public final Bitmap rightImage;
    public final int seasonColor;

    public BlackPassBannerUiState() {
        this(null, null, null, null, 0, null, false, 127, null);
    }

    public static /* synthetic */ BlackPassBannerUiState copy$default(BlackPassBannerUiState blackPassBannerUiState, String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = blackPassBannerUiState.bannerTitle;
        }
        if ((i2 & 2) != 0) {
            bitmap = blackPassBannerUiState.bgImage;
        }
        Bitmap bitmap4 = bitmap;
        if ((i2 & 4) != 0) {
            bitmap2 = blackPassBannerUiState.rightImage;
        }
        Bitmap bitmap5 = bitmap2;
        if ((i2 & 8) != 0) {
            bitmap3 = blackPassBannerUiState.leftImage;
        }
        Bitmap bitmap6 = bitmap3;
        if ((i2 & 16) != 0) {
            i = blackPassBannerUiState.seasonColor;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list = blackPassBannerUiState.prizesAttachment;
        }
        List list2 = list;
        if ((i2 & 64) != 0) {
            z = blackPassBannerUiState.isNeedClose;
        }
        return blackPassBannerUiState.copy(str, bitmap4, bitmap5, bitmap6, i3, list2, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getRightImage() {
        return this.rightImage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Bitmap getLeftImage() {
        return this.leftImage;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSeasonColor() {
        return this.seasonColor;
    }

    @NotNull
    public final List<ImageModel> component6() {
        return this.prizesAttachment;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final BlackPassBannerUiState copy(@Nullable String bannerTitle, @Nullable Bitmap bgImage, @Nullable Bitmap rightImage, @Nullable Bitmap leftImage, int seasonColor, @NotNull List<ImageModel> prizesAttachment, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(prizesAttachment, "prizesAttachment");
        return new BlackPassBannerUiState(bannerTitle, bgImage, rightImage, leftImage, seasonColor, prizesAttachment, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackPassBannerUiState)) {
            return false;
        }
        BlackPassBannerUiState blackPassBannerUiState = (BlackPassBannerUiState) other;
        return Intrinsics.areEqual(this.bannerTitle, blackPassBannerUiState.bannerTitle) && Intrinsics.areEqual(this.bgImage, blackPassBannerUiState.bgImage) && Intrinsics.areEqual(this.rightImage, blackPassBannerUiState.rightImage) && Intrinsics.areEqual(this.leftImage, blackPassBannerUiState.leftImage) && this.seasonColor == blackPassBannerUiState.seasonColor && Intrinsics.areEqual(this.prizesAttachment, blackPassBannerUiState.prizesAttachment) && this.isNeedClose == blackPassBannerUiState.isNeedClose;
    }

    public int hashCode() {
        String str = this.bannerTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.bgImage;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.rightImage;
        int iHashCode3 = (iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.leftImage;
        return ((((((iHashCode3 + (bitmap3 != null ? bitmap3.hashCode() : 0)) * 31) + Integer.hashCode(this.seasonColor)) * 31) + this.prizesAttachment.hashCode()) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "BlackPassBannerUiState(bannerTitle=" + this.bannerTitle + ", bgImage=" + this.bgImage + ", rightImage=" + this.rightImage + ", leftImage=" + this.leftImage + ", seasonColor=" + this.seasonColor + ", prizesAttachment=" + this.prizesAttachment + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public BlackPassBannerUiState(@Nullable String str, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3, int i, @NotNull List<ImageModel> prizesAttachment, boolean z) {
        Intrinsics.checkNotNullParameter(prizesAttachment, "prizesAttachment");
        this.bannerTitle = str;
        this.bgImage = bitmap;
        this.rightImage = bitmap2;
        this.leftImage = bitmap3;
        this.seasonColor = i;
        this.prizesAttachment = prizesAttachment;
        this.isNeedClose = z;
    }

    @Nullable
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    @Nullable
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @Nullable
    public final Bitmap getRightImage() {
        return this.rightImage;
    }

    @Nullable
    public final Bitmap getLeftImage() {
        return this.leftImage;
    }

    public final int getSeasonColor() {
        return this.seasonColor;
    }

    public /* synthetic */ BlackPassBannerUiState(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bitmap, (i2 & 4) != 0 ? null : bitmap2, (i2 & 8) == 0 ? bitmap3 : null, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? false : z);
    }

    @NotNull
    public final List<ImageModel> getPrizesAttachment() {
        return this.prizesAttachment;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}
