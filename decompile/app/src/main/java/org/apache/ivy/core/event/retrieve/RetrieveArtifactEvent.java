package org.apache.ivy.core.event.retrieve;

import java.io.File;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.report.ArtifactDownloadReport;

/* loaded from: classes7.dex */
public class RetrieveArtifactEvent extends IvyEvent {
    public File destFile;
    public ArtifactDownloadReport report;

    public RetrieveArtifactEvent(String str, ArtifactDownloadReport artifactDownloadReport, File file) {
        super(str);
        addArtifactAttributes(artifactDownloadReport.getArtifact());
        this.report = artifactDownloadReport;
        this.destFile = file;
        addAttribute("from", artifactDownloadReport.getLocalFile().getAbsolutePath());
        addAttribute("to", file.getAbsolutePath());
        addAttribute("size", String.valueOf(file.length()));
    }

    public void addArtifactAttributes(Artifact artifact) {
        addMridAttributes(artifact.getModuleRevisionId());
        addAttributes(artifact.getAttributes());
        addAttribute("metadata", String.valueOf(artifact.isMetadata()));
    }

    public File getDestFile() {
        return this.destFile;
    }

    public ArtifactDownloadReport getReport() {
        return this.report;
    }
}
