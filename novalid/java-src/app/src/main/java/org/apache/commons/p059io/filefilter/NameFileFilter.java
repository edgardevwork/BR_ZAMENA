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
public class NameFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = 176844364689077340L;
    public final IOCase caseSensitivity;
    public final String[] names;

    public NameFileFilter(List<String> list) {
        this(list, (IOCase) null);
    }

    public NameFileFilter(List<String> list, IOCase iOCase) {
        if (list == null) {
            throw new IllegalArgumentException("The list of names must not be null");
        }
        this.names = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.caseSensitivity = toIOCase(iOCase);
    }

    public NameFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public NameFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public NameFileFilter(String str, IOCase iOCase) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.names = new String[]{str};
        this.caseSensitivity = toIOCase(iOCase);
    }

    public NameFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr == null) {
            throw new IllegalArgumentException("The array of names must not be null");
        }
        String[] strArr2 = new String[strArr.length];
        this.names = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.caseSensitivity = toIOCase(iOCase);
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return acceptBaseName(file.getName());
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return acceptBaseName(str);
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(acceptBaseName(Objects.toString(path.getFileName(), null)), path);
    }

    public final boolean acceptBaseName(String str) {
        for (String str2 : this.names) {
            if (this.caseSensitivity.checkEquals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final IOCase toIOCase(IOCase iOCase) {
        return iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.names != null) {
            for (int i = 0; i < this.names.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.names[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
