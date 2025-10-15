package org.jfrog.build.extractor.retention;

import java.io.IOException;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.client.ArtifactoryVersion;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.BuildRetention;

/* loaded from: classes7.dex */
public class Utils {
    public static BuildRetention getBuildRetention(ArtifactoryClientConfiguration artifactoryClientConfiguration) {
        int i;
        BuildRetention buildRetention = new BuildRetention(artifactoryClientConfiguration.info.isDeleteBuildArtifacts().booleanValue());
        if (artifactoryClientConfiguration.info.getBuildRetentionCount() != null) {
            buildRetention.setCount(artifactoryClientConfiguration.info.getBuildRetentionCount().intValue());
        }
        String buildRetentionMinimumDate = artifactoryClientConfiguration.info.getBuildRetentionMinimumDate();
        if (StringUtils.isNotBlank(buildRetentionMinimumDate) && (i = Integer.parseInt(buildRetentionMinimumDate)) > -1) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -i);
            buildRetention.setMinimumBuildDate(calendar.getTime());
        }
        for (String str : artifactoryClientConfiguration.info.getBuildNumbersNotToDelete()) {
            buildRetention.addBuildNotToBeDiscarded(str);
        }
        return buildRetention;
    }

    public static void addRetentionIfNeeded(BuildInfo buildInfo, BuildRetention buildRetention, ArtifactoryVersion artifactoryVersion) {
        if (artifactoryVersion.isAtLeast(JFrogHttpClient.STANDALONE_BUILD_RETENTION_SUPPORTED_ARTIFACTORY_VERSION)) {
            return;
        }
        buildInfo.setBuildRetention(buildRetention);
    }

    public static void sendRetentionIfNeeded(ArtifactoryManager artifactoryManager, BuildRetention buildRetention, String str, String str2, ArtifactoryVersion artifactoryVersion, boolean z) throws IOException {
        if (artifactoryVersion.isAtLeast(JFrogHttpClient.STANDALONE_BUILD_RETENTION_SUPPORTED_ARTIFACTORY_VERSION)) {
            artifactoryManager.sendBuildRetention(buildRetention, str, str2, z);
        }
    }

    public static void sendBuildAndBuildRetention(ArtifactoryManager artifactoryManager, BuildInfo buildInfo, ArtifactoryClientConfiguration artifactoryClientConfiguration, String str) throws IOException {
        sendBuildAndBuildRetention(artifactoryManager, buildInfo, getBuildRetention(artifactoryClientConfiguration), artifactoryClientConfiguration.info.isAsyncBuildRetention().booleanValue(), str);
    }

    public static void sendBuildAndBuildRetention(ArtifactoryManager artifactoryManager, BuildInfo buildInfo, ArtifactoryClientConfiguration artifactoryClientConfiguration) throws IOException {
        sendBuildAndBuildRetention(artifactoryManager, buildInfo, artifactoryClientConfiguration, (String) null);
    }

    public static void sendBuildAndBuildRetention(ArtifactoryManager artifactoryManager, BuildInfo buildInfo, BuildRetention buildRetention, boolean z, String str) throws IOException {
        if (buildRetention == null || buildRetention.isEmpty()) {
            artifactoryManager.publishBuildInfo(buildInfo, str);
            return;
        }
        ArtifactoryVersion version = artifactoryManager.getVersion();
        addRetentionIfNeeded(buildInfo, buildRetention, version);
        artifactoryManager.publishBuildInfo(buildInfo, str);
        sendRetentionIfNeeded(artifactoryManager, buildRetention, buildInfo.getName(), buildInfo.getProject(), version, z);
    }

    public static void sendBuildAndBuildRetention(ArtifactoryManager artifactoryManager, BuildInfo buildInfo, BuildRetention buildRetention, boolean z) throws IOException {
        sendBuildAndBuildRetention(artifactoryManager, buildInfo, buildRetention, z, null);
    }
}
