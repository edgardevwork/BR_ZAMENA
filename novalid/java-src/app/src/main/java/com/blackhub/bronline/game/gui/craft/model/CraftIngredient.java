package com.blackhub.bronline.game.gui.craft.model;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftIngredient.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003Jw\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0011\u0010%\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010&R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006?"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "", "id", "", "rarity", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "name", "", "description", "imageName", "imageType", CatchStreamerKeys.COUNT_KEY, "quantityNeeded", "quantityInStock", "isInWork", "", "isInStorage", "(ILcom/blackhub/bronline/game/core/enums/CommonRarityEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIZZ)V", "actualQuantityNeededByCount", "getActualQuantityNeededByCount", "()I", "alphaDarkLayer", "", "getAlphaDarkLayer", "()F", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "getBackgroundColor", "getCount", "setCount", "(I)V", "countTemplate", "getCountTemplate", "getDescription", "()Ljava/lang/String;", "getId", "getImageName", "getImageType", "isEnough", "()Z", "setInWork", "(Z)V", "getName", "getQuantityInStock", "getQuantityNeeded", "setQuantityNeeded", "getRarity", "()Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CraftIngredient {
    public static final int $stable = 8;
    public int count;

    @NotNull
    public final String description;
    public final int id;

    @NotNull
    public final String imageName;
    public final int imageType;
    public final boolean isInStorage;
    public boolean isInWork;

    @NotNull
    public final String name;
    public final int quantityInStock;
    public int quantityNeeded;

    @NotNull
    public final CommonRarityEnum rarity;

    /* compiled from: CraftIngredient.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CraftIngredient() {
        this(0, null, null, null, null, 0, 0, 0, 0, false, false, DoubleToDecimal.BQ_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsInWork() {
        return this.isInWork;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsInStorage() {
        return this.isInStorage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getImageType() {
        return this.imageType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component8, reason: from getter */
    public final int getQuantityNeeded() {
        return this.quantityNeeded;
    }

    /* renamed from: component9, reason: from getter */
    public final int getQuantityInStock() {
        return this.quantityInStock;
    }

    @NotNull
    public final CraftIngredient copy(int id, @NotNull CommonRarityEnum rarity, @NotNull String name, @NotNull String description, @NotNull String imageName, int imageType, int count, int quantityNeeded, int quantityInStock, boolean isInWork, boolean isInStorage) {
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new CraftIngredient(id, rarity, name, description, imageName, imageType, count, quantityNeeded, quantityInStock, isInWork, isInStorage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftIngredient)) {
            return false;
        }
        CraftIngredient craftIngredient = (CraftIngredient) other;
        return this.id == craftIngredient.id && this.rarity == craftIngredient.rarity && Intrinsics.areEqual(this.name, craftIngredient.name) && Intrinsics.areEqual(this.description, craftIngredient.description) && Intrinsics.areEqual(this.imageName, craftIngredient.imageName) && this.imageType == craftIngredient.imageType && this.count == craftIngredient.count && this.quantityNeeded == craftIngredient.quantityNeeded && this.quantityInStock == craftIngredient.quantityInStock && this.isInWork == craftIngredient.isInWork && this.isInStorage == craftIngredient.isInStorage;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + this.rarity.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageName.hashCode()) * 31) + Integer.hashCode(this.imageType)) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.quantityNeeded)) * 31) + Integer.hashCode(this.quantityInStock)) * 31) + Boolean.hashCode(this.isInWork)) * 31) + Boolean.hashCode(this.isInStorage);
    }

    @NotNull
    public String toString() {
        return "CraftIngredient(id=" + this.id + ", rarity=" + this.rarity + ", name=" + this.name + ", description=" + this.description + ", imageName=" + this.imageName + ", imageType=" + this.imageType + ", count=" + this.count + ", quantityNeeded=" + this.quantityNeeded + ", quantityInStock=" + this.quantityInStock + ", isInWork=" + this.isInWork + ", isInStorage=" + this.isInStorage + ")";
    }

    public CraftIngredient(int i, @NotNull CommonRarityEnum rarity, @NotNull String name, @NotNull String description, @NotNull String imageName, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.id = i;
        this.rarity = rarity;
        this.name = name;
        this.description = description;
        this.imageName = imageName;
        this.imageType = i2;
        this.count = i3;
        this.quantityNeeded = i4;
        this.quantityInStock = i5;
        this.isInWork = z;
        this.isInStorage = z2;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ CraftIngredient(int i, CommonRarityEnum commonRarityEnum, String str, String str2, String str3, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum, (i6 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i6 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 1 : i3, (i6 & 128) == 0 ? i4 : 1, (i6 & 256) != 0 ? 0 : i5, (i6 & 512) != 0 ? false : z, (i6 & 1024) == 0 ? z2 : false);
    }

    @NotNull
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    public final int getImageType() {
        return this.imageType;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final int getQuantityNeeded() {
        return this.quantityNeeded;
    }

    public final void setQuantityNeeded(int i) {
        this.quantityNeeded = i;
    }

    public final int getQuantityInStock() {
        return this.quantityInStock;
    }

    public final boolean isInWork() {
        return this.isInWork;
    }

    public final void setInWork(boolean z) {
        this.isInWork = z;
    }

    public final boolean isInStorage() {
        return this.isInStorage;
    }

    public final boolean isEnough() {
        return this.quantityInStock >= getActualQuantityNeededByCount();
    }

    @StringRes
    public final int getCountTemplate() {
        return this.quantityInStock == 0 ? R.string.common_current_red_and_max_values : getActualQuantityNeededByCount() > this.quantityInStock ? R.string.common_current_red_and_red_max_values : R.string.common_current_and_max_values;
    }

    @ColorRes
    public final int getBackgroundColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? R.color.gray : R.color.dark_green : R.color.light_blue_80 : R.color.purple : R.color.yellow;
    }

    public final float getAlphaDarkLayer() {
        return (this.isInStorage || this.isInWork) ? 1.0f : 0.0f;
    }

    public final int getActualQuantityNeededByCount() {
        return this.quantityNeeded * this.count;
    }
}
