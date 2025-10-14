package org.apache.ivy.core.event.download;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public abstract class DownloadEvent extends IvyEvent {
    public Artifact artifact;

    public DownloadEvent(String str, Artifact artifact) {
        super(str);
        this.artifact = artifact;
        addArtifactAttributes(artifact);
    }

    public void addArtifactAttributes(Artifact artifact) {
        addMridAttributes(artifact.getModuleRevisionId());
        addAttributes(artifact.getAttributes());
        addAttribute("metadata", String.valueOf(artifact.isMetadata()));
    }

    public Artifact getArtifact() {
        return this.artifact;
    }
}
