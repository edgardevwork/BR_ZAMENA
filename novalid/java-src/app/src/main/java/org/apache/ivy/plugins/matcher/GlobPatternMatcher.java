package org.apache.ivy.plugins.matcher;

import java.util.regex.PatternSyntaxException;
import org.apache.oro.text.GlobCompiler;
import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.Perl5Matcher;

/* loaded from: classes8.dex */
public final class GlobPatternMatcher extends AbstractPatternMatcher {
    public static final GlobPatternMatcher INSTANCE = new GlobPatternMatcher();

    public GlobPatternMatcher() {
        super(PatternMatcher.GLOB);
    }

    @Override // org.apache.ivy.plugins.matcher.AbstractPatternMatcher
    public Matcher newMatcher(String str) {
        return new GlobMatcher(str);
    }

    /* loaded from: classes5.dex */
    public static class GlobMatcher implements Matcher {
        public Boolean exact;
        public String expression;
        public Pattern pattern;

        public GlobMatcher(String str) throws PatternSyntaxException {
            this.expression = str;
            try {
                this.pattern = new GlobCompiler().compile(str);
            } catch (MalformedPatternException e) {
                throw new PatternSyntaxException(e.getMessage(), str, 0);
            }
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean matches(String str) {
            str.getClass();
            return new Perl5Matcher().matches(str, this.pattern);
        }

        @Override // org.apache.ivy.plugins.matcher.Matcher
        public boolean isExact() {
            if (this.exact == null) {
                this.exact = calculateExact();
            }
            return this.exact.booleanValue();
        }

        public final Boolean calculateExact() {
            Boolean bool = Boolean.TRUE;
            for (char c : this.expression.toCharArray()) {
                if (c == '*' || c == '?' || c == '[' || c == ']') {
                    return Boolean.FALSE;
                }
            }
            return bool;
        }
    }
}
