package org.apache.ivy.core.module.descriptor;

import java.util.Map;

/* loaded from: classes8.dex */
public abstract class AbstractArtifact implements Artifact {
    public boolean equals(Object obj) {
        if (!(obj instanceof Artifact)) {
            return false;
        }
        Artifact artifact = (Artifact) obj;
        if (getModuleRevisionId().equals(artifact.getModuleRevisionId()) && getPublicationDate() == null) {
            if (artifact.getPublicationDate() != null) {
                return false;
            }
        } else if (!getPublicationDate().equals(artifact.getPublicationDate()) || !getName().equals(artifact.getName()) || !getExt().equals(artifact.getExt()) || !getType().equals(artifact.getType()) || !getQualifiedExtraAttributes().equals(artifact.getQualifiedExtraAttributes())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 561 + getModuleRevisionId().hashCode();
        if (getPublicationDate() != null) {
            iHashCode = (iHashCode * 17) + getPublicationDate().hashCode();
        }
        return (((((((iHashCode * 17) + getName().hashCode()) * 17) + getExt().hashCode()) * 17) + getType().hashCode()) * 17) + getQualifiedExtraAttributes().hashCode();
    }

    public String toString() {
        return String.valueOf(getId());
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getAttribute(String str) {
        return getId().getAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getAttributes() {
        return getId().getAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getExtraAttribute(String str) {
        return getId().getExtraAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getExtraAttributes() {
        return getId().getExtraAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getQualifiedExtraAttributes() {
        return getId().getQualifiedExtraAttributes();
    }
}
