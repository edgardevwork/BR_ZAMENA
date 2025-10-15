package org.apache.ivy.core.module.status;

/* loaded from: classes7.dex */
public class Status {
    public boolean integration;
    public String name;

    public Status() {
    }

    public Status(String str, boolean z) {
        this.name = str;
        this.integration = z;
    }

    public boolean isIntegration() {
        return this.integration;
    }

    public void setIntegration(boolean z) {
        this.integration = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
