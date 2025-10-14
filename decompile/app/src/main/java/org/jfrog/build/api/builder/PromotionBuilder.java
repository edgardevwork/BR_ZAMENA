package org.jfrog.build.api.builder;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jfrog.build.api.release.Promotion;

/* loaded from: classes8.dex */
public class PromotionBuilder {
    public String ciUser;
    public String comment;
    public boolean copy;
    public boolean dryRun;
    public Map<String, Collection<String>> properties;
    public Set<String> scopes;
    public String sourceRepo;
    public String status;
    public String targetRepo;
    public String timestamp;
    public boolean artifacts = true;
    public boolean dependencies = false;
    public boolean failFast = true;

    public PromotionBuilder status(String str) {
        this.status = str;
        return this;
    }

    public PromotionBuilder comment(String str) {
        this.comment = str;
        return this;
    }

    public PromotionBuilder ciUser(String str) {
        this.ciUser = str;
        return this;
    }

    public PromotionBuilder timestamp(String str) {
        this.timestamp = str;
        return this;
    }

    public PromotionBuilder timestampDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Cannot format a null date.");
        }
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        return this;
    }

    public PromotionBuilder dryRun(boolean z) {
        this.dryRun = z;
        return this;
    }

    public PromotionBuilder targetRepo(String str) {
        this.targetRepo = str;
        return this;
    }

    public PromotionBuilder sourceRepo(String str) {
        this.sourceRepo = str;
        return this;
    }

    public PromotionBuilder copy(boolean z) {
        this.copy = z;
        return this;
    }

    public PromotionBuilder artifacts(boolean z) {
        this.artifacts = z;
        return this;
    }

    public PromotionBuilder dependencies(boolean z) {
        this.dependencies = z;
        return this;
    }

    public PromotionBuilder scopes(Set<String> set) {
        this.scopes = set;
        return this;
    }

    public PromotionBuilder addScope(String str) {
        if (this.scopes == null) {
            this.scopes = new HashSet();
        }
        this.scopes.add(str);
        return this;
    }

    public PromotionBuilder properties(Map<String, Collection<String>> map) {
        this.properties = map;
        return this;
    }

    public PromotionBuilder addProperty(String str, String str2) {
        Collection<String> hashSet;
        if (this.properties == null) {
            this.properties = new HashMap();
        }
        if (!this.properties.containsKey(str)) {
            hashSet = new HashSet<>();
        } else {
            hashSet = this.properties.get(str);
        }
        hashSet.add(str2);
        this.properties.put(str, hashSet);
        return this;
    }

    public PromotionBuilder failFast(boolean z) {
        this.failFast = z;
        return this;
    }

    public Promotion build() {
        return new Promotion(this.status, this.comment, this.ciUser, this.timestamp, this.dryRun, this.targetRepo, this.sourceRepo, this.copy, this.artifacts, this.dependencies, this.scopes, this.properties, this.failFast);
    }

    public boolean isFailFast() {
        return this.failFast;
    }
}
