package org.apache.ivy.osgi.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.ivy.osgi.util.Version;

/* loaded from: classes5.dex */
public class BundleInfo {
    public static final String BUNDLE_TYPE = "bundle";
    public static final Version DEFAULT_VERSION = new Version(1, 0, 0, null);
    public static final String EXECUTION_ENVIRONMENT_TYPE = "ee";
    public static final String PACKAGE_TYPE = "package";
    public static final String SERVICE_TYPE = "service";
    public List<String> classpath;
    public String description;
    public String documentation;
    public boolean hasInnerClasspath;

    /* renamed from: id */
    public String f9971id;
    public String license;
    public String presentationName;
    public Integer size;
    public String symbolicName;
    public String symbolicNameTarget;
    public Version version;
    public Version versionTarget;
    public Set<BundleRequirement> requirements = new LinkedHashSet();
    public Set<BundleCapability> capabilities = new LinkedHashSet();
    public List<String> executionEnvironments = new ArrayList();
    public boolean isSource = false;
    public List<BundleArtifact> artifacts = new ArrayList();

    public BundleInfo(String str, Version version) {
        this.symbolicName = str;
        this.version = version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BundleInfo [executionEnvironments=");
        sb.append(this.executionEnvironments);
        sb.append(", capabilities=");
        sb.append(this.capabilities);
        sb.append(", requirements=");
        sb.append(this.requirements);
        sb.append(", symbolicName=");
        sb.append(this.symbolicName);
        sb.append(", version=");
        sb.append(this.version);
        sb.append("]");
        if (this.symbolicNameTarget != null) {
            sb.append(" source of ");
            sb.append(this.symbolicNameTarget);
            sb.append("@");
            sb.append(this.versionTarget);
        }
        return sb.toString();
    }

    public String getSymbolicName() {
        return this.symbolicName;
    }

    public Version getVersion() {
        Version version = this.version;
        return version == null ? DEFAULT_VERSION : version;
    }

    public Version getRawVersion() {
        return this.version;
    }

    public void setId(String str) {
        this.f9971id = str;
    }

    public String getId() {
        return this.f9971id;
    }

    public void setPresentationName(String str) {
        this.presentationName = str;
    }

    public String getPresentationName() {
        return this.presentationName;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDocumentation(String str) {
        this.documentation = str;
    }

    public String getDocumentation() {
        return this.documentation;
    }

    public void setLicense(String str) {
        this.license = str;
    }

    public String getLicense() {
        return this.license;
    }

    public void setSize(Integer num) {
        this.size = num;
    }

    public Integer getSize() {
        return this.size;
    }

    public void addRequirement(BundleRequirement bundleRequirement) {
        this.requirements.add(bundleRequirement);
    }

    public Set<BundleRequirement> getRequirements() {
        return this.requirements;
    }

    public void addCapability(BundleCapability bundleCapability) {
        this.capabilities.add(bundleCapability);
    }

    public Set<BundleCapability> getCapabilities() {
        return this.capabilities;
    }

    public List<String> getExecutionEnvironments() {
        return this.executionEnvironments;
    }

    public void setExecutionEnvironments(List<String> list) {
        this.executionEnvironments = list;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addRequirement(new BundleRequirement("ee", it.next(), null, null));
        }
    }

    public void addExecutionEnvironment(String str) {
        this.executionEnvironments.add(str);
    }

    public void setSource(boolean z) {
        this.isSource = z;
    }

    public boolean isSource() {
        return this.isSource;
    }

    public void setSymbolicNameTarget(String str) {
        this.symbolicNameTarget = str;
    }

    public String getSymbolicNameTarget() {
        return this.symbolicNameTarget;
    }

    public void setVersionTarget(Version version) {
        this.versionTarget = version;
    }

    public Version getVersionTarget() {
        return this.versionTarget;
    }

    public void setHasInnerClasspath(boolean z) {
        this.hasInnerClasspath = z;
    }

    public boolean hasInnerClasspath() {
        return this.hasInnerClasspath;
    }

    public void setClasspath(List<String> list) {
        this.classpath = list;
    }

    public List<String> getClasspath() {
        return this.classpath;
    }

    public void addArtifact(BundleArtifact bundleArtifact) {
        this.artifacts.add(bundleArtifact);
    }

    public void removeArtifact(BundleArtifact bundleArtifact) {
        this.artifacts.remove(bundleArtifact);
    }

    public List<BundleArtifact> getArtifacts() {
        return this.artifacts;
    }

    public int hashCode() {
        Set<BundleCapability> set = this.capabilities;
        int iHashCode = ((set == null ? 0 : set.hashCode()) + 31) * 31;
        Set<BundleRequirement> set2 = this.requirements;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        String str = this.symbolicName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Version version = this.version;
        int iHashCode4 = (iHashCode3 + (version == null ? 0 : version.hashCode())) * 31;
        List<String> list = this.executionEnvironments;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.symbolicNameTarget;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Version version2 = this.versionTarget;
        return iHashCode6 + (version2 != null ? version2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BundleInfo)) {
            return false;
        }
        BundleInfo bundleInfo = (BundleInfo) obj;
        Set<BundleCapability> set = this.capabilities;
        if (set == null) {
            if (bundleInfo.capabilities != null) {
                return false;
            }
        } else if (!set.equals(bundleInfo.capabilities)) {
            return false;
        }
        Set<BundleRequirement> set2 = this.requirements;
        if (set2 == null) {
            if (bundleInfo.requirements != null) {
                return false;
            }
        } else if (!set2.equals(bundleInfo.requirements)) {
            return false;
        }
        String str = this.symbolicName;
        if (str == null) {
            if (bundleInfo.symbolicName != null) {
                return false;
            }
        } else if (!str.equals(bundleInfo.symbolicName)) {
            return false;
        }
        Version version = this.version;
        if (version == null) {
            if (bundleInfo.version != null) {
                return false;
            }
        } else if (!version.equals(bundleInfo.version)) {
            return false;
        }
        List<String> list = this.executionEnvironments;
        if (list == null) {
            if (bundleInfo.executionEnvironments != null) {
                return false;
            }
        } else if (!list.equals(bundleInfo.executionEnvironments)) {
            return false;
        }
        if (this.isSource != bundleInfo.isSource) {
            return false;
        }
        String str2 = this.symbolicNameTarget;
        if (str2 == null) {
            if (bundleInfo.symbolicNameTarget != null) {
                return false;
            }
        } else if (!str2.equals(bundleInfo.symbolicNameTarget)) {
            return false;
        }
        Version version2 = this.versionTarget;
        if (version2 == null) {
            if (bundleInfo.versionTarget != null) {
                return false;
            }
        } else if (!version2.equals(bundleInfo.versionTarget)) {
            return false;
        }
        if (this.hasInnerClasspath == bundleInfo.hasInnerClasspath) {
            List<String> list2 = this.classpath;
            List<String> list3 = bundleInfo.classpath;
            if (list2 == null) {
                if (list3 == null) {
                    return true;
                }
            } else if (list2.equals(list3)) {
                return true;
            }
        }
        return false;
    }

    public Set<BundleRequirement> getRequires() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (BundleRequirement bundleRequirement : this.requirements) {
            if (bundleRequirement.getType().equals(BUNDLE_TYPE)) {
                linkedHashSet.add(bundleRequirement);
            }
        }
        return linkedHashSet;
    }

    public Set<BundleRequirement> getImports() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (BundleRequirement bundleRequirement : this.requirements) {
            if (bundleRequirement.getType().equals(PACKAGE_TYPE)) {
                linkedHashSet.add(bundleRequirement);
            }
        }
        return linkedHashSet;
    }

    public Set<ExportPackage> getExports() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (BundleCapability bundleCapability : this.capabilities) {
            if (PACKAGE_TYPE.equals(bundleCapability.getType())) {
                linkedHashSet.add((ExportPackage) bundleCapability);
            }
        }
        return linkedHashSet;
    }

    public Set<BundleCapability> getServices() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (BundleCapability bundleCapability : this.capabilities) {
            if ("service".equals(bundleCapability.getType())) {
                linkedHashSet.add(bundleCapability);
            }
        }
        return linkedHashSet;
    }
}
