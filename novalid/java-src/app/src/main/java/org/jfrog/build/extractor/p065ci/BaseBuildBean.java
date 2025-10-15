package org.jfrog.build.extractor.p065ci;

import java.util.Properties;

/* loaded from: classes5.dex */
public abstract class BaseBuildBean implements BuildBean {
    public Properties properties;

    @Override // org.jfrog.build.extractor.p065ci.BuildBean
    public Properties getProperties() {
        return this.properties;
    }

    @Override // org.jfrog.build.extractor.p065ci.BuildBean
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
