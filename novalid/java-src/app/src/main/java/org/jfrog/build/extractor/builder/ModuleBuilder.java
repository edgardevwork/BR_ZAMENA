package org.jfrog.build.extractor.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.jfrog.build.api.builder.ModuleType;
import org.jfrog.build.extractor.p065ci.Artifact;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.build.extractor.p065ci.Module;

/* loaded from: classes8.dex */
public class ModuleBuilder {
    public List<Artifact> artifacts;
    public List<Dependency> dependencies;
    public List<Artifact> excludedArtifacts;

    /* renamed from: id */
    public String f10011id;
    public String md5;
    public Properties properties;
    public String repository;
    public String sha1;
    public String type;

    public Module build() {
        String str = this.f10011id;
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build module entity without Module ID value");
        }
        Module module = new Module();
        module.setType(this.type);
        module.setId(this.f10011id.trim());
        module.setRepository(this.repository);
        module.setSha1(this.sha1);
        module.setMd5(this.md5);
        module.setArtifacts(this.artifacts);
        module.setDependencies(this.dependencies);
        module.setProperties(this.properties);
        module.setExcludedArtifacts(this.excludedArtifacts);
        return module;
    }

    public ModuleBuilder type(ModuleType moduleType) {
        this.type = moduleType.name().toLowerCase();
        return this;
    }

    public ModuleBuilder type(String str) {
        this.type = str;
        return this;
    }

    /* renamed from: id */
    public ModuleBuilder m7389id(String str) {
        this.f10011id = str;
        return this;
    }

    public ModuleBuilder repository(String str) {
        this.repository = str;
        return this;
    }

    public ModuleBuilder sha1(String str) {
        this.sha1 = str;
        return this;
    }

    public ModuleBuilder md5(String str) {
        this.md5 = str;
        return this;
    }

    public ModuleBuilder artifacts(List<Artifact> list) {
        this.artifacts = list;
        return this;
    }

    public ModuleBuilder excludedArtifacts(List<Artifact> list) {
        this.excludedArtifacts = list;
        return this;
    }

    public ModuleBuilder addArtifact(Artifact artifact) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList();
        }
        this.artifacts.add(artifact);
        return this;
    }

    public ModuleBuilder addExcludedArtifact(Artifact artifact) {
        if (this.excludedArtifacts == null) {
            this.excludedArtifacts = new ArrayList();
        }
        this.excludedArtifacts.add(artifact);
        return this;
    }

    public ModuleBuilder dependencies(List<Dependency> list) {
        this.dependencies = list;
        return this;
    }

    public ModuleBuilder addDependency(Dependency dependency) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList();
        }
        this.dependencies.add(dependency);
        return this;
    }

    public ModuleBuilder properties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public ModuleBuilder addProperty(Object obj, Object obj2) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.put(obj, obj2);
        return this;
    }
}
