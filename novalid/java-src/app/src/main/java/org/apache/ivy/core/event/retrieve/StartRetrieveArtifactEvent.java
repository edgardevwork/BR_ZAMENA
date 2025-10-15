package org.apache.ivy.core.event.retrieve;

import java.io.File;
import org.apache.ivy.core.report.ArtifactDownloadReport;

/* loaded from: classes8.dex */
public class StartRetrieveArtifactEvent extends RetrieveArtifactEvent {
    public static final String NAME = "pre-retrieve-artifact";

    public StartRetrieveArtifactEvent(ArtifactDownloadReport artifactDownloadReport, File file) {
        super(NAME, artifactDownloadReport, file);
    }
}
