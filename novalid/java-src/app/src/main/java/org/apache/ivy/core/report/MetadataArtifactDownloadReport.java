package org.apache.ivy.core.report;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public class MetadataArtifactDownloadReport extends ArtifactDownloadReport {
    public boolean isSearched;
    public File originalLocalFile;

    public MetadataArtifactDownloadReport(Artifact artifact) {
        super(artifact);
    }

    public boolean isSearched() {
        return this.isSearched;
    }

    public void setSearched(boolean z) {
        this.isSearched = z;
    }

    public File getOriginalLocalFile() {
        return this.originalLocalFile;
    }

    public void setOriginalLocalFile(File file) {
        this.originalLocalFile = file;
    }
}
