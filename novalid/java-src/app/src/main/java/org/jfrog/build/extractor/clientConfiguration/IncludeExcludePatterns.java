package org.jfrog.build.extractor.clientConfiguration;

import java.io.Serializable;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class IncludeExcludePatterns implements Serializable {
    public static final IncludeExcludePatterns EMPTY;
    public static final String[] EMPTY_PATTERN;
    public String[] excludePatterns;
    public String[] includePatterns;

    static {
        String[] strArr = new String[0];
        EMPTY_PATTERN = strArr;
        EMPTY = new IncludeExcludePatterns(strArr, strArr);
    }

    public IncludeExcludePatterns() {
        this((String[]) null, (String[]) null);
    }

    public IncludeExcludePatterns(String str, String str2) {
        this.includePatterns = splitPatterns(str);
        this.excludePatterns = splitPatterns(str2);
    }

    public IncludeExcludePatterns(String[] strArr, String[] strArr2) {
        this.includePatterns = strArr == null ? EMPTY_PATTERN : strArr;
        this.excludePatterns = strArr2 == null ? EMPTY_PATTERN : strArr2;
    }

    public final String[] splitPatterns(String str) {
        if (StringUtils.isNotBlank(str)) {
            return StringUtils.split(str, ", ");
        }
        return EMPTY_PATTERN;
    }

    public void addIncludePatterns(String str) {
        this.includePatterns = (String[]) ArrayUtils.addAll(this.includePatterns, splitPatterns(str));
    }

    public void addExcludePatterns(String str) {
        this.excludePatterns = (String[]) ArrayUtils.addAll(this.excludePatterns, splitPatterns(str));
    }

    public String[] getIncludePatterns() {
        return (String[]) ArrayUtils.clone(this.includePatterns);
    }

    public String[] getExcludePatterns() {
        return (String[]) ArrayUtils.clone(this.excludePatterns);
    }
}
