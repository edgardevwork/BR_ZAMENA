package org.apache.ivy.core.event.retrieve;

import java.io.File;
import org.apache.ivy.core.report.ArtifactDownloadReport;

/* loaded from: classes8.dex */
public class EndRetrieveArtifactEvent extends RetrieveArtifactEvent {
    public static final String NAME = "post-retrieve-artifact";

    public EndRetrieveArtifactEvent(ArtifactDownloadReport artifactDownloadReport, File file) {
        super(NAME, artifactDownloadReport, file);
    }
}
