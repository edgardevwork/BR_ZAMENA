package org.jfrog.build.extractor.p065ci;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

@XStreamAlias("agent")
/* loaded from: classes8.dex */
public class Agent implements Serializable {
    public String name;
    public String version;

    public Agent() {
    }

    public Agent(String str) {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            this.name = str.substring(0, iIndexOf);
            this.version = str.substring(iIndexOf + 1);
        } else {
            this.name = str;
        }
    }

    public Agent(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotBlank(this.name)) {
            sb.append(this.name);
        }
        if (StringUtils.isNotBlank(this.version)) {
            if (sb.length() > 0) {
                sb.append("/");
            }
            sb.append(this.version);
        }
        return sb.toString();
    }
}
