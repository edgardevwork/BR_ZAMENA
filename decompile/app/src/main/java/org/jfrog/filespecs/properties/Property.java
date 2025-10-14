package org.jfrog.filespecs.properties;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public class Property {
    public String key;
    public Set<String> values;

    public Property() {
    }

    public Property(String str, Set<String> set) {
        this.key = str;
        this.values = set;
    }

    public String getKey() {
        return this.key;
    }

    public Set<String> getValues() {
        return this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Property property = (Property) obj;
        return this.key.equals(property.key) && this.values.equals(property.values);
    }

    public int hashCode() {
        return Objects.hash(this.key, this.values);
    }
}
