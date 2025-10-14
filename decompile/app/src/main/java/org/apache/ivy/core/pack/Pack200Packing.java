package org.apache.ivy.core.pack;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.util.FileUtil;

/* loaded from: classes8.dex */
public class Pack200Packing extends StreamPacking {
    public static final String[] NAMES = {"pack200"};

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public String[] getNames() {
        return NAMES;
    }

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public String getUnpackedExtension(String str) {
        if (str.endsWith("pack.gz")) {
            String strSubstring = str.substring(0, str.length() - 7);
            return strSubstring.endsWith(".") ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
        }
        if (!str.endsWith("pack")) {
            return str;
        }
        String strSubstring2 = str.substring(0, str.length() - 4);
        return strSubstring2.endsWith(".") ? strSubstring2.substring(0, strSubstring2.length() - 1) : strSubstring2;
    }

    @Override // org.apache.ivy.core.pack.StreamPacking
    public InputStream unpack(InputStream inputStream) throws IOException {
        return FileUtil.unwrapPack200(inputStream);
    }
}
