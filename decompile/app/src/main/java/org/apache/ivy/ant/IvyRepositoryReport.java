package org.apache.ivy.ant;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.report.XmlReportOutputter;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.XSLTProcess;

/* loaded from: classes7.dex */
public class IvyRepositoryReport extends IvyTask {
    public String branch;
    public String module;
    public File todir;
    public String xslFile;
    public String organisation = "*";
    public String revision = "latest.integration";
    public String matcher = PatternMatcher.EXACT_OR_REGEXP;
    public boolean graph = false;
    public boolean dot = false;
    public boolean xml = true;
    public boolean xsl = false;
    public String outputname = "ivy-repository-report";
    public String xslext = "html";
    public final List<XSLTProcess.Param> params = new ArrayList();

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        ModuleRevisionId moduleRevisionId;
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        if (this.xsl && this.xslFile == null) {
            throw new BuildException("xsl file is mandatory when using xsl generation");
        }
        if (this.module == null && PatternMatcher.EXACT.equals(this.matcher)) {
            throw new BuildException("no module name provided for ivy repository graph task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
        }
        if (this.module == null && !PatternMatcher.EXACT.equals(this.matcher)) {
            this.module = "*";
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.organisation, this.module, this.revision);
        try {
            if (this.revision == null || settings.getVersionMatcher().isDynamic(moduleRevisionIdNewInstance)) {
                moduleRevisionId = new ModuleRevisionId(new ModuleId(this.organisation, this.module), this.branch, "*");
            } else {
                moduleRevisionId = new ModuleRevisionId(new ModuleId(this.organisation, this.module), this.branch, this.revision);
            }
            ModuleRevisionId[] moduleRevisionIdArrListModules = ivyInstance.listModules(moduleRevisionId, settings.getMatcher(this.matcher));
            HashSet hashSet = new HashSet();
            for (ModuleRevisionId moduleRevisionId2 : moduleRevisionIdArrListModules) {
                hashSet.add(ModuleRevisionId.newInstance(moduleRevisionId2, this.revision));
            }
            DefaultModuleDescriptor defaultModuleDescriptorNewCallerInstance = DefaultModuleDescriptor.newCallerInstance((ModuleRevisionId[]) hashSet.toArray(new ModuleRevisionId[hashSet.size()]), true, false);
            String defaultResolveId = ResolveOptions.getDefaultResolveId(defaultModuleDescriptorNewCallerInstance);
            ResolveReport resolveReportResolve = ivyInstance.resolve(defaultModuleDescriptorNewCallerInstance, new ResolveOptions().setResolveId(defaultResolveId).setValidate(doValidate(settings)));
            ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
            new XmlReportOutputter().output(resolveReportResolve, resolutionCacheManager, new ResolveOptions());
            if (this.graph) {
                gengraph(resolutionCacheManager, defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getOrganisation(), defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getName());
            }
            if (this.dot) {
                gendot(resolutionCacheManager, defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getOrganisation(), defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getName());
            }
            if (this.xml) {
                FileUtil.copy(resolutionCacheManager.getConfigurationResolveReportInCache(defaultResolveId, "default"), new File(getTodir(), this.outputname + ActivityChooserModel.HISTORY_FILE_EXTENSION), (CopyProgressListener) null);
            }
            if (this.xsl) {
                genreport(resolutionCacheManager, defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getOrganisation(), defaultModuleDescriptorNewCallerInstance.getModuleRevisionId().getName());
            }
        } catch (Exception e) {
            throw new BuildException("impossible to generate graph for " + moduleRevisionIdNewInstance + ": " + e, e);
        }
    }

    public final void genreport(ResolutionCacheManager resolutionCacheManager, String str, String str2) {
        XSLTProcess xSLTProcess = new XSLTProcess();
        xSLTProcess.setTaskName(getTaskName());
        xSLTProcess.setProject(getProject());
        xSLTProcess.init();
        xSLTProcess.setIn(resolutionCacheManager.getConfigurationResolveReportInCache(ResolveOptions.getDefaultResolveId(new ModuleId(str, str2)), "default"));
        xSLTProcess.setOut(new File(getTodir(), this.outputname + "." + this.xslext));
        xSLTProcess.setStyle(this.xslFile);
        XSLTProcess.Param paramCreateParam = xSLTProcess.createParam();
        paramCreateParam.setName("extension");
        paramCreateParam.setExpression(this.xslext);
        for (XSLTProcess.Param param : this.params) {
            XSLTProcess.Param paramCreateParam2 = xSLTProcess.createParam();
            paramCreateParam2.setName(param.getName());
            paramCreateParam2.setExpression(param.getExpression());
        }
        xSLTProcess.execute();
    }

    public final void gengraph(ResolutionCacheManager resolutionCacheManager, String str, String str2) throws IOException {
        gen(resolutionCacheManager, str, str2, getGraphStylePath(resolutionCacheManager.getResolutionCacheRoot()), "graphml");
    }

    public final String getGraphStylePath(File file) throws IOException {
        File file2 = new File(file, "ivy-report-graph-all.xsl");
        FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report-graph-all.xsl"), file2, (CopyProgressListener) null);
        return file2.getAbsolutePath();
    }

    public final void gendot(ResolutionCacheManager resolutionCacheManager, String str, String str2) throws IOException {
        gen(resolutionCacheManager, str, str2, getDotStylePath(resolutionCacheManager.getResolutionCacheRoot()), TtmlNode.TEXT_EMPHASIS_MARK_DOT);
    }

    public final String getDotStylePath(File file) throws IOException {
        File file2 = new File(file, "ivy-report-dot-all.xsl");
        FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report-dot-all.xsl"), file2, (CopyProgressListener) null);
        return file2.getAbsolutePath();
    }

    public final void gen(ResolutionCacheManager resolutionCacheManager, String str, String str2, String str3, String str4) {
        XSLTProcess xSLTProcess = new XSLTProcess();
        xSLTProcess.setTaskName(getTaskName());
        xSLTProcess.setProject(getProject());
        xSLTProcess.init();
        xSLTProcess.setIn(resolutionCacheManager.getConfigurationResolveReportInCache(ResolveOptions.getDefaultResolveId(new ModuleId(str, str2)), "default"));
        xSLTProcess.setOut(new File(getTodir(), this.outputname + "." + str4));
        xSLTProcess.setBasedir(resolutionCacheManager.getResolutionCacheRoot());
        xSLTProcess.setStyle(str3);
        xSLTProcess.execute();
    }

    public File getTodir() {
        if (this.todir == null && getProject() != null) {
            return getProject().getBaseDir();
        }
        return this.todir;
    }

    public void setTodir(File file) {
        this.todir = file;
    }

    public boolean isGraph() {
        return this.graph;
    }

    public void setGraph(boolean z) {
        this.graph = z;
    }

    public String getXslfile() {
        return this.xslFile;
    }

    public void setXslfile(String str) {
        this.xslFile = str;
    }

    public boolean isXml() {
        return this.xml;
    }

    public void setXml(boolean z) {
        this.xml = z;
    }

    public boolean isXsl() {
        return this.xsl;
    }

    public void setXsl(boolean z) {
        this.xsl = z;
    }

    public String getXslext() {
        return this.xslext;
    }

    public void setXslext(String str) {
        this.xslext = str;
    }

    public XSLTProcess.Param createParam() {
        XSLTProcess.Param param = new XSLTProcess.Param();
        this.params.add(param);
        return param;
    }

    public String getOutputname() {
        return this.outputname;
    }

    public void setOutputname(String str) {
        this.outputname = str;
    }

    public void setCache(File file) {
        cacheAttributeNotSupported();
    }

    public String getMatcher() {
        return this.matcher;
    }

    public void setMatcher(String str) {
        this.matcher = str;
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

    public boolean isDot() {
        return this.dot;
    }

    public void setDot(boolean z) {
        this.dot = z;
    }
}
