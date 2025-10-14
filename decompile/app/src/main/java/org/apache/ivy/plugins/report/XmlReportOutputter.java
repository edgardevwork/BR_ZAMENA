package org.apache.ivy.plugins.report;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.ivy.core.cache.DefaultResolutionCacheManager;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class XmlReportOutputter implements ReportOutputter {
    public XmlReportWriter writer = new XmlReportWriter();

    @Override // org.apache.ivy.plugins.report.ReportOutputter
    public String getName() {
        return "xml";
    }

    @Override // org.apache.ivy.plugins.report.ReportOutputter
    public void output(ResolveReport resolveReport, ResolutionCacheManager resolutionCacheManager, ResolveOptions resolveOptions) throws IOException {
        String[] configurations = resolveReport.getConfigurations();
        for (String str : configurations) {
            output(resolveReport.getConfigurationReport(str), resolveReport.getResolveId(), configurations, resolutionCacheManager);
        }
    }

    public void output(ConfigurationResolveReport configurationResolveReport, String str, String[] strArr, ResolutionCacheManager resolutionCacheManager) throws IOException {
        File configurationResolveReportInCache = resolutionCacheManager.getConfigurationResolveReportInCache(str, configurationResolveReport.getConfiguration());
        if (resolutionCacheManager instanceof DefaultResolutionCacheManager) {
            ((DefaultResolutionCacheManager) resolutionCacheManager).assertInsideCache(configurationResolveReportInCache);
        }
        File parentFile = configurationResolveReportInCache.getParentFile();
        parentFile.mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(configurationResolveReportInCache);
        this.writer.output(configurationResolveReport, strArr, fileOutputStream);
        fileOutputStream.close();
        Message.verbose("\treport for " + configurationResolveReport.getModuleDescriptor().getModuleRevisionId() + " " + configurationResolveReport.getConfiguration() + " produced in " + configurationResolveReportInCache);
        File file = new File(parentFile, "ivy-report.xsl");
        File file2 = new File(parentFile, "ivy-report.css");
        if (!file.exists()) {
            FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report.xsl"), file, (CopyProgressListener) null);
        }
        if (file2.exists()) {
            return;
        }
        FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report.css"), file2, (CopyProgressListener) null);
    }
}
