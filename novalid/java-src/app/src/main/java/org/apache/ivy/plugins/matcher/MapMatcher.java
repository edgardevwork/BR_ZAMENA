package org.apache.ivy.plugins.matcher;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MapMatcher {
    public Map<String, String> attributes;
    public Map<String, Matcher> matchers = new HashMap();

    /* renamed from: pm */
    public PatternMatcher f9995pm;

    public MapMatcher(Map<String, String> map, PatternMatcher patternMatcher) {
        this.attributes = map;
        this.f9995pm = patternMatcher;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value != null) {
                this.matchers.put(entry.getKey(), patternMatcher.getMatcher(value));
            }
        }
    }

    public boolean matches(Map<String, String> map) {
        for (Map.Entry<String, Matcher> entry : this.matchers.entrySet()) {
            Matcher value = entry.getValue();
            String str = map.get(entry.getKey());
            if (str == null || !value.matches(str)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.attributes + " (" + this.f9995pm.getName() + ")";
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public PatternMatcher getPatternMatcher() {
        return this.f9995pm;
    }
}
