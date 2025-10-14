package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BPLastChanceItemModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class BPLastChanceItemModel {
    public static final int $stable = 0;
    public final int glowRadius;

    @NotNull
    public final String headerText;
    public final boolean isNeedToShowHotSelling;
    public final int plusBPLevelsText;
    public final int price;

    public static /* synthetic */ BPLastChanceItemModel copy$default(BPLastChanceItemModel bPLastChanceItemModel, String str, int i, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bPLastChanceItemModel.headerText;
        }
        if ((i4 & 2) != 0) {
            i = bPLastChanceItemModel.plusBPLevelsText;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = bPLastChanceItemModel.price;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            z = bPLastChanceItemModel.isNeedToShowHotSelling;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            i3 = bPLastChanceItemModel.glowRadius;
        }
        return bPLastChanceItemModel.copy(str, i5, i6, z2, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlusBPLevelsText() {
        return this.plusBPLevelsText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNeedToShowHotSelling() {
        return this.isNeedToShowHotSelling;
    }

    /* renamed from: component5, reason: from getter */
    public final int getGlowRadius() {
        return this.glowRadius;
    }

    @NotNull
    public final BPLastChanceItemModel copy(@NotNull String headerText, int plusBPLevelsText, int price, boolean isNeedToShowHotSelling, @DimenRes int glowRadius) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        return new BPLastChanceItemModel(headerText, plusBPLevelsText, price, isNeedToShowHotSelling, glowRadius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BPLastChanceItemModel)) {
            return false;
        }
        BPLastChanceItemModel bPLastChanceItemModel = (BPLastChanceItemModel) other;
        return Intrinsics.areEqual(this.headerText, bPLastChanceItemModel.headerText) && this.plusBPLevelsText == bPLastChanceItemModel.plusBPLevelsText && this.price == bPLastChanceItemModel.price && this.isNeedToShowHotSelling == bPLastChanceItemModel.isNeedToShowHotSelling && this.glowRadius == bPLastChanceItemModel.glowRadius;
    }

    public int hashCode() {
        return (((((((this.headerText.hashCode() * 31) + Integer.hashCode(this.plusBPLevelsText)) * 31) + Integer.hashCode(this.price)) * 31) + Boolean.hashCode(this.isNeedToShowHotSelling)) * 31) + Integer.hashCode(this.glowRadius);
    }

    @NotNull
    public String toString() {
        return "BPLastChanceItemModel(headerText=" + this.headerText + ", plusBPLevelsText=" + this.plusBPLevelsText + ", price=" + this.price + ", isNeedToShowHotSelling=" + this.isNeedToShowHotSelling + ", glowRadius=" + this.glowRadius + ")";
    }

    public BPLastChanceItemModel(@NotNull String headerText, int i, int i2, boolean z, @DimenRes int i3) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        this.headerText = headerText;
        this.plusBPLevelsText = i;
        this.price = i2;
        this.isNeedToShowHotSelling = z;
        this.glowRadius = i3;
    }

    public /* synthetic */ BPLastChanceItemModel(String str, int i, int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i4 & 4) != 0 ? i : i2, (i4 & 8) != 0 ? false : z, i3);
    }

    @NotNull
    public final String getHeaderText() {
        return this.headerText;
    }

    public final int getPlusBPLevelsText() {
        return this.plusBPLevelsText;
    }

    public final int getPrice() {
        return this.price;
    }

    public final boolean isNeedToShowHotSelling() {
        return this.isNeedToShowHotSelling;
    }

    public final int getGlowRadius() {
        return this.glowRadius;
    }
}

