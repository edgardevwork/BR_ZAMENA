package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrivingMainType.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\r\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0013¨\u0006#"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "", "id", "", "name", "", "imageId", FirebaseAnalytics.Param.PRICE, "isUnBlock", "isCheck", "", "(ILjava/lang/String;IIIZ)V", "getId", "()I", "getImageId", "()Z", "setCheck", "(Z)V", "setUnBlock", "(I)V", "getName", "()Ljava/lang/String;", "getPrice", "setPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DrivingMainType {
    public static final int $stable = 8;
    public final int id;
    public final int imageId;
    public boolean isCheck;
    public int isUnBlock;

    @NotNull
    public final String name;
    public int price;

    public static /* synthetic */ DrivingMainType copy$default(DrivingMainType drivingMainType, int i, String str, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drivingMainType.id;
        }
        if ((i5 & 2) != 0) {
            str = drivingMainType.name;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = drivingMainType.imageId;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = drivingMainType.price;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = drivingMainType.isUnBlock;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            z = drivingMainType.isCheck;
        }
        return drivingMainType.copy(i, str2, i6, i7, i8, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getImageId() {
        return this.imageId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final int getIsUnBlock() {
        return this.isUnBlock;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    @NotNull
    public final DrivingMainType copy(int id, @NotNull String name, @DrawableRes int imageId, int price, int isUnBlock, boolean isCheck) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DrivingMainType(id, name, imageId, price, isUnBlock, isCheck);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingMainType)) {
            return false;
        }
        DrivingMainType drivingMainType = (DrivingMainType) other;
        return this.id == drivingMainType.id && Intrinsics.areEqual(this.name, drivingMainType.name) && this.imageId == drivingMainType.imageId && this.price == drivingMainType.price && this.isUnBlock == drivingMainType.isUnBlock && this.isCheck == drivingMainType.isCheck;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.imageId)) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.isUnBlock)) * 31) + Boolean.hashCode(this.isCheck);
    }

    @NotNull
    public String toString() {
        return "DrivingMainType(id=" + this.id + ", name=" + this.name + ", imageId=" + this.imageId + ", price=" + this.price + ", isUnBlock=" + this.isUnBlock + ", isCheck=" + this.isCheck + ")";
    }

    public DrivingMainType(int i, @NotNull String name, @DrawableRes int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.imageId = i2;
        this.price = i3;
        this.isUnBlock = i4;
        this.isCheck = z;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getImageId() {
        return this.imageId;
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final int isUnBlock() {
        return this.isUnBlock;
    }

    public final void setUnBlock(int i) {
        this.isUnBlock = i;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }
}
