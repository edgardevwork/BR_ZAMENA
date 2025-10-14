package org.jfrog.build.extractor.clientConfiguration;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.IOUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.util.IssuesTrackerUtils;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.BuildInfoFields;
import org.jfrog.build.extractor.p065ci.Issue;

/* loaded from: classes8.dex */
public class ArtifactoryClientConfiguration {
    public static final transient int DEFAULT_MIN_CHECKSUM_DEPLOY_SIZE_KB = 10;
    public static final String DEFAULT_NUGET_PROTOCOL = "v2";
    public final DockerHandler dockerHandler;
    public final DotnetHandler dotnetHandler;
    public final GoHandler goHandler;
    public final BuildInfoHandler info;
    public final NpmHandler npmHandler;
    public final PackageManagerHandler packageManagerHandler;
    public final PipHandler pipHandler;
    public final ProxyHandler proxy;
    public final PublisherHandler publisher;
    public final ResolverHandler resolver;
    public final PrefixPropertyHandler root;
    public final PrefixPropertyHandler rootConfig;

    public ArtifactoryClientConfiguration(Log log) {
        PrefixPropertyHandler prefixPropertyHandler = new PrefixPropertyHandler(log, new ConcurrentSkipListMap());
        this.root = prefixPropertyHandler;
        this.rootConfig = new PrefixPropertyHandler(prefixPropertyHandler, "buildInfoConfig.");
        this.resolver = new ResolverHandler();
        this.publisher = new PublisherHandler();
        this.info = new BuildInfoHandler();
        this.proxy = new ProxyHandler();
        this.packageManagerHandler = new PackageManagerHandler();
        this.npmHandler = new NpmHandler();
        this.pipHandler = new PipHandler();
        this.dotnetHandler = new DotnetHandler();
        this.dockerHandler = new DockerHandler();
        this.goHandler = new GoHandler();
    }

    public void fillFromProperties(Map<String, String> map, IncludeExcludePatterns includeExcludePatterns) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!PatternMatcher.pathConflicts(key, includeExcludePatterns)) {
                this.root.setStringValue(key, entry.getValue());
            }
        }
    }

    public void fillFromProperties(Properties properties) {
        fillFromProperties(properties, (Set<String>) null);
    }

    public void fillFromProperties(Properties properties, Set<String> set) {
        for (Map.Entry entry : properties.entrySet()) {
            String str = (String) entry.getKey();
            if (set == null || !set.contains(str) || this.root.getStringValue(str) == null) {
                this.root.setStringValue(str, (String) entry.getValue());
            }
        }
    }

    public Map<String, String> getAllProperties() {
        return this.root.props;
    }

    public Map<String, String> getAllRootConfig() {
        return this.rootConfig.props;
    }

    public Log getLog() {
        return this.root.getLog();
    }

    public void persistToPropertiesFile() throws Throwable {
        if (StringUtils.isEmpty(getPropertiesFile())) {
            return;
        }
        Properties properties = new Properties();
        properties.putAll(filterMapNullValues(this.root.props));
        properties.putAll(filterMapNullValues(this.rootConfig.props));
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(getPropertiesFile()).getCanonicalFile());
                try {
                    properties.store(fileOutputStream2, "BuildInfo configuration property file");
                    IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static Map<String, String> filterMapNullValues(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (StringUtils.isNotBlank(entry.getValue())) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    @Deprecated
    public String getContextUrl() {
        return this.root.getStringValue("contextUrl");
    }

    public void setTimeoutSec(Integer num) {
        setTimeout(num);
    }

    public Integer getTimeout() {
        return this.root.getIntegerValue(ClientProperties.PROP_TIMEOUT);
    }

    public void setTimeout(Integer num) {
        this.root.setIntegerValue(ClientProperties.PROP_TIMEOUT, num);
    }

    public void setConnectionRetries(Integer num) {
        this.root.setIntegerValue(ClientProperties.PROP_CONNECTION_RETRIES, num);
    }

    public Integer getConnectionRetries() {
        return this.root.getIntegerValue(ClientProperties.PROP_CONNECTION_RETRIES);
    }

    public boolean getInsecureTls() {
        return this.root.getBooleanValue(ClientProperties.PROP_INSECURE_TLS, Boolean.FALSE).booleanValue();
    }

    public void setInsecureTls(boolean z) {
        this.root.setBooleanValue(ClientProperties.PROP_INSECURE_TLS, Boolean.valueOf(z));
    }

    public Integer getSocketTimeout() {
        return this.root.getIntegerValue(ClientProperties.PROP_SO_TIMEOUT);
    }

    public void setSocketTimeout(Integer num) {
        this.root.setIntegerValue(ClientProperties.PROP_SO_TIMEOUT, num);
    }

    public Integer getMaxTotalConnection() {
        return this.root.getIntegerValue(ClientProperties.PROP_MAX_TOTAL_CO);
    }

    public void setMaxTotalConnection(Integer num) {
        this.root.setIntegerValue(ClientProperties.PROP_MAX_TOTAL_CO, num);
    }

    public Integer getMaxConnectionPerRoute() {
        return this.root.getIntegerValue(ClientProperties.PROP_MAX_CO_PER_ROUTE);
    }

    public void setMaxConnectionPerRoute(Integer num) {
        this.root.setIntegerValue(ClientProperties.PROP_MAX_CO_PER_ROUTE, num);
    }

    public String getPropertiesFile() {
        return this.rootConfig.getStringValue("propertiesFile");
    }

    public void setPropertiesFile(String str) {
        this.rootConfig.setStringValue("propertiesFile", str);
    }

    public String getExportFile() {
        return this.rootConfig.getStringValue("exportFile");
    }

    public void setExportFile(String str) {
        this.rootConfig.setStringValue("exportFile", str);
    }

    public void setIncludeEnvVars(Boolean bool) {
        this.rootConfig.setBooleanValue("includeEnvVars", bool);
    }

    public Boolean isIncludeEnvVars() {
        return this.rootConfig.getBooleanValue("includeEnvVars", Boolean.FALSE);
    }

    public String getEnvVarsIncludePatterns() {
        return this.rootConfig.getStringValue("envVarsIncludePatterns");
    }

    public void setEnvVarsIncludePatterns(String str) {
        this.rootConfig.setStringValue("envVarsIncludePatterns", str);
    }

    public String getEnvVarsExcludePatterns() {
        return this.rootConfig.getStringValue("envVarsExcludePatterns");
    }

    public void setEnvVarsExcludePatterns(String str) {
        this.rootConfig.setStringValue("envVarsExcludePatterns", str);
    }

    public void setActivateRecorder(Boolean bool) {
        this.root.setBooleanValue("org.jfrog.build.extractor.maven.recorder.activate", bool);
    }

    public Boolean isActivateRecorder() {
        return this.root.getBooleanValue("org.jfrog.build.extractor.maven.recorder.activate", Boolean.FALSE);
    }

    /* loaded from: classes7.dex */
    public class ResolverHandler extends RepositoryConfiguration {
        public ResolverHandler() {
            super(ClientProperties.PROP_RESOLVE_PREFIX);
        }

        public String getDownloadUrl() {
            return ArtifactoryClientConfiguration.this.root.getStringValue("artifactory.downloadUrl");
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getContextUrl() {
            String stringValue = getStringValue("contextUrl");
            return StringUtils.isBlank(stringValue) ? ArtifactoryClientConfiguration.this.getContextUrl() : stringValue;
        }

        public void setContextUrl(String str) {
            setStringValue("contextUrl", str);
        }

        public boolean isIvyRepositoryDefined() {
            return ArtifactoryClientConfiguration.this.root.getBooleanValue(ClientConfigurationFields.IVY_REPO_DEFINED, Boolean.FALSE).booleanValue();
        }

        public void setIvyRepositoryDefined(boolean z) {
            ArtifactoryClientConfiguration.this.root.setBooleanValue(ClientConfigurationFields.IVY_REPO_DEFINED, Boolean.valueOf(z));
        }

        public String getBuildRoot() {
            return getMatrixParams().get("build.root");
        }

        public void setBuildRoot(String str) {
            addMatrixParam("build.root", str);
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getMatrixParamPrefix() {
            return getPrefix() + ClientConfigurationFields.MATRIX;
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getDeprecatedMatrixParamPrefix() {
            return getDeprecatedPrefix() + ClientConfigurationFields.MATRIX;
        }

        public String getDownloadSnapshotRepoKey() {
            return getStringValue(ClientConfigurationFields.DOWN_SNAPSHOT_REPO_KEY);
        }

        public void setDownloadSnapshotRepoKey(String str) {
            setStringValue(ClientConfigurationFields.DOWN_SNAPSHOT_REPO_KEY, str);
        }
    }

    /* loaded from: classes7.dex */
    public class PublisherHandler extends RepositoryConfiguration {
        public PublisherHandler() {
            super(ClientProperties.PROP_PUBLISH_PREFIX);
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getContextUrl() {
            String stringValue = getStringValue("contextUrl");
            return StringUtils.isBlank(stringValue) ? ArtifactoryClientConfiguration.this.getContextUrl() : stringValue;
        }

        public void setContextUrl(String str) {
            setStringValue("contextUrl", str);
        }

        public String getSnapshotRepoKey() {
            return getStringValue(ClientConfigurationFields.SNAPSHOT_REPO_KEY);
        }

        public void setSnapshotRepoKey(String str) {
            setStringValue(ClientConfigurationFields.SNAPSHOT_REPO_KEY, str);
        }

        public String getReleaseRepoKey() {
            return getStringValue(ClientConfigurationFields.RELEASE_REPO_KEY);
        }

        public void setReleaseRepoKey(String str) {
            setStringValue(ClientConfigurationFields.RELEASE_REPO_KEY, str);
        }

        public void setPublishArtifacts(Boolean bool) {
            setBooleanValue("artifacts", bool);
        }

        public Boolean isPublishArtifacts() {
            return getBooleanValue("artifacts", Boolean.TRUE);
        }

        public Boolean shouldAddDeployableArtifacts() {
            return getBooleanValue(ClientConfigurationFields.ADD_DEPLOYABLE_ARTIFACTS, Boolean.TRUE);
        }

        public void setPublishBuildInfo(Boolean bool) {
            setBooleanValue(ClientConfigurationFields.PUBLISH_BUILD_INFO, bool);
        }

        public Boolean isPublishBuildInfo() {
            return getBooleanValue(ClientConfigurationFields.PUBLISH_BUILD_INFO, Boolean.TRUE);
        }

        public void setPublishForkCount(int i) {
            setIntegerValue(ClientConfigurationFields.PUBLISH_FORK_COUNT, Integer.valueOf(i));
        }

        public Integer getPublishForkCount() {
            return getIntegerValue(ClientConfigurationFields.PUBLISH_FORK_COUNT, 3);
        }

        public boolean isRecordAllDependencies() {
            return getBooleanValue(ClientConfigurationFields.RECORD_ALL_DEPENDENCIES, Boolean.FALSE).booleanValue();
        }

        public void setRecordAllDependencies(Boolean bool) {
            setBooleanValue(ClientConfigurationFields.RECORD_ALL_DEPENDENCIES, bool);
        }

        public String getIncludePatterns() {
            return getStringValue(ClientConfigurationFields.INCLUDE_PATTERNS);
        }

        public void setIncludePatterns(String str) {
            setStringValue(ClientConfigurationFields.INCLUDE_PATTERNS, str);
        }

        public boolean isFilterExcludedArtifactsFromBuild() {
            return getBooleanValue(ClientConfigurationFields.FILTER_EXCLUDED_ARTIFACTS_FROM_BUILD, Boolean.FALSE).booleanValue();
        }

        public void setFilterExcludedArtifactsFromBuild(boolean z) {
            setBooleanValue(ClientConfigurationFields.FILTER_EXCLUDED_ARTIFACTS_FROM_BUILD, Boolean.valueOf(z));
        }

        public String getExcludePatterns() {
            return getStringValue(ClientConfigurationFields.EXCLUDE_PATTERNS);
        }

        public void setExcludePatterns(String str) {
            setStringValue(ClientConfigurationFields.EXCLUDE_PATTERNS, str);
        }

        public void setEvenUnstable(Boolean bool) {
            setBooleanValue(ClientConfigurationFields.EVEN_UNSTABLE, bool);
        }

        public Boolean isEvenUnstable() {
            return getBooleanValue(ClientConfigurationFields.EVEN_UNSTABLE, Boolean.FALSE);
        }

        public String getBuildRoot() {
            return getMatrixParams().get("build.root");
        }

        public void setBuildRoot(String str) {
            addMatrixParam("build.root", str);
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getMatrixParamPrefix() {
            return ClientProperties.PROP_DEPLOY_PARAM_PROP_PREFIX;
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration.RepositoryConfiguration
        public String getDeprecatedMatrixParamPrefix() {
            return ClientProperties.DEPRECATED_PROP_DEPLOY_PARAM_PROP_PREFIX;
        }

        public ArtifactSpecs getArtifactSpecs() {
            return new ArtifactSpecs(getStringValue(ClientConfigurationFields.ARTIFACT_SPECS));
        }

        public void setArtifactSpecs(String str) {
            setStringValue(ClientConfigurationFields.ARTIFACT_SPECS, str);
        }

        public String getPublications() {
            return getStringValue(ClientConfigurationFields.PUBLICATIONS);
        }

        public void setPublications(String str) {
            setStringValue(ClientConfigurationFields.PUBLICATIONS, str);
        }

        public int getMinChecksumDeploySizeKb() {
            return getIntegerValue("minChecksumDeploySizeKb", 10).intValue();
        }

        public void setMinChecksumDeploySizeKb(int i) {
            setIntegerValue("minChecksumDeploySizeKb", Integer.valueOf(i));
        }
    }

    /* loaded from: classes5.dex */
    public class ProxyHandler extends AuthenticationConfiguration {
        public ProxyHandler() {
            super(ClientProperties.PROP_PROXY_PREFIX);
        }

        public String getHost() {
            return getStringValue("host");
        }

        public void setHost(String str) {
            setStringValue("host", str);
        }

        public Integer getPort() {
            return getIntegerValue("port");
        }

        public void setPort(Integer num) {
            setIntegerValue("port", num);
        }
    }

    /* loaded from: classes5.dex */
    public class PackageManagerHandler extends PrefixPropertyHandler {
        public PackageManagerHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_PACKAGE_MANAGER_PREFIX);
        }

        public String getArgs() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.PACKAGE_MANAGER_ARGS);
        }

        public void setArgs(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.PACKAGE_MANAGER_ARGS, str);
        }

        public String getPath() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.PACKAGE_MANAGER_PATH);
        }

        public void setPath(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.PACKAGE_MANAGER_PATH, str);
        }

        public String getModule() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.PACKAGE_MANAGER_MODULE);
        }

        public void setModule(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.PACKAGE_MANAGER_MODULE, str);
        }
    }

    /* loaded from: classes5.dex */
    public class NpmHandler extends PrefixPropertyHandler {
        public NpmHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_NPM_PREFIX);
        }

        public boolean isCiCommand() {
            return ArtifactoryClientConfiguration.this.rootConfig.getBooleanValue(ClientConfigurationFields.NPM_CI_COMMAND, Boolean.FALSE).booleanValue();
        }

        public void setCiCommand(boolean z) {
            ArtifactoryClientConfiguration.this.rootConfig.setBooleanValue(ClientConfigurationFields.NPM_CI_COMMAND, Boolean.valueOf(z));
        }
    }

    /* loaded from: classes5.dex */
    public class GoHandler extends PrefixPropertyHandler {
        public GoHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_GO_PREFIX);
        }

        public String getGoPublishedVersion() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.GO_PUBLISHED_VERSION);
        }

        public void setGoPublishedVersion(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.GO_PUBLISHED_VERSION, str);
        }
    }

    /* loaded from: classes5.dex */
    public class PipHandler extends PrefixPropertyHandler {
        public PipHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_PIP_PREFIX);
        }

        public String getEnvActivation() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.PIP_ENV_ACTIVATION);
        }

        public void setEnvActivation(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.PIP_ENV_ACTIVATION, str);
        }
    }

    /* loaded from: classes5.dex */
    public class DotnetHandler extends PrefixPropertyHandler {
        public DotnetHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_DOTNET_PREFIX);
        }

        public boolean useDotnetCoreCli() {
            return ArtifactoryClientConfiguration.this.rootConfig.getBooleanValue(ClientConfigurationFields.DOTNET_USE_DOTNET_CORE_CLI, Boolean.FALSE).booleanValue();
        }

        public void setUseDotnetCli(boolean z) {
            ArtifactoryClientConfiguration.this.rootConfig.setBooleanValue(ClientConfigurationFields.DOTNET_USE_DOTNET_CORE_CLI, Boolean.valueOf(z));
        }

        public String apiProtocol() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.DOTNET_NUGET_PROTOCOL, ArtifactoryClientConfiguration.DEFAULT_NUGET_PROTOCOL);
        }

        public void setApiProtocol(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.DOTNET_NUGET_PROTOCOL, str);
        }
    }

    /* loaded from: classes5.dex */
    public class DockerHandler extends PrefixPropertyHandler {
        public DockerHandler() {
            super(ArtifactoryClientConfiguration.this.root, ClientProperties.PROP_DOCKER_PREFIX);
        }

        public String getImageTag() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.DOCKER_IMAGE_TAG);
        }

        public void setImageTag(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.DOCKER_IMAGE_TAG, str);
        }

        public String getHost() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.DOCKER_HOST);
        }

        public void setHost(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.DOCKER_HOST, str);
        }

        public String getKanikoImageFile() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.KANIKO_IMAGE_FILE);
        }

        public void setKanikoImageFile(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.KANIKO_IMAGE_FILE, str);
        }

        public String getJibImageFile() {
            return ArtifactoryClientConfiguration.this.rootConfig.getStringValue(ClientConfigurationFields.JIB_IMAGE_FILE);
        }

        public void setJibImageFile(String str) {
            ArtifactoryClientConfiguration.this.rootConfig.setStringValue(ClientConfigurationFields.JIB_IMAGE_FILE, str);
        }
    }

    /* loaded from: classes5.dex */
    public class AuthenticationConfiguration extends PrefixPropertyHandler {
        public AuthenticationConfiguration(String str) {
            super(ArtifactoryClientConfiguration.this.root, str);
        }

        public String getUsername() {
            return getStringValue("username");
        }

        public void setUsername(String str) {
            setStringValue("username", str);
        }

        public String getPassword() {
            return getStringValue("password");
        }

        public void setPassword(String str) {
            setStringValue("password", str);
        }
    }

    /* loaded from: classes5.dex */
    public abstract class RepositoryConfiguration extends AuthenticationConfiguration {
        public ImmutableMap<String, String> calculatedMatrixParams;

        public abstract String getContextUrl();

        public abstract String getDeprecatedMatrixParamPrefix();

        public abstract String getMatrixParamPrefix();

        public RepositoryConfiguration(String str) {
            super(str);
        }

        public String getName() {
            return getStringValue("name");
        }

        public void setName(String str) {
            setStringValue("name", str);
        }

        public String urlWithMatrixParams(String str) {
            if (str == null) {
                return null;
            }
            String strStripEnd = StringUtils.stripEnd(str, "/;");
            ImmutableMap<String, String> matrixParams = getMatrixParams();
            if (matrixParams.isEmpty()) {
                return strStripEnd;
            }
            StringBuilder sb = new StringBuilder(strStripEnd);
            for (Map.Entry<String, String> entry : matrixParams.entrySet()) {
                sb.append(';');
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append(';');
            return sb.toString();
        }

        public String getUrlWithMatrixParams() {
            return urlWithMatrixParams(getUrl());
        }

        public String getUrl() {
            String stringValue = getStringValue("url");
            if (StringUtils.isBlank(stringValue) && StringUtils.isNotBlank(getRepoKey())) {
                String contextUrl = getContextUrl();
                if (StringUtils.isNotBlank(contextUrl)) {
                    return StringUtils.stripEnd(contextUrl, "/ ") + "/" + getRepoKey();
                }
            }
            return StringUtils.removeEnd(stringValue, "/");
        }

        public void setUrl(String str) {
            setStringValue("url", str);
        }

        public String getUrl(String str) {
            String stringValue = getStringValue("url");
            if (StringUtils.isBlank(stringValue) && StringUtils.isNotBlank(str)) {
                String contextUrl = getContextUrl();
                if (StringUtils.isNotBlank(contextUrl)) {
                    return StringUtils.stripEnd(contextUrl, "/ ") + "/" + str;
                }
            }
            return StringUtils.removeEnd(stringValue, "/");
        }

        public String getRepoKey() {
            return getStringValue(ClientConfigurationFields.REPO_KEY);
        }

        public void setRepoKey(String str) {
            setStringValue(ClientConfigurationFields.REPO_KEY, str);
        }

        public void setMaven(boolean z) {
            setBooleanValue(ClientConfigurationFields.MAVEN, Boolean.valueOf(z));
        }

        public Boolean isMaven() {
            return getBooleanValue(ClientConfigurationFields.MAVEN, null);
        }

        public void setIvy(Boolean bool) {
            setBooleanValue(ClientConfigurationFields.IVY, bool);
        }

        public Boolean isIvy() {
            return getBooleanValue(ClientConfigurationFields.IVY, null);
        }

        public boolean isM2Compatible() {
            return getBooleanValue(ClientConfigurationFields.IVY_M2_COMPATIBLE, Boolean.TRUE).booleanValue();
        }

        public void setM2Compatible(Boolean bool) {
            setBooleanValue(ClientConfigurationFields.IVY_M2_COMPATIBLE, bool);
        }

        public String getIvyArtifactPattern() {
            String stringValue = getStringValue(ClientConfigurationFields.IVY_ART_PATTERN);
            if (StringUtils.isBlank(stringValue)) {
                return "[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]";
            }
            return stringValue.trim();
        }

        public void setIvyArtifactPattern(String str) {
            setStringValue(ClientConfigurationFields.IVY_ART_PATTERN, str);
        }

        public String getIvyPattern() {
            String stringValue = getStringValue(ClientConfigurationFields.IVY_IVY_PATTERN);
            if (StringUtils.isBlank(stringValue)) {
                return "[organisation]/[module]/ivy-[revision].xml";
            }
            return stringValue.trim();
        }

        public void setIvyPattern(String str) {
            setStringValue(ClientConfigurationFields.IVY_IVY_PATTERN, str);
        }

        public void setMatrixParam(String str, String str2) {
            putMatrixParam(str, str2, true);
        }

        public void addMatrixParam(String str, String str2) {
            putMatrixParam(str, str2, false);
        }

        public final void putMatrixParam(String str, String str2, boolean z) {
            if (StringUtils.isBlank(str) || StringUtils.isBlank(str2)) {
                return;
            }
            String matrixParamPrefix = getMatrixParamPrefix();
            if (!str.startsWith(matrixParamPrefix)) {
                str = matrixParamPrefix + str;
            }
            if (!z && this.props.get(str) != null) {
                str2 = this.props.get(str) + "," + str2;
            }
            this.props.put(str, str2);
        }

        public String getMatrixParam(String str) {
            if (StringUtils.isBlank(str)) {
                return null;
            }
            String matrixParamPrefix = getMatrixParamPrefix();
            if (!str.startsWith(matrixParamPrefix)) {
                str = matrixParamPrefix + str;
            }
            return this.props.get(str);
        }

        public void addMatrixParams(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                addMatrixParam(entry.getKey(), entry.getValue());
            }
        }

        public void addMatrixParams(ArrayListMultimap<String, String> arrayListMultimap) {
            for (Map.Entry entry : arrayListMultimap.entries()) {
                addMatrixParam((String) entry.getKey(), (String) entry.getValue());
            }
        }

        public ImmutableMap<String, String> getMatrixParams() {
            ImmutableMap<String, String> immutableMap = this.calculatedMatrixParams;
            if (immutableMap != null) {
                return immutableMap;
            }
            Map<String, String> resolveMatrixParams = getResolveMatrixParams(getDeprecatedMatrixParamPrefix());
            if (resolveMatrixParams.size() == 0) {
                resolveMatrixParams = getResolveMatrixParams(getMatrixParamPrefix());
            }
            ImmutableMap<String, String> immutableMapCopyOf = ImmutableMap.copyOf((Map) resolveMatrixParams);
            this.calculatedMatrixParams = immutableMapCopyOf;
            return immutableMapCopyOf;
        }

        public final Map<String, String> getResolveMatrixParams(String str) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : this.props.entrySet()) {
                if (entry.getKey().startsWith(str)) {
                    map.put(entry.getKey().substring(str.length()), entry.getValue());
                }
            }
            return map;
        }
    }

    /* loaded from: classes5.dex */
    public class IssuesTrackerHandler extends PrefixPropertyHandler {
        public IssuesTrackerHandler() {
            super(ArtifactoryClientConfiguration.this.root, "buildInfo.issues.");
        }

        public String getIssueTrackerName() {
            return getStringValue("tracker.name");
        }

        public void setIssueTrackerName(String str) {
            setStringValue("tracker.name", str);
        }

        public String getIssueTrackerVersion() {
            return getStringValue("tracker.version");
        }

        public void setIssueTrackerVersion(String str) {
            setStringValue("tracker.version", str);
        }

        public boolean getAggregateBuildIssues() {
            return getBooleanValue("aggregateBuildIssues", Boolean.FALSE).booleanValue();
        }

        public void setAggregateBuildIssues(boolean z) {
            setBooleanValue("aggregateBuildIssues", Boolean.valueOf(z));
        }

        public String getAggregationBuildStatus() {
            return getStringValue("aggregationBuildStatus");
        }

        public void setAggregationBuildStatus(String str) {
            setStringValue("aggregationBuildStatus", str);
        }

        public String getAffectedIssues() {
            return getStringValue("affectedIssues");
        }

        public void setAffectedIssues(String str) {
            setStringValue("affectedIssues", str);
        }

        public Set<Issue> getAffectedIssuesSet() {
            return IssuesTrackerUtils.getAffectedIssuesSet(getAffectedIssues());
        }
    }

    /* loaded from: classes5.dex */
    public class BuildInfoHandler extends PrefixPropertyHandler {
        public final Predicate<String> buildRunParametersPredicate;
        public final Predicate<String> buildVariablesPredicate;
        public final IssuesTrackerHandler issues;

        public BuildInfoHandler() {
            super(ArtifactoryClientConfiguration.this.root, "buildInfo.");
            this.issues = ArtifactoryClientConfiguration.this.new IssuesTrackerHandler();
            this.buildVariablesPredicate = new Predicate() { // from class: org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration$BuildInfoHandler$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ArtifactoryClientConfiguration.BuildInfoHandler.lambda$new$0((String) obj);
                }
            };
            this.buildRunParametersPredicate = new Predicate() { // from class: org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration$BuildInfoHandler$$ExternalSyntheticLambda1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ArtifactoryClientConfiguration.BuildInfoHandler.lambda$new$1((String) obj);
                }
            };
        }

        public static /* synthetic */ boolean lambda$new$0(String str) {
            return str.startsWith("buildInfo.env.");
        }

        public static /* synthetic */ boolean lambda$new$1(String str) {
            return str.startsWith("buildInfo.runParameters.");
        }

        public String getProject() {
            return getStringValue("build.project");
        }

        public void setProject(String str) {
            setStringValue("build.project", str);
        }

        public String getBuildName() {
            return getStringValue("build.name");
        }

        public void setBuildName(String str) {
            setStringValue("build.name", str);
        }

        public String getBuildNumber() {
            return getStringValue("build.number");
        }

        public void setBuildNumber(String str) {
            setStringValue("build.number", str);
        }

        public String getBuildTimestamp() {
            return getStringValue("build.timestamp");
        }

        public void setBuildTimestamp(String str) {
            setStringValue("build.timestamp", str);
        }

        public void setBuildStarted(String str) {
            setStringValue("build.started", str);
        }

        public String getBuildStarted() {
            return getStringValue("build.started");
        }

        public void setBuildStarted(long j) {
            setBuildStarted(BuildInfo.formatBuildStarted(j));
        }

        public String getPrincipal() {
            return getStringValue("principal");
        }

        public void setPrincipal(String str) {
            setStringValue("principal", str);
        }

        public String getArtifactoryPluginVersion() {
            return getStringValue("artifactoryPluginVersion");
        }

        public void setArtifactoryPluginVersion(String str) {
            setStringValue("artifactoryPluginVersion", str);
        }

        public String getBuildUrl() {
            return getStringValue("buildUrl");
        }

        public void setBuildUrl(String str) {
            setStringValue("buildUrl", str);
        }

        public String getVcsRevision() {
            return getStringValue("vcs.revision");
        }

        public void setVcsRevision(String str) {
            setStringValue("vcs.revision", str);
        }

        public String getVcsUrl() {
            return getStringValue("vcs.url");
        }

        public void setVcsUrl(String str) {
            setStringValue("vcs.url", str);
        }

        public String getVcsBranch() {
            return getStringValue(BuildInfoFields.VCS_BRANCH);
        }

        public void setVcsBranch(String str) {
            setStringValue(BuildInfoFields.VCS_BRANCH, str);
        }

        public String getVcsMessage() {
            return getStringValue(BuildInfoFields.VCS_MESSAGE);
        }

        public void setVcsMessage(String str) {
            setStringValue(BuildInfoFields.VCS_MESSAGE, str);
        }

        public String getAgentName() {
            return getStringValue("agent.name");
        }

        public void setAgentName(String str) {
            setStringValue("agent.name", str);
        }

        public String getAgentVersion() {
            return getStringValue("agent.version");
        }

        public void setAgentVersion(String str) {
            setStringValue("agent.version", str);
        }

        public String getBuildAgentName() {
            return getStringValue("buildAgent.name");
        }

        public void setBuildAgentName(String str) {
            setStringValue("buildAgent.name", str);
        }

        public String getBuildAgentVersion() {
            return getStringValue("buildAgent.version");
        }

        public void setBuildAgentVersion(String str) {
            setStringValue("buildAgent.version", str);
        }

        public String getParentBuildName() {
            return getStringValue("build.parentName");
        }

        public void setParentBuildName(String str) {
            setStringValue("build.parentName", str);
        }

        public String getParentBuildNumber() {
            return getStringValue("build.parentNumber");
        }

        public void setParentBuildNumber(String str) {
            setStringValue("build.parentNumber", str);
        }

        public void setDeleteBuildArtifacts(Boolean bool) {
            setBooleanValue("buildRetention.deleteBuildArtifacts", bool);
        }

        public Boolean isDeleteBuildArtifacts() {
            return getBooleanValue("buildRetention.deleteBuildArtifacts", Boolean.TRUE);
        }

        public void setAsyncBuildRetention(Boolean bool) {
            setBooleanValue("buildRetention.async", bool);
        }

        public Boolean isAsyncBuildRetention() {
            return getBooleanValue("buildRetention.async", Boolean.FALSE);
        }

        public void setBuildRetentionMaxDays(Integer num) {
            setBuildRetentionDays(num);
        }

        public Integer getBuildRetentionDays() {
            return getIntegerValue("buildRetention.daysToKeep");
        }

        public void setBuildRetentionDays(Integer num) {
            setIntegerValue("buildRetention.daysToKeep", num);
        }

        public Integer getBuildRetentionCount() {
            return getIntegerValue("buildRetention.count");
        }

        public void setBuildRetentionCount(Integer num) {
            setIntegerValue("buildRetention.count", num);
        }

        public String getBuildRetentionMinimumDate() {
            return getStringValue("buildRetention.minimumDate");
        }

        public void setBuildRetentionMinimumDate(String str) {
            setStringValue("buildRetention.minimumDate", str);
        }

        public String[] getBuildNumbersNotToDelete() {
            String stringValue = getStringValue("buildRetention.buildNumbersNotToDelete");
            if (StringUtils.isNotBlank(stringValue)) {
                return StringUtils.split(stringValue, ",");
            }
            return new String[0];
        }

        public void setBuildNumbersNotToDelete(String str) {
            setStringValue("buildRetention.buildNumbersNotToDelete", str);
        }

        public String getReleaseComment() {
            return getStringValue("promotion.comment");
        }

        public void setReleaseComment(String str) {
            setStringValue("promotion.comment", str);
        }

        public void setReleaseEnabled(Boolean bool) {
            setBooleanValue("promotion.enabled", bool);
        }

        public Boolean isReleaseEnabled() {
            return getBooleanValue("promotion.enabled", Boolean.FALSE);
        }

        public String getBuildRoot() {
            return getStringValue("build.root");
        }

        public void setBuildRoot(String str) throws UnsupportedEncodingException {
            ArtifactoryClientConfiguration.this.publisher.setBuildRoot(str);
            ArtifactoryClientConfiguration.this.resolver.setBuildRoot(URLEncoder.encode(str, "UTF-8"));
            setStringValue("build.root", str);
        }

        public void setGeneratedBuildInfoFilePath(String str) {
            setStringValue("generated.build.info", str);
        }

        public String getGeneratedBuildInfoFilePath() {
            return getStringValue("generated.build.info");
        }

        public void setDeployableArtifactsFilePath(String str) {
            setStringValue("deployable.artifacts.map", str);
        }

        @Deprecated
        public void setBackwardCompatibleDeployableArtifactsFilePath(String str) {
            setStringValue("deployable.artifacts", str);
        }

        public String getDeployableArtifactsFilePath() {
            String stringValue = getStringValue("deployable.artifacts.map");
            return StringUtils.isNotEmpty(stringValue) ? stringValue : getStringValue("deployable.artifacts");
        }

        public boolean isBackwardCompatibleDeployableArtifacts() {
            return StringUtils.isEmpty(getStringValue("deployable.artifacts.map"));
        }

        public void addBuildVariables(Map<String, String> map, IncludeExcludePatterns includeExcludePatterns) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!PatternMatcher.pathConflicts(key, includeExcludePatterns)) {
                    addEnvironmentProperty(key, entry.getValue());
                }
            }
        }

        public void addEnvironmentProperty(String str, String str2) {
            setStringValue("env." + str, str2);
        }

        public void addRunParameters(String str, String str2) {
            setStringValue("runParameters." + str, str2);
        }

        public Map<String, String> getRunParameters() {
            Map mapFilterMapKeys = CommonUtils.filterMapKeys(this.props, this.buildRunParametersPredicate);
            HashMap map = new HashMap();
            for (Map.Entry entry : mapFilterMapKeys.entrySet()) {
                map.put(((String) entry.getKey()).replace("buildInfo.runParameters.", ""), entry.getValue());
            }
            return map;
        }

        public Boolean isIncremental() {
            return getBooleanValue("incremental", Boolean.FALSE);
        }

        public void setIncremental(Boolean bool) {
            setBooleanValue("incremental", bool);
        }
    }

    public static void addDefaultPublisherAttributes(ArtifactoryClientConfiguration artifactoryClientConfiguration, String str, String str2, String str3) {
        String buildName = artifactoryClientConfiguration.info.getBuildName();
        if (StringUtils.isBlank(buildName)) {
            artifactoryClientConfiguration.info.setBuildName(str);
        } else {
            str = buildName;
        }
        artifactoryClientConfiguration.publisher.setMatrixParam("build.name", str);
        String buildNumber = artifactoryClientConfiguration.info.getBuildNumber();
        if (StringUtils.isBlank(buildNumber)) {
            buildNumber = new Date().getTime() + "";
            artifactoryClientConfiguration.info.setBuildNumber(buildNumber);
        }
        artifactoryClientConfiguration.publisher.setMatrixParam("build.number", buildNumber);
        String buildTimestamp = artifactoryClientConfiguration.info.getBuildTimestamp();
        if (StringUtils.isBlank(buildTimestamp)) {
            String buildStarted = artifactoryClientConfiguration.info.getBuildStarted();
            try {
                buildTimestamp = String.valueOf(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(buildStarted).getTime());
                artifactoryClientConfiguration.info.setBuildTimestamp(buildTimestamp);
            } catch (ParseException e) {
                throw new RuntimeException("Build start date format error: " + buildStarted, e);
            }
        }
        artifactoryClientConfiguration.publisher.setMatrixParam("build.timestamp", buildTimestamp);
        String buildAgentName = artifactoryClientConfiguration.info.getBuildAgentName();
        String buildAgentVersion = artifactoryClientConfiguration.info.getBuildAgentVersion();
        if (StringUtils.isBlank(buildAgentName) && StringUtils.isBlank(buildAgentVersion)) {
            artifactoryClientConfiguration.info.setBuildAgentName(str2);
            artifactoryClientConfiguration.info.setBuildAgentVersion(str3);
        }
    }
}
