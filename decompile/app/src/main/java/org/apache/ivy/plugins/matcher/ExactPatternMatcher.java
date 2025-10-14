package org.apache.ivy.plugins.matcher;

/* loaded from: classes8.dex */
public final class ExactPatternMatcher extends AbstractPatternMatcher {
    public static final ExactPatternMatcher INSTANCE = new ExactPatternMatcher();

    public ExactPatternMatcher() {
        super(PatternMatcher.EXACT);
    }

    @Override // org.apache.ivy.plugins.matcher.AbstractPatternMatcher
    public Matcher newMatcher(String str) {
        return new ExactMatcher(str);
    }

    /* loaded from: classes5.dex */
    public static class ExactMatcher implements Matcher {
        public String expression;

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean isExact() {
            return true;
        }

        public ExactMatcher(String str) {
            this.expression = str;
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean matches(String str) {
            str.getClass();
            return str.equals(this.expression);
        }
    }
}
