package org.jfrog.build.extractor.issuesCollection;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryManagerBuilder;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.util.GitUtils;
import org.jfrog.build.extractor.executor.CommandResults;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.Issue;
import org.jfrog.build.extractor.p065ci.IssueTracker;
import org.jfrog.build.extractor.p065ci.Issues;
import org.jfrog.build.extractor.p065ci.IssuesCollectionConfig;
import org.jfrog.build.extractor.p065ci.Vcs;

/* loaded from: classes7.dex */
public class IssuesCollector implements Serializable {
    public static final String LATEST = "LATEST";
    public static Pattern REVISION_NOT_EXIST = null;
    public static final long serialVersionUID = 1;

    public static Pattern getRevisionNotExistPattern() {
        if (REVISION_NOT_EXIST == null) {
            REVISION_NOT_EXIST = Pattern.compile("fatal: Invalid revision range [a-fA-F0-9]+\\.\\.");
        }
        return REVISION_NOT_EXIST;
    }

    public Issues collectIssues(File file, Log log, String str, ArtifactoryManagerBuilder artifactoryManagerBuilder, String str2, Vcs vcs, String str3) throws InterruptedException, IOException {
        IssuesCollectionConfig config = parseConfig(str);
        return buildIssuesObject(config, doCollect(file, log, config, getPreviousVcsRevision(artifactoryManagerBuilder, str2, vcs, str3)));
    }

    public IssuesCollectionConfig parseConfig(String str) throws IOException {
        try {
            IssuesCollectionConfig issuesCollectionConfig = (IssuesCollectionConfig) new ObjectMapper(new JsonFactory()).readValue(str.replace("\\", "\\\\"), IssuesCollectionConfig.class);
            issuesCollectionConfig.validateConfig();
            return issuesCollectionConfig;
        } catch (Exception e) {
            throw new IOException("Issues Collection Failed: Failed parsing config: " + e.getMessage());
        }
    }

    public final String getPreviousVcsRevision(ArtifactoryManagerBuilder artifactoryManagerBuilder, String str, Vcs vcs, String str2) throws IOException {
        ArtifactoryManager artifactoryManagerBuild = artifactoryManagerBuilder.build();
        try {
            BuildInfo buildInfo = artifactoryManagerBuild.getBuildInfo(str, "LATEST", str2);
            if (buildInfo != null) {
                List<Vcs> vcs2 = buildInfo.getVcs();
                if (vcs2 != null && vcs2.size() > 0) {
                    for (Vcs vcs3 : buildInfo.getVcs()) {
                        if (StringUtils.isNotEmpty(vcs3.getRevision()) && StringUtils.equals(vcs3.getUrl(), vcs.getUrl())) {
                            String revision = vcs3.getRevision();
                            artifactoryManagerBuild.close();
                            return revision;
                        }
                    }
                }
                artifactoryManagerBuild.close();
                return "";
            }
            artifactoryManagerBuild.close();
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (artifactoryManagerBuild != null) {
                    try {
                        artifactoryManagerBuild.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final Set<Issue> doCollect(File file, Log log, IssuesCollectionConfig issuesCollectionConfig, String str) throws InterruptedException, IOException {
        String gitLog = getGitLog(file, log, str);
        int keyGroupIndex = issuesCollectionConfig.getIssues().getKeyGroupIndex();
        int summaryGroupIndex = issuesCollectionConfig.getIssues().getSummaryGroupIndex();
        HashSet hashSet = new HashSet();
        Pattern patternCompile = Pattern.compile(issuesCollectionConfig.getIssues().getRegexp());
        for (String str2 : gitLog.split("\\R")) {
            Matcher matcher = patternCompile.matcher(str2);
            if (matcher.find()) {
                Issue matchingIssue = getMatchingIssue(keyGroupIndex, summaryGroupIndex, matcher, issuesCollectionConfig);
                hashSet.add(matchingIssue);
                log.info("Added issue: " + matchingIssue.getKey() + " to the build-info");
            }
        }
        return hashSet;
    }

    public final Issues buildIssuesObject(IssuesCollectionConfig issuesCollectionConfig, Set<Issue> set) {
        return new Issues(new IssueTracker(issuesCollectionConfig.getIssues().getTrackerName()), issuesCollectionConfig.getIssues().isAggregate(), issuesCollectionConfig.getIssues().getAggregationStatus(), set);
    }

    public final Issue getMatchingIssue(int i, int i2, Matcher matcher, IssuesCollectionConfig issuesCollectionConfig) throws IOException {
        String str;
        if (matcher.groupCount() < i || matcher.groupCount() < i2) {
            throw new IOException("Issues Collection Failed: Unexpected result while parsing issues from git log. Make sure that the regular expression used to find issues, includes two capturing groups, for the issue ID and the summary.");
        }
        String strGroup = matcher.group(i);
        String strGroup2 = matcher.group(i2);
        if (!StringUtils.isNotEmpty(issuesCollectionConfig.getIssues().getTrackerUrl())) {
            str = "";
        } else {
            str = issuesCollectionConfig.getIssues().getTrackerUrl() + "/" + strGroup;
        }
        return new Issue(strGroup, str, strGroup2);
    }

    public final String getGitLog(File file, Log log, String str) throws InterruptedException, IOException {
        CommandResults gitLog = GitUtils.getGitLog(file, log, str);
        if (!gitLog.isOk()) {
            if (getRevisionNotExistPattern().matcher(gitLog.getErr()).find()) {
                log.info("Revision: " + str + " that was fetched from latest build info does not exist in the git revision range. No new issues are added.");
                return "";
            }
            throw new IOException("Issues Collection Failed: Git log command failed: " + gitLog.getErr());
        }
        return gitLog.getRes();
    }
}
