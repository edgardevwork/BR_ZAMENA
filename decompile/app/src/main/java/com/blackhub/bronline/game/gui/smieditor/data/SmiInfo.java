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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/data/SmiInfo;", "", "id", "", "name", "", "nameStore", "isChecked", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "setId", "(I)V", "()Z", "setChecked", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNameStore", "setNameStore", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
