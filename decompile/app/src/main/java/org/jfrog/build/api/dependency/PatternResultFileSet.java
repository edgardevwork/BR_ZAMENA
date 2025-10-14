package org.jfrog.build.api.dependency;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class PatternResultFileSet {
    public Set<String> files;
    public String repoUri;
    public String sourcePattern;

    public PatternResultFileSet() {
        this.files = new HashSet();
    }

    public PatternResultFileSet(String str, String str2) {
        this.files = new HashSet();
        this.repoUri = str;
        this.sourcePattern = str2;
    }

    public PatternResultFileSet(String str, String str2, Set<String> set) {
        new HashSet();
        this.repoUri = str;
        this.sourcePattern = str2;
        this.files = set;
    }

    public String getRepoUri() {
        return this.repoUri;
    }

    public void setRepoUri(String str) {
        this.repoUri = str;
    }

    public String getSourcePattern() {
        return this.sourcePattern;
    }

    public void setSourcePattern(String str) {
        this.sourcePattern = str;
    }

    public Set<String> getFiles() {
        return this.files;
    }

    public void setFiles(Set<String> set) {
        this.files = set;
    }

    public void addFile(String str) {
        if (this.files == null) {
            this.files = new HashSet();
        }
        this.files.add(str);
    }
}
