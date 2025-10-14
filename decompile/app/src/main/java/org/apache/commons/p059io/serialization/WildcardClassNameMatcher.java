package org.apache.commons.p059io.serialization;

import org.apache.commons.p059io.FilenameUtils;

/* loaded from: classes5.dex */
public final class WildcardClassNameMatcher implements ClassNameMatcher {
    public final String pattern;

    public WildcardClassNameMatcher(String str) {
        this.pattern = str;
    }

    @Override // org.apache.commons.p059io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return FilenameUtils.wildcardMatch(str, this.pattern);
    }
}
