package org.apache.ivy.plugins.report;

import java.io.IOException;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;

/* loaded from: classes6.dex */
public interface ReportOutputter {
    public static final String CONSOLE = "console";
    public static final String XML = "xml";

    String getName();

    void output(ResolveReport resolveReport, ResolutionCacheManager resolutionCacheManager, ResolveOptions resolveOptions) throws IOException;
}
