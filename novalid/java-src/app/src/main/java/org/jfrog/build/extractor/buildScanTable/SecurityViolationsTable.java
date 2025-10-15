package org.jfrog.build.extractor.buildScanTable;

import java.util.Objects;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.artifactoryXrayResponse.InfectedFile;
import org.jfrog.build.client.artifactoryXrayResponse.Issue;
import org.jfrog.build.extractor.buildScanTable.ScanTableBase;

/* loaded from: classes5.dex */
public class SecurityViolationsTable extends ScanTableBase {
    public static final String SECURITY_VIOLATIONS_TABLE_HEADLINE = "Security Violations";

    public SecurityViolationsTable(Log log) {
        super(log);
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getHeadline() {
        return SECURITY_VIOLATIONS_TABLE_HEADLINE;
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String[] getHeaders() {
        return new String[]{"#", "Severity", "Component", "CVE"};
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getTableFormat() {
        return super.getFormatBase(this.longestDisplayName) + "%-20s";
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getEmptyTableLine() {
        return "No security compliance violations were found";
    }

    public void addElement(Issue issue, InfectedFile infectedFile) {
        super.addElement(this.table, issue, new SecurityTableElement(infectedFile.getDisplayName(), infectedFile.getSha256(), issue.getSummary(), issue.getDescription(), issue.getCve()));
        if (infectedFile.getDisplayName() == null || infectedFile.getDisplayName().length() <= this.longestDisplayName) {
            return;
        }
        this.longestDisplayName = infectedFile.getDisplayName().length();
    }

    public void printTable() {
        super.printTable(this.table);
    }

    public static class SecurityTableElement extends ScanTableBase.TableElementBase {
        public final String cve;

        public SecurityTableElement(String str, String str2, String str3, String str4, String str5) {
            super(str, str2, str3, str4);
            this.cve = str5;
        }

        public final String getCve() {
            String str = this.cve;
            return str == null ? "" : str;
        }

        @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase.TableElementBase
        public Object[] getLineArgs(int i, String str) {
            return new Object[]{Integer.valueOf(i), str, getFileDisplayName(), getCve()};
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SecurityTableElement securityTableElement = (SecurityTableElement) obj;
            return Objects.equals(this.fileDisplayName, securityTableElement.fileDisplayName) && Objects.equals(this.fileSha256, securityTableElement.fileSha256) && Objects.equals(this.issueSummary, securityTableElement.issueSummary) && Objects.equals(this.issueDescription, securityTableElement.issueDescription) && Objects.equals(this.cve, securityTableElement.cve);
        }

        public int hashCode() {
            return Objects.hash(this.fileDisplayName, this.fileSha256, this.issueSummary, this.issueDescription, this.cve);
        }
    }
}
