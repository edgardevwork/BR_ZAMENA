package org.apache.ivy.core.module.p062id;

import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.util.extendable.UnmodifiableExtendableItem;

/* loaded from: classes8.dex */
public class ArtifactRevisionId extends UnmodifiableExtendableItem {
    public ArtifactId artifactId;
    public ModuleRevisionId mrid;

    public static ArtifactRevisionId newInstance(ModuleRevisionId moduleRevisionId, String str, String str2, String str3) {
        return newInstance(moduleRevisionId, str, str2, str3, null);
    }

    public static ArtifactRevisionId newInstance(ModuleRevisionId moduleRevisionId, String str, String str2, String str3, Map<String, String> map) {
        return new ArtifactRevisionId(new ArtifactId(moduleRevisionId.getModuleId(), str, str2, str3), moduleRevisionId, map);
    }

    public ArtifactRevisionId(ArtifactId artifactId, ModuleRevisionId moduleRevisionId) {
        this(artifactId, moduleRevisionId, null);
    }

    public ArtifactRevisionId(ArtifactId artifactId, ModuleRevisionId moduleRevisionId, Map<String, String> map) {
        super(null, map);
        this.artifactId = artifactId;
        this.mrid = moduleRevisionId;
        setStandardAttribute(IvyPatternHelper.ORGANISATION_KEY, getModuleRevisionId().getOrganisation());
        setStandardAttribute("module", getModuleRevisionId().getName());
        setStandardAttribute(IvyPatternHelper.REVISION_KEY, getModuleRevisionId().getRevision());
        setStandardAttribute("artifact", getName());
        setStandardAttribute("type", getType());
        setStandardAttribute(IvyPatternHelper.EXT_KEY, getExt());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ArtifactRevisionId)) {
            return false;
        }
        ArtifactRevisionId artifactRevisionId = (ArtifactRevisionId) obj;
        return getArtifactId().equals(artifactRevisionId.getArtifactId()) && getModuleRevisionId().equals(artifactRevisionId.getModuleRevisionId()) && getQualifiedExtraAttributes().equals(artifactRevisionId.getQualifiedExtraAttributes());
    }

    public int hashCode() {
        return (getArtifactId().hashCode() * 37) + 17 + (getModuleRevisionId().hashCode() * 37) + (getQualifiedExtraAttributes().hashCode() * 37);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getModuleRevisionId());
        sb.append("!");
        sb.append(getName());
        sb.append(".");
        sb.append(getExt());
        if (getType().equals(getExt())) {
            str = "";
        } else {
            str = "(" + getType() + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    public ArtifactId getArtifactId() {
        return this.artifactId;
    }

    public ModuleRevisionId getModuleRevisionId() {
        return this.mrid;
    }

    public String getName() {
        return this.artifactId.getName();
    }

    public String getType() {
        return this.artifactId.getType();
    }

    public String getExt() {
        return this.artifactId.getExt();
    }

    public String getRevision() {
        return this.mrid.getRevision();
    }
}
