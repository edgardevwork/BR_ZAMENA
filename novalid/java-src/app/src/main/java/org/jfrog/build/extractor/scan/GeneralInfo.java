package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
/* loaded from: classes5.dex */
public class GeneralInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public String componentId;
    public String path;
    public String pkgType;
    public String sha1;

    public GeneralInfo() {
        this.componentId = "";
        this.pkgType = "";
        this.path = "";
        this.sha1 = "";
    }

    public GeneralInfo(String str, String str2, String str3) {
        this.sha1 = "";
        this.componentId = str;
        this.path = str2;
        this.pkgType = str3;
    }

    public String getGroupId() {
        if (StringUtils.countMatches(this.componentId, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) != 2) {
            return "";
        }
        String str = this.componentId;
        return str.substring(0, str.indexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER));
    }

    public String getArtifactId() {
        int iCountMatches = StringUtils.countMatches(this.componentId, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (iCountMatches < 1 || iCountMatches > 2) {
            return "";
        }
        int iIndexOf = this.componentId.indexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (iCountMatches == 1) {
            return this.componentId.substring(0, iIndexOf);
        }
        String str = this.componentId;
        return str.substring(iIndexOf + 1, str.lastIndexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER));
    }

    public String getVersion() {
        int iCountMatches = StringUtils.countMatches(this.componentId, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (iCountMatches < 1 || iCountMatches > 2) {
            return "";
        }
        String str = this.componentId;
        return str.substring(str.lastIndexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) + 1);
    }

    public String getComponentId() {
        return this.componentId;
    }

    public String getPath() {
        return this.path;
    }

    public String getPkgType() {
        return this.pkgType;
    }

    public String getSha1() {
        return this.sha1;
    }

    public GeneralInfo componentId(String str) {
        this.componentId = str;
        return this;
    }

    public GeneralInfo path(String str) {
        this.path = str;
        return this;
    }

    public GeneralInfo pkgType(String str) {
        this.pkgType = str;
        return this;
    }

    public GeneralInfo sha1(String str) {
        this.sha1 = str;
        return this;
    }
}
