package com.blackhub.bronline.launcher.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileInfoForDownloadItem.kt */
@StabilityInferred(parameters = 1)
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

