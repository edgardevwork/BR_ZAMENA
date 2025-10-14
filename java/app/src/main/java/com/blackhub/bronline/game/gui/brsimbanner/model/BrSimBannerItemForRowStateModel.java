package com.blackhub.bronline.game.gui.brsimbanner.model;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerItemForRowStateModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class BrSimBannerItemForRowStateModel {
    public static final int $stable = 0;
    public final float aspectRatio;
    public final int bgColor;
    public final int imageResource;
    public final float scale;

    @NotNull
    public final AnnotatedString text;

    public static /* synthetic */ BrSimBannerItemForRowStateModel copy$default(BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel, AnnotatedString annotatedString, int i, int i2, float f, float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            annotatedString = brSimBannerItemForRowStateModel.text;
        }
        if ((i3 & 2) != 0) {
            i = brSimBannerItemForRowStateModel.bgColor;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = brSimBannerItemForRowStateModel.imageResource;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            f = brSimBannerItemForRowStateModel.scale;
        }
        float f3 = f;
        if ((i3 & 16) != 0) {
            f2 = brSimBannerItemForRowStateModel.aspectRatio;
        }
        return brSimBannerItemForRowStateModel.copy(annotatedString, i4, i5, f3, f2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getImageResource() {
        return this.imageResource;
    }

    /* renamed from: component4, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: component5, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @NotNull
    public final BrSimBannerItemForRowStateModel copy(@NotNull AnnotatedString text, @ColorRes int bgColor, @DrawableRes int imageResource, float scale, float aspectRatio) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BrSimBannerItemForRowStateModel(text, bgColor, imageResource, scale, aspectRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrSimBannerItemForRowStateModel)) {
            return false;
        }
        BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel = (BrSimBannerItemForRowStateModel) other;
        return Intrinsics.areEqual(this.text, brSimBannerItemForRowStateModel.text) && this.bgColor == brSimBannerItemForRowStateModel.bgColor && this.imageResource == brSimBannerItemForRowStateModel.imageResource && Float.compare(this.scale, brSimBannerItemForRowStateModel.scale) == 0 && Float.compare(this.aspectRatio, brSimBannerItemForRowStateModel.aspectRatio) == 0;
    }

    public int hashCode() {
        return (((((((this.text.hashCode() * 31) + Integer.hashCode(this.bgColor)) * 31) + Integer.hashCode(this.imageResource)) * 31) + Float.hashCode(this.scale)) * 31) + Float.hashCode(this.aspectRatio);
    }

    @NotNull
    public String toString() {
        AnnotatedString annotatedString = this.text;
        return "BrSimBannerItemForRowStateModel(text=" + ((Object) annotatedString) + ", bgColor=" + this.bgColor + ", imageResource=" + this.imageResource + ", scale=" + this.scale + ", aspectRatio=" + this.aspectRatio + ")";
    }

    public BrSimBannerItemForRowStateModel(@NotNull AnnotatedString text, @ColorRes int i, @DrawableRes int i2, float f, float f2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bgColor = i;
        this.imageResource = i2;
        this.scale = f;
        this.aspectRatio = f2;
    }

    public /* synthetic */ BrSimBannerItemForRowStateModel(AnnotatedString annotatedString, int i, int i2, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, i, i2, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) != 0 ? 1.0f : f2);
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.text;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final int getImageResource() {
        return this.imageResource;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }
}

