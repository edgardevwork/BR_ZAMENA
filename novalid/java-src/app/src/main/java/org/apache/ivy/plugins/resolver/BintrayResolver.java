package org.apache.ivy.plugins.resolver;

import org.apache.ivy.util.StringUtils;

/* loaded from: classes8.dex */
public class BintrayResolver extends IBiblioResolver {
    public static final String DEFAULT_NAME = "bintray/jcenter";
    public static final String DL_BINTRAY = "https://dl.bintray.com/";
    public static final String JCENTER = "https://jcenter.bintray.com/";
    public boolean isNameUpdatable;
    public String repo;
    public String subject;

    public BintrayResolver() {
        setRoot(JCENTER);
        updateName(DEFAULT_NAME);
        setM2compatible(true);
        setUsepoms(true);
        setUseMavenMetadata(true);
    }

    public void setSubject(String str) {
        this.subject = str;
        updateRoot();
    }

    public void setRepo(String str) {
        this.repo = str;
        updateRoot();
    }

    public final void updateRoot() {
        if (StringUtils.isNullOrEmpty(this.subject) || StringUtils.isNullOrEmpty(this.repo)) {
            return;
        }
        setRoot(String.format("%s%s/%s/", DL_BINTRAY, this.subject, this.repo));
        updateName(String.format("bintray/%s/%s", this.subject, this.repo));
    }

    public final void updateName(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Default resolver name must not be null or empty");
        }
        if (StringUtils.isNullOrEmpty(getName()) || this.isNameUpdatable) {
            this.isNameUpdatable = true;
            setName(str);
        }
    }
}
