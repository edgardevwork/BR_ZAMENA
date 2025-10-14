package org.apache.ivy.plugins.parser.p064m2;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class PomWriterOptions {
    public String artifactName;
    public String artifactPackaging;
    public String[] confs;
    public String description;
    public String licenseHeader;
    public ConfigurationScopeMapping mapping;
    public File template;
    public boolean printIvyInfo = true;
    public List<ExtraDependency> extraDependencies = new ArrayList();

    public File getTemplate() {
        return this.template;
    }

    public PomWriterOptions setTemplate(File file) {
        this.template = file;
        return this;
    }

    public String[] getConfs() {
        return this.confs;
    }

    public PomWriterOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public String getLicenseHeader() {
        return this.licenseHeader;
    }

    public PomWriterOptions setLicenseHeader(String str) {
        this.licenseHeader = str;
        if (str != null) {
            this.licenseHeader = str.trim();
        }
        return this;
    }

    public ConfigurationScopeMapping getMapping() {
        return this.mapping;
    }

    public PomWriterOptions setMapping(ConfigurationScopeMapping configurationScopeMapping) {
        this.mapping = configurationScopeMapping;
        return this;
    }

    public boolean isPrintIvyInfo() {
        return this.printIvyInfo;
    }

    public PomWriterOptions setPrintIvyInfo(boolean z) {
        this.printIvyInfo = z;
        return this;
    }

    public List<ExtraDependency> getExtraDependencies() {
        return this.extraDependencies;
    }

    public PomWriterOptions setExtraDependencies(List<ExtraDependency> list) {
        this.extraDependencies = list;
        return this;
    }

    public String getArtifactName() {
        return this.artifactName;
    }

    public PomWriterOptions setArtifactName(String str) {
        this.artifactName = str;
        return this;
    }

    public String getArtifactPackaging() {
        return this.artifactPackaging;
    }

    public PomWriterOptions setArtifactPackaging(String str) {
        this.artifactPackaging = str;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public PomWriterOptions setDescription(String str) {
        this.description = str;
        return this;
    }

    public static class ConfigurationScopeMapping {
        public Map<String, String> scopes;

        public ConfigurationScopeMapping(Map<String, String> map) {
            this.scopes = new LinkedHashMap(map);
        }

        public String getScope(String[] strArr) {
            for (String str : strArr) {
                if (this.scopes.containsKey(str)) {
                    return this.scopes.get(str);
                }
            }
            return null;
        }

        public boolean isOptional(String[] strArr) {
            return getScope(strArr) == null;
        }
    }

    public static class ExtraDependency {
        public String artifact;
        public String classifier;
        public String group;
        public boolean optional;
        public String scope;
        public String type;
        public String version;

        public ExtraDependency(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.group = str;
            this.artifact = str2;
            this.version = str3;
            this.scope = str4;
            this.type = str5;
            this.classifier = str6;
            this.optional = z;
        }

        public String getGroup() {
            return this.group;
        }

        public String getArtifact() {
            return this.artifact;
        }

        public String getVersion() {
            return this.version;
        }

        public String getScope() {
            return this.scope;
        }

        public String getType() {
            return this.type;
        }

        public String getClassifier() {
            return this.classifier;
        }

        public boolean isOptional() {
            return this.optional;
        }
    }
}
