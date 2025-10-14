package org.apache.ivy.osgi.util;

import java.text.ParseException;

/* loaded from: classes6.dex */
public class Version implements Comparable<Version> {
    public String input;
    public int major;
    public int minor;
    public int patch;
    public String qualifier;
    public volatile boolean split;
    public volatile boolean toString;
    public String version;

    /* JADX WARN: Illegal instructions before constructor call */
    public Version(String str, String str2) {
        if (str2 != null) {
            str = str + "." + str2;
        }
        this(str);
    }

    public Version(String str) {
        this.split = false;
        this.toString = false;
        this.input = str;
        this.split = false;
        this.toString = false;
    }

    public Version(int i, int i2, int i3, String str) {
        this.split = false;
        this.toString = false;
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.qualifier = str;
        this.split = true;
        this.toString = false;
    }

    public Version(Version version, String str) {
        this.split = false;
        this.toString = false;
        this.major = version.major;
        this.minor = version.minor;
        this.patch = version.patch;
        if (version.qualifier != null) {
            str = version.qualifier + str;
        }
        this.qualifier = str;
        this.split = true;
        this.toString = false;
    }

    public final void ensureSplit() {
        if (this.split) {
            return;
        }
        synchronized (this) {
            try {
                if (this.split) {
                    return;
                }
                String[] strArrSplit = this.input.split("\\.");
                if (strArrSplit == null || strArrSplit.length == 0 || strArrSplit.length > 4) {
                    throw new RuntimeException(new ParseException("Ill-formed OSGi version", 0));
                }
                try {
                    this.major = Integer.parseInt(strArrSplit[0]);
                    try {
                        this.minor = strArrSplit.length >= 2 ? Integer.parseInt(strArrSplit[1]) : 0;
                        try {
                            this.patch = strArrSplit.length >= 3 ? Integer.parseInt(strArrSplit[2]) : 0;
                            this.qualifier = strArrSplit.length == 4 ? strArrSplit[3] : null;
                            this.split = true;
                        } catch (NumberFormatException unused) {
                            throw new RuntimeException(new ParseException("Patch part of an OSGi version should be an integer", 0));
                        }
                    } catch (NumberFormatException unused2) {
                        throw new RuntimeException(new ParseException("Minor part of an OSGi version should be an integer", 0));
                    }
                } catch (NumberFormatException unused3) {
                    throw new RuntimeException(new ParseException("Major part of an OSGi version should be an integer", 0));
                }
            } finally {
            }
        }
    }

    public final void ensureToString() {
        String str;
        if (this.toString) {
            return;
        }
        synchronized (this) {
            try {
                if (this.toString) {
                    return;
                }
                ensureSplit();
                StringBuilder sb = new StringBuilder();
                sb.append(this.major);
                sb.append(".");
                sb.append(this.minor);
                sb.append(".");
                sb.append(this.patch);
                if (this.qualifier == null) {
                    str = "";
                } else {
                    str = "." + this.qualifier;
                }
                sb.append(str);
                this.version = sb.toString();
                this.toString = true;
            } finally {
            }
        }
    }

    public String toString() {
        ensureToString();
        return this.version;
    }

    public int hashCode() {
        ensureSplit();
        int i = (((((this.major + 31) * 31) + this.minor) * 31) + this.patch) * 31;
        String str = this.qualifier;
        return i + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        ensureSplit();
        version.ensureSplit();
        if (this.major == version.major && this.minor == version.minor && this.patch == version.patch) {
            String str = this.qualifier;
            String str2 = version.qualifier;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public Version withNudgedPatch() {
        ensureSplit();
        return new Version(this.major, this.minor, this.patch + 1, null);
    }

    public Version withoutQualifier() {
        ensureSplit();
        return new Version(this.major, this.minor, this.patch, null);
    }

    public String qualifier() {
        ensureSplit();
        String str = this.qualifier;
        return str == null ? "" : str;
    }

    public int compareUnqualified(Version version) {
        ensureSplit();
        version.ensureSplit();
        int i = this.major - version.major;
        if (i != 0) {
            return i;
        }
        int i2 = this.minor - version.minor;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.patch - version.patch;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        ensureSplit();
        version.ensureSplit();
        int iCompareUnqualified = compareUnqualified(version);
        if (iCompareUnqualified != 0) {
            return iCompareUnqualified;
        }
        String str = this.qualifier;
        if (str == null) {
            return version.qualifier != null ? -1 : 0;
        }
        String str2 = version.qualifier;
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
