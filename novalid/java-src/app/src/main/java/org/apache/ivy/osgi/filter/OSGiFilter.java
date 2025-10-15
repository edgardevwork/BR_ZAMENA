package org.apache.ivy.osgi.filter;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class OSGiFilter {
    public abstract void append(StringBuffer stringBuffer);

    public abstract boolean eval(Map<String, String> map);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        append(stringBuffer);
        return stringBuffer.toString();
    }
}
