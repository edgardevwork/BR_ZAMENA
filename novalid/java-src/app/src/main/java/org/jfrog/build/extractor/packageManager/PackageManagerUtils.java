package org.jfrog.build.extractor.packageManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.IncludeExcludePatterns;
import org.jfrog.build.extractor.clientConfiguration.PatternMatcher;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.Module;

/* loaded from: classes7.dex */
public class PackageManagerUtils {
    public static final int accessTokenSecretMinimalLength = 0;
    public static final String accessTokenSecretPrefix = "eyJ2ZXIiOiIyIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYiLCJraWQiOiJ";
    public static final int apiKeySecretMinimalLength = 73;
    public static final String apiKeySecretPrefix = "AKCp8";
    public static final int referenceTokenSecretMinimalLength = 64;
    public static final String referenceTokenSecretPrefix = "cmVmdGtuOjAxOj";

    public static ArtifactoryClientConfiguration createArtifactoryClientConfiguration() {
        PackageManagerLogger packageManagerLogger = new PackageManagerLogger();
        ArtifactoryClientConfiguration artifactoryClientConfiguration = new ArtifactoryClientConfiguration(packageManagerLogger);
        Properties properties = new Properties();
        properties.putAll(System.getenv());
        artifactoryClientConfiguration.fillFromProperties(BuildInfoExtractorUtils.mergePropertiesWithSystemAndPropertyFile(properties, packageManagerLogger));
        return artifactoryClientConfiguration;
    }

    public static String createArtifactoryUrlWithCredentials(String str, String str2, String str3, String str4) throws MalformedURLException, URISyntaxException {
        URL url = new URL(str);
        return new URIBuilder().setScheme(url.getProtocol()).setUserInfo(str2, str3).setHost(url.getHost()).setPort(url.getPort()).setPath(url.getPath() + str4).build().toURL().toString();
    }

    public static void collectEnvAndFilterProperties(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo) {
        collectEnvIfNeeded(artifactoryClientConfiguration, buildInfo);
        filterBuildInfoProperties(artifactoryClientConfiguration, buildInfo, artifactoryClientConfiguration.getLog());
    }

    public static void collectEnvIfNeeded(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo) throws IOException {
        if (artifactoryClientConfiguration.isIncludeEnvVars().booleanValue()) {
            Properties properties = new Properties();
            properties.putAll(artifactoryClientConfiguration.getAllProperties());
            Properties envProperties = BuildInfoExtractorUtils.getEnvProperties(properties, artifactoryClientConfiguration.getLog());
            if (buildInfo.getProperties() != null) {
                buildInfo.getProperties().putAll(envProperties);
            } else {
                buildInfo.setProperties(envProperties);
            }
        }
    }

    public static void filterBuildInfoProperties(ArtifactoryClientConfiguration artifactoryClientConfiguration, BuildInfo buildInfo, Log log) {
        filterExcludeIncludeProperties(new IncludeExcludePatterns(artifactoryClientConfiguration.getEnvVarsIncludePatterns(), artifactoryClientConfiguration.getEnvVarsExcludePatterns()), buildInfo, log);
    }

    public static void filterExcludeIncludeProperties(IncludeExcludePatterns includeExcludePatterns, BuildInfo buildInfo, Log log) {
        Properties properties = buildInfo.getProperties();
        if (properties != null && properties.size() > 0) {
            buildInfo.setProperties(getExcludeIncludeProperties(includeExcludePatterns, properties, log));
        }
        List<Module> modules = buildInfo.getModules();
        if (modules == null || modules.size() == 0) {
            return;
        }
        for (Module module : modules) {
            Properties properties2 = module.getProperties();
            if (properties2 != null && properties2.size() > 0) {
                module.setProperties(getExcludeIncludeProperties(includeExcludePatterns, properties2, log));
            }
        }
    }

    public static Properties getExcludeIncludeProperties(IncludeExcludePatterns includeExcludePatterns, Properties properties, Log log) {
        Properties properties2 = new Properties();
        for (Map.Entry entry : properties.entrySet()) {
            if (isExcludedByKey(includeExcludePatterns, entry) || containsSuspectedSecrets(entry.getValue().toString())) {
                log.debug("[buildinfo] Property '" + entry.getKey() + "' has been excluded'");
            } else {
                properties2.put(entry.getKey(), entry.getValue());
            }
        }
        return properties2;
    }

    public static boolean isExcludedByKey(IncludeExcludePatterns includeExcludePatterns, Map.Entry<Object, Object> entry) {
        return PatternMatcher.pathConflicts(entry.getKey().toString(), includeExcludePatterns);
    }

    public static boolean containsSuspectedSecrets(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        return containsSuspectedSecret(str, apiKeySecretPrefix, 73) || containsSuspectedSecret(str, referenceTokenSecretPrefix, 64) || containsSuspectedSecret(str, accessTokenSecretPrefix, 0);
    }

    public static boolean containsSuspectedSecret(String str, String str2, int i) {
        return str.startsWith(str2) && str.length() >= i;
    }
}
