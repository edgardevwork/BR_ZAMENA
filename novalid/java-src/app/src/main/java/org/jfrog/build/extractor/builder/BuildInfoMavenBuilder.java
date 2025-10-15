package org.jfrog.build.extractor.builder;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.release.PromotionStatus;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.extractor.p065ci.Agent;
import org.jfrog.build.extractor.p065ci.Artifact;
import org.jfrog.build.extractor.p065ci.BuildAgent;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.BuildRetention;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.build.extractor.p065ci.Issues;
import org.jfrog.build.extractor.p065ci.Module;
import org.jfrog.build.extractor.p065ci.Vcs;

/* loaded from: classes5.dex */
public class BuildInfoMavenBuilder extends BuildInfoBuilder {
    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public /* bridge */ /* synthetic */ BuildInfoBuilder modules(ConcurrentHashMap concurrentHashMap) {
        return modules((ConcurrentHashMap<String, Module>) concurrentHashMap);
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public /* bridge */ /* synthetic */ BuildInfoBuilder statuses(List list) {
        return statuses((List<PromotionStatus>) list);
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public /* bridge */ /* synthetic */ BuildInfoBuilder vcs(List list) {
        return vcs((List<Vcs>) list);
    }

    public BuildInfoMavenBuilder(String str) {
        super(str);
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfo build() {
        return super.build();
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder version(String str) {
        super.version(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder name(String str) {
        super.name(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder number(String str) {
        super.number(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder project(String str) {
        super.project(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder agent(Agent agent) {
        super.agent(agent);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder buildAgent(BuildAgent buildAgent) {
        super.buildAgent(buildAgent);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder started(String str) {
        super.started(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder startedDate(Date date) {
        super.startedDate(date);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder startedMillis(long j) {
        super.startedMillis(j);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder durationMillis(long j) {
        super.durationMillis(j);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder principal(String str) {
        super.principal(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder artifactoryPrincipal(String str) {
        super.artifactoryPrincipal(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder artifactoryPluginVersion(String str) {
        super.artifactoryPluginVersion(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder url(String str) {
        super.url(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder parentName(String str) {
        super.parentName(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder parentNumber(String str) {
        super.parentNumber(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder vcs(List<Vcs> list) {
        super.vcs(list);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder vcsRevision(String str) {
        super.vcsRevision(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder vcsUrl(String str) {
        super.vcsUrl(str);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder modules(ConcurrentHashMap<String, Module> concurrentHashMap) {
        super.modules(concurrentHashMap);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder statuses(List<PromotionStatus> list) {
        super.statuses(list);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder addStatus(PromotionStatus promotionStatus) {
        super.addStatus(promotionStatus);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder buildRetention(BuildRetention buildRetention) {
        super.buildRetention(buildRetention);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder addModule(Module module) {
        super.addModule(module);
        mergeModule(module);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder properties(Properties properties) {
        super.properties(properties);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder addProperty(Object obj, Object obj2) {
        super.addProperty(obj, obj2);
        return this;
    }

    @Override // org.jfrog.build.extractor.builder.BuildInfoBuilder
    public BuildInfoMavenBuilder issues(Issues issues) {
        super.issues(issues);
        return this;
    }

    public final void mergeModule(Module module) {
        Module modulePutIfAbsent = this.modules.putIfAbsent(module.getId(), module);
        if (modulePutIfAbsent == null) {
            return;
        }
        mergeModuleArtifacts(modulePutIfAbsent, module);
        mergeModuleDependencies(modulePutIfAbsent, module);
    }

    public final void mergeModuleArtifacts(Module module, Module module2) {
        List<Artifact> artifacts = module.getArtifacts();
        List<Artifact> artifacts2 = module2.getArtifacts();
        if (artifacts == null || artifacts.isEmpty()) {
            module.setArtifacts(artifacts2);
            return;
        }
        if (artifacts2 == null || artifacts2.isEmpty()) {
            return;
        }
        for (Artifact artifact : artifacts2) {
            Artifact artifactFindArtifact = findArtifact(artifacts, artifact.getName());
            if (artifactFindArtifact == null) {
                artifacts.add(artifact);
            } else if (StringUtils.isBlank(artifactFindArtifact.getMd5()) && StringUtils.isBlank(artifactFindArtifact.getSha1())) {
                artifactFindArtifact.setType(artifact.getType());
                artifactFindArtifact.setMd5(artifact.getMd5());
                artifactFindArtifact.setSha1(artifact.getSha1());
                artifactFindArtifact.setProperties(artifact.getProperties());
            }
        }
    }

    public static /* synthetic */ boolean lambda$findArtifact$0(String str, Artifact artifact) {
        return artifact.getName().equals(str);
    }

    public final Artifact findArtifact(List<Artifact> list, final String str) {
        return (Artifact) CommonUtils.getFirstSatisfying(list, new Predicate() { // from class: org.jfrog.build.extractor.builder.BuildInfoMavenBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BuildInfoMavenBuilder.lambda$findArtifact$0(str, (Artifact) obj);
            }
        }, null);
    }

    public final void mergeModuleDependencies(Module module, Module module2) {
        List<Dependency> dependencies = module.getDependencies();
        List<Dependency> dependencies2 = module2.getDependencies();
        if (dependencies == null || dependencies.isEmpty()) {
            module.setDependencies(dependencies2);
            return;
        }
        if (dependencies2 == null || dependencies2.isEmpty()) {
            return;
        }
        for (Dependency dependency : dependencies2) {
            Dependency dependencyFindDependency = findDependency(dependencies, dependency.getId());
            if (dependencyFindDependency == null) {
                dependencies.add(dependency);
            } else {
                Set<String> scopes = dependencyFindDependency.getScopes();
                scopes.addAll(dependency.getScopes());
                dependencyFindDependency.setScopes(scopes);
            }
        }
    }

    public static /* synthetic */ boolean lambda$findDependency$1(String str, Dependency dependency) {
        return dependency.getId().equals(str);
    }

    public final Dependency findDependency(List<Dependency> list, final String str) {
        return (Dependency) CommonUtils.getFirstSatisfying(list, new Predicate() { // from class: org.jfrog.build.extractor.builder.BuildInfoMavenBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BuildInfoMavenBuilder.lambda$findDependency$1(str, (Dependency) obj);
            }
        }, null);
    }
}
