package org.apache.commons.codec.language.p055bm;

import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes5.dex */
public enum RuleType {
    APPROX("approx"),
    EXACT(PatternMatcher.EXACT),
    RULES("rules");

    public final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
