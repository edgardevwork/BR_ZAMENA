package org.apache.ivy.osgi.filter;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class OrFilter extends MultiOperatorFilter {
    @Override // org.apache.ivy.osgi.filter.MultiOperatorFilter
    public char operator() {
        return '|';
    }

    public OrFilter() {
    }

    public OrFilter(OSGiFilter[] oSGiFilterArr) {
        super(oSGiFilterArr);
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public boolean eval(Map<String, String> map) {
        Iterator<OSGiFilter> it = getSubFilters().iterator();
        while (it.hasNext()) {
            if (it.next().eval(map)) {
                return true;
            }
        }
        return false;
    }
}
