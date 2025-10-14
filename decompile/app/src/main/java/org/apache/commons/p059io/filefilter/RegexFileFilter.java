package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.p059io.IOCase;

/* loaded from: classes5.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = 4269646126155225062L;
    public final Function<Path, String> pathToString;
    public final Pattern pattern;

    public static Pattern compile(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        return Pattern.compile(str, i);
    }

    public static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 2 : 0;
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, (Function<Path, String>) new Function() { // from class: org.apache.commons.io.filefilter.RegexFileFilter$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RegexFileFilter.lambda$new$0((Path) obj);
            }
        });
    }

    public static /* synthetic */ String lambda$new$0(Path path) {
        return path.getFileName().toString();
    }

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = pattern;
        this.pathToString = function;
    }

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i) {
        this(compile(str, i));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(this.pattern.matcher(this.pathToString.apply(path)).matches(), path);
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }
}
