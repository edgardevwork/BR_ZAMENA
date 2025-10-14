package org.jfrog.build.api.release;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class Promotion implements Serializable {
    public static final String RELEASED = "Released";
    public static final String ROLLED_BACK = "Rolled-back";
    public static final String STAGED = "Staged";
    public boolean artifacts;
    public String ciUser;
    public String comment;
    public boolean copy;
    public boolean dependencies;
    public boolean dryRun;
    public boolean failFast;
    public Map<String, Collection<String>> properties;
    public Set<String> scopes;
    public String sourceRepo;
    public String status;
    public String targetRepo;
    public String timestamp;

    public Promotion() {
        this.artifacts = true;
        this.dependencies = false;
        this.failFast = true;
    }

    public Promotion(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, Set<String> set, Map<String, Collection<String>> map, boolean z5) {
        this.status = str;
        this.comment = str2;
        this.ciUser = str3;
        this.timestamp = str4;
        this.dryRun = z;
        this.targetRepo = str5;
        this.sourceRepo = str6;
        this.copy = z2;
        this.artifacts = z3;
        this.dependencies = z4;
        this.scopes = set;
        this.properties = map;
        this.failFast = z5;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getCiUser() {
        return this.ciUser;
    }

    public void setCiUser(String str) {
        this.ciUser = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public Date getTimestampDate() {
        return getTimestampAsDate(getTimestamp());
    }

    public boolean isDryRun() {
        return this.dryRun;
    }

    public void setDryRun(boolean z) {
        this.dryRun = z;
    }

    public String getTargetRepo() {
        return this.targetRepo;
    }

    public void setTargetRepo(String str) {
        this.targetRepo = str;
    }

    public String getSourceRepo() {
        return this.sourceRepo;
    }

    public void setSourceRepo(String str) {
        this.sourceRepo = str;
    }

    public boolean isCopy() {
        return this.copy;
    }

    public void setCopy(boolean z) {
        this.copy = z;
    }

    public boolean isArtifacts() {
        return this.artifacts;
    }

    public void setArtifacts(boolean z) {
        this.artifacts = z;
    }

    public boolean isDependencies() {
        return this.dependencies;
    }

    public void setDependencies(boolean z) {
        this.dependencies = z;
    }

    public Set<String> getScopes() {
        return this.scopes;
    }

    public void setScopes(Set<String> set) {
        this.scopes = set;
    }

    public Map<String, Collection<String>> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, Collection<String>> map) {
        this.properties = map;
    }

    public boolean isFailFast() {
        return this.failFast;
    }

    public void setFailFast(boolean z) {
        this.failFast = z;
    }

    public final Date getTimestampAsDate(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
