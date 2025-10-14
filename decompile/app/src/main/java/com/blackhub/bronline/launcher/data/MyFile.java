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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/data/MyFile;", "", "id", "", "name", "", "path", "size", "", "data", "downloaded", "", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getDownloaded", "()Z", "setDownloaded", "(Z)V", "getId", "()I", "setId", "(I)V", "getName", "getPath", "getSize", "()J", "setSize", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDownloaded() {
        return this.downloaded;
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
