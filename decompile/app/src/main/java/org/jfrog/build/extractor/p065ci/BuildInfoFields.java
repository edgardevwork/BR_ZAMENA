package org.jfrog.build.extractor.p065ci;

/* loaded from: classes8.dex */
public interface BuildInfoFields {
    public static final String AGENT_NAME = "agent.name";
    public static final String AGENT_VERSION = "agent.version";
    public static final String ARTIFACTORY_PLUGIN_VERSION = "artifactoryPluginVersion";

    @Deprecated
    public static final String BACKWARD_COMPATIBLE_DEPLOYABLE_ARTIFACTS = "deployable.artifacts";
    public static final String BUILD_AGENT_NAME = "buildAgent.name";
    public static final String BUILD_AGENT_VERSION = "buildAgent.version";
    public static final String BUILD_NAME = "build.name";
    public static final String BUILD_NUMBER = "build.number";
    public static final String BUILD_NUMBERS_NOT_TO_DELETE = "buildRetention.buildNumbersNotToDelete";
    public static final String BUILD_PARENT_NAME = "build.parentName";
    public static final String BUILD_PARENT_NUMBER = "build.parentNumber";
    public static final String BUILD_PROJECT = "build.project";
    public static final String BUILD_RETENTION_ASYNC = "buildRetention.async";
    public static final String BUILD_RETENTION_COUNT = "buildRetention.count";
    public static final String BUILD_RETENTION_DAYS = "buildRetention.daysToKeep";
    public static final String BUILD_RETENTION_MINIMUM_DATE = "buildRetention.minimumDate";
    public static final String BUILD_ROOT = "build.root";
    public static final String BUILD_STARTED = "build.started";
    public static final String BUILD_TIMESTAMP = "build.timestamp";
    public static final String BUILD_URL = "buildUrl";
    public static final String DELETE_BUILD_ARTIFACTS = "buildRetention.deleteBuildArtifacts";
    public static final String DEPLOYABLE_ARTIFACTS = "deployable.artifacts.map";
    public static final String ENVIRONMENT_PREFIX = "env.";
    public static final String GENERATED_BUILD_INFO = "generated.build.info";
    public static final String INCREMENTAL = "incremental";
    public static final String MIN_CHECKSUM_DEPLOY_SIZE_KB = "minChecksumDeploySizeKb";
    public static final String OUTPUT_FILE = "output.file";
    public static final String PRINCIPAL = "principal";
    public static final String RELEASE_COMMENT = "promotion.comment";
    public static final String RELEASE_ENABLED = "promotion.enabled";
    public static final String RUN_PARAMETERS = "runParameters.";
    public static final String VCS = "vcs";
    public static final String VCS_BRANCH = "vcs.branch";
    public static final String VCS_MESSAGE = "vcs.message";
    public static final String VCS_REVISION = "vcs.revision";
    public static final String VCS_URL = "vcs.url";
}
