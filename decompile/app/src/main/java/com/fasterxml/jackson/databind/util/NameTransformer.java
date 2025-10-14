package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    /* loaded from: classes6.dex */
    public static final class NopTransformer extends NameTransformer implements Serializable {
        public static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = false;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public String transform(String str3) {
                        return str + str3 + str2;
                    }

                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public String reverse(String str3) {
                        if (!str3.startsWith(str)) {
                            return null;
                        }
                        String strSubstring = str3.substring(str.length());
                        if (strSubstring.endsWith(str2)) {
                            return strSubstring.substring(0, strSubstring.length() - str2.length());
                        }
                        return null;
                    }

                    public String toString() {
                        return "[PreAndSuffixTransformer('" + str + "','" + str2 + "')]";
                    }
                };
            }
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str3) {
                    return str + str3;
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String reverse(String str3) {
                    if (str3.startsWith(str)) {
                        return str3.substring(str.length());
                    }
                    return null;
                }

                public String toString() {
                    return "[PrefixTransformer('" + str + "')]";
                }
            };
        }
        if (z) {
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str3) {
                    return str3 + str2;
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String reverse(String str3) {
                    if (str3.endsWith(str2)) {
                        return str3.substring(0, str3.length() - str2.length());
                    }
                    return null;
                }

                public String toString() {
                    return "[SuffixTransformer('" + str2 + "')]";
                }
            };
        }
        return NOP;
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    /* loaded from: classes6.dex */
    public static class Chained extends NameTransformer implements Serializable {
        public static final long serialVersionUID = 1;
        public final NameTransformer _t1;
        public final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            return strReverse != null ? this._t2.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }
    }
}
