package kotlin.p051io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileVisitorBuilder.kt */
@SinceKotlin(version = "1.7")
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u000328\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H&J@\u0010\r\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0005H&J@\u0010\u0010\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0005H&J@\u0010\u0012\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H&\u0082\u0001\u0001\u0013¨\u0006\u0014"}, m7105d2 = {"Lkotlin/io/path/FileVisitorBuilder;", "", "onPostVisitDirectory", "", "function", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/ParameterName;", "name", "directory", "Ljava/io/IOException;", "exception", "Ljava/nio/file/FileVisitResult;", "onPreVisitDirectory", "Ljava/nio/file/attribute/BasicFileAttributes;", "attributes", "onVisitFile", PomReader.PomProfileElement.FILE, "onVisitFileFailed", "Lkotlin/io/path/FileVisitorBuilderImpl;", "kotlin-stdlib-jdk7"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@ExperimentalPathApi
/* loaded from: classes8.dex */
public interface FileVisitorBuilder {
    void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function);

    void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function);

    void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function);

    void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function);
}
