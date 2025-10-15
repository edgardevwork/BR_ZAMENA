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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonImageItem;", "", "id", "", "image", "Landroid/graphics/Bitmap;", "color", "Landroidx/compose/ui/graphics/Color;", "(ILandroid/graphics/Bitmap;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getId", "()I", "getImage", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(ILandroid/graphics/Bitmap;J)Lcom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonImageItem;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
