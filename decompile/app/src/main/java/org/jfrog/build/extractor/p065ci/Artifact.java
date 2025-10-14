package org.jfrog.build.extractor.p065ci;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.StringUtils;

@XStreamAlias("artifact")
/* loaded from: classes7.dex */
public class Artifact extends BaseBuildFileBean {
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // org.jfrog.build.extractor.p065ci.BaseBuildFileBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Artifact artifact = (Artifact) obj;
        return StringUtils.equals(this.name, artifact.name) && StringUtils.equals(this.remotePath, artifact.remotePath);
    }

    @Override // org.jfrog.build.extractor.p065ci.BaseBuildFileBean
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public org.jfrog.build.api.Artifact ToBuildArtifact() {
        org.jfrog.build.api.Artifact artifact = new org.jfrog.build.api.Artifact();
        artifact.setName(this.name);
        artifact.setType(this.type);
        artifact.setMd5(this.md5);
        artifact.setSha256(this.sha256);
        artifact.setSha1(this.sha1);
        artifact.setRemotePath(this.remotePath);
        artifact.setProperties(getProperties());
        return artifact;
    }

    public static Artifact ToBuildInfoArtifact(org.jfrog.build.api.Artifact artifact) {
        Artifact artifact2 = new Artifact();
        artifact2.setName(artifact.getName());
        artifact2.setType(artifact.getType());
        artifact2.setMd5(artifact.getMd5());
        artifact2.setSha256(artifact.getSha256());
        artifact2.setSha1(artifact.getSha1());
        artifact2.setRemotePath(artifact.getRemotePath());
        artifact2.setProperties(artifact.getProperties());
        return artifact2;
    }
}
