package org.jfrog.gradle.plugin.artifactory.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jfrog.build.client.ArtifactoryUploadResponse;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.IncludeExcludePatterns;
import org.jfrog.build.extractor.clientConfiguration.PatternMatcher;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployableArtifactsUtils;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.retention.Utils;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleDeployDetails;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;

/* loaded from: classes5.dex */
public class DeployUtils {
    public static final Logger log = Logging.getLogger(DeployUtils.class);

    public static void deployTaskArtifacts(ArtifactoryClientConfiguration artifactoryClientConfiguration, Map<String, String> map, Map<String, Set<DeployDetails>> map2, ArtifactoryTask artifactoryTask, String str) {
        try {
            if (!artifactoryTask.getDidWork()) {
                log.debug("Task '{}' did no work", artifactoryTask.getPath());
                return;
            }
            if (artifactoryTask.getDeployDetails().isEmpty()) {
                log.debug("Task '{}' has nothing to deploy", artifactoryTask.getPath());
                return;
            }
            ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(artifactoryTask.getProject());
            if (publisherHandler == null) {
                log.debug("Task '{}' does not have publisher configured", artifactoryTask.getPath());
                return;
            }
            if (StringUtils.isBlank(publisherHandler.getContextUrl())) {
                log.debug("Task '{}' does not have publisher configured with contextUrl attribute", artifactoryTask.getPath());
            } else {
                if (!publisherHandler.isPublishArtifacts().booleanValue()) {
                    log.debug("Task '{}' configured not to deploy artifacts", artifactoryTask.getPath());
                    return;
                }
                mergeRootAndModuleProps(publisherHandler, map);
                configureArtifactoryManagerAndDeploy(artifactoryClientConfiguration, publisherHandler, artifactoryTask.getDeployDetails(), str);
                map2.put(artifactoryTask.getProject().getName(), getTaskDeployDetails(artifactoryTask));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mergeRootAndModuleProps(ArtifactoryClientConfiguration.PublisherHandler publisherHandler, Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        map2.putAll(publisherHandler.getProps());
        publisherHandler.getProps().putAll(map2);
    }

    public static void configureArtifactoryManagerAndDeploy(ArtifactoryClientConfiguration artifactoryClientConfiguration, ArtifactoryClientConfiguration.PublisherHandler publisherHandler, Set<GradleDeployDetails> set, String str) throws IOException {
        ArtifactoryManager artifactoryManagerCreateArtifactoryManager = createArtifactoryManager(publisherHandler);
        try {
            configureArtifactoryManager(artifactoryClientConfiguration, artifactoryManagerCreateArtifactoryManager);
            deployArtifacts(set, artifactoryManagerCreateArtifactoryManager, new IncludeExcludePatterns(publisherHandler.getIncludePatterns(), publisherHandler.getExcludePatterns()), str, publisherHandler.getMinChecksumDeploySizeKb());
            if (artifactoryManagerCreateArtifactoryManager != null) {
                artifactoryManagerCreateArtifactoryManager.close();
            }
        } catch (Throwable th) {
            if (artifactoryManagerCreateArtifactoryManager != null) {
                try {
                    artifactoryManagerCreateArtifactoryManager.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ArtifactoryManager createArtifactoryManager(ArtifactoryClientConfiguration.PublisherHandler publisherHandler) {
        String contextUrl = publisherHandler.getContextUrl();
        String username = publisherHandler.getUsername();
        String password = publisherHandler.getPassword();
        if (StringUtils.isBlank(username)) {
            username = "";
        }
        if (StringUtils.isBlank(password)) {
            password = "";
        }
        return new ArtifactoryManager(contextUrl, username, password, new GradleClientLogger(log));
    }

    public static void configureArtifactoryManager(ArtifactoryClientConfiguration artifactoryClientConfiguration, ArtifactoryManager artifactoryManager) {
        if (artifactoryClientConfiguration.getTimeout() != null) {
            artifactoryManager.setConnectionTimeout(artifactoryClientConfiguration.getTimeout().intValue());
        }
        if (artifactoryClientConfiguration.getConnectionRetries() != null) {
            artifactoryManager.setConnectionRetries(artifactoryClientConfiguration.getConnectionRetries().intValue());
        }
        log.debug("Deploying artifacts using InsecureTls = " + artifactoryClientConfiguration.getInsecureTls());
        artifactoryManager.setInsecureTls(artifactoryClientConfiguration.getInsecureTls());
        configureProxy(artifactoryClientConfiguration.proxy, artifactoryManager);
    }

    public static void configureProxy(ArtifactoryClientConfiguration.ProxyHandler proxyHandler, ArtifactoryManager artifactoryManager) {
        String host = proxyHandler.getHost();
        Integer port = proxyHandler.getPort();
        if (StringUtils.isBlank(host) || port == null) {
            return;
        }
        Logger logger = log;
        logger.debug("Found proxy host '{}' in port '{}'", host, port);
        String username = proxyHandler.getUsername();
        if (StringUtils.isNotBlank(username)) {
            logger.debug("Found proxy user name '{}'", username);
            artifactoryManager.setProxyConfiguration(host, proxyHandler.getPort().intValue(), username, proxyHandler.getPassword());
        } else {
            logger.debug("No proxy user name and password found, using anonymous proxy");
            artifactoryManager.setProxyConfiguration(host, proxyHandler.getPort().intValue());
        }
    }

    public static void deployArtifacts(Set<GradleDeployDetails> set, ArtifactoryManager artifactoryManager, IncludeExcludePatterns includeExcludePatterns, String str, int i) throws IOException {
        for (GradleDeployDetails gradleDeployDetails : set) {
            DeployDetails deployDetails = gradleDeployDetails.getDeployDetails();
            String artifactPath = deployDetails.getArtifactPath();
            if (PatternMatcher.pathConflicts(artifactPath, includeExcludePatterns)) {
                log.lifecycle("Skipping the deployment of '{}' due to the defined include-exclude patterns.", new Object[]{artifactPath});
            } else {
                try {
                    ArtifactoryUploadResponse artifactoryUploadResponseUpload = artifactoryManager.upload(deployDetails, str, Integer.valueOf(i));
                    gradleDeployDetails.getDeployDetails().setDeploySucceeded(Boolean.TRUE);
                    gradleDeployDetails.getDeployDetails().setSha256(artifactoryUploadResponseUpload.getChecksums().getSha256());
                } catch (IOException e) {
                    gradleDeployDetails.getDeployDetails().setDeploySucceeded(Boolean.FALSE);
                    gradleDeployDetails.getDeployDetails().setSha256("");
                    throw e;
                }
            }
        }
    }

    public static Set<DeployDetails> getTaskDeployDetails(ArtifactoryTask artifactoryTask) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<GradleDeployDetails> it = artifactoryTask.getDeployDetails().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getDeployDetails());
        }
        return linkedHashSet;
    }

    public static void deployBuildInfo(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo, Map<String, Set<DeployDetails>> map) throws IOException {
        if (artifactoryClientConfiguration.publisher.getContextUrl() == null) {
            return;
        }
        ArtifactoryManager artifactoryManagerCreateArtifactoryManager = createArtifactoryManager(artifactoryClientConfiguration.publisher);
        try {
            configureProxy(artifactoryClientConfiguration.proxy, artifactoryManagerCreateArtifactoryManager);
            if (artifactoryClientConfiguration.publisher.isPublishBuildInfo().booleanValue()) {
                log.debug("Publishing build info to artifactory at: '{}'", artifactoryClientConfiguration.publisher.getContextUrl());
                Utils.sendBuildAndBuildRetention(artifactoryManagerCreateArtifactoryManager, buildInfo, artifactoryClientConfiguration);
            }
            exportDeployedArtifacts(artifactoryClientConfiguration, map);
            if (artifactoryManagerCreateArtifactoryManager != null) {
                artifactoryManagerCreateArtifactoryManager.close();
            }
        } catch (Throwable th) {
            if (artifactoryManagerCreateArtifactoryManager != null) {
                try {
                    artifactoryManagerCreateArtifactoryManager.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void exportDeployedArtifacts(ArtifactoryClientConfiguration artifactoryClientConfiguration, Map<String, Set<DeployDetails>> map) {
        String deployableArtifactsFilePath = artifactoryClientConfiguration.info.getDeployableArtifactsFilePath();
        if (StringUtils.isEmpty(deployableArtifactsFilePath)) {
            return;
        }
        try {
            log.debug("Exporting deployable artifacts to '{}'", deployableArtifactsFilePath);
            DeployableArtifactsUtils.saveDeployableArtifactsToFile(map, new File(deployableArtifactsFilePath), artifactoryClientConfiguration.info.isBackwardCompatibleDeployableArtifacts());
        } catch (Exception e) {
            log.error("Failed writing deployable artifacts to file: ", e);
            throw new RuntimeException("Failed writing deployable artifacts to file", e);
        }
    }
}
