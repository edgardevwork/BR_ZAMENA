package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.p059io.IOCase;

/* loaded from: classes5.dex */
public class SuffixFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = -3389157631240246157L;
    public final IOCase caseSensitivity;
    public final String[] suffixes;

    public SuffixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(List<String> list, IOCase iOCase) {
        if (list == null) {
            throw new IllegalArgumentException("The list of suffixes must not be null");
        }
        this.suffixes = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    public SuffixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String str, IOCase iOCase) {
        if (str == null) {
            throw new IllegalArgumentException("The suffix must not be null");
        }
        this.suffixes = new String[]{str};
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    public SuffixFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr == null) {
            throw new IllegalArgumentException("The array of suffixes must not be null");
        }
        String[] strArr2 = new String[strArr.length];
        this.suffixes = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getName());
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(accept(Objects.toString(path.getFileName(), null)), path);
    }

    private boolean accept(String str) {
        for (String str2 : this.suffixes) {
            if (this.caseSensitivity.checkEndsWith(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.suffixes != null) {
            for (int i = 0; i < this.suffixes.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.suffixes[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
