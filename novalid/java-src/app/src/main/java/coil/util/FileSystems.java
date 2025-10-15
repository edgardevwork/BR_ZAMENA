package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.FileSystem;
import okio.Path;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileSystems.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, m7105d2 = {"createFile", "", "Lokio/FileSystem;", PomReader.PomProfileElement.FILE, "Lokio/Path;", "deleteContents", "directory", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "-FileSystems")
/* renamed from: coil.util.-FileSystems, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystems {
    public static final void createFile(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        if (fileSystem.exists(path)) {
            return;
        }
        Utils.closeQuietly(fileSystem.sink(path));
    }

    public static final void deleteContents(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        deleteContents(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
