package org.jfrog.build.extractor.buildScanTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.artifactoryXrayResponse.Issue;
import org.jfrog.build.extractor.scan.Severity;

/* loaded from: classes8.dex */
public abstract class ScanTableBase {
    public final Log log;
    public int longestDisplayName = 0;
    public final Map<Severity, Set<TableElementBase>> table = new HashMap();

    public abstract String getEmptyTableLine();

    public abstract String[] getHeaders();

    public abstract String getHeadline();

    public abstract String getTableFormat();

    public ScanTableBase(Log log) {
        this.log = log;
    }

    public String getFormatBase(int i) {
        return "%-6s%-14s%-" + (i + 3) + "s";
    }

    public final void printFormattedLine(Object... objArr) {
        this.log.info(String.format(getTableFormat(), objArr));
    }

    public void addElement(Map<Severity, Set<TableElementBase>> map, Issue issue, TableElementBase tableElementBase) {
        Severity severityFromString = Severity.fromString(issue.getSeverity());
        Set<TableElementBase> hashSet = map.get(severityFromString);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(tableElementBase);
        map.put(severityFromString, hashSet);
    }

    public void printTable(Map<Severity, Set<TableElementBase>> map) {
        Severity[] severityArrValues = Severity.values();
        this.log.info(getHeadline());
        if (map.isEmpty()) {
            this.log.info(getEmptyTableLine());
            this.log.info("");
            return;
        }
        printFormattedLine(getHeaders());
        int i = 1;
        for (int length = severityArrValues.length - 1; length >= 0; length--) {
            Severity severity = severityArrValues[length];
            Set<TableElementBase> set = map.get(severity);
            if (set != null) {
                Iterator<TableElementBase> it = set.iterator();
                while (it.hasNext()) {
                    printFormattedLine(it.next().getLineArgs(i, severity.getSeverityName()));
                    i++;
                }
            }
        }
        this.log.info("");
    }

    public static abstract class TableElementBase {
        public final String fileDisplayName;
        public final String fileSha256;
        public final String issueDescription;
        public final String issueSummary;

        public abstract Object[] getLineArgs(int i, String str);

        public TableElementBase(String str, String str2, String str3, String str4) {
            this.fileDisplayName = str;
            this.fileSha256 = str2;
            this.issueSummary = str3;
            this.issueDescription = str4;
        }

        public String getFileDisplayName() {
            String str = this.fileDisplayName;
            return str == null ? "" : str;
        }
    }
}
