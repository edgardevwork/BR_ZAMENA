package org.apache.ivy.core.report;

import java.io.File;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public class ArtifactDownloadReport {
    public static final String MISSING_ARTIFACT = "missing artifact";
    public Artifact artifact;
    public String downloadDetails = "";
    public DownloadStatus downloadStatus;
    public long downloadTimeMillis;
    public File localFile;
    public ArtifactOrigin origin;
    public long size;
    public Artifact unpackedArtifact;
    public File unpackedLocalFile;

    public ArtifactDownloadReport(Artifact artifact) {
        this.artifact = artifact;
    }

    public DownloadStatus getDownloadStatus() {
        return this.downloadStatus;
    }

    public void setDownloadStatus(DownloadStatus downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    public String getName() {
        return this.artifact.getName();
    }

    public String getType() {
        return this.artifact.getType();
    }

    public Artifact getArtifact() {
        return this.artifact;
    }

    public String getExt() {
        return this.artifact.getExt();
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setArtifactOrigin(ArtifactOrigin artifactOrigin) {
        this.origin = artifactOrigin;
    }

    public ArtifactOrigin getArtifactOrigin() {
        return this.origin;
    }

    public void setDownloadDetails(String str) {
        this.downloadDetails = str;
    }

    public String getDownloadDetails() {
        return this.downloadDetails;
    }

    public void setDownloadTimeMillis(long j) {
        this.downloadTimeMillis = j;
    }

    public long getDownloadTimeMillis() {
        return this.downloadTimeMillis;
    }

    public String toString() {
        DownloadStatus downloadStatus = this.downloadStatus;
        if (downloadStatus == DownloadStatus.SUCCESSFUL) {
            return "[SUCCESSFUL ] " + this.artifact + " (" + this.downloadTimeMillis + "ms)";
        }
        if (downloadStatus == DownloadStatus.FAILED) {
            if (MISSING_ARTIFACT.equals(this.downloadDetails)) {
                return "[NOT FOUND  ] " + this.artifact + " (" + this.downloadTimeMillis + "ms)";
            }
            return "[FAILED     ] " + this.artifact + ": " + this.downloadDetails + " (" + this.downloadTimeMillis + "ms)";
        }
        if (downloadStatus == DownloadStatus.f9964NO) {
            return "[NOT REQUIRED] " + this.artifact;
        }
        return super.toString();
    }

    public File getLocalFile() {
        return this.localFile;
    }

    public void setLocalFile(File file) {
        this.localFile = file;
    }

    public boolean isDownloaded() {
        return DownloadStatus.SUCCESSFUL == this.downloadStatus;
    }

    public void setUnpackedLocalFile(File file) {
        this.unpackedLocalFile = file;
    }

    public File getUnpackedLocalFile() {
        return this.unpackedLocalFile;
    }

    public void setUnpackedArtifact(Artifact artifact) {
        this.unpackedArtifact = artifact;
    }

    public Artifact getUnpackedArtifact() {
        return this.unpackedArtifact;
    }

    public int hashCode() {
        Artifact artifact = this.artifact;
        return 31 + (artifact == null ? 0 : artifact.hashCode());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ArtifactDownloadReport)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Artifact artifact = this.artifact;
        Artifact artifact2 = ((ArtifactDownloadReport) obj).artifact;
        return artifact == null ? artifact2 == null : artifact.equals(artifact2);
    }
}
