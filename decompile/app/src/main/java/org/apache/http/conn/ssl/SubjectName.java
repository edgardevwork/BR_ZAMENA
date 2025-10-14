package org.apache.http.conn.ssl;

import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class SubjectName {
    public static final int DNS = 2;

    /* renamed from: IP */
    public static final int f9924IP = 7;
    public final int type;
    public final String value;

    /* renamed from: IP */
    public static SubjectName m7376IP(String str) {
        return new SubjectName(str, 7);
    }

    public static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    public SubjectName(String str, int i) {
        this.value = (String) Args.notNull(str, "Value");
        this.type = Args.positive(i, "Type");
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
