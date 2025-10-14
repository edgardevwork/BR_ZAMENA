package org.apache.ivy.core.pack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;

/* loaded from: classes7.dex */
public abstract class StreamPacking extends ArchivePacking {
    public abstract InputStream unpack(InputStream inputStream) throws IOException;

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public void unpack(InputStream inputStream, File file) throws IOException {
        FileUtil.copy(unpack(inputStream), file, (CopyProgressListener) null);
    }
}
