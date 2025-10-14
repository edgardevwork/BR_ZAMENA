package org.apache.ivy.ant;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.report.XmlReportOutputter;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.XSLTProcess;
import org.apache.tools.ant.util.JAXPUtils;

/* loaded from: classes7.dex */
public class IvyReport extends IvyTask {
    public String conf;
    public ModuleRevisionId mRevId;
    public String module;
    public String organisation;
    public String outputpattern;
    public String resolveId;
    public File todir;
    public File xslFile;
    public boolean graph = true;
    public boolean dot = false;
    public boolean xml = false;
    public boolean xsl = true;
    public String xslext = "html";
    public final List<XSLTProcess.Param> params = new ArrayList();

    public File getTodir() {
        return this.todir;
    }

    public void setTodir(File file) {
        this.todir = file;
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

    public boolean isGraph() {
        return this.graph;
    }

    public void setGraph(boolean z) {
        this.graph = z;
    }

    public File getXslfile() {
        return this.xslFile;
    }

    public void setXslfile(File file) {
        this.xslFile = file;
    }

    public String getOutputpattern() {
        return this.outputpattern;
    }

    public void setOutputpattern(String str) {
        this.outputpattern = str;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public void setResolveId(String str) {
        this.resolveId = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        String property;
        IvySettings settings = getIvyInstance().getSettings();
        String property2 = getProperty(this.conf, settings, "ivy.resolved.configurations", this.resolveId);
        this.conf = property2;
        if ("*".equals(property2)) {
            this.conf = getProperty(settings, "ivy.resolved.configurations", this.resolveId);
        }
        if (this.conf == null) {
            throw new BuildException("no conf provided for ivy report task: It can either be set explicitly via the attribute 'conf' or via 'ivy.resolved.configurations' property or a prior call to <resolve/>");
        }
        if (this.todir == null && (property = getProperty(settings, "ivy.report.todir")) != null) {
            this.todir = getProject().resolveFile(property);
        }
        File file = this.todir;
        if (file != null && file.exists()) {
            this.todir.mkdirs();
        }
        String property3 = getProperty(this.outputpattern, settings, "ivy.report.output.pattern");
        this.outputpattern = property3;
        if (property3 == null) {
            this.outputpattern = "[organisation]-[module]-[conf].[ext]";
        }
        File file2 = this.todir;
        if (file2 != null && file2.exists() && !this.todir.isDirectory()) {
            throw new BuildException("destination directory should be a directory !");
        }
        String str = this.resolveId;
        if (str == null) {
            this.organisation = getProperty(this.organisation, settings, "ivy.organisation", str);
            String property4 = getProperty(this.module, settings, "ivy.module", this.resolveId);
            this.module = property4;
            if (this.organisation == null) {
                throw new BuildException("no organisation provided for ivy report task: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property or a prior call to <resolve/>");
            }
            if (property4 == null) {
                throw new BuildException("no module name provided for ivy report task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
            }
            this.resolveId = ResolveOptions.getDefaultResolveId(new ModuleId(this.organisation, this.module));
        }
        try {
            String[] strArrSplitToArray = StringUtils.splitToArray(this.conf);
            if (this.xsl) {
                genreport(strArrSplitToArray);
            }
            if (this.xml) {
                genxml(strArrSplitToArray);
            }
            if (this.graph) {
                genStyled(strArrSplitToArray, getStylePath("ivy-report-graph.xsl"), "graphml");
            }
            if (this.dot) {
                genStyled(strArrSplitToArray, getStylePath("ivy-report-dot.xsl"), TtmlNode.TEXT_EMPHASIS_MARK_DOT);
            }
        } catch (IOException e) {
            throw new BuildException("impossible to generate report: " + e, e);
        }
    }

    public final void genxml(String[] strArr) throws IOException {
        File file;
        ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
        for (String str : strArr) {
            File configurationResolveReportInCache = resolutionCacheManager.getConfigurationResolveReportInCache(this.resolveId, str);
            if (this.todir == null) {
                file = getProject().resolveFile(getOutputPattern(str, "xml"));
            } else {
                file = new File(this.todir, getOutputPattern(str, "xml"));
            }
            FileUtil.copy(configurationResolveReportInCache, file, (CopyProgressListener) null);
        }
    }

    public final void genreport(String[] strArr) throws IOException, BuildException {
        File file;
        genStyled(strArr, getReportStylePath(), this.xslext);
        if (this.xslFile == null) {
            if (this.todir == null) {
                file = getProject().resolveFile("ivy-report.css");
            } else {
                file = new File(this.todir, "ivy-report.css");
            }
            if (file.exists()) {
                return;
            }
            Message.debug("copying report css to " + file.getAbsolutePath());
            FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report.css"), file, (CopyProgressListener) null);
        }
    }

    public final File getReportStylePath() throws IOException {
        File file = this.xslFile;
        if (file != null) {
            return file;
        }
        File file2 = new File(getIvyInstance().getResolutionCacheManager().getResolutionCacheRoot(), "ivy-report.xsl");
        if (!file2.exists()) {
            Message.debug("copying ivy-report.xsl to " + file2.getAbsolutePath());
            FileUtil.copy(XmlReportOutputter.class.getResourceAsStream("ivy-report.xsl"), file2, (CopyProgressListener) null);
        }
        return file2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final String getOutputPattern(String str, String str2) throws BuildException {
        if (this.mRevId == null) {
            ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
            XmlReportParser xmlReportParser = new XmlReportParser();
            File configurationResolveReportInCache = resolutionCacheManager.getConfigurationResolveReportInCache(this.resolveId, str);
            try {
                xmlReportParser.parse(configurationResolveReportInCache);
                this.mRevId = xmlReportParser.getResolvedModule();
            } catch (ParseException e) {
                throw new BuildException("Error occurred while parsing reportfile '" + configurationResolveReportInCache.getAbsolutePath() + "'", e);
            }
        }
        return IvyPatternHelper.substitute(this.outputpattern, this.mRevId.getOrganisation(), this.mRevId.getName(), this.mRevId.getRevision(), "", "", str2, str, this.mRevId.getQualifiedExtraAttributes(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    /* JADX WARN: Finally extract failed */
    public final void genStyled(String[] strArr, File file, String str) throws IOException, BuildException {
        ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
        File baseDir = this.todir;
        if (baseDir == null) {
            baseDir = getProject().getBaseDir();
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer(new StreamSource(bufferedInputStream, JAXPUtils.getSystemId(file)));
                transformerNewTransformer.setParameter("confs", this.conf);
                transformerNewTransformer.setParameter("extension", this.xslext);
                for (XSLTProcess.Param param : this.params) {
                    transformerNewTransformer.setParameter(param.getName(), param.getExpression());
                }
                for (String str2 : strArr) {
                    File configurationResolveReportInCache = resolutionCacheManager.getConfigurationResolveReportInCache(this.resolveId, str2);
                    File file2 = new File(baseDir, getOutputPattern(str2, str));
                    log("Processing " + configurationResolveReportInCache + " to " + file2);
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists() && !parentFile.mkdirs()) {
                        throw new BuildException("Unable to create directory: " + parentFile.getAbsolutePath());
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(configurationResolveReportInCache));
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                            try {
                                transformerNewTransformer.transform(new StreamSource(bufferedInputStream2, JAXPUtils.getSystemId(file)), new StreamResult(bufferedOutputStream));
                                bufferedOutputStream.close();
                                bufferedInputStream2.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (TransformerException e) {
                        throw new BuildException(e);
                    }
                }
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (TransformerConfigurationException e2) {
            throw new BuildException(e2);
        }
    }

    public final File getStylePath(String str) throws IOException {
        File file = new File(getIvyInstance().getResolutionCacheManager().getResolutionCacheRoot(), str);
        FileUtil.copy(XmlReportOutputter.class.getResourceAsStream(str), file, (CopyProgressListener) null);
        return file;
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

    public boolean isDot() {
        return this.dot;
    }

    public void setDot(boolean z) {
        this.dot = z;
    }
}
