package com.fasterxml.jackson.core;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class Version implements Comparable<Version>, Serializable {
    public static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null, null, null);
    public static final long serialVersionUID = 1;
    public final String _artifactId;
    public final String _groupId;
    public final int _majorVersion;
    public final int _minorVersion;
    public final int _patchLevel;
    public final String _snapshotInfo;

    @Deprecated
    public Version(int i, int i2, int i3, String str) {
        this(i, i2, i3, str, null, null);
    }

    public Version(int i, int i2, int i3, String str, String str2, String str3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? "" : str2;
        this._artifactId = str3 == null ? "" : str3;
    }

    public static Version unknownVersion() {
        return UNKNOWN_VERSION;
    }

    public boolean isUnknownVersion() {
        return this == UNKNOWN_VERSION;
    }

    public boolean isSnapshot() {
        String str = this._snapshotInfo;
        return str != null && str.length() > 0;
    }

    @Deprecated
    public boolean isUknownVersion() {
        return isUnknownVersion();
    }

    public int getMajorVersion() {
        return this._majorVersion;
    }

    public int getMinorVersion() {
        return this._minorVersion;
    }

    public int getPatchLevel() {
        return this._patchLevel;
    }

    public String getGroupId() {
        return this._groupId;
    }

    public String getArtifactId() {
        return this._artifactId;
    }

    public String toFullString() {
        return this._groupId + '/' + this._artifactId + '/' + toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._majorVersion);
        sb.append('.');
        sb.append(this._minorVersion);
        sb.append('.');
        sb.append(this._patchLevel);
        if (isSnapshot()) {
            sb.append('-');
            sb.append(this._snapshotInfo);
        }
        return sb.toString();
    }

    public int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return version._majorVersion == this._majorVersion && version._minorVersion == this._minorVersion && version._patchLevel == this._patchLevel && version._artifactId.equals(this._artifactId) && version._groupId.equals(this._groupId);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int iCompareTo = this._groupId.compareTo(version._groupId);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this._artifactId.compareTo(version._artifactId);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int i = this._majorVersion - version._majorVersion;
        if (i != 0) {
            return i;
        }
        int i2 = this._minorVersion - version._minorVersion;
        return i2 == 0 ? this._patchLevel - version._patchLevel : i2;
    }
}
