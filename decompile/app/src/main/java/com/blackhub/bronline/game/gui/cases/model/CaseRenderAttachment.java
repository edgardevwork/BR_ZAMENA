package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseRenderAttachment.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J~\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CaseRenderAttachment;", "", "type", "", "modelId", "color", "zoom", "", "rotationX", "rotationY", "rotationZ", "shiftX", "shiftY", "shiftZ", "(IIIFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getColor", "()I", "getModelId", "getRotationX", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRotationY", "getRotationZ", "getShiftX", "getShiftY", "getShiftZ", "getType", "getZoom", "()F", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/blackhub/bronline/game/gui/cases/model/CaseRenderAttachment;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
