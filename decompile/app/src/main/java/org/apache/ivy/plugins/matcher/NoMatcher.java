package org.apache.ivy.plugins.matcher;

/* loaded from: classes5.dex */
public final class NoMatcher implements Matcher {
    public static final Matcher INSTANCE = new NoMatcher();

    @Override // org.apache.ivy.plugins.matcher.Matcher
    public boolean isExact() {
        return true;
    }

    @Override // org.apache.ivy.plugins.matcher.Matcher
    public boolean matches(String str) {
        str.getClass();
        return false;
    }
}
