package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes7.dex */
public class GZIPInputStreamFactory implements InputStreamFactory {
    public static final GZIPInputStreamFactory INSTANCE = new GZIPInputStreamFactory();

    public static GZIPInputStreamFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }
}
