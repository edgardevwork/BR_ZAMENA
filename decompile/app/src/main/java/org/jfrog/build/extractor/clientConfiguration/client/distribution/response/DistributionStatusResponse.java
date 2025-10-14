package org.jfrog.build.extractor.clientConfiguration.client.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.DistributionRules;

/* loaded from: classes7.dex */
public class DistributionStatusResponse implements Serializable {
    public static final long serialVersionUID = 1;

    @JsonProperty("distribution_rules")
    public List<DistributionRules> distributionRules;

    @JsonProperty("distribution_friendly_id")
    public int friendlyId;

    /* renamed from: id */
    @JsonProperty("distribution_id")
    public String f10015id;
    public List<DistributionSiteStatus> sites;
    public String status;
    public String type;
    public String version;

    public List<DistributionRules> getDistributionRules() {
        return this.distributionRules;
    }

    public void setDistributionRules(List<DistributionRules> list) {
        this.distributionRules = list;
    }

    public List<DistributionSiteStatus> getSites() {
        return this.sites;
    }

    public void setSites(List<DistributionSiteStatus> list) {
        this.sites = list;
    }

    public int getFriendlyId() {
        return this.friendlyId;
    }

    public void setFriendlyId(int i) {
        this.friendlyId = i;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getId() {
        return this.f10015id;
    }

    public void setId(String str) {
        this.f10015id = str;
    }

    public static class DistributionSiteStatus {

        @JsonProperty("distributed_bytes")
        public int distributedBytes;

        @JsonProperty("distributed_files")
        public int distributedFiles;

        @JsonProperty("file_errors")
        public List<String> fileErrors;

        @JsonProperty("files_in_progress")
        public List<String> filesInProgress;

        @JsonProperty("general_error")
        public String generalError;
        public String status;

        @JsonProperty("target_artifactory")
        public TargetArtifactory targetArtifactory;

        @JsonProperty("total_bytes")
        public int totalBytes;

        @JsonProperty("total_files")
        public int totalFiles;

        public TargetArtifactory getTargetArtifactory() {
            return this.targetArtifactory;
        }

        public void setTargetArtifactory(TargetArtifactory targetArtifactory) {
            this.targetArtifactory = targetArtifactory;
        }

        public List<String> getFilesInProgress() {
            return this.filesInProgress;
        }

        public void setFilesInProgress(List<String> list) {
            this.filesInProgress = list;
        }

        public List<String> getFileErrors() {
            return this.fileErrors;
        }

        public void setFileErrors(List<String> list) {
            this.fileErrors = list;
        }

        public int getDistributedBytes() {
            return this.distributedBytes;
        }

        public void setDistributedBytes(int i) {
            this.distributedBytes = i;
        }

        public int getDistributedFiles() {
            return this.distributedFiles;
        }

        public void setDistributedFiles(int i) {
            this.distributedFiles = i;
        }

        public int getTotalFiles() {
            return this.totalFiles;
        }

        public void setTotalFiles(int i) {
            this.totalFiles = i;
        }

        public int getTotalBytes() {
            return this.totalBytes;
        }

        public void setTotalBytes(int i) {
            this.totalBytes = i;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public String getGeneralError() {
            return this.generalError;
        }

        public void setGeneralError(String str) {
            this.generalError = str;
        }
    }

    public static class TargetArtifactory {
        public String name;

        @JsonProperty("service_id")
        public String serviceId;
        public String type;

        public String getServiceId() {
            return this.serviceId;
        }

        public void setServiceId(String str) {
            this.serviceId = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }
    }
}
