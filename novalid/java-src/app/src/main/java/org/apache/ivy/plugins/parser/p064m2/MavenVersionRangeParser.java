package org.apache.ivy.plugins.parser.p064m2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/* loaded from: classes6.dex */
public class MavenVersionRangeParser {
    public static final DeweyDecimal javaVersion;

    public interface Range {
        boolean accepts(DeweyDecimal deweyDecimal);
    }

    static {
        DeweyDecimal deweyDecimal;
        try {
            deweyDecimal = new DeweyDecimal(System.getProperty("java.specification.version"));
        } catch (Exception unused) {
            deweyDecimal = null;
        }
        javaVersion = deweyDecimal;
    }

    public static boolean currentJavaVersionInRange(String str) {
        DeweyDecimal deweyDecimal;
        Range range;
        return (str == null || (deweyDecimal = javaVersion) == null || (range = parse(str)) == null || !range.accepts(deweyDecimal)) ? false : true;
    }

    public static boolean rangeAccepts(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        try {
            DeweyDecimal deweyDecimal = new DeweyDecimal(str2);
            Range range = parse(str);
            return range != null && range.accepts(deweyDecimal);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static Range parse(String str) {
        String str2;
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(",");
            int i = 0;
            if (strArrSplit.length == 1) {
                String strStripBoundChars = stripBoundChars(strArrSplit[0].trim());
                if (strStripBoundChars.isEmpty()) {
                    return null;
                }
                DeweyDecimal deweyDecimal = new DeweyDecimal(strStripBoundChars);
                return new BasicRange(deweyDecimal, !r13.startsWith("("), deweyDecimal, !r13.endsWith(")"));
            }
            if (strArrSplit.length == 2) {
                String strStripBoundChars2 = stripBoundChars(strArrSplit[0].trim());
                DeweyDecimal deweyDecimal2 = strStripBoundChars2.isEmpty() ? null : new DeweyDecimal(strStripBoundChars2);
                String strStripBoundChars3 = stripBoundChars(strArrSplit[1].trim());
                return new BasicRange(deweyDecimal2, !r0.startsWith("("), strStripBoundChars3.isEmpty() ? null : new DeweyDecimal(strStripBoundChars3), !r13.endsWith(")"));
            }
            if (strArrSplit.length <= 2) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (i < strArrSplit.length) {
                String str3 = strArrSplit[i];
                int i2 = i + 1;
                if (i2 < strArrSplit.length) {
                    str2 = strArrSplit[i2];
                } else {
                    str2 = "";
                }
                Range range = parse(str3 + "," + str2);
                if (range != null) {
                    arrayList.add(range);
                }
                i += 2;
                if (i >= strArrSplit.length) {
                    i = i2;
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new MultiSetRange(arrayList);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String stripBoundChars(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("(", "").replace(")", "").replace("[", "").replace("]", "");
    }

    /* loaded from: classes5.dex */
    public static final class BasicRange implements Range {
        public final DeweyDecimal lowerBound;
        public final boolean lowerInclusive;
        public final DeweyDecimal upperBound;
        public final boolean upperInclusive;

        public BasicRange(DeweyDecimal deweyDecimal, boolean z, DeweyDecimal deweyDecimal2, boolean z2) {
            this.lowerBound = deweyDecimal;
            this.lowerInclusive = z;
            this.upperBound = deweyDecimal2;
            this.upperInclusive = z2;
        }

        @Override // org.apache.ivy.plugins.parser.m2.MavenVersionRangeParser.Range
        public boolean accepts(DeweyDecimal deweyDecimal) {
            DeweyDecimal deweyDecimal2;
            DeweyDecimal deweyDecimal3;
            return deweyDecimal != null && ((deweyDecimal2 = this.lowerBound) == null || (!this.lowerInclusive ? !deweyDecimal.isGreaterThan(deweyDecimal2) : !deweyDecimal.isGreaterThanOrEqual(deweyDecimal2))) && ((deweyDecimal3 = this.upperBound) == null || (!this.upperInclusive ? !deweyDecimal.isLessThan(deweyDecimal3) : !deweyDecimal.isLessThanOrEqual(deweyDecimal3)));
        }
    }

    /* loaded from: classes5.dex */
    public static final class MultiSetRange implements Range {
        public final Collection<Range> ranges;

        public MultiSetRange(Collection<Range> collection) {
            this.ranges = collection == null ? Collections.emptySet() : collection;
        }

        @Override // org.apache.ivy.plugins.parser.m2.MavenVersionRangeParser.Range
        public boolean accepts(DeweyDecimal deweyDecimal) {
            if (this.ranges.isEmpty()) {
                return false;
            }
            for (Range range : this.ranges) {
                if (range != null && range.accepts(deweyDecimal)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class DeweyDecimal {
        public final int[] components;

        public DeweyDecimal(int[] iArr) {
            int[] iArr2 = new int[iArr.length];
            this.components = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }

        public DeweyDecimal(String str) throws NumberFormatException {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".", true);
            this.components = new int[(stringTokenizer.countTokens() + 1) / 2];
            for (int i = 0; i < this.components.length; i++) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.length() == 0) {
                    throw new NumberFormatException("Empty component in string");
                }
                this.components[i] = Integer.parseInt(strNextToken);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                    if (!stringTokenizer.hasMoreTokens()) {
                        throw new NumberFormatException("DeweyDecimal ended in a '.'");
                    }
                }
            }
        }

        public int getSize() {
            return this.components.length;
        }

        public int get(int i) {
            return this.components[i];
        }

        public boolean isEqual(DeweyDecimal deweyDecimal) {
            int iMax = Math.max(deweyDecimal.components.length, this.components.length);
            int i = 0;
            while (i < iMax) {
                int[] iArr = this.components;
                int i2 = i < iArr.length ? iArr[i] : 0;
                int[] iArr2 = deweyDecimal.components;
                if ((i < iArr2.length ? iArr2[i] : 0) != i2) {
                    return false;
                }
                i++;
            }
            return true;
        }

        public boolean isLessThan(DeweyDecimal deweyDecimal) {
            return !isGreaterThanOrEqual(deweyDecimal);
        }

        public boolean isLessThanOrEqual(DeweyDecimal deweyDecimal) {
            return !isGreaterThan(deweyDecimal);
        }

        public boolean isGreaterThan(DeweyDecimal deweyDecimal) {
            int iMax = Math.max(deweyDecimal.components.length, this.components.length);
            int i = 0;
            while (i < iMax) {
                int[] iArr = this.components;
                int i2 = i < iArr.length ? iArr[i] : 0;
                int[] iArr2 = deweyDecimal.components;
                int i3 = i < iArr2.length ? iArr2[i] : 0;
                if (i3 > i2) {
                    return false;
                }
                if (i3 < i2) {
                    return true;
                }
                i++;
            }
            return false;
        }

        public boolean isGreaterThanOrEqual(DeweyDecimal deweyDecimal) {
            int iMax = Math.max(deweyDecimal.components.length, this.components.length);
            int i = 0;
            while (i < iMax) {
                int[] iArr = this.components;
                int i2 = i < iArr.length ? iArr[i] : 0;
                int[] iArr2 = deweyDecimal.components;
                int i3 = i < iArr2.length ? iArr2[i] : 0;
                if (i3 > i2) {
                    return false;
                }
                if (i3 < i2) {
                    return true;
                }
                i++;
            }
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i : this.components) {
                if (sb.length() > 0) {
                    sb.append('.');
                }
                sb.append(i);
            }
            return sb.toString();
        }

        public int compareTo(DeweyDecimal deweyDecimal) {
            int iMax = Math.max(deweyDecimal.components.length, this.components.length);
            int i = 0;
            while (i < iMax) {
                int[] iArr = this.components;
                int i2 = i < iArr.length ? iArr[i] : 0;
                int[] iArr2 = deweyDecimal.components;
                int i3 = i < iArr2.length ? iArr2[i] : 0;
                if (i2 != i3) {
                    return i2 - i3;
                }
                i++;
            }
            return 0;
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof DeweyDecimal) && isEqual((DeweyDecimal) obj);
        }
    }
}
