package com.blackhub.bronline.game.gui.bprewards.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsRenderAttachment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J}\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsRenderAttachment;", "", "type", "", "modelId", "color", "zoom", "", "rotationX", "rotationY", "rotationZ", "shiftX", "shiftY", "shiftZ", "plateText", "", "", "(IIIFFFFFFFLjava/util/List;)V", "getColor", "()I", "getModelId", "getPlateText", "()Ljava/util/List;", "getRotationX", "()F", "getRotationY", "getRotationZ", "getShiftX", "getShiftY", "getShiftZ", "getType", "getZoom", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsRenderAttachment {
    public static final int $stable = 8;
    public final int color;
    public final int modelId;

    @NotNull
    public final List<String> plateText;
    public final float rotationX;
    public final float rotationY;
    public final float rotationZ;
    public final float shiftX;
    public final float shiftY;
    public final float shiftZ;
    public final int type;
    public final float zoom;

    public BpRewardsRenderAttachment() {
        this(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, DoubleToDecimal.BQ_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final float getShiftZ() {
        return this.shiftZ;
    }

    @NotNull
    public final List<String> component11() {
        return this.plateText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getModelId() {
        return this.modelId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* renamed from: component5, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component7, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* renamed from: component8, reason: from getter */
    public final float getShiftX() {
        return this.shiftX;
    }

    /* renamed from: component9, reason: from getter */
    public final float getShiftY() {
        return this.shiftY;
    }

    @NotNull
    public final BpRewardsRenderAttachment copy(int type, int modelId, int color, float zoom, float rotationX, float rotationY, float rotationZ, float shiftX, float shiftY, float shiftZ, @NotNull List<String> plateText) {
        Intrinsics.checkNotNullParameter(plateText, "plateText");
        return new BpRewardsRenderAttachment(type, modelId, color, zoom, rotationX, rotationY, rotationZ, shiftX, shiftY, shiftZ, plateText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsRenderAttachment)) {
            return false;
        }
        BpRewardsRenderAttachment bpRewardsRenderAttachment = (BpRewardsRenderAttachment) other;
        return this.type == bpRewardsRenderAttachment.type && this.modelId == bpRewardsRenderAttachment.modelId && this.color == bpRewardsRenderAttachment.color && Float.compare(this.zoom, bpRewardsRenderAttachment.zoom) == 0 && Float.compare(this.rotationX, bpRewardsRenderAttachment.rotationX) == 0 && Float.compare(this.rotationY, bpRewardsRenderAttachment.rotationY) == 0 && Float.compare(this.rotationZ, bpRewardsRenderAttachment.rotationZ) == 0 && Float.compare(this.shiftX, bpRewardsRenderAttachment.shiftX) == 0 && Float.compare(this.shiftY, bpRewardsRenderAttachment.shiftY) == 0 && Float.compare(this.shiftZ, bpRewardsRenderAttachment.shiftZ) == 0 && Intrinsics.areEqual(this.plateText, bpRewardsRenderAttachment.plateText);
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.zoom)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.shiftX)) * 31) + Float.hashCode(this.shiftY)) * 31) + Float.hashCode(this.shiftZ)) * 31) + this.plateText.hashCode();
    }

    @NotNull
    public String toString() {
        return "BpRewardsRenderAttachment(type=" + this.type + ", modelId=" + this.modelId + ", color=" + this.color + ", zoom=" + this.zoom + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", shiftX=" + this.shiftX + ", shiftY=" + this.shiftY + ", shiftZ=" + this.shiftZ + ", plateText=" + this.plateText + ")";
    }

    public BpRewardsRenderAttachment(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<String> plateText) {
        Intrinsics.checkNotNullParameter(plateText, "plateText");
        this.type = i;
        this.modelId = i2;
        this.color = i3;
        this.zoom = f;
        this.rotationX = f2;
        this.rotationY = f3;
        this.rotationZ = f4;
        this.shiftX = f5;
        this.shiftY = f6;
        this.shiftZ = f7;
        this.plateText = plateText;
    }

    public final int getType() {
        return this.type;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getShiftX() {
        return this.shiftX;
    }

    public final float getShiftY() {
        return this.shiftY;
    }

    public final float getShiftZ() {
        return this.shiftZ;
    }

    public /* synthetic */ BpRewardsRenderAttachment(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? 20.0f : f2, (i4 & 32) != 0 ? 180.0f : f3, (i4 & 64) != 0 ? 45.0f : f4, (i4 & 128) != 0 ? 0.0f : f5, (i4 & 256) != 0 ? 0.0f : f6, (i4 & 512) == 0 ? f7 : 0.0f, (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<String> getPlateText() {
        return this.plateText;
    }
}
