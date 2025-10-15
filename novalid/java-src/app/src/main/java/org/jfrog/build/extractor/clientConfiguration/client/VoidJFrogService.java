package org.jfrog.build.extractor.clientConfiguration.client;

import java.io.IOException;
import java.io.InputStream;
import org.jfrog.build.api.util.Log;

/* loaded from: classes5.dex */
public abstract class VoidJFrogService extends JFrogService<Void> {
    public VoidJFrogService(Log log) {
        super(log, JFrogServiceResponseType.EMPTY);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        throw new UnsupportedOperationException("The service '" + getClass().getSimpleName() + "' must override the setResponse method");
    }
}
