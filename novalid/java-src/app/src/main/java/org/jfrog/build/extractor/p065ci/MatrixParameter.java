package org.jfrog.build.extractor.p065ci;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class MatrixParameter implements Serializable {
    public String key;
    public String value;

    public MatrixParameter() {
    }

    public MatrixParameter(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
