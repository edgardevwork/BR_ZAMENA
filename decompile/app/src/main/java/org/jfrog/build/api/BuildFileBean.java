package org.jfrog.build.api;

/* loaded from: classes5.dex */
public interface BuildFileBean extends BuildBean {
    String getMd5();

    String getSha1();

    String getSha256();

    String getType();

    void setMd5(String str);

    void setSha1(String str);

    void setSha256(String str);

    void setType(String str);
}
