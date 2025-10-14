package org.apache.ivy.osgi.util;

import java.util.Comparator;

/* loaded from: classes6.dex */
public class VersionComparator implements Comparator<Version> {
    public static final Comparator<Version> ASCENDING = new VersionComparator(false);
    public static final Comparator<Version> DESCENDING = new VersionComparator(true);
    public final boolean reverse;

    public VersionComparator(boolean z) {
        this.reverse = z;
    }

    @Override // java.util.Comparator
    public int compare(Version version, Version version2) {
        int iCompareTo = version.compareTo(version2);
        return this.reverse ? -iCompareTo : iCompareTo;
    }
}
