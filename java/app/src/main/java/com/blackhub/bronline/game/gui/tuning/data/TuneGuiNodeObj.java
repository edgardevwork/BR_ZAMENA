package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneGuiNodeObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuneGuiNodeObj {
    public static final int $stable = 8;

    @SerializedName("imageId")
    @NotNull
    public String imageId;

    @SerializedName("name")
    @NotNull
    public String name;

    @SerializedName("names")
    @NotNull
    public ArrayList<TuneGuiNodeObj> names;

    @SerializedName("opensType")
    public int opensType;

    @SerializedName("selectorId")
    public int selectorId;

    public static /* synthetic */ TuneGuiNodeObj copy$default(TuneGuiNodeObj tuneGuiNodeObj, String str, int i, int i2, String str2, ArrayList arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tuneGuiNodeObj.name;
        }
        if ((i3 & 2) != 0) {
            i = tuneGuiNodeObj.opensType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = tuneGuiNodeObj.selectorId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = tuneGuiNodeObj.imageId;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            arrayList = tuneGuiNodeObj.names;
        }
        return tuneGuiNodeObj.copy(str, i4, i5, str3, arrayList);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOpensType() {
        return this.opensType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectorId() {
        return this.selectorId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    public final ArrayList<TuneGuiNodeObj> component5() {
        return this.names;
    }

    @NotNull
    public final TuneGuiNodeObj copy(@NotNull String name, int opensType, int selectorId, @NotNull String imageId, @NotNull ArrayList<TuneGuiNodeObj> names) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(names, "names");
        return new TuneGuiNodeObj(name, opensType, selectorId, imageId, names);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuneGuiNodeObj)) {
            return false;
        }
        TuneGuiNodeObj tuneGuiNodeObj = (TuneGuiNodeObj) other;
        return Intrinsics.areEqual(this.name, tuneGuiNodeObj.name) && this.opensType == tuneGuiNodeObj.opensType && this.selectorId == tuneGuiNodeObj.selectorId && Intrinsics.areEqual(this.imageId, tuneGuiNodeObj.imageId) && Intrinsics.areEqual(this.names, tuneGuiNodeObj.names);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + Integer.hashCode(this.opensType)) * 31) + Integer.hashCode(this.selectorId)) * 31) + this.imageId.hashCode()) * 31) + this.names.hashCode();
    }

    @NotNull
    public String toString() {
        return "TuneGuiNodeObj(name=" + this.name + ", opensType=" + this.opensType + ", selectorId=" + this.selectorId + ", imageId=" + this.imageId + ", names=" + this.names + ")";
    }

    public TuneGuiNodeObj(@NotNull String name, int i, int i2, @NotNull String imageId, @NotNull ArrayList<TuneGuiNodeObj> names) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(names, "names");
        this.name = name;
        this.opensType = i;
        this.selectorId = i2;
        this.imageId = imageId;
        this.names = names;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getOpensType() {
        return this.opensType;
    }

    public final void setOpensType(int i) {
        this.opensType = i;
    }

    public final int getSelectorId() {
        return this.selectorId;
    }

    public final void setSelectorId(int i) {
        this.selectorId = i;
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    public final void setImageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageId = str;
    }

    @NotNull
    public final ArrayList<TuneGuiNodeObj> getNames() {
        return this.names;
    }

    public final void setNames(@NotNull ArrayList<TuneGuiNodeObj> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.names = arrayList;
    }
}

