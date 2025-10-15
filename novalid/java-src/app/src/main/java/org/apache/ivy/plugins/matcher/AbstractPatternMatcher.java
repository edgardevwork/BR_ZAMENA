package org.apache.ivy.plugins.matcher;

/* loaded from: classes5.dex */
public abstract class AbstractPatternMatcher implements PatternMatcher {
    public final String name;

    public abstract Matcher newMatcher(String str);

    public AbstractPatternMatcher(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.plugins.matcher.PatternMatcher
    public Matcher getMatcher(String str) {
        str.getClass();
        if ("*".equals(str)) {
            return AnyMatcher.INSTANCE;
        }
        return newMatcher(str);
    }

    @Override // org.apache.ivy.plugins.matcher.PatternMatcher
    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }
}
