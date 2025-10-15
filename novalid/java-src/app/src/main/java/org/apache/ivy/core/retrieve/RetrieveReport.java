package org.apache.ivy.core.retrieve;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.apache.ivy.core.report.ArtifactDownloadReport;

/* loaded from: classes5.dex */
public class RetrieveReport {
    public File retrieveRoot;
    public Collection<File> upToDateFiles = new HashSet();
    public Collection<File> copiedFiles = new HashSet();
    public Map<File, ArtifactDownloadReport> downloadReport = new HashMap();

    public File getRetrieveRoot() {
        return this.retrieveRoot;
    }

    public void setRetrieveRoot(File file) {
        this.retrieveRoot = file;
    }

    public int getNbrArtifactsCopied() {
        return this.copiedFiles.size();
    }

    public int getNbrArtifactsUpToDate() {
        return this.upToDateFiles.size();
    }

    public void addCopiedFile(File file, ArtifactDownloadReport artifactDownloadReport) {
        this.copiedFiles.add(file);
        this.downloadReport.put(file, artifactDownloadReport);
    }

    public void addUpToDateFile(File file, ArtifactDownloadReport artifactDownloadReport) {
        this.upToDateFiles.add(file);
        this.downloadReport.put(file, artifactDownloadReport);
    }

    public Collection<File> getCopiedFiles() {
        return new ArrayList(this.copiedFiles);
    }

    public Collection<File> getUpToDateFiles() {
        return new ArrayList(this.upToDateFiles);
    }

    public Collection<File> getRetrievedFiles() {
        ArrayList arrayList = new ArrayList(this.upToDateFiles.size() + this.copiedFiles.size());
        arrayList.addAll(this.upToDateFiles);
        arrayList.addAll(this.copiedFiles);
        return arrayList;
    }

    public Map<File, ArtifactDownloadReport> getDownloadReport() {
        return this.downloadReport;
    }
}
