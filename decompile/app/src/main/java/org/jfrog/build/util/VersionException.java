package org.jfrog.build.util;

/* loaded from: classes5.dex */
public class VersionException extends Exception {
    public VersionCompatibilityType versionCompatibilityType;

    public VersionException(String str, VersionCompatibilityType versionCompatibilityType) {
        super(str);
        this.versionCompatibilityType = versionCompatibilityType;
    }

    public VersionException(String str, Throwable th, VersionCompatibilityType versionCompatibilityType) {
        super(str, th);
        this.versionCompatibilityType = versionCompatibilityType;
    }

    public VersionCompatibilityType getVersionCompatibilityType() {
        return this.versionCompatibilityType;
    }
}
