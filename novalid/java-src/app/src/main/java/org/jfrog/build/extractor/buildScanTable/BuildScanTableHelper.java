package org.jfrog.build.extractor.buildScanTable;

import java.util.Iterator;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.artifactoryXrayResponse.Alert;
import org.jfrog.build.client.artifactoryXrayResponse.ArtifactoryXrayResponse;
import org.jfrog.build.client.artifactoryXrayResponse.ImpactedArtifact;
import org.jfrog.build.client.artifactoryXrayResponse.InfectedFile;
import org.jfrog.build.client.artifactoryXrayResponse.Issue;

/* loaded from: classes8.dex */
public class BuildScanTableHelper {
    public LicenseViolationsTable licenseViolationsTable;
    public Log log;
    public ArtifactoryXrayResponse scanResult;
    public SecurityViolationsTable securityViolationsTable;

    public void printTable(ArtifactoryXrayResponse artifactoryXrayResponse, Log log) {
        this.scanResult = artifactoryXrayResponse;
        this.log = log;
        this.securityViolationsTable = new SecurityViolationsTable(log);
        this.licenseViolationsTable = new LicenseViolationsTable(log);
        generateResultTable();
        doPrintTables();
    }

    public final void doPrintTables() {
        this.securityViolationsTable.printTable();
        this.log.info("");
        this.licenseViolationsTable.printTable();
    }

    public final void generateResultTable() {
        Iterator it = CommonUtils.emptyIfNull(this.scanResult.getAlerts()).iterator();
        while (it.hasNext()) {
            for (Issue issue : CommonUtils.emptyIfNull(((Alert) it.next()).getIssues())) {
                Iterator it2 = CommonUtils.emptyIfNull(issue.getImpactedArtifacts()).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = CommonUtils.emptyIfNull(((ImpactedArtifact) it2.next()).getInfectedFiles()).iterator();
                    while (it3.hasNext()) {
                        addElement(issue, (InfectedFile) it3.next());
                    }
                }
            }
        }
    }

    public final void addElement(Issue issue, InfectedFile infectedFile) {
        Issue.IssueType issueType = issue.getIssueType();
        if (issueType == Issue.IssueType.SECURITY) {
            this.securityViolationsTable.addElement(issue, infectedFile);
        } else if (issueType == Issue.IssueType.LICENSE) {
            this.licenseViolationsTable.addElement(issue, infectedFile);
        }
    }
}
