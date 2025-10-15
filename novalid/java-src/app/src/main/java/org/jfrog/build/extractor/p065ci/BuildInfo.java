package org.jfrog.build.extractor.p065ci;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jfrog.build.api.Agent;
import org.jfrog.build.api.Artifact;
import org.jfrog.build.api.Build;
import org.jfrog.build.api.BuildAgent;
import org.jfrog.build.api.Dependency;
import org.jfrog.build.api.MatrixParameter;
import org.jfrog.build.api.Module;
import org.jfrog.build.api.Vcs;
import org.jfrog.build.api.builder.BuildInfoBuilder;
import org.jfrog.build.api.builder.ModuleBuilder;
import org.jfrog.build.api.builder.ModuleType;
import org.jfrog.build.api.dependency.BuildDependency;
import org.jfrog.build.api.release.PromotionStatus;

@JsonIgnoreProperties(ignoreUnknown = true, value = {PomReader.PROJECT, "startedMillis"})
@XStreamAlias("build")
/* loaded from: classes5.dex */
public class BuildInfo extends BaseBuildBean {
    public static final String STARTED_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public Agent agent;
    public String artifactoryPluginVersion;
    public String artifactoryPrincipal;
    public BuildAgent buildAgent;
    public List<BuildDependency> buildDependencies;
    public BuildRetention buildRetention;
    public long durationMillis;
    public Issues issues;

    @XStreamAlias("modules")
    public List<Module> modules;
    public String name;
    public String number;

    @Deprecated
    public String parentBuildId;
    public String parentName;
    public String parentNumber;
    public String principal;
    public String project;

    @XStreamAlias("runParameters")
    public List<MatrixParameter> runParameters;
    public String started;
    public long startedMillis;
    public List<PromotionStatus> statuses;
    public String url;
    public List<Vcs> vcs;
    public String version = "1.0.1";

    public static String formatBuildStarted(long j) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(Long.valueOf(j));
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String str) {
        this.project = str;
    }

    public String getParentName() {
        return this.parentName;
    }

    public void setParentName(String str) {
        this.parentName = str;
    }

    public String getParentNumber() {
        return this.parentNumber;
    }

    public void setParentNumber(String str) {
        this.parentNumber = str;
    }

    public List<Vcs> getVcs() {
        return this.vcs;
    }

    public void setVcs(List<Vcs> list) {
        this.vcs = list;
    }

    public Agent getAgent() {
        return this.agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public BuildAgent getBuildAgent() {
        return this.buildAgent;
    }

    public void setBuildAgent(BuildAgent buildAgent) {
        this.buildAgent = buildAgent;
    }

    public String getStarted() {
        return this.started;
    }

    public void setStarted(String str) {
        this.started = str;
    }

    public long getStartedMillis() {
        return this.startedMillis;
    }

    public void setStartedMillis(long j) {
        this.startedMillis = j;
    }

    public void setStartedDate(Date date) {
        long time = date.getTime();
        this.startedMillis = time;
        this.started = formatBuildStarted(time);
    }

    public long getDurationMillis() {
        return this.durationMillis;
    }

    public void setDurationMillis(long j) {
        this.durationMillis = j;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public String getArtifactoryPrincipal() {
        return this.artifactoryPrincipal;
    }

    public void setArtifactoryPrincipal(String str) {
        this.artifactoryPrincipal = str;
    }

    public String getArtifactoryPluginVersion() {
        return this.artifactoryPluginVersion;
    }

    public void setArtifactoryPluginVersion(String str) {
        this.artifactoryPluginVersion = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Deprecated
    public String getParentBuildId() {
        return this.parentBuildId;
    }

    @Deprecated
    public void setParentBuildId(String str) {
        this.parentBuildId = str;
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public void setModules(List<Module> list) {
        this.modules = list;
    }

    public Module getModule(String str) {
        List<Module> list = this.modules;
        if (list == null) {
            return null;
        }
        for (Module module : list) {
            if (module.getId().equals(str)) {
                return module;
            }
        }
        return null;
    }

    public BuildRetention getBuildRetention() {
        return this.buildRetention;
    }

    public void setBuildRetention(BuildRetention buildRetention) {
        this.buildRetention = buildRetention;
    }

    public List<MatrixParameter> getRunParameters() {
        return this.runParameters;
    }

    public void setRunParameters(List<MatrixParameter> list) {
        this.runParameters = list;
    }

    public List<PromotionStatus> getStatuses() {
        return this.statuses;
    }

    public void setStatuses(List<PromotionStatus> list) {
        this.statuses = list;
    }

    public void addStatus(PromotionStatus promotionStatus) {
        if (this.statuses == null) {
            this.statuses = new ArrayList();
        }
        this.statuses.add(promotionStatus);
    }

    public List<BuildDependency> getBuildDependencies() {
        return this.buildDependencies;
    }

    public void setBuildDependencies(List<BuildDependency> list) {
        this.buildDependencies = list;
    }

    public void addBuildDependency(BuildDependency buildDependency) {
        if (this.buildDependencies == null) {
            this.buildDependencies = new ArrayList();
        }
        this.buildDependencies.add(buildDependency);
    }

    public Issues getIssues() {
        return this.issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    public void append(BuildInfo buildInfo) {
        if (this.buildAgent == null) {
            setBuildAgent(buildInfo.buildAgent);
        }
        appendProperties(buildInfo);
        appendModules(buildInfo);
        appendBuildDependencies(buildInfo);
        Issues issues = this.issues;
        if (issues == null) {
            this.issues = buildInfo.issues;
        } else {
            issues.append(buildInfo.issues);
        }
    }

    public final void appendBuildDependencies(BuildInfo buildInfo) {
        List<BuildDependency> buildDependencies = buildInfo.getBuildDependencies();
        if (buildDependencies == null || buildDependencies.size() <= 0) {
            return;
        }
        List<BuildDependency> list = this.buildDependencies;
        if (list == null) {
            setBuildDependencies(buildDependencies);
        } else {
            list.addAll(buildDependencies);
        }
    }

    public final void appendModules(BuildInfo buildInfo) {
        List<Module> modules = buildInfo.getModules();
        if (modules == null || modules.size() <= 0) {
            return;
        }
        if (getModules() == null) {
            setModules(modules);
        } else {
            modules.forEach(new Consumer() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.addModule((Module) obj);
                }
            });
        }
    }

    public final void appendProperties(BuildInfo buildInfo) {
        Properties properties = buildInfo.getProperties();
        if (properties == null || properties.size() <= 0) {
            return;
        }
        if (getProperties() == null) {
            setProperties(properties);
        } else {
            getProperties().putAll(properties);
        }
    }

    public final void addModule(final Module module) {
        List<Module> modules = getModules();
        Module moduleOrElse = modules.stream().filter(new Predicate() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda11
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BuildInfo.lambda$addModule$0(module, (Module) obj);
            }
        }).findAny().orElse(null);
        if (moduleOrElse == null) {
            modules.add(module);
        } else {
            moduleOrElse.append(module);
        }
    }

    public static /* synthetic */ boolean lambda$addModule$0(Module module, Module module2) {
        return StringUtils.equals(module2.getId(), module.getId());
    }

    public String toString() {
        return "BuildInfo{version='" + this.version + ExtendedMessageFormat.QUOTE + ", name='" + this.name + ExtendedMessageFormat.QUOTE + ", number='" + this.number + ExtendedMessageFormat.QUOTE + ", buildAgent=" + this.buildAgent + ", agent=" + this.agent + ", started='" + this.started + ExtendedMessageFormat.QUOTE + ", durationMillis=" + this.durationMillis + ", principal='" + this.principal + ExtendedMessageFormat.QUOTE + ", artifactoryPrincipal='" + this.artifactoryPrincipal + ExtendedMessageFormat.QUOTE + ", artifactoryPluginVersion='" + this.artifactoryPluginVersion + ExtendedMessageFormat.QUOTE + ", url='" + this.url + ExtendedMessageFormat.QUOTE + ", parentName='" + this.parentName + ExtendedMessageFormat.QUOTE + ", parentNumber='" + this.parentNumber + ExtendedMessageFormat.QUOTE + ", vcs='" + this.vcs + ExtendedMessageFormat.QUOTE + ", parentBuildId='" + this.parentBuildId + ExtendedMessageFormat.QUOTE + ", buildRetention=" + this.buildRetention + ", runParameters=" + this.runParameters + ", modules=" + this.modules + ", statuses=" + this.statuses + ", buildDependencies=" + this.buildDependencies + ", issues=" + this.issues + '}';
    }

    public Build ToBuild() {
        BuildInfoBuilder buildInfoBuilderProject = new BuildInfoBuilder(this.name).number(this.number).project(this.project);
        Agent agent = this.agent;
        BuildInfoBuilder buildInfoBuilderAgent = buildInfoBuilderProject.agent(agent == null ? null : new Agent(agent.getName(), this.agent.getVersion()));
        BuildAgent buildAgent = this.buildAgent;
        BuildInfoBuilder buildInfoBuilderParentNumber = buildInfoBuilderAgent.buildAgent(buildAgent == null ? null : new BuildAgent(buildAgent.getName(), this.buildAgent.getVersion())).started(this.started).startedMillis(this.startedMillis).durationMillis(this.durationMillis).principal(this.principal).artifactoryPrincipal(this.artifactoryPrincipal).artifactoryPluginVersion(this.artifactoryPluginVersion).url(this.url).parentName(this.parentName).parentNumber(this.parentNumber);
        List<MatrixParameter> list = this.runParameters;
        BuildInfoBuilder buildInfoBuilderProperties = buildInfoBuilderParentNumber.buildRunParameters(list == null ? null : (List) list.stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BuildInfo.lambda$ToBuild$1((MatrixParameter) obj);
            }
        }).collect(Collectors.toList())).statuses(this.statuses).properties(getProperties());
        List<Vcs> list2 = this.vcs;
        BuildInfoBuilder buildInfoBuilderVcs = buildInfoBuilderProperties.vcs(list2 == null ? null : (List) list2.stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Vcs) obj).ToBuildVcs();
            }
        }).collect(Collectors.toList()));
        BuildRetention buildRetention = this.buildRetention;
        BuildInfoBuilder buildInfoBuilderBuildRetention = buildInfoBuilderVcs.buildRetention(buildRetention == null ? null : buildRetention.ToBuildRetention());
        Issues issues = this.issues;
        BuildInfoBuilder buildInfoBuilderIssues = buildInfoBuilderBuildRetention.issues(issues != null ? issues.ToBuildIssues() : null);
        List<Module> list3 = this.modules;
        if (list3 != null) {
            buildInfoBuilderIssues.modules((List<Module>) list3.stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BuildInfo.lambda$ToBuild$2((Module) obj);
                }
            }).collect(Collectors.toList()));
        }
        return buildInfoBuilderIssues.build();
    }

    public static /* synthetic */ MatrixParameter lambda$ToBuild$1(MatrixParameter matrixParameter) {
        return new MatrixParameter(matrixParameter.getKey(), matrixParameter.getValue());
    }

    public static /* synthetic */ Module lambda$ToBuild$2(Module module) {
        return new ModuleBuilder().type(module.getType() == null ? null : ModuleType.valueOf(module.getType().toUpperCase())).m7386id(module.getId()).repository(module.getRepository()).sha1(module.getSha1()).md5(module.getMd5()).artifacts(module.getArtifacts() == null ? null : (List) module.getArtifacts().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Artifact) obj).ToBuildArtifact();
            }
        }).collect(Collectors.toList())).dependencies(module.getDependencies() == null ? null : (List) module.getDependencies().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Dependency) obj).ToBuildDependency();
            }
        }).collect(Collectors.toList())).properties(module.getProperties()).excludedArtifacts(module.getExcludedArtifacts() != null ? (List) module.getExcludedArtifacts().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Artifact) obj).ToBuildArtifact();
            }
        }).collect(Collectors.toList()) : null).build();
    }

    public static BuildInfo ToBuildInfo(Build build) {
        org.jfrog.build.extractor.builder.BuildInfoBuilder buildInfoBuilder = new org.jfrog.build.extractor.builder.BuildInfoBuilder(build.getName());
        buildInfoBuilder.number(build.getNumber()).setProject(build.getProject()).agent(build.getAgent() == null ? null : new Agent(build.getAgent().getName(), build.getAgent().getVersion())).buildAgent(build.getBuildAgent() == null ? null : new BuildAgent(build.getBuildAgent().getName(), build.getBuildAgent().getVersion())).started(build.getStarted()).startedMillis(build.getStartedMillis()).durationMillis(build.getDurationMillis()).principal(build.getPrincipal()).artifactoryPrincipal(build.getArtifactoryPrincipal()).artifactoryPluginVersion(build.getArtifactoryPluginVersion()).url(build.getUrl()).parentName(build.getParentName()).parentNumber(build.getParentNumber()).buildRunParameters(build.getRunParameters() == null ? null : (List) build.getRunParameters().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BuildInfo.lambda$ToBuildInfo$3((MatrixParameter) obj);
            }
        }).collect(Collectors.toList())).statuses(build.getStatuses()).properties(build.getProperties()).vcs(build.getVcs() == null ? null : (List) build.getVcs().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Vcs.ToBuildInfoVcs((Vcs) obj);
            }
        }).collect(Collectors.toList())).buildRetention(build.getBuildRetention() == null ? null : BuildRetention.ToBuildInfoRetention(build.getBuildRetention())).issues(build.getIssues() != null ? Issues.ToBuildInfoIssues(build.getIssues()) : null);
        if (build.getModules() != null) {
            buildInfoBuilder.modules((List<Module>) build.getModules().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda10
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BuildInfo.lambda$ToBuildInfo$4((Module) obj);
                }
            }).collect(Collectors.toList()));
        }
        return buildInfoBuilder.build();
    }

    public static /* synthetic */ MatrixParameter lambda$ToBuildInfo$3(MatrixParameter matrixParameter) {
        return new MatrixParameter(matrixParameter.getKey(), matrixParameter.getValue());
    }

    public static /* synthetic */ Module lambda$ToBuildInfo$4(Module module) {
        return new org.jfrog.build.extractor.builder.ModuleBuilder().type(module.getType()).m7389id(module.getId()).repository(module.getRepository()).sha1(module.getSha1()).md5(module.getMd5()).artifacts(module.getArtifacts() == null ? null : (List) module.getArtifacts().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Artifact.ToBuildInfoArtifact((Artifact) obj);
            }
        }).collect(Collectors.toList())).dependencies(module.getDependencies() == null ? null : (List) module.getDependencies().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Dependency.ToBuildDependency((Dependency) obj);
            }
        }).collect(Collectors.toList())).properties(module.getProperties()).excludedArtifacts(module.getExcludedArtifacts() != null ? (List) module.getExcludedArtifacts().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.BuildInfo$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Artifact.ToBuildInfoArtifact((Artifact) obj);
            }
        }).collect(Collectors.toList()) : null).build();
    }
}
