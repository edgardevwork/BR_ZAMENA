package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataDragAndDrop.kt */
@StabilityInferred(parameters = 1)
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

