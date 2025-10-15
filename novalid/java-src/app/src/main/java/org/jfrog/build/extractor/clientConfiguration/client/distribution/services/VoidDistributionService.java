package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.p059io.IOUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public abstract class VoidDistributionService extends VoidJFrogService {
    public VoidDistributionService(Log log) {
        super(log);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService, org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        String str = getStatusCode() + IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
        this.log.debug("Distribution response:  " + str);
    }
}
