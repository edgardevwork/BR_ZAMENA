package io.ktor.util;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: NioPath.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m7105d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "combineSafe", "Ljava/io/File;", "relativePath", "dropLeadingTopDirs", "normalizeAndRelativize", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNioPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1#2:57\n336#3,8:58\n*S KotlinDebug\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n*L\n38#1:58,8\n*E\n"})
/* loaded from: classes7.dex */
public final class NioPathKt {
    @NotNull
    public static final String getExtension(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return StringsKt__StringsKt.substringAfterLast$default(path.getFileName().toString(), ".", (String) null, 2, (Object) null);
    }

    @NotNull
    public static final File combineSafe(@NotNull Path path, @NotNull Path relativePath) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            NioPathKt$$ExternalSyntheticApiModelOutline10.m7084m();
            throw NioPathKt$$ExternalSyntheticApiModelOutline9.m7092m(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!(!pathNormalizeAndRelativize.isAbsolute())) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        File file = path.resolve(pathNormalizeAndRelativize).toFile();
        Intrinsics.checkNotNullExpressionValue(file, "resolve(normalized).toFile()");
        return file;
    }

    @NotNull
    public static final Path normalizeAndRelativize(@NotNull Path path) {
        Path pathRelativize;
        Path pathNormalize;
        Path pathDropLeadingTopDirs;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path root = path.getRoot();
        if (root != null && (pathRelativize = root.relativize(path)) != null && (pathNormalize = pathRelativize.normalize()) != null && (pathDropLeadingTopDirs = dropLeadingTopDirs(pathNormalize)) != null) {
            return pathDropLeadingTopDirs;
        }
        Path pathNormalize2 = path.normalize();
        Intrinsics.checkNotNullExpressionValue(pathNormalize2, "normalize()");
        return dropLeadingTopDirs(pathNormalize2);
    }

    @NotNull
    public static final File combineSafe(@NotNull File file, @NotNull Path relativePath) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            NioPathKt$$ExternalSyntheticApiModelOutline10.m7084m();
            throw NioPathKt$$ExternalSyntheticApiModelOutline9.m7092m(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!(!pathNormalizeAndRelativize.isAbsolute())) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        return new File(file, pathNormalizeAndRelativize.toString());
    }

    public static final Path dropLeadingTopDirs(Path path) {
        Iterator it = path.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(next).toString(), "..")) {
                break;
            }
            i++;
        }
        if (i == 0) {
            return path;
        }
        Path pathSubpath = path.subpath(i, path.getNameCount());
        Intrinsics.checkNotNullExpressionValue(pathSubpath, "subpath(startIndex, nameCount)");
        return pathSubpath;
    }
}
