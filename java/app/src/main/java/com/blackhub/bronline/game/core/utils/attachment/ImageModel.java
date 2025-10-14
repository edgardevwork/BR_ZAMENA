package com.blackhub.bronline.game.core.utils.attachment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class ImageModel {
    public static final int $stable = 0;
    public final int id;

    @NotNull
    public final String imageName;

    @NotNull
    public final ImageTypePathInCDNEnum imageType;

    @NotNull
    public final String name;

    @Nullable
    public final RenderAttachment render;

    public ImageModel() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ImageModel copy$default(ImageModel imageModel, int i, RenderAttachment renderAttachment, String str, String str2, ImageTypePathInCDNEnum imageTypePathInCDNEnum, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = imageModel.id;
        }
        if ((i2 & 2) != 0) {
            renderAttachment = imageModel.render;
        }
        RenderAttachment renderAttachment2 = renderAttachment;
        if ((i2 & 4) != 0) {
            str = imageModel.imageName;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = imageModel.name;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            imageTypePathInCDNEnum = imageModel.imageType;
        }
        return imageModel.copy(i, renderAttachment2, str3, str4, imageTypePathInCDNEnum);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RenderAttachment getRender() {
        return this.render;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ImageTypePathInCDNEnum getImageType() {
        return this.imageType;
    }

    @NotNull
    public final ImageModel copy(int id, @Nullable RenderAttachment render, @NotNull String imageName, @NotNull String name, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        return new ImageModel(id, render, imageName, name, imageType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageModel)) {
            return false;
        }
        ImageModel imageModel = (ImageModel) other;
        return this.id == imageModel.id && Intrinsics.areEqual(this.render, imageModel.render) && Intrinsics.areEqual(this.imageName, imageModel.imageName) && Intrinsics.areEqual(this.name, imageModel.name) && this.imageType == imageModel.imageType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        RenderAttachment renderAttachment = this.render;
        return ((((((iHashCode + (renderAttachment == null ? 0 : renderAttachment.hashCode())) * 31) + this.imageName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.imageType.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageModel(id=" + this.id + ", render=" + this.render + ", imageName=" + this.imageName + ", name=" + this.name + ", imageType=" + this.imageType + ")";
    }

    public ImageModel(int i, @Nullable RenderAttachment renderAttachment, @NotNull String imageName, @NotNull String name, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        this.id = i;
        this.render = renderAttachment;
        this.imageName = imageName;
        this.name = name;
        this.imageType = imageType;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final RenderAttachment getRender() {
        return this.render;
    }

    public /* synthetic */ ImageModel(int i, RenderAttachment renderAttachment, String str, String str2, ImageTypePathInCDNEnum imageTypePathInCDNEnum, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : renderAttachment, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 16) != 0 ? ImageTypePathInCDNEnum.VEHICLE : imageTypePathInCDNEnum);
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ImageTypePathInCDNEnum getImageType() {
        return this.imageType;
    }
}

