package org.apache.ivy.osgi.filter;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class AndFilter extends MultiOperatorFilter {
    @Override // org.apache.ivy.osgi.filter.MultiOperatorFilter
    public char operator() {
        return '&';
    }

    public AndFilter() {
    }

    public AndFilter(OSGiFilter[] oSGiFilterArr) {
        super(oSGiFilterArr);
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public boolean eval(Map<String, String> map) {
        Iterator<OSGiFilter> it = getSubFilters().iterator();
        while (it.hasNext()) {
            if (!it.next().eval(map)) {
                return false;
            }
        }
        return true;
    }
}
