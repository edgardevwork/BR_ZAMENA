package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataDataDragViewNative.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class DataDataDragViewNative {
    public static final int $stable = 0;
    public final float rotate;
    public final float scaleX;
    public final float scaleY;
    public final float startX;
    public final float startY;

    public DataDataDragViewNative() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ DataDataDragViewNative copy$default(DataDataDragViewNative dataDataDragViewNative, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dataDataDragViewNative.startX;
        }
        if ((i & 2) != 0) {
            f2 = dataDataDragViewNative.startY;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = dataDataDragViewNative.scaleX;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = dataDataDragViewNative.scaleY;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            f5 = dataDataDragViewNative.rotate;
        }
        return dataDataDragViewNative.copy(f, f6, f7, f8, f5);
    }

    /* renamed from: component1, reason: from getter */
    public final float getStartX() {
        return this.startX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getStartY() {
        return this.startY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component4, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: component5, reason: from getter */
    public final float getRotate() {
        return this.rotate;
    }

    @NotNull
    public final DataDataDragViewNative copy(float startX, float startY, float scaleX, float scaleY, float rotate) {
        return new DataDataDragViewNative(startX, startY, scaleX, scaleY, rotate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataDataDragViewNative)) {
            return false;
        }
        DataDataDragViewNative dataDataDragViewNative = (DataDataDragViewNative) other;
        return Float.compare(this.startX, dataDataDragViewNative.startX) == 0 && Float.compare(this.startY, dataDataDragViewNative.startY) == 0 && Float.compare(this.scaleX, dataDataDragViewNative.scaleX) == 0 && Float.compare(this.scaleY, dataDataDragViewNative.scaleY) == 0 && Float.compare(this.rotate, dataDataDragViewNative.rotate) == 0;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.startX) * 31) + Float.hashCode(this.startY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.rotate);
    }

    @NotNull
    public String toString() {
        return "DataDataDragViewNative(startX=" + this.startX + ", startY=" + this.startY + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", rotate=" + this.rotate + ")";
    }

    public DataDataDragViewNative(float f, float f2, float f3, float f4, float f5) {
        this.startX = f;
        this.startY = f2;
        this.scaleX = f3;
        this.scaleY = f4;
        this.rotate = f5;
    }

    public /* synthetic */ DataDataDragViewNative(float f, float f2, float f3, float f4, float f5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? 1.0f : f4, (i & 16) != 0 ? 0.0f : f5);
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getRotate() {
        return this.rotate;
    }
}

