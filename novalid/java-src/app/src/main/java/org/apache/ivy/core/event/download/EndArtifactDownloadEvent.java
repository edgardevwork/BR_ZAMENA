package org.apache.ivy.core.event.download;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes8.dex */
public class EndArtifactDownloadEvent extends DownloadEvent {
    public static final String NAME = "post-download-artifact";
    public ArtifactDownloadReport report;
    public DependencyResolver resolver;

    public EndArtifactDownloadEvent(DependencyResolver dependencyResolver, Artifact artifact, ArtifactDownloadReport artifactDownloadReport, File file) {
        super(NAME, artifact);
        this.resolver = dependencyResolver;
        this.report = artifactDownloadReport;
        addAttribute("resolver", dependencyResolver.getName());
        addAttribute("status", this.report.getDownloadStatus().toString());
        addAttribute("details", this.report.getDownloadDetails());
        addAttribute("size", String.valueOf(this.report.getSize()));
        addAttribute(PomReader.PomProfileElement.FILE, file.getAbsolutePath());
        addAttribute("duration", String.valueOf(this.report.getDownloadTimeMillis()));
        ArtifactOrigin artifactOrigin = artifactDownloadReport.getArtifactOrigin();
        if (!ArtifactOrigin.isUnknown(artifactOrigin)) {
            addAttribute("origin", artifactOrigin.getLocation());
            addAttribute(ImagesContract.LOCAL, String.valueOf(artifactOrigin.isLocal()));
        } else {
            addAttribute("origin", "");
            addAttribute(ImagesContract.LOCAL, "");
        }
    }

    public ArtifactDownloadReport getReport() {
        return this.report;
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }
}
