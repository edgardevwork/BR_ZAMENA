package org.apache.ivy.osgi.core;

import java.util.HashSet;
import java.util.Set;
import org.apache.ivy.osgi.util.Version;

/* loaded from: classes7.dex */
public class ExportPackage extends BundleCapability {
    public final Set<String> uses;

    public ExportPackage(String str, Version version) {
        super(BundleInfo.PACKAGE_TYPE, str, version);
        this.uses = new HashSet();
    }

    public void addUse(String str) {
        this.uses.add(str);
    }

    @Override // org.apache.ivy.osgi.core.BundleCapability
    public Version getVersion() {
        return super.getVersion() == null ? BundleInfo.DEFAULT_VERSION : super.getVersion();
    }

    public Set<String> getUses() {
        return this.uses;
    }

    @Override // org.apache.ivy.osgi.core.BundleCapability
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Set<String> set = this.uses;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    @Override // org.apache.ivy.osgi.core.BundleCapability
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Set<String> set = this.uses;
        Set<String> set2 = ((ExportPackage) obj).uses;
        return set == null ? set2 == null : set.equals(set2);
    }
}
