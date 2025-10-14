package org.jfrog.build.api;

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

    @Override // org.jfrog.build.api.BaseBuildFileBean
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

    @Override // org.jfrog.build.api.BaseBuildFileBean
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
