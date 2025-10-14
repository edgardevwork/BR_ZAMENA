package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* loaded from: classes6.dex */
public class TempFileCachingStreamBridge extends StreamBridge {

    /* renamed from: f */
    public final File f9858f;

    public TempFileCachingStreamBridge() throws IOException {
        File fileCreateTempFile = File.createTempFile("commons-compress", "packtemp");
        this.f9858f = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        ((FilterOutputStream) this).out = Files.newOutputStream(fileCreateTempFile.toPath(), new OpenOption[0]);
    }

    @Override // org.apache.commons.compress.compressors.pack200.StreamBridge
    public InputStream getInputView() throws IOException {
        ((FilterOutputStream) this).out.close();
        return new FilterInputStream(Files.newInputStream(this.f9858f.toPath(), new OpenOption[0])) { // from class: org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge.1
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    super.close();
                } finally {
                    TempFileCachingStreamBridge.this.f9858f.delete();
                }
            }
        };
    }
}
