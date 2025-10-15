package org.apache.ivy.osgi.filter;

/* loaded from: classes7.dex */
public abstract class UniOperatorFilter extends OSGiFilter {
    public final OSGiFilter subFilter;

    public abstract char operator();

    public UniOperatorFilter(OSGiFilter oSGiFilter) {
        this.subFilter = oSGiFilter;
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public void append(StringBuffer stringBuffer) {
        stringBuffer.append("(");
        stringBuffer.append(operator());
        stringBuffer.append(this.subFilter.toString());
        stringBuffer.append(")");
    }

    public OSGiFilter getSubFilter() {
        return this.subFilter;
    }

    public int hashCode() {
        OSGiFilter oSGiFilter = this.subFilter;
        return 31 + (oSGiFilter == null ? 0 : oSGiFilter.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UniOperatorFilter)) {
            return false;
        }
        OSGiFilter oSGiFilter = this.subFilter;
        OSGiFilter oSGiFilter2 = ((UniOperatorFilter) obj).subFilter;
        return oSGiFilter == null ? oSGiFilter2 == null : oSGiFilter.equals(oSGiFilter2);
    }
}
