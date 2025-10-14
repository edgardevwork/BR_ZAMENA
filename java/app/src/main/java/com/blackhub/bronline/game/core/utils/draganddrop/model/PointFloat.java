package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointFloat.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class PointFloat {
    public static final int $stable = 0;
    public final float x;
    public final float y;

    /* JADX WARN: Illegal instructions before constructor call */
    public PointFloat() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ PointFloat copy$default(PointFloat pointFloat, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pointFloat.x;
        }
        if ((i & 2) != 0) {
            f2 = pointFloat.y;
        }
        return pointFloat.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final PointFloat copy(float x, float y) {
        return new PointFloat(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointFloat)) {
            return false;
        }
        PointFloat pointFloat = (PointFloat) other;
        return Float.compare(this.x, pointFloat.x) == 0 && Float.compare(this.y, pointFloat.y) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "PointFloat(x=" + this.x + ", y=" + this.y + ")";
    }

    public PointFloat(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public /* synthetic */ PointFloat(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }
}

