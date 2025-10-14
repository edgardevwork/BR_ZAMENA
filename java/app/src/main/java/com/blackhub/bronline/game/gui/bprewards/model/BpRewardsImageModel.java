package com.blackhub.bronline.game.gui.bprewards.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsImageModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsImageModel {
    public static final int $stable = 8;
    public final int id;
    public final int imageType;

    @NotNull
    public final String pngSvgName;

    @Nullable
    public final BpRewardsRenderAttachment render;

    public BpRewardsImageModel() {
        this(0, null, null, 0, 15, null);
    }

    public static /* synthetic */ BpRewardsImageModel copy$default(BpRewardsImageModel bpRewardsImageModel, int i, BpRewardsRenderAttachment bpRewardsRenderAttachment, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bpRewardsImageModel.id;
        }
        if ((i3 & 2) != 0) {
            bpRewardsRenderAttachment = bpRewardsImageModel.render;
        }
        if ((i3 & 4) != 0) {
            str = bpRewardsImageModel.pngSvgName;
        }
        if ((i3 & 8) != 0) {
            i2 = bpRewardsImageModel.imageType;
        }
        return bpRewardsImageModel.copy(i, bpRewardsRenderAttachment, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BpRewardsRenderAttachment getRender() {
        return this.render;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPngSvgName() {
        return this.pngSvgName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getImageType() {
        return this.imageType;
    }

    @NotNull
    public final BpRewardsImageModel copy(int id, @Nullable BpRewardsRenderAttachment render, @NotNull String pngSvgName, int imageType) {
        Intrinsics.checkNotNullParameter(pngSvgName, "pngSvgName");
        return new BpRewardsImageModel(id, render, pngSvgName, imageType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsImageModel)) {
            return false;
        }
        BpRewardsImageModel bpRewardsImageModel = (BpRewardsImageModel) other;
        return this.id == bpRewardsImageModel.id && Intrinsics.areEqual(this.render, bpRewardsImageModel.render) && Intrinsics.areEqual(this.pngSvgName, bpRewardsImageModel.pngSvgName) && this.imageType == bpRewardsImageModel.imageType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        BpRewardsRenderAttachment bpRewardsRenderAttachment = this.render;
        return ((((iHashCode + (bpRewardsRenderAttachment == null ? 0 : bpRewardsRenderAttachment.hashCode())) * 31) + this.pngSvgName.hashCode()) * 31) + Integer.hashCode(this.imageType);
    }

    @NotNull
    public String toString() {
        return "BpRewardsImageModel(id=" + this.id + ", render=" + this.render + ", pngSvgName=" + this.pngSvgName + ", imageType=" + this.imageType + ")";
    }

    public BpRewardsImageModel(int i, @Nullable BpRewardsRenderAttachment bpRewardsRenderAttachment, @NotNull String pngSvgName, int i2) {
        Intrinsics.checkNotNullParameter(pngSvgName, "pngSvgName");
        this.id = i;
        this.render = bpRewardsRenderAttachment;
        this.pngSvgName = pngSvgName;
        this.imageType = i2;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final BpRewardsRenderAttachment getRender() {
        return this.render;
    }

    public /* synthetic */ BpRewardsImageModel(int i, BpRewardsRenderAttachment bpRewardsRenderAttachment, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : bpRewardsRenderAttachment, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 8) != 0 ? 0 : i2);
    }

    @NotNull
    public final String getPngSvgName() {
        return this.pngSvgName;
    }

    public final int getImageType() {
        return this.imageType;
    }
}

