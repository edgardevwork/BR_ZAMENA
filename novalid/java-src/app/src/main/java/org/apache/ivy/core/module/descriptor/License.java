package org.apache.ivy.core.module.descriptor;

/* loaded from: classes7.dex */
public class License {
    public String name;
    public String url;

    public License(String str, String str2) {
        this.name = str;
        this.url = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }
}
