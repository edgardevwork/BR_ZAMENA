package org.apache.ivy.ant;

import java.io.File;
import java.util.Date;
import org.apache.commons.lang3.SystemUtils;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.deliver.DefaultPublishingDRResolver;
import org.apache.ivy.core.deliver.DeliverOptions;
import org.apache.ivy.core.deliver.PublishingDependencyRevisionResolver;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.CallTarget;
import org.apache.tools.ant.taskdefs.Echo;
import org.apache.tools.ant.taskdefs.Input;
import org.apache.tools.ant.taskdefs.Property;

/* loaded from: classes7.dex */
public class IvyDeliver extends IvyTask {
    public String conf;
    public String deliverTarget;
    public String deliverpattern;
    public File deliveryList;
    public String module;
    public String organisation;
    public String pubBranch;
    public String pubRevision;
    public String pubdate;
    public String resolveId;
    public String revision;
    public String status;
    public boolean replacedynamicrev = true;
    public boolean replaceForcedRev = false;
    public boolean generateRevConstraint = true;
    public boolean merge = true;

    /* loaded from: classes8.dex */
    public final class DeliverDRResolver extends DefaultPublishingDRResolver {
        public DeliverDRResolver() {
        }

        @Override // org.apache.ivy.core.deliver.DefaultPublishingDRResolver, org.apache.ivy.core.deliver.PublishingDependencyRevisionResolver
        public String resolve(ModuleDescriptor moduleDescriptor, String str, ModuleRevisionId moduleRevisionId, String str2) {
            if (StatusManager.getCurrent().isIntegration(str)) {
                return super.resolve(moduleDescriptor, str, moduleRevisionId, str2);
            }
            if (!StatusManager.getCurrent().isIntegration(str2)) {
                return super.resolve(moduleDescriptor, str, moduleRevisionId, str2);
            }
            String str3 = moduleRevisionId.getName() + "." + moduleRevisionId.getRevision() + ".status";
            String str4 = moduleRevisionId.getName() + "." + moduleRevisionId.getRevision() + ".version";
            String str5 = moduleRevisionId.getName() + "." + moduleRevisionId.getRevision() + ".delivered";
            String property = IvyDeliver.this.getProject().getProperty(str4);
            String property2 = IvyDeliver.this.getProject().getProperty(str3);
            String property3 = IvyDeliver.this.getProject().getProperty(str5);
            Message.debug("found version = " + property + " status=" + property2 + " delivered=" + property3);
            if (property != null && property2 != null) {
                if ("true".equals(property3)) {
                    return property;
                }
                deliverDependency(moduleRevisionId, property, property2, str2);
                IvyDeliver.this.loadDeliveryList();
                return property;
            }
            String property4 = IvyDeliver.this.getProject().getProperty("recursive.delivery.version");
            String property5 = IvyDeliver.this.getProject().getProperty("recursive.delivery.status");
            if (property4 != null && property5 != null) {
                String property6 = IvyDeliver.this.getProject().getProperty("recursive." + moduleRevisionId.getName() + ".delivered");
                Message.debug("found global version = " + property4 + " and global status=" + property5 + " - delivered = " + property6);
                if ("true".equals(property6)) {
                    return property4;
                }
                IvyDeliver.this.getProject().setProperty(str3, property5);
                deliverDependency(moduleRevisionId, property4, property5, str2);
                IvyDeliver.this.loadDeliveryList();
                return property4;
            }
            Input inputCreateTask = IvyDeliver.this.getProject().createTask("input");
            inputCreateTask.setOwningTarget(IvyDeliver.this.getOwningTarget());
            inputCreateTask.init();
            inputCreateTask.setMessage(moduleRevisionId.getName() + " " + moduleRevisionId.getRevision() + ": please enter a status: ");
            inputCreateTask.setValidargs(StatusManager.getCurrent().getDeliveryStatusListString());
            inputCreateTask.setAddproperty(str3);
            inputCreateTask.perform();
            String property7 = IvyDeliver.this.getProject().getProperty(str3);
            IvyDeliver.this.appendDeliveryList(str3 + " = " + property7);
            inputCreateTask.setMessage(moduleRevisionId.getName() + " " + moduleRevisionId.getRevision() + ": please enter a version: ");
            inputCreateTask.setValidargs((String) null);
            inputCreateTask.setAddproperty(str4);
            inputCreateTask.perform();
            String property8 = IvyDeliver.this.getProject().getProperty(str4);
            IvyDeliver.this.appendDeliveryList(str4 + " = " + property8);
            deliverDependency(moduleRevisionId, property8, property7, str2);
            IvyDeliver.this.loadDeliveryList();
            return property8;
        }

        public void deliverDependency(ModuleRevisionId moduleRevisionId, String str, String str2, String str3) {
            if (StringUtils.isNullOrEmpty(IvyDeliver.this.deliverTarget)) {
                return;
            }
            CallTarget callTargetCreateTask = IvyDeliver.this.getProject().createTask("antcall");
            callTargetCreateTask.setOwningTarget(IvyDeliver.this.getOwningTarget());
            callTargetCreateTask.init();
            callTargetCreateTask.setTarget(IvyDeliver.this.deliverTarget);
            callTargetCreateTask.setInheritAll(true);
            callTargetCreateTask.setInheritRefs(true);
            Property propertyCreateParam = callTargetCreateTask.createParam();
            propertyCreateParam.setName("dependency.name");
            propertyCreateParam.setValue(moduleRevisionId.getName());
            Property propertyCreateParam2 = callTargetCreateTask.createParam();
            propertyCreateParam2.setName("dependency.published.status");
            propertyCreateParam2.setValue(str2);
            Property propertyCreateParam3 = callTargetCreateTask.createParam();
            propertyCreateParam3.setName("dependency.published.version");
            propertyCreateParam3.setValue(str);
            Property propertyCreateParam4 = callTargetCreateTask.createParam();
            propertyCreateParam4.setName("dependency.version");
            propertyCreateParam4.setValue(moduleRevisionId.getRevision());
            Property propertyCreateParam5 = callTargetCreateTask.createParam();
            propertyCreateParam5.setName("dependency.status");
            if (str3 == null) {
                str3 = "null";
            }
            propertyCreateParam5.setValue(str3);
            callTargetCreateTask.perform();
            String str4 = moduleRevisionId.getName() + "." + moduleRevisionId.getRevision() + ".delivered";
            IvyDeliver.this.getProject().setProperty(str4, "true");
            IvyDeliver.this.appendDeliveryList(str4 + " = true");
            IvyDeliver.this.getProject().setProperty("recursive." + moduleRevisionId.getName() + ".delivered", "true");
            IvyDeliver.this.appendDeliveryList("recursive." + moduleRevisionId.getName() + ".delivered = true");
        }
    }

    public void setCache(File file) {
        cacheAttributeNotSupported();
    }

    public String getDeliverpattern() {
        return this.deliverpattern;
    }

    public void setDeliverpattern(String str) {
        this.deliverpattern = str;
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

    public void setDelivertarget(String str) {
        this.deliverTarget = str;
    }

    public void setDeliveryList(File file) {
        this.deliveryList = file;
    }

    public boolean isReplacedynamicrev() {
        return this.replacedynamicrev;
    }

    public void setReplacedynamicrev(boolean z) {
        this.replacedynamicrev = z;
    }

    public boolean isReplaceForcedRev() {
        return this.replaceForcedRev;
    }

    public void setReplaceForcedRev(boolean z) {
        this.replaceForcedRev = z;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public void setResolveId(String str) {
        this.resolveId = str;
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public boolean isGenerateRevConstraint() {
        return this.generateRevConstraint;
    }

    public void setGenerateRevConstraint(boolean z) {
        this.generateRevConstraint = z;
    }

    public boolean isMerge() {
        return this.merge;
    }

    public void setMerge(boolean z) {
        this.merge = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws Throwable {
        PublishingDependencyRevisionResolver deliverDRResolver;
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        this.organisation = getProperty(this.organisation, settings, "ivy.organisation", this.resolveId);
        this.module = getProperty(this.module, settings, "ivy.module", this.resolveId);
        this.revision = getProperty(this.revision, settings, "ivy.revision", this.resolveId);
        this.pubBranch = getProperty(this.pubBranch, settings, "ivy.deliver.branch");
        this.pubRevision = getProperty(this.pubRevision, settings, "ivy.deliver.revision");
        this.deliverpattern = getProperty(this.deliverpattern, settings, "ivy.deliver.ivy.pattern");
        this.status = getProperty(this.status, settings, "ivy.status");
        if (this.deliveryList == null) {
            String property = getProperty(settings, "ivy.delivery.list.file");
            if (property == null) {
                this.deliveryList = new File(System.getProperty(SystemUtils.JAVA_IO_TMPDIR_KEY) + "/delivery.properties");
            } else {
                this.deliveryList = getProject().resolveFile(settings.substitute(property));
            }
        }
        if (this.resolveId == null) {
            if (this.organisation == null) {
                throw new BuildException("no organisation provided for ivy deliver task: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property or a prior call to <resolve/>");
            }
            if (this.module == null) {
                throw new BuildException("no module name provided for ivy deliver task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
            }
        }
        if (this.revision == null) {
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
        if (this.deliverpattern == null) {
            throw new BuildException("deliver ivy pattern is missing: either provide it as parameters or through ivy.deliver.ivy.pattern properties");
        }
        if (this.status == null) {
            throw new BuildException("no status provided: either provide it as parameter or through the ivy.status.default property");
        }
        ModuleRevisionId moduleRevisionIdNewInstance = this.resolveId == null ? ModuleRevisionId.newInstance(this.organisation, this.module, this.revision) : null;
        boolean z = false;
        try {
            try {
                boolean z2 = !this.deliveryList.exists();
                try {
                    loadDeliveryList();
                    if (StringUtils.isNullOrEmpty(this.deliverTarget)) {
                        deliverDRResolver = new DefaultPublishingDRResolver();
                    } else {
                        deliverDRResolver = new DeliverDRResolver();
                    }
                    DeliverOptions pubBranch = new DeliverOptions(this.status, pubDate, deliverDRResolver, doValidate(settings), this.replacedynamicrev, StringUtils.splitToArray(this.conf)).setResolveId(this.resolveId).setReplaceForcedRevisions(isReplaceForcedRev()).setGenerateRevConstraint(this.generateRevConstraint).setMerge(this.merge).setPubBranch(this.pubBranch);
                    if (moduleRevisionIdNewInstance == null) {
                        ivyInstance.deliver(this.pubRevision, this.deliverpattern, pubBranch);
                    } else {
                        ivyInstance.deliver(moduleRevisionIdNewInstance, this.pubRevision, this.deliverpattern, pubBranch);
                    }
                    if (z2 && this.deliveryList.exists()) {
                        this.deliveryList.delete();
                    }
                } catch (Exception e) {
                    e = e;
                    z = z2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("impossible to deliver ");
                    Object obj = moduleRevisionIdNewInstance;
                    if (moduleRevisionIdNewInstance == null) {
                        obj = this.resolveId;
                    }
                    sb.append(obj);
                    sb.append(": ");
                    sb.append(e);
                    throw new BuildException(sb.toString(), e);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z && this.deliveryList.exists()) {
                        this.deliveryList.delete();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void loadDeliveryList() {
        Property propertyCreateTask = getProject().createTask("property");
        propertyCreateTask.setOwningTarget(getOwningTarget());
        propertyCreateTask.init();
        propertyCreateTask.setFile(this.deliveryList);
        propertyCreateTask.perform();
    }

    public final void appendDeliveryList(String str) {
        Echo echoCreateTask = getProject().createTask("echo");
        echoCreateTask.setOwningTarget(getOwningTarget());
        echoCreateTask.init();
        echoCreateTask.setFile(this.deliveryList);
        echoCreateTask.setMessage(str + org.apache.commons.lang3.StringUtils.f9903LF);
        echoCreateTask.setAppend(true);
        echoCreateTask.perform();
    }
}
