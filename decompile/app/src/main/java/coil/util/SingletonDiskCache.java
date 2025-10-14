package coil.util;

import android.content.Context;
import coil.disk.DiskCache;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p051io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lcoil/util/SingletonDiskCache;", "", "()V", "DIRECTORY", "", "instance", "Lcoil/disk/DiskCache;", "get", "context", "Landroid/content/Context;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes4.dex */
public final class SingletonDiskCache {

    @NotNull
    public static final String DIRECTORY = "image_cache";

    @NotNull
    public static final SingletonDiskCache INSTANCE = new SingletonDiskCache();

    @Nullable
    public static DiskCache instance;

    @NotNull
    public final synchronized DiskCache get(@NotNull Context context) {
        DiskCache diskCacheBuild;
        diskCacheBuild = instance;
        if (diskCacheBuild == null) {
            diskCacheBuild = new DiskCache.Builder().directory(FilesKt__UtilsKt.resolve(Utils.getSafeCacheDir(context), DIRECTORY)).build();
            instance = diskCacheBuild;
        }
        return diskCacheBuild;
    }
}
