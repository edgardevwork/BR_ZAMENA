package org.jfrog.build.api.release;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes7.dex */
public class BintrayUploadInfoOverride {
    public List<String> licenses;
    public String packageName;
    public String repoName;
    public String subject;

    @JsonProperty("vcs_url")
    public String vcsUrl;
    public String versionName;

    public BintrayUploadInfoOverride() {
    }

    public BintrayUploadInfoOverride(String str, String str2, String str3, String str4, List<String> list, String str5) {
        this.subject = str;
        this.repoName = str2;
        this.packageName = str3;
        this.versionName = str4;
        this.licenses = list;
        this.vcsUrl = str5;
    }

    @JsonIgnore
    public boolean isValid() {
        return StringUtils.isNotBlank(this.subject) && StringUtils.isNotBlank(this.repoName) && StringUtils.isNotBlank(this.packageName) && StringUtils.isNotBlank(this.versionName);
    }

    @JsonIgnore
    public boolean isEmpty() {
        List<String> list;
        return this.subject == null && this.repoName == null && this.packageName == null && this.versionName == null && ((list = this.licenses) == null || list.isEmpty()) && this.vcsUrl == null;
    }
}
