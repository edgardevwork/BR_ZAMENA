package com.blackhub.bronline.launcher.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileInfoForDownloadItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/model/FileInfoForDownloadItem;", "", "name", "", "size", "", "(Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getSize", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FileInfoForDownloadItem {
    public static final int $stable = 0;

    @NotNull
    public final String name;
    public final float size;

    public static /* synthetic */ FileInfoForDownloadItem copy$default(FileInfoForDownloadItem fileInfoForDownloadItem, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileInfoForDownloadItem.name;
        }
        if ((i & 2) != 0) {
            f = fileInfoForDownloadItem.size;
        }
        return fileInfoForDownloadItem.copy(str, f);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    @NotNull
    public final FileInfoForDownloadItem copy(@NotNull String name, float size) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new FileInfoForDownloadItem(name, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfoForDownloadItem)) {
            return false;
        }
        FileInfoForDownloadItem fileInfoForDownloadItem = (FileInfoForDownloadItem) other;
        return Intrinsics.areEqual(this.name, fileInfoForDownloadItem.name) && Float.compare(this.size, fileInfoForDownloadItem.size) == 0;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Float.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "FileInfoForDownloadItem(name=" + this.name + ", size=" + this.size + ")";
    }

    public FileInfoForDownloadItem(@NotNull String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.size = f;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getSize() {
        return this.size;
    }
}
