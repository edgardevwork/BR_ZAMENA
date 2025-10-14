package org.apache.ivy.plugins.namespace;

/* loaded from: classes6.dex */
public class MRIDRule {
    public String branch;
    public String module;

    /* renamed from: org, reason: collision with root package name */
    public String f11309org;
    public String rev;

    public MRIDRule(String str, String str2, String str3) {
        this.f11309org = str;
        this.module = str2;
        this.rev = str3;
    }

    public MRIDRule() {
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrg() {
        return this.f11309org;
    }

    public void setOrg(String str) {
        this.f11309org = str;
    }

    public String getRev() {
        return this.rev;
    }

    public void setRev(String str) {
        this.rev = str;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f11309org);
        sb.append(" ");
        sb.append(this.module);
        if (this.branch != null) {
            str = " " + this.branch;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.rev);
        sb.append(" ]");
        return sb.toString();
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }
}
