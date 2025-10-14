package com.blackhub.bronline.game.gui.gasmangame.uistate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.DoubleExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GasmanSizesItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006("}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanSizesItem;", "", "width", "", "fortyFour", "fiftySeven", "eightyEight", "oneHundred", "oneHundredThirty", "oneHundredThirtyTwo", "(IIIIIII)V", "getEightyEight", "()I", "setEightyEight", "(I)V", "getFiftySeven", "setFiftySeven", "getFortyFour", "setFortyFour", "getOneHundred", "setOneHundred", "getOneHundredThirty", "setOneHundredThirty", "getOneHundredThirtyTwo", "setOneHundredThirtyTwo", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GasmanSizesItem {
    public static final int $stable = 8;
    public int eightyEight;
    public int fiftySeven;
    public int fortyFour;
    public int oneHundred;
    public int oneHundredThirty;
    public int oneHundredThirtyTwo;
    public final int width;

    public static /* synthetic */ GasmanSizesItem copy$default(GasmanSizesItem gasmanSizesItem, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = gasmanSizesItem.width;
        }
        if ((i8 & 2) != 0) {
            i2 = gasmanSizesItem.fortyFour;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = gasmanSizesItem.fiftySeven;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = gasmanSizesItem.eightyEight;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = gasmanSizesItem.oneHundred;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = gasmanSizesItem.oneHundredThirty;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = gasmanSizesItem.oneHundredThirtyTwo;
        }
        return gasmanSizesItem.copy(i, i9, i10, i11, i12, i13, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFortyFour() {
        return this.fortyFour;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFiftySeven() {
        return this.fiftySeven;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEightyEight() {
        return this.eightyEight;
    }

    /* renamed from: component5, reason: from getter */
    public final int getOneHundred() {
        return this.oneHundred;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOneHundredThirty() {
        return this.oneHundredThirty;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOneHundredThirtyTwo() {
        return this.oneHundredThirtyTwo;
    }

    @NotNull
    public final GasmanSizesItem copy(int width, int fortyFour, int fiftySeven, int eightyEight, int oneHundred, int oneHundredThirty, int oneHundredThirtyTwo) {
        return new GasmanSizesItem(width, fortyFour, fiftySeven, eightyEight, oneHundred, oneHundredThirty, oneHundredThirtyTwo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasmanSizesItem)) {
            return false;
        }
        GasmanSizesItem gasmanSizesItem = (GasmanSizesItem) other;
        return this.width == gasmanSizesItem.width && this.fortyFour == gasmanSizesItem.fortyFour && this.fiftySeven == gasmanSizesItem.fiftySeven && this.eightyEight == gasmanSizesItem.eightyEight && this.oneHundred == gasmanSizesItem.oneHundred && this.oneHundredThirty == gasmanSizesItem.oneHundredThirty && this.oneHundredThirtyTwo == gasmanSizesItem.oneHundredThirtyTwo;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.fortyFour)) * 31) + Integer.hashCode(this.fiftySeven)) * 31) + Integer.hashCode(this.eightyEight)) * 31) + Integer.hashCode(this.oneHundred)) * 31) + Integer.hashCode(this.oneHundredThirty)) * 31) + Integer.hashCode(this.oneHundredThirtyTwo);
    }

    @NotNull
    public String toString() {
        return "GasmanSizesItem(width=" + this.width + ", fortyFour=" + this.fortyFour + ", fiftySeven=" + this.fiftySeven + ", eightyEight=" + this.eightyEight + ", oneHundred=" + this.oneHundred + ", oneHundredThirty=" + this.oneHundredThirty + ", oneHundredThirtyTwo=" + this.oneHundredThirtyTwo + ")";
    }

    public GasmanSizesItem(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.width = i;
        this.fortyFour = i2;
        this.fiftySeven = i3;
        this.eightyEight = i4;
        this.oneHundred = i5;
        this.oneHundredThirty = i6;
        this.oneHundredThirtyTwo = i7;
        if (i != 0) {
            int iRoundToIntSafely = DoubleExtensionKt.roundToIntSafely(i * 0.0521327014218d);
            this.fortyFour = IntExtensionKt.isEven(iRoundToIntSafely) ? iRoundToIntSafely : iRoundToIntSafely - 1;
            int iCeil = (int) Math.ceil(i * 0.0675355450236967d);
            this.fiftySeven = IntExtensionKt.isEven(iCeil) ? iCeil : iCeil - 1;
            int iRoundToIntSafely2 = DoubleExtensionKt.roundToIntSafely(i * 0.1540284360189573d);
            this.oneHundredThirty = iRoundToIntSafely2;
            if (!IntExtensionKt.isEven(iRoundToIntSafely2)) {
                this.oneHundredThirty--;
            }
            int i8 = this.fortyFour;
            int i9 = i8 + i8;
            this.eightyEight = i9;
            this.oneHundred = (this.fiftySeven + i9) - i8;
            this.oneHundredThirtyTwo = i9 + i8;
        }
    }

    public /* synthetic */ GasmanSizesItem(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i8 & 2) != 0 ? -2 : i2, (i8 & 4) != 0 ? -2 : i3, (i8 & 8) != 0 ? -2 : i4, (i8 & 16) != 0 ? -2 : i5, (i8 & 32) != 0 ? -2 : i6, (i8 & 64) == 0 ? i7 : -2);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getFortyFour() {
        return this.fortyFour;
    }

    public final void setFortyFour(int i) {
        this.fortyFour = i;
    }

    public final int getFiftySeven() {
        return this.fiftySeven;
    }

    public final void setFiftySeven(int i) {
        this.fiftySeven = i;
    }

    public final int getEightyEight() {
        return this.eightyEight;
    }

    public final void setEightyEight(int i) {
        this.eightyEight = i;
    }

    public final int getOneHundred() {
        return this.oneHundred;
    }

    public final void setOneHundred(int i) {
        this.oneHundred = i;
    }

    public final int getOneHundredThirty() {
        return this.oneHundredThirty;
    }

    public final void setOneHundredThirty(int i) {
        this.oneHundredThirty = i;
    }

    public final int getOneHundredThirtyTwo() {
        return this.oneHundredThirtyTwo;
    }

    public final void setOneHundredThirtyTwo(int i) {
        this.oneHundredThirtyTwo = i;
    }
}
