package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes5.dex */
public class Scope {
    public static final String NONE_SCOPE = "None";
    public final String name;

    public Scope() {
        this.name = NONE_SCOPE;
    }

    public Scope(String str) {
        this.name = StringUtils.capitalize(StringUtils.trim(str));
    }

    public String getName() {
        return this.name;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return StringUtils.isBlank(this.name) || this.name.equals(NONE_SCOPE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return StringUtils.equals(toString(), obj.toString());
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public String toString() {
        return this.name;
    }
}
