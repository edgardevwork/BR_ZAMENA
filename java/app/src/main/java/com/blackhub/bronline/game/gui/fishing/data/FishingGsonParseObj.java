package com.blackhub.bronline.game.gui.fishing.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingGsonParseObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FishingGsonParseObj {
    public static final int $stable = 8;

    @SerializedName("bait")
    @Nullable
    public final FishingBaitObj bait;

    @SerializedName("fish")
    @NotNull
    public final FishingBaitObj fish;

    @SerializedName("fishing_time")
    public final long fishingTime;

    @SerializedName("progress_time")
    public final int progressTime;

    @SerializedName("fish_speed")
    public final float speed;

    @SerializedName("tackle")
    @Nullable
    public final FishingBaitObj tackle;

    public FishingGsonParseObj() {
        this(0.0f, 0L, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ FishingGsonParseObj copy$default(FishingGsonParseObj fishingGsonParseObj, float f, long j, int i, FishingBaitObj fishingBaitObj, FishingBaitObj fishingBaitObj2, FishingBaitObj fishingBaitObj3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = fishingGsonParseObj.speed;
        }
        if ((i2 & 2) != 0) {
            j = fishingGsonParseObj.fishingTime;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = fishingGsonParseObj.progressTime;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            fishingBaitObj = fishingGsonParseObj.bait;
        }
        FishingBaitObj fishingBaitObj4 = fishingBaitObj;
        if ((i2 & 16) != 0) {
            fishingBaitObj2 = fishingGsonParseObj.tackle;
        }
        FishingBaitObj fishingBaitObj5 = fishingBaitObj2;
        if ((i2 & 32) != 0) {
            fishingBaitObj3 = fishingGsonParseObj.fish;
        }
        return fishingGsonParseObj.copy(f, j2, i3, fishingBaitObj4, fishingBaitObj5, fishingBaitObj3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFishingTime() {
        return this.fishingTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgressTime() {
        return this.progressTime;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final FishingBaitObj getBait() {
        return this.bait;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final FishingBaitObj getTackle() {
        return this.tackle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final FishingBaitObj getFish() {
        return this.fish;
    }

    @NotNull
    public final FishingGsonParseObj copy(float speed, long fishingTime, int progressTime, @Nullable FishingBaitObj bait, @Nullable FishingBaitObj tackle, @NotNull FishingBaitObj fish) {
        Intrinsics.checkNotNullParameter(fish, "fish");
        return new FishingGsonParseObj(speed, fishingTime, progressTime, bait, tackle, fish);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FishingGsonParseObj)) {
            return false;
        }
        FishingGsonParseObj fishingGsonParseObj = (FishingGsonParseObj) other;
        return Float.compare(this.speed, fishingGsonParseObj.speed) == 0 && this.fishingTime == fishingGsonParseObj.fishingTime && this.progressTime == fishingGsonParseObj.progressTime && Intrinsics.areEqual(this.bait, fishingGsonParseObj.bait) && Intrinsics.areEqual(this.tackle, fishingGsonParseObj.tackle) && Intrinsics.areEqual(this.fish, fishingGsonParseObj.fish);
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.speed) * 31) + Long.hashCode(this.fishingTime)) * 31) + Integer.hashCode(this.progressTime)) * 31;
        FishingBaitObj fishingBaitObj = this.bait;
        int iHashCode2 = (iHashCode + (fishingBaitObj == null ? 0 : fishingBaitObj.hashCode())) * 31;
        FishingBaitObj fishingBaitObj2 = this.tackle;
        return ((iHashCode2 + (fishingBaitObj2 != null ? fishingBaitObj2.hashCode() : 0)) * 31) + this.fish.hashCode();
    }

    @NotNull
    public String toString() {
        return "FishingGsonParseObj(speed=" + this.speed + ", fishingTime=" + this.fishingTime + ", progressTime=" + this.progressTime + ", bait=" + this.bait + ", tackle=" + this.tackle + ", fish=" + this.fish + ")";
    }

    public FishingGsonParseObj(float f, long j, int i, @Nullable FishingBaitObj fishingBaitObj, @Nullable FishingBaitObj fishingBaitObj2, @NotNull FishingBaitObj fish) {
        Intrinsics.checkNotNullParameter(fish, "fish");
        this.speed = f;
        this.fishingTime = j;
        this.progressTime = i;
        this.bait = fishingBaitObj;
        this.tackle = fishingBaitObj2;
        this.fish = fish;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getFishingTime() {
        return this.fishingTime;
    }

    public final int getProgressTime() {
        return this.progressTime;
    }

    @Nullable
    public final FishingBaitObj getBait() {
        return this.bait;
    }

    @Nullable
    public final FishingBaitObj getTackle() {
        return this.tackle;
    }

    public /* synthetic */ FishingGsonParseObj(float f, long j, int i, FishingBaitObj fishingBaitObj, FishingBaitObj fishingBaitObj2, FishingBaitObj fishingBaitObj3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fishingBaitObj, (i2 & 16) == 0 ? fishingBaitObj2 : null, (i2 & 32) != 0 ? new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null) : fishingBaitObj3);
    }

    @NotNull
    public final FishingBaitObj getFish() {
        return this.fish;
    }
}

