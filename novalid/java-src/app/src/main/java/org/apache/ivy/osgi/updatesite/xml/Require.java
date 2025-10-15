package org.apache.ivy.osgi.updatesite.xml;

import org.apache.ivy.osgi.util.Version;

/* loaded from: classes5.dex */
public class Require {
    public String feature;
    public String filter;
    public String match;
    public String plugin;
    public Version version;

    public void setFeature(String str) {
        this.feature = str;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setPlugin(String str) {
        this.plugin = str;
    }

    public String getPlugin() {
        return this.plugin;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Version getVersion() {
        return this.version;
    }

    public void setMatch(String str) {
        this.match = str;
    }

    public String getMatch() {
        return this.match;
    }

    public void setFilter(String str) {
        this.filter = str;
    }

    public String getFilter() {
        return this.filter;
    }
}
