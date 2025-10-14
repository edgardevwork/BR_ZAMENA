package org.jfrog.build.api.builder;

import java.util.List;
import org.jfrog.build.api.release.Distribution;

/* loaded from: classes8.dex */
public class DistributionBuilder {
    public String gpgPassphrase;
    public List<String> sourceRepos;
    public String targetRepo;
    public boolean publish = true;
    public boolean overrideExistingFiles = false;
    public boolean async = false;
    public boolean dryRun = false;

    public DistributionBuilder publish(boolean z) {
        this.publish = z;
        return this;
    }

    public DistributionBuilder overrideExistingFiles(boolean z) {
        this.overrideExistingFiles = z;
        return this;
    }

    public DistributionBuilder gpgPassphrase(String str) {
        this.gpgPassphrase = str;
        return this;
    }

    public DistributionBuilder async(boolean z) {
        this.async = z;
        return this;
    }

    public DistributionBuilder targetRepo(String str) {
        this.targetRepo = str;
        return this;
    }

    public DistributionBuilder sourceRepos(List<String> list) {
        this.sourceRepos = list;
        return this;
    }

    public DistributionBuilder dryRun(boolean z) {
        this.dryRun = z;
        return this;
    }

    public Distribution build() {
        return new Distribution(this.publish, this.overrideExistingFiles, this.gpgPassphrase, this.async, this.targetRepo, this.sourceRepos, this.dryRun);
    }
}
