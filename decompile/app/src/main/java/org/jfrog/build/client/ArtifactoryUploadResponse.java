package org.jfrog.build.client;

import java.util.List;
import org.apache.http.StatusLine;

/* loaded from: classes7.dex */
public class ArtifactoryUploadResponse {
    public Checksums checksums;
    public String created;
    public String createdBy;
    public String downloadUri;
    public List<Error> errors;
    public String mimeType;
    public Checksums originalChecksums;
    public String path;
    public String repo;
    public String size;
    public StatusLine statusLine;
    public String uri;

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

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String str) {
        this.created = str;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String str) {
        this.createdBy = str;
    }

    public String getDownloadUri() {
        return this.downloadUri;
    }

    public void setDownloadUri(String str) {
        this.downloadUri = str;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public Checksums getChecksums() {
        return this.checksums;
    }

    public void setChecksums(Checksums checksums) {
        this.checksums = checksums;
    }

    public Checksums getOriginalChecksums() {
        return this.originalChecksums;
    }

    public void setOriginalChecksums(Checksums checksums) {
        this.originalChecksums = checksums;
    }

    public StatusLine getStatusLine() {
        return this.statusLine;
    }

    public void setStatusLine(StatusLine statusLine) {
        this.statusLine = statusLine;
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public void setErrors(List<Error> list) {
        this.errors = list;
    }

    public static class Checksums {
        public String md5;
        public String sha1;
        public String sha256;

        public String getSha256() {
            return this.sha256;
        }

        public void setSha256(String str) {
            this.sha256 = str;
        }

        public String getSha1() {
            return this.sha1;
        }

        public void setSha1(String str) {
            this.sha1 = str;
        }

        public String getMd5() {
            return this.md5;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }
    }

    public static class Error {
        public String message;
        public String status;

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }
}
