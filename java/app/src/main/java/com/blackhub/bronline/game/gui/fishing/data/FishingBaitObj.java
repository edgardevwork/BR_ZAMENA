package com.blackhub.bronline.game.gui.fishing.data;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingBaitObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FishingBaitObj {
    public static final int $stable = 8;

    @Nullable
    public ImageBitmap bitmapRender;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("descriptionAction")
    @NotNull
    public final String descriptionAction;

    @SerializedName("id")
    @NotNull
    public final String imageId;

    @SerializedName("type")
    public final int imageType;

    @SerializedName("modelId")
    public final int modelId;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("percent")
    public final float percent;

    @SerializedName("time")
    public int time;

    @SerializedName("title")
    @NotNull
    public String title;

    public FishingBaitObj() {
        this(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final ImageBitmap getBitmapRender() {
        return this.bitmapRender;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescriptionAction() {
        return this.descriptionAction;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getModelId() {
        return this.modelId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getImageType() {
        return this.imageType;
    }

    @NotNull
    public final FishingBaitObj copy(@NotNull String title, int time, @NotNull String description, @NotNull String descriptionAction, @NotNull String name, float percent, @NotNull String imageId, int modelId, int imageType, @Nullable ImageBitmap bitmapRender) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionAction, "descriptionAction");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        return new FishingBaitObj(title, time, description, descriptionAction, name, percent, imageId, modelId, imageType, bitmapRender);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FishingBaitObj)) {
            return false;
        }
        FishingBaitObj fishingBaitObj = (FishingBaitObj) other;
        return Intrinsics.areEqual(this.title, fishingBaitObj.title) && this.time == fishingBaitObj.time && Intrinsics.areEqual(this.description, fishingBaitObj.description) && Intrinsics.areEqual(this.descriptionAction, fishingBaitObj.descriptionAction) && Intrinsics.areEqual(this.name, fishingBaitObj.name) && Float.compare(this.percent, fishingBaitObj.percent) == 0 && Intrinsics.areEqual(this.imageId, fishingBaitObj.imageId) && this.modelId == fishingBaitObj.modelId && this.imageType == fishingBaitObj.imageType && Intrinsics.areEqual(this.bitmapRender, fishingBaitObj.bitmapRender);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.title.hashCode() * 31) + Integer.hashCode(this.time)) * 31) + this.description.hashCode()) * 31) + this.descriptionAction.hashCode()) * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.percent)) * 31) + this.imageId.hashCode()) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.imageType)) * 31;
        ImageBitmap imageBitmap = this.bitmapRender;
        return iHashCode + (imageBitmap == null ? 0 : imageBitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "FishingBaitObj(title=" + this.title + ", time=" + this.time + ", description=" + this.description + ", descriptionAction=" + this.descriptionAction + ", name=" + this.name + ", percent=" + this.percent + ", imageId=" + this.imageId + ", modelId=" + this.modelId + ", imageType=" + this.imageType + ", bitmapRender=" + this.bitmapRender + ")";
    }

    public FishingBaitObj(@NotNull String title, int i, @NotNull String description, @NotNull String descriptionAction, @NotNull String name, float f, @NotNull String imageId, int i2, int i3, @Nullable ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionAction, "descriptionAction");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.title = title;
        this.time = i;
        this.description = description;
        this.descriptionAction = descriptionAction;
        this.name = name;
        this.percent = f;
        this.imageId = imageId;
        this.modelId = i2;
        this.imageType = i3;
        this.bitmapRender = imageBitmap;
    }

    public /* synthetic */ FishingBaitObj(String str, int i, String str2, String str3, String str4, float f, String str5, int i2, int i3, ImageBitmap imageBitmap, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i4 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? null : imageBitmap);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDescriptionAction() {
        return this.descriptionAction;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getImageType() {
        return this.imageType;
    }

    @Nullable
    public final ImageBitmap getBitmapRender() {
        return this.bitmapRender;
    }

    public final void setBitmapRender(@Nullable ImageBitmap imageBitmap) {
        this.bitmapRender = imageBitmap;
    }
}

