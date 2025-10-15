package org.apache.ivy.plugins.matcher;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes8.dex */
public final class RegexpPatternMatcher extends AbstractPatternMatcher {
    public static final RegexpPatternMatcher INSTANCE = new RegexpPatternMatcher();

    public RegexpPatternMatcher() {
        super(PatternMatcher.REGEXP);
    }

    @Override // org.apache.ivy.plugins.matcher.AbstractPatternMatcher
    public Matcher newMatcher(String str) {
        return new RegexpMatcher(str);
    }

    /* loaded from: classes5.dex */
    public static class RegexpMatcher implements Matcher {
        public Boolean exact;
        public String expression;
        public Pattern pattern;

        public RegexpMatcher(String str) throws PatternSyntaxException {
            str.getClass();
            this.expression = str;
            this.pattern = Pattern.compile(str);
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean matches(String str) {
            str.getClass();
            return this.pattern.matcher(str).matches();
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean isExact() {
            if (this.exact == null) {
                this.exact = calculateExact();
            }
            return this.exact.booleanValue();
        }

        private Boolean calculateExact() {
            Boolean bool = Boolean.TRUE;
            for (char c : this.expression.toCharArray()) {
                if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && '-' != c && '_' != c) {
                    return Boolean.FALSE;
                }
            }
            return bool;
        }
    }
}
