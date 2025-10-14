package org.apache.ivy.osgi.filter;

import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes7.dex */
public class CompareFilter extends OSGiFilter {
    public final String leftValue;
    public Operator operator;
    public final String rightValue;
    public boolean substring;

    /* loaded from: classes5.dex */
    public enum Operator {
        EQUALS(URLEncodedUtils.NAME_VALUE_SEPARATOR),
        LOWER_THAN("<"),
        LOWER_OR_EQUAL("<="),
        GREATER_THAN(">"),
        GREATER_OR_EQUAL(">="),
        APPROX("~="),
        PRESENT("=*");


        /* renamed from: op */
        public String f9973op;

        Operator(String str) {
            this.f9973op = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9973op;
        }
    }

    public CompareFilter(String str, Operator operator, String str2) {
        this.leftValue = str;
        this.rightValue = str2;
        this.operator = operator;
        this.substring = operator == Operator.EQUALS && str2.contains("*");
    }

    public String getLeftValue() {
        return this.leftValue;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public String getRightValue() {
        return this.rightValue;
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public void append(StringBuffer stringBuffer) {
        stringBuffer.append("(");
        stringBuffer.append(this.leftValue);
        stringBuffer.append(this.operator.toString());
        stringBuffer.append(this.rightValue);
        stringBuffer.append(")");
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public boolean eval(Map<String, String> map) {
        String str = map.get(this.leftValue);
        if (str == null) {
            return false;
        }
        Operator operator = this.operator;
        if (operator == Operator.PRESENT) {
            return true;
        }
        if (operator == Operator.APPROX || this.substring) {
            return false;
        }
        int iCompareTo = this.rightValue.compareTo(str);
        int i = C111731.$SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[this.operator.ordinal()];
        if (i == 1) {
            return iCompareTo == 0;
        }
        if (i == 2) {
            return iCompareTo > 0;
        }
        if (i == 3) {
            return iCompareTo >= 0;
        }
        if (i == 4) {
            return iCompareTo <= 0;
        }
        if (i == 5) {
            return iCompareTo < 0;
        }
        throw new IllegalStateException();
    }

    /* renamed from: org.apache.ivy.osgi.filter.CompareFilter$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C111731 {
        public static final /* synthetic */ int[] $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator;

        static {
            int[] iArr = new int[Operator.values().length];
            $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator = iArr;
            try {
                iArr[Operator.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[Operator.GREATER_THAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[Operator.GREATER_OR_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[Operator.LOWER_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[Operator.LOWER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int hashCode() {
        String str = this.leftValue;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Operator operator = this.operator;
        int iHashCode2 = (iHashCode + (operator == null ? 0 : operator.hashCode())) * 31;
        String str2 = this.rightValue;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CompareFilter)) {
            return false;
        }
        CompareFilter compareFilter = (CompareFilter) obj;
        String str = this.leftValue;
        if (str == null) {
            if (compareFilter.leftValue != null) {
                return false;
            }
        } else if (!str.equals(compareFilter.leftValue)) {
            return false;
        }
        Operator operator = this.operator;
        if (operator == null) {
            if (compareFilter.operator != null) {
                return false;
            }
        } else if (!operator.equals(compareFilter.operator)) {
            return false;
        }
        String str2 = this.rightValue;
        String str3 = compareFilter.rightValue;
        return str2 == null ? str3 == null : str2.equals(str3);
    }
}
