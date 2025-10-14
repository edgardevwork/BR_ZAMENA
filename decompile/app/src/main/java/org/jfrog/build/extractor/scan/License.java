package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
/* loaded from: classes5.dex */
public class License {
    public static final String UNKNOWN_LICENCE_FULL_NAME = "Unknown license";
    public static final String UNKNOWN_LICENCE_NAME = "Unknown";
    public String component;
    public final String fullName;
    public List<String> moreInfoUrl;
    public final String name;
    public boolean violate;

    public License() {
        this.component = "";
        this.moreInfoUrl = new ArrayList();
        this.fullName = UNKNOWN_LICENCE_FULL_NAME;
        this.name = UNKNOWN_LICENCE_NAME;
    }

    public License(String str, String str2, List<String> list) {
        this(str, str2, list, false);
    }

    public License(String str, String str2, List<String> list, boolean z) {
        this.component = "";
        this.moreInfoUrl = new ArrayList();
        this.fullName = StringUtils.trim(str);
        this.name = StringUtils.trim(str2);
        this.moreInfoUrl = list;
        this.violate = z;
    }

    public String getComponent() {
        return this.component;
    }

    public void setComponent(String str) {
        this.component = str;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getName() {
        return this.name;
    }

    public boolean isViolate() {
        return this.violate;
    }

    public void setViolate(boolean z) {
        this.violate = z;
    }

    public List<String> getMoreInfoUrl() {
        return this.moreInfoUrl;
    }

    @JsonIgnore
    public boolean isFullNameEmpty() {
        return StringUtils.isBlank(this.fullName) || this.fullName.equals(UNKNOWN_LICENCE_FULL_NAME);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        License license = (License) obj;
        return StringUtils.equals(this.fullName, license.fullName) && StringUtils.equals(this.name, license.name);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.fullName);
    }

    public String toString() {
        return this.name;
    }
}
