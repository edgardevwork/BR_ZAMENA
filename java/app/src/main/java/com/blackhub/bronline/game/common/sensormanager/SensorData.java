package com.blackhub.bronline.game.common.sensormanager;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SensorData.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class SensorData {
    public static final int $stable = 0;
    public final float horizontal;
    public final float vertical;

    public static /* synthetic */ SensorData copy$default(SensorData sensorData, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = sensorData.vertical;
        }
        if ((i & 2) != 0) {
            f2 = sensorData.horizontal;
        }
        return sensorData.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getVertical() {
        return this.vertical;
    }

    /* renamed from: component2, reason: from getter */
    public final float getHorizontal() {
        return this.horizontal;
    }

    @NotNull
    public final SensorData copy(float vertical, float horizontal) {
        return new SensorData(vertical, horizontal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorData)) {
            return false;
        }
        SensorData sensorData = (SensorData) other;
        return Float.compare(this.vertical, sensorData.vertical) == 0 && Float.compare(this.horizontal, sensorData.horizontal) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.vertical) * 31) + Float.hashCode(this.horizontal);
    }

    @NotNull
    public String toString() {
        return "SensorData(vertical=" + this.vertical + ", horizontal=" + this.horizontal + ")";
    }

    public SensorData(float f, float f2) {
        this.vertical = f;
        this.horizontal = f2;
    }

    public final float getVertical() {
        return this.vertical;
    }

    public final float getHorizontal() {
        return this.horizontal;
    }
}

