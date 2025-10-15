package org.apache.ivy.ant;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.p062id.ArtifactRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.publish.PublishOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DynamicAttribute;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public class IvyPublish extends IvyTask {
    public String deliverTarget;
    public File deliveryList;
    public boolean forcedeliver;
    public String module;
    public String organisation;
    public String pubBranch;
    public String pubRevision;
    public String pubdate;
    public String revision;
    public String srcivypattern;
    public String status;
    public String conf = null;
    public String publishResolverName = null;
    public List<String> artifactspattern = new ArrayList();
    public boolean publishivy = true;
    public boolean warnonmissing = true;
    public boolean haltonmissing = true;
    public boolean overwrite = false;
    public boolean update = false;
    public boolean merge = true;
    public boolean replacedynamicrev = true;
    public Collection<Artifact> artifacts = new ArrayList();

    public void setCache(File file) {
        cacheAttributeNotSupported();
    }

    public String getSrcivypattern() {
        return this.srcivypattern;
    }

    public void setSrcivypattern(String str) {
        this.srcivypattern = str;
    }

    @Deprecated
    public String getDeliverivypattern() {
        return this.srcivypattern;
    }

    @Deprecated
    public void setDeliverivypattern(String str) {
        this.srcivypattern = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getPubdate() {
        return this.pubdate;
    }

    public void setPubdate(String str) {
        this.pubdate = str;
    }

    public String getPubrevision() {
        return this.pubRevision;
    }

    public void setPubrevision(String str) {
        this.pubRevision = str;
    }

    public String getPubbranch() {
        return this.pubBranch;
    }

    public void setPubbranch(String str) {
        this.pubBranch = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public void setDelivertarget(String str) {
        this.deliverTarget = str;
    }

    public void setDeliveryList(File file) {
        this.deliveryList = file;
    }

    public String getResolver() {
        return this.publishResolverName;
    }

    public void setResolver(String str) {
        this.publishResolverName = str;
    }

    public String getArtifactspattern() {
        if (this.artifactspattern.isEmpty()) {
            return null;
        }
        return this.artifactspattern.get(0);
    }

    public void setArtifactspattern(String str) {
        this.artifactspattern.clear();
        this.artifactspattern.add(str);
    }

    public void addArtifactspattern(String str) {
        this.artifactspattern.add(str);
    }

    public void addConfiguredArtifacts(ArtifactsPattern artifactsPattern) {
        this.artifactspattern.add(artifactsPattern.getPattern());
    }

    public boolean isReplacedynamicrev() {
        return this.replacedynamicrev;
    }

    public void setReplacedynamicrev(boolean z) {
        this.replacedynamicrev = z;
    }

    public boolean isMerge() {
        return this.merge;
    }

    public void setMerge(boolean z) {
        this.merge = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        String property;
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        this.organisation = getProperty(this.organisation, settings, "ivy.organisation");
        this.module = getProperty(this.module, settings, "ivy.module");
        this.revision = getProperty(this.revision, settings, "ivy.revision");
        this.pubBranch = getProperty(this.pubBranch, settings, "ivy.deliver.branch");
        this.pubRevision = getProperty(this.pubRevision, settings, "ivy.deliver.revision");
        if (this.artifactspattern.isEmpty() && (property = getProperty((String) null, settings, "ivy.publish.src.artifacts.pattern")) != null) {
            this.artifactspattern.add(property);
        }
        if (this.srcivypattern == null) {
            this.srcivypattern = getArtifactspattern();
        }
        this.status = getProperty(this.status, settings, "ivy.status");
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy publish task: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property or a prior call to <resolve/>");
        }
        if (this.module == null) {
            throw new BuildException("no module name provided for ivy publish task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
        }
        if (this.revision == null) {
            throw new BuildException("no module revision provided for ivy publish task: It can either be set explicitly via the attribute 'revision' or via 'ivy.revision' property or a prior call to <resolve/>");
        }
        if (this.artifactspattern.isEmpty()) {
            throw new BuildException("no artifacts pattern: either provide it through parameter or through ivy.publish.src.artifacts.pattern property");
        }
        if (this.publishResolverName == null) {
            throw new BuildException("no publish deliver name: please provide it through parameter 'resolver'");
        }
        if ("working".equals(this.revision)) {
            this.revision = Ivy.getWorkingRevision();
        }
        Date pubDate = IvyTask.getPubDate(this.pubdate, new Date());
        if (this.pubRevision == null) {
            if (this.revision.startsWith("working@")) {
                this.pubRevision = DateUtil.format(pubDate);
            } else {
                this.pubRevision = this.revision;
            }
        }
        if (this.status == null) {
            throw new BuildException("no status provided: either provide it as parameter or through the ivy.status.default property");
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.organisation, this.module, this.revision);
        try {
            File fileResolveFile = getProject().resolveFile(IvyPatternHelper.substitute(this.srcivypattern, this.organisation, this.module, this.pubRevision, ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml"));
            if (this.publishivy && (!fileResolveFile.exists() || this.forcedeliver)) {
                IvyDeliver ivyDeliver = new IvyDeliver();
                ivyDeliver.setSettingsRef(getSettingsRef());
                ivyDeliver.setTaskName(getTaskName());
                ivyDeliver.setProject(getProject());
                ivyDeliver.setDeliverpattern(getSrcivypattern());
                ivyDeliver.setDelivertarget(this.deliverTarget);
                ivyDeliver.setDeliveryList(this.deliveryList);
                ivyDeliver.setModule(getModule());
                ivyDeliver.setOrganisation(getOrganisation());
                ivyDeliver.setPubdate(DateUtil.format(pubDate));
                ivyDeliver.setPubrevision(getPubrevision());
                ivyDeliver.setPubbranch(getPubbranch());
                ivyDeliver.setRevision(getRevision());
                ivyDeliver.setStatus(getStatus());
                ivyDeliver.setValidate(doValidate(settings));
                ivyDeliver.setReplacedynamicrev(isReplacedynamicrev());
                ivyDeliver.setMerge(this.merge);
                ivyDeliver.setConf(this.conf);
                ivyDeliver.execute();
            }
            List<String> list = this.artifactspattern;
            String str = this.publishResolverName;
            PublishOptions pubdate = new PublishOptions().setPubrevision(getPubrevision()).setPubbranch(getPubbranch()).setSrcIvyPattern(this.publishivy ? this.srcivypattern : null).setStatus(getStatus()).setPubdate(pubDate);
            Collection<Artifact> collection = this.artifacts;
            ivyInstance.publish(moduleRevisionIdNewInstance, list, str, pubdate.setExtraArtifacts((Artifact[]) collection.toArray(new Artifact[collection.size()])).setValidate(doValidate(settings)).setOverwrite(this.overwrite).setUpdate(this.update).setMerge(this.merge).setWarnOnMissing(this.warnonmissing).setHaltOnMissing(this.haltonmissing).setConfs(StringUtils.splitToArray(this.conf)));
        } catch (Exception e) {
            if (e instanceof BuildException) {
                throw e;
            }
            throw new BuildException("impossible to publish artifacts for " + moduleRevisionIdNewInstance + ": " + e, e);
        }
    }

    public PublishArtifact createArtifact() {
        PublishArtifact publishArtifact = new PublishArtifact();
        this.artifacts.add(publishArtifact);
        return publishArtifact;
    }

    public boolean isPublishivy() {
        return this.publishivy;
    }

    public void setPublishivy(boolean z) {
        this.publishivy = z;
    }

    public boolean isWarnonmissing() {
        return this.warnonmissing;
    }

    public void setWarnonmissing(boolean z) {
        this.warnonmissing = z;
    }

    public boolean isHaltonmissing() {
        return this.haltonmissing;
    }

    public void setHaltonmissing(boolean z) {
        this.haltonmissing = z;
    }

    public boolean isOverwrite() {
        return this.overwrite;
    }

    public void setOverwrite(boolean z) {
        this.overwrite = z;
    }

    public void setForcedeliver(boolean z) {
        this.forcedeliver = z;
    }

    public boolean isForcedeliver() {
        return this.forcedeliver;
    }

    public boolean isUpdate() {
        return this.update;
    }

    public void setUpdate(boolean z) {
        this.update = z;
    }

    /* loaded from: classes8.dex */
    public class PublishArtifact implements Artifact, DynamicAttribute {
        public String ext;
        public Map<String, String> extra = new HashMap();
        public String name;
        public String type;

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public String[] getConfigurations() {
            return null;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public ArtifactRevisionId getId() {
            return null;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public ModuleRevisionId getModuleRevisionId() {
            return null;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public Date getPublicationDate() {
            return null;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public URL getUrl() {
            return null;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public boolean isMetadata() {
            return false;
        }

        public PublishArtifact() {
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public String getExt() {
            String str = this.ext;
            return str == null ? this.type : str;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public String getName() {
            return this.name;
        }

        @Override // org.apache.ivy.core.module.descriptor.Artifact
        public String getType() {
            return this.type;
        }

        public void setExt(String str) {
            this.ext = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        @Override // org.apache.ivy.util.extendable.ExtendableItem
        public String getAttribute(String str) {
            return this.extra.get(str);
        }

        @Override // org.apache.ivy.util.extendable.ExtendableItem
        public Map<String, String> getAttributes() {
            return this.extra;
        }

        @Override // org.apache.ivy.util.extendable.ExtendableItem
        public String getExtraAttribute(String str) {
            return this.extra.get(str);
        }

        @Override // org.apache.ivy.util.extendable.ExtendableItem
        public Map<String, String> getExtraAttributes() {
            return this.extra;
        }

        @Override // org.apache.ivy.util.extendable.ExtendableItem
        public Map<String, String> getQualifiedExtraAttributes() {
            return this.extra;
        }

        public void setDynamicAttribute(String str, String str2) {
            this.extra.put(str, str2);
        }
    }

    public static class ArtifactsPattern {
        public String pattern;

        public String getPattern() {
            return this.pattern;
        }

        public void setPattern(String str) {
            this.pattern = str;
        }
    }
}
