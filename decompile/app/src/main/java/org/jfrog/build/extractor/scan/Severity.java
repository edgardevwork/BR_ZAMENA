package org.jfrog.build.extractor.scan;

/* loaded from: classes5.dex */
public enum Severity {
    Normal("Scanned - No Issues"),
    Pending("Pending Scan"),
    Unknown(License.UNKNOWN_LICENCE_NAME),
    Information("Information"),
    Low("Low"),
    Medium("Medium"),
    High("High"),
    Critical("Critical");

    public final String severityName;

    Severity(String str) {
        this.severityName = str;
    }

    public String getSeverityName() {
        return this.severityName;
    }

    public boolean isHigherThan(Severity severity) {
        return ordinal() > severity.ordinal();
    }

    public static Severity fromString(String str) {
        for (Severity severity : values()) {
            if (severity.getSeverityName().equals(str)) {
                return severity;
            }
        }
        throw new IllegalArgumentException("Severity " + str + " doesn't exist");
    }
}
