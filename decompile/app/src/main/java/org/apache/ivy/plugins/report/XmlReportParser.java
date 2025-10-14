package org.apache.ivy.plugins.report;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.xml.parsers.SAXParserFactory;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.extendable.ExtendableItemHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes6.dex */
public class XmlReportParser {
    public SaxXmlReportParser parser = null;

    public static class SaxXmlReportParser {
        public ModuleRevisionId mRevisionId;
        public File report;
        public List<ModuleRevisionId> mrids = new ArrayList();
        public List<ModuleRevisionId> defaultMrids = new ArrayList();
        public List<ModuleRevisionId> realMrids = new ArrayList();
        public List<Artifact> artifacts = new ArrayList();
        public List<ArtifactDownloadReport> artifactReports = new ArrayList();
        public Map<ModuleRevisionId, MetadataArtifactDownloadReport> metadataReports = new HashMap();
        public boolean hasError = false;

        public final class XmlReportParserHandler extends DefaultHandler {
            public String branch;
            public boolean isDefault;
            public String module;
            public ModuleRevisionId mrid;
            public String organisation;
            public int position;
            public Date pubdate;
            public String revision;
            public List<ArtifactDownloadReport> revisionArtifacts;
            public SortedMap<Integer, List<ArtifactDownloadReport>> revisionsMap;
            public boolean skip;

            public XmlReportParserHandler() {
                this.revisionsMap = new TreeMap();
                this.revisionArtifacts = null;
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                String str4;
                char c;
                MetadataArtifactDownloadReport metadataArtifactDownloadReport;
                boolean z;
                int iIntValue;
                str3.hashCode();
                char c2 = 65535;
                switch (str3.hashCode()) {
                    case -2028850512:
                        str4 = "origin-location";
                        if (str3.equals("metadata-artifact")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1228798510:
                        str4 = "origin-location";
                        if (str3.equals("artifact")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1068784020:
                        str4 = "origin-location";
                        if (str3.equals("module")) {
                            c = 2;
                            c2 = c;
                            break;
                        }
                        break;
                    case -260786213:
                        str4 = "origin-location";
                        if (str3.equals(IvyPatternHelper.REVISION_KEY)) {
                            c = 3;
                            c2 = c;
                            break;
                        }
                        break;
                    case 3237038:
                        str4 = "origin-location";
                        if (str3.equals("info")) {
                            c = 4;
                            c2 = c;
                            break;
                        }
                        break;
                    case 30482044:
                        if (str3.equals("origin-location")) {
                            c2 = 5;
                        }
                    default:
                        str4 = "origin-location";
                        break;
                }
                switch (c2) {
                    case 0:
                        if (this.skip || (metadataArtifactDownloadReport = (MetadataArtifactDownloadReport) SaxXmlReportParser.this.metadataReports.get(this.mrid)) == null) {
                            return;
                        }
                        metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.fromString(attributes.getValue("status")));
                        metadataArtifactDownloadReport.setDownloadDetails(attributes.getValue("details"));
                        metadataArtifactDownloadReport.setSize(Long.parseLong(attributes.getValue("size")));
                        metadataArtifactDownloadReport.setDownloadTimeMillis(Long.parseLong(attributes.getValue("time")));
                        metadataArtifactDownloadReport.setSearched(SaxXmlReportParser.parseBoolean(attributes.getValue("searched")));
                        if (attributes.getValue("location") != null) {
                            metadataArtifactDownloadReport.setLocalFile(new File(attributes.getValue("location")));
                        }
                        if (attributes.getValue("original-local-location") != null) {
                            metadataArtifactDownloadReport.setOriginalLocalFile(new File(attributes.getValue("original-local-location")));
                        }
                        String str5 = str4;
                        if (attributes.getValue(str5) != null) {
                            if (ArtifactOrigin.isUnknown(attributes.getValue(str5))) {
                                metadataArtifactDownloadReport.setArtifactOrigin(ArtifactOrigin.unknown(metadataArtifactDownloadReport.getArtifact()));
                                return;
                            } else {
                                metadataArtifactDownloadReport.setArtifactOrigin(new ArtifactOrigin(metadataArtifactDownloadReport.getArtifact(), SaxXmlReportParser.parseBoolean(attributes.getValue("origin-is-local")), attributes.getValue(str5)));
                                return;
                            }
                        }
                        return;
                    case 1:
                        if (this.skip) {
                            return;
                        }
                        String value = attributes.getValue("status");
                        ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(new DefaultArtifact(this.mrid, this.pubdate, attributes.getValue("name"), attributes.getValue("type"), attributes.getValue(IvyPatternHelper.EXT_KEY), ExtendableItemHelper.getExtraAttributes(attributes, "extra-")));
                        artifactDownloadReport.setDownloadStatus(DownloadStatus.fromString(value));
                        artifactDownloadReport.setDownloadDetails(attributes.getValue("details"));
                        artifactDownloadReport.setSize(Long.parseLong(attributes.getValue("size")));
                        artifactDownloadReport.setDownloadTimeMillis(Long.parseLong(attributes.getValue("time")));
                        if (attributes.getValue("location") != null) {
                            artifactDownloadReport.setLocalFile(new File(attributes.getValue("location")));
                        }
                        if (attributes.getValue("unpackedFile") != null) {
                            artifactDownloadReport.setUnpackedLocalFile(new File(attributes.getValue("unpackedFile")));
                        }
                        this.revisionArtifacts.add(artifactDownloadReport);
                        return;
                    case 2:
                        this.organisation = attributes.getValue(IvyPatternHelper.ORGANISATION_KEY);
                        this.module = attributes.getValue("name");
                        return;
                    case 3:
                        this.revisionArtifacts = new ArrayList();
                        this.branch = attributes.getValue(IvyPatternHelper.BRANCH_KEY);
                        this.revision = attributes.getValue("name");
                        this.isDefault = Boolean.valueOf(attributes.getValue("default")).booleanValue();
                        String value2 = attributes.getValue("position");
                        if (value2 == null) {
                            z = true;
                            iIntValue = getMaxPos() + 1;
                        } else {
                            z = true;
                            iIntValue = Integer.valueOf(value2).intValue();
                        }
                        this.position = iIntValue;
                        if (attributes.getValue("error") != null) {
                            SaxXmlReportParser.this.hasError = z;
                            this.skip = z;
                            return;
                        }
                        if (attributes.getValue("evicted") != null) {
                            this.skip = z;
                            return;
                        }
                        this.revisionsMap.put(Integer.valueOf(this.position), this.revisionArtifacts);
                        this.mrid = ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision, ExtendableItemHelper.getExtraAttributes(attributes, "extra-"));
                        SaxXmlReportParser.this.mrids.add(this.mrid);
                        if (this.isDefault) {
                            SaxXmlReportParser.this.defaultMrids.add(this.mrid);
                        } else {
                            SaxXmlReportParser.this.metadataReports.put(this.mrid, new MetadataArtifactDownloadReport(DefaultArtifact.newIvyArtifact(this.mrid, this.pubdate)));
                            SaxXmlReportParser.this.realMrids.add(this.mrid);
                        }
                        try {
                            String value3 = attributes.getValue("pubdate");
                            if (value3 != null) {
                                this.pubdate = DateUtil.parse(value3);
                            }
                            this.skip = false;
                            return;
                        } catch (ParseException unused) {
                            throw new IllegalArgumentException("invalid publication date for " + this.organisation + " " + this.module + " " + this.revision + ": " + attributes.getValue("pubdate"));
                        }
                    case 4:
                        SaxXmlReportParser.this.mRevisionId = ModuleRevisionId.newInstance(attributes.getValue(IvyPatternHelper.ORGANISATION_KEY), attributes.getValue("module"), attributes.getValue(IvyPatternHelper.BRANCH_KEY), attributes.getValue(IvyPatternHelper.REVISION_KEY), ExtendableItemHelper.getExtraAttributes(attributes, "extra-"));
                        return;
                    case 5:
                        if (this.skip) {
                            return;
                        }
                        List<ArtifactDownloadReport> list = this.revisionArtifacts;
                        ArtifactDownloadReport artifactDownloadReport2 = list.get(list.size() - 1);
                        if (ArtifactOrigin.isUnknown(attributes.getValue("location"))) {
                            artifactDownloadReport2.setArtifactOrigin(ArtifactOrigin.unknown(artifactDownloadReport2.getArtifact()));
                            return;
                        } else {
                            artifactDownloadReport2.setArtifactOrigin(new ArtifactOrigin(artifactDownloadReport2.getArtifact(), SaxXmlReportParser.parseBoolean(attributes.getValue("is-local")), attributes.getValue("location")));
                            return;
                        }
                    default:
                        return;
                }
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void endElement(String str, String str2, String str3) throws SAXException {
                if ("dependencies".equals(str3)) {
                    for (List<ArtifactDownloadReport> list : this.revisionsMap.values()) {
                        SaxXmlReportParser.this.artifactReports.addAll(list);
                        for (ArtifactDownloadReport artifactDownloadReport : list) {
                            if (artifactDownloadReport.getDownloadStatus() != DownloadStatus.FAILED) {
                                SaxXmlReportParser.this.artifacts.add(artifactDownloadReport.getArtifact());
                            }
                        }
                    }
                }
            }

            public final int getMaxPos() {
                if (this.revisionsMap.isEmpty()) {
                    return -1;
                }
                return ((Integer) this.revisionsMap.keySet().toArray()[this.revisionsMap.size() - 1]).intValue();
            }
        }

        public SaxXmlReportParser(File file) {
            this.report = file;
        }

        public void parse() throws Exception {
            SAXParserFactory.newInstance().newSAXParser().parse(this.report, new XmlReportParserHandler());
        }

        public static boolean parseBoolean(String str) {
            return str != null && str.equalsIgnoreCase("true");
        }

        public List<Artifact> getArtifacts() {
            return this.artifacts;
        }

        public List<ArtifactDownloadReport> getArtifactReports() {
            return this.artifactReports;
        }

        public List<ModuleRevisionId> getModuleRevisionIds() {
            return this.mrids;
        }

        public List<ModuleRevisionId> getRealModuleRevisionIds() {
            return this.realMrids;
        }

        public ModuleRevisionId getResolvedModule() {
            return this.mRevisionId;
        }

        public MetadataArtifactDownloadReport getMetadataArtifactReport(ModuleRevisionId moduleRevisionId) {
            return this.metadataReports.get(moduleRevisionId);
        }
    }

    public void parse(File file) throws ParseException {
        if (!file.exists()) {
            throw new IllegalStateException("Report file '" + file.getAbsolutePath() + "' does not exist.");
        }
        SaxXmlReportParser saxXmlReportParser = new SaxXmlReportParser(file);
        this.parser = saxXmlReportParser;
        try {
            saxXmlReportParser.parse();
        } catch (Exception e) {
            ParseException parseException = new ParseException("failed to parse report: " + file + ": " + e.getMessage(), 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public Artifact[] getArtifacts() {
        return (Artifact[]) this.parser.getArtifacts().toArray(new Artifact[this.parser.getArtifacts().size()]);
    }

    public ArtifactDownloadReport[] getArtifactReports() {
        return (ArtifactDownloadReport[]) this.parser.getArtifactReports().toArray(new ArtifactDownloadReport[this.parser.getArtifactReports().size()]);
    }

    public ModuleRevisionId[] getDependencyRevisionIds() {
        return (ModuleRevisionId[]) this.parser.getModuleRevisionIds().toArray(new ModuleRevisionId[this.parser.getModuleRevisionIds().size()]);
    }

    public ModuleRevisionId[] getRealDependencyRevisionIds() {
        return (ModuleRevisionId[]) this.parser.getRealModuleRevisionIds().toArray(new ModuleRevisionId[this.parser.getRealModuleRevisionIds().size()]);
    }

    public MetadataArtifactDownloadReport getMetadataArtifactReport(ModuleRevisionId moduleRevisionId) {
        return this.parser.getMetadataArtifactReport(moduleRevisionId);
    }

    public ModuleRevisionId getResolvedModule() {
        return this.parser.getResolvedModule();
    }

    public boolean hasError() {
        return this.parser.hasError;
    }
}
