package org.jfrog.build.extractor.buildScanTable;

import java.util.Objects;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.artifactoryXrayResponse.InfectedFile;
import org.jfrog.build.client.artifactoryXrayResponse.Issue;
import org.jfrog.build.extractor.buildScanTable.ScanTableBase;

/* loaded from: classes5.dex */
public class LicenseViolationsTable extends ScanTableBase {
    public static final String LICENSE_VIOLATIONS_TABLE_HEADLINE = "License Compliance Violations";

    public LicenseViolationsTable(Log log) {
        super(log);
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getHeadline() {
        return LICENSE_VIOLATIONS_TABLE_HEADLINE;
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String[] getHeaders() {
        return new String[]{"#", "Severity", "Component"};
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getTableFormat() {
        return super.getFormatBase(this.longestDisplayName);
    }

    @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase
    public String getEmptyTableLine() {
        return "No license compliance violations were found";
    }

    public void addElement(Issue issue, InfectedFile infectedFile) {
        super.addElement(this.table, issue, new LicenseTableElement(infectedFile.getDisplayName(), infectedFile.getSha256(), issue.getSummary(), issue.getDescription()));
        if (infectedFile.getDisplayName() == null || infectedFile.getDisplayName().length() <= this.longestDisplayName) {
            return;
        }
        this.longestDisplayName = infectedFile.getDisplayName().length();
    }

    public void printTable() {
        super.printTable(this.table);
    }

    public static class LicenseTableElement extends ScanTableBase.TableElementBase {
        public LicenseTableElement(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        @Override // org.jfrog.build.extractor.buildScanTable.ScanTableBase.TableElementBase
        public Object[] getLineArgs(int i, String str) {
            return new Object[]{Integer.valueOf(i), str, getFileDisplayName()};
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LicenseTableElement licenseTableElement = (LicenseTableElement) obj;
            return Objects.equals(this.fileDisplayName, licenseTableElement.fileDisplayName) && Objects.equals(this.fileSha256, licenseTableElement.fileSha256) && Objects.equals(this.issueSummary, licenseTableElement.issueSummary) && Objects.equals(this.issueDescription, licenseTableElement.issueDescription);
        }

        public int hashCode() {
            return Objects.hash(this.fileDisplayName, this.fileSha256, this.issueSummary, this.issueDescription);
        }
    }
}
