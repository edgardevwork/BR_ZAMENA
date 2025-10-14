package org.apache.ivy.osgi.obr.xml;

import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes5.dex */
public class CapabilityProperty {
    public String name;
    public String type;
    public String value;

    public CapabilityProperty(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.type = str3;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.type == null) {
            str = "";
        } else {
            str = "[" + this.type + "]";
        }
        sb.append(str);
        sb.append(this.name);
        sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
        sb.append(this.value);
        return sb.toString();
    }
}
