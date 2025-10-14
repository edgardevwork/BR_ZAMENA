package org.apache.ivy.plugins.report;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class LogReportOutputter implements ReportOutputter {
    @Override // org.apache.ivy.plugins.report.ReportOutputter
    public String getName() {
        return ReportOutputter.CONSOLE;
    }

    @Override // org.apache.ivy.plugins.report.ReportOutputter
    public void output(ResolveReport resolveReport, ResolutionCacheManager resolutionCacheManager, ResolveOptions resolveOptions) throws IOException {
        if (IvyContext.getContext().getSettings().logModulesInUse() && "default".equals(resolveOptions.getLog())) {
            Message.info("\t:: modules in use:");
            ArrayList<IvyNode> arrayList = new ArrayList(resolveReport.getDependencies());
            Collections.sort(arrayList);
            if (arrayList.size() > 0) {
                String[] configurations = resolveReport.getConfigurations();
                for (IvyNode ivyNode : arrayList) {
                    if (!ivyNode.isCompletelyEvicted() && !ivyNode.hasProblem()) {
                        ArrayList arrayList2 = new ArrayList(configurations.length);
                        for (String str : configurations) {
                            if (resolveReport.getConfigurationReport(str).getModuleRevisionIds().contains(ivyNode.getResolvedId())) {
                                arrayList2.add(str);
                            }
                        }
                        Message.info("\t" + ivyNode + " from " + ivyNode.getModuleRevision().getResolver().getName() + " in " + arrayList2);
                    }
                }
            }
        }
        IvyNode[] evictedNodes = resolveReport.getEvictedNodes();
        if (evictedNodes.length > 0 && "default".equals(resolveOptions.getLog())) {
            Message.info("\t:: evicted modules:");
            for (IvyNode ivyNode2 : evictedNodes) {
                Collection<String> allEvictingNodesDetails = ivyNode2.getAllEvictingNodesDetails();
                if (allEvictingNodesDetails == null) {
                    Message.info("\t" + ivyNode2 + " transitively in " + Arrays.asList(ivyNode2.getEvictedConfs()));
                } else if (allEvictingNodesDetails.isEmpty()) {
                    Message.info("\t" + ivyNode2 + " by [] (" + ivyNode2.getAllEvictingConflictManagers() + ") in " + Arrays.asList(ivyNode2.getEvictedConfs()));
                } else {
                    Message.info("\t" + ivyNode2 + " by " + allEvictingNodesDetails + " in " + Arrays.asList(ivyNode2.getEvictedConfs()));
                }
                for (String str2 : ivyNode2.getEvictedConfs()) {
                    IvyNodeEviction.EvictionData evictedData = ivyNode2.getEvictedData(str2);
                    if (evictedData.getParent() != null) {
                        Message.verbose("\t  in " + evictedData.getParent() + " with " + evictedData.getConflictManager());
                    }
                }
            }
        }
        if ("default".equals(resolveOptions.getLog())) {
            char[] cArr = new char[69];
            Arrays.fill(cArr, '-');
            Message.rawinfo("\t" + new String(cArr));
            StringBuilder sb = new StringBuilder("\t");
            append(sb, "", 18);
            append(sb, "modules", 31);
            sb.append("|");
            append(sb, "artifacts", 15);
            sb.append("|");
            Message.rawinfo(sb.toString());
            StringBuilder sb2 = new StringBuilder("\t");
            append(sb2, IvyPatternHelper.CONF_KEY, 18);
            append(sb2, "number", 7);
            append(sb2, FirebaseAnalytics.Event.SEARCH, 7);
            append(sb2, "dwnlded", 7);
            append(sb2, "evicted", 7);
            sb2.append("|");
            append(sb2, "number", 7);
            append(sb2, "dwnlded", 7);
            sb2.append("|");
            Message.rawinfo(sb2.toString());
            Message.rawinfo("\t" + new String(cArr));
            String[] configurations2 = resolveReport.getConfigurations();
            int length = configurations2.length;
            for (int i = 0; i < length; i++) {
                output(resolveReport.getConfigurationReport(configurations2[i]));
            }
            Message.rawinfo("\t" + new String(cArr));
        }
        IvyNode[] unresolvedDependencies = resolveReport.getUnresolvedDependencies();
        if (unresolvedDependencies.length > 0) {
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::");
            Message.warn("\t::          UNRESOLVED DEPENDENCIES         ::");
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::");
        }
        for (IvyNode ivyNode3 : unresolvedDependencies) {
            Message.warn("\t:: " + ivyNode3 + ": " + ivyNode3.getProblemMessage());
        }
        if (unresolvedDependencies.length > 0) {
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::\n");
        }
        ArtifactDownloadReport[] failedArtifactsReports = resolveReport.getFailedArtifactsReports();
        if (failedArtifactsReports.length > 0) {
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::");
            Message.warn("\t::              FAILED DOWNLOADS            ::");
            Message.warn("\t:: ^ see resolution messages for details  ^ ::");
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::");
        }
        for (ArtifactDownloadReport artifactDownloadReport : failedArtifactsReports) {
            Message.warn("\t:: " + artifactDownloadReport.getArtifact());
        }
        if (failedArtifactsReports.length > 0) {
            Message.warn("\t::::::::::::::::::::::::::::::::::::::::::::::\n");
        }
    }

    public void output(ConfigurationResolveReport configurationResolveReport) {
        StringBuilder sb = new StringBuilder("\t");
        append(sb, configurationResolveReport.getConfiguration(), 18);
        append(sb, String.valueOf(configurationResolveReport.getNodesNumber()), 7);
        append(sb, String.valueOf(configurationResolveReport.getSearchedNodes().length), 7);
        append(sb, String.valueOf(configurationResolveReport.getDownloadedNodes().length), 7);
        append(sb, String.valueOf(configurationResolveReport.getEvictedNodes().length), 7);
        sb.append("|");
        append(sb, String.valueOf(configurationResolveReport.getArtifactsNumber()), 7);
        append(sb, String.valueOf(configurationResolveReport.getDownloadedArtifactsReports().length), 7);
        sb.append("|");
        Message.rawinfo(sb.toString());
    }

    public final void append(StringBuilder sb, Object obj, int i) {
        String str;
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() >= i) {
            str = strValueOf.substring(0, i);
        } else {
            int length = i - strValueOf.length();
            char[] cArr = new char[i];
            Arrays.fill(cArr, ' ');
            System.arraycopy(strValueOf.toCharArray(), 0, cArr, length - (length / 2), strValueOf.length());
            str = new String(cArr);
        }
        sb.append("|");
        sb.append(str);
    }
}
