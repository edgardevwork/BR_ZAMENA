package org.apache.ivy.core.module.descriptor;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRules;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.plugins.matcher.MatcherHelper;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.namespace.NamespaceTransformer;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class DefaultModuleDescriptor implements ModuleDescriptor {
    public Collection<Artifact> artifacts;
    public Map<String, Collection<Artifact>> artifactsByConf;
    public Map<String, Configuration> configurations;
    public ModuleRules<ConflictManager> conflictManagers;
    public String defaultConf;
    public String defaultConfMapping;
    public List<DependencyDescriptor> dependencies;
    public ModuleRules<DependencyDescriptorMediator> dependencyDescriptorMediators;
    public String description;
    public List<ExcludeRule> excludeRules;
    public Map<String, String> extraAttributesNamespaces;
    public List<ExtraInfoHolder> extraInfos;
    public String homePage;
    public List<ExtendsDescriptor> inheritedDescriptors;
    public boolean isDefault;
    public long lastModified;
    public List<License> licenses;
    public boolean mappingOverride;
    public Artifact metadataArtifact;
    public Namespace namespace;
    public ModuleDescriptorParser parser;
    public Date publicationDate;
    public Date resolvedPublicationDate;
    public ModuleRevisionId resolvedRevId;
    public Resource resource;
    public ModuleRevisionId revId;
    public String status;

    public static DefaultModuleDescriptor newDefaultInstance(ModuleRevisionId moduleRevisionId) {
        return newDefaultInstance(moduleRevisionId, null);
    }

    public static DefaultModuleDescriptor newCallerInstance(ModuleRevisionId moduleRevisionId, String[] strArr, boolean z, boolean z2) {
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(ModuleRevisionId.newInstance(moduleRevisionId.getOrganisation(), moduleRevisionId.getName() + "-caller", "working"), "integration", null, true);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            defaultModuleDescriptor.addConfiguration(new Configuration(strArr[i]));
        }
        defaultModuleDescriptor.setLastModified(System.currentTimeMillis());
        DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptor, moduleRevisionId, true, z2, z);
        for (String str : strArr) {
            defaultDependencyDescriptor.addDependencyConfiguration(str, str);
        }
        defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
        return defaultModuleDescriptor;
    }

    public static DefaultModuleDescriptor newCallerInstance(ModuleRevisionId[] moduleRevisionIdArr, boolean z, boolean z2) {
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(ModuleRevisionId.newInstance("caller", "all-caller", "working"), "integration", null, true);
        defaultModuleDescriptor.addConfiguration(new Configuration("default"));
        defaultModuleDescriptor.setLastModified(System.currentTimeMillis());
        for (ModuleRevisionId moduleRevisionId : moduleRevisionIdArr) {
            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptor, moduleRevisionId, true, z2, z);
            defaultDependencyDescriptor.addDependencyConfiguration("default", "*");
            defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
        }
        return defaultModuleDescriptor;
    }

    public static DefaultModuleDescriptor newDefaultInstance(ModuleRevisionId moduleRevisionId, DependencyArtifactDescriptor[] dependencyArtifactDescriptorArr) {
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(moduleRevisionId, "release", null, true);
        defaultModuleDescriptor.addConfiguration(new Configuration("default"));
        if (dependencyArtifactDescriptorArr != null && dependencyArtifactDescriptorArr.length > 0) {
            for (DependencyArtifactDescriptor dependencyArtifactDescriptor : dependencyArtifactDescriptorArr) {
                defaultModuleDescriptor.addArtifact("default", new MDArtifact(defaultModuleDescriptor, dependencyArtifactDescriptor.getName(), dependencyArtifactDescriptor.getType(), dependencyArtifactDescriptor.getExt(), dependencyArtifactDescriptor.getUrl(), dependencyArtifactDescriptor.getExtraAttributes()));
            }
        } else {
            defaultModuleDescriptor.addArtifact("default", new MDArtifact(defaultModuleDescriptor, moduleRevisionId.getName(), "jar", "jar"));
        }
        defaultModuleDescriptor.setLastModified(System.currentTimeMillis());
        return defaultModuleDescriptor;
    }

    public static DefaultModuleDescriptor newBasicInstance(ModuleRevisionId moduleRevisionId, Date date) {
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(moduleRevisionId, "release", date, false);
        defaultModuleDescriptor.addConfiguration(new Configuration("default"));
        defaultModuleDescriptor.addArtifact("default", new MDArtifact(defaultModuleDescriptor, moduleRevisionId.getName(), "jar", "jar"));
        return defaultModuleDescriptor;
    }

    public static ModuleDescriptor transformInstance(ModuleDescriptor moduleDescriptor, Namespace namespace) {
        NamespaceTransformer toSystemTransformer = namespace.getToSystemTransformer();
        if (toSystemTransformer.isIdentity()) {
            return moduleDescriptor;
        }
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(moduleDescriptor.getParser(), moduleDescriptor.getResource());
        defaultModuleDescriptor.revId = toSystemTransformer.transform(moduleDescriptor.getModuleRevisionId());
        defaultModuleDescriptor.resolvedRevId = toSystemTransformer.transform(moduleDescriptor.getResolvedModuleRevisionId());
        defaultModuleDescriptor.status = moduleDescriptor.getStatus();
        defaultModuleDescriptor.publicationDate = moduleDescriptor.getPublicationDate();
        defaultModuleDescriptor.resolvedPublicationDate = moduleDescriptor.getResolvedPublicationDate();
        for (ExtendsDescriptor extendsDescriptor : moduleDescriptor.getInheritedDescriptors()) {
            ModuleDescriptor parentMd = extendsDescriptor.getParentMd();
            DefaultModuleDescriptor defaultModuleDescriptor2 = new DefaultModuleDescriptor(parentMd.getParser(), parentMd.getResource());
            defaultModuleDescriptor2.revId = toSystemTransformer.transform(parentMd.getModuleRevisionId());
            defaultModuleDescriptor2.resolvedRevId = toSystemTransformer.transform(parentMd.getResolvedModuleRevisionId());
            defaultModuleDescriptor2.status = parentMd.getStatus();
            defaultModuleDescriptor2.publicationDate = parentMd.getPublicationDate();
            defaultModuleDescriptor2.resolvedPublicationDate = parentMd.getResolvedPublicationDate();
            defaultModuleDescriptor.inheritedDescriptors.add(new DefaultExtendsDescriptor(defaultModuleDescriptor2, extendsDescriptor.getLocation(), extendsDescriptor.getExtendsTypes()));
        }
        for (DependencyDescriptor dependencyDescriptor : moduleDescriptor.getDependencies()) {
            defaultModuleDescriptor.dependencies.add(NameSpaceHelper.toSystem(dependencyDescriptor, namespace));
        }
        for (Configuration configuration : moduleDescriptor.getConfigurations()) {
            String name = configuration.getName();
            defaultModuleDescriptor.configurations.put(name, configuration);
            for (Artifact artifact : moduleDescriptor.getArtifacts(name)) {
                defaultModuleDescriptor.addArtifact(name, NameSpaceHelper.transform(artifact, toSystemTransformer));
            }
        }
        defaultModuleDescriptor.setDefault(moduleDescriptor.isDefault());
        if (moduleDescriptor instanceof DefaultModuleDescriptor) {
            DefaultModuleDescriptor defaultModuleDescriptor3 = (DefaultModuleDescriptor) moduleDescriptor;
            defaultModuleDescriptor.conflictManagers = defaultModuleDescriptor3.conflictManagers.clone();
            defaultModuleDescriptor.dependencyDescriptorMediators = defaultModuleDescriptor3.dependencyDescriptorMediators.clone();
        } else {
            Message.warn("transformed module descriptor is not a default module descriptor: impossible to copy conflict manager and version mediation configuration: " + moduleDescriptor);
        }
        defaultModuleDescriptor.licenses.addAll(Arrays.asList(moduleDescriptor.getLicenses()));
        defaultModuleDescriptor.homePage = moduleDescriptor.getHomePage();
        defaultModuleDescriptor.description = moduleDescriptor.getDescription();
        defaultModuleDescriptor.lastModified = moduleDescriptor.getLastModified();
        defaultModuleDescriptor.extraAttributesNamespaces = moduleDescriptor.getExtraAttributesNamespaces();
        defaultModuleDescriptor.extraInfos = moduleDescriptor.getExtraInfos();
        defaultModuleDescriptor.namespace = namespace;
        return defaultModuleDescriptor;
    }

    public DefaultModuleDescriptor(ModuleRevisionId moduleRevisionId, String str, Date date) {
        this(moduleRevisionId, str, date, false);
    }

    public DefaultModuleDescriptor(ModuleRevisionId moduleRevisionId, String str, Date date, boolean z) {
        this.status = StatusManager.getCurrent().getDefaultStatus();
        this.dependencies = new ArrayList();
        this.configurations = new LinkedHashMap();
        this.artifactsByConf = new HashMap();
        this.artifacts = new LinkedHashSet();
        this.isDefault = false;
        this.conflictManagers = new ModuleRules<>();
        this.dependencyDescriptorMediators = new ModuleRules<>();
        this.licenses = new ArrayList();
        this.description = "";
        this.lastModified = 0L;
        this.excludeRules = new ArrayList();
        this.inheritedDescriptors = new ArrayList();
        this.extraAttributesNamespaces = new LinkedHashMap();
        this.extraInfos = new ArrayList();
        if (moduleRevisionId == null) {
            throw new NullPointerException("null module revision id not allowed");
        }
        if (str == null) {
            throw new NullPointerException("null status not allowed");
        }
        this.revId = moduleRevisionId;
        this.resolvedRevId = moduleRevisionId;
        this.status = str;
        this.publicationDate = date;
        this.resolvedPublicationDate = date == null ? new Date() : date;
        this.isDefault = z;
        this.parser = XmlModuleDescriptorParser.getInstance();
    }

    public DefaultModuleDescriptor(ModuleDescriptorParser moduleDescriptorParser, Resource resource) {
        this.status = StatusManager.getCurrent().getDefaultStatus();
        this.dependencies = new ArrayList();
        this.configurations = new LinkedHashMap();
        this.artifactsByConf = new HashMap();
        this.artifacts = new LinkedHashSet();
        this.isDefault = false;
        this.conflictManagers = new ModuleRules<>();
        this.dependencyDescriptorMediators = new ModuleRules<>();
        this.licenses = new ArrayList();
        this.description = "";
        this.lastModified = 0L;
        this.excludeRules = new ArrayList();
        this.inheritedDescriptors = new ArrayList();
        this.extraAttributesNamespaces = new LinkedHashMap();
        this.extraInfos = new ArrayList();
        this.parser = moduleDescriptorParser;
        this.resource = resource;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Artifact getMetadataArtifact() {
        if (this.metadataArtifact == null) {
            this.metadataArtifact = DefaultArtifact.newIvyArtifact(this.resolvedRevId, this.resolvedPublicationDate);
        }
        return this.metadataArtifact;
    }

    public void setModuleArtifact(Artifact artifact) {
        this.metadataArtifact = artifact;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public boolean isDefault() {
        return this.isDefault;
    }

    public void setPublicationDate(Date date) {
        this.publicationDate = date;
        if (this.resolvedPublicationDate == null) {
            if (date == null) {
                date = new Date();
            }
            this.resolvedPublicationDate = date;
        }
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public void setResolvedPublicationDate(Date date) {
        if (date == null) {
            throw new NullPointerException("null publication date not allowed");
        }
        this.resolvedPublicationDate = date;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Date getResolvedPublicationDate() {
        return this.resolvedPublicationDate;
    }

    @Override // org.apache.ivy.plugins.latest.ArtifactInfo
    public String getRevision() {
        return getResolvedModuleRevisionId().getRevision();
    }

    public void setModuleRevisionId(ModuleRevisionId moduleRevisionId) {
        if (moduleRevisionId == null) {
            throw new NullPointerException("null module revision id not allowed");
        }
        this.revId = moduleRevisionId;
        if (this.resolvedRevId == null) {
            this.resolvedRevId = moduleRevisionId;
        }
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public void setResolvedModuleRevisionId(ModuleRevisionId moduleRevisionId) {
        this.resolvedRevId = moduleRevisionId;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void addInheritedDescriptor(ExtendsDescriptor extendsDescriptor) {
        this.inheritedDescriptors.add(extendsDescriptor);
    }

    public void addDependency(DependencyDescriptor dependencyDescriptor) {
        this.dependencies.add(dependencyDescriptor);
    }

    public void addConfiguration(Configuration configuration) {
        this.configurations.put(configuration.getName(), configuration);
    }

    public void addArtifact(String str, Artifact artifact) {
        Configuration configuration = getConfiguration(str);
        if (configuration == null) {
            throw new IllegalArgumentException("Cannot add artifact '" + artifact.getId().getArtifactId().getShortDescription() + "' to configuration '" + str + "' of module " + this.revId + " because this configuration doesn't exist!");
        }
        if (configuration instanceof ConfigurationGroup) {
            for (String str2 : ((ConfigurationGroup) configuration).getMembersConfigurationNames()) {
                addArtifact(str2, artifact);
            }
            return;
        }
        Collection<Artifact> arrayList = this.artifactsByConf.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.artifactsByConf.put(str, arrayList);
        }
        arrayList.add(artifact);
        this.artifacts.add(artifact);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ModuleRevisionId getModuleRevisionId() {
        return this.revId;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ModuleRevisionId getResolvedModuleRevisionId() {
        return this.resolvedRevId;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String getStatus() {
        return this.status;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ExtendsDescriptor[] getInheritedDescriptors() {
        List<ExtendsDescriptor> list = this.inheritedDescriptors;
        return (ExtendsDescriptor[]) list.toArray(new ExtendsDescriptor[list.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Configuration[] getConfigurations() {
        return (Configuration[]) this.configurations.values().toArray(new Configuration[this.configurations.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String[] getConfigurationsNames() {
        return (String[]) this.configurations.keySet().toArray(new String[this.configurations.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String[] getPublicConfigurationsNames() {
        ArrayList arrayList = new ArrayList();
        for (Configuration configuration : this.configurations.values()) {
            if (Configuration.Visibility.PUBLIC.equals(configuration.getVisibility())) {
                arrayList.add(configuration.getName());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Configuration getConfiguration(String str) {
        Configuration configuration = this.configurations.get(str);
        if (configuration != null || str == null) {
            return configuration;
        }
        Matcher matcher = Pattern.compile("\\*\\[([^=]+)\\=([^\\]]+)\\]").matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Configuration configuration2 : this.configurations.values()) {
                if (strGroup2.equals(configuration2.getAttribute(strGroup))) {
                    linkedHashMap.put(configuration2.getName(), configuration2);
                }
            }
            return new ConfigurationGroup(str, linkedHashMap);
        }
        String[] strArrSplit = str.split("\\+");
        if (strArrSplit.length <= 1) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str2 : strArrSplit) {
            Configuration configuration3 = this.configurations.get(str2);
            if (configuration3 == null) {
                Message.verbose("missing configuration '" + str2 + "' from intersection " + str + " in " + this);
                return null;
            }
            linkedHashMap2.put(str2, configuration3);
        }
        return new ConfigurationIntersection(str, linkedHashMap2);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Artifact[] getArtifacts(String str) {
        Configuration configuration = getConfiguration(str);
        int i = 0;
        if (configuration == null) {
            return new Artifact[0];
        }
        Collection<Artifact> collection = this.artifactsByConf.get(str);
        if (configuration instanceof ConfigurationIntersection) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] intersectedConfigurationNames = ((ConfigurationIntersection) configuration).getIntersectedConfigurationNames();
            int length = intersectedConfigurationNames.length;
            while (i < length) {
                Collection<Artifact> artifactsIncludingExtending = getArtifactsIncludingExtending(intersectedConfigurationNames[i]);
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet.addAll(artifactsIncludingExtending);
                } else {
                    linkedHashSet.retainAll(artifactsIncludingExtending);
                }
                i++;
            }
            if (collection != null) {
                linkedHashSet.addAll(collection);
            }
            return (Artifact[]) linkedHashSet.toArray(new Artifact[linkedHashSet.size()]);
        }
        if (!(configuration instanceof ConfigurationGroup)) {
            if (collection == null) {
                return new Artifact[0];
            }
            return (Artifact[]) collection.toArray(new Artifact[collection.size()]);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        String[] membersConfigurationNames = ((ConfigurationGroup) configuration).getMembersConfigurationNames();
        int length2 = membersConfigurationNames.length;
        while (i < length2) {
            linkedHashSet2.addAll(getArtifactsIncludingExtending(membersConfigurationNames[i]));
            i++;
        }
        if (collection != null) {
            linkedHashSet2.addAll(collection);
        }
        return (Artifact[]) linkedHashSet2.toArray(new Artifact[linkedHashSet2.size()]);
    }

    public final Collection<Artifact> getArtifactsIncludingExtending(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collection<Artifact> collection = this.artifactsByConf.get(str);
        if (collection != null) {
            linkedHashSet.addAll(collection);
        }
        Iterator<Configuration> it = Configuration.findConfigurationExtending(str, getConfigurations()).iterator();
        while (it.hasNext()) {
            Collection<Artifact> collection2 = this.artifactsByConf.get(it.next().getName());
            if (collection2 != null) {
                linkedHashSet.addAll(collection2);
            }
        }
        return linkedHashSet;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Artifact[] getAllArtifacts() {
        Collection<Artifact> collection = this.artifacts;
        return (Artifact[]) collection.toArray(new Artifact[collection.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public DependencyDescriptor[] getDependencies() {
        List<DependencyDescriptor> list = this.dependencies;
        return (DependencyDescriptor[]) list.toArray(new DependencyDescriptor[list.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public boolean dependsOn(VersionMatcher versionMatcher, ModuleDescriptor moduleDescriptor) {
        for (DependencyDescriptor dependencyDescriptor : this.dependencies) {
            if (dependencyDescriptor.getDependencyId().equals(moduleDescriptor.getModuleRevisionId().getModuleId()) && (moduleDescriptor.getResolvedModuleRevisionId().getRevision() == null || versionMatcher.accept(dependencyDescriptor.getDependencyRevisionId(), moduleDescriptor))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public void toIvyFile(File file) throws IOException, ParseException {
        Resource resource;
        ModuleDescriptorParser moduleDescriptorParser = this.parser;
        if (moduleDescriptorParser != null && (resource = this.resource) != null) {
            moduleDescriptorParser.toIvyFile(resource.openStream(), this.resource, file, this);
        } else {
            XmlModuleDescriptorWriter.write(this, file);
        }
    }

    public int hashCode() {
        ModuleRevisionId moduleRevisionId = this.revId;
        return 31 + (moduleRevisionId == null ? 0 : moduleRevisionId.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultModuleDescriptor)) {
            return false;
        }
        ModuleRevisionId moduleRevisionId = this.revId;
        ModuleRevisionId moduleRevisionId2 = ((DefaultModuleDescriptor) obj).revId;
        return moduleRevisionId == null ? moduleRevisionId2 == null : moduleRevisionId.equals(moduleRevisionId2);
    }

    public String toString() {
        return "module: " + this.revId + " status=" + this.status + " publication=" + this.publicationDate + " configurations=" + this.configurations + " artifacts=" + this.artifactsByConf + " dependencies=" + this.dependencies;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void addConflictManager(ModuleId moduleId, PatternMatcher patternMatcher, ConflictManager conflictManager) {
        this.conflictManagers.defineRule(new MapMatcher(moduleId.getAttributes(), patternMatcher), conflictManager);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ConflictManager getConflictManager(ModuleId moduleId) {
        return this.conflictManagers.getRule(moduleId);
    }

    public void addDependencyDescriptorMediator(ModuleId moduleId, PatternMatcher patternMatcher, DependencyDescriptorMediator dependencyDescriptorMediator) {
        this.dependencyDescriptorMediators.defineRule(new MapMatcher(moduleId.getAttributes(), patternMatcher), dependencyDescriptorMediator);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptorMediator
    public DependencyDescriptor mediate(DependencyDescriptor dependencyDescriptor) {
        Iterator<DependencyDescriptorMediator> it = this.dependencyDescriptorMediators.getRules(dependencyDescriptor.getDependencyId()).iterator();
        while (it.hasNext()) {
            dependencyDescriptor = it.next().mediate(dependencyDescriptor);
        }
        return dependencyDescriptor;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ModuleRules<DependencyDescriptorMediator> getAllDependencyDescriptorMediators() {
        return this.dependencyDescriptorMediators.clone();
    }

    public void addLicense(License license) {
        this.licenses.add(license);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public License[] getLicenses() {
        List<License> list = this.licenses;
        return (License[]) list.toArray(new License[list.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String getHomePage() {
        return this.homePage;
    }

    public void setHomePage(String str) {
        this.homePage = str;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor, org.apache.ivy.plugins.latest.ArtifactInfo
    public long getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(long j) {
        this.lastModified = j;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public boolean isNamespaceUseful() {
        Iterator<DependencyDescriptor> it = this.dependencies.iterator();
        while (it.hasNext()) {
            if (it.next().getAllExcludeRules().length > 0) {
                return true;
            }
        }
        return false;
    }

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    public void check() {
        Stack<String> stack = new Stack<>();
        for (Configuration configuration : this.configurations.values()) {
            for (String str : configuration.getExtends()) {
                stack.push(configuration.getName());
                checkConf(stack, str.trim());
                stack.pop();
            }
        }
    }

    public final void checkConf(Stack<String> stack, String str) {
        int iIndexOf = stack.indexOf(str);
        if (iIndexOf != -1) {
            StringBuilder sb = new StringBuilder();
            while (iIndexOf < stack.size()) {
                sb.append(stack.get(iIndexOf));
                sb.append(" => ");
                iIndexOf++;
            }
            sb.append(str);
            throw new IllegalStateException("illegal cycle detected in configuration extension: " + ((Object) sb));
        }
        Configuration configuration = getConfiguration(str);
        if (configuration == null) {
            throw new IllegalStateException("unknown configuration '" + str + "'. It is extended by " + stack.get(stack.size() - 1));
        }
        for (String str2 : configuration.getExtends()) {
            stack.push(configuration.getName());
            checkConf(stack, str2.trim());
            stack.pop();
        }
    }

    public String getDefaultConf() {
        return this.defaultConf;
    }

    public void setDefaultConf(String str) {
        this.defaultConf = str;
    }

    public String getDefaultConfMapping() {
        return this.defaultConfMapping;
    }

    public void setDefaultConfMapping(String str) {
        this.defaultConfMapping = str;
    }

    public void setMappingOverride(boolean z) {
        this.mappingOverride = z;
    }

    public boolean isMappingOverride() {
        return this.mappingOverride;
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getAttribute(String str) {
        return this.resolvedRevId.getAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getAttributes() {
        return this.resolvedRevId.getAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getExtraAttribute(String str) {
        return this.resolvedRevId.getExtraAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getExtraAttributes() {
        return this.resolvedRevId.getExtraAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getQualifiedExtraAttributes() {
        return this.resolvedRevId.getQualifiedExtraAttributes();
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ModuleDescriptorParser getParser() {
        return this.parser;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Resource getResource() {
        return this.resource;
    }

    public void addExcludeRule(ExcludeRule excludeRule) {
        this.excludeRules.add(excludeRule);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public boolean canExclude() {
        return !this.excludeRules.isEmpty();
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public boolean doesExclude(String[] strArr, ArtifactId artifactId) {
        Namespace namespace = this.namespace;
        if (namespace != null) {
            artifactId = NameSpaceHelper.transform(artifactId, namespace.getFromSystemTransformer());
        }
        for (ExcludeRule excludeRule : getExcludeRules(strArr)) {
            if (MatcherHelper.matches(excludeRule.getMatcher(), excludeRule.getId(), artifactId)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ExcludeRule[] getAllExcludeRules() {
        List<ExcludeRule> list = this.excludeRules;
        return (ExcludeRule[]) list.toArray(new ExcludeRule[list.size()]);
    }

    public ExcludeRule[] getExcludeRules(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ExcludeRule excludeRule : this.excludeRules) {
            if (containsAny(excludeRule.getConfigurations(), strArr)) {
                linkedHashSet.add(excludeRule);
            }
        }
        return (ExcludeRule[]) linkedHashSet.toArray(new ExcludeRule[linkedHashSet.size()]);
    }

    public final boolean containsAny(String[] strArr, String[] strArr2) {
        return new ArrayList(Arrays.asList(strArr)).removeAll(Arrays.asList(strArr2));
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public Map<String, String> getExtraAttributesNamespaces() {
        return this.extraAttributesNamespaces;
    }

    public void addExtraAttributeNamespace(String str, String str2) {
        this.extraAttributesNamespaces.put(str, str2);
    }

    @Deprecated
    public void addExtraInfo(String str, String str2) {
        this.extraInfos.add(new ExtraInfoHolder(str, str2));
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    @Deprecated
    public Map<String, String> getExtraInfo() {
        HashMap map = new HashMap();
        Iterator<ExtraInfoHolder> it = this.extraInfos.iterator();
        while (it.hasNext()) {
            populateExtraInfoMap(map, it.next());
        }
        return map;
    }

    public final void populateExtraInfoMap(Map<String, String> map, ExtraInfoHolder extraInfoHolder) {
        map.put(extraInfoHolder.getName(), extraInfoHolder.getContent());
        Iterator<ExtraInfoHolder> it = extraInfoHolder.getNestedExtraInfoHolder().iterator();
        while (it.hasNext()) {
            populateExtraInfoMap(map, it.next());
        }
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public List<ExtraInfoHolder> getExtraInfos() {
        return this.extraInfos;
    }

    public void addExtraInfo(ExtraInfoHolder extraInfoHolder) {
        this.extraInfos.add(extraInfoHolder);
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public String getExtraInfoContentByTagName(String str) {
        ExtraInfoHolder extraInfoByTagName = getExtraInfoByTagName(str);
        if (extraInfoByTagName != null) {
            return extraInfoByTagName.getContent();
        }
        return null;
    }

    @Override // org.apache.ivy.core.module.descriptor.ModuleDescriptor
    public ExtraInfoHolder getExtraInfoByTagName(String str) {
        for (ExtraInfoHolder extraInfoHolder : this.extraInfos) {
            if (extraInfoHolder.getName().equals(str)) {
                return extraInfoHolder;
            }
        }
        return null;
    }
}
