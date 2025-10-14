package org.apache.ivy.core.report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public class DownloadReport {
    public final Map<Artifact, ArtifactDownloadReport> artifacts = new HashMap();

    public void addArtifactReport(ArtifactDownloadReport artifactDownloadReport) {
        this.artifacts.put(artifactDownloadReport.getArtifact(), artifactDownloadReport);
    }

    public ArtifactDownloadReport[] getArtifactsReports() {
        return (ArtifactDownloadReport[]) this.artifacts.values().toArray(new ArtifactDownloadReport[this.artifacts.size()]);
    }

    public ArtifactDownloadReport[] getArtifactsReports(DownloadStatus downloadStatus) {
        ArrayList arrayList = new ArrayList(this.artifacts.size());
        for (ArtifactDownloadReport artifactDownloadReport : this.artifacts.values()) {
            if (artifactDownloadReport.getDownloadStatus() == downloadStatus) {
                arrayList.add(artifactDownloadReport);
            }
        }
        return (ArtifactDownloadReport[]) arrayList.toArray(new ArtifactDownloadReport[arrayList.size()]);
    }

    public ArtifactDownloadReport getArtifactReport(Artifact artifact) {
        return this.artifacts.get(artifact);
    }
}
