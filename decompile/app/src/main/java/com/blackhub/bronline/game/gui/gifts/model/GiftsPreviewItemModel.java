package com.blackhub.bronline.game.gui.gifts.model;

import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsPreviewItemModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;", "", "prizeImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "imageId", "", "prizeName", "", "(Landroidx/compose/ui/graphics/ImageBitmap;ILjava/lang/String;)V", "getImageId", "()I", "getPrizeImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "getPrizeName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GiftsPreviewItemModel {
    public static final int $stable = 8;
    public final int imageId;

    @Nullable
    public final ImageBitmap prizeImage;

    @NotNull
    public final String prizeName;

    public GiftsPreviewItemModel() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ GiftsPreviewItemModel copy$default(GiftsPreviewItemModel giftsPreviewItemModel, ImageBitmap imageBitmap, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            imageBitmap = giftsPreviewItemModel.prizeImage;
        }
        if ((i2 & 2) != 0) {
            i = giftsPreviewItemModel.imageId;
        }
        if ((i2 & 4) != 0) {
            str = giftsPreviewItemModel.prizeName;
        }
        return giftsPreviewItemModel.copy(imageBitmap, i, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ImageBitmap getPrizeImage() {
        return this.prizeImage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPrizeName() {
        return this.prizeName;
    }

    @NotNull
    public final GiftsPreviewItemModel copy(@Nullable ImageBitmap prizeImage, @DrawableRes int imageId, @NotNull String prizeName) {
        Intrinsics.checkNotNullParameter(prizeName, "prizeName");
        return new GiftsPreviewItemModel(prizeImage, imageId, prizeName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftsPreviewItemModel)) {
            return false;
        }
        GiftsPreviewItemModel giftsPreviewItemModel = (GiftsPreviewItemModel) other;
        return Intrinsics.areEqual(this.prizeImage, giftsPreviewItemModel.prizeImage) && this.imageId == giftsPreviewItemModel.imageId && Intrinsics.areEqual(this.prizeName, giftsPreviewItemModel.prizeName);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.prizeImage;
        return ((((imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31) + Integer.hashCode(this.imageId)) * 31) + this.prizeName.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftsPreviewItemModel(prizeImage=" + this.prizeImage + ", imageId=" + this.imageId + ", prizeName=" + this.prizeName + ")";
    }

    public GiftsPreviewItemModel(@Nullable ImageBitmap imageBitmap, @DrawableRes int i, @NotNull String prizeName) {
        Intrinsics.checkNotNullParameter(prizeName, "prizeName");
        this.prizeImage = imageBitmap;
        this.imageId = i;
        this.prizeName = prizeName;
    }

    @Nullable
    public final ImageBitmap getPrizeImage() {
        return this.prizeImage;
    }

    public final int getImageId() {
        return this.imageId;
    }

    public /* synthetic */ GiftsPreviewItemModel(ImageBitmap imageBitmap, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : imageBitmap, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final String getPrizeName() {
        return this.prizeName;
    }
}
