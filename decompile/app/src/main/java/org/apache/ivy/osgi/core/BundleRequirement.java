package org.apache.ivy.osgi.core;

import org.apache.ivy.osgi.util.VersionRange;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class BundleRequirement {
    public final String name;
    public final String resolution;
    public final String type;
    public final VersionRange version;

    public BundleRequirement(String str, String str2, VersionRange versionRange, String str3) {
        this.type = str;
        this.name = str2;
        this.version = versionRange;
        this.resolution = str3;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public VersionRange getVersion() {
        return this.version;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        String str2 = "";
        if (this.version == null) {
            str = "";
        } else {
            str = PropertiesParser.PROPS_SEPARATOR + this.version;
        }
        sb.append(str);
        if (this.resolution != null) {
            str2 = " (" + this.resolution + ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resolution;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VersionRange versionRange = this.version;
        return iHashCode3 + (versionRange != null ? versionRange.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BundleRequirement)) {
            return false;
        }
        BundleRequirement bundleRequirement = (BundleRequirement) obj;
        String str = this.type;
        if (str == null) {
            if (bundleRequirement.type != null) {
                return false;
            }
        } else if (!str.equals(bundleRequirement.type)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null) {
            if (bundleRequirement.name != null) {
                return false;
            }
        } else if (!str2.equals(bundleRequirement.name)) {
            return false;
        }
        String str3 = this.resolution;
        if (str3 == null) {
            if (bundleRequirement.resolution != null) {
                return false;
            }
        } else if (!str3.equals(bundleRequirement.resolution)) {
            return false;
        }
        VersionRange versionRange = this.version;
        VersionRange versionRange2 = bundleRequirement.version;
        return versionRange == null ? versionRange2 == null : versionRange.equals(versionRange2);
    }
}
