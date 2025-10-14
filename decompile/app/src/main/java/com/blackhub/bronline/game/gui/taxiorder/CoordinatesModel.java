package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoordinatesModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;", "", "x", "", "y", "(DD)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
