package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class License implements Serializable {
    public static final long serialVersionUID = -4743362963485868205L;
    public List<String> components;

    @JsonProperty("full_name")
    public String fullName;

    @JsonProperty("more_info_url")
    public List<String> moreInfoUrl;
    public String name;

    public License() {
        this.components = null;
        this.moreInfoUrl = null;
    }

    public License(String str, String str2, List<String> list, List<String> list2) {
        this.name = str;
        this.fullName = str2;
        this.components = list;
        this.moreInfoUrl = list2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return this.fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String str) {
        this.fullName = str;
    }

    public List<String> getComponents() {
        return this.components;
    }

    public void setComponents(List<String> list) {
        this.components = list;
    }

    @JsonProperty("more_info_url")
    public List<String> getMoreInfoUrl() {
        return this.moreInfoUrl;
    }

    @JsonProperty("more_info_url")
    public void setMoreInfoUrl(List<String> list) {
        this.moreInfoUrl = list;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
