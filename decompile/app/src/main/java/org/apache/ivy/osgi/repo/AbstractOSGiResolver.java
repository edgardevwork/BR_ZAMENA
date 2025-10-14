package org.apache.ivy.osgi.repo;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleInfoAdapter;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.plugins.resolver.BasicResolver;
import org.apache.ivy.plugins.resolver.util.MDResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResourceMDParser;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public abstract class AbstractOSGiResolver extends BasicResolver {
    public static final String CAPABILITY_EXTRA_ATTR = "osgi_bundle";
    public static final RepoDescriptor FAILING_REPO_DESCRIPTOR = new EditableRepoDescriptor(null, null);
    public RepoDescriptor repoDescriptor = null;
    public URLRepository repository = new URLRepository();
    public RequirementStrategy requirementStrategy = RequirementStrategy.noambiguity;

    public abstract void init();

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public boolean isAllownomd() {
        return false;
    }

    /* loaded from: classes5.dex */
    public static class RequirementStrategy {
        public static RequirementStrategy first = new RequirementStrategy();
        public static RequirementStrategy noambiguity = new RequirementStrategy();

        public static RequirementStrategy valueOf(String str) {
            if (str.equals("first")) {
                return first;
            }
            if (str.equals("noambiguity")) {
                return noambiguity;
            }
            throw new IllegalStateException();
        }
    }

    public void setRequirementStrategy(RequirementStrategy requirementStrategy) {
        this.requirementStrategy = requirementStrategy;
    }

    public void setRequirementStrategy(String str) {
        setRequirementStrategy(RequirementStrategy.valueOf(str));
    }

    public void setRepoDescriptor(RepoDescriptor repoDescriptor) {
        this.repoDescriptor = repoDescriptor;
    }

    public URLRepository getRepository() {
        return this.repository;
    }

    public void ensureInit() {
        RepoDescriptor repoDescriptor = this.repoDescriptor;
        if (repoDescriptor == null) {
            try {
                init();
                return;
            } catch (Exception e) {
                this.repoDescriptor = FAILING_REPO_DESCRIPTOR;
                throw new RuntimeException("Error while loading the OSGi repo descriptor" + e.getMessage() + " (" + e.getClass().getName() + ")", e);
            }
        }
        if (repoDescriptor != FAILING_REPO_DESCRIPTOR) {
            return;
        }
        throw new RuntimeException("The repository " + getName() + " already failed to load");
    }

    public RepoDescriptor getRepoDescriptor() {
        ensureInit();
        return this.repoDescriptor;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        ResolvedResource[] resolvedResourceArrFindCapability;
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        String organisation = dependencyRevisionId.getOrganisation();
        if (organisation == null) {
            throw new RuntimeException("Unsupported OSGi module Id: " + dependencyRevisionId.getModuleId());
        }
        String name = dependencyRevisionId.getName();
        Collection<ModuleDescriptor> collectionUnwrap = ModuleDescriptorWrapper.unwrap(getRepoDescriptor().findModules(organisation, name));
        if (collectionUnwrap == null || collectionUnwrap.isEmpty()) {
            Message.verbose("\t " + name + " not found.");
            return null;
        }
        if (BundleInfo.BUNDLE_TYPE.equals(organisation)) {
            resolvedResourceArrFindCapability = findBundle(dependencyDescriptor, resolveData, collectionUnwrap);
        } else {
            resolvedResourceArrFindCapability = findCapability(dependencyDescriptor, resolveData, collectionUnwrap);
        }
        ResolvedResource resolvedResourceFindResource = findResource(resolvedResourceArrFindCapability, getDefaultRMDParser(dependencyDescriptor.getDependencyId()), dependencyRevisionId, resolveData.getDate());
        if (resolvedResourceFindResource == null) {
            Message.debug("\t" + getName() + ": no resource found for " + dependencyRevisionId);
        }
        return resolvedResourceFindResource;
    }

    public ResolvedResource[] findBundle(DependencyDescriptor dependencyDescriptor, ResolveData resolveData, Collection<ModuleDescriptor> collection) {
        ResolvedResource[] resolvedResourceArr = new ResolvedResource[collection.size()];
        int i = 0;
        for (ModuleDescriptor moduleDescriptor : collection) {
            MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(null);
            metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
            metadataArtifactDownloadReport.setSearched(true);
            resolvedResourceArr[i] = new MDResolvedResource(null, moduleDescriptor.getRevision(), new ResolvedModuleRevision(this, this, moduleDescriptor, metadataArtifactDownloadReport));
            i++;
        }
        return resolvedResourceArr;
    }

    public ResolvedResource[] findCapability(DependencyDescriptor dependencyDescriptor, ResolveData resolveData, Collection<ModuleDescriptor> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ModuleDescriptor moduleDescriptor : collection) {
            IvyNode node = resolveData.getNode(moduleDescriptor.getModuleRevisionId());
            if (node != null && node.getDescriptor() != null) {
                return new ResolvedResource[]{buildResolvedCapabilityMd(dependencyDescriptor, node.getDescriptor())};
            }
            arrayList.add(buildResolvedCapabilityMd(dependencyDescriptor, moduleDescriptor));
        }
        return (ResolvedResource[]) arrayList.toArray(new ResolvedResource[collection.size()]);
    }

    public final MDResolvedResource buildResolvedCapabilityMd(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor) {
        String organisation = dependencyDescriptor.getDependencyRevisionId().getOrganisation();
        String name = dependencyDescriptor.getDependencyRevisionId().getName();
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(ModuleRevisionId.newInstance(organisation, name, moduleDescriptor.getExtraInfoContentByTagName(BundleInfoAdapter.EXTRA_INFO_EXPORT_PREFIX + name), (Map<String, String>) Collections.singletonMap(CAPABILITY_EXTRA_ATTR, moduleDescriptor.getModuleRevisionId().toString())), getSettings().getStatusManager().getDefaultStatus(), new Date());
        String str = BundleInfoAdapter.CONF_USE_PREFIX + dependencyDescriptor.getDependencyRevisionId().getName();
        defaultModuleDescriptor.addConfiguration(BundleInfoAdapter.CONF_DEFAULT);
        defaultModuleDescriptor.addConfiguration(BundleInfoAdapter.CONF_OPTIONAL);
        defaultModuleDescriptor.addConfiguration(BundleInfoAdapter.CONF_TRANSITIVE_OPTIONAL);
        defaultModuleDescriptor.addConfiguration(new Configuration(str));
        DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(moduleDescriptor.getModuleRevisionId(), false);
        defaultDependencyDescriptor.addDependencyConfiguration("default", "default");
        defaultDependencyDescriptor.addDependencyConfiguration("optional", "optional");
        defaultDependencyDescriptor.addDependencyConfiguration(BundleInfoAdapter.CONF_NAME_TRANSITIVE_OPTIONAL, BundleInfoAdapter.CONF_NAME_TRANSITIVE_OPTIONAL);
        defaultDependencyDescriptor.addDependencyConfiguration(str, str);
        defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
        MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(null);
        metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
        metadataArtifactDownloadReport.setSearched(true);
        return new MDResolvedResource(null, defaultModuleDescriptor.getRevision(), new ResolvedModuleRevision(this, this, defaultModuleDescriptor, metadataArtifactDownloadReport));
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findResource(ResolvedResource[] resolvedResourceArr, ResourceMDParser resourceMDParser, ModuleRevisionId moduleRevisionId, Date date) {
        ResolvedResource resolvedResourceFindResource = super.findResource(resolvedResourceArr, resourceMDParser, moduleRevisionId, date);
        if (resolvedResourceFindResource == null) {
            return null;
        }
        String organisation = moduleRevisionId.getOrganisation();
        if (!BundleInfo.BUNDLE_TYPE.equals(organisation)) {
            if (resolvedResourceArr.length != 1) {
                HashMap map = new HashMap();
                for (ResolvedResource resolvedResource : resolvedResourceArr) {
                    MDResolvedResource mDResolvedResource = (MDResolvedResource) resolvedResource;
                    String extraAttribute = mDResolvedResource.getResolvedModuleRevision().getDescriptor().getExtraAttribute(CAPABILITY_EXTRA_ATTR);
                    List arrayList = (List) map.get(extraAttribute);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(extraAttribute, arrayList);
                    }
                    arrayList.add(mDResolvedResource);
                }
                if (map.keySet().size() != 1) {
                    RequirementStrategy requirementStrategy = this.requirementStrategy;
                    if (requirementStrategy == RequirementStrategy.first) {
                        Message.warn("Ambiguity for the '" + organisation + "' requirement " + moduleRevisionId.getName() + ";version=" + moduleRevisionId.getRevision());
                        for (Map.Entry entry : map.entrySet()) {
                            Message.warn("\t" + ((String) entry.getKey()));
                            for (MDResolvedResource mDResolvedResource2 : (List) entry.getValue()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\t\t");
                                sb.append(mDResolvedResource2.getRevision());
                                sb.append(resolvedResourceFindResource == mDResolvedResource2 ? " (selected)" : "");
                                Message.warn(sb.toString());
                            }
                        }
                    } else if (requirementStrategy == RequirementStrategy.noambiguity) {
                        Message.error("Ambiguity for the '" + organisation + "' requirement " + moduleRevisionId.getName() + ";version=" + moduleRevisionId.getRevision());
                        for (Map.Entry entry2 : map.entrySet()) {
                            Message.error("\t" + ((String) entry2.getKey()));
                            for (MDResolvedResource mDResolvedResource3 : (List) entry2.getValue()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\t\t");
                                sb2.append(mDResolvedResource3.getRevision());
                                sb2.append(resolvedResourceFindResource == mDResolvedResource3 ? " (best match)" : "");
                                Message.error(sb2.toString());
                            }
                        }
                        return null;
                    }
                }
            }
            Message.info("'" + organisation + "' requirement " + moduleRevisionId.getName() + ";version=" + moduleRevisionId.getRevision() + " satisfied by " + ((MDResolvedResource) resolvedResourceFindResource).getResolvedModuleRevision().getId().getName() + PropertiesParser.PROPS_SEPARATOR + resolvedResourceFindResource.getRevision());
        }
        return resolvedResourceFindResource;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findArtifactRef(Artifact artifact, Date date) {
        URL url = artifact.getUrl();
        if (url == null) {
            return null;
        }
        Message.verbose("\tusing url for " + artifact + ": " + url);
        logArtifactAttempt(artifact, url.toExternalForm());
        return new ResolvedResource(new URLResource(url, getTimeoutConstraint()), artifact.getModuleRevisionId().getRevision());
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public void checkModuleDescriptorRevision(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId) {
        String organisation = moduleRevisionId.getOrganisation();
        if (organisation == null || organisation.equals(BundleInfo.BUNDLE_TYPE)) {
            super.checkModuleDescriptorRevision(moduleDescriptor, moduleRevisionId);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Collection<String> filterNames(Collection<String> collection) {
        getSettings().filterIgnore(collection);
        return collection;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Collection<String> findNames(Map<String, String> map, String str) {
        if (IvyPatternHelper.ORGANISATION_KEY.equals(str)) {
            return getRepoDescriptor().getCapabilities();
        }
        String str2 = map.get(IvyPatternHelper.ORGANISATION_KEY);
        if (StringUtils.isNullOrEmpty(str2)) {
            return Collections.emptyList();
        }
        if ("module".equals(str)) {
            return getRepoDescriptor().getCapabilityValues(str2);
        }
        if (IvyPatternHelper.REVISION_KEY.equals(str)) {
            String str3 = map.get("module");
            ArrayList arrayList = new ArrayList();
            Set<ModuleDescriptorWrapper> setFindModules = getRepoDescriptor().findModules(str2, str3);
            if (setFindModules != null) {
                Iterator<ModuleDescriptorWrapper> it = setFindModules.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getBundleInfo().getVersion().toString());
                }
            }
            return arrayList;
        }
        if (IvyPatternHelper.CONF_KEY.equals(str)) {
            String str4 = map.get("module");
            if (str4 == null) {
                return Collections.emptyList();
            }
            if (str2.equals(BundleInfo.PACKAGE_TYPE)) {
                return Collections.singletonList(BundleInfoAdapter.CONF_USE_PREFIX + str4);
            }
            Collection<ModuleDescriptor> collectionUnwrap = ModuleDescriptorWrapper.unwrap(getRepoDescriptor().findModules(str2, str4));
            if (collectionUnwrap == null) {
                return Collections.emptyList();
            }
            String str5 = map.get(IvyPatternHelper.REVISION_KEY);
            if (str5 == null) {
                return Collections.emptyList();
            }
            ModuleDescriptor moduleDescriptor = null;
            for (ModuleDescriptor moduleDescriptor2 : collectionUnwrap) {
                if (moduleDescriptor2.getRevision().equals(str5)) {
                    moduleDescriptor = moduleDescriptor2;
                }
            }
            if (moduleDescriptor == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(moduleDescriptor.getConfigurationsNames());
        }
        return Collections.emptyList();
    }

    public final void filterCapabilityValues(Set<String> set, Map<String, Set<ModuleDescriptor>> map, Map<String, String> map2, String str) {
        if (str == null) {
            set.addAll(map.keySet());
            return;
        }
        for (Map.Entry<String, Set<ModuleDescriptor>> entry : map.entrySet()) {
            Iterator<ModuleDescriptor> it = entry.getValue().iterator();
            boolean zEquals = false;
            while (it.hasNext() && !(zEquals = str.equals(it.next().getRevision()))) {
            }
            if (zEquals) {
                set.add(entry.getKey());
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public Map<String, String>[] listTokenValues(String[] strArr, Map<String, Object> map) {
        Set<Map<String, String>> setListTokenValues = listTokenValues(new HashSet(Arrays.asList(strArr)), map);
        return (Map[]) setListTokenValues.toArray(new Map[setListTokenValues.size()]);
    }

    public final Set<Map<String, String>> listTokenValues(Set<String> set, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (!(value instanceof String)) {
                return Collections.emptySet();
            }
            map2.put(entry.getKey(), (String) value);
        }
        if (set.isEmpty()) {
            return Collections.singleton(map2);
        }
        HashSet hashSet = new HashSet(set);
        hashSet.remove(IvyPatternHelper.ORGANISATION_KEY);
        String str = (String) map2.get(IvyPatternHelper.ORGANISATION_KEY);
        if (str == null) {
            HashMap map3 = new HashMap(map);
            map3.put(IvyPatternHelper.ORGANISATION_KEY, BundleInfo.BUNDLE_TYPE);
            HashSet hashSet2 = new HashSet(listTokenValues(hashSet, map3));
            HashMap map4 = new HashMap(map);
            map4.put(IvyPatternHelper.ORGANISATION_KEY, BundleInfo.PACKAGE_TYPE);
            hashSet2.addAll(listTokenValues(hashSet, map4));
            HashMap map5 = new HashMap(map);
            map5.put(IvyPatternHelper.ORGANISATION_KEY, "service");
            hashSet2.addAll(listTokenValues(hashSet, map5));
            return hashSet2;
        }
        HashMap map6 = new HashMap();
        map6.put(IvyPatternHelper.ORGANISATION_KEY, str);
        Set<String> capabilityValues = getRepoDescriptor().getCapabilityValues(str);
        if (capabilityValues == null || capabilityValues.isEmpty()) {
            return Collections.emptySet();
        }
        hashSet.remove("module");
        String str2 = (String) map2.get("module");
        if (str2 == null) {
            HashSet hashSet3 = new HashSet();
            for (String str3 : capabilityValues) {
                HashMap map7 = new HashMap(map);
                map7.put("module", str3);
                hashSet3.addAll(listTokenValues(hashSet, map7));
            }
            return hashSet3;
        }
        map6.put("module", str2);
        hashSet.remove(IvyPatternHelper.REVISION_KEY);
        String str4 = (String) map2.get(IvyPatternHelper.REVISION_KEY);
        if (str4 == null) {
            Set<ModuleDescriptorWrapper> setFindModules = getRepoDescriptor().findModules(str, str2);
            if (setFindModules == null || setFindModules.isEmpty()) {
                return Collections.emptySet();
            }
            HashSet hashSet4 = new HashSet();
            for (ModuleDescriptorWrapper moduleDescriptorWrapper : setFindModules) {
                HashMap map8 = new HashMap(map);
                map8.put(IvyPatternHelper.REVISION_KEY, moduleDescriptorWrapper.getBundleInfo().getVersion().toString());
                hashSet4.addAll(listTokenValues(hashSet, map8));
            }
            return hashSet4;
        }
        map6.put(IvyPatternHelper.REVISION_KEY, str4);
        hashSet.remove(IvyPatternHelper.CONF_KEY);
        String str5 = (String) map2.get(IvyPatternHelper.CONF_KEY);
        if (str5 == null) {
            if (str.equals(BundleInfo.PACKAGE_TYPE)) {
                map6.put(IvyPatternHelper.CONF_KEY, BundleInfoAdapter.CONF_USE_PREFIX + str2);
                return Collections.singleton(map6);
            }
            Set<ModuleDescriptorWrapper> setFindModules2 = getRepoDescriptor().findModules(str, str2);
            if (setFindModules2 == null) {
                return Collections.emptySet();
            }
            Version version = new Version(str4);
            ModuleDescriptorWrapper moduleDescriptorWrapper2 = null;
            for (ModuleDescriptorWrapper moduleDescriptorWrapper3 : setFindModules2) {
                if (moduleDescriptorWrapper3.getBundleInfo().getVersion().equals(version)) {
                    moduleDescriptorWrapper2 = moduleDescriptorWrapper3;
                }
            }
            if (moduleDescriptorWrapper2 == null) {
                return Collections.emptySet();
            }
            HashSet hashSet5 = new HashSet();
            for (String str6 : BundleInfoAdapter.getConfigurations(moduleDescriptorWrapper2.getBundleInfo())) {
                HashMap map9 = new HashMap(map2);
                map9.put(IvyPatternHelper.CONF_KEY, str6);
                hashSet5.add(map9);
            }
            return hashSet5;
        }
        map6.put(IvyPatternHelper.CONF_KEY, str5);
        return Collections.singleton(map6);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public long get(Resource resource, File file) throws IOException {
        Message.verbose("\t" + getName() + ": downloading " + resource.getName());
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tto ");
        sb.append(file);
        Message.debug(sb.toString());
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        getRepository().get(resource.getName(), file);
        return file.length();
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Resource getResource(String str) throws IOException {
        return getRepository().getResource(str);
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        throw new UnsupportedOperationException();
    }
}
