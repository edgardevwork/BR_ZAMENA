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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\nHÆ\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "", "name", "", "opensType", "", "selectorId", "imageId", "names", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/ArrayList;)V", "getImageId", "()Ljava/lang/String;", "setImageId", "(Ljava/lang/String;)V", "getName", "setName", "getNames", "()Ljava/util/ArrayList;", "setNames", "(Ljava/util/ArrayList;)V", "getOpensType", "()I", "setOpensType", "(I)V", "getSelectorId", "setSelectorId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
