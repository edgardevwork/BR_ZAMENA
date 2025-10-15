package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataDataDragViewNative.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDataDragViewNative;", "", "startX", "", "startY", "scaleX", "scaleY", "rotate", "(FFFFF)V", "getRotate", "()F", "getScaleX", "getScaleY", "getStartX", "getStartY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
