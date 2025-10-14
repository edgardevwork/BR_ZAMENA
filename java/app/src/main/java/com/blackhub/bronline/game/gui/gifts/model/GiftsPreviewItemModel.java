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

