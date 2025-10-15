package org.apache.ivy.osgi.obr.xml;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Capability {
    public String name;
    public List<CapabilityProperty> properties = new ArrayList();

    public Capability(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void addProperty(String str, String str2, String str3) {
        this.properties.add(new CapabilityProperty(str, str2, str3));
    }

    public List<CapabilityProperty> getProperties() {
        return this.properties;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        for (CapabilityProperty capabilityProperty : this.properties) {
            sb.append(" ");
            sb.append(capabilityProperty);
        }
        return sb.toString();
    }
}
