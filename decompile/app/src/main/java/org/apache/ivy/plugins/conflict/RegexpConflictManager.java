package org.apache.ivy.plugins.conflict;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class RegexpConflictManager extends AbstractConflictManager {
    public boolean mIgnoreNonMatching;
    public Pattern pattern = Pattern.compile("(.*)");

    public void setRegexp(String str) {
        Pattern patternCompile = Pattern.compile(str);
        this.pattern = patternCompile;
        if (patternCompile.matcher("abcdef").groupCount() == 1) {
            return;
        }
        String str2 = "Pattern does not contain ONE (capturing group): '" + this.pattern + "'";
        Message.error(str2);
        throw new IllegalArgumentException(str2);
    }

    public void setIgnoreNonMatching(boolean z) {
        this.mIgnoreNonMatching = z;
    }

    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        IvyNode ivyNode2 = null;
        for (IvyNode ivyNode3 : collection) {
            if (ivyNode2 != null && !matchEquals(ivyNode3, ivyNode2)) {
                throw new StrictConflictException(ivyNode2 + StringUtils.PROCESS_POSTFIX_DELIMITER + getMatch(ivyNode2) + " (needed by " + Arrays.asList(ivyNode2.getAllRealCallers()) + ") conflicts with " + ivyNode3 + StringUtils.PROCESS_POSTFIX_DELIMITER + getMatch(ivyNode3) + " (needed by " + Arrays.asList(ivyNode3.getAllRealCallers()) + ")");
            }
            if (ivyNode2 == null || nodeIsGreater(ivyNode3, ivyNode2)) {
                ivyNode2 = ivyNode3;
            }
        }
        return Collections.singleton(ivyNode2);
    }

    public final boolean nodeIsGreater(IvyNode ivyNode, IvyNode ivyNode2) {
        return getMatch(ivyNode).compareTo(getMatch(ivyNode2)) > 0;
    }

    public final boolean matchEquals(IvyNode ivyNode, IvyNode ivyNode2) {
        return getMatch(ivyNode).equals(getMatch(ivyNode2));
    }

    public final String getMatch(IvyNode ivyNode) {
        String revision = ivyNode.getId().getRevision();
        Matcher matcher = this.pattern.matcher(revision);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                return strGroup;
            }
            warnOrThrow("First group of pattern: '" + this.pattern + "' does not match: " + revision + " " + ivyNode);
        } else {
            warnOrThrow("Pattern: '" + this.pattern + "' does not match: " + revision + " " + ivyNode);
        }
        return revision;
    }

    public final void warnOrThrow(String str) {
        if (this.mIgnoreNonMatching) {
            Message.warn(str);
            return;
        }
        throw new StrictConflictException(str);
    }
}
