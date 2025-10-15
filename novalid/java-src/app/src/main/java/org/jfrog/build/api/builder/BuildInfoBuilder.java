package org.jfrog.build.api.builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.Agent;
import org.jfrog.build.api.Build;
import org.jfrog.build.api.BuildAgent;
import org.jfrog.build.api.BuildRetention;
import org.jfrog.build.api.Issues;
import org.jfrog.build.api.MatrixParameter;
import org.jfrog.build.api.Module;
import org.jfrog.build.api.Vcs;
import org.jfrog.build.api.release.PromotionStatus;

/* loaded from: classes8.dex */
public class BuildInfoBuilder {
    public Agent agent;
    public String artifactoryPluginVersion;
    public String artifactoryPrincipal;
    public BuildAgent buildAgent;
    public BuildRetention buildRetention;
    public long durationMillis;
    public Issues issues;
    public ConcurrentHashMap<String, Module> modules;
    public String name;
    public String number;
    public String parentName;
    public String parentNumber;
    public String principal;
    public String project;
    public Properties properties;
    public List<MatrixParameter> runParameters;
    public String started;
    public long startedMillis;
    public List<PromotionStatus> statuses;
    public String url;
    public List<Vcs> vcs = new ArrayList();
    public String vcsRevision;
    public String vcsUrl;
    public String version;

    public BuildInfoBuilder(String str) {
        this.name = str;
    }

    public Build build() {
        if (StringUtils.isBlank(this.name)) {
            throw new IllegalArgumentException("Build must have a name");
        }
        if (StringUtils.isBlank(this.number)) {
            throw new IllegalArgumentException("Build number must be set");
        }
        if (StringUtils.isBlank(this.started)) {
            throw new IllegalArgumentException("Build start time must be set");
        }
        Build build = new Build();
        if (StringUtils.isNotBlank(this.version)) {
            build.setVersion(this.version);
        }
        build.setName(this.name);
        build.setNumber(this.number);
        build.setProject(this.project);
        build.setAgent(this.agent);
        build.setBuildAgent(this.buildAgent);
        build.setStarted(this.started);
        build.setStartedMillis(this.startedMillis);
        build.setDurationMillis(this.durationMillis);
        build.setPrincipal(this.principal);
        build.setArtifactoryPrincipal(this.artifactoryPrincipal);
        build.setArtifactoryPluginVersion(this.artifactoryPluginVersion);
        build.setUrl(this.url);
        build.setParentName(this.parentName);
        build.setParentNumber(this.parentNumber);
        build.setRunParameters(this.runParameters);
        build.setModules(this.modules != null ? new ArrayList(this.modules.values()) : null);
        build.setStatuses(this.statuses);
        build.setProperties(this.properties);
        build.setVcs(this.vcs);
        build.setBuildRetention(this.buildRetention);
        build.setIssues(this.issues);
        return build;
    }

    public BuildInfoBuilder version(String str) {
        this.version = str;
        return this;
    }

    public BuildInfoBuilder name(String str) {
        this.name = str;
        return this;
    }

    public BuildInfoBuilder number(String str) {
        this.number = str;
        return this;
    }

    public BuildInfoBuilder agent(Agent agent) {
        this.agent = agent;
        return this;
    }

    public BuildInfoBuilder buildAgent(BuildAgent buildAgent) {
        this.buildAgent = buildAgent;
        return this;
    }

    public BuildInfoBuilder started(String str) {
        this.started = str;
        return this;
    }

    public BuildInfoBuilder startedDate(Date date) {
        this.started = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        this.startedMillis = date.getTime();
        return this;
    }

    public BuildInfoBuilder startedMillis(long j) {
        this.startedMillis = j;
        return this;
    }

    public BuildInfoBuilder durationMillis(long j) {
        this.durationMillis = j;
        return this;
    }

    public BuildInfoBuilder principal(String str) {
        this.principal = str;
        return this;
    }

    public BuildInfoBuilder artifactoryPrincipal(String str) {
        this.artifactoryPrincipal = str;
        return this;
    }

    public BuildInfoBuilder artifactoryPluginVersion(String str) {
        this.artifactoryPluginVersion = str;
        return this;
    }

    public BuildInfoBuilder url(String str) {
        this.url = str;
        return this;
    }

    public BuildInfoBuilder parentName(String str) {
        this.parentName = str;
        return this;
    }

    public BuildInfoBuilder parentNumber(String str) {
        this.parentNumber = str;
        return this;
    }

    public BuildInfoBuilder vcs(List<Vcs> list) {
        this.vcs = list;
        return this;
    }

    public BuildInfoBuilder vcsRevision(String str) {
        this.vcsRevision = str;
        return this;
    }

    public BuildInfoBuilder vcsUrl(String str) {
        this.vcsUrl = str;
        return this;
    }

    public BuildInfoBuilder modules(ConcurrentHashMap<String, Module> concurrentHashMap) {
        this.modules = concurrentHashMap;
        return this;
    }

    public BuildInfoBuilder modules(List<Module> list) {
        ConcurrentHashMap<String, Module> concurrentHashMap = new ConcurrentHashMap<>();
        for (Module module : list) {
            concurrentHashMap.put(module.getId(), module);
        }
        this.modules = concurrentHashMap;
        return this;
    }

    public BuildInfoBuilder statuses(List<PromotionStatus> list) {
        this.statuses = list;
        return this;
    }

    public BuildInfoBuilder addStatus(PromotionStatus promotionStatus) {
        if (this.statuses == null) {
            this.statuses = new ArrayList();
        }
        this.statuses.add(promotionStatus);
        return this;
    }

    public BuildInfoBuilder buildRetention(BuildRetention buildRetention) {
        this.buildRetention = buildRetention;
        return this;
    }

    public BuildInfoBuilder buildRunParameters(List<MatrixParameter> list) {
        this.runParameters = list;
        return this;
    }

    public BuildInfoBuilder addRunParameters(MatrixParameter matrixParameter) {
        if (this.runParameters == null) {
            this.runParameters = new ArrayList();
        }
        this.runParameters.add(matrixParameter);
        return this;
    }

    public BuildInfoBuilder addModule(Module module) {
        if (this.modules == null) {
            synchronized (this) {
                try {
                    if (this.modules == null) {
                        this.modules = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        this.modules.put(module.getId(), module);
        return this;
    }

    public BuildInfoBuilder properties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public BuildInfoBuilder addProperty(Object obj, Object obj2) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.put(obj, obj2);
        return this;
    }

    public BuildInfoBuilder issues(Issues issues) {
        this.issues = issues;
        return this;
    }

    public BuildInfoBuilder project(String str) {
        this.project = str;
        return this;
    }
}
