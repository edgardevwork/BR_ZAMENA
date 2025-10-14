package com.blackhub.bronline.game.core.utils.attachment.rating;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRatingModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class CommonRatingModel {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap imageBitmap;

    @NotNull
    public final String name;
    public final int place;
    public final int points;

    @Nullable
    public final ImageModel rewardImageModel;

    public CommonRatingModel() {
        this(null, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ CommonRatingModel copy$default(CommonRatingModel commonRatingModel, String str, int i, int i2, ImageModel imageModel, Bitmap bitmap, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = commonRatingModel.name;
        }
        if ((i3 & 2) != 0) {
            i = commonRatingModel.points;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = commonRatingModel.place;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            imageModel = commonRatingModel.rewardImageModel;
        }
        ImageModel imageModel2 = imageModel;
        if ((i3 & 16) != 0) {
            bitmap = commonRatingModel.imageBitmap;
        }
        return commonRatingModel.copy(str, i4, i5, imageModel2, bitmap);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlace() {
        return this.place;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ImageModel getRewardImageModel() {
        return this.rewardImageModel;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    @NotNull
    public final CommonRatingModel copy(@NotNull String name, int points, int place, @Nullable ImageModel rewardImageModel, @Nullable Bitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CommonRatingModel(name, points, place, rewardImageModel, imageBitmap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRatingModel)) {
            return false;
        }
        CommonRatingModel commonRatingModel = (CommonRatingModel) other;
        return Intrinsics.areEqual(this.name, commonRatingModel.name) && this.points == commonRatingModel.points && this.place == commonRatingModel.place && Intrinsics.areEqual(this.rewardImageModel, commonRatingModel.rewardImageModel) && Intrinsics.areEqual(this.imageBitmap, commonRatingModel.imageBitmap);
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + Integer.hashCode(this.points)) * 31) + Integer.hashCode(this.place)) * 31;
        ImageModel imageModel = this.rewardImageModel;
        int iHashCode2 = (iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        Bitmap bitmap = this.imageBitmap;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonRatingModel(name=" + this.name + ", points=" + this.points + ", place=" + this.place + ", rewardImageModel=" + this.rewardImageModel + ", imageBitmap=" + this.imageBitmap + ")";
    }

    public CommonRatingModel(@NotNull String name, int i, int i2, @Nullable ImageModel imageModel, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.points = i;
        this.place = i2;
        this.rewardImageModel = imageModel;
        this.imageBitmap = bitmap;
    }

    public /* synthetic */ CommonRatingModel(String str, int i, int i2, ImageModel imageModel, Bitmap bitmap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : imageModel, (i3 & 16) != 0 ? null : bitmap);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getPlace() {
        return this.place;
    }

    @Nullable
    public final ImageModel getRewardImageModel() {
        return this.rewardImageModel;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final boolean isNeedDecoration() {
        int i = this.place;
        return i == 1 || i == 2 || i == 3;
    }

    @ColorRes
    public final int getColor() {
        int i = this.place;
        return i != 1 ? i != 2 ? i != 3 ? R.color.light_gray_blue : R.color.bronze : R.color.silver : R.color.yellow;
    }
}

