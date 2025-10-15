package org.apache.ivy.util;

import java.io.File;

/* loaded from: classes8.dex */
public interface FileResolver {
    public static final FileResolver DEFAULT = new FileResolver() { // from class: org.apache.ivy.util.FileResolver.1
        @Override // org.apache.ivy.util.FileResolver
        public File resolveFile(String str, String str2) {
            return new File(str);
        }
    };

    File resolveFile(String str, String str2);
}
