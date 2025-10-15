package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.File;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageSource.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7105d2 = {"Lcoil/decode/SourceImageSource;", "Lcoil/decode/ImageSource;", "source", "Lokio/BufferedSource;", "cacheDirectoryFactory", "Lkotlin/Function0;", "Ljava/io/File;", "metadata", "Lcoil/decode/ImageSource$Metadata;", "(Lokio/BufferedSource;Lkotlin/jvm/functions/Function0;Lcoil/decode/ImageSource$Metadata;)V", PomReader.PomProfileElement.FILE, "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "isClosed", "", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "assertNotClosed", "", "close", "createTempFile", "fileOrNull", "sourceOrNull", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n80#3:312\n165#3:313\n81#3:314\n82#3:320\n52#4,5:315\n60#4,10:321\n57#4,16:331\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:320\n276#1:315,5\n276#1:321,10\n276#1:331,16\n*E\n"})
/* loaded from: classes3.dex */
public final class SourceImageSource extends ImageSource {

    @Nullable
    public Function0<? extends File> cacheDirectoryFactory;

    @Nullable
    public Path file;
    public boolean isClosed;

    @Nullable
    public final ImageSource.Metadata metadata;

    @Nullable
    public BufferedSource source;

    @Override // coil.decode.ImageSource
    @Nullable
    public ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    public SourceImageSource(@NotNull BufferedSource bufferedSource, @NotNull Function0<? extends File> function0, @Nullable ImageSource.Metadata metadata) {
        super(null);
        this.metadata = metadata;
        this.source = bufferedSource;
        this.cacheDirectoryFactory = function0;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public FileSystem getFileSystem() {
        return FileSystem.SYSTEM;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized BufferedSource source() {
        assertNotClosed();
        BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystem = getFileSystem();
        Path path = this.file;
        Intrinsics.checkNotNull(path);
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(path));
        this.source = bufferedSourceBuffer;
        return bufferedSourceBuffer;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public BufferedSource sourceOrNull() {
        return source();
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized Path file() {
        Throwable th;
        Long lValueOf;
        try {
            assertNotClosed();
            Path path = this.file;
            if (path != null) {
                return path;
            }
            Path pathCreateTempFile = createTempFile();
            BufferedSink bufferedSinkBuffer = Okio.buffer(getFileSystem().sink(pathCreateTempFile, false));
            try {
                BufferedSource bufferedSource = this.source;
                Intrinsics.checkNotNull(bufferedSource);
                lValueOf = Long.valueOf(bufferedSinkBuffer.writeAll(bufferedSource));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                lValueOf = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(lValueOf);
            this.source = null;
            this.file = pathCreateTempFile;
            this.cacheDirectoryFactory = null;
            return pathCreateTempFile;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // coil.decode.ImageSource
    @Nullable
    public synchronized Path fileOrNull() {
        assertNotClosed();
        return this.file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.isClosed = true;
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                Utils.closeQuietly(bufferedSource);
            }
            Path path = this.file;
            if (path != null) {
                getFileSystem().delete(path);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Path createTempFile() {
        Function0<? extends File> function0 = this.cacheDirectoryFactory;
        Intrinsics.checkNotNull(function0);
        File fileInvoke = function0.invoke();
        if (!fileInvoke.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.".toString());
        }
        return Path.Companion.get$default(Path.INSTANCE, File.createTempFile("tmp", null, fileInvoke), false, 1, (Object) null);
    }

    private final void assertNotClosed() {
        if (!(!this.isClosed)) {
            throw new IllegalStateException("closed".toString());
        }
    }
}
