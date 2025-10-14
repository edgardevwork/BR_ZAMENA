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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/brsimbanner/model/BrSimBannerCarModel;", "", "carImage", "Landroid/graphics/Bitmap;", "carName", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroid/graphics/Bitmap;Landroidx/compose/ui/text/AnnotatedString;)V", "getCarImage", "()Landroid/graphics/Bitmap;", "getCarName", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
