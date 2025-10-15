package org.apache.ivy.core.module.p062id;

/* loaded from: classes7.dex */
public class ArtifactId {
    public String ext;
    public ModuleId mid;
    public String name;
    public String type;

    public ArtifactId(ModuleId moduleId, String str, String str2, String str3) {
        this.mid = moduleId;
        this.name = str;
        this.type = str2;
        this.ext = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ArtifactId)) {
            return false;
        }
        ArtifactId artifactId = (ArtifactId) obj;
        return getModuleId().equals(artifactId.getModuleId()) && getName().equals(artifactId.getName()) && getExt().equals(artifactId.getExt()) && getType().equals(artifactId.getType());
    }

    public int hashCode() {
        return (getModuleId().hashCode() * 37) + 17 + (getName().hashCode() * 37) + (getType().hashCode() * 37);
    }

    public String toString() {
        return getModuleId() + "!" + getShortDescription();
    }

    public String getShortDescription() {
        String str;
        StringBuilder sb = new StringBuilder();
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

    public ModuleId getModuleId() {
        return this.mid;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getExt() {
        return this.ext;
    }
}
