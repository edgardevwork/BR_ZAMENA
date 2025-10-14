package org.jfrog.build.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jfrog.build.api.dependency.BuildDependency;
import org.jfrog.build.api.release.PromotionStatus;

@JsonIgnoreProperties(ignoreUnknown = true, value = {PomReader.PROJECT, "startedMillis"})
@XStreamAlias("build")
/* loaded from: classes5.dex */
public class Build extends BaseBuildBean {
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

    public long getStartedMillis() {
        return this.startedMillis;
    }

    public void setStartedMillis(long j) {
        this.startedMillis = j;
    }

    public void setStarted(String str) {
        this.started = str;
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

    public Issues getIssues() {
        return this.issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    public String toString() {
        return "Build{version='" + this.version + ExtendedMessageFormat.QUOTE + ", name='" + this.name + ExtendedMessageFormat.QUOTE + ", number='" + this.number + ExtendedMessageFormat.QUOTE + ", buildAgent=" + this.buildAgent + ", agent=" + this.agent + ", started='" + this.started + ExtendedMessageFormat.QUOTE + ", durationMillis=" + this.durationMillis + ", principal='" + this.principal + ExtendedMessageFormat.QUOTE + ", artifactoryPrincipal='" + this.artifactoryPrincipal + ExtendedMessageFormat.QUOTE + ", artifactoryPluginVersion='" + this.artifactoryPluginVersion + ExtendedMessageFormat.QUOTE + ", url='" + this.url + ExtendedMessageFormat.QUOTE + ", parentName='" + this.parentName + ExtendedMessageFormat.QUOTE + ", parentNumber='" + this.parentNumber + ExtendedMessageFormat.QUOTE + ", vcs='" + this.vcs + ExtendedMessageFormat.QUOTE + ", parentBuildId='" + this.parentBuildId + ExtendedMessageFormat.QUOTE + ", buildRetention=" + this.buildRetention + ", runParameters=" + this.runParameters + ", modules=" + this.modules + ", statuses=" + this.statuses + ", buildDependencies=" + this.buildDependencies + ", issues=" + this.issues + '}';
    }
}
