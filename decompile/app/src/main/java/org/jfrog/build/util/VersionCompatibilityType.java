package org.jfrog.build.util;

/* loaded from: classes5.dex */
public enum VersionCompatibilityType {
    NOT_FOUND("Not Found"),
    INCOMPATIBLE("Incompatible");

    public String type;

    VersionCompatibilityType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
