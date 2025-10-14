package com.blackhub.bronline.game.gui.brsimbanner.model;

import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerCarModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BrSimBannerCarModel {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap carImage;

    @NotNull
    public final AnnotatedString carName;

    public BrSimBannerCarModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BrSimBannerCarModel copy$default(BrSimBannerCarModel brSimBannerCarModel, Bitmap bitmap, AnnotatedString annotatedString, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = brSimBannerCarModel.carImage;
        }
        if ((i & 2) != 0) {
            annotatedString = brSimBannerCarModel.carName;
        }
        return brSimBannerCarModel.copy(bitmap, annotatedString);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getCarImage() {
        return this.carImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getCarName() {
        return this.carName;
    }

    @NotNull
    public final BrSimBannerCarModel copy(@Nullable Bitmap carImage, @NotNull AnnotatedString carName) {
        Intrinsics.checkNotNullParameter(carName, "carName");
        return new BrSimBannerCarModel(carImage, carName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrSimBannerCarModel)) {
            return false;
        }
        BrSimBannerCarModel brSimBannerCarModel = (BrSimBannerCarModel) other;
        return Intrinsics.areEqual(this.carImage, brSimBannerCarModel.carImage) && Intrinsics.areEqual(this.carName, brSimBannerCarModel.carName);
    }

    public int hashCode() {
        Bitmap bitmap = this.carImage;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.carName.hashCode();
    }

    @NotNull
    public String toString() {
        return "BrSimBannerCarModel(carImage=" + this.carImage + ", carName=" + ((Object) this.carName) + ")";
    }

    public BrSimBannerCarModel(@Nullable Bitmap bitmap, @NotNull AnnotatedString carName) {
        Intrinsics.checkNotNullParameter(carName, "carName");
        this.carImage = bitmap;
        this.carName = carName;
    }

    @Nullable
    public final Bitmap getCarImage() {
        return this.carImage;
    }

    public /* synthetic */ BrSimBannerCarModel(Bitmap bitmap, AnnotatedString annotatedString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString);
    }

    @NotNull
    public final AnnotatedString getCarName() {
        return this.carName;
    }
}

