package org.apache.ivy.core.cache;

import org.apache.ivy.plugins.namespace.Namespace;

/* loaded from: classes7.dex */
public class CacheMetadataOptions extends CacheDownloadOptions {
    public boolean validate = false;
    public Namespace namespace = Namespace.SYSTEM_NAMESPACE;
    public Boolean isCheckmodified = null;
    public String changingMatcherName = null;
    public String changingPattern = null;
    public boolean checkTTL = true;
    public boolean useCacheOnly = false;

    public Namespace getNamespace() {
        return this.namespace;
    }

    public CacheMetadataOptions setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public CacheMetadataOptions setValidate(boolean z) {
        this.validate = z;
        return this;
    }

    public Boolean isCheckmodified() {
        return this.isCheckmodified;
    }

    public CacheMetadataOptions setCheckmodified(Boolean bool) {
        this.isCheckmodified = bool;
        return this;
    }

    public String getChangingMatcherName() {
        return this.changingMatcherName;
    }

    public CacheMetadataOptions setChangingMatcherName(String str) {
        this.changingMatcherName = str;
        return this;
    }

    public String getChangingPattern() {
        return this.changingPattern;
    }

    public CacheMetadataOptions setChangingPattern(String str) {
        this.changingPattern = str;
        return this;
    }

    public CacheMetadataOptions setCheckTTL(boolean z) {
        this.checkTTL = z;
        return this;
    }

    public boolean isCheckTTL() {
        return this.checkTTL;
    }

    public CacheMetadataOptions setUseCacheOnly(boolean z) {
        this.useCacheOnly = z;
        return this;
    }

    public boolean isUseCacheOnly() {
        return this.useCacheOnly;
    }
}
