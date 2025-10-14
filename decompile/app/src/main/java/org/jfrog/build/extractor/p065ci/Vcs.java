package org.jfrog.build.extractor.p065ci;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

@XStreamAlias("vcs")
/* loaded from: classes8.dex */
public class Vcs implements Serializable {
    public String branch;
    public String message;
    public String revision;
    public String url;

    public Vcs() {
        this.revision = "";
        this.message = "";
        this.branch = "";
        this.url = "";
    }

    public Vcs(String str, String str2) {
        this.revision = "";
        this.message = "";
        this.branch = "";
        this.url = "";
        setUrl(str);
        setRevision(str2);
    }

    public Vcs(String str, String str2, String str3, String str4) {
        this(str, str2);
        this.branch = str3;
        this.message = str4;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "revision='" + this.revision + ExtendedMessageFormat.QUOTE + ", commit message=" + this.message + ExtendedMessageFormat.QUOTE + ", branch='" + this.branch + ExtendedMessageFormat.QUOTE + ", url='" + this.url + ExtendedMessageFormat.QUOTE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vcs)) {
            return false;
        }
        Vcs vcs = (Vcs) obj;
        return Objects.equals(this.revision, vcs.revision) && Objects.equals(this.branch, vcs.branch) && Objects.equals(this.message, vcs.message) && Objects.equals(this.url, vcs.url);
    }

    public int hashCode() {
        return Objects.hash(this.revision, this.branch, this.message, this.url);
    }

    @JsonIgnore
    public boolean isEmpty() {
        return StringUtils.isEmpty(getRevision()) && StringUtils.isEmpty(getBranch()) && StringUtils.isEmpty(getMessage()) && StringUtils.isEmpty(getUrl());
    }

    public org.jfrog.build.api.Vcs ToBuildVcs() {
        return new org.jfrog.build.api.Vcs(this.url, this.revision, this.branch, this.message);
    }

    public static Vcs ToBuildInfoVcs(org.jfrog.build.api.Vcs vcs) {
        return new Vcs(vcs.getUrl(), vcs.getRevision(), vcs.getBranch(), vcs.getMessage());
    }
}
