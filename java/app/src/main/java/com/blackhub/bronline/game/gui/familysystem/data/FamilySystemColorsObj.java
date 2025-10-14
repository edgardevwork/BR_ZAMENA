package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkFamilySystem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilySystemColorsObj {
    public static final int $stable = 0;

    @SerializedName("color")
    @NotNull
    public final String color;

    @SerializedName("id")
    public final int id;

    @SerializedName("title")
    @NotNull
    public final String title;

    public static /* synthetic */ FamilySystemColorsObj copy$default(FamilySystemColorsObj familySystemColorsObj, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = familySystemColorsObj.id;
        }
        if ((i2 & 2) != 0) {
            str = familySystemColorsObj.title;
        }
        if ((i2 & 4) != 0) {
            str2 = familySystemColorsObj.color;
        }
        return familySystemColorsObj.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final FamilySystemColorsObj copy(int id, @NotNull String title, @NotNull String color) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        return new FamilySystemColorsObj(id, title, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilySystemColorsObj)) {
            return false;
        }
        FamilySystemColorsObj familySystemColorsObj = (FamilySystemColorsObj) other;
        return this.id == familySystemColorsObj.id && Intrinsics.areEqual(this.title, familySystemColorsObj.title) && Intrinsics.areEqual(this.color, familySystemColorsObj.color);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.color.hashCode();
    }

    @NotNull
    public String toString() {
        return "FamilySystemColorsObj(id=" + this.id + ", title=" + this.title + ", color=" + this.color + ")";
    }

    public FamilySystemColorsObj(int i, @NotNull String title, @NotNull String color) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = i;
        this.title = title;
        this.color = color;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }
}

