package org.apache.ivy.core.settings;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessControlException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.SystemUtils;
import org.apache.ivy.Ivy;
import org.apache.ivy.ant.IvyBuildList;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.NormalRelativeUrlResolver;
import org.apache.ivy.core.RelativeUrlResolver;
import org.apache.ivy.core.cache.CacheUtil;
import org.apache.ivy.core.cache.DefaultRepositoryCacheManager;
import org.apache.ivy.core.cache.DefaultResolutionCacheManager;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.check.CheckEngineSettings;
import org.apache.ivy.core.deliver.DeliverEngineSettings;
import org.apache.ivy.core.install.InstallEngineSettings;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRules;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.pack.ArchivePacking;
import org.apache.ivy.core.pack.PackingRegistry;
import org.apache.ivy.core.publish.PublishEngineSettings;
import org.apache.ivy.core.repository.RepositoryManagementEngineSettings;
import org.apache.ivy.core.resolve.ResolveEngineSettings;
import org.apache.ivy.core.retrieve.RetrieveEngineSettings;
import org.apache.ivy.core.sort.SortEngineSettings;
import org.apache.ivy.osgi.core.OsgiLatestStrategy;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.circular.ErrorCircularDependencyStrategy;
import org.apache.ivy.plugins.circular.IgnoreCircularDependencyStrategy;
import org.apache.ivy.plugins.circular.WarnCircularDependencyStrategy;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.conflict.LatestCompatibleConflictManager;
import org.apache.ivy.plugins.conflict.LatestConflictManager;
import org.apache.ivy.plugins.conflict.NoConflictManager;
import org.apache.ivy.plugins.conflict.StrictConflictManager;
import org.apache.ivy.plugins.latest.LatestLexicographicStrategy;
import org.apache.ivy.plugins.latest.LatestRevisionStrategy;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.latest.LatestTimeStrategy;
import org.apache.ivy.plugins.latest.WorkspaceLatestStrategy;
import org.apache.ivy.plugins.lock.CreateFileLockStrategy;
import org.apache.ivy.plugins.lock.LockStrategy;
import org.apache.ivy.plugins.lock.NIOFileLockStrategy;
import org.apache.ivy.plugins.lock.NoLockStrategy;
import org.apache.ivy.plugins.matcher.ExactOrRegexpPatternMatcher;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.matcher.RegexpPatternMatcher;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.report.LogReportOutputter;
import org.apache.ivy.plugins.report.ReportOutputter;
import org.apache.ivy.plugins.report.XmlReportOutputter;
import org.apache.ivy.plugins.resolver.AbstractWorkspaceResolver;
import org.apache.ivy.plugins.resolver.ChainResolver;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.resolver.DualResolver;
import org.apache.ivy.plugins.resolver.ResolverSettings;
import org.apache.ivy.plugins.resolver.WorkspaceChainResolver;
import org.apache.ivy.plugins.signer.SignatureGenerator;
import org.apache.ivy.plugins.trigger.Trigger;
import org.apache.ivy.plugins.version.ChainVersionMatcher;
import org.apache.ivy.plugins.version.ExactVersionMatcher;
import org.apache.ivy.plugins.version.LatestVersionMatcher;
import org.apache.ivy.plugins.version.SubVersionMatcher;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.plugins.version.VersionRangeMatcher;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.url.URLHandlerRegistry;

/* loaded from: classes5.dex */
public class IvySettings implements SortEngineSettings, PublishEngineSettings, ParserSettings, DeliverEngineSettings, CheckEngineSettings, InstallEngineSettings, ResolverSettings, ResolveEngineSettings, RetrieveEngineSettings, RepositoryManagementEngineSettings {
    public static final long INTERRUPT_TIMEOUT = 2000;
    public File baseDir;
    public boolean checkUpToDate;
    public Map<String, CircularDependencyStrategy> circularDependencyStrategies;
    public CircularDependencyStrategy circularDependencyStrategy;
    public ClassLoader classloader;
    public List<URL> classpathURLs;
    public Map<String, ConflictManager> conflictsManager;
    public Boolean debugConflictResolution;
    public Boolean debugLocking;
    public String defaultBranch;
    public File defaultCache;
    public String defaultCacheArtifactPattern;
    public String defaultCacheIvyPattern;
    public ConflictManager defaultConflictManager;
    public LatestStrategy defaultLatestStrategy;
    public LockStrategy defaultLockStrategy;
    public RepositoryCacheManager defaultRepositoryCacheManager;
    public String defaultResolveMode;
    public DependencyResolver defaultResolver;
    public String defaultResolverName;
    public boolean defaultUseOrigin;
    public File defaultUserDir;
    public DependencyResolver dictatorResolver;
    public Boolean dumpMemoryUsage;
    public Map<String, LatestStrategy> latestStrategies;
    public List<String> listingIgnore;
    public Map<String, LockStrategy> lockStrategies;
    public boolean logNotConvertedExclusionRule;
    public Map<String, PatternMatcher> matchers;
    public ModuleRules<ModuleSettings> moduleSettings;
    public Map<String, Namespace> namespaces;
    public PackingRegistry packingRegistry;
    public Map<String, ReportOutputter> reportOutputters;
    public boolean repositoriesConfigured;
    public Map<String, RepositoryCacheManager> repositoryCacheManagers;
    public ResolutionCacheManager resolutionCacheManager;
    public Map<String, DependencyResolver> resolversMap;
    public Map<String, SignatureGenerator> signatureGenerators;
    public StatusManager statusManager;
    public final Map<String, TimeoutConstraint> timeoutConstraints;
    public List<Trigger> triggers;
    public Map<String, Class<?>> typeDefs;
    public boolean useRemoteConfig;
    public boolean validate;
    public IvyVariableContainer variableContainer;
    public VersionMatcher versionMatcher;
    public Map<String, VersionMatcher> versionMatchers;
    public AbstractWorkspaceResolver workspaceResolver;

    public final long getInterruptTimeout() {
        return 2000L;
    }

    public IvySettings() {
        this(new IvyVariableContainerImpl());
    }

    public IvySettings(IvyVariableContainer ivyVariableContainer) {
        this.typeDefs = new HashMap();
        this.resolversMap = new HashMap();
        this.dictatorResolver = null;
        this.defaultBranch = null;
        this.checkUpToDate = true;
        this.moduleSettings = new ModuleRules<>();
        this.conflictsManager = new HashMap();
        this.latestStrategies = new HashMap();
        this.lockStrategies = new HashMap();
        this.namespaces = new HashMap();
        this.matchers = new HashMap();
        this.reportOutputters = new HashMap();
        this.versionMatchers = new HashMap();
        this.circularDependencyStrategies = new HashMap();
        this.repositoryCacheManagers = new HashMap();
        this.signatureGenerators = new HashMap();
        this.triggers = new ArrayList();
        this.variableContainer = new IvyVariableContainerImpl();
        this.validate = true;
        this.defaultLatestStrategy = null;
        this.defaultLockStrategy = null;
        this.defaultConflictManager = null;
        this.circularDependencyStrategy = null;
        this.defaultRepositoryCacheManager = null;
        this.resolutionCacheManager = null;
        this.listingIgnore = new ArrayList();
        this.useRemoteConfig = false;
        this.baseDir = new File(".").getAbsoluteFile();
        this.classpathURLs = new ArrayList();
        this.defaultResolveMode = "default";
        this.packingRegistry = new PackingRegistry();
        this.timeoutConstraints = new HashMap();
        setVariableContainer(ivyVariableContainer);
        setVariable("ivy.default.settings.dir", getDefaultSettingsDir(), true);
        setVariable("ivy.basedir", getBaseDir().getAbsolutePath());
        setDeprecatedVariable("ivy.default.conf.dir", "ivy.default.settings.dir");
        String property = System.getProperty("ivy.typedef.files");
        if (property != null) {
            for (String str : StringUtils.splitToArray(property)) {
                try {
                    typeDefs((InputStream) new FileInputStream(Checks.checkAbsolute(str, "ivy.typedef.files")), true);
                } catch (FileNotFoundException unused) {
                    Message.warn("typedefs file not found: " + str);
                } catch (IOException e) {
                    Message.warn("problem with typedef file: " + str, e);
                }
            }
        } else {
            try {
                typeDefs(FirebasePerfUrlConnection.openStream(getSettingsURL("typedef.properties")), true);
            } catch (IOException e2) {
                Message.warn("impossible to load default type defs", e2);
            }
        }
        LatestLexicographicStrategy latestLexicographicStrategy = new LatestLexicographicStrategy();
        LatestRevisionStrategy latestRevisionStrategy = new LatestRevisionStrategy();
        LatestTimeStrategy latestTimeStrategy = new LatestTimeStrategy();
        OsgiLatestStrategy osgiLatestStrategy = new OsgiLatestStrategy();
        addLatestStrategy("latest-revision", latestRevisionStrategy);
        addLatestStrategy("latest-lexico", latestLexicographicStrategy);
        addLatestStrategy("latest-time", latestTimeStrategy);
        addLatestStrategy("latest-osgi", osgiLatestStrategy);
        addLockStrategy("no-lock", new NoLockStrategy());
        addLockStrategy("artifact-lock", new CreateFileLockStrategy(debugLocking()));
        addLockStrategy("artifact-lock-nio", new NIOFileLockStrategy(debugLocking()));
        addConflictManager("latest-revision", new LatestConflictManager("latest-revision", latestRevisionStrategy));
        addConflictManager("latest-compatible", new LatestCompatibleConflictManager("latest-compatible", latestRevisionStrategy));
        addConflictManager("latest-time", new LatestConflictManager("latest-time", latestTimeStrategy));
        addConflictManager("all", new NoConflictManager());
        addConflictManager("strict", new StrictConflictManager());
        addMatcher(ExactPatternMatcher.INSTANCE);
        addMatcher(RegexpPatternMatcher.INSTANCE);
        addMatcher(ExactOrRegexpPatternMatcher.INSTANCE);
        try {
            addMatcher((PatternMatcher) IvySettings.class.getClassLoader().loadClass("org.apache.ivy.plugins.matcher.GlobPatternMatcher").getField("INSTANCE").get(null));
        } catch (Exception e3) {
            Message.info("impossible to define glob matcher: org.apache.ivy.plugins.matcher.GlobPatternMatcher was not found", e3);
        }
        addReportOutputter(new LogReportOutputter());
        addReportOutputter(new XmlReportOutputter());
        configureDefaultCircularDependencyStrategies();
        this.listingIgnore.add(".cvsignore");
        this.listingIgnore.add("CVS");
        this.listingIgnore.add(".svn");
        this.listingIgnore.add("maven-metadata.xml");
        this.listingIgnore.add("maven-metadata.xml.md5");
        this.listingIgnore.add("maven-metadata.xml.sha1");
        addSystemProperties();
    }

    public final synchronized void addSystemProperties() {
        try {
            addAllVariables((Map) System.getProperties().clone());
        } catch (AccessControlException e) {
            Message.verbose("access denied to getting all system properties: they won't be available as Ivy variables.\nset " + e.getPermission() + " permission if you want to access them");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void configureRepositories(boolean z) {
        boolean z2;
        if (!this.repositoriesConfigured) {
            Properties properties = new Properties();
            if (this.useRemoteConfig && z) {
                try {
                    URL url = new URL("https://ant.apache.org/ivy/repository.properties");
                    Message.verbose("configuring repositories with " + url);
                    properties.load(URLHandlerRegistry.getDefault().openStream(url));
                    z2 = true;
                } catch (Exception e) {
                    Message.verbose("unable to use remote repository configuration", e);
                    properties = new Properties();
                }
                if (!z2) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        inputStreamOpenStream = FirebasePerfUrlConnection.openStream(getSettingsURL("repository.properties"));
                        properties.load(inputStreamOpenStream);
                    } catch (IOException e2) {
                        Message.error("unable to use internal repository configuration", e2);
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                addAllVariables(properties, false);
                this.repositoriesConfigured = true;
            }
            z2 = false;
            if (!z2) {
            }
            addAllVariables(properties, false);
            this.repositoriesConfigured = true;
        }
    }

    public synchronized void typeDefs(InputStream inputStream) throws IOException {
        typeDefs(inputStream, false);
    }

    public synchronized void typeDefs(InputStream inputStream, boolean z) throws IOException {
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            typeDefs(properties, z);
        } finally {
            inputStream.close();
        }
    }

    public synchronized void typeDefs(Properties properties) {
        typeDefs(properties, false);
    }

    public synchronized void typeDefs(Properties properties, boolean z) {
        for (Map.Entry entry : properties.entrySet()) {
            typeDef(entry.getKey().toString(), entry.getValue().toString(), z);
        }
    }

    public synchronized void load(File file) throws IOException, ParseException {
        try {
            Message.info(":: loading settings :: file = " + file);
            long jCurrentTimeMillis = System.currentTimeMillis();
            setSettingsVariables(file);
            if (getVariable("ivy.default.ivy.user.dir") != null) {
                setDefaultIvyUserDir(Checks.checkAbsolute(getVariable("ivy.default.ivy.user.dir"), "ivy.default.ivy.user.dir"));
            } else {
                getDefaultIvyUserDir();
            }
            loadDefaultProperties();
            try {
                new XmlSettingsParser(this).parse(file.toURI().toURL());
                setVariable("ivy.default.ivy.user.dir", getDefaultIvyUserDir().getAbsolutePath(), false);
                Message.verbose("settings loaded (" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms)");
                dumpSettings();
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException("given file cannot be transformed to url: " + file, e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void load(URL url) throws IOException, ParseException {
        try {
            Message.info(":: loading settings :: url = " + url);
            long jCurrentTimeMillis = System.currentTimeMillis();
            setSettingsVariables(url);
            if (getVariable("ivy.default.ivy.user.dir") != null) {
                setDefaultIvyUserDir(Checks.checkAbsolute(getVariable("ivy.default.ivy.user.dir"), "ivy.default.ivy.user.dir"));
            } else {
                getDefaultIvyUserDir();
            }
            loadDefaultProperties();
            new XmlSettingsParser(this).parse(url);
            setVariable("ivy.default.ivy.user.dir", getDefaultIvyUserDir().getAbsolutePath(), false);
            Message.verbose("settings loaded (" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms)");
            dumpSettings();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void defaultInit() throws IOException {
        try {
            if (getVariable("ivy.default.ivy.user.dir") != null) {
                setDefaultIvyUserDir(Checks.checkAbsolute(getVariable("ivy.default.ivy.user.dir"), "ivy.default.ivy.user.dir"));
            } else {
                getDefaultIvyUserDir();
            }
            getDefaultCache();
            loadDefaultProperties();
            setVariable("ivy.default.ivy.user.dir", getDefaultIvyUserDir().getAbsolutePath(), false);
            dumpSettings();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void loadDefault() throws IOException, ParseException {
        load(getDefaultSettingsURL());
    }

    public synchronized void loadDefault14() throws IOException, ParseException {
        load(getDefault14SettingsURL());
    }

    public final void loadDefaultProperties() throws IOException {
        loadProperties(getDefaultPropertiesURL(), false);
    }

    public static URL getDefaultPropertiesURL() {
        return getSettingsURL("ivy.properties");
    }

    public static URL getDefaultSettingsURL() {
        return getSettingsURL("ivysettings.xml");
    }

    public static URL getDefault14SettingsURL() {
        return getSettingsURL("ivysettings-1.4.xml");
    }

    public final String getDefaultSettingsDir() {
        return getDefaultSettingsURL().toExternalForm().substring(0, r0.length() - 16);
    }

    public static URL getSettingsURL(String str) {
        return XmlSettingsParser.class.getResource(str);
    }

    public synchronized void setSettingsVariables(File file) {
        try {
            setVariable("ivy.settings.dir", new File(file.getAbsolutePath()).getParent());
            setDeprecatedVariable("ivy.conf.dir", "ivy.settings.dir");
            setVariable("ivy.settings.file", file.getAbsolutePath());
            setDeprecatedVariable("ivy.conf.file", "ivy.settings.file");
            setVariable("ivy.settings.url", file.toURI().toURL().toExternalForm());
            setDeprecatedVariable("ivy.conf.url", "ivy.settings.url");
            setVariable("ivy.settings.dir.url", new File(file.getAbsolutePath()).getParentFile().toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("given file cannot be transformed to url: " + file, e);
        }
    }

    public final void setDeprecatedVariable(String str, String str2) {
        setVariable(str, getVariable(str2));
    }

    public synchronized void setSettingsVariables(URL url) {
        try {
            String externalForm = url.toExternalForm();
            setVariable("ivy.settings.url", externalForm);
            setDeprecatedVariable("ivy.conf.url", "ivy.settings.url");
            int iLastIndexOf = externalForm.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                String strSubstring = externalForm.substring(0, iLastIndexOf);
                setVariable("ivy.settings.dir", strSubstring);
                setVariable("ivy.settings.dir.url", strSubstring);
                setDeprecatedVariable("ivy.conf.dir", "ivy.settings.dir");
            } else {
                Message.warn("settings url does not contain any slash (/): ivy.settings.dir variable not set");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void dumpSettings() {
        Message.verbose("\tdefault cache: " + getDefaultCache());
        Message.verbose("\tdefault resolver: " + getDefaultResolver());
        Message.debug("\tdefault latest strategy: " + getDefaultLatestStrategy());
        Message.debug("\tdefault conflict manager: " + getDefaultConflictManager());
        Message.debug("\tcircular dependency strategy: " + getCircularDependencyStrategy());
        Message.debug("\tvalidate: " + doValidate());
        Message.debug("\tcheck up2date: " + isCheckUpToDate());
        if (!this.classpathURLs.isEmpty()) {
            Message.verbose("\t-- " + this.classpathURLs.size() + " custom classpath urls:");
            Iterator<URL> it = this.classpathURLs.iterator();
            while (it.hasNext()) {
                Message.debug("\t\t" + it.next());
            }
        }
        Message.verbose("\t-- " + this.resolversMap.size() + " resolvers:");
        Iterator<DependencyResolver> it2 = this.resolversMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().dumpSettings();
        }
        Message.debug("\tmodule settings:");
        this.moduleSettings.dump("\t\t");
    }

    public synchronized void loadProperties(URL url) throws IOException {
        loadProperties(url, true);
    }

    public synchronized void loadProperties(URL url, boolean z) throws IOException {
        loadProperties(FirebasePerfUrlConnection.openStream(url), z);
    }

    public synchronized void loadProperties(File file) throws IOException {
        loadProperties(file, true);
    }

    public synchronized void loadProperties(File file, boolean z) throws IOException {
        loadProperties(new FileInputStream(file), z);
    }

    public final void loadProperties(InputStream inputStream, boolean z) throws IOException {
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            addAllVariables(properties, z);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public synchronized void setVariable(String str, String str2) {
        setVariable(str, str2, true);
    }

    public synchronized void setVariable(String str, String str2, boolean z) {
        setVariable(str, str2, z, null, null);
    }

    public synchronized void setVariable(String str, String str2, boolean z, String str3, String str4) {
        if (str3 != null) {
            if (this.variableContainer.getVariable(str3) == null) {
                Message.verbose("Not setting '" + str + "' to '" + str2 + "' since '" + str3 + "' is not set.");
                return;
            }
        }
        if (str4 != null && this.variableContainer.getVariable(str4) != null) {
            Message.verbose("Not setting '" + str + "' to '" + str2 + "' since '" + str4 + "' is set.");
            return;
        }
        this.variableContainer.setVariable(str, str2, z);
    }

    public synchronized void addAllVariables(Map<?, ?> map) {
        addAllVariables(map, true);
    }

    public synchronized void addAllVariables(Map<?, ?> map, boolean z) {
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value == null || (value instanceof String)) {
                    setVariable(entry.getKey().toString(), (String) value, z);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.ivy.core.publish.PublishEngineSettings, org.apache.ivy.plugins.parser.ParserSettings
    public synchronized String substitute(String str) {
        return IvyPatternHelper.substituteVariables(str, this.variableContainer);
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized Map<String, String> substitute(Map<String, String> map) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), substitute(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // org.apache.ivy.core.retrieve.RetrieveEngineSettings
    public synchronized IvyVariableContainer getVariables() {
        return this.variableContainer;
    }

    public synchronized Class<?> typeDef(String str, String str2) {
        return typeDef(str, str2, false);
    }

    public synchronized Class<?> typeDef(String str, String str2, boolean z) {
        Class<?> clsClassForName;
        clsClassForName = classForName(str2, z);
        if (clsClassForName != null) {
            this.typeDefs.put(str, clsClassForName);
        }
        return clsClassForName;
    }

    public final Class<?> classForName(String str, boolean z) {
        try {
            return getClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (!z) {
                throw new RuntimeException("impossible to define new type: class not found: " + str + " in " + this.classpathURLs + " nor Ivy classloader");
            }
            Message.info("impossible to define new type: class not found: " + str + " in " + this.classpathURLs + " nor Ivy classloader");
            return null;
        }
    }

    public final ClassLoader getClassLoader() {
        if (this.classloader == null) {
            if (this.classpathURLs.isEmpty()) {
                this.classloader = Ivy.class.getClassLoader();
            } else {
                List<URL> list = this.classpathURLs;
                this.classloader = new URLClassLoader((URL[]) list.toArray(new URL[list.size()]), Ivy.class.getClassLoader());
            }
        }
        return this.classloader;
    }

    public synchronized void addClasspathURL(URL url) {
        this.classpathURLs.add(url);
        this.classloader = null;
    }

    public synchronized Map<String, Class<?>> getTypeDefs() {
        return this.typeDefs;
    }

    public synchronized Class<?> getTypeDef(String str) {
        return this.typeDefs.get(str);
    }

    public synchronized void addConfigured(DependencyResolver dependencyResolver) {
        addResolver(dependencyResolver);
    }

    public synchronized void addConfigured(ModuleDescriptorParser moduleDescriptorParser) {
        ModuleDescriptorParserRegistry.getInstance().addParser(moduleDescriptorParser);
    }

    public synchronized void addConfigured(SignatureGenerator signatureGenerator) {
        addSignatureGenerator(signatureGenerator);
    }

    public synchronized void addSignatureGenerator(SignatureGenerator signatureGenerator) {
        init(signatureGenerator);
        this.signatureGenerators.put(signatureGenerator.getName(), signatureGenerator);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized SignatureGenerator getSignatureGenerator(String str) {
        return this.signatureGenerators.get(str);
    }

    public synchronized void addResolver(DependencyResolver dependencyResolver) {
        try {
            if (dependencyResolver == null) {
                throw new NullPointerException("null resolver");
            }
            init(dependencyResolver);
            this.resolversMap.put(dependencyResolver.getName(), dependencyResolver);
            if (dependencyResolver instanceof ChainResolver) {
                Iterator<DependencyResolver> it = ((ChainResolver) dependencyResolver).getResolvers().iterator();
                while (it.hasNext()) {
                    addResolver(it.next());
                }
            } else if (dependencyResolver instanceof DualResolver) {
                DependencyResolver ivyResolver = ((DualResolver) dependencyResolver).getIvyResolver();
                if (ivyResolver != null) {
                    addResolver(ivyResolver);
                }
                DependencyResolver artifactResolver = ((DualResolver) dependencyResolver).getArtifactResolver();
                if (artifactResolver != null) {
                    addResolver(artifactResolver);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setDefaultCache(File file) {
        setVariable("ivy.cache.dir", file.getAbsolutePath(), false);
        this.defaultCache = file;
        RepositoryCacheManager repositoryCacheManager = this.defaultRepositoryCacheManager;
        if (repositoryCacheManager != null && "default-cache".equals(repositoryCacheManager.getName())) {
            RepositoryCacheManager repositoryCacheManager2 = this.defaultRepositoryCacheManager;
            if (repositoryCacheManager2 instanceof DefaultRepositoryCacheManager) {
                ((DefaultRepositoryCacheManager) repositoryCacheManager2).setBasedir(this.defaultCache);
            }
        }
    }

    public synchronized void setDefaultResolver(String str) {
        try {
            checkResolverName(str);
            if (str != null && !str.equals(this.defaultResolverName)) {
                this.defaultResolver = null;
            }
            this.defaultResolverName = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void checkResolverName(String str) {
        if (str == null || this.resolversMap.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("no resolver found called " + str + ": check your settings");
    }

    public synchronized void addModuleConfiguration(Map<String, String> map, PatternMatcher patternMatcher, String str, String str2, String str3, String str4) {
        checkResolverName(str);
        this.moduleSettings.defineRule(new MapMatcher(map, patternMatcher), new ModuleSettings(str, str2, str3, str4));
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized File resolveFile(String str) {
        return FileUtil.resolveFile(this.baseDir, str);
    }

    public synchronized void setBaseDir(File file) {
        File absoluteFile = file.getAbsoluteFile();
        this.baseDir = absoluteFile;
        setVariable("ivy.basedir", absoluteFile.getAbsolutePath());
        setVariable("basedir", this.baseDir.getAbsolutePath(), false);
    }

    public synchronized File getBaseDir() {
        return this.baseDir;
    }

    public synchronized File getDefaultIvyUserDir() {
        try {
            if (this.defaultUserDir == null) {
                if (getVariable("ivy.home") != null) {
                    setDefaultIvyUserDir(Checks.checkAbsolute(getVariable("ivy.home"), "ivy.home"));
                    Message.verbose("using ivy.default.ivy.user.dir variable for default ivy user dir: " + this.defaultUserDir);
                } else {
                    setDefaultIvyUserDir(new File(System.getProperty(SystemUtils.USER_HOME_KEY), ".ivy2"));
                    Message.verbose("no default ivy user dir defined: set to " + this.defaultUserDir);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultUserDir;
    }

    public synchronized void setDefaultIvyUserDir(File file) {
        this.defaultUserDir = file;
        setVariable("ivy.default.ivy.user.dir", file.getAbsolutePath());
        setVariable("ivy.home", this.defaultUserDir.getAbsolutePath());
    }

    public synchronized File getDefaultCache() {
        try {
            if (this.defaultCache == null) {
                String variable = getVariable("ivy.cache.dir");
                if (variable != null) {
                    this.defaultCache = Checks.checkAbsolute(variable, "ivy.cache.dir");
                } else {
                    setDefaultCache(new File(getDefaultIvyUserDir(), "cache"));
                    Message.verbose("no default cache defined: set to " + this.defaultCache);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultCache;
    }

    public synchronized void setDefaultRepositoryCacheBasedir(String str) {
        setVariable("ivy.cache.repository", str, true);
        RepositoryCacheManager repositoryCacheManager = this.defaultRepositoryCacheManager;
        if (repositoryCacheManager != null && "default-cache".equals(repositoryCacheManager.getName())) {
            RepositoryCacheManager repositoryCacheManager2 = this.defaultRepositoryCacheManager;
            if (repositoryCacheManager2 instanceof DefaultRepositoryCacheManager) {
                ((DefaultRepositoryCacheManager) repositoryCacheManager2).setBasedir(getDefaultRepositoryCacheBasedir());
            }
        }
    }

    public synchronized void setDefaultResolutionCacheBasedir(String str) {
        setVariable("ivy.cache.resolution", str, true);
        ResolutionCacheManager resolutionCacheManager = this.resolutionCacheManager;
        if (resolutionCacheManager != null && (resolutionCacheManager instanceof DefaultResolutionCacheManager)) {
            ((DefaultResolutionCacheManager) resolutionCacheManager).setBasedir(getDefaultResolutionCacheBasedir());
        }
    }

    public synchronized File getDefaultRepositoryCacheBasedir() {
        String variable = getVariable("ivy.cache.repository");
        if (variable != null) {
            return Checks.checkAbsolute(variable, "ivy.cache.repository");
        }
        return getDefaultCache();
    }

    public synchronized File getDefaultResolutionCacheBasedir() {
        String variable = getVariable("ivy.cache.resolution");
        if (variable != null) {
            return Checks.checkAbsolute(variable, "ivy.cache.resolution");
        }
        return getDefaultCache();
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized void setDictatorResolver(DependencyResolver dependencyResolver) {
        this.dictatorResolver = dependencyResolver;
    }

    public final DependencyResolver getDictatorResolver() {
        DependencyResolver dependencyResolver = this.dictatorResolver;
        if (dependencyResolver == null) {
            return null;
        }
        AbstractWorkspaceResolver abstractWorkspaceResolver = this.workspaceResolver;
        if (abstractWorkspaceResolver != null && !(dependencyResolver instanceof WorkspaceChainResolver)) {
            this.dictatorResolver = new WorkspaceChainResolver(this, dependencyResolver, abstractWorkspaceResolver);
        }
        return this.dictatorResolver;
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized DependencyResolver getResolver(ModuleRevisionId moduleRevisionId) {
        DependencyResolver dictatorResolver = getDictatorResolver();
        if (dictatorResolver != null) {
            return dictatorResolver;
        }
        return getResolver(getResolverName(moduleRevisionId));
    }

    public synchronized boolean hasResolver(String str) {
        return this.resolversMap.containsKey(str);
    }

    @Override // org.apache.ivy.core.publish.PublishEngineSettings, org.apache.ivy.core.check.CheckEngineSettings, org.apache.ivy.core.install.InstallEngineSettings
    public synchronized DependencyResolver getResolver(String str) {
        try {
            DependencyResolver dictatorResolver = getDictatorResolver();
            if (dictatorResolver != null) {
                return dictatorResolver;
            }
            DependencyResolver dependencyResolver = this.resolversMap.get(str);
            if (dependencyResolver == null) {
                Message.error("unknown resolver " + str);
            } else {
                AbstractWorkspaceResolver abstractWorkspaceResolver = this.workspaceResolver;
                if (abstractWorkspaceResolver != null && !(dependencyResolver instanceof WorkspaceChainResolver)) {
                    WorkspaceChainResolver workspaceChainResolver = new WorkspaceChainResolver(this, dependencyResolver, abstractWorkspaceResolver);
                    this.resolversMap.put(workspaceChainResolver.getName(), workspaceChainResolver);
                    this.resolversMap.put(str, workspaceChainResolver);
                    dependencyResolver = workspaceChainResolver;
                }
            }
            return dependencyResolver;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized DependencyResolver getDefaultResolver() {
        try {
            DependencyResolver dictatorResolver = getDictatorResolver();
            if (dictatorResolver != null) {
                return dictatorResolver;
            }
            if (this.defaultResolver == null) {
                this.defaultResolver = this.resolversMap.get(this.defaultResolverName);
            }
            AbstractWorkspaceResolver abstractWorkspaceResolver = this.workspaceResolver;
            if (abstractWorkspaceResolver != null) {
                DependencyResolver dependencyResolver = this.defaultResolver;
                if (!(dependencyResolver instanceof WorkspaceChainResolver)) {
                    this.defaultResolver = new WorkspaceChainResolver(this, dependencyResolver, abstractWorkspaceResolver);
                }
            }
            return this.defaultResolver;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: org.apache.ivy.core.settings.IvySettings$1 */
    /* loaded from: classes7.dex */
    public class C111681 implements Filter<ModuleSettings> {
        public C111681() {
        }

        @Override // org.apache.ivy.util.filter.Filter
        public boolean accept(ModuleSettings moduleSettings) {
            return moduleSettings.getResolverName() != null;
        }
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized String getResolverName(ModuleRevisionId moduleRevisionId) {
        ModuleSettings rule;
        try {
            rule = this.moduleSettings.getRule(moduleRevisionId, new Filter<ModuleSettings>() { // from class: org.apache.ivy.core.settings.IvySettings.1
                public C111681() {
                }

                @Override // org.apache.ivy.util.filter.Filter
                public boolean accept(ModuleSettings moduleSettings) {
                    return moduleSettings.getResolverName() != null;
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return rule == null ? this.defaultResolverName : rule.getResolverName();
    }

    /* renamed from: org.apache.ivy.core.settings.IvySettings$2 */
    /* loaded from: classes7.dex */
    public class C111692 implements Filter<ModuleSettings> {
        public C111692() {
        }

        @Override // org.apache.ivy.util.filter.Filter
        public boolean accept(ModuleSettings moduleSettings) {
            return moduleSettings.getBranch() != null;
        }
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized String getDefaultBranch(ModuleId moduleId) {
        ModuleSettings rule;
        try {
            rule = this.moduleSettings.getRule(moduleId, new Filter<ModuleSettings>() { // from class: org.apache.ivy.core.settings.IvySettings.2
                public C111692() {
                }

                @Override // org.apache.ivy.util.filter.Filter
                public boolean accept(ModuleSettings moduleSettings) {
                    return moduleSettings.getBranch() != null;
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return rule == null ? getDefaultBranch() : rule.getBranch();
    }

    public synchronized String getDefaultBranch() {
        return this.defaultBranch;
    }

    public synchronized void setDefaultBranch(String str) {
        this.defaultBranch = str;
    }

    /* renamed from: org.apache.ivy.core.settings.IvySettings$3 */
    /* loaded from: classes7.dex */
    public class C111703 implements Filter<ModuleSettings> {
        public C111703() {
        }

        @Override // org.apache.ivy.util.filter.Filter
        public boolean accept(ModuleSettings moduleSettings) {
            return moduleSettings.getConflictManager() != null;
        }
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized ConflictManager getConflictManager(ModuleId moduleId) {
        ModuleSettings rule = this.moduleSettings.getRule(moduleId, new Filter<ModuleSettings>() { // from class: org.apache.ivy.core.settings.IvySettings.3
            public C111703() {
            }

            @Override // org.apache.ivy.util.filter.Filter
            public boolean accept(ModuleSettings moduleSettings) {
                return moduleSettings.getConflictManager() != null;
            }
        });
        if (rule == null) {
            return getDefaultConflictManager();
        }
        ConflictManager conflictManager = getConflictManager(rule.getConflictManager());
        if (conflictManager != null) {
            return conflictManager;
        }
        throw new IllegalStateException("ivy badly configured: unknown conflict manager " + rule.getConflictManager());
    }

    /* renamed from: org.apache.ivy.core.settings.IvySettings$4 */
    /* loaded from: classes7.dex */
    public class C111714 implements Filter<ModuleSettings> {
        public C111714() {
        }

        @Override // org.apache.ivy.util.filter.Filter
        public boolean accept(ModuleSettings moduleSettings) {
            return moduleSettings.getResolveMode() != null;
        }
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized String getResolveMode(ModuleId moduleId) {
        ModuleSettings rule;
        try {
            rule = this.moduleSettings.getRule(moduleId, new Filter<ModuleSettings>() { // from class: org.apache.ivy.core.settings.IvySettings.4
                public C111714() {
                }

                @Override // org.apache.ivy.util.filter.Filter
                public boolean accept(ModuleSettings moduleSettings) {
                    return moduleSettings.getResolveMode() != null;
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return rule == null ? getDefaultResolveMode() : rule.getResolveMode();
    }

    public synchronized String getDefaultResolveMode() {
        return this.defaultResolveMode;
    }

    public synchronized void setDefaultResolveMode(String str) {
        this.defaultResolveMode = str;
    }

    public synchronized void addConfigured(ConflictManager conflictManager) {
        addConflictManager(conflictManager.getName(), conflictManager);
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized ConflictManager getConflictManager(String str) {
        if ("default".equals(str)) {
            return getDefaultConflictManager();
        }
        return this.conflictsManager.get(str);
    }

    public synchronized void addConflictManager(String str, ConflictManager conflictManager) {
        init(conflictManager);
        this.conflictsManager.put(str, conflictManager);
    }

    public synchronized void addConfigured(LatestStrategy latestStrategy) {
        addLatestStrategy(latestStrategy.getName(), latestStrategy);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized LatestStrategy getLatestStrategy(String str) {
        if ("default".equals(str)) {
            return getDefaultLatestStrategy();
        }
        LatestStrategy latestStrategy = this.latestStrategies.get(str);
        if (this.workspaceResolver != null && !(latestStrategy instanceof WorkspaceLatestStrategy)) {
            WorkspaceLatestStrategy workspaceLatestStrategy = new WorkspaceLatestStrategy(latestStrategy);
            this.latestStrategies.put(str, workspaceLatestStrategy);
            latestStrategy = workspaceLatestStrategy;
        }
        return latestStrategy;
    }

    public synchronized void addLatestStrategy(String str, LatestStrategy latestStrategy) {
        init(latestStrategy);
        this.latestStrategies.put(str, latestStrategy);
    }

    public synchronized void addConfigured(LockStrategy lockStrategy) {
        addLockStrategy(lockStrategy.getName(), lockStrategy);
    }

    public synchronized LockStrategy getLockStrategy(String str) {
        if ("default".equals(str)) {
            return getDefaultLockStrategy();
        }
        return this.lockStrategies.get(str);
    }

    public synchronized void addLockStrategy(String str, LockStrategy lockStrategy) {
        init(lockStrategy);
        this.lockStrategies.put(str, lockStrategy);
    }

    public synchronized void addConfigured(Namespace namespace) {
        addNamespace(namespace);
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized Namespace getNamespace(String str) {
        if ("system".equals(str)) {
            return getSystemNamespace();
        }
        return this.namespaces.get(str);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public final Namespace getSystemNamespace() {
        return Namespace.SYSTEM_NAMESPACE;
    }

    public synchronized void addNamespace(Namespace namespace) {
        init(namespace);
        this.namespaces.put(namespace.getName(), namespace);
    }

    public void addConfigured(NamedTimeoutConstraint namedTimeoutConstraint) {
        if (namedTimeoutConstraint == null) {
            return;
        }
        String name = namedTimeoutConstraint.getName();
        StringUtils.assertNotNullNorEmpty(name, "Name of a timeout constraint cannot be null or empty string");
        this.timeoutConstraints.put(name, namedTimeoutConstraint);
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public TimeoutConstraint getTimeoutConstraint(String str) {
        return this.timeoutConstraints.get(str);
    }

    public synchronized void addConfigured(PatternMatcher patternMatcher) {
        addMatcher(patternMatcher);
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized PatternMatcher getMatcher(String str) {
        return this.matchers.get(str);
    }

    public synchronized void addMatcher(PatternMatcher patternMatcher) {
        init(patternMatcher);
        this.matchers.put(patternMatcher.getName(), patternMatcher);
    }

    public synchronized void addConfigured(RepositoryCacheManager repositoryCacheManager) {
        addRepositoryCacheManager(repositoryCacheManager);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized RepositoryCacheManager getRepositoryCacheManager(String str) {
        return this.repositoryCacheManagers.get(str);
    }

    public synchronized void addRepositoryCacheManager(RepositoryCacheManager repositoryCacheManager) {
        init(repositoryCacheManager);
        this.repositoryCacheManagers.put(repositoryCacheManager.getName(), repositoryCacheManager);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized RepositoryCacheManager[] getRepositoryCacheManagers() {
        return (RepositoryCacheManager[]) this.repositoryCacheManagers.values().toArray(new RepositoryCacheManager[this.repositoryCacheManagers.size()]);
    }

    public synchronized void addConfigured(ReportOutputter reportOutputter) {
        addReportOutputter(reportOutputter);
    }

    public synchronized ReportOutputter getReportOutputter(String str) {
        return this.reportOutputters.get(str);
    }

    public synchronized void addReportOutputter(ReportOutputter reportOutputter) {
        init(reportOutputter);
        this.reportOutputters.put(reportOutputter.getName(), reportOutputter);
    }

    @Override // org.apache.ivy.core.install.InstallEngineSettings, org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized ReportOutputter[] getReportOutputters() {
        return (ReportOutputter[]) this.reportOutputters.values().toArray(new ReportOutputter[this.reportOutputters.size()]);
    }

    public synchronized void addConfigured(VersionMatcher versionMatcher) {
        addVersionMatcher(versionMatcher);
    }

    public synchronized VersionMatcher getVersionMatcher(String str) {
        return this.versionMatchers.get(str);
    }

    public synchronized void addVersionMatcher(VersionMatcher versionMatcher) {
        try {
            init(versionMatcher);
            this.versionMatchers.put(versionMatcher.getName(), versionMatcher);
            if (this.versionMatcher == null) {
                this.versionMatcher = new ChainVersionMatcher();
                addVersionMatcher(new ExactVersionMatcher());
            }
            VersionMatcher versionMatcher2 = this.versionMatcher;
            if (versionMatcher2 instanceof ChainVersionMatcher) {
                ((ChainVersionMatcher) versionMatcher2).add(versionMatcher);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized VersionMatcher[] getVersionMatchers() {
        return (VersionMatcher[]) this.versionMatchers.values().toArray(new VersionMatcher[this.versionMatchers.size()]);
    }

    @Override // org.apache.ivy.core.sort.SortEngineSettings, org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized VersionMatcher getVersionMatcher() {
        try {
            if (this.versionMatcher == null) {
                configureDefaultVersionMatcher();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.versionMatcher;
    }

    public synchronized void configureDefaultVersionMatcher() {
        addVersionMatcher(new LatestVersionMatcher());
        addVersionMatcher(new SubVersionMatcher());
        addVersionMatcher(new VersionRangeMatcher());
    }

    @Override // org.apache.ivy.core.sort.SortEngineSettings
    public synchronized CircularDependencyStrategy getCircularDependencyStrategy() {
        try {
            if (this.circularDependencyStrategy == null) {
                this.circularDependencyStrategy = getCircularDependencyStrategy("default");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.circularDependencyStrategy;
    }

    public synchronized CircularDependencyStrategy getCircularDependencyStrategy(String str) {
        try {
            if ("default".equals(str)) {
                str = IvyBuildList.OnMissingDescriptor.WARN;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.circularDependencyStrategies.get(str);
    }

    public synchronized void setCircularDependencyStrategy(CircularDependencyStrategy circularDependencyStrategy) {
        this.circularDependencyStrategy = circularDependencyStrategy;
    }

    public synchronized void addConfigured(CircularDependencyStrategy circularDependencyStrategy) {
        addCircularDependencyStrategy(circularDependencyStrategy);
    }

    public final void addCircularDependencyStrategy(CircularDependencyStrategy circularDependencyStrategy) {
        this.circularDependencyStrategies.put(circularDependencyStrategy.getName(), circularDependencyStrategy);
    }

    public final void configureDefaultCircularDependencyStrategies() {
        addCircularDependencyStrategy(WarnCircularDependencyStrategy.getInstance());
        addCircularDependencyStrategy(ErrorCircularDependencyStrategy.getInstance());
        addCircularDependencyStrategy(IgnoreCircularDependencyStrategy.getInstance());
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized StatusManager getStatusManager() {
        try {
            if (this.statusManager == null) {
                this.statusManager = StatusManager.newDefaultInstance();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.statusManager;
    }

    public void setStatusManager(StatusManager statusManager) {
        this.statusManager = statusManager;
    }

    @Override // org.apache.ivy.core.retrieve.RetrieveEngineSettings
    public synchronized String[] getIgnorableFilenames() {
        List<String> list;
        list = this.listingIgnore;
        return (String[]) list.toArray(new String[list.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized void filterIgnore(Collection<String> collection) {
        collection.removeAll(this.listingIgnore);
    }

    @Override // org.apache.ivy.core.retrieve.RetrieveEngineSettings
    public synchronized boolean isCheckUpToDate() {
        return this.checkUpToDate;
    }

    public synchronized void setCheckUpToDate(boolean z) {
        this.checkUpToDate = z;
    }

    @Override // org.apache.ivy.core.check.CheckEngineSettings
    public synchronized boolean doValidate() {
        return this.validate;
    }

    public synchronized void setValidate(boolean z) {
        this.validate = z;
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized String getVariable(String str) {
        return this.variableContainer.getVariable(str);
    }

    public synchronized boolean getVariableAsBoolean(String str, boolean z) {
        String variable = getVariable(str);
        if (variable != null) {
            z = Boolean.valueOf(variable).booleanValue();
        }
        return z;
    }

    public synchronized ConflictManager getDefaultConflictManager() {
        try {
            if (this.defaultConflictManager == null) {
                LatestConflictManager latestConflictManager = new LatestConflictManager(getDefaultLatestStrategy());
                this.defaultConflictManager = latestConflictManager;
                latestConflictManager.setSettings(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultConflictManager;
    }

    public synchronized void setDefaultConflictManager(ConflictManager conflictManager) {
        this.defaultConflictManager = conflictManager;
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized LatestStrategy getDefaultLatestStrategy() {
        try {
            if (this.defaultLatestStrategy == null) {
                this.defaultLatestStrategy = new LatestRevisionStrategy();
            }
            if (this.workspaceResolver != null) {
                LatestStrategy latestStrategy = this.defaultLatestStrategy;
                if (!(latestStrategy instanceof WorkspaceLatestStrategy)) {
                    this.defaultLatestStrategy = new WorkspaceLatestStrategy(latestStrategy);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultLatestStrategy;
    }

    public synchronized void setDefaultLatestStrategy(LatestStrategy latestStrategy) {
        this.defaultLatestStrategy = latestStrategy;
    }

    public synchronized LockStrategy getDefaultLockStrategy() {
        try {
            if (this.defaultLockStrategy == null) {
                this.defaultLockStrategy = new NoLockStrategy();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultLockStrategy;
    }

    public synchronized void setDefaultLockStrategy(LockStrategy lockStrategy) {
        this.defaultLockStrategy = lockStrategy;
    }

    @Override // org.apache.ivy.plugins.resolver.ResolverSettings
    public synchronized RepositoryCacheManager getDefaultRepositoryCacheManager() {
        try {
            if (this.defaultRepositoryCacheManager == null) {
                DefaultRepositoryCacheManager defaultRepositoryCacheManager = new DefaultRepositoryCacheManager("default-cache", this, getDefaultRepositoryCacheBasedir());
                this.defaultRepositoryCacheManager = defaultRepositoryCacheManager;
                addRepositoryCacheManager(defaultRepositoryCacheManager);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultRepositoryCacheManager;
    }

    public synchronized void setDefaultRepositoryCacheManager(RepositoryCacheManager repositoryCacheManager) {
        this.defaultRepositoryCacheManager = repositoryCacheManager;
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized ResolutionCacheManager getResolutionCacheManager() {
        try {
            if (this.resolutionCacheManager == null) {
                DefaultResolutionCacheManager defaultResolutionCacheManager = new DefaultResolutionCacheManager(getDefaultResolutionCacheBasedir());
                this.resolutionCacheManager = defaultResolutionCacheManager;
                init(defaultResolutionCacheManager);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.resolutionCacheManager;
    }

    public synchronized void setResolutionCacheManager(ResolutionCacheManager resolutionCacheManager) {
        this.resolutionCacheManager = resolutionCacheManager;
    }

    public synchronized void addTrigger(Trigger trigger) {
        init(trigger);
        this.triggers.add(trigger);
    }

    public synchronized List<Trigger> getTriggers() {
        return this.triggers;
    }

    public synchronized void addConfigured(Trigger trigger) {
        addTrigger(trigger);
    }

    public synchronized boolean isUseRemoteConfig() {
        return this.useRemoteConfig;
    }

    public synchronized void setUseRemoteConfig(boolean z) {
        this.useRemoteConfig = z;
    }

    public synchronized boolean logModulesInUse() {
        return getVariableAsBoolean("ivy.log.modules.in.use", true);
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized boolean logModuleWhenFound() {
        return getVariableAsBoolean("ivy.log.module.when.found", true);
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized boolean logResolvedRevision() {
        return getVariableAsBoolean("ivy.log.resolved.revision", true);
    }

    @Override // org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized boolean debugConflictResolution() {
        try {
            if (this.debugConflictResolution == null) {
                this.debugConflictResolution = Boolean.valueOf(getVariableAsBoolean("ivy.log.conflict.resolution", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.debugConflictResolution.booleanValue();
    }

    public synchronized boolean debugLocking() {
        try {
            if (this.debugLocking == null) {
                this.debugLocking = Boolean.valueOf(getVariableAsBoolean("ivy.log.locking", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.debugLocking.booleanValue();
    }

    @Override // org.apache.ivy.core.repository.RepositoryManagementEngineSettings
    public synchronized boolean dumpMemoryUsage() {
        try {
            if (this.dumpMemoryUsage == null) {
                this.dumpMemoryUsage = Boolean.valueOf(getVariableAsBoolean("ivy.log.memory", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dumpMemoryUsage.booleanValue();
    }

    @Override // org.apache.ivy.core.install.InstallEngineSettings, org.apache.ivy.core.resolve.ResolveEngineSettings
    public synchronized boolean logNotConvertedExclusionRule() {
        return this.logNotConvertedExclusionRule;
    }

    @Override // org.apache.ivy.core.install.InstallEngineSettings
    public synchronized void setLogNotConvertedExclusionRule(boolean z) {
        this.logNotConvertedExclusionRule = z;
    }

    public final void init(Object obj) {
        if (obj instanceof IvySettingsAware) {
            ((IvySettingsAware) obj).setSettings(this);
        } else if (obj instanceof DependencyResolver) {
            ((DependencyResolver) obj).setSettings(this);
        }
    }

    public static class ModuleSettings {
        public String branch;
        public String conflictManager;
        public String resolveMode;
        public String resolverName;

        public ModuleSettings(String str, String str2, String str3, String str4) {
            this.resolverName = str;
            this.branch = str2;
            this.conflictManager = str3;
            this.resolveMode = str4;
        }

        public String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder sb = new StringBuilder();
            String str4 = "";
            if (this.resolverName != null) {
                str = "resolver: " + this.resolverName;
            } else {
                str = "";
            }
            sb.append(str);
            if (this.branch != null) {
                str2 = "branch: " + this.branch;
            } else {
                str2 = "";
            }
            sb.append(str2);
            if (this.conflictManager != null) {
                str3 = "conflictManager: " + this.conflictManager;
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (this.resolveMode != null) {
                str4 = "resolveMode: " + this.resolveMode;
            }
            sb.append(str4);
            return sb.toString();
        }

        public String getBranch() {
            return this.branch;
        }

        public String getResolverName() {
            return this.resolverName;
        }

        public String getConflictManager() {
            return this.conflictManager;
        }

        public String getResolveMode() {
            return this.resolveMode;
        }
    }

    public synchronized Collection<DependencyResolver> getResolvers() {
        return this.resolversMap.values();
    }

    @Override // org.apache.ivy.core.install.InstallEngineSettings
    public synchronized Collection<String> getResolverNames() {
        return this.resolversMap.keySet();
    }

    @Override // org.apache.ivy.core.install.InstallEngineSettings
    public synchronized Collection<String> getMatcherNames() {
        return this.matchers.keySet();
    }

    public synchronized IvyVariableContainer getVariableContainer() {
        return this.variableContainer;
    }

    public synchronized void setVariableContainer(IvyVariableContainer ivyVariableContainer) {
        this.variableContainer = ivyVariableContainer;
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public synchronized RelativeUrlResolver getRelativeUrlResolver() {
        return new NormalRelativeUrlResolver();
    }

    public synchronized void setDefaultCacheIvyPattern(String str) {
        CacheUtil.checkCachePattern(str);
        this.defaultCacheIvyPattern = str;
    }

    public synchronized String getDefaultCacheIvyPattern() {
        return this.defaultCacheIvyPattern;
    }

    public synchronized void setDefaultCacheArtifactPattern(String str) {
        CacheUtil.checkCachePattern(str);
        this.defaultCacheArtifactPattern = str;
    }

    public synchronized String getDefaultCacheArtifactPattern() {
        return this.defaultCacheArtifactPattern;
    }

    public synchronized void setDefaultUseOrigin(boolean z) {
        this.defaultUseOrigin = z;
    }

    public synchronized boolean isDefaultUseOrigin() {
        return this.defaultUseOrigin;
    }

    public synchronized void useDeprecatedUseOrigin() {
        Message.deprecated("useOrigin option is deprecated when calling resolve, use useOrigin setting on the cache implementation instead");
        setDefaultUseOrigin(true);
    }

    public synchronized void validate() {
        validateAll(this.resolversMap.values());
        validateAll(this.conflictsManager.values());
        validateAll(this.latestStrategies.values());
        validateAll(this.lockStrategies.values());
        validateAll(this.repositoryCacheManagers.values());
        validateAll(this.reportOutputters.values());
        validateAll(this.circularDependencyStrategies.values());
        validateAll(this.versionMatchers.values());
        validateAll(this.namespaces.values());
    }

    public final void validateAll(Collection<?> collection) {
        for (Object obj : collection) {
            if (obj instanceof Validatable) {
                ((Validatable) obj).validate();
            }
        }
    }

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    public Namespace getContextNamespace() {
        return Namespace.SYSTEM_NAMESPACE;
    }

    public synchronized void addConfigured(ArchivePacking archivePacking) {
        init(archivePacking);
        this.packingRegistry.register(archivePacking);
    }

    public PackingRegistry getPackingRegistry() {
        return this.packingRegistry;
    }

    public void addConfigured(AbstractWorkspaceResolver abstractWorkspaceResolver) {
        this.workspaceResolver = abstractWorkspaceResolver;
        if (abstractWorkspaceResolver != null) {
            abstractWorkspaceResolver.setSettings(this);
            DefaultRepositoryCacheManager defaultRepositoryCacheManager = new DefaultRepositoryCacheManager();
            String str = "workspace-resolver-cache-" + abstractWorkspaceResolver.getName();
            defaultRepositoryCacheManager.setBasedir(new File(getDefaultCache(), str));
            defaultRepositoryCacheManager.setCheckmodified(true);
            defaultRepositoryCacheManager.setUseOrigin(true);
            defaultRepositoryCacheManager.setName(str);
            addRepositoryCacheManager(defaultRepositoryCacheManager);
            abstractWorkspaceResolver.setCache(str);
        }
    }
}
