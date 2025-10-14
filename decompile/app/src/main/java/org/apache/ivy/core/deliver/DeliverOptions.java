package org.apache.ivy.core.deliver;

import java.util.Date;
import org.apache.ivy.core.settings.IvySettings;

/* loaded from: classes7.dex */
public class DeliverOptions {
    public String[] confs;
    public boolean generateRevConstraint;
    public boolean merge;
    public PublishingDependencyRevisionResolver pdrResolver;
    public String pubBranch;
    public Date pubdate;
    public boolean replaceForcedRevisions;
    public boolean resolveDynamicRevisions;
    public String resolveId;
    public String status;
    public boolean validate;

    public static DeliverOptions newInstance(IvySettings ivySettings) {
        return new DeliverOptions(null, new Date(), new DefaultPublishingDRResolver(), ivySettings.doValidate(), true, null);
    }

    public DeliverOptions() {
        this.pdrResolver = new DefaultPublishingDRResolver();
        this.validate = true;
        this.resolveDynamicRevisions = true;
        this.replaceForcedRevisions = false;
        this.generateRevConstraint = true;
        this.merge = true;
    }

    public DeliverOptions(String str, Date date, PublishingDependencyRevisionResolver publishingDependencyRevisionResolver, boolean z, boolean z2, String[] strArr) {
        new DefaultPublishingDRResolver();
        this.replaceForcedRevisions = false;
        this.generateRevConstraint = true;
        this.merge = true;
        this.status = str;
        this.pubdate = date;
        this.pdrResolver = publishingDependencyRevisionResolver;
        this.validate = z;
        this.resolveDynamicRevisions = z2;
        this.confs = strArr;
    }

    public PublishingDependencyRevisionResolver getPdrResolver() {
        return this.pdrResolver;
    }

    public DeliverOptions setPdrResolver(PublishingDependencyRevisionResolver publishingDependencyRevisionResolver) {
        this.pdrResolver = publishingDependencyRevisionResolver;
        return this;
    }

    public boolean isResolveDynamicRevisions() {
        return this.resolveDynamicRevisions;
    }

    public DeliverOptions setResolveDynamicRevisions(boolean z) {
        this.resolveDynamicRevisions = z;
        return this;
    }

    public boolean isReplaceForcedRevisions() {
        return this.replaceForcedRevisions;
    }

    public DeliverOptions setReplaceForcedRevisions(boolean z) {
        this.replaceForcedRevisions = z;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public DeliverOptions setValidate(boolean z) {
        this.validate = z;
        return this;
    }

    public Date getPubdate() {
        return this.pubdate;
    }

    public DeliverOptions setPubdate(Date date) {
        this.pubdate = date;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DeliverOptions setStatus(String str) {
        this.status = str;
        return this;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public DeliverOptions setResolveId(String str) {
        this.resolveId = str;
        return this;
    }

    public String[] getConfs() {
        return this.confs;
    }

    public DeliverOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public String getPubBranch() {
        return this.pubBranch;
    }

    public DeliverOptions setPubBranch(String str) {
        this.pubBranch = str;
        return this;
    }

    public boolean isGenerateRevConstraint() {
        return this.generateRevConstraint;
    }

    public DeliverOptions setGenerateRevConstraint(boolean z) {
        this.generateRevConstraint = z;
        return this;
    }

    public boolean isMerge() {
        return this.merge;
    }

    public DeliverOptions setMerge(boolean z) {
        this.merge = z;
        return this;
    }

    public String toString() {
        return "status=" + this.status + " pubdate=" + this.pubdate + " validate=" + this.validate + " resolveDynamicRevisions=" + this.resolveDynamicRevisions + " merge=" + this.merge + " resolveId=" + this.resolveId + " pubBranch=" + this.pubBranch;
    }
}
