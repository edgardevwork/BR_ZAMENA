package org.jfrog.build.extractor.packageManager;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.p065ci.BuildInfo;

/* loaded from: classes7.dex */
public abstract class PackageManagerExtractor implements Serializable {
    public static final long serialVersionUID = 1;

    public abstract BuildInfo execute();

    public void executeAndSaveBuildInfo(ArtifactoryClientConfiguration artifactoryClientConfiguration) throws IOException, RuntimeException {
        CommonUtils.handleJavaTmpdirProperty();
        BuildInfo buildInfoExecute = execute();
        if (buildInfoExecute == null) {
            return;
        }
        PackageManagerUtils.collectEnvAndFilterProperties(artifactoryClientConfiguration, buildInfoExecute);
        saveBuildInfoToFile(artifactoryClientConfiguration, buildInfoExecute);
    }

    public static void saveBuildInfoToFile(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo) {
        String generatedBuildInfoFilePath = artifactoryClientConfiguration.info.getGeneratedBuildInfoFilePath();
        if (StringUtils.isBlank(generatedBuildInfoFilePath)) {
            return;
        }
        try {
            BuildInfoExtractorUtils.saveBuildInfoToFile(buildInfo, new File(generatedBuildInfoFilePath));
        } catch (Exception e) {
            artifactoryClientConfiguration.getLog().error("Failed writing build info to file: ", e);
            throw new RuntimeException(e);
        }
    }

    public static void validateRepoExists(ArtifactoryManager artifactoryManager, String str, String str2) throws IOException {
        if (StringUtils.isBlank(str)) {
            throw new IllegalArgumentException(str2);
        }
        if (artifactoryManager.isRepositoryExist(str)) {
            return;
        }
        throw new IOException("Repo " + str + " doesn't exist");
    }
}
