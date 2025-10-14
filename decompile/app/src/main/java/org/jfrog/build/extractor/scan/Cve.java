package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
/* loaded from: classes7.dex */
public class Cve {
    public String cveId;
    public String cvssV1;
    public String cvssV2;

    public Cve() {
    }

    public Cve(String str, String str2, String str3) {
        this.cveId = str;
        this.cvssV1 = str2;
        this.cvssV2 = str3;
    }

    public String getCveId() {
        return this.cveId;
    }

    public void setCveId(String str) {
        this.cveId = str;
    }

    public String getCvssV1() {
        return this.cvssV1;
    }

    public void setCvssV1(String str) {
        this.cvssV1 = str;
    }

    public String getCvssV2() {
        return this.cvssV2;
    }

    public void setCvssV2(String str) {
        this.cvssV2 = str;
    }
}
