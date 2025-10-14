package org.jfrog.gradle.plugin.artifactory.extractor;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jfrog.build.api.builder.PromotionStatusBuilder;
import org.jfrog.build.api.release.Promotion;
import org.jfrog.build.extractor.BuildInfoExtractor;
import org.jfrog.build.extractor.ModuleExtractorUtils;
import org.jfrog.build.extractor.builder.BuildInfoBuilder;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.p065ci.Agent;
import org.jfrog.build.extractor.p065ci.Artifact;
import org.jfrog.build.extractor.p065ci.BuildAgent;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.build.extractor.p065ci.Issue;
import org.jfrog.build.extractor.p065ci.IssueTracker;
import org.jfrog.build.extractor.p065ci.Issues;
import org.jfrog.build.extractor.p065ci.MatrixParameter;
import org.jfrog.build.extractor.p065ci.Module;
import org.jfrog.build.extractor.p065ci.Vcs;
import org.jfrog.build.extractor.packageManager.PackageManagerUtils;
import org.jfrog.build.extractor.scan.License;

/* loaded from: classes8.dex */
public class GradleBuildInfoExtractor implements BuildInfoExtractor<Project> {
    public static final Logger log = Logging.getLogger(GradleBuildInfoExtractor.class);
    public final ArtifactoryClientConfiguration clientConf;
    public final List<ModuleInfoFileProducer> moduleInfoFileProducers;

    public GradleBuildInfoExtractor(ArtifactoryClientConfiguration artifactoryClientConfiguration, List<ModuleInfoFileProducer> list) {
        this.clientConf = artifactoryClientConfiguration;
        this.moduleInfoFileProducers = list;
    }

    @Override // org.jfrog.build.extractor.BuildInfoExtractor
    public BuildInfo extract(Project project) {
        BuildInfo buildInfoBuild = createBuildInfoBuilder().build();
        PackageManagerUtils.collectEnvAndFilterProperties(this.clientConf, buildInfoBuild);
        log.debug("BuildInfo extracted = " + buildInfoBuild);
        return buildInfoBuild;
    }

    public final BuildInfoBuilder createBuildInfoBuilder() {
        BuildInfoBuilder buildInfoBuilderCreateBaseBuilder = createBaseBuilder();
        populateBuilderModulesFields(buildInfoBuilderCreateBaseBuilder);
        for (Map.Entry<String, String> entry : this.clientConf.info.getRunParameters().entrySet()) {
            buildInfoBuilderCreateBaseBuilder.addRunParameters(new MatrixParameter(entry.getKey(), entry.getValue()));
        }
        populateBuilderAgentFields(buildInfoBuilderCreateBaseBuilder);
        populateBuilderParentFields(buildInfoBuilderCreateBaseBuilder);
        populateBuilderArtifactoryPluginVersionField(buildInfoBuilderCreateBaseBuilder);
        populateBuilderPromotionFields(buildInfoBuilderCreateBaseBuilder, populateBuilderDateTimeFields(buildInfoBuilderCreateBaseBuilder), populateBuilderPrincipalField(buildInfoBuilderCreateBaseBuilder), populateBuilderArtifactoryPrincipalField(buildInfoBuilderCreateBaseBuilder));
        populateBuilderVcsFields(buildInfoBuilderCreateBaseBuilder);
        populateBuilderIssueTrackerFields(buildInfoBuilderCreateBaseBuilder);
        return buildInfoBuilderCreateBaseBuilder;
    }

    public final BuildInfoBuilder createBaseBuilder() {
        return new BuildInfoBuilder(this.clientConf.info.getBuildName()).number(this.clientConf.info.getBuildNumber()).project(this.clientConf.info.getProject());
    }

    public final void populateBuilderModulesFields(final BuildInfoBuilder buildInfoBuilder) {
        ((Set) this.moduleInfoFileProducers.stream().filter(new Predicate() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleBuildInfoExtractor$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((ModuleInfoFileProducer) obj).hasModules();
            }
        }).flatMap(new Function() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleBuildInfoExtractor$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GradleBuildInfoExtractor.lambda$populateBuilderModulesFields$0((ModuleInfoFileProducer) obj);
            }
        }).collect(Collectors.toSet())).forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.extractor.GradleBuildInfoExtractor$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GradleBuildInfoExtractor.lambda$populateBuilderModulesFields$1(buildInfoBuilder, (File) obj);
            }
        });
    }

    public static /* synthetic */ Stream lambda$populateBuilderModulesFields$0(ModuleInfoFileProducer moduleInfoFileProducer) {
        return moduleInfoFileProducer.getModuleInfoFiles().getFiles().stream();
    }

    public static /* synthetic */ void lambda$populateBuilderModulesFields$1(BuildInfoBuilder buildInfoBuilder, File file) {
        try {
            Module moduleFromFile = ModuleExtractorUtils.readModuleFromFile(file);
            List<Artifact> artifacts = moduleFromFile.getArtifacts();
            List<Dependency> dependencies = moduleFromFile.getDependencies();
            if (artifacts == null || artifacts.isEmpty()) {
                if (dependencies == null || dependencies.isEmpty()) {
                    return;
                }
            }
            buildInfoBuilder.addModule(moduleFromFile);
        } catch (IOException e) {
            throw new RuntimeException("Cannot load module info from file: " + file.getAbsolutePath(), e);
        }
    }

    public final void populateBuilderArtifactoryPluginVersionField(BuildInfoBuilder buildInfoBuilder) {
        String artifactoryPluginVersion = this.clientConf.info.getArtifactoryPluginVersion();
        if (StringUtils.isBlank(artifactoryPluginVersion)) {
            artifactoryPluginVersion = License.UNKNOWN_LICENCE_NAME;
        }
        buildInfoBuilder.artifactoryPluginVersion(artifactoryPluginVersion);
    }

    public final void populateBuilderParentFields(BuildInfoBuilder buildInfoBuilder) {
        String parentBuildName = this.clientConf.info.getParentBuildName();
        String parentBuildNumber = this.clientConf.info.getParentBuildNumber();
        if (parentBuildName == null || parentBuildNumber == null) {
            return;
        }
        buildInfoBuilder.parentName(parentBuildName);
        buildInfoBuilder.parentNumber(parentBuildNumber);
    }

    public final Date populateBuilderDateTimeFields(BuildInfoBuilder buildInfoBuilder) throws ParseException {
        Date date;
        String buildStarted = this.clientConf.info.getBuildStarted();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(buildStarted);
        } catch (ParseException e) {
            log.error("Build start date format error: " + buildStarted, e);
            date = null;
        }
        buildInfoBuilder.started(buildStarted);
        buildInfoBuilder.durationMillis(date != null ? System.currentTimeMillis() - date.getTime() : 0L);
        return date;
    }

    public final void populateBuilderAgentFields(BuildInfoBuilder buildInfoBuilder) {
        BuildAgent buildAgent = new BuildAgent(this.clientConf.info.getBuildAgentName(), this.clientConf.info.getBuildAgentVersion());
        buildInfoBuilder.buildAgent(buildAgent);
        String agentName = this.clientConf.info.getAgentName();
        String agentVersion = this.clientConf.info.getAgentVersion();
        if (StringUtils.isNoneBlank(agentName, agentVersion)) {
            buildInfoBuilder.agent(new Agent(agentName, agentVersion));
        } else {
            buildInfoBuilder.agent(new Agent(buildAgent.getName(), buildAgent.getVersion()));
        }
        String buildUrl = this.clientConf.info.getBuildUrl();
        if (StringUtils.isNotBlank(buildUrl)) {
            buildInfoBuilder.url(buildUrl);
        }
    }

    public final void populateBuilderVcsFields(BuildInfoBuilder buildInfoBuilder) {
        Vcs vcs = new Vcs(this.clientConf.info.getVcsUrl(), this.clientConf.info.getVcsRevision(), this.clientConf.info.getVcsBranch(), this.clientConf.info.getVcsMessage());
        if (vcs.isEmpty()) {
            return;
        }
        buildInfoBuilder.vcs(Collections.singletonList(vcs));
    }

    public final void populateBuilderIssueTrackerFields(BuildInfoBuilder buildInfoBuilder) {
        String issueTrackerName = this.clientConf.info.issues.getIssueTrackerName();
        if (StringUtils.isNotBlank(issueTrackerName)) {
            Issues issues = new Issues();
            issues.setAggregateBuildIssues(this.clientConf.info.issues.getAggregateBuildIssues());
            issues.setAggregationBuildStatus(this.clientConf.info.issues.getAggregationBuildStatus());
            issues.setTracker(new IssueTracker(issueTrackerName, this.clientConf.info.issues.getIssueTrackerVersion()));
            Set<Issue> affectedIssuesSet = this.clientConf.info.issues.getAffectedIssuesSet();
            if (!affectedIssuesSet.isEmpty()) {
                issues.setAffectedIssues(affectedIssuesSet);
            }
            buildInfoBuilder.issues(issues);
        }
    }

    public final String populateBuilderPrincipalField(BuildInfoBuilder buildInfoBuilder) {
        String strOverrideUserNameValueIfExists = overrideUserNameValueIfExists(this.clientConf.info.getPrincipal());
        buildInfoBuilder.principal(strOverrideUserNameValueIfExists);
        return strOverrideUserNameValueIfExists;
    }

    public final String populateBuilderArtifactoryPrincipalField(BuildInfoBuilder buildInfoBuilder) {
        String strOverrideUserNameValueIfExists = overrideUserNameValueIfExists(this.clientConf.publisher.getUsername());
        buildInfoBuilder.artifactoryPrincipal(strOverrideUserNameValueIfExists);
        return strOverrideUserNameValueIfExists;
    }

    public final String overrideUserNameValueIfExists(String str) {
        return StringUtils.isBlank(str) ? System.getProperty(SystemUtils.USER_NAME_KEY) : str;
    }

    public final void populateBuilderPromotionFields(BuildInfoBuilder buildInfoBuilder, Date date, String str, String str2) {
        if (this.clientConf.info.isReleaseEnabled().booleanValue()) {
            String repoKey = this.clientConf.publisher.getRepoKey();
            String releaseComment = this.clientConf.info.getReleaseComment();
            if (releaseComment == null) {
                releaseComment = "";
            }
            buildInfoBuilder.addStatus(new PromotionStatusBuilder(Promotion.STAGED).timestampDate(date).comment(releaseComment).repository(repoKey).ciUser(str).user(str2).build());
        }
    }
}
