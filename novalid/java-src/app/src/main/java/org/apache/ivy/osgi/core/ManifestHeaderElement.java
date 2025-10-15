package org.apache.ivy.osgi.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class ManifestHeaderElement {
    public List<String> values = new ArrayList();
    public Map<String, String> attributes = new HashMap();
    public Map<String, String> directives = new HashMap();

    public List<String> getValues() {
        return this.values;
    }

    public void addValue(String str) {
        this.values.add(str);
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public void addAttribute(String str, String str2) {
        this.attributes.put(str, str2);
    }

    public Map<String, String> getDirectives() {
        return this.directives;
    }

    public void addDirective(String str, String str2) {
        this.directives.put(str, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ManifestHeaderElement)) {
            return false;
        }
        ManifestHeaderElement manifestHeaderElement = (ManifestHeaderElement) obj;
        if (manifestHeaderElement.values.size() != this.values.size()) {
            return false;
        }
        Iterator<String> it = this.values.iterator();
        while (it.hasNext()) {
            if (!manifestHeaderElement.values.contains(it.next())) {
                return false;
            }
        }
        if (manifestHeaderElement.directives.size() != this.directives.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : this.directives.entrySet()) {
            if (!entry.getValue().equals(manifestHeaderElement.directives.get(entry.getKey()))) {
                return false;
            }
        }
        if (manifestHeaderElement.attributes.size() != this.attributes.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry2 : this.attributes.entrySet()) {
            if (!entry2.getValue().equals(manifestHeaderElement.attributes.get(entry2.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.values) {
            if (sb.length() > 0) {
                sb.append(PropertiesParser.PROPS_SEPARATOR);
            }
            sb.append(str);
        }
        for (Map.Entry<String, String> entry : this.directives.entrySet()) {
            sb.append(PropertiesParser.PROPS_SEPARATOR);
            sb.append(entry.getKey());
            sb.append(":=");
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.attributes.entrySet()) {
            sb.append(PropertiesParser.PROPS_SEPARATOR);
            sb.append(entry2.getKey());
            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
            sb.append(entry2.getValue());
        }
        return sb.toString();
    }
}
