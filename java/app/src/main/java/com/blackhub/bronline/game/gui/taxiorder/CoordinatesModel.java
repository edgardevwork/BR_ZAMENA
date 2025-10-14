package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoordinatesModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CoordinatesModel {
    public static final int $stable = 8;
    public double x;
    public double y;

    public CoordinatesModel() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ CoordinatesModel copy$default(CoordinatesModel coordinatesModel, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = coordinatesModel.x;
        }
        if ((i & 2) != 0) {
            d2 = coordinatesModel.y;
        }
        return coordinatesModel.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final CoordinatesModel copy(double x, double y) {
        return new CoordinatesModel(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinatesModel)) {
            return false;
        }
        CoordinatesModel coordinatesModel = (CoordinatesModel) other;
        return Double.compare(this.x, coordinatesModel.x) == 0 && Double.compare(this.y, coordinatesModel.y) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.x) * 31) + Double.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "CoordinatesModel(x=" + this.x + ", y=" + this.y + ")";
    }

    public CoordinatesModel(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public /* synthetic */ CoordinatesModel(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public final double getX() {
        return this.x;
    }

    public final void setX(double d) {
        this.x = d;
    }

    public final double getY() {
        return this.y;
    }

    public final void setY(double d) {
        this.y = d;
    }
}

