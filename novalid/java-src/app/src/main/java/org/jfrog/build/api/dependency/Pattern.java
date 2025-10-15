package org.jfrog.build.api.dependency;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class Pattern implements Serializable {
    public String pattern;

    public Pattern() {
    }

    public Pattern(String str) {
        this.pattern = str;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }
}
