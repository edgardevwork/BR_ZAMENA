package org.apache.commons.compress.compressors.pack200;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public abstract class StreamBridge extends FilterOutputStream {
    public InputStream input;
    public final Object inputLock;

    public abstract InputStream getInputView() throws IOException;

    public StreamBridge(OutputStream outputStream) {
        super(outputStream);
        this.inputLock = new Object();
    }

    public StreamBridge() {
        this(null);
    }

    public InputStream getInput() throws IOException {
        synchronized (this.inputLock) {
            try {
                if (this.input == null) {
                    this.input = getInputView();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.input;
    }

    public void stop() throws IOException {
        close();
        synchronized (this.inputLock) {
            try {
                InputStream inputStream = this.input;
                if (inputStream != null) {
                    inputStream.close();
                    this.input = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
