package org.apache.ivy.plugins.report;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.IvyNodeCallers;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.XMLHelper;
import org.apache.ivy.util.extendable.ExtendableItemHelper;

/* loaded from: classes6.dex */
public class XmlReportWriter {
    public static final String REPORT_ENCODING = "UTF-8";
    public static final String SEPARATOR = " ";

    public void output(ConfigurationResolveReport configurationResolveReport, OutputStream outputStream) {
        output(configurationResolveReport, new String[]{configurationResolveReport.getConfiguration()}, outputStream);
    }

    public void output(ConfigurationResolveReport configurationResolveReport, String[] strArr, OutputStream outputStream) {
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8")));
            ModuleRevisionId moduleRevisionId = configurationResolveReport.getModuleDescriptor().getModuleRevisionId();
            printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            printWriter.println("<?xml-stylesheet type=\"text/xsl\" href=\"ivy-report.xsl\"?>");
            printWriter.println("<ivy-report version=\"1.0\">");
            printWriter.println("\t<info");
            printWriter.println("\t\torganisation=\"" + XMLHelper.escape(moduleRevisionId.getOrganisation()) + "\"");
            printWriter.println("\t\tmodule=\"" + XMLHelper.escape(moduleRevisionId.getName()) + "\"");
            printWriter.println("\t\trevision=\"" + XMLHelper.escape(moduleRevisionId.getRevision()) + "\"");
            if (moduleRevisionId.getBranch() != null) {
                printWriter.println("\t\tbranch=\"" + XMLHelper.escape(moduleRevisionId.getBranch()) + "\"");
            }
            printWriter.println(extraToString(moduleRevisionId.getQualifiedExtraAttributes(), "\t\t"));
            printWriter.println("\t\tconf=\"" + XMLHelper.escape(configurationResolveReport.getConfiguration()) + "\"");
            printWriter.println("\t\tconfs=\"" + XMLHelper.escape(StringUtils.joinArray(strArr, ", ")) + "\"");
            printWriter.println("\t\tdate=\"" + DateUtil.format(configurationResolveReport.getDate()) + "\"/>");
            printWriter.println("\t<dependencies>");
            ArrayList arrayList = new ArrayList(configurationResolveReport.getModuleRevisionIds());
            for (ModuleId moduleId : configurationResolveReport.getModuleIds()) {
                printWriter.println("\t\t<module organisation=\"" + XMLHelper.escape(moduleId.getOrganisation()) + "\" name=\"" + XMLHelper.escape(moduleId.getName()) + "\">");
                Iterator<IvyNode> it = configurationResolveReport.getNodes(moduleId).iterator();
                while (it.hasNext()) {
                    outputRevision(configurationResolveReport, printWriter, arrayList, it.next());
                }
                printWriter.println("\t\t</module>");
            }
            printWriter.println("\t</dependencies>");
            printWriter.println("</ivy-report>");
            printWriter.flush();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 is not known on your jvm", e);
        }
    }

    public final void outputRevision(ConfigurationResolveReport configurationResolveReport, PrintWriter printWriter, List<ModuleRevisionId> list, IvyNode ivyNode) {
        Map<String, String> qualifiedExtraAttributes;
        ModuleDescriptor descriptor = ivyNode.getModuleRevision() != null ? ivyNode.getModuleRevision().getDescriptor() : null;
        StringBuilder sb = new StringBuilder();
        if (ivyNode.isLoaded()) {
            sb.append(" status=\"");
            sb.append(XMLHelper.escape(ivyNode.getDescriptor().getStatus()));
            sb.append("\" pubdate=\"");
            sb.append(DateUtil.format(new Date(ivyNode.getPublication())));
            sb.append("\" resolver=\"");
            sb.append(XMLHelper.escape(ivyNode.getModuleRevision().getResolver().getName()));
            sb.append("\" artresolver=\"");
            sb.append(XMLHelper.escape(ivyNode.getModuleRevision().getArtifactResolver().getName()));
            sb.append("\"");
        }
        if (ivyNode.isEvicted(configurationResolveReport.getConfiguration())) {
            IvyNodeEviction.EvictionData evictedData = ivyNode.getEvictedData(configurationResolveReport.getConfiguration());
            if (evictedData.getConflictManager() != null) {
                sb.append(" evicted=\"");
                sb.append(XMLHelper.escape(evictedData.getConflictManager().toString()));
                sb.append("\"");
            } else {
                sb.append(" evicted=\"transitive\"");
            }
            sb.append(" evicted-reason=\"");
            sb.append(XMLHelper.escape(evictedData.getDetail() == null ? "" : evictedData.getDetail()));
            sb.append("\"");
        }
        if (ivyNode.hasProblem()) {
            sb.append(" error=\"");
            sb.append(XMLHelper.escape(ivyNode.getProblem().getMessage()));
            sb.append("\"");
        }
        if (descriptor != null && descriptor.getHomePage() != null) {
            sb.append(" homepage=\"");
            sb.append(XMLHelper.escape(descriptor.getHomePage()));
            sb.append("\"");
        }
        if (descriptor != null) {
            qualifiedExtraAttributes = descriptor.getQualifiedExtraAttributes();
        } else {
            qualifiedExtraAttributes = ivyNode.getResolvedId().getQualifiedExtraAttributes();
        }
        sb.append(extraToString(qualifiedExtraAttributes, " "));
        printWriter.println(String.format("\t\t\t<revision name=\"%s\"%s%s downloaded=\"%s\" searched=\"%s\"%s conf=\"%s\" position=\"%d\">", XMLHelper.escape(ivyNode.getResolvedId().getRevision()), ivyNode.getResolvedId().getBranch() == null ? "" : " branch=\"" + XMLHelper.escape(ivyNode.getResolvedId().getBranch()) + "\"", sb, Boolean.valueOf(ivyNode.isDownloaded()), Boolean.valueOf(ivyNode.isSearched()), ivyNode.getDescriptor() == null ? "" : " default=\"" + ivyNode.getDescriptor().isDefault() + "\"", XMLHelper.escape(StringUtils.joinArray(ivyNode.getConfigurations(configurationResolveReport.getConfiguration()), ", ")), Integer.valueOf(list.indexOf(ivyNode.getResolvedId()))));
        if (descriptor != null) {
            for (License license : descriptor.getLicenses()) {
                printWriter.println(String.format("\t\t\t\t<license name=\"%s\"%s/>", XMLHelper.escape(license.getName()), license.getUrl() == null ? "" : " url=\"" + XMLHelper.escape(license.getUrl()) + "\""));
            }
        }
        outputMetadataArtifact(printWriter, ivyNode);
        outputEvictionInformation(configurationResolveReport, printWriter, ivyNode);
        outputCallers(configurationResolveReport, printWriter, ivyNode);
        outputArtifacts(configurationResolveReport, printWriter, ivyNode);
        printWriter.println("\t\t\t</revision>");
    }

    public final String extraToString(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0 && !" ".equals(str)) {
                sb.append(System.lineSeparator());
            }
            sb.append(str);
            sb.append(ExtendableItemHelper.encodeAttribute(entry.getKey(), "extra-"));
            sb.append("=\"");
            sb.append(XMLHelper.escape(entry.getValue()));
            sb.append("\"");
        }
        return sb.toString();
    }

    public final void outputEvictionInformation(ConfigurationResolveReport configurationResolveReport, PrintWriter printWriter, IvyNode ivyNode) {
        Collection<IvyNode> selected;
        if (!ivyNode.isEvicted(configurationResolveReport.getConfiguration()) || (selected = ivyNode.getEvictedData(configurationResolveReport.getConfiguration()).getSelected()) == null) {
            return;
        }
        Iterator<IvyNode> it = selected.iterator();
        while (it.hasNext()) {
            printWriter.println("\t\t\t\t<evicted-by rev=\"" + XMLHelper.escape(it.next().getResolvedId().getRevision()) + "\"/>");
        }
    }

    public final void outputMetadataArtifact(PrintWriter printWriter, IvyNode ivyNode) {
        if (ivyNode.getModuleRevision() != null) {
            MetadataArtifactDownloadReport report = ivyNode.getModuleRevision().getReport();
            printWriter.print("\t\t\t\t<metadata-artifact");
            printWriter.print(" status=\"" + XMLHelper.escape(report.getDownloadStatus().toString()) + "\"");
            printWriter.print(" details=\"" + XMLHelper.escape(report.getDownloadDetails()) + "\"");
            printWriter.print(" size=\"" + report.getSize() + "\"");
            printWriter.print(" time=\"" + report.getDownloadTimeMillis() + "\"");
            if (report.getLocalFile() != null) {
                printWriter.print(" location=\"" + XMLHelper.escape(report.getLocalFile().getAbsolutePath()) + "\"");
            }
            printWriter.print(" searched=\"" + report.isSearched() + "\"");
            if (report.getOriginalLocalFile() != null) {
                printWriter.print(" original-local-location=\"" + XMLHelper.escape(report.getOriginalLocalFile().getAbsolutePath()) + "\"");
            }
            ArtifactOrigin artifactOrigin = report.getArtifactOrigin();
            if (artifactOrigin != null) {
                printWriter.print(" origin-is-local=\"" + String.valueOf(artifactOrigin.isLocal()) + "\"");
                printWriter.print(" origin-location=\"" + XMLHelper.escape(artifactOrigin.getLocation()) + "\"");
            }
            printWriter.println("/>");
        }
    }

    public final void outputCallers(ConfigurationResolveReport configurationResolveReport, PrintWriter printWriter, IvyNode ivyNode) {
        for (IvyNodeCallers.Caller caller : ivyNode.getCallers(configurationResolveReport.getConfiguration())) {
            DependencyDescriptor dependencyDescriptor = caller.getDependencyDescriptor();
            printWriter.println(String.format("\t\t\t\t<caller organisation=\"%s\" name=\"%s\" conf=\"%s\" rev=\"%s\" rev-constraint-default=\"%s\" rev-constraint-dynamic=\"%s\" callerrev=\"%s\"%s/>", XMLHelper.escape(caller.getModuleRevisionId().getOrganisation()), XMLHelper.escape(caller.getModuleRevisionId().getName()), XMLHelper.escape(StringUtils.joinArray(caller.getCallerConfigurations(), ", ")), XMLHelper.escape(caller.getAskedDependencyId().getRevision()), XMLHelper.escape(dependencyDescriptor.getDependencyRevisionId().getRevision()), XMLHelper.escape(dependencyDescriptor.getDynamicConstraintDependencyRevisionId().getRevision()), XMLHelper.escape(caller.getModuleRevisionId().getRevision()), extraToString(dependencyDescriptor.getQualifiedExtraAttributes(), " ")));
        }
    }

    public final void outputArtifacts(ConfigurationResolveReport configurationResolveReport, PrintWriter printWriter, IvyNode ivyNode) {
        printWriter.println("\t\t\t\t<artifacts>");
        for (ArtifactDownloadReport artifactDownloadReport : configurationResolveReport.getDownloadReports(ivyNode.getResolvedId())) {
            printWriter.print("\t\t\t\t\t<artifact name=\"" + XMLHelper.escape(artifactDownloadReport.getName()) + "\" type=\"" + XMLHelper.escape(artifactDownloadReport.getType()) + "\" ext=\"" + XMLHelper.escape(artifactDownloadReport.getExt()) + "\"");
            printWriter.print(extraToString(artifactDownloadReport.getArtifact().getQualifiedExtraAttributes(), " "));
            StringBuilder sb = new StringBuilder();
            sb.append(" status=\"");
            sb.append(XMLHelper.escape(artifactDownloadReport.getDownloadStatus().toString()));
            sb.append("\"");
            printWriter.print(sb.toString());
            printWriter.print(" details=\"" + XMLHelper.escape(artifactDownloadReport.getDownloadDetails()) + "\"");
            printWriter.print(" size=\"" + artifactDownloadReport.getSize() + "\"");
            printWriter.print(" time=\"" + artifactDownloadReport.getDownloadTimeMillis() + "\"");
            if (artifactDownloadReport.getLocalFile() != null) {
                printWriter.print(" location=\"" + XMLHelper.escape(artifactDownloadReport.getLocalFile().getAbsolutePath()) + "\"");
            }
            if (artifactDownloadReport.getUnpackedLocalFile() != null) {
                printWriter.print(" unpackedFile=\"" + XMLHelper.escape(artifactDownloadReport.getUnpackedLocalFile().getAbsolutePath()) + "\"");
            }
            ArtifactOrigin artifactOrigin = artifactDownloadReport.getArtifactOrigin();
            if (artifactOrigin != null) {
                printWriter.println(">");
                printWriter.println("\t\t\t\t\t\t<origin-location is-local=\"" + String.valueOf(artifactOrigin.isLocal()) + "\" location=\"" + XMLHelper.escape(artifactOrigin.getLocation()) + "\"/>");
                printWriter.println("\t\t\t\t\t</artifact>");
            } else {
                printWriter.println("/>");
            }
        }
        printWriter.println("\t\t\t\t</artifacts>");
    }
}
