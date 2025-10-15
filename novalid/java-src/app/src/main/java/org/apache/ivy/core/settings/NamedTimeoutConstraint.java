package org.apache.ivy.core.settings;

import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class NamedTimeoutConstraint implements TimeoutConstraint {
    public String name;
    public int connectionTimeout = -1;
    public int readTimeout = -1;

    public NamedTimeoutConstraint() {
    }

    public NamedTimeoutConstraint(String str) {
        StringUtils.assertNotNullNorEmpty(str, "Name of a timeout constraint cannot be null or empty string");
        this.name = str;
    }

    public void setName(String str) {
        StringUtils.assertNotNullNorEmpty(str, "Name of a timeout constraint cannot be null or empty string");
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.core.settings.TimeoutConstraint
    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    @Override // org.apache.ivy.core.settings.TimeoutConstraint
    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }
}
