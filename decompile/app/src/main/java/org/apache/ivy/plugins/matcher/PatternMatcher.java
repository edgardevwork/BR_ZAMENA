package org.apache.ivy.plugins.matcher;

/* loaded from: classes6.dex */
public interface PatternMatcher {
    public static final String ANY_EXPRESSION = "*";
    public static final String EXACT = "exact";
    public static final String EXACT_OR_REGEXP = "exactOrRegexp";
    public static final String GLOB = "glob";
    public static final String REGEXP = "regexp";

    Matcher getMatcher(String str);

    String getName();
}
