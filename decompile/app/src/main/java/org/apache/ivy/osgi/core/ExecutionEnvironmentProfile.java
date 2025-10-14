package org.apache.ivy.osgi.core;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class ExecutionEnvironmentProfile {
    public final String name;
    public Set<String> pkgNames = new TreeSet();

    public ExecutionEnvironmentProfile(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getPkgNames() {
        return this.pkgNames;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Set<String> set = this.pkgNames;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExecutionEnvironmentProfile)) {
            return false;
        }
        ExecutionEnvironmentProfile executionEnvironmentProfile = (ExecutionEnvironmentProfile) obj;
        String str = this.name;
        if (str == null) {
            if (executionEnvironmentProfile.name != null) {
                return false;
            }
        } else if (!str.equals(executionEnvironmentProfile.name)) {
            return false;
        }
        Set<String> set = this.pkgNames;
        Set<String> set2 = executionEnvironmentProfile.pkgNames;
        return set == null ? set2 == null : set.equals(set2);
    }

    public String toString() {
        return this.name + StringUtils.PROCESS_POSTFIX_DELIMITER + this.pkgNames;
    }
}
