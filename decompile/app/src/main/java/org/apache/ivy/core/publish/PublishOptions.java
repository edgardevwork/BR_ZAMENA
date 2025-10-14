package org.apache.ivy.core.publish;

import java.util.Date;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes7.dex */
public class PublishOptions {
    public String[] confs;
    public Artifact[] extraArtifacts;
    public boolean haltonmissing;
    public boolean merge = true;
    public boolean overwrite;
    public String pubBranch;
    public Date pubdate;
    public String pubrevision;
    public String srcIvyPattern;
    public String status;
    public boolean update;
    public boolean validate;
    public boolean warnonmissing;

    public String[] getConfs() {
        return this.confs;
    }

    public PublishOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public Artifact[] getExtraArtifacts() {
        return this.extraArtifacts;
    }

    public PublishOptions setExtraArtifacts(Artifact[] artifactArr) {
        this.extraArtifacts = artifactArr;
        return this;
    }

    public boolean isOverwrite() {
        return this.overwrite;
    }

    public PublishOptions setOverwrite(boolean z) {
        this.overwrite = z;
        return this;
    }

    public Date getPubdate() {
        return this.pubdate;
    }

    public PublishOptions setPubdate(Date date) {
        this.pubdate = date;
        return this;
    }

    public String getPubrevision() {
        return this.pubrevision;
    }

    public PublishOptions setPubrevision(String str) {
        this.pubrevision = str;
        return this;
    }

    public String getSrcIvyPattern() {
        return this.srcIvyPattern;
    }

    public PublishOptions setSrcIvyPattern(String str) {
        this.srcIvyPattern = str;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PublishOptions setStatus(String str) {
        this.status = str;
        return this;
    }

    public boolean isUpdate() {
        return this.update;
    }

    public PublishOptions setUpdate(boolean z) {
        this.update = z;
        return this;
    }

    public boolean isMerge() {
        return this.merge;
    }

    public PublishOptions setMerge(boolean z) {
        this.merge = z;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public PublishOptions setValidate(boolean z) {
        this.validate = z;
        return this;
    }

    public boolean isHaltOnMissing() {
        return this.haltonmissing;
    }

    public PublishOptions setHaltOnMissing(boolean z) {
        this.haltonmissing = z;
        return this;
    }

    public String getPubBranch() {
        return this.pubBranch;
    }

    public PublishOptions setPubbranch(String str) {
        this.pubBranch = str;
        return this;
    }

    public boolean isWarnOnMissing() {
        return this.warnonmissing;
    }

    public PublishOptions setWarnOnMissing(boolean z) {
        this.warnonmissing = z;
        return this;
    }
}
