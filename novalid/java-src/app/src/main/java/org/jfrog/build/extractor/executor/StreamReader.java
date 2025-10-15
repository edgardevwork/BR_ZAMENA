package org.jfrog.build.extractor.executor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes7.dex */
public class StreamReader implements Runnable {
    public InputStream inputStream;
    public String output;

    public StreamReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.output = IOUtils.toString(this.inputStream, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getOutput() {
        return this.output;
    }
}
