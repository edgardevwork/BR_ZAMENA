package org.apache.ivy.core.pack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class ArchivePacking {
    public abstract String[] getNames();

    public abstract String getUnpackedExtension(String str);

    public abstract void unpack(InputStream inputStream, File file) throws IOException;
}
