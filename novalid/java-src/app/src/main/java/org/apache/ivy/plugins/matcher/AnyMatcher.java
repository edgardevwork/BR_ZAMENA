package org.apache.ivy.plugins.matcher;

/* loaded from: classes5.dex */
public class AnyMatcher implements Matcher {
    public static final Matcher INSTANCE = new AnyMatcher();

    @Override // org.apache.ivy.plugins.matcher.Matcher
    public boolean isExact() {
        return false;
    }

    @Override // org.apache.ivy.plugins.matcher.Matcher
    public boolean matches(String str) {
        str.getClass();
        return true;
    }
}
