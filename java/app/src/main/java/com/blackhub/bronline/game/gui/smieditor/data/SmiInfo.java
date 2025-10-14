package com.blackhub.bronline.game.gui.smieditor.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SmiList.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class SmiInfo {
    public static final int $stable = 8;

    @SerializedName("id")
    public int id;
    public boolean isChecked;

    @SerializedName("name")
    @NotNull
    public String name;

    @SerializedName("name_store")
    @NotNull
    public String nameStore;

    public static /* synthetic */ SmiInfo copy$default(SmiInfo smiInfo, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = smiInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = smiInfo.name;
        }
        if ((i2 & 4) != 0) {
            str2 = smiInfo.nameStore;
        }
        if ((i2 & 8) != 0) {
            z = smiInfo.isChecked;
        }
        return smiInfo.copy(i, str, str2, z);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final SmiInfo copy(int id, @NotNull String name, @NotNull String nameStore, boolean isChecked) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStore, "nameStore");
        return new SmiInfo(id, name, nameStore, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmiInfo)) {
            return false;
        }
        SmiInfo smiInfo = (SmiInfo) other;
        return this.id == smiInfo.id && Intrinsics.areEqual(this.name, smiInfo.name) && Intrinsics.areEqual(this.nameStore, smiInfo.nameStore) && this.isChecked == smiInfo.isChecked;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.nameStore.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    @NotNull
    public String toString() {
        return "SmiInfo(id=" + this.id + ", name=" + this.name + ", nameStore=" + this.nameStore + ", isChecked=" + this.isChecked + ")";
    }

    public SmiInfo(int i, @NotNull String name, @NotNull String nameStore, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStore, "nameStore");
        this.id = i;
        this.name = name;
        this.nameStore = nameStore;
        this.isChecked = z;
    }

    public /* synthetic */ SmiInfo(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
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
    public final String getNameStore() {
        return this.nameStore;
    }

    public final void setNameStore(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameStore = str;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}

