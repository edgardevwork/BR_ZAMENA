package com.blackhub.bronline.launcher.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MyFile.kt */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"path", "name"})}, tableName = "MyFiles")
/* loaded from: classes3.dex */
public final /* data */ class MyFile {
    public static final int $stable = 8;

    @SerializedName("date")
    @NotNull
    public String data;
    public boolean downloaded;

    @PrimaryKey(autoGenerate = true)
    public int id;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("path")
    @NotNull
    public final String path;

    @SerializedName("size")
    public long size;

    public static /* synthetic */ MyFile copy$default(MyFile myFile, int i, String str, String str2, long j, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = myFile.id;
        }
        if ((i2 & 2) != 0) {
            str = myFile.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = myFile.path;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            j = myFile.size;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            str3 = myFile.data;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            z = myFile.downloaded;
        }
        return myFile.copy(i, str4, str5, j2, str6, z);
    }

    @NotNull
    public final MyFile copy(int id, @NotNull String name, @NotNull String path, long size, @NotNull String data, boolean downloaded) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(data, "data");
        return new MyFile(id, name, path, size, data, downloaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyFile)) {
            return false;
        }
        MyFile myFile = (MyFile) other;
        return this.id == myFile.id && Intrinsics.areEqual(this.name, myFile.name) && Intrinsics.areEqual(this.path, myFile.path) && this.size == myFile.size && Intrinsics.areEqual(this.data, myFile.data) && this.downloaded == myFile.downloaded;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.path.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.downloaded);
    }

    @NotNull
    public String toString() {
        return "MyFile(id=" + this.id + ", name=" + this.name + ", path=" + this.path + ", size=" + this.size + ", data=" + this.data + ", downloaded=" + this.downloaded + ")";
    }

    public MyFile(int i, @NotNull String name, @NotNull String path, long j, @NotNull String data, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = i;
        this.name = name;
        this.path = path;
        this.size = j;
        this.data = data;
        this.downloaded = z;
    }

    public /* synthetic */ MyFile(int i, String str, String str2, long j, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, str3, (i2 & 32) != 0 ? false : z);
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

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final boolean getDownloaded() {
        return this.downloaded;
    }

    public final void setDownloaded(boolean z) {
        this.downloaded = z;
    }
}

