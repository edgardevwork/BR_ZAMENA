package org.apache.ivy.osgi.filter;

import java.util.Map;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes8.dex */
public class NotFilter extends UniOperatorFilter {
    @Override // org.apache.ivy.osgi.filter.UniOperatorFilter
    public char operator() {
        return PublicSuffixDatabase.EXCEPTION_MARKER;
    }

    public NotFilter(OSGiFilter oSGiFilter) {
        super(oSGiFilter);
    }

    @Override // org.apache.ivy.osgi.filter.OSGiFilter
    public boolean eval(Map<String, String> map) {
        return !getSubFilter().eval(map);
    }
}
