package org.apache.ivy.ant;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorWriter;
import org.apache.ivy.plugins.parser.p064m2.PomWriterOptions;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyMakePom extends IvyTask {
    public String artifactName;
    public String artifactPackaging;
    public String conf;
    public String description;
    public File pomFile = null;
    public File headerFile = null;
    public File templateFile = null;
    public boolean printIvyInfo = true;
    public File ivyFile = null;
    public List<Mapping> mappings = new ArrayList();
    public List<Dependency> dependencies = new ArrayList();

    public class Mapping {
        public String conf;
        public String scope;

        public Mapping() {
        }

        public String getConf() {
            return this.conf;
        }

        public void setConf(String str) {
            this.conf = str;
        }

        public String getScope() {
            return this.scope;
        }

        public void setScope(String str) {
            this.scope = str;
        }
    }

    public class Dependency {
        public String group = null;
        public String artifact = null;
        public String version = null;
        public String scope = null;
        public String type = null;
        public String classifier = null;
        public boolean optional = false;

        public Dependency() {
        }

        public String getGroup() {
            return this.group;
        }

        public void setGroup(String str) {
            this.group = str;
        }

        public String getArtifact() {
            return this.artifact;
        }

        public void setArtifact(String str) {
            this.artifact = str;
        }

        public String getVersion() {
            return this.version;
        }

        public void setVersion(String str) {
            this.version = str;
        }

        public String getScope() {
            return this.scope;
        }

        public void setScope(String str) {
            this.scope = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getClassifier() {
            return this.classifier;
        }

        public void setClassifier(String str) {
            this.classifier = str;
        }

        public boolean getOptional() {
            return this.optional;
        }

        public void setOptional(boolean z) {
            this.optional = z;
        }
    }

    public File getPomFile() {
        return this.pomFile;
    }

    public void setPomFile(File file) {
        this.pomFile = file;
    }

    public File getIvyFile() {
        return this.ivyFile;
    }

    public void setIvyFile(File file) {
        this.ivyFile = file;
    }

    public File getHeaderFile() {
        return this.headerFile;
    }

    public void setHeaderFile(File file) {
        this.headerFile = file;
    }

    public File getTemplateFile() {
        return this.templateFile;
    }

    public void setTemplateFile(File file) {
        this.templateFile = file;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public boolean isPrintIvyInfo() {
        return this.printIvyInfo;
    }

    public void setPrintIvyInfo(boolean z) {
        this.printIvyInfo = z;
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public String getArtifactName() {
        return this.artifactName;
    }

    public void setArtifactName(String str) {
        this.artifactName = str;
    }

    public String getArtifactPackaging() {
        return this.artifactPackaging;
    }

    public void setArtifactPackaging(String str) {
        this.artifactPackaging = str;
    }

    public Mapping createMapping() {
        Mapping mapping = new Mapping();
        this.mappings.add(mapping);
        return mapping;
    }

    public Dependency createDependency() {
        Dependency dependency = new Dependency();
        this.dependencies.add(dependency);
        return dependency;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        try {
            if (this.ivyFile == null) {
                throw new BuildException("source ivy file is required for makepom task");
            }
            if (this.pomFile == null) {
                throw new BuildException("destination pom file is required for makepom task");
            }
            PomModuleDescriptorWriter.write(XmlModuleDescriptorParser.getInstance().parseDescriptor(getSettings(), this.ivyFile.toURI().toURL(), false), this.pomFile, getPomWriterOptions());
        } catch (MalformedURLException e) {
            throw new BuildException("unable to convert given ivy file to url: " + this.ivyFile + ": " + e, e);
        } catch (ParseException e2) {
            log(e2.getMessage(), 0);
            throw new BuildException("syntax errors in ivy file " + this.ivyFile + ": " + e2, e2);
        } catch (Exception e3) {
            throw new BuildException("impossible convert given ivy file to pom file: " + e3 + " from=" + this.ivyFile + " to=" + this.pomFile, e3);
        }
    }

    public final PomWriterOptions getPomWriterOptions() throws IOException {
        PomWriterOptions pomWriterOptions = new PomWriterOptions();
        pomWriterOptions.setConfs(StringUtils.splitToArray(this.conf)).setArtifactName(getArtifactName()).setArtifactPackaging(getArtifactPackaging()).setPrintIvyInfo(isPrintIvyInfo()).setDescription(getDescription()).setExtraDependencies(getDependencies()).setTemplate(getTemplateFile());
        if (!this.mappings.isEmpty()) {
            pomWriterOptions.setMapping(new PomWriterOptions.ConfigurationScopeMapping(getMappingsMap()));
        }
        if (this.headerFile != null) {
            pomWriterOptions.setLicenseHeader(FileUtil.readEntirely(getHeaderFile()));
        }
        return pomWriterOptions;
    }

    public final Map<String, String> getMappingsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Mapping mapping : this.mappings) {
            for (String str : StringUtils.splitToArray(mapping.getConf())) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, mapping.getScope());
                }
            }
        }
        return linkedHashMap;
    }

    public final List<PomWriterOptions.ExtraDependency> getDependencies() {
        ArrayList arrayList = new ArrayList();
        for (Dependency dependency : this.dependencies) {
            arrayList.add(new PomWriterOptions.ExtraDependency(dependency.getGroup(), dependency.getArtifact(), dependency.getVersion(), dependency.getScope(), dependency.getType(), dependency.getClassifier(), dependency.getOptional()));
        }
        return arrayList;
    }
}
