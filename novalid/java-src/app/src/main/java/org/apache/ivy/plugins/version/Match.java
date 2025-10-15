package org.apache.ivy.plugins.version;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.matcher.Matcher;

/* loaded from: classes6.dex */
public class Match {
    public String args;
    public String matcher;
    public String pattern;
    public String revision;

    public String getArgs() {
        return this.args;
    }

    public void setArgs(String str) {
        this.args = str;
    }

    public String getMatcher() {
        return this.matcher;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public Matcher getPatternMatcher(ModuleRevisionId moduleRevisionId) {
        String revision = moduleRevisionId.getRevision();
        List<String> listSplit = split(getArgs());
        List<String> revisionArgs = getRevisionArgs(revision);
        if (listSplit.size() != revisionArgs.size()) {
            return new NoMatchMatcher();
        }
        HashMap map = new HashMap();
        for (String str : listSplit) {
            map.put(str, revisionArgs.get(listSplit.indexOf(str)));
        }
        return IvyContext.getContext().getSettings().getMatcher(this.matcher).getMatcher(IvyPatternHelper.substituteVariables(getPattern(), map));
    }

    public final List<String> getRevisionArgs(String str) {
        int iIndexOf = str.indexOf(40);
        if (iIndexOf == -1) {
            return Collections.emptyList();
        }
        int iIndexOf2 = str.indexOf(41);
        int i = iIndexOf + 1;
        if (iIndexOf2 <= i) {
            return Collections.emptyList();
        }
        return split(str.substring(i, iIndexOf2));
    }

    public static List<String> split(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        LinkedList linkedList = new LinkedList();
        while (stringTokenizer.hasMoreTokens()) {
            linkedList.add(stringTokenizer.nextToken());
        }
        return linkedList;
    }

    /* loaded from: classes5.dex */
    public static class NoMatchMatcher implements Matcher {
        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean isExact() {
            return false;
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean matches(String str) {
            return false;
        }

        public NoMatchMatcher() {
        }
    }
}
