package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.module.descriptor.DefaultExcludeRule;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolveProcessException;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.FilterHelper;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* loaded from: classes7.dex */
public class IvyResolve extends IvyTask {
    public File file = null;
    public String conf = null;
    public String organisation = null;
    public String module = null;
    public String branch = null;
    public String revision = null;
    public String pubdate = null;
    public boolean inline = false;
    public boolean haltOnFailure = true;
    public boolean showProgress = true;
    public boolean useCacheOnly = false;
    public String type = null;
    public boolean transitive = true;
    public boolean refresh = false;
    public boolean changing = false;
    public Boolean keep = null;
    public String failureProperty = null;
    public boolean useOrigin = false;
    public String resolveMode = null;
    public String resolveId = null;
    public String log = "default";
    public boolean checkIfChanged = true;
    public List<IvyDependency> dependencies = new ArrayList();
    public List<IvyExclude> excludes = new ArrayList();
    public List<IvyConflict> conflicts = new ArrayList();

    public boolean isUseOrigin() {
        return this.useOrigin;
    }

    public void setUseOrigin(boolean z) {
        this.useOrigin = z;
    }

    public String getDate() {
        return this.pubdate;
    }

    public void setDate(String str) {
        this.pubdate = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setCache(File file) {
        cacheAttributeNotSupported();
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isHaltonfailure() {
        return this.haltOnFailure;
    }

    public void setHaltonfailure(boolean z) {
        this.haltOnFailure = z;
    }

    public void setShowprogress(boolean z) {
        this.showProgress = z;
    }

    public boolean isUseCacheOnly() {
        return this.useCacheOnly;
    }

    public void setUseCacheOnly(boolean z) {
        this.useCacheOnly = z;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public void setRefresh(boolean z) {
        this.refresh = z;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String str) {
        this.log = str;
    }

    @Deprecated
    public void setFailurePropery(String str) {
        log("The 'failurepropery' attribute is deprecated. Please use the 'failureproperty' attribute instead", 1);
        setFailureProperty(str);
    }

    public void setFailureProperty(String str) {
        this.failureProperty = str;
    }

    public String getFailureProperty() {
        return this.failureProperty;
    }

    public IvyDependency createDependency() {
        IvyDependency ivyDependency = new IvyDependency();
        this.dependencies.add(ivyDependency);
        return ivyDependency;
    }

    public IvyExclude createExclude() {
        IvyExclude ivyExclude = new IvyExclude();
        this.excludes.add(ivyExclude);
        return ivyExclude;
    }

    public IvyConflict createConflict() {
        IvyConflict ivyConflict = new IvyConflict();
        this.conflicts.add(ivyConflict);
        return ivyConflict;
    }

    @Override // org.apache.ivy.ant.IvyTask
    public void prepareTask() {
        super.prepareTask();
        Message.setShowProgress(this.showProgress);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        IvyResolve ivyResolve;
        IvyResolve ivyResolve2;
        ResolveReport resolveReportResolve;
        Boolean boolValueOf;
        String str;
        String str2 = "ivy.organisation";
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        try {
            this.conf = getProperty(this.conf, settings, "ivy.configurations");
            this.type = getProperty(this.type, settings, "ivy.resolve.default.type.filter");
            String[] strArrSplitToArray = StringUtils.splitToArray(this.conf);
            String str3 = "].branch";
            try {
                if (!this.dependencies.isEmpty() || !this.excludes.isEmpty() || !this.conflicts.isEmpty()) {
                    if (isInline()) {
                        throw new BuildException("the inline mode is incompatible with child elements");
                    }
                    if (this.organisation != null) {
                        throw new BuildException("'organisation' is not allowed with child elements");
                    }
                    if (this.module != null) {
                        throw new BuildException("'module' is not allowed with child elements");
                    }
                    if (this.file != null) {
                        throw new BuildException("'file' not allowed with child elements");
                    }
                    if (!getAllowedLogOptions().contains(this.log)) {
                        throw new BuildException("invalid option for 'log': " + this.log + ". Available options are " + getAllowedLogOptions());
                    }
                    DefaultModuleDescriptor defaultModuleDescriptorNewBasicInstance = DefaultModuleDescriptor.newBasicInstance(ModuleRevisionId.newInstance("", "", Ivy.getWorkingRevision()), null);
                    Iterator<IvyDependency> it = this.dependencies.iterator();
                    while (it.hasNext()) {
                        defaultModuleDescriptorNewBasicInstance.addDependency(it.next().asDependencyDescriptor(defaultModuleDescriptorNewBasicInstance, "default", settings));
                    }
                    Iterator<IvyExclude> it2 = this.excludes.iterator();
                    while (it2.hasNext()) {
                        DefaultExcludeRule defaultExcludeRuleAsRule = it2.next().asRule(settings);
                        defaultExcludeRuleAsRule.addConfiguration("default");
                        defaultModuleDescriptorNewBasicInstance.addExcludeRule(defaultExcludeRuleAsRule);
                    }
                    Iterator<IvyConflict> it3 = this.conflicts.iterator();
                    while (it3.hasNext()) {
                        it3.next().addConflict(defaultModuleDescriptorNewBasicInstance, settings);
                    }
                    resolveReportResolve = ivyInstance.resolve(defaultModuleDescriptorNewBasicInstance, getResolveOptions(ivyInstance, new String[]{"default"}, settings));
                } else if (isInline()) {
                    if (this.organisation == null) {
                        throw new BuildException("'organisation' is required when using inline mode");
                    }
                    if (this.module == null) {
                        throw new BuildException("'module' is required when using inline mode");
                    }
                    if (this.file != null) {
                        throw new BuildException("'file' not allowed when using inline mode");
                    }
                    if (!getAllowedLogOptions().contains(this.log)) {
                        throw new BuildException("invalid option for 'log': " + this.log + ". Available options are " + getAllowedLogOptions());
                    }
                    for (int i = 0; i < strArrSplitToArray.length; i++) {
                        if ("*".equals(strArrSplitToArray[i])) {
                            strArrSplitToArray[i] = "*(public)";
                        }
                    }
                    if (this.revision == null) {
                        this.revision = "latest.integration";
                    }
                    resolveReportResolve = ivyInstance.resolve(ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision), getResolveOptions(ivyInstance, strArrSplitToArray, settings), this.changing);
                } else {
                    if (this.organisation != null) {
                        throw new BuildException("'organisation' not allowed when not using 'org' attribute");
                    }
                    if (this.module != null) {
                        throw new BuildException("'module' not allowed when not using 'org' attribute");
                    }
                    if (this.file == null) {
                        this.file = getProject().resolveFile(getProperty(settings, "ivy.dep.file"));
                    }
                    resolveReportResolve = ivyInstance.resolve(this.file.toURI().toURL(), getResolveOptions(ivyInstance, strArrSplitToArray, settings));
                }
                if (resolveReportResolve.hasError()) {
                    if (this.failureProperty != null) {
                        getProject().setProperty(this.failureProperty, "true");
                    }
                    if (isHaltonfailure()) {
                        throw new BuildException("resolve failed - see output for details");
                    }
                }
                setResolved(resolveReportResolve, this.resolveId, isKeep());
                String[] configurations = resolveReportResolve.getConfigurations();
                if (isKeep()) {
                    ModuleDescriptor moduleDescriptor = resolveReportResolve.getModuleDescriptor();
                    String organisation = moduleDescriptor.getModuleRevisionId().getOrganisation();
                    String name = moduleDescriptor.getModuleRevisionId().getName();
                    String revision = moduleDescriptor.getResolvedModuleRevisionId().getRevision();
                    try {
                        getProject().setProperty("ivy.organisation", organisation);
                        settings.setVariable("ivy.organisation", organisation);
                        getProject().setProperty("ivy.module", name);
                        settings.setVariable("ivy.module", name);
                        getProject().setProperty("ivy.revision", revision);
                        settings.setVariable("ivy.revision", revision);
                        List listAsList = Arrays.asList(moduleDescriptor.getInheritedDescriptors());
                        Iterator it4 = listAsList.iterator();
                        while (it4.hasNext()) {
                            ExtendsDescriptor extendsDescriptor = (ExtendsDescriptor) it4.next();
                            int iIndexOf = listAsList.indexOf(extendsDescriptor);
                            List list = listAsList;
                            String organisation2 = extendsDescriptor.getResolvedParentRevisionId().getOrganisation();
                            Iterator it5 = it4;
                            String name2 = extendsDescriptor.getResolvedParentRevisionId().getName();
                            String str4 = revision;
                            String revision2 = extendsDescriptor.getResolvedParentRevisionId().getRevision();
                            String branch = extendsDescriptor.getResolvedParentRevisionId().getBranch();
                            String str5 = name;
                            String str6 = organisation;
                            getProject().setProperty("ivy.parent[" + iIndexOf + "].organisation", organisation2);
                            settings.setVariable("ivy.parent[" + iIndexOf + "].organisation", organisation2);
                            getProject().setProperty("ivy.parent[" + iIndexOf + "].module", name2);
                            settings.setVariable("ivy.parent[" + iIndexOf + "].module", name2);
                            getProject().setProperty("ivy.parent[" + iIndexOf + "].revision", revision2);
                            settings.setVariable("ivy.parent[" + iIndexOf + "].revision", revision2);
                            if (branch != null) {
                                Project project = getProject();
                                StringBuilder sb = new StringBuilder();
                                sb.append("ivy.parent[");
                                sb.append(iIndexOf);
                                str = str3;
                                sb.append(str);
                                project.setProperty(sb.toString(), branch);
                                settings.setVariable("ivy.parent[" + iIndexOf + str, branch);
                            } else {
                                str = str3;
                            }
                            str3 = str;
                            name = str5;
                            listAsList = list;
                            it4 = it5;
                            revision = str4;
                            organisation = str6;
                        }
                        String str7 = revision;
                        String str8 = organisation;
                        String str9 = name;
                        getProject().setProperty("ivy.parents.count", String.valueOf(moduleDescriptor.getInheritedDescriptors().length));
                        settings.setVariable("ivy.parents.count", String.valueOf(moduleDescriptor.getInheritedDescriptors().length));
                        if (getCheckIfChanged()) {
                            boolValueOf = Boolean.valueOf(resolveReportResolve.hasChanged());
                            getProject().setProperty("ivy.deps.changed", boolValueOf.toString());
                            settings.setVariable("ivy.deps.changed", boolValueOf.toString());
                        } else {
                            boolValueOf = null;
                        }
                        getProject().setProperty("ivy.resolved.configurations", mergeConfs(configurations));
                        settings.setVariable("ivy.resolved.configurations", mergeConfs(configurations));
                        if (this.file != null) {
                            getProject().setProperty("ivy.resolved.file", this.file.getAbsolutePath());
                            settings.setVariable("ivy.resolved.file", this.file.getAbsolutePath());
                        }
                        if (this.resolveId != null) {
                            getProject().setProperty("ivy.organisation." + this.resolveId, str8);
                            settings.setVariable("ivy.organisation." + this.resolveId, str8);
                            getProject().setProperty("ivy.module." + this.resolveId, str9);
                            settings.setVariable("ivy.module." + this.resolveId, str9);
                            getProject().setProperty("ivy.revision." + this.resolveId, str7);
                            settings.setVariable("ivy.revision." + this.resolveId, str7);
                            if (getCheckIfChanged()) {
                                getProject().setProperty("ivy.deps.changed." + this.resolveId, boolValueOf.toString());
                                settings.setVariable("ivy.deps.changed." + this.resolveId, boolValueOf.toString());
                            }
                            getProject().setProperty("ivy.resolved.configurations." + this.resolveId, mergeConfs(configurations));
                            settings.setVariable("ivy.resolved.configurations." + this.resolveId, mergeConfs(configurations));
                            if (this.file != null) {
                                getProject().setProperty("ivy.resolved.file." + this.resolveId, this.file.getAbsolutePath());
                                settings.setVariable("ivy.resolved.file." + this.resolveId, this.file.getAbsolutePath());
                            }
                        }
                    } catch (MalformedURLException e) {
                        e = e;
                        ivyResolve2 = this;
                        MalformedURLException malformedURLException = e;
                        throw new BuildException("unable to convert given ivy file to url: " + ivyResolve2.file + ": " + malformedURLException, malformedURLException);
                    } catch (ParseException e2) {
                        e = e2;
                        ivyResolve = this;
                        ParseException parseException = e;
                        ivyResolve.log(parseException.getMessage(), 0);
                        throw new BuildException("syntax errors in ivy file: " + parseException, parseException);
                    } catch (ResolveProcessException e3) {
                        e = e3;
                        ResolveProcessException resolveProcessException = e;
                        throw new BuildException("impossible to resolve dependencies:\n\t" + resolveProcessException.getMessage(), resolveProcessException);
                    } catch (Exception e4) {
                        e = e4;
                        Exception exc = e;
                        throw new BuildException("impossible to resolve dependencies:\n\t" + exc, exc);
                    }
                }
            } catch (MalformedURLException e5) {
                e = e5;
                ivyResolve2 = str2;
            } catch (ParseException e6) {
                e = e6;
                ivyResolve = str2;
            } catch (ResolveProcessException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (MalformedURLException e9) {
            e = e9;
            ivyResolve2 = this;
        } catch (ParseException e10) {
            e = e10;
            ivyResolve = this;
        } catch (ResolveProcessException e11) {
            e = e11;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public Collection<String> getAllowedLogOptions() {
        return Arrays.asList("default", LogOptions.LOG_DOWNLOAD_ONLY, LogOptions.LOG_QUIET);
    }

    public final ResolveOptions getResolveOptions(Ivy ivy, String[] strArr, IvySettings ivySettings) {
        if (this.useOrigin) {
            ivySettings.useDeprecatedUseOrigin();
        }
        return ((ResolveOptions) new ResolveOptions().setLog(this.log)).setConfs(strArr).setValidate(doValidate(ivySettings)).setArtifactFilter(FilterHelper.getArtifactTypeFilter(this.type)).setRevision(this.revision).setDate(IvyTask.getPubDate(this.pubdate, null)).setUseCacheOnly(this.useCacheOnly).setRefresh(this.refresh).setTransitive(this.transitive).setResolveMode(this.resolveMode).setResolveId(this.resolveId).setCheckIfChanged(this.checkIfChanged);
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

    public boolean isTransitive() {
        return this.transitive;
    }

    public void setTransitive(boolean z) {
        this.transitive = z;
    }

    public boolean isChanging() {
        return this.changing;
    }

    public void setChanging(boolean z) {
        this.changing = z;
    }

    public boolean isKeep() {
        Boolean bool = this.keep;
        return bool == null ? this.organisation == null : bool.booleanValue();
    }

    public void setKeep(boolean z) {
        this.keep = Boolean.valueOf(z);
    }

    public boolean isInline() {
        return this.inline;
    }

    public void setInline(boolean z) {
        this.inline = z;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public void setResolveId(String str) {
        this.resolveId = str;
    }

    public String getResolveMode() {
        return this.resolveMode;
    }

    public void setResolveMode(String str) {
        this.resolveMode = str;
    }

    public boolean getCheckIfChanged() {
        return this.checkIfChanged;
    }

    public void setCheckIfChanged(boolean z) {
        this.checkIfChanged = z;
    }
}
