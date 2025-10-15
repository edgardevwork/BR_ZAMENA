package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataDragAndDrop.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "", "newScale", "", "newRotate", "innerData", "", "(FFI)V", "getInnerData", "()I", "getNewRotate", "()F", "getNewScale", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DataDragAndDrop {
    public static final int $stable = 0;
    public final int innerData;
    public final float newRotate;
    public final float newScale;

    public DataDragAndDrop() {
        this(0.0f, 0.0f, 0, 7, null);
    }

    public static /* synthetic */ DataDragAndDrop copy$default(DataDragAndDrop dataDragAndDrop, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = dataDragAndDrop.newScale;
        }
        if ((i2 & 2) != 0) {
            f2 = dataDragAndDrop.newRotate;
        }
        if ((i2 & 4) != 0) {
            i = dataDragAndDrop.innerData;
        }
        return dataDragAndDrop.copy(f, f2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final float getNewScale() {
        return this.newScale;
    }

    /* renamed from: component2, reason: from getter */
    public final float getNewRotate() {
        return this.newRotate;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInnerData() {
        return this.innerData;
    }

    @NotNull
    public final DataDragAndDrop copy(float newScale, float newRotate, int innerData) {
        return new DataDragAndDrop(newScale, newRotate, innerData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataDragAndDrop)) {
            return false;
        }
        DataDragAndDrop dataDragAndDrop = (DataDragAndDrop) other;
        return Float.compare(this.newScale, dataDragAndDrop.newScale) == 0 && Float.compare(this.newRotate, dataDragAndDrop.newRotate) == 0 && this.innerData == dataDragAndDrop.innerData;
    }

    public int hashCode() {
        return (((Float.hashCode(this.newScale) * 31) + Float.hashCode(this.newRotate)) * 31) + Integer.hashCode(this.innerData);
    }

    @NotNull
    public String toString() {
        return "DataDragAndDrop(newScale=" + this.newScale + ", newRotate=" + this.newRotate + ", innerData=" + this.innerData + ")";
    }

    public DataDragAndDrop(float f, float f2, int i) {
        this.newScale = f;
        this.newRotate = f2;
        this.innerData = i;
    }

    public /* synthetic */ DataDragAndDrop(float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? -10 : i);
    }

    public final float getNewScale() {
        return this.newScale;
    }

    public final float getNewRotate() {
        return this.newRotate;
    }

    public final int getInnerData() {
        return this.innerData;
    }
}
