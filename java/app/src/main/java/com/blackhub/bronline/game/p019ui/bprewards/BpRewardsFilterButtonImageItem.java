package com.blackhub.bronline.game.p019ui.bprewards;

import android.graphics.Bitmap;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsFilterButtonImageItem.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class BpRewardsFilterButtonImageItem {
    public static final int $stable = 8;
    public final long color;
    public final int id;

    @Nullable
    public final Bitmap image;

    public /* synthetic */ BpRewardsFilterButtonImageItem(int i, Bitmap bitmap, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bitmap, j);
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ BpRewardsFilterButtonImageItem m14903copymxwnekA$default(BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem, int i, Bitmap bitmap, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bpRewardsFilterButtonImageItem.id;
        }
        if ((i2 & 2) != 0) {
            bitmap = bpRewardsFilterButtonImageItem.image;
        }
        if ((i2 & 4) != 0) {
            j = bpRewardsFilterButtonImageItem.color;
        }
        return bpRewardsFilterButtonImageItem.m14905copymxwnekA(i, bitmap, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final BpRewardsFilterButtonImageItem m14905copymxwnekA(int id, @Nullable Bitmap image, long color) {
        return new BpRewardsFilterButtonImageItem(id, image, color, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsFilterButtonImageItem)) {
            return false;
        }
        BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem = (BpRewardsFilterButtonImageItem) other;
        return this.id == bpRewardsFilterButtonImageItem.id && Intrinsics.areEqual(this.image, bpRewardsFilterButtonImageItem.image) && Color.m11341equalsimpl0(this.color, bpRewardsFilterButtonImageItem.color);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Bitmap bitmap = this.image;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Color.m11347hashCodeimpl(this.color);
    }

    @NotNull
    public String toString() {
        return "BpRewardsFilterButtonImageItem(id=" + this.id + ", image=" + this.image + ", color=" + Color.m11348toStringimpl(this.color) + ")";
    }

    public BpRewardsFilterButtonImageItem(int i, Bitmap bitmap, long j) {
        this.id = i;
        this.image = bitmap;
        this.color = j;
    }

    public /* synthetic */ BpRewardsFilterButtonImageItem(int i, Bitmap bitmap, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BpRewardsFilterStateEnum.ALL.getFilterState() : i, bitmap, j, null);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m14906getColor0d7_KjU() {
        return this.color;
    }
}

