package org.apache.ivy.osgi.repo;

import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.util.Version;

/* loaded from: classes5.dex */
public class BundleCapabilityAndLocation {
    public final BundleInfo bundleInfo;
    public final String name;
    public final String type;
    public final Version version;

    public BundleCapabilityAndLocation(String str, String str2, Version version, BundleInfo bundleInfo) {
        this.type = str;
        this.name = str2;
        this.version = version;
        this.bundleInfo = bundleInfo;
    }

    public BundleInfo getBundleInfo() {
        return this.bundleInfo;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public Version getVersion() {
        return this.version;
    }
}
