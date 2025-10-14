package com.blackhub.bronline.game.common.sensormanager;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SensorData.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/sensormanager/SensorData;", "", "vertical", "", "horizontal", "(FF)V", "getHorizontal", "()F", "getVertical", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
