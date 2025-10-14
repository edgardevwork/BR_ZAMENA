package com.blackhub.bronline.game.core.utils.attachment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RenderAttachment.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class RenderAttachment {
    public static final int $stable = 0;
    public final int color;
    public final int id;
    public final int modelId;
    public final float rotationX;
    public final float rotationY;
    public final float rotationZ;
    public final int type;
    public final float zoom;

    public RenderAttachment() {
        this(0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getModelId() {
        return this.modelId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component7, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component8, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @NotNull
    public final RenderAttachment copy(int type, int id, int modelId, int color, float zoom, float rotationX, float rotationY, float rotationZ) {
        return new RenderAttachment(type, id, modelId, color, zoom, rotationX, rotationY, rotationZ);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderAttachment)) {
            return false;
        }
        RenderAttachment renderAttachment = (RenderAttachment) other;
        return this.type == renderAttachment.type && this.id == renderAttachment.id && this.modelId == renderAttachment.modelId && this.color == renderAttachment.color && Float.compare(this.zoom, renderAttachment.zoom) == 0 && Float.compare(this.rotationX, renderAttachment.rotationX) == 0 && Float.compare(this.rotationY, renderAttachment.rotationY) == 0 && Float.compare(this.rotationZ, renderAttachment.rotationZ) == 0;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.zoom)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ);
    }

    @NotNull
    public String toString() {
        return "RenderAttachment(type=" + this.type + ", id=" + this.id + ", modelId=" + this.modelId + ", color=" + this.color + ", zoom=" + this.zoom + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ")";
    }

    public RenderAttachment(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.type = i;
        this.id = i2;
        this.modelId = i3;
        this.color = i4;
        this.zoom = f;
        this.rotationX = f2;
        this.rotationY = f3;
        this.rotationZ = f4;
    }

    public /* synthetic */ RenderAttachment(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? 0.0f : f, (i5 & 32) != 0 ? 20.0f : f2, (i5 & 64) != 0 ? 180.0f : f3, (i5 & 128) != 0 ? 45.0f : f4);
    }

    public final int getType() {
        return this.type;
    }

    public final int getId() {
        return this.id;
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
}

