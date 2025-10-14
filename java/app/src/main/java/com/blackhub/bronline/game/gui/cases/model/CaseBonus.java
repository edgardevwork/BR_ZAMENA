package com.blackhub.bronline.game.gui.cases.model;

import android.graphics.Bitmap;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseBonus.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CaseBonus {
    public static final int $stable = 8;
    public final int count;
    public final int id;

    @Nullable
    public final Bitmap imageBitmap;

    @NotNull
    public final String imageName;
    public final int internalId;
    public final boolean isRender;

    @NotNull
    public final String name;
    public final int openingsCountRequired;

    @NotNull
    public final CommonRarityEnum rarity;

    @NotNull
    public final CaseRenderAttachment renderAttachment;
    public final int state;
    public final int typeCasesBonusDto;

    /* compiled from: CaseBonus.kt */
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
            try {
                iArr[CommonRarityEnum.COMMON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CaseBonus() {
        this(0, 0, null, null, 0, 0, null, 0, false, null, null, 0, UnixStat.PERM_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final CaseRenderAttachment getRenderAttachment() {
        return this.renderAttachment;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* renamed from: component12, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTypeCasesBonusDto() {
        return this.typeCasesBonusDto;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* renamed from: component5, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOpeningsCountRequired() {
        return this.openingsCountRequired;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRender() {
        return this.isRender;
    }

    @NotNull
    public final CaseBonus copy(int id, int typeCasesBonusDto, @NotNull String name, @Nullable Bitmap imageBitmap, int state, int openingsCountRequired, @NotNull CommonRarityEnum rarity, int count, boolean isRender, @NotNull CaseRenderAttachment renderAttachment, @NotNull String imageName, int internalId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(renderAttachment, "renderAttachment");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new CaseBonus(id, typeCasesBonusDto, name, imageBitmap, state, openingsCountRequired, rarity, count, isRender, renderAttachment, imageName, internalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseBonus)) {
            return false;
        }
        CaseBonus caseBonus = (CaseBonus) other;
        return this.id == caseBonus.id && this.typeCasesBonusDto == caseBonus.typeCasesBonusDto && Intrinsics.areEqual(this.name, caseBonus.name) && Intrinsics.areEqual(this.imageBitmap, caseBonus.imageBitmap) && this.state == caseBonus.state && this.openingsCountRequired == caseBonus.openingsCountRequired && this.rarity == caseBonus.rarity && this.count == caseBonus.count && this.isRender == caseBonus.isRender && Intrinsics.areEqual(this.renderAttachment, caseBonus.renderAttachment) && Intrinsics.areEqual(this.imageName, caseBonus.imageName) && this.internalId == caseBonus.internalId;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.typeCasesBonusDto)) * 31) + this.name.hashCode()) * 31;
        Bitmap bitmap = this.imageBitmap;
        return ((((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.openingsCountRequired)) * 31) + this.rarity.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.isRender)) * 31) + this.renderAttachment.hashCode()) * 31) + this.imageName.hashCode()) * 31) + Integer.hashCode(this.internalId);
    }

    @NotNull
    public String toString() {
        return "CaseBonus(id=" + this.id + ", typeCasesBonusDto=" + this.typeCasesBonusDto + ", name=" + this.name + ", imageBitmap=" + this.imageBitmap + ", state=" + this.state + ", openingsCountRequired=" + this.openingsCountRequired + ", rarity=" + this.rarity + ", count=" + this.count + ", isRender=" + this.isRender + ", renderAttachment=" + this.renderAttachment + ", imageName=" + this.imageName + ", internalId=" + this.internalId + ")";
    }

    public CaseBonus(int i, int i2, @NotNull String name, @Nullable Bitmap bitmap, int i3, int i4, @NotNull CommonRarityEnum rarity, int i5, boolean z, @NotNull CaseRenderAttachment renderAttachment, @NotNull String imageName, int i6) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(renderAttachment, "renderAttachment");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.id = i;
        this.typeCasesBonusDto = i2;
        this.name = name;
        this.imageBitmap = bitmap;
        this.state = i3;
        this.openingsCountRequired = i4;
        this.rarity = rarity;
        this.count = i5;
        this.isRender = z;
        this.renderAttachment = renderAttachment;
        this.imageName = imageName;
        this.internalId = i6;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTypeCasesBonusDto() {
        return this.typeCasesBonusDto;
    }

    public /* synthetic */ CaseBonus(int i, int i2, String str, Bitmap bitmap, int i3, int i4, CommonRarityEnum commonRarityEnum, int i5, boolean z, CaseRenderAttachment caseRenderAttachment, String str2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i7 & 8) != 0 ? null : bitmap, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? false : z, (i7 & 512) != 0 ? new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null) : caseRenderAttachment, (i7 & 1024) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i7 & 2048) == 0 ? i6 : 0);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final int getState() {
        return this.state;
    }

    public final int getOpeningsCountRequired() {
        return this.openingsCountRequired;
    }

    @NotNull
    public final CommonRarityEnum getRarity() {
        return this.rarity;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean isRender() {
        return this.isRender;
    }

    @NotNull
    public final CaseRenderAttachment getRenderAttachment() {
        return this.renderAttachment;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    public final int getInternalId() {
        return this.internalId;
    }

    public final int getBgColor() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rarity.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.black_30 : R.color.gray : R.color.dark_green : R.color.light_blue_80 : R.color.purple : R.color.yellow;
    }

    /* renamed from: getShadowColor-0d7_KjU, reason: not valid java name */
    public final long m14446getShadowColor0d7_KjU() {
        if (this.state == 2) {
            return Color.INSTANCE.m11377getWhite0d7_KjU();
        }
        return Color.INSTANCE.m11375getTransparent0d7_KjU();
    }

    public final float getAlpha() {
        return this.state == 3 ? 0.5f : 1.0f;
    }

    public final boolean isReceived() {
        return this.state == 3;
    }

    public final boolean isAvailable() {
        return this.state == 2;
    }
}

