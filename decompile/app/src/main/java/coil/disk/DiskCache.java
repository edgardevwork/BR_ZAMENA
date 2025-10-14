package coil.disk;

import android.os.StatFs;
import androidx.annotation.FloatRange;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiskCache.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\b\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH§\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH'R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m7105d2 = {"Lcoil/disk/DiskCache;", "", "directory", "Lokio/Path;", "getDirectory$annotations", "()V", "getDirectory", "()Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem$annotations", "getFileSystem", "()Lokio/FileSystem;", "maxSize", "", "getMaxSize$annotations", "getMaxSize", "()J", "size", "getSize$annotations", "getSize", "clear", "", "edit", "Lcoil/disk/DiskCache$Editor;", "key", "", "get", "Lcoil/disk/DiskCache$Snapshot;", "openEditor", "openSnapshot", "remove", "", "Builder", "Editor", "Snapshot", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface DiskCache {

    /* compiled from: DiskCache.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'J\n\u0010\r\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m7105d2 = {"Lcoil/disk/DiskCache$Editor;", "", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "abort", "", "commit", "commitAndGet", "Lcoil/disk/DiskCache$Snapshot;", "commitAndOpenSnapshot", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @ExperimentalCoilApi
    public interface Editor {
        void abort();

        void commit();

        @Deprecated(message = "Renamed to 'commitAndOpenSnapshot'.", replaceWith = @ReplaceWith(expression = "commitAndOpenSnapshot()", imports = {}))
        @Nullable
        Snapshot commitAndGet();

        @Nullable
        Snapshot commitAndOpenSnapshot();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    /* compiled from: DiskCache.kt */
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'J\n\u0010\r\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m7105d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "close", "", "closeAndEdit", "Lcoil/disk/DiskCache$Editor;", "closeAndOpenEditor", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @ExperimentalCoilApi
    public interface Snapshot extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @Deprecated(message = "Renamed to 'closeAndOpenEditor'.", replaceWith = @ReplaceWith(expression = "closeAndOpenEditor()", imports = {}))
        @Nullable
        Editor closeAndEdit();

        @Nullable
        Editor closeAndOpenEditor();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @ExperimentalCoilApi
    static /* synthetic */ void getDirectory$annotations() {
    }

    @ExperimentalCoilApi
    static /* synthetic */ void getFileSystem$annotations() {
    }

    @ExperimentalCoilApi
    static /* synthetic */ void getMaxSize$annotations() {
    }

    @ExperimentalCoilApi
    static /* synthetic */ void getSize$annotations() {
    }

    @ExperimentalCoilApi
    void clear();

    @Deprecated(message = "Renamed to 'openEditor'.", replaceWith = @ReplaceWith(expression = "openEditor(key)", imports = {}))
    @ExperimentalCoilApi
    @Nullable
    Editor edit(@NotNull String key);

    @Deprecated(message = "Renamed to 'openSnapshot'.", replaceWith = @ReplaceWith(expression = "openSnapshot(key)", imports = {}))
    @ExperimentalCoilApi
    @Nullable
    Snapshot get(@NotNull String key);

    @NotNull
    Path getDirectory();

    @NotNull
    FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    @ExperimentalCoilApi
    @Nullable
    Editor openEditor(@NotNull String key);

    @ExperimentalCoilApi
    @Nullable
    Snapshot openSnapshot(@NotNull String key);

    @ExperimentalCoilApi
    boolean remove(@NotNull String key);

    /* compiled from: DiskCache.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0012J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcoil/disk/DiskCache$Builder;", "", "()V", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "directory", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "maxSizeBytes", "", "maxSizePercent", "", "maximumMaxSizeBytes", "minimumMaxSizeBytes", "build", "Lcoil/disk/DiskCache;", "dispatcher", "Ljava/io/File;", "size", "percent", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    public static final class Builder {

        @Nullable
        public Path directory;
        public long maxSizeBytes;

        @NotNull
        public FileSystem fileSystem = FileSystem.SYSTEM;
        public double maxSizePercent = 0.02d;
        public long minimumMaxSizeBytes = 10485760;
        public long maximumMaxSizeBytes = 262144000;

        @NotNull
        public CoroutineDispatcher cleanupDispatcher = Dispatchers.getIO();

        @NotNull
        public final Builder directory(@NotNull File directory) {
            return directory(Path.Companion.get$default(Path.INSTANCE, directory, false, 1, (Object) null));
        }

        @NotNull
        public final Builder directory(@NotNull Path directory) {
            this.directory = directory;
            return this;
        }

        @NotNull
        public final Builder fileSystem(@NotNull FileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0d, m9to = 1.0d) double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
            }
            this.maxSizeBytes = 0L;
            this.maxSizePercent = percent;
            return this;
        }

        @NotNull
        public final Builder minimumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.minimumMaxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder maximumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.maximumMaxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder maxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.maxSizePercent = 0.0d;
            this.maxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder cleanupDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.cleanupDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final DiskCache build() {
            long jCoerceIn;
            Path path = this.directory;
            if (path == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    File file = path.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jCoerceIn = RangesKt___RangesKt.coerceIn((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jCoerceIn = this.minimumMaxSizeBytes;
                }
            } else {
                jCoerceIn = this.maxSizeBytes;
            }
            return new RealDiskCache(jCoerceIn, path, this.fileSystem, this.cleanupDispatcher);
        }
    }
}
