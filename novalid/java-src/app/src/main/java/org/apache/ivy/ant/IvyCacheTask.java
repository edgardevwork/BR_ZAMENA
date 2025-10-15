package org.apache.ivy.ant;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;

/* loaded from: classes8.dex */
public abstract class IvyCacheTask extends IvyPostResolveTask {
    public List<ArtifactDownloadReport> getArtifactReports() throws BuildException, ParseException {
        ArrayList arrayList = new ArrayList();
        for (ArtifactDownloadReport artifactDownloadReport : getAllArtifactReports()) {
            if (getArtifactFilter().accept(artifactDownloadReport.getArtifact())) {
                arrayList.add(artifactDownloadReport);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final Collection<ArtifactDownloadReport> getAllArtifactReports() throws BuildException, ParseException {
        String[] strArrSplitToArray = StringUtils.splitToArray(getConf());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ResolveReport resolvedReport = getResolvedReport();
        int i = 0;
        if (resolvedReport != null) {
            Message.debug("using internal report instance to get artifacts list");
            int length = strArrSplitToArray.length;
            while (i < length) {
                String str = strArrSplitToArray[i];
                ConfigurationResolveReport configurationReport = resolvedReport.getConfigurationReport(str);
                if (configurationReport == null) {
                    throw new BuildException("bad confs provided: " + str + " not found among " + Arrays.asList(resolvedReport.getConfigurations()));
                }
                Iterator<ModuleRevisionId> it = configurationReport.getModuleRevisionIds().iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(Arrays.asList(configurationReport.getDownloadReports(it.next())));
                }
                i++;
            }
        } else {
            Message.debug("using stored report to get artifacts list");
            XmlReportParser xmlReportParser = new XmlReportParser();
            ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
            String resolveId = getResolveId();
            if (resolveId == null) {
                resolveId = ResolveOptions.getDefaultResolveId(getResolvedModuleId());
            }
            int length2 = strArrSplitToArray.length;
            while (i < length2) {
                xmlReportParser.parse(resolutionCacheManager.getConfigurationResolveReportInCache(resolveId, strArrSplitToArray[i]));
                linkedHashSet.addAll(Arrays.asList(xmlReportParser.getArtifactReports()));
                i++;
            }
        }
        return linkedHashSet;
    }
}
