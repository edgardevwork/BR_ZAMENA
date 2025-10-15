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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/data/BPLastChanceItemModel;", "", "headerText", "", "plusBPLevelsText", "", FirebaseAnalytics.Param.PRICE, "isNeedToShowHotSelling", "", "glowRadius", "(Ljava/lang/String;IIZI)V", "getGlowRadius", "()I", "getHeaderText", "()Ljava/lang/String;", "()Z", "getPlusBPLevelsText", "getPrice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
