package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseRenderAttachment.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class CaseRenderAttachment {
    public static final int $stable = 0;
    public final int color;
    public final int modelId;

    @Nullable
    public final Float rotationX;

    @Nullable
    public final Float rotationY;

    @Nullable
    public final Float rotationZ;

    @Nullable
    public final Float shiftX;

    @Nullable
    public final Float shiftY;

    @Nullable
    public final Float shiftZ;
    public final int type;
    public final float zoom;

    public CaseRenderAttachment() {
        this(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Float getShiftZ() {
        return this.shiftZ;
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

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getRotationX() {
        return this.rotationX;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getRotationY() {
        return this.rotationY;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getRotationZ() {
        return this.rotationZ;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getShiftX() {
        return this.shiftX;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Float getShiftY() {
        return this.shiftY;
    }

    @NotNull
    public final CaseRenderAttachment copy(int type, int modelId, int color, float zoom, @Nullable Float rotationX, @Nullable Float rotationY, @Nullable Float rotationZ, @Nullable Float shiftX, @Nullable Float shiftY, @Nullable Float shiftZ) {
        return new CaseRenderAttachment(type, modelId, color, zoom, rotationX, rotationY, rotationZ, shiftX, shiftY, shiftZ);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseRenderAttachment)) {
            return false;
        }
        CaseRenderAttachment caseRenderAttachment = (CaseRenderAttachment) other;
        return this.type == caseRenderAttachment.type && this.modelId == caseRenderAttachment.modelId && this.color == caseRenderAttachment.color && Float.compare(this.zoom, caseRenderAttachment.zoom) == 0 && Intrinsics.areEqual((Object) this.rotationX, (Object) caseRenderAttachment.rotationX) && Intrinsics.areEqual((Object) this.rotationY, (Object) caseRenderAttachment.rotationY) && Intrinsics.areEqual((Object) this.rotationZ, (Object) caseRenderAttachment.rotationZ) && Intrinsics.areEqual((Object) this.shiftX, (Object) caseRenderAttachment.shiftX) && Intrinsics.areEqual((Object) this.shiftY, (Object) caseRenderAttachment.shiftY) && Intrinsics.areEqual((Object) this.shiftZ, (Object) caseRenderAttachment.shiftZ);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.zoom)) * 31;
        Float f = this.rotationX;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.rotationY;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.rotationZ;
        int iHashCode4 = (iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.shiftX;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.shiftY;
        int iHashCode6 = (iHashCode5 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.shiftZ;
        return iHashCode6 + (f6 != null ? f6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CaseRenderAttachment(type=" + this.type + ", modelId=" + this.modelId + ", color=" + this.color + ", zoom=" + this.zoom + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", shiftX=" + this.shiftX + ", shiftY=" + this.shiftY + ", shiftZ=" + this.shiftZ + ")";
    }

    public CaseRenderAttachment(int i, int i2, int i3, float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7) {
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
    }

    public /* synthetic */ CaseRenderAttachment(int i, int i2, int i3, float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? null : f2, (i4 & 32) != 0 ? null : f3, (i4 & 64) != 0 ? null : f4, (i4 & 128) != 0 ? null : f5, (i4 & 256) != 0 ? null : f6, (i4 & 512) == 0 ? f7 : null);
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

    @Nullable
    public final Float getRotationX() {
        return this.rotationX;
    }

    @Nullable
    public final Float getRotationY() {
        return this.rotationY;
    }

    @Nullable
    public final Float getRotationZ() {
        return this.rotationZ;
    }

    @Nullable
    public final Float getShiftX() {
        return this.shiftX;
    }

    @Nullable
    public final Float getShiftY() {
        return this.shiftY;
    }

    @Nullable
    public final Float getShiftZ() {
        return this.shiftZ;
    }
}

