package com.blackhub.bronline.game.gui.blackpass.data;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrizeState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class PrizeObj {
    public static final int $stable = 8;
    public final int awardId;
    public final int currentLevel;
    public final int fromInterface;
    public final int id;

    @Nullable
    public Bitmap imageBitmap;
    public final int isPremium;

    @NotNull
    public final String prizeTitle;
    public final int rarity;
    public final int typeId;
    public final int typeOfAward;

    public PrizeObj() {
        this(0, null, 0, 0, 0, null, 0, 0, 0, 0, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwardId() {
        return this.awardId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPrizeTitle() {
        return this.prizeTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIsPremium() {
        return this.isPremium;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTypeOfAward() {
        return this.typeOfAward;
    }

    /* renamed from: component9, reason: from getter */
    public final int getFromInterface() {
        return this.fromInterface;
    }

    @NotNull
    public final PrizeObj copy(int id, @Nullable Bitmap imageBitmap, int currentLevel, int typeId, int awardId, @NotNull String prizeTitle, int isPremium, int typeOfAward, int fromInterface, int rarity) {
        Intrinsics.checkNotNullParameter(prizeTitle, "prizeTitle");
        return new PrizeObj(id, imageBitmap, currentLevel, typeId, awardId, prizeTitle, isPremium, typeOfAward, fromInterface, rarity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeObj)) {
            return false;
        }
        PrizeObj prizeObj = (PrizeObj) other;
        return this.id == prizeObj.id && Intrinsics.areEqual(this.imageBitmap, prizeObj.imageBitmap) && this.currentLevel == prizeObj.currentLevel && this.typeId == prizeObj.typeId && this.awardId == prizeObj.awardId && Intrinsics.areEqual(this.prizeTitle, prizeObj.prizeTitle) && this.isPremium == prizeObj.isPremium && this.typeOfAward == prizeObj.typeOfAward && this.fromInterface == prizeObj.fromInterface && this.rarity == prizeObj.rarity;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Bitmap bitmap = this.imageBitmap;
        return ((((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.currentLevel)) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.awardId)) * 31) + this.prizeTitle.hashCode()) * 31) + Integer.hashCode(this.isPremium)) * 31) + Integer.hashCode(this.typeOfAward)) * 31) + Integer.hashCode(this.fromInterface)) * 31) + Integer.hashCode(this.rarity);
    }

    @NotNull
    public String toString() {
        return "PrizeObj(id=" + this.id + ", imageBitmap=" + this.imageBitmap + ", currentLevel=" + this.currentLevel + ", typeId=" + this.typeId + ", awardId=" + this.awardId + ", prizeTitle=" + this.prizeTitle + ", isPremium=" + this.isPremium + ", typeOfAward=" + this.typeOfAward + ", fromInterface=" + this.fromInterface + ", rarity=" + this.rarity + ")";
    }

    public PrizeObj(int i, @Nullable Bitmap bitmap, int i2, int i3, int i4, @NotNull String prizeTitle, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(prizeTitle, "prizeTitle");
        this.id = i;
        this.imageBitmap = bitmap;
        this.currentLevel = i2;
        this.typeId = i3;
        this.awardId = i4;
        this.prizeTitle = prizeTitle;
        this.isPremium = i5;
        this.typeOfAward = i6;
        this.fromInterface = i7;
        this.rarity = i8;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        this.imageBitmap = bitmap;
    }

    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getAwardId() {
        return this.awardId;
    }

    public /* synthetic */ PrizeObj(int i, Bitmap bitmap, int i2, int i3, int i4, String str, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? null : bitmap, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? 0 : i4, (i9 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i9 & 64) != 0 ? 0 : i5, (i9 & 128) != 0 ? 0 : i6, (i9 & 256) == 0 ? i7 : 0, (i9 & 512) != 0 ? 1 : i8);
    }

    @NotNull
    public final String getPrizeTitle() {
        return this.prizeTitle;
    }

    public final int isPremium() {
        return this.isPremium;
    }

    public final int getTypeOfAward() {
        return this.typeOfAward;
    }

    public final int getFromInterface() {
        return this.fromInterface;
    }

    public final int getRarity() {
        return this.rarity;
    }

    @NotNull
    public final CommonRarityEnum getRarityEnum() {
        return CommonRarityEnum.INSTANCE.fromInt(this.rarity);
    }
}

