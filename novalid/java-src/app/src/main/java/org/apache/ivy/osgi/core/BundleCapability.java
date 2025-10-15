package org.apache.ivy.osgi.core;

import org.apache.ivy.osgi.util.Version;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class BundleCapability {
    public final String name;
    public final String type;
    public final Version version;

    public BundleCapability(String str, String str2, Version version) {
        this.type = str;
        this.name = str2;
        this.version = version;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Version getVersion() {
        return this.version;
    }

    public Version getRawVersion() {
        return this.version;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (this.version == null) {
            str = "";
        } else {
            str = PropertiesParser.PROPS_SEPARATOR + this.version;
        }
        sb.append(str);
        return sb.toString();
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Version version = this.version;
        return iHashCode + (version != null ? version.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BundleCapability)) {
            return false;
        }
        BundleCapability bundleCapability = (BundleCapability) obj;
        String str = this.name;
        if (str == null) {
            if (bundleCapability.name != null) {
                return false;
            }
        } else if (!str.equals(bundleCapability.name)) {
            return false;
        }
        Version version = this.version;
        Version version2 = bundleCapability.version;
        return version == null ? version2 == null : version.equals(version2);
    }
}
