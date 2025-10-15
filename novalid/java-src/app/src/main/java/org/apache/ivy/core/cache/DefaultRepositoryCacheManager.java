package org.apache.ivy.core.cache;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ArtifactRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRules;
import org.apache.ivy.core.pack.PackagingManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.plugins.lock.LockStrategy;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.plugins.matcher.NoMatcher;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.plugins.repository.ArtifactResourceResolver;
import org.apache.ivy.plugins.repository.LocalizableResource;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ResourceDownloader;
import org.apache.ivy.plugins.repository.ResourceHelper;
import org.apache.ivy.plugins.resolver.AbstractResolver;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.resolver.FileSystemResolver;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.HexEncoder;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.PropertiesFile;
import org.apache.ivy.util.StringUtils;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public class DefaultRepositoryCacheManager implements RepositoryCacheManager, IvySettingsAware {
    public static final Pattern ARTIFACT_KEY_PATTERN;
    public static final String DEFAULT_ARTIFACT_PATTERN = "[organisation]/[module](/[branch])/[type]s/[artifact]-[revision](-[classifier])(.[ext])";
    public static final String DEFAULT_DATA_FILE_PATTERN = "[organisation]/[module](/[branch])/ivydata-[revision].properties";
    public static final String DEFAULT_IVY_PATTERN = "[organisation]/[module](/[branch])/ivy-[revision].xml";
    public static final int DEFAULT_MEMORY_CACHE_SIZE = 150;
    public static final Pattern DURATION_PATTERN;
    public static final int MILLIS_IN_DAY = 86400000;
    public static final int MILLIS_IN_HOUR = 3600000;
    public static final int MILLIS_IN_MINUTES = 60000;
    public static final int MILLIS_IN_SECONDS = 1000;
    public static MessageDigest SHA_DIGEST;
    public String artifactPattern;
    public File basedir;
    public String changingPattern;
    public Boolean checkmodified;
    public String ivyPattern;
    public LockStrategy lockStrategy;
    public String lockStrategyName;
    public ModuleDescriptorMemoryCache memoryModuleDescrCache;
    public String name;
    public IvySettings settings;
    public Boolean useOrigin;
    public String dataFilePattern = DEFAULT_DATA_FILE_PATTERN;
    public String changingMatcherName = PatternMatcher.EXACT_OR_REGEXP;
    public ModuleRules<Long> ttlRules = new ModuleRules<>();
    public Long defaultTTL = null;
    public PackagingManager packagingManager = new PackagingManager();
    public final List<ConfiguredTTL> configuredTTLs = new ArrayList();

    static {
        try {
            SHA_DIGEST = MessageDigest.getInstance(FileChecksumCalculator.SHA1_ALGORITHM);
            DURATION_PATTERN = Pattern.compile("(?:(\\d+)d)? ?(?:(\\d+)h)? ?(?:(\\d+)m)? ?(?:(\\d+)s)? ?(?:(\\d+)ms)?");
            ARTIFACT_KEY_PATTERN = Pattern.compile(".*:(.*)#(.*)#(.*)#(.*)(\\.location)?");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("The SHA1 algorithm is not available in your classpath", e);
        }
    }

    public DefaultRepositoryCacheManager() {
    }

    public DefaultRepositoryCacheManager(String str, IvySettings ivySettings, File file) {
        setName(str);
        setSettings(ivySettings);
        setBasedir(file);
    }

    public IvySettings getSettings() {
        return this.settings;
    }

    @Override // org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        this.settings = ivySettings;
        this.packagingManager.setSettings(ivySettings);
        for (ConfiguredTTL configuredTTL : this.configuredTTLs) {
            addTTL(configuredTTL.attributes, configuredTTL.matcher == null ? ExactPatternMatcher.INSTANCE : ivySettings.getMatcher(configuredTTL.matcher), configuredTTL.duration);
        }
        this.configuredTTLs.clear();
    }

    public File getIvyFileInCache(ModuleRevisionId moduleRevisionId) {
        return new File(getRepositoryCacheRoot(), IvyPatternHelper.substitute(getIvyPattern(), DefaultArtifact.newIvyArtifact(moduleRevisionId, null)));
    }

    public String getIvyPattern() {
        if (this.ivyPattern == null) {
            IvySettings ivySettings = this.settings;
            if (ivySettings != null) {
                this.ivyPattern = ivySettings.getDefaultCacheIvyPattern();
            }
            if (this.ivyPattern == null) {
                this.ivyPattern = DEFAULT_IVY_PATTERN;
            }
        }
        return this.ivyPattern;
    }

    public String getArtifactPattern() {
        if (this.artifactPattern == null) {
            IvySettings ivySettings = this.settings;
            if (ivySettings != null) {
                this.artifactPattern = ivySettings.getDefaultCacheArtifactPattern();
            }
            if (this.artifactPattern == null) {
                this.artifactPattern = DEFAULT_ARTIFACT_PATTERN;
            }
        }
        return this.artifactPattern;
    }

    public void setArtifactPattern(String str) {
        CacheUtil.checkCachePattern(str);
        this.artifactPattern = str;
    }

    public File getBasedir() {
        if (this.basedir == null) {
            this.basedir = this.settings.getDefaultRepositoryCacheBasedir();
        }
        return this.basedir;
    }

    public void setBasedir(File file) {
        this.basedir = file;
    }

    public long getDefaultTTL() {
        if (this.defaultTTL == null) {
            this.defaultTTL = Long.valueOf(parseDuration(this.settings.getVariable("ivy.cache.ttl.default")));
        }
        return this.defaultTTL.longValue();
    }

    public void setDefaultTTL(long j) {
        this.defaultTTL = Long.valueOf(j);
    }

    public void setDefaultTTL(String str) {
        this.defaultTTL = Long.valueOf(parseDuration(str));
    }

    public String getDataFilePattern() {
        return this.dataFilePattern;
    }

    public void setDataFilePattern(String str) {
        CacheUtil.checkCachePattern(str);
        this.dataFilePattern = str;
    }

    public void setIvyPattern(String str) {
        CacheUtil.checkCachePattern(str);
        this.ivyPattern = str;
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getChangingMatcherName() {
        return this.changingMatcherName;
    }

    public void setChangingMatcher(String str) {
        this.changingMatcherName = str;
    }

    public String getChangingPattern() {
        return this.changingPattern;
    }

    public void setChangingPattern(String str) {
        this.changingPattern = str;
    }

    public void addTTL(Map<String, String> map, PatternMatcher patternMatcher, long j) {
        this.ttlRules.defineRule(new MapMatcher(map, patternMatcher), Long.valueOf(j));
    }

    public void addConfiguredTtl(Map<String, String> map) {
        String str = map.get("duration");
        if (str == null) {
            throw new IllegalArgumentException("'duration' attribute is mandatory for ttl");
        }
        this.configuredTTLs.add(new ConfiguredTTL(parseDuration(str), map.get("matcher"), map));
    }

    public void setMemorySize(int i) {
        this.memoryModuleDescrCache = new ModuleDescriptorMemoryCache(i);
    }

    public ModuleDescriptorMemoryCache getMemoryCache() {
        if (this.memoryModuleDescrCache == null) {
            this.memoryModuleDescrCache = new ModuleDescriptorMemoryCache(150);
        }
        return this.memoryModuleDescrCache;
    }

    public final long parseDuration(String str) {
        if (str == null) {
            return 0L;
        }
        if ("eternal".equals(str)) {
            return Long.MAX_VALUE;
        }
        Pattern pattern = DURATION_PATTERN;
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            int groupIntValue = getGroupIntValue(matcher, 1);
            int groupIntValue2 = getGroupIntValue(matcher, 2);
            int groupIntValue3 = getGroupIntValue(matcher, 3);
            int groupIntValue4 = getGroupIntValue(matcher, 4);
            return (groupIntValue * MILLIS_IN_DAY) + (groupIntValue2 * MILLIS_IN_HOUR) + (groupIntValue3 * 60000) + (groupIntValue4 * 1000) + getGroupIntValue(matcher, 5);
        }
        throw new IllegalArgumentException("invalid duration '" + str + "': it must match " + pattern.pattern() + " or 'eternal'");
    }

    public final int getGroupIntValue(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        if (StringUtils.isNullOrEmpty(strGroup)) {
            return 0;
        }
        return Integer.parseInt(strGroup);
    }

    public boolean isCheckmodified() {
        Boolean bool = this.checkmodified;
        if (bool == null) {
            return getSettings() != null && Boolean.parseBoolean(getSettings().getVariable("ivy.resolver.default.check.modified"));
        }
        return bool.booleanValue();
    }

    public void setCheckmodified(boolean z) {
        this.checkmodified = Boolean.valueOf(z);
    }

    public boolean isUseOrigin() {
        Boolean bool = this.useOrigin;
        if (bool == null) {
            return getSettings() != null && getSettings().isDefaultUseOrigin();
        }
        return bool.booleanValue();
    }

    public void setUseOrigin(boolean z) {
        this.useOrigin = Boolean.valueOf(z);
    }

    public File getArchiveFileInCache(Artifact artifact) {
        return getArchiveFileInCache(artifact, getSavedArtifactOrigin(artifact));
    }

    public File getArchiveFileInCache(Artifact artifact, ArtifactOrigin artifactOrigin) {
        File file = new File(getRepositoryCacheRoot(), getArchivePathInCache(artifact, artifactOrigin));
        if (!file.exists() && !ArtifactOrigin.isUnknown(artifactOrigin) && artifactOrigin.isLocal()) {
            File fileCheckAbsolute = Checks.checkAbsolute(parseArtifactOriginFilePath(artifactOrigin), artifact + " origin location");
            if (fileCheckAbsolute.exists()) {
                return fileCheckAbsolute;
            }
        }
        return file;
    }

    public final File getArchiveFileInCache(Artifact artifact, ArtifactOrigin artifactOrigin, boolean z) {
        if (z && !ArtifactOrigin.isUnknown(artifactOrigin) && artifactOrigin.isLocal()) {
            return Checks.checkAbsolute(parseArtifactOriginFilePath(artifactOrigin), artifact + " origin location");
        }
        return new File(getRepositoryCacheRoot(), getArchivePathInCache(artifact, artifactOrigin));
    }

    public String getArchivePathInCache(Artifact artifact) {
        return IvyPatternHelper.substitute(getArtifactPattern(), artifact);
    }

    public String getArchivePathInCache(Artifact artifact, ArtifactOrigin artifactOrigin) {
        if (isOriginalMetadataArtifact(artifact)) {
            return IvyPatternHelper.substitute(getIvyPattern() + ".original", artifact, artifactOrigin);
        }
        return IvyPatternHelper.substitute(getArtifactPattern(), artifact, artifactOrigin);
    }

    public final void saveResolver(ModuleDescriptor moduleDescriptor, String str) throws IOException {
        PropertiesFile cachedDataFile = getCachedDataFile(moduleDescriptor);
        cachedDataFile.setProperty("resolver", str);
        cachedDataFile.save();
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public void saveResolvers(ModuleDescriptor moduleDescriptor, String str, String str2) {
        ModuleRevisionId resolvedModuleRevisionId = moduleDescriptor.getResolvedModuleRevisionId();
        if (!lockMetadataArtifact(resolvedModuleRevisionId)) {
            Message.error("impossible to acquire lock for " + resolvedModuleRevisionId);
            return;
        }
        try {
            PropertiesFile cachedDataFile = getCachedDataFile(moduleDescriptor);
            cachedDataFile.setProperty("resolver", str);
            cachedDataFile.setProperty("artifact.resolver", str2);
            cachedDataFile.save();
        } finally {
            unlockMetadataArtifact(resolvedModuleRevisionId);
        }
    }

    public final String getSavedResolverName(ModuleDescriptor moduleDescriptor) {
        return getCachedDataFile(moduleDescriptor).getProperty("resolver");
    }

    public final String getSavedArtResolverName(ModuleDescriptor moduleDescriptor) {
        return getCachedDataFile(moduleDescriptor).getProperty("artifact.resolver");
    }

    public void saveArtifactOrigin(Artifact artifact, ArtifactOrigin artifactOrigin) throws IOException {
        PropertiesFile cachedDataFile = getCachedDataFile(artifact.getModuleRevisionId());
        cachedDataFile.setProperty(getIsLocalKey(artifact), String.valueOf(artifactOrigin.isLocal()));
        cachedDataFile.setProperty(getLocationKey(artifact), artifactOrigin.getLocation());
        cachedDataFile.setProperty(getOriginalKey(artifact), getPrefixKey(artifactOrigin.getArtifact()));
        if (artifactOrigin.getLastChecked() != null) {
            cachedDataFile.setProperty(getLastCheckedKey(artifact), artifactOrigin.getLastChecked().toString());
        }
        cachedDataFile.setProperty(getExistsKey(artifact), Boolean.toString(artifactOrigin.isExists()));
        cachedDataFile.save();
    }

    public final void removeSavedArtifactOrigin(Artifact artifact) throws IOException {
        PropertiesFile cachedDataFile = getCachedDataFile(artifact.getModuleRevisionId());
        cachedDataFile.remove(getLocationKey(artifact));
        cachedDataFile.remove(getIsLocalKey(artifact));
        cachedDataFile.remove(getLastCheckedKey(artifact));
        cachedDataFile.remove(getOriginalKey(artifact));
        cachedDataFile.save();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        r0 = org.apache.ivy.core.module.p062id.ArtifactRevisionId.newInstance(r17.getModuleRevisionId(), r14, r15, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0158, code lost:
    
        if (r13.group(4).equals("" + r0.hashCode()) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0168, code lost:
    
        r0 = new org.apache.ivy.core.module.descriptor.DefaultArtifact(r0, r17.getPublicationDate(), new java.net.URL(r3), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
    
        org.apache.ivy.util.Message.debug(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e A[EDGE_INSN: B:59:0x016e->B:43:0x016e BREAK  A[LOOP:0: B:26:0x00ec->B:36:0x0132]] */
    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArtifactOrigin getSavedArtifactOrigin(Artifact artifact) {
        Artifact defaultArtifact;
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (!lockMetadataArtifact(moduleRevisionId)) {
            Message.error("impossible to acquire lock for " + moduleRevisionId);
            return ArtifactOrigin.unknown(artifact);
        }
        try {
            PropertiesFile cachedDataFile = getCachedDataFile(artifact.getModuleRevisionId());
            String property = cachedDataFile.getProperty(getLocationKey(artifact));
            String property2 = cachedDataFile.getProperty(getIsLocalKey(artifact));
            String property3 = cachedDataFile.getProperty(getLastCheckedKey(artifact));
            String property4 = cachedDataFile.getProperty(getExistsKey(artifact));
            String property5 = cachedDataFile.getProperty(getOriginalKey(artifact));
            boolean zBooleanValue = Boolean.valueOf(property2).booleanValue();
            if (property == null) {
                return ArtifactOrigin.unknown(artifact);
            }
            int i = 3;
            int i2 = 2;
            if (property5 != null) {
                Matcher matcher = ARTIFACT_KEY_PATTERN.matcher(property5);
                if (matcher.matches()) {
                    ArtifactRevisionId artifactRevisionIdNewInstance = ArtifactRevisionId.newInstance(artifact.getModuleRevisionId(), matcher.group(1), matcher.group(2), matcher.group(3));
                    if (matcher.group(4).equals("" + artifactRevisionIdNewInstance.hashCode())) {
                        try {
                            defaultArtifact = new DefaultArtifact(artifactRevisionIdNewInstance, artifact.getPublicationDate(), new URL(property), true);
                        } catch (MalformedURLException e) {
                            Message.debug(e);
                        }
                    } else {
                        defaultArtifact = artifact;
                    }
                }
            } else {
                if (!property.endsWith("." + artifact.getExt())) {
                    String locationKey = getLocationKey(artifact);
                    Iterator<Map.Entry<Object, Object>> it = cachedDataFile.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<Object, Object> next = it.next();
                        if (next.getValue().equals(property) && !locationKey.equals(next.getKey())) {
                            Matcher matcher2 = ARTIFACT_KEY_PATTERN.matcher((String) next.getKey());
                            if (matcher2.matches()) {
                                String strGroup = matcher2.group(1);
                                String strGroup2 = matcher2.group(i2);
                                String strGroup3 = matcher2.group(i);
                                if (strGroup2.endsWith(".original")) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i = 3;
                        i2 = 2;
                    }
                    defaultArtifact = artifact;
                }
            }
            ArtifactOrigin artifactOrigin = new ArtifactOrigin(defaultArtifact, zBooleanValue, property);
            if (property3 != null) {
                artifactOrigin.setLastChecked(Long.valueOf(property3));
            }
            if (property4 != null) {
                artifactOrigin.setExist(Boolean.valueOf(property4).booleanValue());
            }
            return artifactOrigin;
        } finally {
            unlockMetadataArtifact(moduleRevisionId);
        }
    }

    public final String getPrefixKey(Artifact artifact) {
        return String.format("artifact:%s#%s#%s#%d", artifact.getName(), artifact.getType(), artifact.getExt(), Integer.valueOf(artifact.getId().hashCode()));
    }

    public final String getLocationKey(Artifact artifact) {
        return getPrefixKey(artifact) + ".location";
    }

    public final String getIsLocalKey(Artifact artifact) {
        return getPrefixKey(artifact) + ".is-local";
    }

    public final String getLastCheckedKey(Artifact artifact) {
        return getPrefixKey(artifact) + ".lastchecked";
    }

    public final String getExistsKey(Artifact artifact) {
        return getPrefixKey(artifact) + ".exists";
    }

    public final String getOriginalKey(Artifact artifact) {
        return getPrefixKey(artifact) + ".original";
    }

    public final PropertiesFile getCachedDataFile(ModuleDescriptor moduleDescriptor) {
        return getCachedDataFile(moduleDescriptor.getResolvedModuleRevisionId());
    }

    public final PropertiesFile getCachedDataFile(ModuleRevisionId moduleRevisionId) {
        File file = new File(getRepositoryCacheRoot(), IvyPatternHelper.substitute(getDataFilePattern(), moduleRevisionId));
        assertInsideCache(file);
        return new PropertiesFile(file, "ivy cached data file for " + moduleRevisionId);
    }

    public final PropertiesFile getCachedDataFile(String str, ModuleRevisionId moduleRevisionId) {
        File file = new File(getRepositoryCacheRoot(), IvyPatternHelper.substitute(getDataFilePattern(), moduleRevisionId) + "." + str);
        assertInsideCache(file);
        return new PropertiesFile(file, "ivy cached data file for " + moduleRevisionId);
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public ResolvedModuleRevision findModuleInCache(DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions, String str) {
        if (isCheckmodified(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions)) {
            Message.verbose("don't use cache for " + moduleRevisionId + ": checkModified=true");
            return null;
        }
        if (!cacheMetadataOptions.isUseCacheOnly() && isChanging(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions)) {
            Message.verbose("don't use cache for " + moduleRevisionId + ": changing=true");
            return null;
        }
        return doFindModuleInCache(moduleRevisionId, cacheMetadataOptions, str);
    }

    public final ResolvedModuleRevision doFindModuleInCache(ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions, String str) {
        if (!lockMetadataArtifact(moduleRevisionId)) {
            Message.error("impossible to acquire lock for " + moduleRevisionId);
            return null;
        }
        try {
            if (this.settings.getVersionMatcher().isDynamic(moduleRevisionId)) {
                String resolvedRevision = getResolvedRevision(str, moduleRevisionId, cacheMetadataOptions);
                if (resolvedRevision != null) {
                    Message.verbose("found resolved revision in cache: " + moduleRevisionId + " => " + resolvedRevision);
                    unlockMetadataArtifact(moduleRevisionId);
                    moduleRevisionId = ModuleRevisionId.newInstance(moduleRevisionId, resolvedRevision);
                    if (!lockMetadataArtifact(moduleRevisionId)) {
                        Message.error("impossible to acquire lock for " + moduleRevisionId);
                        return null;
                    }
                } else {
                    unlockMetadataArtifact(moduleRevisionId);
                    return null;
                }
            }
            File ivyFileInCache = getIvyFileInCache(moduleRevisionId);
            if (ivyFileInCache.exists()) {
                try {
                    ModuleDescriptor mdFromCache = getMdFromCache(getModuleDescriptorParser(ivyFileInCache), cacheMetadataOptions, ivyFileInCache);
                    String savedResolverName = getSavedResolverName(mdFromCache);
                    String savedArtResolverName = getSavedArtResolverName(mdFromCache);
                    DependencyResolver resolver = this.settings.getResolver(savedResolverName);
                    if (resolver == null) {
                        Message.debug("\tresolver not found: " + savedResolverName + " => trying to use the one configured for " + moduleRevisionId);
                        resolver = this.settings.getResolver(mdFromCache.getResolvedModuleRevisionId());
                        if (resolver != null) {
                            Message.debug("\tconfigured resolver found for " + mdFromCache.getResolvedModuleRevisionId() + ": " + resolver.getName() + ": saving this data");
                            saveResolver(mdFromCache, resolver.getName());
                        }
                    }
                    DependencyResolver resolver2 = this.settings.getResolver(savedArtResolverName);
                    if (resolver2 == null) {
                        resolver2 = resolver;
                    }
                    if (resolver != null) {
                        Message.debug("\tfound ivy file in cache for " + moduleRevisionId + " (resolved by " + resolver.getName() + "): " + ivyFileInCache);
                        if (str != null && !str.equals(resolver.getName())) {
                            Message.debug("found module in cache but with a different resolver: discarding: " + moduleRevisionId + "; expected resolver=" + str + "; resolver=" + resolver.getName());
                        }
                        MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(mdFromCache.getMetadataArtifact());
                        metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                        metadataArtifactDownloadReport.setSearched(false);
                        metadataArtifactDownloadReport.setLocalFile(ivyFileInCache);
                        metadataArtifactDownloadReport.setSize(ivyFileInCache.length());
                        metadataArtifactDownloadReport.setArtifactOrigin(getSavedArtifactOrigin(mdFromCache.getMetadataArtifact()));
                        if (metadataArtifactDownloadReport.getArtifactOrigin().isExists()) {
                            if (metadataArtifactDownloadReport.getArtifactOrigin().isLocal() && metadataArtifactDownloadReport.getArtifactOrigin().getArtifact().getUrl() != null) {
                                metadataArtifactDownloadReport.setOriginalLocalFile(new File(metadataArtifactDownloadReport.getArtifactOrigin().getArtifact().getUrl().toURI()));
                            } else {
                                metadataArtifactDownloadReport.setOriginalLocalFile(getArchiveFileInCache(metadataArtifactDownloadReport.getArtifactOrigin().getArtifact()));
                            }
                        }
                        ResolvedModuleRevision resolvedModuleRevision = new ResolvedModuleRevision(resolver, resolver2, mdFromCache, metadataArtifactDownloadReport);
                        unlockMetadataArtifact(moduleRevisionId);
                        return resolvedModuleRevision;
                    }
                    Message.debug("\tresolver not found: " + savedResolverName + " => cannot use cached ivy file for " + moduleRevisionId);
                } catch (Exception e) {
                    Message.debug("\tproblem while parsing cached ivy file for: " + moduleRevisionId, e);
                }
            } else {
                Message.debug("\tno ivy file in cache for " + moduleRevisionId + ": tried " + ivyFileInCache);
            }
            unlockMetadataArtifact(moduleRevisionId);
            return null;
        } catch (Throwable th) {
            unlockMetadataArtifact(moduleRevisionId);
            throw th;
        }
    }

    public ModuleDescriptorParser getModuleDescriptorParser(File file) {
        return XmlModuleDescriptorParser.getInstance();
    }

    public class MyModuleDescriptorProvider implements ModuleDescriptorProvider {
        public final ModuleDescriptorParser mdParser;
        public final ParserSettings settings;

        public MyModuleDescriptorProvider(ModuleDescriptorParser moduleDescriptorParser, ParserSettings parserSettings) {
            this.mdParser = moduleDescriptorParser;
            this.settings = parserSettings;
        }

        @Override // org.apache.ivy.core.cache.ModuleDescriptorProvider
        public ModuleDescriptor provideModule(ParserSettings parserSettings, File file, boolean z) throws IOException, ParseException {
            return this.mdParser.parseDescriptor(this.settings, file.toURI().toURL(), z);
        }
    }

    public final ModuleDescriptor getMdFromCache(ModuleDescriptorParser moduleDescriptorParser, CacheMetadataOptions cacheMetadataOptions, File file) throws IOException, ParseException {
        return getMemoryCache().get(file, this.settings, cacheMetadataOptions.isValidate(), new MyModuleDescriptorProvider(moduleDescriptorParser, this.settings));
    }

    public final ModuleDescriptor getStaledMd(ModuleDescriptorParser moduleDescriptorParser, CacheMetadataOptions cacheMetadataOptions, File file, ParserSettings parserSettings) throws IOException, ParseException {
        return getMemoryCache().getStale(file, this.settings, cacheMetadataOptions.isValidate(), new MyModuleDescriptorProvider(moduleDescriptorParser, parserSettings));
    }

    public final String getResolvedRevision(String str, ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions) {
        if (!lockMetadataArtifact(moduleRevisionId)) {
            Message.error("impossible to acquire lock for " + moduleRevisionId);
            return null;
        }
        try {
            if (cacheMetadataOptions.isForce()) {
                Message.verbose("refresh mode: no check for cached resolved revision for " + moduleRevisionId);
                return null;
            }
            PropertiesFile cachedDataFile = str != null ? getCachedDataFile(str, moduleRevisionId) : getCachedDataFile(moduleRevisionId);
            String property = cachedDataFile.getProperty("resolved.revision");
            if (property == null) {
                Message.verbose(getName() + ": no cached resolved revision for " + moduleRevisionId);
                return null;
            }
            String property2 = cachedDataFile.getProperty("resolved.time");
            if (property2 == null) {
                Message.verbose(getName() + ": inconsistent or old cache: no cached resolved time for " + moduleRevisionId);
                saveResolvedRevision(str, moduleRevisionId, property);
                return property;
            }
            if (cacheMetadataOptions.isCheckTTL()) {
                long j = Long.parseLong(property2) + getTTL(moduleRevisionId);
                if (j > 0 && System.currentTimeMillis() > j) {
                    Message.verbose(getName() + ": cached resolved revision expired for " + moduleRevisionId);
                    return null;
                }
            }
            return property;
        } finally {
            unlockMetadataArtifact(moduleRevisionId);
        }
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    @Deprecated
    public void saveResolvedRevision(ModuleRevisionId moduleRevisionId, String str) {
        saveResolvedRevision(null, moduleRevisionId, str);
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public void saveResolvedRevision(String str, ModuleRevisionId moduleRevisionId, String str2) {
        PropertiesFile cachedDataFile;
        if (!lockMetadataArtifact(moduleRevisionId)) {
            Message.error("impossible to acquire lock for " + moduleRevisionId);
            return;
        }
        try {
            if (str == null) {
                cachedDataFile = getCachedDataFile(moduleRevisionId);
            } else {
                cachedDataFile = getCachedDataFile(str, moduleRevisionId);
            }
            cachedDataFile.setProperty("resolved.time", String.valueOf(System.currentTimeMillis()));
            cachedDataFile.setProperty("resolved.revision", str2);
            if (str != null) {
                cachedDataFile.setProperty("resolver", str);
            }
            cachedDataFile.save();
            unlockMetadataArtifact(moduleRevisionId);
        } catch (Throwable th) {
            unlockMetadataArtifact(moduleRevisionId);
            throw th;
        }
    }

    public long getTTL(ModuleRevisionId moduleRevisionId) {
        Long rule = this.ttlRules.getRule(moduleRevisionId);
        return rule == null ? getDefaultTTL() : rule.longValue();
    }

    public String toString() {
        return this.name;
    }

    public File getRepositoryCacheRoot() {
        return getBasedir();
    }

    public LockStrategy getLockStrategy() {
        if (this.lockStrategy == null) {
            String str = this.lockStrategyName;
            if (str != null) {
                this.lockStrategy = this.settings.getLockStrategy(str);
            } else {
                this.lockStrategy = this.settings.getDefaultLockStrategy();
            }
        }
        return this.lockStrategy;
    }

    public void setLockStrategy(LockStrategy lockStrategy) {
        this.lockStrategy = lockStrategy;
    }

    public void setLockStrategy(String str) {
        this.lockStrategyName = str;
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public ArtifactDownloadReport download(Artifact artifact, ArtifactResourceResolver artifactResourceResolver, ResourceDownloader resourceDownloader, CacheDownloadOptions cacheDownloadOptions) {
        ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(artifact);
        boolean zIsUseOrigin = isUseOrigin();
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (!lockMetadataArtifact(moduleRevisionId)) {
            artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
            artifactDownloadReport.setDownloadDetails("impossible to get lock for " + moduleRevisionId);
            return artifactDownloadReport;
        }
        try {
            DownloadListener listener = cacheDownloadOptions.getListener();
            if (listener != null) {
                listener.needArtifact(this, artifact);
            }
            ArtifactOrigin savedArtifactOrigin = getSavedArtifactOrigin(artifact);
            File archiveFileInCache = getArchiveFileInCache(artifact, savedArtifactOrigin, zIsUseOrigin);
            if (archiveFileInCache.exists() && !cacheDownloadOptions.isForce()) {
                artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                artifactDownloadReport.setSize(archiveFileInCache.length());
                artifactDownloadReport.setArtifactOrigin(savedArtifactOrigin);
                artifactDownloadReport.setLocalFile(archiveFileInCache);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    ResolvedResource resolvedResourceResolve = artifactResourceResolver.resolve(artifact);
                    if (resolvedResourceResolve != null) {
                        Resource resource = resolvedResourceResolve.getResource();
                        ArtifactOrigin artifactOrigin = new ArtifactOrigin(artifact, resource.isLocal(), resource.getName());
                        if (zIsUseOrigin && resource.isLocal()) {
                            if (resource instanceof LocalizableResource) {
                                artifactOrigin.setLocation(((LocalizableResource) resource).getFile().getAbsolutePath());
                            }
                            saveArtifactOrigin(artifact, artifactOrigin);
                            archiveFileInCache = getArchiveFileInCache(artifact, artifactOrigin);
                            artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                            artifactDownloadReport.setSize(archiveFileInCache.length());
                            artifactDownloadReport.setArtifactOrigin(artifactOrigin);
                            artifactDownloadReport.setLocalFile(archiveFileInCache);
                        } else {
                            archiveFileInCache = getArchiveFileInCache(artifact, artifactOrigin, zIsUseOrigin);
                            if (ResourceHelper.equals(resource, archiveFileInCache)) {
                                throw new IllegalStateException("invalid settings for '" + artifactResourceResolver + "': pointing repository to ivy cache is forbidden !");
                            }
                            assertInsideCache(archiveFileInCache);
                            if (listener != null) {
                                listener.startArtifactDownload(this, resolvedResourceResolve, artifact, artifactOrigin);
                            }
                            resourceDownloader.download(artifact, resource, archiveFileInCache);
                            artifactDownloadReport.setSize(archiveFileInCache.length());
                            saveArtifactOrigin(artifact, artifactOrigin);
                            artifactDownloadReport.setDownloadTimeMillis(System.currentTimeMillis() - jCurrentTimeMillis);
                            artifactDownloadReport.setDownloadStatus(DownloadStatus.SUCCESSFUL);
                            artifactDownloadReport.setArtifactOrigin(artifactOrigin);
                            artifactDownloadReport.setLocalFile(archiveFileInCache);
                        }
                    } else {
                        artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
                        artifactDownloadReport.setDownloadDetails(ArtifactDownloadReport.MISSING_ARTIFACT);
                        artifactDownloadReport.setDownloadTimeMillis(System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } catch (Exception e) {
                    Message.debug(e);
                    artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
                    artifactDownloadReport.setDownloadDetails(e.getMessage());
                    artifactDownloadReport.setDownloadTimeMillis(System.currentTimeMillis() - jCurrentTimeMillis);
                }
            }
            if (artifactDownloadReport.getDownloadStatus() != DownloadStatus.FAILED) {
                unpackArtifact(artifact, artifactDownloadReport, cacheDownloadOptions);
            }
            if (listener != null) {
                listener.endArtifactDownload(this, artifact, artifactDownloadReport, archiveFileInCache);
            }
            unlockMetadataArtifact(moduleRevisionId);
            return artifactDownloadReport;
        } catch (Throwable th) {
            unlockMetadataArtifact(moduleRevisionId);
            throw th;
        }
    }

    public final void unpackArtifact(Artifact artifact, ArtifactDownloadReport artifactDownloadReport, CacheDownloadOptions cacheDownloadOptions) throws Throwable {
        Artifact unpackedArtifact = this.packagingManager.getUnpackedArtifact(artifact);
        if (unpackedArtifact == null) {
            return;
        }
        File archiveFileInCache = getArchiveFileInCache(unpackedArtifact, null, false);
        if (archiveFileInCache.exists() && !cacheDownloadOptions.isForce()) {
            artifactDownloadReport.setUnpackedLocalFile(archiveFileInCache);
            artifactDownloadReport.setUnpackedArtifact(unpackedArtifact);
            return;
        }
        Message.info("\tUnpacking " + artifact.getId());
        try {
            Artifact artifactUnpackArtifact = this.packagingManager.unpackArtifact(artifact, artifactDownloadReport.getLocalFile(), archiveFileInCache);
            artifactDownloadReport.setUnpackedLocalFile(archiveFileInCache);
            artifactDownloadReport.setUnpackedArtifact(artifactUnpackArtifact);
        } catch (Exception e) {
            Message.debug(e);
            artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
            artifactDownloadReport.setDownloadDetails("The packed artifact " + artifact.getId() + " could not be unpacked (" + e.getMessage() + ")");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:42|3|(1:5)|8|(5:10|(2:12|(1:14)(1:15))|(1:37)|38|39)(1:16)|17|43|18|(5:(1:26)|27|(1:29)|30|(1:32)(2:33|34))(1:22)|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        org.apache.ivy.util.Message.debug(r0);
        r13.setExist(false);
        saveArtifactOrigin(r14, r13);
        r9.setDownloadStatus(org.apache.ivy.core.report.DownloadStatus.FAILED);
        r9.setDownloadDetails(r0.getMessage());
        r9.setDownloadTimeMillis(java.lang.System.currentTimeMillis() - r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0027, B:5:0x002d, B:8:0x0034, B:10:0x004f, B:12:0x0063, B:14:0x0069, B:37:0x0160, B:15:0x0080, B:17:0x008d, B:18:0x0098, B:20:0x00a5, B:22:0x00ab, B:26:0x00cb, B:27:0x00ce, B:29:0x00d7, B:30:0x00da, B:32:0x0103, B:33:0x0121, B:34:0x013f, B:35:0x0140), top: B:42:0x0027, inners: #1 }] */
    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArtifactDownloadReport downloadRepositoryResource(Resource resource, String str, String str2, String str3, CacheResourceOptions cacheResourceOptions, Repository repository) {
        DefaultArtifact defaultArtifact;
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance("_repository_metadata_", computeResourceNameHash(resource), Ivy.getWorkingRevision());
        DefaultArtifact defaultArtifact2 = new DefaultArtifact(moduleRevisionIdNewInstance, null, str, str2, str3);
        ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(defaultArtifact2);
        boolean zIsUseOrigin = isUseOrigin();
        try {
            DownloadListener listener = cacheResourceOptions.getListener();
            if (listener != null) {
                listener.needArtifact(this, defaultArtifact2);
            }
            ArtifactOrigin savedArtifactOrigin = getSavedArtifactOrigin(defaultArtifact2);
            File archiveFileInCache = getArchiveFileInCache(defaultArtifact2, savedArtifactOrigin, zIsUseOrigin);
            ArtifactOrigin artifactOrigin = new ArtifactOrigin(defaultArtifact2, resource.isLocal(), resource.getName());
            if (!cacheResourceOptions.isForce()) {
                defaultArtifact = defaultArtifact2;
                if (checkCacheUptodate(archiveFileInCache, resource, savedArtifactOrigin, artifactOrigin, cacheResourceOptions.getTtl())) {
                    if (archiveFileInCache.exists()) {
                        saveArtifactOrigin(defaultArtifact, artifactOrigin);
                        artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                        artifactDownloadReport.setSize(archiveFileInCache.length());
                        artifactDownloadReport.setArtifactOrigin(savedArtifactOrigin);
                        artifactDownloadReport.setLocalFile(archiveFileInCache);
                    } else {
                        artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
                        artifactDownloadReport.setDownloadDetails("Remote resource is known to not exist");
                    }
                }
                if (listener != null) {
                    listener.endArtifactDownload(this, defaultArtifact, artifactDownloadReport, archiveFileInCache);
                }
                unlockMetadataArtifact(moduleRevisionIdNewInstance);
                return artifactDownloadReport;
            }
            defaultArtifact = defaultArtifact2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            artifactOrigin.setLastChecked(Long.valueOf(jCurrentTimeMillis));
            ResolvedResource resolvedResource = new ResolvedResource(resource, Ivy.getWorkingRevision());
            if (zIsUseOrigin && resource.isLocal()) {
                saveArtifactOrigin(defaultArtifact, artifactOrigin);
                archiveFileInCache = getArchiveFileInCache(defaultArtifact, artifactOrigin);
                artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                artifactDownloadReport.setSize(archiveFileInCache.length());
                artifactDownloadReport.setArtifactOrigin(artifactOrigin);
                artifactDownloadReport.setLocalFile(archiveFileInCache);
            } else {
                if (listener != null) {
                    listener.startArtifactDownload(this, resolvedResource, defaultArtifact, artifactOrigin);
                }
                assertInsideCache(archiveFileInCache);
                if (archiveFileInCache.exists()) {
                    archiveFileInCache.delete();
                }
                File file = new File(archiveFileInCache.getAbsolutePath() + FileSystemResolver.TRANSACTION_DESTINATION_SUFFIX);
                repository.get(resource.getName(), file);
                if (!file.renameTo(archiveFileInCache)) {
                    throw new IOException("impossible to move part file to definitive one: " + file + " -> " + archiveFileInCache);
                }
                artifactDownloadReport.setSize(archiveFileInCache.length());
                saveArtifactOrigin(defaultArtifact, artifactOrigin);
                artifactDownloadReport.setDownloadTimeMillis(System.currentTimeMillis() - jCurrentTimeMillis);
                artifactDownloadReport.setDownloadStatus(DownloadStatus.SUCCESSFUL);
                artifactDownloadReport.setArtifactOrigin(artifactOrigin);
                artifactDownloadReport.setLocalFile(archiveFileInCache);
            }
            if (listener != null) {
            }
            unlockMetadataArtifact(moduleRevisionIdNewInstance);
            return artifactDownloadReport;
        } catch (Throwable th) {
            unlockMetadataArtifact(moduleRevisionIdNewInstance);
            throw th;
        }
    }

    public final String computeResourceNameHash(Resource resource) {
        return HexEncoder.encode(SHA_DIGEST.digest(resource.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public final boolean checkCacheUptodate(File file, Resource resource, ArtifactOrigin artifactOrigin, ArtifactOrigin artifactOrigin2, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (artifactOrigin.getLastChecked() != null && jCurrentTimeMillis - artifactOrigin.getLastChecked().longValue() < j) {
            return file.exists() || !artifactOrigin.isExists();
        }
        if (!file.exists()) {
            return false;
        }
        artifactOrigin2.setLastChecked(Long.valueOf(jCurrentTimeMillis));
        return file.lastModified() >= resource.getLastModified();
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public void originalToCachedModuleDescriptor(DependencyResolver dependencyResolver, ResolvedResource resolvedResource, Artifact artifact, ResolvedModuleRevision resolvedModuleRevision, ModuleDescriptorWriter moduleDescriptorWriter) {
        String strValueOf;
        ModuleDescriptor descriptor = resolvedModuleRevision.getDescriptor();
        Artifact originalMetadataArtifact = getOriginalMetadataArtifact(artifact);
        File ivyFileInCache = getIvyFileInCache(descriptor.getResolvedModuleRevisionId());
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        try {
            if (!lockMetadataArtifact(moduleRevisionId)) {
                Message.warn("impossible to acquire lock for: " + moduleRevisionId);
                return;
            }
            try {
                File archiveFileInCache = getArchiveFileInCache(originalMetadataArtifact);
                moduleDescriptorWriter.write(resolvedResource, descriptor, archiveFileInCache, ivyFileInCache);
                getMemoryCache().putInCache(ivyFileInCache, new ParserSettingsMonitor(this.settings), true, descriptor);
                saveResolvers(descriptor, dependencyResolver.getName(), dependencyResolver.getName());
                if (!descriptor.isDefault()) {
                    resolvedModuleRevision.getReport().setOriginalLocalFile(archiveFileInCache);
                }
                resolvedModuleRevision.getReport().setLocalFile(ivyFileInCache);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                if (resolvedResource == null) {
                    strValueOf = String.valueOf(descriptor.getResolvedModuleRevisionId());
                } else {
                    strValueOf = String.valueOf(resolvedResource);
                }
                Message.warn("impossible to put metadata file in cache: " + strValueOf, e2);
            }
            unlockMetadataArtifact(moduleRevisionId);
        } catch (Throwable th) {
            unlockMetadataArtifact(moduleRevisionId);
            throw th;
        }
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public ResolvedModuleRevision cacheModuleDescriptor(DependencyResolver dependencyResolver, final ResolvedResource resolvedResource, DependencyDescriptor dependencyDescriptor, Artifact artifact, ResourceDownloader resourceDownloader, CacheMetadataOptions cacheMetadataOptions) throws ParseException {
        Date resolvedPublicationDate;
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (!lockMetadataArtifact(moduleRevisionId)) {
            Message.error("impossible to acquire lock for " + moduleRevisionId);
            return null;
        }
        BackupResourceDownloader backupResourceDownloader = new BackupResourceDownloader(resourceDownloader);
        try {
            if (!artifact.isMetadata()) {
                if (isChanging(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions)) {
                    long lastModified = resolvedResource.getLastModified();
                    Artifact artifactTransform = NameSpaceHelper.transform(artifact, cacheMetadataOptions.getNamespace().getToSystemTransformer());
                    File archiveFileInCache = getArchiveFileInCache(artifactTransform, getSavedArtifactOrigin(artifactTransform), false);
                    if (archiveFileInCache.exists() && lastModified > archiveFileInCache.lastModified()) {
                        Message.verbose(moduleRevisionId + " has changed: deleting old artifacts");
                        Message.debug("deleting " + archiveFileInCache);
                        if (!archiveFileInCache.delete()) {
                            Message.error("Couldn't delete outdated artifact from cache: " + archiveFileInCache);
                            return null;
                        }
                        removeSavedArtifactOrigin(artifactTransform);
                    }
                }
                return null;
            }
            ResolvedModuleRevision resolvedModuleRevisionDoFindModuleInCache = doFindModuleInCache(moduleRevisionId, cacheMetadataOptions, null);
            if (resolvedModuleRevisionDoFindModuleInCache != null) {
                if (!resolvedModuleRevisionDoFindModuleInCache.getDescriptor().isDefault() || resolvedModuleRevisionDoFindModuleInCache.getResolver() == dependencyResolver) {
                    if (isCheckmodified(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions) || isChanging(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions)) {
                        long lastModified2 = resolvedResource.getLastModified();
                        long lastModified3 = resolvedModuleRevisionDoFindModuleInCache.getDescriptor().getLastModified();
                        if (resolvedModuleRevisionDoFindModuleInCache.getDescriptor().isDefault() || lastModified2 > lastModified3) {
                            Message.verbose("\t" + getName() + ": revision in cache is not up to date: " + moduleRevisionId);
                            resolvedPublicationDate = isChanging(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions) ? resolvedModuleRevisionDoFindModuleInCache.getDescriptor().getResolvedPublicationDate() : null;
                        } else {
                            Message.verbose("\t" + getName() + ": revision in cache (not updated): " + moduleRevisionId);
                            resolvedModuleRevisionDoFindModuleInCache.getReport().setSearched(true);
                        }
                    } else {
                        Message.verbose("\t" + getName() + ": revision in cache: " + moduleRevisionId);
                        resolvedModuleRevisionDoFindModuleInCache.getReport().setSearched(true);
                    }
                    return resolvedModuleRevisionDoFindModuleInCache;
                }
                Message.verbose("\t" + getName() + ": found revision in cache: " + moduleRevisionId + " (resolved by " + resolvedModuleRevisionDoFindModuleInCache.getResolver().getName() + "): but it's a default one, maybe we can find a better one");
            }
            ArtifactDownloadReport artifactDownloadReportDownload = download(getOriginalMetadataArtifact(artifact), new ArtifactResourceResolver() { // from class: org.apache.ivy.core.cache.DefaultRepositoryCacheManager.1
                @Override // org.apache.ivy.plugins.repository.ArtifactResourceResolver
                public ResolvedResource resolve(Artifact artifact2) {
                    return resolvedResource;
                }
            }, backupResourceDownloader, new CacheDownloadOptions().setListener(cacheMetadataOptions.getListener()).setForce(true));
            Message.verbose("\t" + artifactDownloadReportDownload);
            if (artifactDownloadReportDownload.getDownloadStatus() == DownloadStatus.FAILED) {
                Message.warn("problem while downloading module descriptor: " + resolvedResource.getResource() + ": " + artifactDownloadReportDownload.getDownloadDetails() + " (" + artifactDownloadReportDownload.getDownloadTimeMillis() + "ms)");
            } else {
                try {
                    ModuleDescriptorParser parser = ModuleDescriptorParserRegistry.getInstance().getParser(resolvedResource.getResource());
                    ParserSettings parserSettings = this.settings;
                    if (dependencyResolver instanceof AbstractResolver) {
                        parserSettings = ((AbstractResolver) dependencyResolver).getParserSettings();
                    }
                    ModuleDescriptor staledMd = getStaledMd(parser, cacheMetadataOptions, artifactDownloadReportDownload.getLocalFile(), parserSettings);
                    if (staledMd == null) {
                        throw new IllegalStateException("module descriptor parser returned a null module descriptor, which is not allowed. parser=" + parser + "; parser class=" + parser.getClass().getName() + "; module descriptor resource=" + resolvedResource.getResource());
                    }
                    Message.debug("\t" + getName() + ": parsed downloaded md file for " + moduleRevisionId + "; parsed=" + staledMd.getModuleRevisionId());
                    if (resolvedPublicationDate != null && !resolvedPublicationDate.equals(staledMd.getResolvedPublicationDate())) {
                        Message.verbose(moduleRevisionId + " has changed: deleting old artifacts");
                        String[] configurationsNames = staledMd.getConfigurationsNames();
                        int length = configurationsNames.length;
                        for (int i = 0; i < length; i++) {
                            Artifact[] artifacts = staledMd.getArtifacts(configurationsNames[i]);
                            int length2 = artifacts.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                String[] strArr = configurationsNames;
                                int i3 = length;
                                Artifact artifactTransform2 = NameSpaceHelper.transform(artifacts[i2], cacheMetadataOptions.getNamespace().getToSystemTransformer());
                                Artifact[] artifactArr = artifacts;
                                File archiveFileInCache2 = getArchiveFileInCache(artifactTransform2, getSavedArtifactOrigin(artifactTransform2), false);
                                if (archiveFileInCache2.exists()) {
                                    Message.debug("deleting " + archiveFileInCache2);
                                    if (!archiveFileInCache2.delete()) {
                                        backupResourceDownloader.restore();
                                        Message.error("Couldn't delete outdated artifact from cache: " + archiveFileInCache2);
                                    }
                                }
                                removeSavedArtifactOrigin(artifactTransform2);
                                i2++;
                                configurationsNames = strArr;
                                length = i3;
                                artifacts = artifactArr;
                            }
                        }
                    } else if (isChanging(dependencyDescriptor, moduleRevisionId, cacheMetadataOptions)) {
                        Message.verbose(moduleRevisionId + " is changing, but has not changed: will trust cached artifacts if any");
                    }
                    MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(staledMd.getMetadataArtifact());
                    metadataArtifactDownloadReport.setSearched(true);
                    metadataArtifactDownloadReport.setDownloadStatus(artifactDownloadReportDownload.getDownloadStatus());
                    metadataArtifactDownloadReport.setDownloadDetails(artifactDownloadReportDownload.getDownloadDetails());
                    metadataArtifactDownloadReport.setArtifactOrigin(artifactDownloadReportDownload.getArtifactOrigin());
                    metadataArtifactDownloadReport.setDownloadTimeMillis(artifactDownloadReportDownload.getDownloadTimeMillis());
                    metadataArtifactDownloadReport.setOriginalLocalFile(artifactDownloadReportDownload.getLocalFile());
                    metadataArtifactDownloadReport.setSize(artifactDownloadReportDownload.getSize());
                    saveArtifactOrigin(NameSpaceHelper.transform(staledMd.getMetadataArtifact(), cacheMetadataOptions.getNamespace().getToSystemTransformer()), artifactDownloadReportDownload.getArtifactOrigin());
                    return new ResolvedModuleRevision(dependencyResolver, dependencyResolver, staledMd, metadataArtifactDownloadReport);
                } catch (IOException e) {
                    Message.warn("io problem while parsing ivy file: " + resolvedResource.getResource(), e);
                }
            }
            unlockMetadataArtifact(moduleRevisionId);
            backupResourceDownloader.cleanUp();
            return null;
        } finally {
            unlockMetadataArtifact(moduleRevisionId);
            backupResourceDownloader.cleanUp();
        }
    }

    public final boolean lockMetadataArtifact(ModuleRevisionId moduleRevisionId) {
        Artifact defaultMetadataArtifact = getDefaultMetadataArtifact(moduleRevisionId);
        try {
            return getLockStrategy().lockArtifact(defaultMetadataArtifact, getArchiveFileInCache(defaultMetadataArtifact, getDefaultMetadataArtifactOrigin(moduleRevisionId)));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("operation interrupted");
        }
    }

    public final void unlockMetadataArtifact(ModuleRevisionId moduleRevisionId) {
        Artifact defaultMetadataArtifact = getDefaultMetadataArtifact(moduleRevisionId);
        getLockStrategy().unlockArtifact(defaultMetadataArtifact, getArchiveFileInCache(defaultMetadataArtifact, getDefaultMetadataArtifactOrigin(moduleRevisionId)));
    }

    public final ArtifactOrigin getDefaultMetadataArtifactOrigin(ModuleRevisionId moduleRevisionId) {
        try {
            return new ArtifactOrigin(DefaultArtifact.newIvyArtifact(moduleRevisionId, null), false, getIvyFileInCache(moduleRevisionId).toURI().toURL().toExternalForm());
        } catch (MalformedURLException unused) {
            throw new RuntimeException("Failed to determine artifact origin for " + moduleRevisionId);
        }
    }

    public final Artifact getDefaultMetadataArtifact(ModuleRevisionId moduleRevisionId) {
        return new DefaultArtifact(moduleRevisionId, new Date(), "metadata", "metadata", ClientConfigurationFields.IVY, true);
    }

    public Artifact getOriginalMetadataArtifact(Artifact artifact) {
        return DefaultArtifact.cloneWithAnotherType(artifact, artifact.getType() + ".original");
    }

    public final boolean isOriginalMetadataArtifact(Artifact artifact) {
        return artifact.isMetadata() && artifact.getType().endsWith(".original");
    }

    public final boolean isChanging(DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions) {
        return dependencyDescriptor.isChanging() || getChangingMatcher(cacheMetadataOptions).matches(moduleRevisionId.getRevision());
    }

    public final org.apache.ivy.plugins.matcher.Matcher getChangingMatcher(CacheMetadataOptions cacheMetadataOptions) {
        String changingPattern = cacheMetadataOptions.getChangingPattern() != null ? cacheMetadataOptions.getChangingPattern() : this.changingPattern;
        if (changingPattern == null) {
            return NoMatcher.INSTANCE;
        }
        String changingMatcherName = cacheMetadataOptions.getChangingMatcherName() != null ? cacheMetadataOptions.getChangingMatcherName() : this.changingMatcherName;
        PatternMatcher matcher = this.settings.getMatcher(changingMatcherName);
        if (matcher == null) {
            throw new IllegalStateException("unknown matcher '" + changingMatcherName + "'. It is set as changing matcher in " + this);
        }
        return matcher.getMatcher(changingPattern);
    }

    public final boolean isCheckmodified(DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions) {
        return cacheMetadataOptions.isCheckmodified() == null ? isCheckmodified() : cacheMetadataOptions.isCheckmodified().booleanValue();
    }

    @Override // org.apache.ivy.core.cache.RepositoryCacheManager
    public void clean() {
        FileUtil.forceDelete(getBasedir());
    }

    public void dumpSettings() {
        Message.verbose("\t" + getName());
        Message.debug("\t\tivyPattern: " + getIvyPattern());
        Message.debug("\t\tartifactPattern: " + getArtifactPattern());
        Message.debug("\t\tlockingStrategy: " + getLockStrategy().getName());
        Message.debug("\t\tchangingPattern: " + getChangingPattern());
        Message.debug("\t\tchangingMatcher: " + getChangingMatcherName());
    }

    public final void assertInsideCache(File file) {
        File repositoryCacheRoot = getRepositoryCacheRoot();
        if (repositoryCacheRoot == null || FileUtil.isLeadingPath(repositoryCacheRoot, file)) {
            return;
        }
        throw new IllegalArgumentException(file + " is outside of the cache");
    }

    public static String parseArtifactOriginFilePath(ArtifactOrigin artifactOrigin) {
        if (artifactOrigin == null || artifactOrigin.getLocation() == null) {
            return null;
        }
        String location = artifactOrigin.getLocation();
        if (!location.startsWith("file:")) {
            return location;
        }
        try {
            URI uri = new URI(location);
            return (uri.isAbsolute() && uri.getScheme().equals(PomReader.PomProfileElement.FILE)) ? uri.getPath() : location;
        } catch (URISyntaxException unused) {
            return location;
        }
    }

    public final class BackupResourceDownloader implements ResourceDownloader {
        public File backup;
        public ResourceDownloader delegate;
        public String originalPath;

        public BackupResourceDownloader(ResourceDownloader resourceDownloader) {
            this.delegate = resourceDownloader;
        }

        @Override // org.apache.ivy.plugins.repository.ResourceDownloader
        public void download(Artifact artifact, Resource resource, File file) throws IOException {
            if (file.exists()) {
                this.originalPath = file.getAbsolutePath();
                File file2 = new File(file.getAbsolutePath() + ".backup");
                this.backup = file2;
                FileUtil.copy(file, file2, (CopyProgressListener) null, true);
            }
            this.delegate.download(artifact, resource, file);
        }

        public void restore() throws IOException {
            File file = this.backup;
            if (file == null || !file.exists()) {
                return;
            }
            FileUtil.copy(this.backup, new File(this.originalPath), (CopyProgressListener) null, true);
            this.backup.delete();
        }

        public void cleanUp() {
            File file = this.backup;
            if (file == null || !file.exists()) {
                return;
            }
            this.backup.delete();
        }
    }

    public static final class ConfiguredTTL {
        public static final Set<String> attributesNotContributingToMatching;
        public final Map<String, String> attributes;
        public final long duration;
        public final String matcher;

        static {
            HashSet hashSet = new HashSet();
            attributesNotContributingToMatching = hashSet;
            hashSet.add("duration");
            hashSet.add("matcher");
        }

        public ConfiguredTTL(long j, String str, Map<String, String> map) {
            this.matcher = str;
            this.duration = j;
            if (map == null) {
                this.attributes = Collections.emptyMap();
                return;
            }
            HashMap map2 = new HashMap(map);
            Iterator<String> it = attributesNotContributingToMatching.iterator();
            while (it.hasNext()) {
                map2.remove(it.next());
            }
            this.attributes = Collections.unmodifiableMap(map2);
        }
    }
}
