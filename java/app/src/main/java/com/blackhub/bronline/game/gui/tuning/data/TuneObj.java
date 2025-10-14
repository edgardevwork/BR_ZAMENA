package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuneObj {
    public static final int $stable = 8;
    public int cost;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    public int currency;

    @SerializedName("def")
    public int def;

    @SerializedName("id")
    public int id;

    @SerializedName("imageId")
    @NotNull
    public String imageId;
    public boolean isChecked;

    @SerializedName("name")
    @NotNull
    public String name;

    @SerializedName("selector")
    public int selector;
    public int thisLocation;

    @SerializedName("tuneId")
    public int tuneId;

    @SerializedName("type")
    public int type;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getThisLocation() {
        return this.thisLocation;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelector() {
        return this.selector;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTuneId() {
        return this.tuneId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrency() {
        return this.currency;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDef() {
        return this.def;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCost() {
        return this.cost;
    }

    @NotNull
    public final TuneObj copy(int id, int type, int selector, int tuneId, @NotNull String name, @NotNull String imageId, int currency, int def, int cost, int thisLocation, boolean isChecked) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        return new TuneObj(id, type, selector, tuneId, name, imageId, currency, def, cost, thisLocation, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuneObj)) {
            return false;
        }
        TuneObj tuneObj = (TuneObj) other;
        return this.id == tuneObj.id && this.type == tuneObj.type && this.selector == tuneObj.selector && this.tuneId == tuneObj.tuneId && Intrinsics.areEqual(this.name, tuneObj.name) && Intrinsics.areEqual(this.imageId, tuneObj.imageId) && this.currency == tuneObj.currency && this.def == tuneObj.def && this.cost == tuneObj.cost && this.thisLocation == tuneObj.thisLocation && this.isChecked == tuneObj.isChecked;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.selector)) * 31) + Integer.hashCode(this.tuneId)) * 31) + this.name.hashCode()) * 31) + this.imageId.hashCode()) * 31) + Integer.hashCode(this.currency)) * 31) + Integer.hashCode(this.def)) * 31) + Integer.hashCode(this.cost)) * 31) + Integer.hashCode(this.thisLocation)) * 31) + Boolean.hashCode(this.isChecked);
    }

    @NotNull
    public String toString() {
        return "TuneObj(id=" + this.id + ", type=" + this.type + ", selector=" + this.selector + ", tuneId=" + this.tuneId + ", name=" + this.name + ", imageId=" + this.imageId + ", currency=" + this.currency + ", def=" + this.def + ", cost=" + this.cost + ", thisLocation=" + this.thisLocation + ", isChecked=" + this.isChecked + ")";
    }

    public TuneObj(int i, int i2, int i3, int i4, @NotNull String name, @NotNull String imageId, int i5, int i6, int i7, int i8, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.id = i;
        this.type = i2;
        this.selector = i3;
        this.tuneId = i4;
        this.name = name;
        this.imageId = imageId;
        this.currency = i5;
        this.def = i6;
        this.cost = i7;
        this.thisLocation = i8;
        this.isChecked = z;
    }

    public /* synthetic */ TuneObj(int i, int i2, int i3, int i4, String str, String str2, int i5, int i6, int i7, int i8, boolean z, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, str, str2, i5, i6, (i9 & 256) != 0 ? 0 : i7, (i9 & 512) != 0 ? 0 : i8, (i9 & 1024) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getSelector() {
        return this.selector;
    }

    public final void setSelector(int i) {
        this.selector = i;
    }

    public final int getTuneId() {
        return this.tuneId;
    }

    public final void setTuneId(int i) {
        this.tuneId = i;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    public final void setImageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageId = str;
    }

    public final int getCurrency() {
        return this.currency;
    }

    public final void setCurrency(int i) {
        this.currency = i;
    }

    public final int getDef() {
        return this.def;
    }

    public final void setDef(int i) {
        this.def = i;
    }

    public final int getCost() {
        return this.cost;
    }

    public final void setCost(int i) {
        this.cost = i;
    }

    public final int getThisLocation() {
        return this.thisLocation;
    }

    public final void setThisLocation(int i) {
        this.thisLocation = i;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}

