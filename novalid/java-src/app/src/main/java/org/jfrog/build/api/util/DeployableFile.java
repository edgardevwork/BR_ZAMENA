package org.jfrog.build.api.util;

import java.io.File;
import org.jfrog.build.api.BaseBuildFileBean;
import org.jfrog.build.api.BuildFileBean;

/* loaded from: classes7.dex */
public class DeployableFile extends BaseBuildFileBean {
    public String artifactId;
    public BuildFileBean buildFile;
    public String classifier;
    public File file;
    public String groupId;
    public String version;

    public BuildFileBean getBuildFile() {
        return this.buildFile;
    }

    public void setBuildFile(BuildFileBean buildFileBean) {
        this.buildFile = buildFileBean;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public String getArtifactId() {
        return this.artifactId;
    }

    public void setArtifactId(String str) {
        this.artifactId = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public void setClassifier(String str) {
        this.classifier = str;
    }

    @Override // org.jfrog.build.api.BaseBuildFileBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeployableFile) || !super.equals(obj)) {
            return false;
        }
        DeployableFile deployableFile = (DeployableFile) obj;
        String str = this.artifactId;
        if (str == null ? deployableFile.artifactId != null : !str.equals(deployableFile.artifactId)) {
            return false;
        }
        BuildFileBean buildFileBean = this.buildFile;
        if (buildFileBean == null ? deployableFile.buildFile != null : !buildFileBean.equals(deployableFile.buildFile)) {
            return false;
        }
        String str2 = this.classifier;
        if (str2 == null ? deployableFile.classifier != null : !str2.equals(deployableFile.classifier)) {
            return false;
        }
        File file = this.file;
        if (file == null ? deployableFile.file != null : !file.equals(deployableFile.file)) {
            return false;
        }
        String str3 = this.groupId;
        if (str3 == null ? deployableFile.groupId != null : !str3.equals(deployableFile.groupId)) {
            return false;
        }
        String str4 = this.version;
        String str5 = deployableFile.version;
        return str4 == null ? str5 == null : str4.equals(str5);
    }

    @Override // org.jfrog.build.api.BaseBuildFileBean
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        BuildFileBean buildFileBean = this.buildFile;
        int iHashCode2 = (iHashCode + (buildFileBean != null ? buildFileBean.hashCode() : 0)) * 31;
        File file = this.file;
        int iHashCode3 = (iHashCode2 + (file != null ? file.hashCode() : 0)) * 31;
        String str = this.groupId;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.artifactId;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.version;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.classifier;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
