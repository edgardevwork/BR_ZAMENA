package org.apache.ivy.core.cache;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.util.Checks;

/* loaded from: classes7.dex */
public class ArtifactOrigin {
    public static final int MAGIC_HASH_VALUE = 31;
    public static final String UNKNOWN = "UNKNOWN";
    public Artifact artifact;
    public boolean exists = true;
    public boolean isLocal;
    public Long lastChecked;
    public String location;

    @Deprecated
    public static final ArtifactOrigin unkwnown(Artifact artifact) {
        return unknown(artifact);
    }

    public static final ArtifactOrigin unknown(Artifact artifact) {
        return new ArtifactOrigin(artifact, false, UNKNOWN);
    }

    public static final boolean isUnknown(ArtifactOrigin artifactOrigin) {
        return artifactOrigin == null || UNKNOWN.equals(artifactOrigin.getLocation());
    }

    public static final boolean isUnknown(String str) {
        return str == null || UNKNOWN.equals(str);
    }

    public ArtifactOrigin(Artifact artifact, boolean z, String str) {
        Checks.checkNotNull(artifact, "artifact");
        Checks.checkNotNull(str, "location");
        this.artifact = artifact;
        this.isLocal = z;
        this.location = str;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public Artifact getArtifact() {
        return this.artifact;
    }

    public Long getLastChecked() {
        return this.lastChecked;
    }

    public void setLastChecked(Long l) {
        this.lastChecked = l;
    }

    public boolean isExists() {
        return this.exists;
    }

    public void setExist(boolean z) {
        this.exists = z;
    }

    public String toString() {
        return "ArtifactOrigin { isLocal=" + this.isLocal + ", location=" + this.location + ", lastChecked=" + this.lastChecked + ", exists=" + this.exists + WebvttCssParser.RULE_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtifactOrigin)) {
            return false;
        }
        ArtifactOrigin artifactOrigin = (ArtifactOrigin) obj;
        if (this.isLocal != artifactOrigin.isLocal || !this.location.equals(artifactOrigin.location)) {
            return false;
        }
        Long l = this.lastChecked;
        if (l == null) {
            if (artifactOrigin.lastChecked != null) {
                return false;
            }
        } else if (!l.equals(artifactOrigin.lastChecked)) {
            return false;
        }
        return this.exists == artifactOrigin.exists;
    }

    public int hashCode() {
        int iHashCode = (((this.isLocal ? 1 : 0) * 31) + this.location.hashCode()) * 31;
        Long l = this.lastChecked;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + (this.exists ? 1 : 0);
    }
}
