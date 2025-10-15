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
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fishing/data/FishingGsonParseObj;", "", "speed", "", "fishingTime", "", "progressTime", "", "bait", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "tackle", "fish", "(FJILcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;)V", "getBait", "()Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "getFish", "getFishingTime", "()J", "getProgressTime", "()I", "getSpeed", "()F", "getTackle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
