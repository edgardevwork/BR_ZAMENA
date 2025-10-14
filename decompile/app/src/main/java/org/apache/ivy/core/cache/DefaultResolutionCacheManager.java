package org.apache.ivy.core.cache;

import androidx.appcompat.widget.ActivityChooserModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Map;
import java.util.Properties;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.RelativeUrlResolver;
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.FileUtil;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public class DefaultResolutionCacheManager implements ResolutionCacheManager, IvySettingsAware {
    public static final String DEFAULT_CACHE_RESOLVED_IVY_PATTERN = "resolved-[organisation]-[module]-[revision].xml";
    public static final String DEFAULT_CACHE_RESOLVED_IVY_PROPERTIES_PATTERN = "resolved-[organisation]-[module]-[revision].properties";
    public File basedir;
    public IvySettings settings;
    public String resolvedIvyPattern = DEFAULT_CACHE_RESOLVED_IVY_PATTERN;
    public String resolvedIvyPropertiesPattern = DEFAULT_CACHE_RESOLVED_IVY_PROPERTIES_PATTERN;
    public String name = "resolution-cache";

    public DefaultResolutionCacheManager() {
    }

    public DefaultResolutionCacheManager(File file) {
        setBasedir(file);
    }

    @Override // org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        this.settings = ivySettings;
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public File getResolutionCacheRoot() {
        if (this.basedir == null) {
            IvySettings ivySettings = this.settings;
            if (ivySettings == null) {
                throw new IllegalStateException("The 'basedir' or 'IvySettings' has not been set on the ResolutionCacheManager");
            }
            this.basedir = ivySettings.getDefaultResolutionCacheBasedir();
        }
        return this.basedir;
    }

    public File getBasedir() {
        return this.basedir;
    }

    public void setBasedir(File file) {
        this.basedir = file;
    }

    public String getResolvedIvyPattern() {
        return this.resolvedIvyPattern;
    }

    public void setResolvedIvyPattern(String str) {
        this.resolvedIvyPattern = str;
    }

    public String getResolvedIvyPropertiesPattern() {
        return this.resolvedIvyPropertiesPattern;
    }

    public void setResolvedIvyPropertiesPattern(String str) {
        this.resolvedIvyPropertiesPattern = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public File getResolvedIvyFileInCache(ModuleRevisionId moduleRevisionId) {
        return new File(getResolutionCacheRoot(), IvyPatternHelper.substitute(getResolvedIvyPattern(), moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getRevision(), ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml"));
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public File getResolvedIvyPropertiesInCache(ModuleRevisionId moduleRevisionId) {
        return new File(getResolutionCacheRoot(), IvyPatternHelper.substitute(getResolvedIvyPropertiesPattern(), moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getRevision(), ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml"));
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public File getConfigurationResolveReportInCache(String str, String str2) {
        return new File(getResolutionCacheRoot(), str + "-" + str2 + ActivityChooserModel.HISTORY_FILE_EXTENSION);
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public File[] getConfigurationResolveReportsInCache(String str) {
        final String str2 = str + "-";
        return getResolutionCacheRoot().listFiles(new FilenameFilter() { // from class: org.apache.ivy.core.cache.DefaultResolutionCacheManager.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str3) {
                return str3.startsWith(str2) && str3.endsWith(ActivityChooserModel.HISTORY_FILE_EXTENSION);
            }
        });
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public ModuleDescriptor getResolvedModuleDescriptor(ModuleRevisionId moduleRevisionId) throws IOException, ParseException {
        File resolvedIvyFileInCache = getResolvedIvyFileInCache(moduleRevisionId);
        if (!resolvedIvyFileInCache.exists()) {
            throw new IllegalStateException("Ivy file not found in cache for " + moduleRevisionId + "!");
        }
        Properties properties = new Properties();
        File resolvedIvyPropertiesInCache = getResolvedIvyPropertiesInCache(ModuleRevisionId.newInstance(moduleRevisionId, moduleRevisionId.getRevision() + "-parents"));
        if (resolvedIvyPropertiesInCache.exists()) {
            FileInputStream fileInputStream = new FileInputStream(resolvedIvyPropertiesInCache);
            properties.load(fileInputStream);
            fileInputStream.close();
        }
        return getModuleDescriptorParser(resolvedIvyFileInCache).parseDescriptor(new CacheParserSettings(this.settings, properties), resolvedIvyFileInCache.toURI().toURL(), false);
    }

    public ModuleDescriptorParser getModuleDescriptorParser(File file) {
        return XmlModuleDescriptorParser.getInstance();
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public void saveResolvedModuleDescriptor(ModuleDescriptor moduleDescriptor) throws IOException, ParseException {
        ModuleRevisionId resolvedModuleRevisionId = moduleDescriptor.getResolvedModuleRevisionId();
        File resolvedIvyFileInCache = getResolvedIvyFileInCache(resolvedModuleRevisionId);
        assertInsideCache(resolvedIvyFileInCache);
        moduleDescriptor.toIvyFile(resolvedIvyFileInCache);
        Properties properties = new Properties();
        saveLocalParents(resolvedModuleRevisionId, moduleDescriptor, resolvedIvyFileInCache, properties);
        if (properties.isEmpty()) {
            return;
        }
        File resolvedIvyPropertiesInCache = getResolvedIvyPropertiesInCache(ModuleRevisionId.newInstance(resolvedModuleRevisionId, resolvedModuleRevisionId.getRevision() + "-parents"));
        assertInsideCache(resolvedIvyPropertiesInCache);
        FileOutputStream fileOutputStream = new FileOutputStream(resolvedIvyPropertiesInCache);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void assertInsideCache(File file) {
        if (FileUtil.isLeadingPath(getResolutionCacheRoot(), file)) {
            return;
        }
        throw new IllegalArgumentException(file + " is outside of the cache");
    }

    public final void saveLocalParents(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor, File file, Properties properties) throws IOException, ParseException {
        for (ExtendsDescriptor extendsDescriptor : moduleDescriptor.getInheritedDescriptors()) {
            if (extendsDescriptor.isLocal()) {
                ModuleDescriptor parentMd = extendsDescriptor.getParentMd();
                File resolvedIvyFileInCache = getResolvedIvyFileInCache(ModuleRevisionId.newInstance(moduleRevisionId, moduleRevisionId.getRevision() + "-parent." + properties.size()));
                assertInsideCache(resolvedIvyFileInCache);
                parentMd.toIvyFile(resolvedIvyFileInCache);
                properties.setProperty(file.getName() + "|" + extendsDescriptor.getLocation(), resolvedIvyFileInCache.getAbsolutePath());
                saveLocalParents(moduleRevisionId, parentMd, resolvedIvyFileInCache, properties);
            }
        }
    }

    public String toString() {
        return this.name;
    }

    @Override // org.apache.ivy.core.cache.ResolutionCacheManager
    public void clean() {
        FileUtil.forceDelete(getResolutionCacheRoot());
    }

    public static class CacheParserSettings implements ParserSettings {
        public ParserSettings delegate;
        public Map<Object, Object> parentPaths;

        public CacheParserSettings(ParserSettings parserSettings, Map<Object, Object> map) {
            this.delegate = parserSettings;
            this.parentPaths = map;
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String substitute(String str) {
            return this.delegate.substitute(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Map<String, String> substitute(Map<String, String> map) {
            return this.delegate.substitute(map);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ResolutionCacheManager getResolutionCacheManager() {
            return this.delegate.getResolutionCacheManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ConflictManager getConflictManager(String str) {
            return this.delegate.getConflictManager(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public PatternMatcher getMatcher(String str) {
            return this.delegate.getMatcher(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getNamespace(String str) {
            return this.delegate.getNamespace(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public StatusManager getStatusManager() {
            return this.delegate.getStatusManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public RelativeUrlResolver getRelativeUrlResolver() {
            return new MapURLResolver(this.parentPaths, this.delegate.getRelativeUrlResolver());
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public DependencyResolver getResolver(ModuleRevisionId moduleRevisionId) {
            return this.delegate.getResolver(moduleRevisionId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public File resolveFile(String str) {
            return this.delegate.resolveFile(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getDefaultBranch(ModuleId moduleId) {
            return this.delegate.getDefaultBranch(moduleId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getContextNamespace() {
            return this.delegate.getContextNamespace();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getVariable(String str) {
            return this.delegate.getVariable(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public TimeoutConstraint getTimeoutConstraint(String str) {
            return this.delegate.getTimeoutConstraint(str);
        }
    }

    public static final class MapURLResolver extends RelativeUrlResolver {
        public RelativeUrlResolver delegate;
        public Map<Object, Object> paths;

        public MapURLResolver(Map<Object, Object> map, RelativeUrlResolver relativeUrlResolver) {
            this.paths = map;
            this.delegate = relativeUrlResolver;
        }

        @Override // org.apache.ivy.core.RelativeUrlResolver
        public URL getURL(URL url, String str) throws MalformedURLException {
            String path = url.getPath();
            if (path.contains("/")) {
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (this.paths.containsKey(strSubstring + "|" + str)) {
                    return new File(this.paths.get(strSubstring + "|" + str).toString()).toURI().toURL();
                }
            }
            return this.delegate.getURL(url, str);
        }
    }
}
