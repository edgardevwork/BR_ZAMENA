package org.apache.ivy.core.event.resolve;

import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.report.ResolveReport;

/* loaded from: classes8.dex */
public class EndResolveEvent extends ResolveEvent {
    public static final String NAME = "post-resolve";
    public ResolveReport report;

    public EndResolveEvent(ModuleDescriptor moduleDescriptor, String[] strArr, ResolveReport resolveReport) {
        super(NAME, moduleDescriptor, strArr);
        this.report = resolveReport;
        addAttribute("resolve-id", String.valueOf(resolveReport.getResolveId()));
        addAttribute("nb-dependencies", String.valueOf(resolveReport.getDependencies().size()));
        addAttribute("nb-artifacts", String.valueOf(resolveReport.getArtifacts().size()));
        addAttribute("resolve-duration", String.valueOf(resolveReport.getResolveTime()));
        addAttribute("download-duration", String.valueOf(resolveReport.getDownloadTime()));
        addAttribute("download-size", String.valueOf(resolveReport.getDownloadSize()));
    }

    public ResolveReport getReport() {
        return this.report;
    }
}
