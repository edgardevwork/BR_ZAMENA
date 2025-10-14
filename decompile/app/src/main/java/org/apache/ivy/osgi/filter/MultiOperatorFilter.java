package org.apache.ivy.osgi.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class MultiOperatorFilter extends OSGiFilter {
    public List<OSGiFilter> subFilters = new ArrayList();

    public abstract char operator();

    public MultiOperatorFilter() {
    }

    public MultiOperatorFilter(OSGiFilter[] oSGiFilterArr) {
        for (OSGiFilter oSGiFilter : oSGiFilterArr) {
            add(oSGiFilter);
        }
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public void append(StringBuffer stringBuffer) {
        stringBuffer.append('(');
        stringBuffer.append(operator());
        Iterator<OSGiFilter> it = this.subFilters.iterator();
        while (it.hasNext()) {
            it.next().append(stringBuffer);
        }
        stringBuffer.append(')');
    }

    public void add(OSGiFilter oSGiFilter) {
        this.subFilters.add(oSGiFilter);
    }

    public List<OSGiFilter> getSubFilters() {
        return this.subFilters;
    }

    public int hashCode() {
        Iterator<OSGiFilter> it = this.subFilters.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            OSGiFilter next = it.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MultiOperatorFilter)) {
            return false;
        }
        MultiOperatorFilter multiOperatorFilter = (MultiOperatorFilter) obj;
        List<OSGiFilter> list = this.subFilters;
        if (list == null) {
            if (multiOperatorFilter.subFilters == null) {
                return true;
            }
        } else if (multiOperatorFilter.subFilters != null && list.size() == multiOperatorFilter.subFilters.size() && this.subFilters.containsAll(multiOperatorFilter.subFilters)) {
            return true;
        }
        return false;
    }
}
