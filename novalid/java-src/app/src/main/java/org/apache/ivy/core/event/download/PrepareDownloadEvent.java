package org.apache.ivy.core.event.download;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public class PrepareDownloadEvent extends IvyEvent {
    public static final String NAME = "prepare-download";
    public Artifact[] artifacts;

    public PrepareDownloadEvent(Artifact[] artifactArr) {
        super(NAME);
        this.artifacts = artifactArr;
    }

    public Artifact[] getArtifacts() {
        return this.artifacts;
    }
}
