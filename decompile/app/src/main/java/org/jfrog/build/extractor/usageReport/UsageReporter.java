package org.jfrog.build.extractor.usageReport;

import java.io.IOException;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ProxyConfiguration;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;

/* loaded from: classes5.dex */
public class UsageReporter {
    public FeatureId[] features;
    public String productId;

    public UsageReporter(String str, String[] strArr) {
        this.productId = str;
        setFeatures(strArr);
    }

    public void reportUsage(String str, String str2, String str3, String str4, ProxyConfiguration proxyConfiguration, Log log) throws IOException {
        ArtifactoryManager artifactoryManager = new ArtifactoryManager(str, str2, str3, str4, log);
        if (proxyConfiguration != null) {
            try {
                artifactoryManager.setProxyConfiguration(proxyConfiguration);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        artifactoryManager.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        artifactoryManager.reportUsage(this);
        artifactoryManager.close();
    }

    public String getProductId() {
        return this.productId;
    }

    public FeatureId[] getFeatures() {
        return this.features;
    }

    public final void setFeatures(String[] strArr) {
        this.features = new FeatureId[strArr.length];
        int i = 0;
        for (String str : strArr) {
            this.features[i] = new FeatureId(str);
            i++;
        }
    }

    public static class FeatureId {
        public final String featureId;

        public FeatureId(String str) {
            this.featureId = str;
        }

        public String getFeatureId() {
            return this.featureId;
        }
    }
}
