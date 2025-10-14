package com.blackhub.bronline.game.gui.donate.data;

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

/* compiled from: PreviewPrize.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class PreviewPrize {
    public static final int $stable = 8;
    public final int fromInterface;
    public final int id;

    @Nullable
    public final Bitmap image;
    public final int isPremium;

    @NotNull
    public final String name;

    @NotNull
    public final CommonRarityEnum rarity;
    public final int typeOfAward;
    public final boolean typeReward;

    public PreviewPrize() {
        this(null, null, 0, 0, 0, 0, false, null, 255, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIsPremium() {
        return this.isPremium;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTypeOfAward() {
        return this.typeOfAward;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFromInterface() {
        return this.fromInterface;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getTypeReward() {
        return this.typeReward;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    public final PreviewPrize copy(@Nullable Bitmap image, @NotNull String name, int id, int isPremium, int typeOfAward, int fromInterface, boolean typeReward, @NotNull CommonRarityEnum rarity) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        return new PreviewPrize(image, name, id, isPremium, typeOfAward, fromInterface, typeReward, rarity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewPrize)) {
            return false;
        }
        PreviewPrize previewPrize = (PreviewPrize) other;
        return Intrinsics.areEqual(this.image, previewPrize.image) && Intrinsics.areEqual(this.name, previewPrize.name) && this.id == previewPrize.id && this.isPremium == previewPrize.isPremium && this.typeOfAward == previewPrize.typeOfAward && this.fromInterface == previewPrize.fromInterface && this.typeReward == previewPrize.typeReward && this.rarity == previewPrize.rarity;
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        return ((((((((((((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.isPremium)) * 31) + Integer.hashCode(this.typeOfAward)) * 31) + Integer.hashCode(this.fromInterface)) * 31) + Boolean.hashCode(this.typeReward)) * 31) + this.rarity.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreviewPrize(image=" + this.image + ", name=" + this.name + ", id=" + this.id + ", isPremium=" + this.isPremium + ", typeOfAward=" + this.typeOfAward + ", fromInterface=" + this.fromInterface + ", typeReward=" + this.typeReward + ", rarity=" + this.rarity + ")";
    }

    public PreviewPrize(@Nullable Bitmap bitmap, @NotNull String name, int i, int i2, int i3, int i4, boolean z, @NotNull CommonRarityEnum rarity) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        this.image = bitmap;
        this.name = name;
        this.id = i;
        this.isPremium = i2;
        this.typeOfAward = i3;
        this.fromInterface = i4;
        this.typeReward = z;
        this.rarity = rarity;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    public /* synthetic */ PreviewPrize(Bitmap bitmap, String str, int i, int i2, int i3, int i4, boolean z, CommonRarityEnum commonRarityEnum, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : bitmap, (i5 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) == 0 ? z : false, (i5 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getId() {
        return this.id;
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

    public final boolean getTypeReward() {
        return this.typeReward;
    }

    @NotNull
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }
}

