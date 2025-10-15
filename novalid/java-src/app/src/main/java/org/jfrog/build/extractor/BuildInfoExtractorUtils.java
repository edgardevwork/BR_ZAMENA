package org.jfrog.build.extractor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.jfrog.build.extractor.clientConfiguration.ClientProperties;
import org.jfrog.build.extractor.clientConfiguration.IncludeExcludePatterns;
import org.jfrog.build.extractor.clientConfiguration.PatternMatcher;
import org.jfrog.build.extractor.p065ci.BuildInfo;

/* loaded from: classes8.dex */
public abstract class BuildInfoExtractorUtils {
    public static final int ARTIFACT_TYPE_LENGTH_LIMIT = 64;
    public static final String BUILD_BROWSE_PLATFORM_URL = "/ui/builds";
    public static final String BUILD_BROWSE_URL = "/webapp/builds";
    public static final String BUILD_REPO_PARAM_PATTERN = "?buildRepo=%s-build-info&projectKey=%s";
    public static final Predicate<Object> BUILD_INFO_PREDICATE = new PrefixPredicate("buildInfo.");
    public static final Predicate<Object> BUILD_INFO_PROP_PREDICATE = new PrefixPredicate("buildInfo.property.");
    public static final Predicate<Object> ENV_PREDICATE = new PrefixPredicate("buildInfo.env.");
    public static final Predicate<Object> CLIENT_PREDICATE = new PrefixPredicate(ClientProperties.ARTIFACTORY_PREFIX);
    public static final Predicate<Object> MATRIX_PARAM_PREDICATE = new PrefixPredicate(ClientProperties.PROP_DEPLOY_PARAM_PROP_PREFIX);

    public static Properties mergePropertiesWithSystemAndPropertyFile(Properties properties) {
        return mergePropertiesWithSystemAndPropertyFile(properties, null);
    }

    public static Properties mergePropertiesWithSystemAndPropertyFile(Properties properties, Log log) throws IOException {
        Properties properties2 = new Properties();
        addPropsFromCommandSystemProp(properties, log);
        String additionalPropertiesFile = getAdditionalPropertiesFile(properties, log);
        if (StringUtils.isNotBlank(additionalPropertiesFile)) {
            File file = new File(additionalPropertiesFile);
            InputStream inputStreamNewInputStream = null;
            try {
                try {
                    if (file.exists()) {
                        inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
                        properties2.load(inputStreamNewInputStream);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Unable to load build info properties from file: " + file.getAbsolutePath(), e);
                }
            } finally {
                IOUtils.closeQuietly(inputStreamNewInputStream);
            }
        }
        properties2.putAll(properties);
        properties2.putAll(System.getProperties());
        return properties2;
    }

    public static Map<String, ?> filterStringEntries(Map<String, ?> map) {
        return CommonUtils.filterMapValues(map, new Predicate() { // from class: org.jfrog.build.extractor.BuildInfoExtractorUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BuildInfoExtractorUtils.lambda$filterStringEntries$0(obj);
            }
        });
    }

    public static /* synthetic */ boolean lambda$filterStringEntries$0(Object obj) {
        return obj instanceof String;
    }

    public static Properties filterDynamicProperties(Properties properties, Predicate<Object> predicate) {
        Properties properties2 = new Properties();
        if (properties != null) {
            properties2.putAll(CommonUtils.filterMapKeys(properties, predicate));
        }
        return properties2;
    }

    public static Properties stripPrefixFromProperties(Properties properties, String str) {
        Properties properties2 = new Properties();
        for (Map.Entry entry : properties.entrySet()) {
            properties2.put(StringUtils.removeStart(entry.getKey().toString(), str), entry.getValue());
        }
        return properties2;
    }

    public static Properties getEnvProperties(Properties properties, Log log) throws IOException {
        IncludeExcludePatterns includeExcludePatterns = new IncludeExcludePatterns(properties.getProperty("buildInfoConfig.envVarsIncludePatterns"), properties.getProperty("buildInfoConfig.envVarsExcludePatterns"));
        Properties properties2 = new Properties();
        for (Map.Entry entry : properties.entrySet()) {
            if (isBuildInfoProperty((String) entry.getKey())) {
                properties2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : System.getenv().entrySet()) {
            String key = entry2.getKey();
            if (!PatternMatcher.pathConflicts(key, includeExcludePatterns)) {
                properties2.put("buildInfo.env." + key, entry2.getValue());
            }
        }
        for (Map.Entry entry3 : CommonUtils.entriesOnlyOnLeftMap(new HashMap(System.getProperties()), System.getenv()).entrySet()) {
            String str = (String) entry3.getKey();
            if (!PatternMatcher.pathConflicts(str, includeExcludePatterns)) {
                properties2.put(str, entry3.getValue());
            }
        }
        String additionalPropertiesFile = getAdditionalPropertiesFile(properties, log);
        if (StringUtils.isNotBlank(additionalPropertiesFile)) {
            File file = new File(additionalPropertiesFile);
            InputStream inputStreamNewInputStream = null;
            try {
                try {
                    inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
                    Properties properties3 = new Properties();
                    properties3.load(inputStreamNewInputStream);
                    properties2.putAll(filterDynamicProperties(properties3, ENV_PREDICATE));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to load build info properties from file: " + file.getAbsolutePath(), e);
                }
            } finally {
                IOUtils.closeQuietly(inputStreamNewInputStream);
            }
        }
        return properties2;
    }

    public static boolean isBuildInfoProperty(String str) {
        return StringUtils.startsWithAny(str, "buildInfoConfig.envVarsExcludePatterns", "buildInfo.env.", "buildInfoConfig.envVarsIncludePatterns");
    }

    public static JsonFactory createJsonFactory() {
        JsonFactory jsonFactory = new JsonFactory();
        ObjectMapper objectMapper = new ObjectMapper(jsonFactory);
        objectMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        jsonFactory.setCodec(objectMapper);
        return jsonFactory;
    }

    public static String buildInfoToJsonString(BuildInfo buildInfo) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = jsonFactoryCreateJsonFactory.createGenerator(stringWriter);
            try {
                jsonGeneratorCreateGenerator.useDefaultPrettyPrinter();
                jsonGeneratorCreateGenerator.writeObject(buildInfo);
                String string = stringWriter.getBuffer().toString();
                jsonGeneratorCreateGenerator.close();
                stringWriter.close();
                return string;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static BuildInfo jsonStringToBuildInfo(String str) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        JsonParser jsonParserCreateParser = jsonFactoryCreateJsonFactory.createParser(new StringReader(str));
        try {
            BuildInfo buildInfo = (BuildInfo) jsonFactoryCreateJsonFactory.getCodec().readValue(jsonParserCreateParser, BuildInfo.class);
            if (jsonParserCreateParser != null) {
                jsonParserCreateParser.close();
            }
            return buildInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParserCreateParser != null) {
                    try {
                        jsonParserCreateParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static <T extends Serializable> String buildInfoToJsonString(T t) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = jsonFactoryCreateJsonFactory.createGenerator(stringWriter);
            try {
                jsonGeneratorCreateGenerator.useDefaultPrettyPrinter();
                jsonGeneratorCreateGenerator.writeObject(t);
                String string = stringWriter.getBuffer().toString();
                jsonGeneratorCreateGenerator.close();
                stringWriter.close();
                return string;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static <T extends Serializable> T jsonStringToGeneric(String str, Class<T> cls) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        JsonParser jsonParserCreateParser = jsonFactoryCreateJsonFactory.createParser(new StringReader(str));
        try {
            T t = (T) jsonFactoryCreateJsonFactory.getCodec().readValue(jsonParserCreateParser, cls);
            if (jsonParserCreateParser != null) {
                jsonParserCreateParser.close();
            }
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParserCreateParser != null) {
                    try {
                        jsonParserCreateParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void saveBuildInfoToFile(BuildInfo buildInfo, File file) throws IOException, RuntimeException {
        String strBuildInfoToJsonString = buildInfoToJsonString(buildInfo);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        CommonUtils.writeByCharset(strBuildInfoToJsonString, file, StandardCharsets.UTF_8);
    }

    public static String getAdditionalPropertiesFile(Properties properties, Log log) {
        String property = System.getProperty("buildInfoConfig.propertiesFile");
        String str = "System.getProperty(buildInfoConfig.propertiesFile)";
        if (StringUtils.isBlank(property) && properties != null) {
            property = properties.getProperty("buildInfoConfig.propertiesFile");
            str = "additionalProps.getProperty(buildInfoConfig.propertiesFile)";
        }
        if (StringUtils.isBlank(property)) {
            property = properties.getProperty("env.buildInfoConfig.propertiesFile");
            if (StringUtils.isBlank(property)) {
                property = System.getenv("buildInfoConfig.propertiesFile");
                str = "System.getenv(buildInfoConfig.propertiesFile)";
            } else {
                str = "additionalProps.getProperty(env.buildInfoConfig.propertiesFile)";
            }
        }
        if (StringUtils.isBlank(property)) {
            String property2 = properties.getProperty("env.BUILDINFO_PROPFILE");
            if (StringUtils.isBlank(property2)) {
                property2 = System.getenv("BUILDINFO_PROPFILE");
                str = "System.getenv(BUILDINFO_PROPFILE)";
            } else {
                str = "additionalProps.getProperty(env.BUILDINFO_PROPFILE)";
            }
            property = property2;
        }
        if (log != null) {
            if (StringUtils.isBlank(property)) {
                log.debug("[buildinfo] Not using buildInfo properties file for this build.");
            } else {
                log.debug("[buildinfo] Properties file '" + property + "' retrieved from '" + str + "'");
            }
        }
        return property;
    }

    public static String getArtifactId(String str, String str2) {
        return str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
    }

    public static String getTypeString(String str, String str2, String str3) {
        if (!"jar".equals(str) || !StringUtils.isNotBlank(str2)) {
            str2 = str;
        }
        if (!"jar".equals(str2) && !"pom".equals(str) && !ClientConfigurationFields.IVY.equals(str) && StringUtils.isNotBlank(str3) && !str2.endsWith(str3)) {
            str2 = str2 + "-" + str3;
        }
        return str2.length() > 64 ? str : str2;
    }

    public static String getModuleIdString(String str, String str2, String str3) {
        return str + ':' + str2 + ':' + str3;
    }

    public static ObjectMapper createMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    public static class PrefixPredicate implements Predicate<Object> {
        public String prefix;

        public PrefixPredicate(String str) {
            this.prefix = str;
        }

        @Override // java.util.function.Predicate
        public boolean test(Object obj) {
            return obj != null && ((String) obj).startsWith(this.prefix);
        }
    }

    public static void addPropsFromCommandSystemProp(Properties properties, Log log) {
        String[] strArr = {"buildInfoConfig.propertiesFile", "artifactory.publish.password"};
        String property = System.getProperty("sun.java.command");
        if (StringUtils.isNotBlank(property)) {
            for (String str : StringUtils.split(property, " ")) {
                for (int i = 0; i < 2; i++) {
                    String str2 = strArr[i];
                    if (str.startsWith("-D" + str2)) {
                        properties.put(str2, StringUtils.split(str, URLEncodedUtils.NAME_VALUE_SEPARATOR)[1].trim());
                        log.debug(String.format("Adding property %s from the command property: %s", str2, "sun.java.command"));
                    }
                }
            }
        }
    }

    public static String createBuildInfoUrl(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        if (z2) {
            return createBuildInfoUrl(str, str2, str3, str4, str5, z);
        }
        if (StringUtils.isNotBlank(str5)) {
            if (StringUtils.endsWith(str, "/artifactory")) {
                return createBuildInfoUrl(StringUtils.removeEnd(str, "/artifactory"), str2, str3, str4, str5, z);
            }
            return "";
        }
        return createBuildInfoUrl(str, str2, str3, z);
    }

    public static String createBuildInfoUrl(String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        if (z) {
            str2 = UrlUtils.encodeUrlPathPart(str2);
            str3 = UrlUtils.encodeUrlPathPart(str3);
        }
        if (StringUtils.isBlank(str4)) {
            str6 = "";
        } else {
            str6 = "/" + str4;
        }
        return String.format("%s/%s/%s%s/%s", str + BUILD_BROWSE_PLATFORM_URL, str2, str3, str6, "published" + getBuildRepoQueryParam(str5));
    }

    public static String getBuildRepoQueryParam(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String strEncodeUrl = UrlUtils.encodeUrl(str);
        return String.format(BUILD_REPO_PARAM_PATTERN, strEncodeUrl, strEncodeUrl);
    }

    public static String createBuildInfoUrl(String str, String str2, String str3, boolean z) {
        if (z) {
            str2 = UrlUtils.encodeUrlPathPart(str2);
            str3 = UrlUtils.encodeUrlPathPart(str3);
        }
        return String.format("%s/%s/%s", str + BUILD_BROWSE_URL, str2, str3);
    }
}
