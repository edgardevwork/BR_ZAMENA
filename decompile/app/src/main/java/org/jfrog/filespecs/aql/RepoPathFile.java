package org.jfrog.filespecs.aql;

import java.util.Objects;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* loaded from: classes5.dex */
public class RepoPathFile {
    public String file;
    public String path;
    public String repo;

    public RepoPathFile(String str, String str2, String str3) {
        this.repo = str;
        this.path = str2;
        this.file = str3;
    }

    public String getRepo() {
        return this.repo;
    }

    public void setRepo(String str) {
        this.repo = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepoPathFile)) {
            return false;
        }
        RepoPathFile repoPathFile = (RepoPathFile) obj;
        return Objects.equals(this.repo, repoPathFile.repo) && Objects.equals(this.path, repoPathFile.path) && Objects.equals(this.file, repoPathFile.file);
    }

    public String toString() {
        return "RepoPathFile{repo='" + this.repo + ExtendedMessageFormat.QUOTE + ", path='" + this.path + ExtendedMessageFormat.QUOTE + ", file='" + this.file + ExtendedMessageFormat.QUOTE + '}';
    }
}
