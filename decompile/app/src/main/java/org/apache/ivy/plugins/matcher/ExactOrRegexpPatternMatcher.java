package org.apache.ivy.plugins.matcher;

/* loaded from: classes8.dex */
public final class ExactOrRegexpPatternMatcher extends AbstractPatternMatcher {
    public static final ExactOrRegexpPatternMatcher INSTANCE = new ExactOrRegexpPatternMatcher();

    public ExactOrRegexpPatternMatcher() {
        super(PatternMatcher.EXACT_OR_REGEXP);
    }

    @Override // org.apache.ivy.plugins.matcher.AbstractPatternMatcher
    public Matcher newMatcher(String str) {
        return new ExactOrRegexpMatcher(str);
    }

    /* loaded from: classes5.dex */
    public static final class ExactOrRegexpMatcher implements Matcher {
        public Matcher exact;
        public Matcher regexp;

        public ExactOrRegexpMatcher(String str) {
            this.exact = ExactPatternMatcher.INSTANCE.getMatcher(str);
            this.regexp = RegexpPatternMatcher.INSTANCE.getMatcher(str);
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean matches(String str) {
            str.getClass();
            return this.exact.matches(str) || this.regexp.matches(str);
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean isExact() {
            return this.regexp.isExact();
        }
    }
}
