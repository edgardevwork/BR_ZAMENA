package io.ktor.http;

import io.ktor.http.ContentType;
import io.ktor.util.NioPathKt;
import java.io.File;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.FilesKt__UtilsKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileContentTypeJvm.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005¨\u0006\u0006"}, m7105d2 = {"defaultForFile", "Lio/ktor/http/ContentType;", "Lio/ktor/http/ContentType$Companion;", PomReader.PomProfileElement.FILE, "Ljava/io/File;", "Ljava/nio/file/Path;", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class FileContentTypeJvmKt {
    @NotNull
    public static final ContentType defaultForFile(@NotNull ContentType.Companion companion, @NotNull File file) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(ContentType.INSTANCE, FilesKt__UtilsKt.getExtension(file)));
    }

    @NotNull
    public static final ContentType defaultForFile(@NotNull ContentType.Companion companion, @NotNull Path file) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(ContentType.INSTANCE, NioPathKt.getExtension(file)));
    }
}
