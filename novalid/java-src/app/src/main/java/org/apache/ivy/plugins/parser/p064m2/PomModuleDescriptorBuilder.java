package org.apache.ivy.plugins.parser.p064m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultExcludeRule;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ExtraInfoHolder;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.MDArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.descriptor.OverrideDependencyDescriptorMediator;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.jfrog.build.client.Version;

/* loaded from: classes6.dex */
public class PomModuleDescriptorBuilder {
    public static final String DEPENDENCY_MANAGEMENT = "m:dependency.management";
    public static final int DEPENDENCY_MANAGEMENT_KEY_PARTS_COUNT = 4;
    public static final String EXTRA_INFO_DELIMITER = "__";
    public static final String IVY_XML_MAVEN_NAMESPACE_URI = "http://ant.apache.org/ivy/maven";
    public static final Collection<String> JAR_PACKAGINGS;
    public static final Configuration[] MAVEN2_CONFIGURATIONS;
    public static final Map<String, ConfMapper> MAVEN2_CONF_MAPPING;
    public static final String PROPERTIES = "m:properties";
    public static final String WRONG_NUMBER_OF_PARTS_MSG = "what seemed to be a dependency management extra info exclusion had the wrong number of parts (should have 2) ";
    public final PomModuleDescriptor ivyModuleDescriptor;
    public DefaultArtifact mainArtifact;
    public ModuleRevisionId mrid;
    public ParserSettings parserSettings;

    public interface ConfMapper {
        void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z);
    }

    static {
        Configuration.Visibility visibility = Configuration.Visibility.PUBLIC;
        MAVEN2_CONFIGURATIONS = new Configuration[]{new Configuration("default", visibility, "runtime dependencies and master artifact can be used with this conf", new String[]{"runtime", "master"}, true, null), new Configuration("master", visibility, "contains only the artifact published by this module itself, with no transitive dependencies", new String[0], true, null), new Configuration("compile", visibility, "this is the default scope, used if none is specified. Compile dependencies are available in all classpaths.", new String[0], true, null), new Configuration(P2MetadataParser.ProvidedHandler.PROVIDED, visibility, "this is much like compile, but indicates you expect the JDK or a container to provide it. It is only available on the compilation classpath, and is not transitive.", new String[0], true, null), new Configuration("runtime", visibility, "this scope indicates that the dependency is not required for compilation, but is for execution. It is in the runtime and test classpaths, but not the compile classpath.", new String[]{"compile"}, true, null), new Configuration("test", visibility, "this scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases.", new String[]{"runtime"}, true, null), new Configuration("system", visibility, "this scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository.", new String[0], true, null), new Configuration("sources", visibility, "this configuration contains the source artifact of this module, if any.", new String[0], true, null), new Configuration("javadoc", visibility, "this configuration contains the javadoc artifact of this module, if any.", new String[0], true, null), new Configuration("optional", visibility, "contains all optional dependencies", new String[0], true, null)};
        HashMap map = new HashMap();
        MAVEN2_CONF_MAPPING = map;
        JAR_PACKAGINGS = Arrays.asList("ejb", BundleInfo.BUNDLE_TYPE, "maven-plugin", "eclipse-plugin", "jbi-component", "jbi-shared-library", "orbit", "hk2-jar");
        map.put("compile", new ConfMapper() { // from class: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.1
            @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
            public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
                if (z) {
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
                } else {
                    defaultDependencyDescriptor.addDependencyConfiguration("compile", "compile(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("compile", "master(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("runtime", "runtime(*)");
                }
            }
        });
        map.put(P2MetadataParser.ProvidedHandler.PROVIDED, new ConfMapper() { // from class: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.2
            @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
            public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
                if (z) {
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "provided(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "runtime(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
                    return;
                }
                defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "provided(*)");
                defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "runtime(*)");
                defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "master(*)");
            }
        });
        map.put("runtime", new ConfMapper() { // from class: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.3
            @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
            public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
                if (z) {
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "provided(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
                } else {
                    defaultDependencyDescriptor.addDependencyConfiguration("runtime", "compile(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("runtime", "runtime(*)");
                    defaultDependencyDescriptor.addDependencyConfiguration("runtime", "master(*)");
                }
            }
        });
        map.put("test", new ConfMapper() { // from class: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.4
            @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
            public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
                defaultDependencyDescriptor.addDependencyConfiguration("test", "runtime(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("test", "master(*)");
            }
        });
        map.put("system", new ConfMapper() { // from class: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.5
            @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
            public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
                defaultDependencyDescriptor.addDependencyConfiguration("system", "master(*)");
            }
        });
    }

    /* renamed from: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder$1 */
    /* loaded from: classes5.dex */
    public class C112381 implements ConfMapper {
        @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
        public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            if (z) {
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
            } else {
                defaultDependencyDescriptor.addDependencyConfiguration("compile", "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("compile", "master(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("runtime", "runtime(*)");
            }
        }
    }

    /* renamed from: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder$2 */
    /* loaded from: classes5.dex */
    public class C112392 implements ConfMapper {
        @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
        public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            if (z) {
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "provided(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "runtime(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
                return;
            }
            defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "compile(*)");
            defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "provided(*)");
            defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "runtime(*)");
            defaultDependencyDescriptor.addDependencyConfiguration(P2MetadataParser.ProvidedHandler.PROVIDED, "master(*)");
        }
    }

    /* renamed from: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder$3 */
    /* loaded from: classes5.dex */
    public class C112403 implements ConfMapper {
        @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
        public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            if (z) {
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "provided(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("optional", "master(*)");
            } else {
                defaultDependencyDescriptor.addDependencyConfiguration("runtime", "compile(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("runtime", "runtime(*)");
                defaultDependencyDescriptor.addDependencyConfiguration("runtime", "master(*)");
            }
        }
    }

    /* renamed from: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder$4 */
    /* loaded from: classes5.dex */
    public class C112414 implements ConfMapper {
        @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
        public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            defaultDependencyDescriptor.addDependencyConfiguration("test", "runtime(*)");
            defaultDependencyDescriptor.addDependencyConfiguration("test", "master(*)");
        }
    }

    /* renamed from: org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder$5 */
    /* loaded from: classes5.dex */
    public class C112425 implements ConfMapper {
        @Override // org.apache.ivy.plugins.parser.m2.PomModuleDescriptorBuilder.ConfMapper
        public void addMappingConfs(DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            defaultDependencyDescriptor.addDependencyConfiguration("system", "master(*)");
        }
    }

    public PomModuleDescriptorBuilder(ModuleDescriptorParser moduleDescriptorParser, Resource resource, ParserSettings parserSettings) {
        PomModuleDescriptor pomModuleDescriptor = new PomModuleDescriptor(moduleDescriptorParser, resource);
        this.ivyModuleDescriptor = pomModuleDescriptor;
        pomModuleDescriptor.setResolvedPublicationDate(new Date(resource.getLastModified()));
        for (Configuration configuration : MAVEN2_CONFIGURATIONS) {
            this.ivyModuleDescriptor.addConfiguration(configuration);
        }
        this.ivyModuleDescriptor.setMappingOverride(true);
        this.ivyModuleDescriptor.addExtraAttributeNamespace("m", IVY_XML_MAVEN_NAMESPACE_URI);
        this.parserSettings = parserSettings;
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.ivyModuleDescriptor;
    }

    public void setModuleRevId(String str, String str2, String str3) {
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(str, str2, str3);
        this.mrid = moduleRevisionIdNewInstance;
        this.ivyModuleDescriptor.setModuleRevisionId(moduleRevisionIdNewInstance);
        if (str3 == null || str3.endsWith(Version.SNAPSHOT_SUFFIX)) {
            this.ivyModuleDescriptor.setStatus("integration");
        } else {
            this.ivyModuleDescriptor.setStatus("release");
        }
    }

    public void setHomePage(String str) {
        this.ivyModuleDescriptor.setHomePage(str);
    }

    public void setDescription(String str) {
        this.ivyModuleDescriptor.setDescription(str);
    }

    public void setLicenses(License[] licenseArr) {
        for (License license : licenseArr) {
            this.ivyModuleDescriptor.addLicense(license);
        }
    }

    public void addMainArtifact(String str, String str2) {
        String str3;
        String str4;
        if ("pom".equals(str2)) {
            DependencyResolver resolver = this.parserSettings.getResolver(this.mrid);
            if (resolver != null) {
                DefaultArtifact defaultArtifact = new DefaultArtifact(this.mrid, new Date(), str, "jar", "jar");
                if (ArtifactOrigin.isUnknown(resolver.locate(defaultArtifact))) {
                    return;
                }
                this.mainArtifact = defaultArtifact;
                this.ivyModuleDescriptor.addArtifact("master", defaultArtifact);
                return;
            }
            return;
        }
        if (JAR_PACKAGINGS.contains(str2)) {
            str4 = "jar";
        } else if ("pear".equals(str2)) {
            str4 = "phar";
        } else {
            str3 = str2;
            DefaultArtifact defaultArtifact2 = new DefaultArtifact(this.mrid, new Date(), str, str2, str3);
            this.mainArtifact = defaultArtifact2;
            this.ivyModuleDescriptor.addArtifact("master", defaultArtifact2);
        }
        str3 = str4;
        DefaultArtifact defaultArtifact22 = new DefaultArtifact(this.mrid, new Date(), str, str2, str3);
        this.mainArtifact = defaultArtifact22;
        this.ivyModuleDescriptor.addArtifact("master", defaultArtifact22);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addDependency(Resource resource, PomReader.PomDependencyData pomDependencyData) {
        DefaultDependencyDescriptor pomDependencyDescriptor;
        String str;
        String scope = pomDependencyData.getScope();
        if (!StringUtils.isNullOrEmpty(scope) && !MAVEN2_CONF_MAPPING.containsKey(scope)) {
            scope = "compile";
        }
        String defaultScope = scope;
        String version = pomDependencyData.getVersion();
        if (StringUtils.isNullOrEmpty(version)) {
            version = getDefaultVersion(pomDependencyData);
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(pomDependencyData.getGroupId(), pomDependencyData.getArtifactId(), version);
        ModuleRevisionId moduleRevisionId = this.ivyModuleDescriptor.getModuleRevisionId();
        if (moduleRevisionId == null || !moduleRevisionId.getModuleId().equals(moduleRevisionIdNewInstance.getModuleId())) {
            List<ModuleId> excludedModules = pomDependencyData.getExcludedModules();
            if (excludedModules.isEmpty()) {
                excludedModules = getDependencyMgtExclusions(this.ivyModuleDescriptor, pomDependencyData.getGroupId(), pomDependencyData.getArtifactId());
            }
            List<ModuleId> list = excludedModules;
            boolean zShouldExcludeAllTransitiveDeps = shouldExcludeAllTransitiveDeps(list);
            DependencyDescriptor dependencyDescriptor = (DependencyDescriptor) this.ivyModuleDescriptor.depDescriptors.get(moduleRevisionIdNewInstance);
            if (dependencyDescriptor != null && (dependencyDescriptor instanceof DefaultDependencyDescriptor)) {
                pomDependencyDescriptor = (DefaultDependencyDescriptor) dependencyDescriptor;
            } else {
                pomDependencyDescriptor = new PomDependencyDescriptor(pomDependencyData, this.ivyModuleDescriptor, moduleRevisionIdNewInstance, !zShouldExcludeAllTransitiveDeps);
            }
            if (StringUtils.isNullOrEmpty(defaultScope)) {
                defaultScope = getDefaultScope(pomDependencyData);
            }
            MAVEN2_CONF_MAPPING.get(defaultScope).addMappingConfs(pomDependencyDescriptor, pomDependencyData.isOptional());
            HashMap map = new HashMap();
            if (pomDependencyData.getClassifier() != null || (pomDependencyData.getType() != null && !"jar".equals(pomDependencyData.getType()))) {
                String type = pomDependencyData.getType() != null ? pomDependencyData.getType() : "jar";
                if ("test-jar".equals(type)) {
                    map.put("m:classifier", "tests");
                } else {
                    if (!JAR_PACKAGINGS.contains(type)) {
                        str = type;
                    }
                    if (pomDependencyData.getClassifier() != null) {
                        map.put("m:classifier", pomDependencyData.getClassifier());
                    }
                    DefaultDependencyArtifactDescriptor defaultDependencyArtifactDescriptor = new DefaultDependencyArtifactDescriptor(pomDependencyDescriptor, pomDependencyDescriptor.getDependencyId().getName(), type, str, null, map);
                    if (pomDependencyData.isOptional()) {
                        defaultScope = "optional";
                    }
                    defaultDependencyArtifactDescriptor.addConfiguration(defaultScope);
                    pomDependencyDescriptor.addDependencyArtifact(defaultScope, defaultDependencyArtifactDescriptor);
                }
                str = "jar";
                if (pomDependencyData.getClassifier() != null) {
                }
                DefaultDependencyArtifactDescriptor defaultDependencyArtifactDescriptor2 = new DefaultDependencyArtifactDescriptor(pomDependencyDescriptor, pomDependencyDescriptor.getDependencyId().getName(), type, str, null, map);
                if (pomDependencyData.isOptional()) {
                }
                defaultDependencyArtifactDescriptor2.addConfiguration(defaultScope);
                pomDependencyDescriptor.addDependencyArtifact(defaultScope, defaultDependencyArtifactDescriptor2);
            }
            for (ModuleId moduleId : list) {
                if (!"*".equals(moduleId.getOrganisation()) || !"*".equals(moduleId.getName())) {
                    for (String str2 : pomDependencyDescriptor.getModuleConfigurations()) {
                        pomDependencyDescriptor.addExcludeRule(str2, new DefaultExcludeRule(new ArtifactId(moduleId, "*", "*", "*"), ExactPatternMatcher.INSTANCE, null));
                    }
                }
            }
            if (dependencyDescriptor != pomDependencyDescriptor) {
                this.ivyModuleDescriptor.addDependency(pomDependencyDescriptor);
            }
        }
    }

    public static boolean shouldExcludeAllTransitiveDeps(List<ModuleId> list) {
        if (list != null && !list.isEmpty()) {
            for (ModuleId moduleId : list) {
                if (moduleId != null && "*".equals(moduleId.getOrganisation()) && "*".equals(moduleId.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addDependency(DependencyDescriptor dependencyDescriptor) {
        ModuleId dependencyId = dependencyDescriptor.getDependencyId();
        ModuleRevisionId moduleRevisionId = this.ivyModuleDescriptor.getModuleRevisionId();
        if (moduleRevisionId == null || !moduleRevisionId.getModuleId().equals(dependencyId)) {
            this.ivyModuleDescriptor.addDependency(dependencyDescriptor);
        }
    }

    public void addDependencyMgt(PomDependencyMgt pomDependencyMgt) {
        this.ivyModuleDescriptor.addDependencyManagement(pomDependencyMgt);
        overwriteExtraInfoIfExists(getDependencyMgtExtraInfoKeyForVersion(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId()), pomDependencyMgt.getVersion());
        if (pomDependencyMgt.getScope() != null) {
            overwriteExtraInfoIfExists(getDependencyMgtExtraInfoKeyForScope(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId()), pomDependencyMgt.getScope());
        }
        if (!pomDependencyMgt.getExcludedModules().isEmpty()) {
            String dependencyMgtExtraInfoPrefixForExclusion = getDependencyMgtExtraInfoPrefixForExclusion(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId());
            int i = 0;
            for (ModuleId moduleId : pomDependencyMgt.getExcludedModules()) {
                overwriteExtraInfoIfExists(dependencyMgtExtraInfoPrefixForExclusion + i, moduleId.getOrganisation() + EXTRA_INFO_DELIMITER + moduleId.getName());
                i++;
            }
        }
        this.ivyModuleDescriptor.addDependencyDescriptorMediator(ModuleId.newInstance(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId()), ExactPatternMatcher.INSTANCE, new OverrideDependencyDescriptorMediator(null, pomDependencyMgt.getVersion()));
    }

    public void addPlugin(PomDependencyMgt pomDependencyMgt) {
        String str = pomDependencyMgt.getGroupId() + EXTRA_INFO_DELIMITER + pomDependencyMgt.getArtifactId() + EXTRA_INFO_DELIMITER + pomDependencyMgt.getVersion();
        ExtraInfoHolder extraInfoByTagName = this.ivyModuleDescriptor.getExtraInfoByTagName("m:maven.plugins");
        if (extraInfoByTagName == null) {
            extraInfoByTagName = new ExtraInfoHolder();
            extraInfoByTagName.setName("m:maven.plugins");
            this.ivyModuleDescriptor.addExtraInfo(extraInfoByTagName);
        }
        String content = extraInfoByTagName.getContent();
        if (content != null) {
            str = content + "|" + str;
        }
        extraInfoByTagName.setContent(str);
    }

    public static List<PomDependencyMgt> getPlugins(ModuleDescriptor moduleDescriptor) {
        ArrayList arrayList = new ArrayList();
        String extraInfoContentByTagName = moduleDescriptor.getExtraInfoContentByTagName("m:maven.plugins");
        if (extraInfoContentByTagName == null) {
            return new ArrayList();
        }
        for (String str : extraInfoContentByTagName.split("\\|")) {
            String[] strArrSplit = str.split(EXTRA_INFO_DELIMITER);
            arrayList.add(new PomPluginElement(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
        }
        return arrayList;
    }

    /* loaded from: classes5.dex */
    public static class PomPluginElement implements PomDependencyMgt {
        public String artifactId;
        public String groupId;
        public String version;

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getScope() {
            return null;
        }

        public PomPluginElement(String str, String str2, String str3) {
            this.groupId = str;
            this.artifactId = str2;
            this.version = str3;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getGroupId() {
            return this.groupId;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getArtifactId() {
            return this.artifactId;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getVersion() {
            return this.version;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public List<ModuleId> getExcludedModules() {
            return Collections.emptyList();
        }
    }

    public final String getDefaultVersion(PomReader.PomDependencyData pomDependencyData) {
        ModuleId moduleIdNewInstance = ModuleId.newInstance(pomDependencyData.getGroupId(), pomDependencyData.getArtifactId());
        if (this.ivyModuleDescriptor.getDependencyManagementMap().containsKey(moduleIdNewInstance)) {
            return this.ivyModuleDescriptor.getDependencyManagementMap().get(moduleIdNewInstance).getVersion();
        }
        return this.ivyModuleDescriptor.getExtraInfoContentByTagName(getDependencyMgtExtraInfoKeyForVersion(pomDependencyData.getGroupId(), pomDependencyData.getArtifactId()));
    }

    public final String getDefaultScope(PomReader.PomDependencyData pomDependencyData) {
        String extraInfoContentByTagName;
        ModuleId moduleIdNewInstance = ModuleId.newInstance(pomDependencyData.getGroupId(), pomDependencyData.getArtifactId());
        if (this.ivyModuleDescriptor.getDependencyManagementMap().containsKey(moduleIdNewInstance)) {
            extraInfoContentByTagName = this.ivyModuleDescriptor.getDependencyManagementMap().get(moduleIdNewInstance).getScope();
        } else {
            extraInfoContentByTagName = this.ivyModuleDescriptor.getExtraInfoContentByTagName(getDependencyMgtExtraInfoKeyForScope(pomDependencyData.getGroupId(), pomDependencyData.getArtifactId()));
        }
        return (extraInfoContentByTagName == null || !MAVEN2_CONF_MAPPING.containsKey(extraInfoContentByTagName)) ? "compile" : extraInfoContentByTagName;
    }

    public static String getDependencyMgtExtraInfoKeyForVersion(String str, String str2) {
        return "m:dependency.management__" + str + EXTRA_INFO_DELIMITER + str2 + EXTRA_INFO_DELIMITER + "version";
    }

    public static String getDependencyMgtExtraInfoKeyForScope(String str, String str2) {
        return "m:dependency.management__" + str + EXTRA_INFO_DELIMITER + str2 + EXTRA_INFO_DELIMITER + PomReader.SCOPE;
    }

    public static String getPropertyExtraInfoKey(String str) {
        return "m:properties__" + str;
    }

    public static String getDependencyMgtExtraInfoPrefixForExclusion(String str, String str2) {
        return "m:dependency.management__" + str + EXTRA_INFO_DELIMITER + str2 + EXTRA_INFO_DELIMITER + "exclusion_";
    }

    public static List<ModuleId> getDependencyMgtExclusions(ModuleDescriptor moduleDescriptor, String str, String str2) {
        PomDependencyMgt pomDependencyMgt;
        if ((moduleDescriptor instanceof PomModuleDescriptor) && (pomDependencyMgt = ((PomModuleDescriptor) moduleDescriptor).getDependencyManagementMap().get(ModuleId.newInstance(str, str2))) != null) {
            return pomDependencyMgt.getExcludedModules();
        }
        String dependencyMgtExtraInfoPrefixForExclusion = getDependencyMgtExtraInfoPrefixForExclusion(str, str2);
        LinkedList linkedList = new LinkedList();
        for (ExtraInfoHolder extraInfoHolder : moduleDescriptor.getExtraInfos()) {
            if (extraInfoHolder.getName().startsWith(dependencyMgtExtraInfoPrefixForExclusion)) {
                String content = extraInfoHolder.getContent();
                String[] strArrSplit = content.split(EXTRA_INFO_DELIMITER);
                if (strArrSplit.length != 2) {
                    Message.error(WRONG_NUMBER_OF_PARTS_MSG + strArrSplit.length + " : " + content);
                } else {
                    linkedList.add(ModuleId.newInstance(strArrSplit[0], strArrSplit[1]));
                }
            }
        }
        return linkedList;
    }

    public static Map<ModuleId, String> getDependencyManagementMap(ModuleDescriptor moduleDescriptor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (moduleDescriptor instanceof PomModuleDescriptor) {
            for (Map.Entry<ModuleId, PomDependencyMgt> entry : ((PomModuleDescriptor) moduleDescriptor).getDependencyManagementMap().entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().getVersion());
            }
        } else {
            for (ExtraInfoHolder extraInfoHolder : moduleDescriptor.getExtraInfos()) {
                String name = extraInfoHolder.getName();
                if (name.startsWith(DEPENDENCY_MANAGEMENT)) {
                    String[] strArrSplit = name.split(EXTRA_INFO_DELIMITER);
                    if (strArrSplit.length != 4) {
                        Message.warn("what seem to be a dependency management extra info doesn't match expected pattern: " + name);
                    } else {
                        linkedHashMap.put(ModuleId.newInstance(strArrSplit[1], strArrSplit[2]), extraInfoHolder.getContent());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static List<PomDependencyMgt> getDependencyManagements(ModuleDescriptor moduleDescriptor) {
        ArrayList arrayList = new ArrayList();
        if (moduleDescriptor instanceof PomModuleDescriptor) {
            arrayList.addAll(((PomModuleDescriptor) moduleDescriptor).getDependencyManagementMap().values());
        } else {
            Iterator<ExtraInfoHolder> it = moduleDescriptor.getExtraInfos().iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (name.startsWith(DEPENDENCY_MANAGEMENT)) {
                    String[] strArrSplit = name.split(EXTRA_INFO_DELIMITER);
                    if (strArrSplit.length != 4) {
                        Message.warn("what seem to be a dependency management extra info doesn't match expected pattern: " + name);
                    } else {
                        arrayList.add(new DefaultPomDependencyMgt(strArrSplit[1], strArrSplit[2], moduleDescriptor.getExtraInfoContentByTagName("m:dependency.management__" + strArrSplit[1] + EXTRA_INFO_DELIMITER + strArrSplit[2] + EXTRA_INFO_DELIMITER + "version"), moduleDescriptor.getExtraInfoContentByTagName("m:dependency.management__" + strArrSplit[1] + EXTRA_INFO_DELIMITER + strArrSplit[2] + EXTRA_INFO_DELIMITER + PomReader.SCOPE), getDependencyMgtExclusions(moduleDescriptor, strArrSplit[1], strArrSplit[2])));
                    }
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public void addExtraInfos(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            addExtraInfo(entry.getKey(), entry.getValue());
        }
    }

    public final void addExtraInfo(String str, String str2) {
        if (this.ivyModuleDescriptor.getExtraInfoByTagName(str) == null) {
            this.ivyModuleDescriptor.getExtraInfos().add(new ExtraInfoHolder(str, str2));
        }
    }

    public final void overwriteExtraInfoIfExists(String str, String str2) {
        boolean z = false;
        for (ExtraInfoHolder extraInfoHolder : this.ivyModuleDescriptor.getExtraInfos()) {
            if (extraInfoHolder.getName().equals(str)) {
                extraInfoHolder.setContent(str2);
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.ivyModuleDescriptor.getExtraInfos().add(new ExtraInfoHolder(str, str2));
    }

    public void addExtraInfos(List<ExtraInfoHolder> list) {
        for (ExtraInfoHolder extraInfoHolder : list) {
            addExtraInfo(extraInfoHolder.getName(), extraInfoHolder.getContent());
        }
    }

    @Deprecated
    public static Map<String, String> extractPomProperties(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().startsWith(PROPERTIES)) {
                map2.put(entry.getKey().substring(14), entry.getValue());
            }
        }
        return map2;
    }

    public static Map<String, String> extractPomProperties(List<ExtraInfoHolder> list) {
        HashMap map = new HashMap();
        for (ExtraInfoHolder extraInfoHolder : list) {
            if (extraInfoHolder.getName().startsWith(PROPERTIES)) {
                map.put(extraInfoHolder.getName().substring(14), extraInfoHolder.getContent());
            }
        }
        return map;
    }

    public void addProperty(String str, String str2) {
        addExtraInfo(getPropertyExtraInfoKey(str), str2);
    }

    public Artifact getMainArtifact() {
        return this.mainArtifact;
    }

    public Artifact getSourceArtifact() {
        return new MDArtifact(this.ivyModuleDescriptor, this.mrid.getName(), "source", "jar", null, Collections.singletonMap("m:classifier", "sources"));
    }

    public Artifact getSrcArtifact() {
        return new MDArtifact(this.ivyModuleDescriptor, this.mrid.getName(), "source", "jar", null, Collections.singletonMap("m:classifier", "src"));
    }

    public Artifact getJavadocArtifact() {
        return new MDArtifact(this.ivyModuleDescriptor, this.mrid.getName(), "javadoc", "jar", null, Collections.singletonMap("m:classifier", "javadoc"));
    }

    public void addSourceArtifact() {
        this.ivyModuleDescriptor.addArtifact("sources", getSourceArtifact());
    }

    public void addSrcArtifact() {
        this.ivyModuleDescriptor.addArtifact("sources", getSrcArtifact());
    }

    public void addJavadocArtifact() {
        this.ivyModuleDescriptor.addArtifact("javadoc", getJavadocArtifact());
    }

    /* loaded from: classes7.dex */
    public static class PomDependencyDescriptor extends DefaultDependencyDescriptor {
        public final PomReader.PomDependencyData pomDependencyData;

        public /* synthetic */ PomDependencyDescriptor(PomReader.PomDependencyData pomDependencyData, ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, boolean z, C112381 c112381) {
            this(pomDependencyData, moduleDescriptor, moduleRevisionId, z);
        }

        public PomDependencyDescriptor(PomReader.PomDependencyData pomDependencyData, ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, boolean z) {
            super(moduleDescriptor, moduleRevisionId, true, false, z);
            this.pomDependencyData = pomDependencyData;
        }

        public PomReader.PomDependencyData getPomDependencyData() {
            return this.pomDependencyData;
        }
    }

    /* loaded from: classes7.dex */
    public static class PomModuleDescriptor extends DefaultModuleDescriptor {
        public final Map<ModuleRevisionId, DependencyDescriptor> depDescriptors;
        public final Map<ModuleId, PomDependencyMgt> dependencyManagementMap;

        public PomModuleDescriptor(ModuleDescriptorParser moduleDescriptorParser, Resource resource) {
            super(moduleDescriptorParser, resource);
            this.dependencyManagementMap = new LinkedHashMap();
            this.depDescriptors = new HashMap();
        }

        public void addDependencyManagement(PomDependencyMgt pomDependencyMgt) {
            this.dependencyManagementMap.put(ModuleId.newInstance(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId()), pomDependencyMgt);
        }

        public Map<ModuleId, PomDependencyMgt> getDependencyManagementMap() {
            return this.dependencyManagementMap;
        }

        @Override // org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor
        public void addDependency(DependencyDescriptor dependencyDescriptor) {
            super.addDependency(dependencyDescriptor);
            this.depDescriptors.put(dependencyDescriptor.getDependencyRevisionId(), dependencyDescriptor);
        }
    }
}
