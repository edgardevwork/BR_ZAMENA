package org.jfrog.build.api;

import java.util.Properties;

/* loaded from: classes5.dex */
public abstract class BaseBuildBean implements BuildBean {
    public Properties properties;

    @Override // org.jfrog.build.api.BuildBean
    public Properties getProperties() {
        return this.properties;
    }

    @Override // org.jfrog.build.api.BuildBean
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
