package org.apache.ivy.osgi.obr.xml;

import org.apache.ivy.osgi.filter.OSGiFilter;

/* loaded from: classes5.dex */
public class Requirement {
    public final OSGiFilter filter;
    public boolean multiple = false;
    public final String name;
    public boolean optional;

    public Requirement(String str, OSGiFilter oSGiFilter) {
        this.name = str;
        this.filter = oSGiFilter;
    }

    public String getName() {
        return this.name;
    }

    public OSGiFilter getFilter() {
        return this.filter;
    }

    public void setOptional(boolean z) {
        this.optional = z;
    }

    public boolean isOptional() {
        return this.optional;
    }

    public void setMultiple(boolean z) {
        this.multiple = z;
    }

    public boolean isMultiple() {
        return this.multiple;
    }
}
