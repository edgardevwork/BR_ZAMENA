package org.jfrog.build.api.release;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class Distribution implements Serializable {
    public boolean async;
    public boolean dryRun;
    public String gpgPassphrase;
    public boolean overrideExistingFiles;
    public boolean publish;
    public List<String> sourceRepos;
    public String targetRepo;

    public Distribution(boolean z, boolean z2, String str, boolean z3, String str2, List<String> list, boolean z4) {
        this.publish = z;
        this.overrideExistingFiles = z2;
        this.gpgPassphrase = str;
        this.async = z3;
        this.targetRepo = str2;
        this.sourceRepos = list;
        this.dryRun = z4;
    }

    public boolean isPublish() {
        return this.publish;
    }

    public void setPublish(boolean z) {
        this.publish = z;
    }

    public boolean isOverrideExistingFiles() {
        return this.overrideExistingFiles;
    }

    public void setOverrideExistingFiles(boolean z) {
        this.overrideExistingFiles = z;
    }

    public String getGpgPassphrase() {
        return this.gpgPassphrase;
    }

    public void setGpgPassphrase(String str) {
        this.gpgPassphrase = str;
    }

    public boolean isAsync() {
        return this.async;
    }

    public void setAsync(boolean z) {
        this.async = z;
    }

    public String getTargetRepo() {
        return this.targetRepo;
    }

    public void setTargetRepo(String str) {
        this.targetRepo = str;
    }

    public List<String> getSourceRepos() {
        return this.sourceRepos;
    }

    public void setSourceRepos(List<String> list) {
        this.sourceRepos = list;
    }

    public boolean isDryRun() {
        return this.dryRun;
    }

    public void setDryRun(boolean z) {
        this.dryRun = z;
    }
}
