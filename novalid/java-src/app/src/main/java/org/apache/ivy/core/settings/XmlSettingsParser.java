package org.apache.ivy.core.settings;

import androidx.constraintlayout.motion.widget.MotionScene;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.lock.LockStrategy;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Configurator;
import org.apache.ivy.util.FileResolver;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.url.CredentialsStore;
import org.apache.ivy.util.url.URLHandlerRegistry;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes5.dex */
public class XmlSettingsParser extends DefaultHandler {
    public Configurator configurator;
    public String currentConfiguratorTag;
    public String defaultCM;
    public String defaultCacheManager;
    public String defaultCircular;
    public String defaultLatest;
    public String defaultLock;
    public String defaultResolver;
    public IvySettings ivy;
    public URL settings;
    public List<String> configuratorTags = Arrays.asList("resolvers", "namespaces", "parsers", "latest-strategies", "conflict-managers", "outputters", "version-matchers", "statuses", "circular-dependency-strategies", "triggers", "lock-strategies", "caches", "signers", "timeout-constraints");
    public boolean deprecatedMessagePrinted = false;

    /* loaded from: classes7.dex */
    public static final class IvyVariableContainerWrapper implements IvyVariableContainer {
        public static final Collection<String> SETTINGS_VARIABLES = Arrays.asList("ivy.settings.dir", "ivy.settings.url", "ivy.settings.file", "ivy.conf.dir", "ivy.conf.url", "ivy.conf.file");
        public Map<String, String> localVariables;
        public final IvyVariableContainer variables;

        public IvyVariableContainerWrapper(IvyVariableContainer ivyVariableContainer) {
            this.localVariables = new HashMap();
            this.variables = ivyVariableContainer;
        }

        @Override // org.apache.ivy.core.settings.IvyVariableContainer
        public void setVariable(String str, String str2, boolean z) {
            if (SETTINGS_VARIABLES.contains(str)) {
                if (!this.localVariables.containsKey(str) || z) {
                    this.localVariables.put(str, str2);
                    return;
                }
                return;
            }
            this.variables.setVariable(str, str2, z);
        }

        @Override // org.apache.ivy.core.settings.IvyVariableContainer
        public void setEnvironmentPrefix(String str) {
            this.variables.setEnvironmentPrefix(str);
        }

        @Override // org.apache.ivy.core.settings.IvyVariableContainer
        public String getVariable(String str) {
            if (this.localVariables.containsKey(str)) {
                return this.localVariables.get(str);
            }
            return this.variables.getVariable(str);
        }

        @Override // org.apache.ivy.core.settings.IvyVariableContainer
        public Object clone() {
            throw new UnsupportedOperationException();
        }
    }

    public XmlSettingsParser(IvySettings ivySettings) {
        this.ivy = ivySettings;
    }

    public void parse(URL url) throws IOException, ParseException {
        Configurator configurator = new Configurator();
        this.configurator = configurator;
        configurator.setFileResolver(new FileResolver() { // from class: org.apache.ivy.core.settings.XmlSettingsParser.1
            @Override // org.apache.ivy.util.FileResolver
            public File resolveFile(String str, String str2) {
                return Checks.checkAbsolute(str, str2);
            }
        });
        for (Map.Entry<String, Class<?>> entry : this.ivy.getTypeDefs().entrySet()) {
            this.configurator.typeDef(entry.getKey(), entry.getValue());
        }
        doParse(url);
    }

    public final void doParse(URL url) throws IOException, ParseException {
        this.settings = url;
        try {
            InputStream inputStreamOpenStream = URLHandlerRegistry.getDefault().openStream(url);
            try {
                new InputSource(inputStreamOpenStream).setSystemId(url.toExternalForm());
                SAXParserFactory.newInstance().newSAXParser().parse(url.toExternalForm(), this);
                this.ivy.validate();
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            ParseException parseException = new ParseException("failed to load settings from " + url + ": " + e2.getMessage(), 0);
            parseException.initCause(e2);
            throw parseException;
        }
    }

    public final void parse(Configurator configurator, URL url) throws IOException, ParseException {
        this.configurator = configurator;
        doParse(url);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws IllegalAccessException, SAXException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        for (int i = 0; i < attributes.getLength(); i++) {
            map.put(attributes.getQName(i), this.ivy.substitute(attributes.getValue(i)));
        }
        try {
            if ("ivyconf".equals(str3)) {
                this.deprecatedMessagePrinted = true;
                Message.deprecated("'ivyconf' element is deprecated, use 'ivysettings' instead (" + this.settings + ")");
            }
            if (this.configurator.getCurrent() != null) {
                inConfiguratorStarted(str3, map);
                return;
            }
            if ("classpath".equals(str3)) {
                classpathStarted(map);
                return;
            }
            if ("typedef".equals(str3)) {
                typedefStarted(map);
                return;
            }
            if ("property".equals(str3)) {
                propertyStarted(map);
                return;
            }
            if ("properties".equals(str3)) {
                propertiesStarted(map);
                return;
            }
            if (MotionScene.INCLUDE_TAG.equals(str3)) {
                includeStarted(map);
                return;
            }
            if (!"settings".equals(str3) && !IvyPatternHelper.CONF_KEY.equals(str3)) {
                if ("caches".equals(str3)) {
                    cachesStarted(str3, map);
                    return;
                }
                if ("version-matchers".equals(str3)) {
                    versionMatchersStarted(str3, map);
                    return;
                }
                if ("statuses".equals(str3)) {
                    statusesStarted(str3, map);
                    return;
                }
                if (this.configuratorTags.contains(str3)) {
                    anyConfiguratorStarted(str3);
                    return;
                }
                if ("macrodef".equals(str3)) {
                    macrodefStarted(str3, map);
                    return;
                } else if ("module".equals(str3)) {
                    moduleStarted(map);
                    return;
                } else {
                    if ("credentials".equals(str3)) {
                        credentialsStarted(map);
                        return;
                    }
                    return;
                }
            }
            settingsStarted(str3, map);
        } catch (IOException e) {
            throw new SAXException("io problem while parsing config file: " + e.getMessage(), e);
        } catch (ParseException e2) {
            throw new SAXException("problem in config file: " + e2.getMessage(), e2);
        }
    }

    public final void credentialsStarted(Map<String, String> map) {
        CredentialsStore.INSTANCE.addCredentials(map.remove(HttpAuthHeader.Parameters.Realm), map.remove("host"), map.remove("username"), map.remove("passwd"));
    }

    public final void moduleStarted(Map<String, String> map) {
        map.put("module", map.remove("name"));
        String strRemove = map.remove("resolver");
        String strRemove2 = map.remove(IvyPatternHelper.BRANCH_KEY);
        String strRemove3 = map.remove("conflict-manager");
        String strRemove4 = map.remove("resolveMode");
        String strRemove5 = map.remove("matcher");
        if (strRemove5 == null) {
            strRemove5 = PatternMatcher.EXACT_OR_REGEXP;
        }
        IvySettings ivySettings = this.ivy;
        ivySettings.addModuleConfiguration(map, ivySettings.getMatcher(strRemove5), strRemove, strRemove2, strRemove3, strRemove4);
    }

    public final void macrodefStarted(String str, Map<String, String> map) {
        this.currentConfiguratorTag = str;
        this.configurator.startMacroDef(map.get("name")).addAttribute("name", null);
    }

    public final void anyConfiguratorStarted(String str) {
        this.currentConfiguratorTag = str;
        this.configurator.setRoot(this.ivy);
    }

    public final void statusesStarted(String str, Map<String, String> map) {
        this.currentConfiguratorTag = str;
        StatusManager statusManager = new StatusManager();
        String str2 = map.get("default");
        if (str2 != null) {
            statusManager.setDefaultStatus(str2);
        }
        this.ivy.setStatusManager(statusManager);
        this.configurator.setRoot(statusManager);
    }

    public final void versionMatchersStarted(String str, Map<String, String> map) {
        anyConfiguratorStarted(str);
        if ("true".equals(map.get("usedefaults"))) {
            this.ivy.configureDefaultVersionMatcher();
        }
    }

    public final void cachesStarted(String str, Map<String, String> map) {
        anyConfiguratorStarted(str);
        this.defaultLock = map.get("lockStrategy");
        this.defaultCacheManager = map.get("default");
        String str2 = map.get("defaultCacheDir");
        if (str2 != null) {
            this.ivy.setDefaultCache(Checks.checkAbsolute(str2, "defaultCacheDir"));
        }
        String str3 = map.get("checkUpToDate");
        if (str3 != null) {
            Message.deprecated("'checkUpToDate' is deprecated, use the 'overwriteMode' on the 'ivy:retrieve' task instead (" + this.settings + ")");
            this.ivy.setCheckUpToDate(Boolean.valueOf(str3).booleanValue());
        }
        String str4 = map.get("resolutionCacheDir");
        if (str4 != null) {
            this.ivy.setDefaultResolutionCacheBasedir(str4);
        }
        String str5 = map.get("useOrigin");
        if (str5 != null) {
            this.ivy.setDefaultUseOrigin(Boolean.valueOf(str5).booleanValue());
        }
        String str6 = map.get("ivyPattern");
        if (str6 != null) {
            this.ivy.setDefaultCacheIvyPattern(str6);
        }
        String str7 = map.get("artifactPattern");
        if (str7 != null) {
            this.ivy.setDefaultCacheArtifactPattern(str7);
        }
        String str8 = map.get("repositoryCacheDir");
        if (str8 != null) {
            this.ivy.setDefaultRepositoryCacheBasedir(str8);
        }
    }

    public final void settingsStarted(String str, Map<String, String> map) {
        if (IvyPatternHelper.CONF_KEY.equals(str) && !this.deprecatedMessagePrinted) {
            Message.deprecated("'conf' is deprecated, use 'settings' instead (" + this.settings + ")");
        }
        String str2 = map.get("defaultCache");
        if (str2 != null) {
            Message.deprecated("'defaultCache' is deprecated, use 'caches[@defaultCacheDir]' instead (" + this.settings + ")");
            this.ivy.setDefaultCache(Checks.checkAbsolute(str2, "defaultCache"));
        }
        String str3 = map.get("defaultBranch");
        if (str3 != null) {
            this.ivy.setDefaultBranch(str3);
        }
        String str4 = map.get("defaultResolveMode");
        if (str4 != null) {
            this.ivy.setDefaultResolveMode(str4);
        }
        String str5 = map.get("validate");
        if (str5 != null) {
            this.ivy.setValidate(Boolean.valueOf(str5).booleanValue());
        }
        String str6 = map.get("checkUpToDate");
        if (str6 != null) {
            Message.deprecated("'checkUpToDate' is deprecated, use the 'overwriteMode' on the 'ivy:retrieve' task instead (" + this.settings + ")");
            this.ivy.setCheckUpToDate(Boolean.valueOf(str6).booleanValue());
        }
        String str7 = map.get("useRemoteConfig");
        if (str7 != null) {
            this.ivy.setUseRemoteConfig(Boolean.valueOf(str7).booleanValue());
        }
        String str8 = map.get("cacheIvyPattern");
        if (str8 != null) {
            Message.deprecated("'cacheIvyPattern' is deprecated, use 'caches[@ivyPattern]' instead (" + this.settings + ")");
            this.ivy.setDefaultCacheIvyPattern(str8);
        }
        String str9 = map.get("cacheArtifactPattern");
        if (str9 != null) {
            Message.deprecated("'cacheArtifactPattern' is deprecated, use 'caches[@artifactPattern]' instead (" + this.settings + ")");
            this.ivy.setDefaultCacheArtifactPattern(str9);
        }
        this.defaultResolver = map.get("defaultResolver");
        this.defaultCM = map.get("defaultConflictManager");
        this.defaultLatest = map.get("defaultLatestStrategy");
        this.defaultCircular = map.get("circularDependencyStrategy");
        String str10 = map.get("httpRequestMethod");
        if ("head".equalsIgnoreCase(str10)) {
            URLHandlerRegistry.getHttp().setRequestMethod(2);
        } else if ("get".equalsIgnoreCase(str10)) {
            URLHandlerRegistry.getHttp().setRequestMethod(1);
        } else if (!StringUtils.isNullOrEmpty(str10)) {
            throw new IllegalArgumentException("Invalid httpRequestMethod specified, must be one of {'HEAD', 'GET'}");
        }
    }

    public final void includeStarted(Map<String, String> map) throws IOException, ParseException {
        URL url;
        IvyVariableContainer variableContainer = this.ivy.getVariableContainer();
        this.ivy.setVariableContainer(new IvyVariableContainerWrapper(variableContainer));
        boolean zEquals = "true".equals(map.get("optional"));
        try {
            String str = map.get(PomReader.PomProfileElement.FILE);
            if (str == null) {
                String str2 = map.get("url");
                if (str2 == null) {
                    throw new IllegalArgumentException("bad include tag: specify file or url to include");
                }
                try {
                    try {
                        url = new URL(str2);
                    } catch (IOException e) {
                        if (!zEquals) {
                            throw e;
                        }
                        Message.verbose("Skipping inclusion of optional URL " + str2 + " due to IOException - " + e.getMessage());
                    }
                } catch (MalformedURLException unused) {
                    url = new URL(this.settings, str2);
                }
                Message.verbose("including url: " + url.toString());
                this.ivy.setSettingsVariables(url);
                try {
                    new XmlSettingsParser(this.ivy).parse(this.configurator, url);
                } catch (IOException e2) {
                    if (!zEquals) {
                        throw e2;
                    }
                    Message.verbose("Skipping inclusion of optional settings URL " + url + " due to IOException - " + e2.getMessage());
                }
            } else {
                try {
                    URL urlUrlFromFileAttribute = urlFromFileAttribute(str);
                    Message.verbose("including file: " + urlUrlFromFileAttribute);
                    if (PomReader.PomProfileElement.FILE.equals(urlUrlFromFileAttribute.getProtocol())) {
                        try {
                            File file = new File(new URI(urlUrlFromFileAttribute.toExternalForm()));
                            if (!zEquals || file.exists()) {
                                this.ivy.setSettingsVariables(Checks.checkAbsolute(file, "settings include path"));
                            }
                        } catch (URISyntaxException unused2) {
                            this.ivy.setSettingsVariables(Checks.checkAbsolute(urlUrlFromFileAttribute.getPath(), "settings include path"));
                        }
                    } else {
                        this.ivy.setSettingsVariables(urlUrlFromFileAttribute);
                    }
                    url = urlUrlFromFileAttribute;
                    new XmlSettingsParser(this.ivy).parse(this.configurator, url);
                } catch (IOException e3) {
                    if (!zEquals) {
                        throw e3;
                    }
                    Message.verbose("Skipping inclusion of optional file " + str + " due to IOException - " + e3.getMessage());
                }
            }
        } finally {
            this.ivy.setVariableContainer(variableContainer);
        }
    }

    public final URL urlFromFileAttribute(String str) throws IOException {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            File file = new File(str);
            if (file.isAbsolute()) {
                if (!file.exists()) {
                    throw new FileNotFoundException(file.getAbsolutePath());
                }
                return file.toURI().toURL();
            }
            if (PomReader.PomProfileElement.FILE.equals(this.settings.getProtocol())) {
                try {
                    File file2 = new File(new URI(this.settings.toExternalForm()));
                    if (!file2.exists()) {
                        throw new FileNotFoundException(file2.getAbsolutePath());
                    }
                    return new File(file2.getParentFile(), str).toURI().toURL();
                } catch (URISyntaxException unused2) {
                    return new URL(this.settings, str);
                }
            }
            return new URL(this.settings, str);
        }
    }

    public final void propertiesStarted(Map<String, String> map) throws IOException {
        String str = map.get(PomReader.PomProfileElement.FILE);
        String str2 = map.get("environment");
        if (str == null) {
            if (str2 != null) {
                this.ivy.getVariableContainer().setEnvironmentPrefix(str2);
                return;
            }
            throw new IllegalArgumentException("Didn't find a 'file' or 'environment' attribute on the 'properties' element");
        }
        String str3 = map.get("override");
        boolean z = str3 == null || Boolean.valueOf(str3).booleanValue();
        Message.verbose("loading properties: " + str);
        try {
            this.ivy.loadProperties(urlFromFileAttribute(str), z);
        } catch (FileNotFoundException unused) {
            Message.verbose("Unable to find property file: " + str);
        }
    }

    public final void propertyStarted(Map<String, String> map) {
        String str = map.get("name");
        String str2 = map.get("value");
        String str3 = map.get("override");
        String str4 = map.get("ifset");
        String str5 = map.get("unlessset");
        if (str == null) {
            throw new IllegalArgumentException("missing attribute name on property tag");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("missing attribute value on property tag");
        }
        this.ivy.setVariable(str, str2, str3 == null || Boolean.valueOf(str3).booleanValue(), str4, str5);
    }

    public final void typedefStarted(Map<String, String> map) {
        String str = map.get("name");
        this.configurator.typeDef(str, this.ivy.typeDef(str, map.get("classname")));
    }

    public final void classpathStarted(Map<String, String> map) throws IOException {
        URL url;
        String str = map.get("url");
        if (str == null) {
            String str2 = map.get(PomReader.PomProfileElement.FILE);
            if (str2 == null) {
                throw new IllegalArgumentException("either url or file should be given for classpath element");
            }
            url = urlFromFileAttribute(str2);
        } else {
            url = new URL(str);
        }
        this.ivy.addClasspathURL(url);
    }

    public final void inConfiguratorStarted(String str, Map<String, String> map) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object resolver;
        if ("macrodef".equals(this.currentConfiguratorTag) && this.configurator.getTypeDef(str) != null) {
            String str2 = map.get("name");
            if (str2 == null) {
                map.put("name", "@{name}");
            } else if (!str2.contains("@{name}")) {
                map.put("name", "@{name}-" + str2);
            } else {
                map.put("name", str2);
            }
        }
        if (map.get("ref") != null) {
            if (map.size() != 1) {
                throw new IllegalArgumentException("ref attribute should be the only one ! found " + map.size() + " in " + str);
            }
            String str3 = map.get("ref");
            if ("resolvers".equals(this.currentConfiguratorTag) || "resolver".equals(str)) {
                resolver = this.ivy.getResolver(str3);
                if (resolver == null) {
                    throw new IllegalArgumentException("unknown resolver " + str3 + ": resolver should be defined before being referenced");
                }
            } else if ("latest-strategies".equals(this.currentConfiguratorTag)) {
                resolver = this.ivy.getLatestStrategy(str3);
                if (resolver == null) {
                    throw new IllegalArgumentException("unknown latest strategy " + str3 + ": latest strategy should be defined before being referenced");
                }
            } else if ("conflict-managers".equals(this.currentConfiguratorTag)) {
                resolver = this.ivy.getConflictManager(str3);
                if (resolver == null) {
                    throw new IllegalArgumentException("unknown conflict manager " + str3 + ": conflict manager should be defined before being referenced");
                }
            } else {
                resolver = null;
            }
            if (resolver == null) {
                throw new IllegalArgumentException("bad reference " + str3);
            }
            this.configurator.addChild(str, resolver);
            return;
        }
        this.configurator.startCreateChild(str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.configurator.setAttribute(entry.getKey(), entry.getValue());
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws IllegalAccessException, SAXException, IllegalArgumentException, InvocationTargetException {
        if (this.configurator.getCurrent() != null) {
            if (this.configuratorTags.contains(str3) && this.configurator.getDepth() == 1) {
                this.configurator.clear();
                this.currentConfiguratorTag = null;
            } else if ("macrodef".equals(str3) && this.configurator.getDepth() == 1) {
                this.configurator.endMacroDef();
                this.currentConfiguratorTag = null;
            } else {
                this.configurator.endCreateChild();
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        String str = this.defaultResolver;
        if (str != null) {
            IvySettings ivySettings = this.ivy;
            ivySettings.setDefaultResolver(ivySettings.substitute(str));
        }
        String str2 = this.defaultCM;
        if (str2 != null) {
            IvySettings ivySettings2 = this.ivy;
            ConflictManager conflictManager = ivySettings2.getConflictManager(ivySettings2.substitute(str2));
            if (conflictManager == null) {
                throw new IllegalArgumentException("unknown conflict manager " + this.ivy.substitute(this.defaultCM));
            }
            this.ivy.setDefaultConflictManager(conflictManager);
        }
        String str3 = this.defaultLatest;
        if (str3 != null) {
            IvySettings ivySettings3 = this.ivy;
            LatestStrategy latestStrategy = ivySettings3.getLatestStrategy(ivySettings3.substitute(str3));
            if (latestStrategy == null) {
                throw new IllegalArgumentException("unknown latest strategy " + this.ivy.substitute(this.defaultLatest));
            }
            this.ivy.setDefaultLatestStrategy(latestStrategy);
        }
        String str4 = this.defaultCacheManager;
        if (str4 != null) {
            IvySettings ivySettings4 = this.ivy;
            RepositoryCacheManager repositoryCacheManager = ivySettings4.getRepositoryCacheManager(ivySettings4.substitute(str4));
            if (repositoryCacheManager == null) {
                throw new IllegalArgumentException("unknown cache manager " + this.ivy.substitute(this.defaultCacheManager));
            }
            this.ivy.setDefaultRepositoryCacheManager(repositoryCacheManager);
        }
        String str5 = this.defaultCircular;
        if (str5 != null) {
            IvySettings ivySettings5 = this.ivy;
            CircularDependencyStrategy circularDependencyStrategy = ivySettings5.getCircularDependencyStrategy(ivySettings5.substitute(str5));
            if (circularDependencyStrategy == null) {
                throw new IllegalArgumentException("unknown circular dependency strategy " + this.ivy.substitute(this.defaultCircular));
            }
            this.ivy.setCircularDependencyStrategy(circularDependencyStrategy);
        }
        String str6 = this.defaultLock;
        if (str6 != null) {
            IvySettings ivySettings6 = this.ivy;
            LockStrategy lockStrategy = ivySettings6.getLockStrategy(ivySettings6.substitute(str6));
            if (lockStrategy == null) {
                throw new IllegalArgumentException("unknown lock strategy " + this.ivy.substitute(this.defaultLock));
            }
            this.ivy.setDefaultLockStrategy(lockStrategy);
        }
    }
}
